package org.example.datasource.dao;

import org.example.application.entity.Meal;
import org.example.application.entity.MealDayPlan;

import java.util.List;

public interface MealDAO {

    void insertMeal(Meal meal);

    void createPlan(List<MealDayPlan> mealPlan);

    List<Meal> listMealPlan();

    List<Meal> listAllMeals();

    List<Meal> listMealByCategory(String category);
}