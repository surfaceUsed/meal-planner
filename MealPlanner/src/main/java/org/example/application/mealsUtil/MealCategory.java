package org.example.application.mealsUtil;

enum MealCategory {

    BREAKFAST("breakfast"),
    LUNCH("lunch"),
    DINNER("dinner"),
    INVALID_MEAL("invalid meal");

    private final String mealCategory;

    MealCategory(String mealCategory) {
        this.mealCategory = mealCategory;
    }

    String getMealCategory() {
        return this.mealCategory;
    }

    static MealCategory getMealCategory(String meal) {
        for (MealCategory category : MealCategory.values()) {
            if (category.getMealCategory().equals(meal)) {
                return category;
            }
        }
        return INVALID_MEAL;
    }
}