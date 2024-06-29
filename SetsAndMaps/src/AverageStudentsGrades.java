import java.util.ArrayList;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        TreeMap<String, ArrayList<Double>> studentsWithGrades = new TreeMap<>();
        while(lines>0){
            String[] student = scanner.nextLine().split("\\s+");
            String studentName = student[0];
            double grade = Double.parseDouble(student[1]);

            if(studentsWithGrades.containsKey(studentName)){

                studentsWithGrades.get(studentName).add(grade);
            }else {
                studentsWithGrades.putIfAbsent(studentName, new ArrayList<>());
                studentsWithGrades.get(studentName).add(grade);

            }


            lines--;
        }

        for (Map.Entry<String, ArrayList<Double>> entry : studentsWithGrades.entrySet()) {
            String studentName = entry.getKey();
            ArrayList<Double> grades = entry.getValue();
            double averageGrade = 0;
            System.out.print(studentName + " -> ");
            for (Double grade : grades) {
                System.out.printf("%.2f ",grade);
                averageGrade+=grade;
            }
            System.out.printf("(avg:%.2f)%n",averageGrade/grades.size());

        }
    }
}
