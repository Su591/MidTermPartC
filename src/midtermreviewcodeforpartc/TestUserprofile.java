/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to User Profile Creation");
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        System.out.println("Please choose your favorite genre:");
        System.out.println("1. Action");
        System.out.println("2. Adventure");
        System.out.println("3. Comedy");
        System.out.println("4. Drama");
        System.out.println("5. Sci-Fi");
        int choice = scanner.nextInt();
        String genre = "";

        switch (choice) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Adventure";
                break;
            case 3:
                genre = "Comedy";
                break;
            case 4:
                genre = "Drama";
                break;
            case 5:
                genre = "Sci-Fi";
                break;
            default:
                System.out.println("Invalid choice. Genre set to 'Unknown'.");
                genre = "Unknown";
                break;
        }

        System.out.println("User Profile Created!");
        System.out.println("Name: " + name);
        System.out.println("Favorite Genre: " + genre);
    }
}
    
