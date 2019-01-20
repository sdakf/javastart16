package pl.sda.javastart.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomersExample {

    private Customer[] people = new Customer[]{
            new Customer("Anna", "Nowak   ", 33, "1200"),
            new Customer("Beata", "Kowalska", 22, "1200"),
            new Customer("Marek", " Nowak", 25, "1250"),
            new Customer("Adam", "Twardowski", 33, "1100"),
            new Customer("Monika  ", "Kos", 25, "2500"),
            new Customer("Adam ", "Rudy", 45, "3333"),
            new Customer("Marek", "Rudy", 15, 2210),
            new Customer("Adam", "Madej", 15, 3333)
    };

    public List<Customer> customerList() {
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

    public List<Customer> customerListWithArrays(){
        return Arrays.asList(people);
    }

//    public List<Customer> customerNamesList(){
//
//    }
}
