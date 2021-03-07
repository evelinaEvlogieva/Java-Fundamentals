import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> mapOfCompanies = new LinkedHashMap<>();

        while (!"End".equals(input)){
            String[] data = input.split(" -> ");
            String company = data[0];
            String id = data[1];

            if (!mapOfCompanies.containsKey(company)){
                mapOfCompanies.put(company, new ArrayList<>());
                mapOfCompanies.get(company).add(id);
            } else {
                if (!mapOfCompanies.get(company).contains(id)) {
                    mapOfCompanies.get(company).add(id);
                }
            }


            input = scanner.nextLine();
        }


    }
}
