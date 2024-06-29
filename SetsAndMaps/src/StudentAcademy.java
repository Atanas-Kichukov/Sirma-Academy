import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStudentsAndGrades = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<Double>> allStudents = new LinkedHashMap<>();

        while (countStudentsAndGrades > 0) {

            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (allStudents.containsKey(name)) {
                allStudents.get(name).add(grade);
            } else {
                allStudents.put(name, new ArrayList<>());
                allStudents.get(name).add(grade);
            }


            countStudentsAndGrades--;
        }

        for (Map.Entry<String, List<Double>> entry : allStudents.entrySet()) {
            double sumOfAllGrades = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                sumOfAllGrades += entry.getValue().get(i);
            }
            double average = sumOfAllGrades/entry.getValue().size();
            if(average >=4.50){
                System.out.printf("%s -> %.2f%n",entry.getKey(),average);
            }
        }

    }
}
