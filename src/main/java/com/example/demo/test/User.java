package com.example.demo.test;

/**
 * 构造者模式（基础）
 */
public class User {
  private String name;
  private String gender;
  private int age;
  private int height;

    private User(String name, String gender, int age, int height) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
    }

    public static UserBuilder builder(){
        return new UserBuilder();
    }

    public static class  UserBuilder{
        private String name;
        private String gender;
        private int age;
        private int height;

        public UserBuilder() {}

        public UserBuilder name(String name){
            this.name = name;
            return this;
        }

        public UserBuilder gender(String gender){
            this.gender = gender;
            return this;
        }

        public UserBuilder age(Integer age){
            this.age = age;
            return this;
        }

        public UserBuilder height(Integer height){
            this.height = height;
            return this;
        }

        public User build(){
            return new User(name,gender,age,height);
        }
    }
}
