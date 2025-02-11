package Day01.com.personalized_meal_plan_generator_04;

//Generic Meal Class
class Meal<T extends MealPlan> {
    private T mealPlan;

    //constructor to set the meal plan
    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    //method to get the meal plan
    public T getMealPlan() {
        return mealPlan;
    }

    //method to display the detail of the meal.
    public void displayMealDetails() {
        System.out.println("Meal Plan: " + mealPlan.getMealType());
    }
}
