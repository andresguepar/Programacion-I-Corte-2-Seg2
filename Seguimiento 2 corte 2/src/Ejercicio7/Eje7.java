package Ejercicio7;

import java.util.LinkedList;
import java.util.List;

public class Eje7 {
    public static void main(String[] args) {

        List<Integer> numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println("List: " + numbers);

        int number = numbers.get(3);
        System.out.println("Accessed Element: " + number);

        int index = numbers.indexOf(6);
        System.out.println("Position of 6 is " + index);

        int removedNumber = numbers.remove(1);
        System.out.println("Removed Element: " + removedNumber);
    }
}
