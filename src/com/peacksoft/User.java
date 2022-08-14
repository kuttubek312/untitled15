package com.peacksoft;

import java.util.Comparator;

public class User implements Comparable<User>{

    private String name;
    private int age;
    private int id;


    @Override
    public int compareTo(User o) {
        return 0;
    }

    public User(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }


    public  static Comparator<User> nameComparator = new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };


    public static Comparator<User> ageComparator = new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            return o1.getAge() - o2.getAge();
        }
    };

    public static Comparator<User> idComparator = new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            return o1.getId() - o2.getId();
        }
    };

}
