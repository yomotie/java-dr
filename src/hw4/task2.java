package hw4;

public class task2 {
    public static void main(String[] args) {

        int dogs = 24;
        int cats = 8;
        int eachDailyConsume = 50;
        int singlePortionCost = 2;
        int numOfMealsPerDay = 3;
        int daysInMonth = 30;
       int dogFoodPerMonth = amountOfFoodPerMonth(numOfMealsPerDay, eachDailyConsume, dogs, daysInMonth);
       int catFoodPerMonth = amountOfFoodPerMonth(numOfMealsPerDay, eachDailyConsume, cats, daysInMonth);
        System.out.println("Doggi needs this amount of food per month: " + dogFoodPerMonth + " grams.");
        System.out.println("Cats needs this amount of food per month: " + catFoodPerMonth + " grams.");
        System.out.println("To continue looking after animals shelter needs: " + moneyToKeepTheShelter(dogFoodPerMonth, catFoodPerMonth, singlePortionCost) + "$.");


    }

        public static int amountOfFoodPerMonth(int numOfMealsPerDay, int eachDailyConsume, int numOfAnimals, int daysInMonth) {
            return eachDailyConsume * numOfAnimals * numOfMealsPerDay * daysInMonth;
        }

        public static int moneyToKeepTheShelter(int dogFoodPerMonth, int catFoodPerMonth, int singlePortionCost) {
            int total = dogFoodPerMonth + catFoodPerMonth;
            return total * singlePortionCost;
        }
    }
