//09.18.25
import java.util.Scanner;
public class Madlib {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
        String noun, verb, color;

        System.out.println("Enter a noun:");
        noun = in.nextLine();

        System.out.println("Enter a verb:");
        verb = in.nextLine();

        System.out.println("Enter a color:");
        color = in.nextLine();

        System.out.println("The " + noun + " " + verb + " through the " + color + " flower field.");

        in.close();
    }
}