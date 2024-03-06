import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FindADog {
    private static final String FILENAME = "allDogs.txt";

    // Method to load dog data from file into an AllDogs object
    public static AllDogs loadDogsFromFile(String filename) {
        AllDogs allDogs = new AllDogs();
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String[] fields = scanner.nextLine().split(",");
                String name = fields[0].trim();
                long microchipNumber = Long.parseLong(fields[1].trim());
                String sex = fields[2].trim();
                String isDesexed = fields[3].trim();
                int age = Integer.parseInt(fields[4].trim());
                String breed = fields[5].trim();
                Dog dog = new Dog(name, breed, age, sex, microchipNumber, isDesexed);
                allDogs.addDog(dog);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error loading dogs from file: " + e.getMessage());
        }
        return allDogs;
    }
    public static Dog getDreamDog() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your dream dog's details:");
        System.out.print("Breed: ");
        String breed = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Sex: ");
        String sex = scanner.nextLine();
        System.out.print("Desexed status: ");
        String isDesexed = scanner.nextLine();
    
        // Create and return the dream dog
        return new Dog("", breed, age, sex, 0, isDesexed);
    }
    // Method to get the user to enter their contact details, returning a Person object
    public static Person enterContactDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your phone number:");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter your email address:");
        String emailAddress = scanner.nextLine();
        return new Person(name, phoneNumber, emailAddress);
    }

    // Method to write the adoption request info to a file
    public static void writeAdoptionRequestToFile(String filename, Person person, Dog dog) {
        try {
            FileWriter writer = new FileWriter(filename, true);
            writer.write("Name: " + person.getName() + "\n");
            writer.write("Phone Number: " + person.getPhoneNumber() + "\n");
            writer.write("Email Address: " + person.getEmailAddress() + "\n");
            writer.write("Adopted Dog Info:\n" + dog.toString() + "\n");
            writer.close();
            System.out.println("Adoption request info written to file: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error writing adoption request info to file: " + e.getMessage());
        }
    }

    // Main method to enable the user to place an adoption request
    public static void main(String[] args) {
        AllDogs allDogs = loadDogsFromFile(FILENAME);
        Dog dreamDog = getDreamDog(); // Implement getDreamDog method
        Person person = enterContactDetails();
        
        // Change this line in FindADog class
        Dog matchingDog = allDogs.searchDog(dreamDog);

        if (matchingDog != null) {
            System.out.println("Matching dog found:\n" + matchingDog);
            System.out.println("Do you want to adopt this dog? (yes/no)");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine().toLowerCase();
            if (response.equals("yes")) {
                writeAdoptionRequestToFile(person.getName() + "_" + person.getLastName() + "_adoption_request.txt", person, matchingDog);
            } else {
                System.out.println("Adoption declined. Thank you for using our service.");
            }
        } else {
            System.out.println("No matching dog found. Thank you for using our service.");
        }
    }
}
