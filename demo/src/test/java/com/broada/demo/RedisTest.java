package com.broada.demo;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @Author tsj
 * @Date 2020/9/4 10:57
 */
public class RedisTest {

    public String[] aoligei(String ... key){
        System.out.println(key.getClass() + "    " + key.length);

        return key;
    }

    @Test
    public void test01(){
        String[] aoligei = aoligei("haha", "erhu");
        Stream.of(Arrays.asList(aoligei)).forEach(System.out::print);
    }

    @Test
    public void testRedisNormal(){

    }
}
