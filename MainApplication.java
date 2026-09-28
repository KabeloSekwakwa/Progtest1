/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consolesaleapp;

/**
 *
 * @author kabel
 */
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu selection
        System.out.println("Select the console type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Map menu choice to console string
        String consoleType = "";
        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "SWITCH";
                break;
            default:
                consoleType = "Unknown";
                break;
        }

        // Store Name input
        System.out.print("Enter the store: ");
        String store = scanner.nextLine();

        // Total Sales input
        System.out.print("Enter the total sales of " + consoleType + " consoles for " + store + ": ");
        int totalSales = scanner.nextInt();

        System.out.println(); // Blank line before report

        // Instantiate and display report
        ConsoleSales sales = new ConsoleSales(consoleType, store, totalSales);
        sales.printReport();

        scanner.close();
    }
}