package AdvanceJava;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Demo4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input from user
            System.out.print("Enter your birthdate (yyyy-mm-dd): ");
            String input = scanner.nextLine();

            // Parse birthdate and get current date
            LocalDate birthDate = LocalDate.parse(input);
            LocalDate currentDate = LocalDate.now();

            // Calculate the period between dates
            Period age = Period.between(birthDate, currentDate);

            // Output the result
            System.out.printf("Your age is: %d years, %d months, and %d days.%n",
                    age.getYears(), age.getMonths(), age.getDays());
        }
}
