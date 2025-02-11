package Day01.com.personalized_meal_plan_generator_04;

//VeganMeal class
class VeganMeal implements MealPlan {
    //overriding the super class method.
    @Override
    public String getMealType() {
        return "Vegan Meal";
    }
}
