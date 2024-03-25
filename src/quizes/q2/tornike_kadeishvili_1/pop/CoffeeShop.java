package quizes.q2.tornike_kadeishvili_1.pop;

public class CoffeeShop {

    public static void main(String[] args) {
        int pricePerCoffee = 250; // tetri
        int numCoffeeSold = 100;
        int totalCostOfBeans = 15000; // tetri
        int otherExpenses = 7000 + 80 + 410 + 17100 + 2800;
        int totalExpenses = totalCostOfBeans + otherExpenses;

        // TODO 1
        // include all the expences that are provided in the expences.txt file

        double profit = calculateProfit(pricePerCoffee, numCoffeeSold, totalExpenses); //replaced totalCostOfBeans and otherExpenses with totalExpenses
    }


    public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, int totalExpenses) {

        // TODO 2
        // Finish this functio
        double profit = ((numCoffeeSold * pricePerCoffee) - totalExpenses);
        double profitInLaris = profit/100;

        return profitInLaris;
    }
}
