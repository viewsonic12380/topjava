package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.Meal;

import java.sql.Connection;

public class MealsDAO {
    private Connection connection;

    public MealsDAO() {
        connection = DBUtil.getConnection();
    }

    public void addMeal(Meal meal) {

    }

    public void deleteMeal(int mealId) {

    }

    public void updateMeal(Meal meal) {

    }
}
