package org.example;

import org.example.order.Customer;
import org.example.order.Retailer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        Map<String,Integer> map = Retailer.retailer();


        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " "+ e.getValue());
        }

        Map<String,Integer> map1 = Customer.customer(map);

    }

}
