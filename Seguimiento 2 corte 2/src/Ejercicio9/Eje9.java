package Ejercicio9;
import java.util.*;

public class Eje9 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println("ELement exixst?");
        String element1 = "Element 1";

        list.add(element1);

        boolean containsElement =
                list.contains("Element 1");

        System.out.println(containsElement);

    }
}




