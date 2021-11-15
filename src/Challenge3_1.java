import java.util.Scanner;
import java.util.Random;

public class Challenge3_1 {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        String generatedUserName;

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name:");
        firstName = scan.next();
        System.out.println("Enter last name");
        lastName = scan.next();

        while(lastName.length() < 5){
            System.out.println("Lastname must be at least 5 characters");
            lastName = scan.next();
        }

        generatedUserName = firstName.substring(0,1) + lastName.substring( 0, 5) + (rand.nextInt(90) + 10 );
        System.out.println(generatedUserName);

    }
}
