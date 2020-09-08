package com.broada.demo.controller;

import com.broada.demo.entity.UserEntity;
import com.broada.demo.util.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author tsj
 * @Date 2020/9/4 11:33
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    private static final Logger logger = LoggerFactory.getLogger(RedisController.class);
    //redis中存储的过期时间设置为60s
    private static final int EXPIRE_TIME = 60;
    @Autowired
    private RedisUtil redisUtil;

    @PostMapping("/setUserEntity")
    public boolean redisSet(@RequestParam String id){
        UserEntity ue = new UserEntity(Long.parseLong(id));

        //return redisUtil.set(key,userEntity,EXPIRE_TIME);
        logger.info("key:{},value:{}",ue.getName(),ue);
        return redisUtil.set(ue.getName(), ue);
    }
    @PostMapping("/set")
    public boolean redisSet(String key,String value,long time){
        if(time != 0){
            redisUtil.set(key,value,time);
            logger.info("设置的key为{},value为{},过期时间为{}",key,value,time);
        }
        logger.info("key:{},value:{}",key,value);
        return redisUtil.set(key,value);
    }

    @GetMapping("/get")
    public Object redisGet(String key){
        return redisUtil.get(key);
    }

    @GetMapping("/expire")
    public boolean expire(String key, long time){
        if(time!=0) {
            return redisUtil.expire(key, time);
        }
        return redisUtil.expire(key,EXPIRE_TIME);
    }

    @GetMapping("/testAPI")
    public String testAPI(String key){
        boolean hasKey = redisUtil.hasKey(key);
        long expire = redisUtil.getExpire(key);
        return hasKey + "," + "失效时间："+expire;
    }

    @GetMapping("/deleteByKey")
    public Object deleteByKey(String ... key){
        return redisUtil.del(key);
    }

}
