package Day01.com.personalized_meal_plan_generator_04;

//HighProteinMeal class
class HighProteinMeal implements MealPlan {
    //overriding the super class method.
    @Override
    public String getMealType() {
        return "High-Protein Meal";
    }
}
