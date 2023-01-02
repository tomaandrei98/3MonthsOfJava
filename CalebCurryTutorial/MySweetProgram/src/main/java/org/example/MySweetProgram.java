package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MySweetProgram {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\Toma\\IDEA Projects\\CalebCurryTutorial\\MySweetProgram\\src\\main\\resources\\students.txt"));

        List<String> students = new ArrayList<>();

        while (scanner.hasNext()) {
            students.add(scanner.nextLine());
        }

        System.out.println(students);

        for (String student : students) {
            System.out.println(student);
        }
        scanner.close();
    }
}