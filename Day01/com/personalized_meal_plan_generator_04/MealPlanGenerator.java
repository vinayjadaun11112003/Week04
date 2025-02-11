package Day01.com.personalized_meal_plan_generator_04;
import java.util.*;
//Meal Plan Generator
class MealPlanGenerator {
    private List<Meal<? extends MealPlan>> mealPlans = new ArrayList<>();

    //method to add meal in the mealplan list.
    public void addMeal(Meal<? extends MealPlan> meal) {
        mealPlans.add(meal);
    }

    //method to show all meals of the list.
    public void showAllMeals() {
        for (Meal<? extends MealPlan> meal : mealPlans) {
            meal.displayMealDetails();
        }
    }
}
