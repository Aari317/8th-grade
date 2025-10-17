import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class StudentScoreTracker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        int score, menu;

        Map<String, Integer> scoreslist = new HashMap<>();

        String person = "teacher";

        if (person.equalsIgnoreCase("Teacher")) {
            System.out.println("Menu:");
            System.out.println("1. ✨ Add Score ✨");
            System.out.println("2. ✨ Display scores ✨");
            System.out.println("3. 🔎 Search for score 🔎");
            System.out.println("4. Change viewer");
            System.out.println("5. ✨ Exit ✨");

            while (true) {
                System.out.print("Enter your pick: ");
                menu = in.nextInt();
                in.nextLine();

                if (menu == 1) {
                    while (true) {
                        System.out.print("Enter your name (write done to stop): ");
                        name = in.nextLine();

                        if (name.equalsIgnoreCase("Done") || name.equalsIgnoreCase("Quit")) {
                            break;
                        }
                        System.out.print("Enter your score: ");
                        score = in.nextInt();
                        in.nextLine();
                        scoreslist.put(name, score);
                    }
                } else if (menu == 2) {
                    System.out.println(scoreslist);
                } else if (menu == 3) {
                    System.out.print("Enter the name of the person you want to search for: ");
                    String search = in.nextLine();

                    int value = scoreslist.get(search);
                    System.out.println(search + " has a score of " + value);
                } else if (menu == 4) {
                    person = "Student";
                    break;
                } else if (menu == 5) {
                    System.exit(0);
                } else {
                    scoreslist.forEach((key, value) -> System.out.println(key + "'s score is " + value));
                    break;
                }
            }
        }
        if (person.equalsIgnoreCase("Student")) {
            System.out.println("Are you ready to search for your score? (y/n) ");
            String choice = in.nextLine();

            while (true) {
                if (choice.equalsIgnoreCase("y")) {
                System.out.print("Enter the name you want to search for (enter done to exit): ");
                String search = in.nextLine();

                if (search.equalsIgnoreCase("Done"))
                System.exit(0);
                else {
                    int value = scoreslist.get(search);
                    System.out.println(search + " has a score of " + value);

                    if (value == 100){
                        System.out.println("WOWOWOOWW U R GREAT");
                    } else if (value >= 90) {
                    System.out.println("Good Job - ish. u can do better.");
                } else if (value >= 80) {
                    System.out.println("ur score is ok. u need to study next time");
                } else if (value >= 70) {
                    System.out.println("uhhh.. try harder next time");
                } else if (value >= 60) {
                    System.out.println("wow. u almost failed. well u failed in indian standards");
                } else
                System.out.println("goddam u mangaged to achieve the impossible. good luck");
                }
            } else
                System.exit(0);
        }}
        in.close();
    }
}