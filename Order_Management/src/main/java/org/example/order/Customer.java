package org.example.order;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Customer {
    public static Map<String, Integer> customer(Map<String, Integer> map) throws IOException {

        File myfile = new File("src/assets/CustomerOrder.txt");

        myfile.createNewFile();


        FileWriter fileWriter = new FileWriter("src/assets/CustomerOrder.txt");
        Map<String,Integer> map1 = new HashMap<>();

        int sum = 0;

        while (true){
            System.out.println("New Customer Order (yes/no) :");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("yes")){

                System.out.println("Item Name :");
                String items = sc.nextLine().toUpperCase();
                System.out.println("No of Quantity");
                int quantity = sc.nextInt();
                map1.put(items,quantity);


                if (map.containsKey(items)) {
                    int price = map.get(items);

                    int totalPrice = price * quantity;

                    fileWriter.write(items.toUpperCase()+ "\t");
                    fileWriter.write(quantity + "\t");
                    fileWriter.write(price + "\t");
                    fileWriter.write(totalPrice + "\n");

                    sum = sum + totalPrice;


                }else {
                    System.out.println("Item not available");
                }

            }
            else {
                fileWriter.write("\t \t \t \t" +sum);
                fileWriter.close();
                break;
            }

        }
        return map1;
    }
}
