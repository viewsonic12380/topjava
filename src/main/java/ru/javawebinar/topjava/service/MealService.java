package ru.javawebinar.topjava.service;

import org.springframework.lang.Nullable;
import ru.javawebinar.topjava.model.Meal;

import java.time.LocalDate;
import java.util.List;

public interface MealService {

//    public class MealService {
//    private MealRepository repository;

    Meal get(int id, int userId);

    void delete(int id, int userId);

    List<Meal> getBetweenDates(@Nullable LocalDate startDate, @Nullable LocalDate endDate, int userId);

    List<Meal> getAll(int userId);

    void update(Meal meal, int userId);

    Meal create(Meal meal, int userId);

}