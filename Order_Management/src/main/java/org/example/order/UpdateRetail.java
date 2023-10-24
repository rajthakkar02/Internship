package org.example.order;



import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class UpdateRetail {
    public static void updateRetail(Map<String,Integer> map, Map<String, Integer> map2) throws IOException {


        try (FileWriter fileWriter = new FileWriter("src/assets/RetailerOrder.txt")) {


            for (Map.Entry<String, Integer> e : map.entrySet()) {

                fileWriter.write(e.getKey() + "\t");

                fileWriter.write(map2.get(e.getKey()) + "\t");

                fileWriter.write(e.getValue() + "\t");

                int totalPrice = e.getValue() * map2.get(e.getKey());

                fileWriter.write(totalPrice + "\n");

            }
        }
        
    }
}
