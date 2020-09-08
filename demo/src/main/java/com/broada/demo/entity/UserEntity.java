package com.broada.demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author tsj
 * @Date 2020/9/4 11:29
 */
public class UserEntity implements Serializable {
    private long id;
    private String guid;
    private String name;
    private String age;
    private Date createTime;

    public UserEntity(long id) {
        this.id = id;
        this.guid = "guid" + id;
        this.name = "二虎erhu" + id;
        this.age = "22";
        this.createTime = new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", guid='" + guid + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
