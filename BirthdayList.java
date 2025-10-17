import java.util.*;

public class BirthdayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, String> bdList = new HashMap<>();

        while (true) {
            System.out.print("Enter your name: ");
            String name = in.nextLine();

            System.out.print("Enter the month you are born in: ");
            String month = in.nextLine();

            int day;
            while (true) {
                System.out.print("Enter the day of your birthday: ");
                day = in.nextInt();
                in.nextLine(); // clear buffer

                if (day >= 1 && day <= 31) break;
                System.out.println("That is not a possible day. Please try again.");
            }

            bdList.put(name, month + " " + day);

            // Ask if user wants to add another
            String yn;
            while (true) {
                System.out.print("Do you want to enter another birthday? (y/n): ");
                yn = in.nextLine();

                if (yn.equalsIgnoreCase("y") || yn.equalsIgnoreCase("n")) break;
                System.out.println("That is not one of the options. Please try again.");
            }

            if (yn.equalsIgnoreCase("n")) {
                // Loop for searching until user says no
                while (true) {
                    String search;
                    while (true) {
                        System.out.print("Would you like to search for birthdays by month? (y/n): ");
                        search = in.nextLine();

                        if (search.equalsIgnoreCase("y") || search.equalsIgnoreCase("n")) break;
                        System.out.println("That is not one of the options. Please try again.");
                    }

                    if (search.equalsIgnoreCase("y")) {
                        System.out.print("Enter the month to search for: ");
                        String monthSearch = in.nextLine().toLowerCase();

                        System.out.println("\nPeople with birthdays in " + monthSearch + ":");
                        boolean found = false;

                        for (Map.Entry<String, String> entry : bdList.entrySet()) {
                            // Split birthday into month and day
                            String birthday = entry.getValue();
                            String birthdayMonth = birthday.split(" ")[0].toLowerCase();

                            // Check if the months match (ignoring case)
                            if (birthdayMonth.equals(monthSearch)) {
                                System.out.println(entry.getKey() + " → " + entry.getValue());
                                found = true;
                            }
                        }

                        if (!found) System.out.println("No birthdays found for that month.");
                        System.out.println(); // spacing
                    } else {
                        System.out.println("Ok bye bye.");
                        in.close();
                        return;
                    }
                }
            }
        }
    }
}
