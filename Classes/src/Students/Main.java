package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] information = command.split("\\s+");
            Student student = new Student(information[0], information[1], Integer.parseInt(information[2]), information[3]);
            students.add(student);


            command = scanner.nextLine();
        }
        String town = scanner.nextLine();
        for (Student student : students) {
            if(student.getTown().equals(town)){
                System.out.printf("%s %s is %d years old%n",student.getFirstName(),student.getLastName(),student.getAge());
            }
        }


    }
}
