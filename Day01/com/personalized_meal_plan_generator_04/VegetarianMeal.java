package Day01.com.personalized_meal_plan_generator_04;

//VegetarianMeal Meal Plans
class VegetarianMeal implements MealPlan {
    //overriding the super class method.
    @Override
    public String getMealType() {
        return "Vegetarian Meal";
    }
}