package Ejercicio6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Eje6 {
    public static void main(String args[])
    {

        List<Integer> list = new ArrayList<Integer>();

        Collections.addAll(list, 10, 20, 30, 40);

        System.out.println("List with addAll() : " + list.toString());

        List<Integer> intlist = Collections.unmodifiableList(
                Arrays.asList(1,3,5,7));

        System.out.println("List with unmodifiableList(): " + intlist.toString());

        List<String> strlist = Collections.singletonList("Java");

        System.out.println("List with singletonList(): " + strlist.toString());

    }
}
