package com.example.demo.model;

import javax.persistence.*;

@Table(name = "t_name")
public class TName {
    /**
     * 名字
     */
    private String username;

    /**
     * 获取名字
     *
     * @return username - 名字
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置名字
     *
     * @param username 名字
     */
    public void setUsername(String username) {
        this.username = username;
    }
}