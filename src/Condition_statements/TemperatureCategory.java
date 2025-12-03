package Condition_statements;
import java.util.Scanner;

public class TemperatureCategory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        int temp = scanner.nextInt();

        if (temp < 0) {
            System.out.println("Cold");
        } 
        else if (temp >= 0 && temp <= 20) {
            System.out.println("Warm");
        } 
        else {
            System.out.println("Hot");
        }

        scanner.close();
    }
}

