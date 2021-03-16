package com.julio.lab.app;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws IOException, CsvException {
        String fileName = "src/main/resources/restaurants.csv";
        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            List<String[]> r = reader.readAll();
            r.forEach(x -> System.out.println(Arrays.toString(x)));
        }

        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Restaurant finder app!\n\n"
                + "You will be asked to inform your search conditions for:\n"
                + "1. Restaurant Name.\n"
                + "2. Customer Rating (1 to 5 stars).\n"
                + "3. Distance (1 to 10 miles).\n"
                + "4. Price ($10 to $50).\n"
                + "5. Cuisine (Chinese, American, Thai, etc...)\n\n"
                + "Please provide your input for each field or hit enter if don't want to specify a given filter.\n");

        System.out.println("1. Restaurant name:\n");
        String restaurant = s.next();
        System.out.println(restaurant + "\n");

        System.out.println("2. Customer Rating [1 to 5] (only numbers):\n");
        String rating = s.next();
        System.out.println(rating + "\n");

        System.out.println("3. Distance [1 to 10] (only numbers):\n");
        String distance = s.next();
        System.out.println(distance + "\n");

        System.out.println("4. Price [10 to 50] (only numbers):\n");
        String price = s.next();
        System.out.println(price + "\n");

        System.out.println("5. Cuisine (Chinese, American, Thai, etc...):\n");
        String cuisine = s.next();
        System.out.println(cuisine + "\n");

    }

}
