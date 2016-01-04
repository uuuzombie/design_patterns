package com.sky.demo.builder_pattern;

import com.google.common.base.Objects;

/**
 * Created by rg on 2014/7/1.
 */
public class User {

    private Integer id;
    private String userName;
    private String password;

    private Integer age;
    private String address;

    public static class Builder {

        private Integer id;
        private String userName;
        private String password;

        private Integer age = 0;
        private String address = "AAA";

        public Builder(Integer id, String userName, String password) {
            this.id = id;
            this.userName = userName;
            this.password = password;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User builder() {
            return new User(this);
        }

    }

    private User(Builder builder) {
        this.id = builder.id;
        this.userName = builder.userName;
        this.password = builder.password;
        this.age = builder.age;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("id", id)
                .add("userName", userName)
                .add("password", password)
                .add("age", age)
                .add("address", address)
                .toString();
    }
}
