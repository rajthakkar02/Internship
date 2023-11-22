package org.example.exam;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Test {
    public static void examTest(String s,String subject) throws IOException {

        File answer = new File("src/check/answer.txt");


        try (FileWriter fileWriter = new FileWriter("src/check/answer.txt")) {


            List<String> lines = Files.readAllLines(Path.of(s));

            ArrayList<String> list = new ArrayList<>();


            for (String line : lines) {
                if (line.trim().isEmpty())
                    continue;
                else {
                    list.add(line);
                }
            }

            long timeLimit = 300000;

            Timer timer = new Timer();

            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Time's up! The exam is over.");
                    try {
                        fileWriter.close();
                        Marks.checkAnswer(subject);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    timer.cancel();
                }
            };

            timer.schedule(task,timeLimit);

            for (int i = 0; i < list.size(); i = i + 5) {
                for (int j = i; j <= i + 4; j++) {
                    System.out.println(list.get(j));
                }
                System.out.println("Write answer below or want skip the question type s");
                Scanner sc = new Scanner(System.in);
                String ans = sc.nextLine().toLowerCase();

                if (ans.equals("a") || ans.equals("b") || ans.equals("c") || ans.equals("d")) {
                    fileWriter.write(ans + "\n");
                } else if (ans.equals("s")) {
                    fileWriter.write("Skipped Question \n");
                    continue;
                }else {
                    System.out.println("No option available as such");
                    fileWriter.write("Skipped Question \n");
                    continue;
                }
            }

            System.out.println("The Exam is now complete.");
            fileWriter.close();
            Marks.checkAnswer(subject);
            timer.cancel();
        }catch (Exception e){
            System.out.println("Error Occurred" +e);
        }

    }


}
