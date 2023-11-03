package org.example.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Option {
    public static void examOption() throws IOException {

        System.out.println("Exam you want to give :");

        File directory = new File("src/assets/");

        String[] fileName = directory.list();

        for (int i=0 ; i< fileName.length ; i++){
            System.out.println( i + " " + fileName[i]);
        }

        Scanner sc = new Scanner(System.in);

        int examNumber = sc.nextInt();

        switch (examNumber){
            case 0 :
                Test.examTest("src/assets/Math");
                break;

            case 1 :
                Test.examTest("src/assets/Science");
                break;

            default :
                System.out.println("You Have not selected test Number");
        }







    }

}
