package org.example.exam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

public class Marks {
    public static void checkAnswer(String subject) throws IOException {

        if (Objects.equals(subject, "Math")){
            mathMarks();
        } else if (Objects.equals(subject, "Science")) {
            scienceMarks();
        }

    }

    public static void mathMarks() throws IOException {


        List<String> correctAnswer = Files.readAllLines(Path.of("src/check/correctAnswerMath"));

        List<String> userAnswer = Files.readAllLines(Path.of("src/check/answer.txt"));

        int marks = 0;

        for (int i=0 ; i<userAnswer.size() ; i++){
            if (userAnswer.contains("Skipped Question")){
                continue;
            }
            if (Objects.equals(userAnswer.get(i), correctAnswer.get(i))){
                marks = marks + 1;
            }
        }

        System.out.println("Total Marks : " +marks);
        System.exit(0);

    }
    public static void scienceMarks() throws IOException {

        List<String> correctAnswer = Files.readAllLines(Path.of("src/check/correctAnswerScience"));

        List<String> userAnswer = Files.readAllLines(Path.of("src/check/answer.txt"));

        int marks = 0;

        for (int i=0 ; i<userAnswer.size() ; i++){
            if (userAnswer.contains("Skipped Question")){
                continue;
            }
            if (Objects.equals(userAnswer.get(i), correctAnswer.get(i))){
                marks = marks + 1;
            }
        }

        System.out.println("Total Marks : " +marks);
        System.exit(0);

    }
}
