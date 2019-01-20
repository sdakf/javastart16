package pl.sda.javastart.day8;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class CustomersExample {

    private static Customer[] people = new Customer[]{
            new Customer("Anna", "Nowak   ", 33, "1200"),
            new Customer("Beata", "Kowalska", 22, "1200"),
            new Customer("Marek", " Nowak", 25, "1250"),
            new Customer("Adam", "Twardowski", 33, "1100"),
            new Customer("Monika  ", "Kos", 25, "2500"),
            new Customer("Adam ", "Rudy", 45, "3333"),
            new Customer("Marek", "Rudy", 15, 2210),
            new Customer("Adam", "Madej", 15, 3333)
    };

    public static void main(String[] args) {
        System.out.println(salariesMap());
    }

    public static List<Customer> customerList() {
        List<Customer> customers = new ArrayList<>();
        for (Customer customer : people) {
            customers.add(customer);
        }
        return customers;
    }

    public List<Customer> customerListWithStream() {
        return Arrays.stream(people)
                .collect(Collectors.toList());
    }

    public List<Customer> customerListWithArrays() {
        return Arrays.asList(people);
    }

    public List<String> customerNamesList() {
        List<String> resultList = new ArrayList<>();
        for (Customer customer : people) {
            resultList.add(customer.getFirstName() + " " + customer.getSurname());
        }
        return resultList;
    }

    public List<String> customerNamesListWithStream() {
        return customerList().stream()
                .map(e -> e.getFirstName() + " " + e.getSurname())
                .collect(Collectors.toList());
    }

    //Napisz metodę, która zwróci mapę
    // osób według zarobków <zarobki,osoby_z_zarobkami>

    public static Map<BigDecimal, List<String>> salariesMap() {
        Map<BigDecimal, List<String>> resultMap = new HashMap<>();
        for (Customer customer : people) {
            if (resultMap.containsKey(customer.getSalary())) {
                List<String> innerList = resultMap.get(customer.getSalary());
                innerList.add(customer.getId() + ", " + customer.getFirstName() + ", " + customer.getSurname());
            } else {
                List<String> innerList = new ArrayList<>();//zasieg zmiennej tylko w tym bloku
                innerList.add(customer.getId() + ", " + customer.getFirstName() + ", " + customer.getSurname());
                resultMap.put(customer.getSalary(), innerList);
            }
        }
        return resultMap;
    }

    private static Map<BigDecimal, List<Customer>> salariesMapWithStream() {
        return customerList().stream()
                .collect(Collectors.groupingBy(e -> e.getSalary()));
    }

    private static Map<BigDecimal, List<String>> salariesMapWithMergedInfosWithStream() {
        return customerList().stream()
                .collect(Collectors.groupingBy(e -> e.getSalary(), Collectors.mapping(e -> e.getId() + ", " + e.getFirstName() + ", " + e.getSurname(), Collectors.toList())));
    }
}
