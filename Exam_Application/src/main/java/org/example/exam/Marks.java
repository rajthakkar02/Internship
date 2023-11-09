package org.example.exam;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Marks {
    public static void checkAnswer() throws IOException {

        List<String> userAnswer = Files.readAllLines(Path.of("src/check/answer.txt"));

        List<String> correctAnswer = Files.readAllLines(Path.of("src/check/correctAnswer"));

        int marks = 0;

        for (int i=0 ; i<userAnswer.size() ; i++){
            if (userAnswer.equals("Skipped Question")){
                continue;
            }
            if (Objects.equals(userAnswer.get(i), correctAnswer.get(i))){
                marks = marks + 1;
            }
        }

        System.out.println("Total Marks :" +marks);





    }
}
