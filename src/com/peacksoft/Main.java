package com.peacksoft;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * User деген класс тузунуз, id,name,age.
         * Объектилерин тузунуз.
         * Листке салыныз.
         * Айдишкасы менен,жашы менен жана аты менен
         * сортировка кыла турган методдорду тузунуз жана ал
         * методдорду чакырып листи салганда сортировка кылып
         * юсерлерди чыгарып берсин
         */


        User user = new User("Kut",20,312);
        User user2 = new User("Nur",23,313);


        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        System.out.println(users);



        users.sort(User.nameComparator.
                thenComparing(User.ageComparator.
                        thenComparing(User.idComparator)));

        for (User user1: users) {
            System.out.println(user1);
        }



    }
}