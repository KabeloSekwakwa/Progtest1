/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consolesalesreport;

/**
 *
 * @author kabel
 */
public class ConsoleSalesReport {

    public static void main(String[] args) {
        // Array for City Names (Single-dimensional array)
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};

        //Array (Two-dimensional array)
        int[][] sales = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200}  // Pretoria
        };

        // Top section
        System.out.println("--------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("------------------------------------------------");
        System.out.printf("%-18s %-10s %-10s %-10s%n", "", "PS5", "XBOX", "SWITCH");

        // Display sales per city
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s %-10d %-10d %-10d%n", 
                cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }
        
        System.out.println(" ");
        System.out.println("-------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-----------------------------------------------");

        int maxSales = -1;
        String topCity = "";

        // Calculate and print sales totals for each city
        for (int i = 0; i < cities.length; i++) {
            int cityTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                cityTotal += sales[i][j];
            }

            System.out.printf("%-18s %-10d%n", cities[i], cityTotal);

            // city with highest sales
            if (cityTotal > maxSales) {
                maxSales = cityTotal;
                topCity = cities[i];
            }
        }

        System.out.println(" ");
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("--------------------------------------------------");
    }
}
