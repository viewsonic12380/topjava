package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.User;

import java.util.Comparator;

public class NameComparator implements Comparator<User> {
    public int compare(User s1, User s2) {
        return s1.getName().compareTo(s2.getName());
    }
}