//Purpose: ask the user for the things they want to buy and prints out the correct statment for the amount of the money the user has
import java.util.Scanner;

public class vendingmachine{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int chips, soda, candy;
        double userMoney,  totalPrice;

        //print out the menu
        System.out.println("Menu");
        System.out.println("Chips = $2.50");
        System.out.println("Soda = $4.50");
        System.out.println("Candy = $3.50 \n");

        //ask the user for how much of each item they want
        System.out.print(" How many chips do you want to buy? ");
        chips = in.nextInt();

        System.out.print(" How many sodas do you want to buy? ");
        soda = in.nextInt();

        System.out.print(" How much candy do you want to buy? ");
        candy = in.nextInt();

        System.out.print(" ");

        //calculate the total cost and save it in totalPrice
        totalPrice = (candy * 3.5) + (soda * 4.5) + (chips * 2.5);

        //prints out the total cost
        System.out.printf("The total cost for all your items are: $%.2f. %n", totalPrice);

        //asks the user how much money they have
        System.out.print(" How much money do you have? $");
        userMoney = in.nextDouble();

        System.out.print(" ");

        //if statement to print out the correct statement based on the amount of money the user has
        if (userMoney < totalPrice){
        totalPrice -= userMoney;
        System.out.printf("You don't have enough money. You need $%.2f more.", totalPrice);
        }else if (userMoney > totalPrice) {
        userMoney -= totalPrice;
        System.out.printf("Your change is $%.2f.", userMoney);
        }else{
            System.out.println("Thank you for your purchase! You have paid the exact amount and will recieve no change.");
        }

        in.close();
    }
}