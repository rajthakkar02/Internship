package org.example.order;



import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class UpdateRetail {
    public static void updateRetail(Map<String,Integer> map) throws IOException {


        try (FileWriter fileWriter = new FileWriter("src/assets/SaleOut.txt")) {


            for (Map.Entry<String, Integer> e : map.entrySet()) {

                fileWriter.write(e.getKey() + "\t");
                fileWriter.write(e.getValue() + "\n");

            }
        }


    }
}
