import java.util.*;

public class CompanyUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, List<String>> companyWithUsers = new LinkedHashMap<>();



        while (!input.equals("End")){
            String[] tokens = input.split(" -> ");
            String company = tokens[0];
            String id = tokens[1];

            if(companyWithUsers.containsKey(company)){

                if(!companyWithUsers.get(company).contains(id)){
                    companyWithUsers.get(company).add(id);
                }

            }

            else {
                companyWithUsers.put(company, new ArrayList<>());
                companyWithUsers.get(company).add(id);
            }

            input = scanner.nextLine();
        }
        
        for (Map.Entry<String, List<String>> entry : companyWithUsers.entrySet()) {
            System.out.println(entry.getKey());

            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.println("-- " + entry.getValue().get(i));
            }



        }
    }
}
