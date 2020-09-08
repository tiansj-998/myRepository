package com.broada.demo;

import com.broada.demo.util.RedisUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;

@SpringBootTest
@RunWith(SpringRunner.class)
class DemoApplicationTests {
    @Resource
    private DataSource dataSource;
    @Autowired
    RedisUtil redisUtil;

    public DemoApplicationTests() {
        // 设置环境变量，解决Es的netty与Netty服务本身不兼容问题
        System.setProperty("es.set.netty.runtime.available.processors","false");
    }

    @BeforeEach
    void solveConflict(){
        System.out.println("reach method has @BeforeEach");
    }
    @Test
    void contextLoads() {
        System.out.println("数据源类型："+dataSource.getClass());
        System.out.println(System.getProperty("es.set.netty.runtime.available.processors"));
    }

    @Test
    void del(){
        redisUtil.del("erhu2","erhu0908-01");
    }
}
