package Day01.com.personalized_meal_plan_generator_04;


//PersonalisedMealPlan class --> Class to control the execution of code.
public class PersonalisedMealPlan {
    //Main method to control the flow of code.
    public static void main(String[] args) {

        //Creating meal object of different type.
        Meal<VegetarianMeal> vegetarianMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        Meal<HighProteinMeal> highProteinMeal = new Meal<>(new HighProteinMeal());

        //Creating mealPlanGenerator object and adding data into it
        MealPlanGenerator mealPlanGenerator = new MealPlanGenerator();
        mealPlanGenerator.addMeal(vegetarianMeal);
        mealPlanGenerator.addMeal(veganMeal);
        mealPlanGenerator.addMeal(highProteinMeal);

        //Printing the data of the meals in the mealplangenerator
        System.out.println("Personalized Meal Plans:");
        mealPlanGenerator.showAllMeals();
    }
}