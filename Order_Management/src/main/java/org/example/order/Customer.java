package org.example.order;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Customer {
    public static void customer(Map<String, Integer> map,Map<String, Integer> map2) throws IOException {

        File myfile = new File("src/assets/CustomerOrder.txt");

        myfile.createNewFile();


        FileWriter fileWriter = new FileWriter("src/assets/CustomerOrder.txt");

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


                if (map.containsKey(items) && map2.get(items) >= quantity) {
                    int price = map.get(items);

                    int totalPrice = price * quantity;

                    map2.replace(items, map2.get(items) - quantity);

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
        UpdateRetail.updateRetail(map,map2);
    }
}
