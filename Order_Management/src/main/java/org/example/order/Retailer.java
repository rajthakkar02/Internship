package org.example.order;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Retailer {
    public static void retailer() throws IOException {
        File myfile = new File("src/assets/RetailerOrder.txt");

        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("File not created");
            throw new RuntimeException(e);
        }


        FileWriter fileWriter = new FileWriter("src/assets/RetailerOrder.txt");

        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> map1 = new HashMap<>();


        while (true){
            System.out.println("Add New items in inventory (yes/no) :");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();


            if (str.equalsIgnoreCase("yes")){

                System.out.println("Items Name :");
                String items = sc.nextLine().toUpperCase();
                System.out.println("Quantity of items :");
                int quantity = sc.nextInt();
                System.out.println("Price of Single item :");
                int singlePrice = sc.nextInt();
                int totalPrice = quantity * singlePrice;

                map.put(items,singlePrice);
                map1.put(items,quantity);

                fileWriter.write(items + "\t");
                fileWriter.write(quantity+ "\t");
                fileWriter.write(singlePrice + "\t");
                fileWriter.write(totalPrice + "\n");

            }
            else {
                fileWriter.close();
                break;
            }
        }
        Customer.customer(map,map1);
    }
}
