package pl.sda.javastart.day8;

import java.util.HashSet;
import java.util.Set;

public class HashCodeExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ConstantHashCode const1 = new ConstantHashCode("6");
            ConstantHashCode const2 = new ConstantHashCode("6");
            ConstantHashCode const3 = new ConstantHashCode("6");
            ConstantHashCode const4 = new ConstantHashCode("6");
            ConstantHashCode const5 = new ConstantHashCode("6");

            RandomHashCode random1 = new RandomHashCode("7");
            RandomHashCode random2 = new RandomHashCode("7");
            RandomHashCode random3 = new RandomHashCode("7");
            RandomHashCode random4 = new RandomHashCode("7");
            RandomHashCode random5 = new RandomHashCode("7");

            //System.out.println("const");
            Set<ConstantHashCode> constantHashCodes = new HashSet<>();
            constantHashCodes.add(const1);
            constantHashCodes.add(const2);
            constantHashCodes.add(const3);
            constantHashCodes.add(const4);
            constantHashCodes.add(const5);
            System.out.println(constantHashCodes.size());
            //System.out.println("random");
            Set<RandomHashCode> randomHashCodes = new HashSet<>();
            randomHashCodes.add(random1);
            randomHashCodes.add(random2);
            randomHashCodes.add(random3);
            randomHashCodes.add(random4);
            randomHashCodes.add(random5);
            System.out.println(randomHashCodes.size());
            System.out.println(randomHashCodes.contains(random1));
        }


    }
}
