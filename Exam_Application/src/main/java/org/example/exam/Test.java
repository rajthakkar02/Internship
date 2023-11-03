package org.example.exam;

import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void examTest(String s) throws IOException {

        FileReader fileReader = new FileReader(s);


        int i;
        while ((i = fileReader.read()) != -1){
            System.out.print((char) i);
            if (i == 32){
                break;
            }
        }




    }
}
