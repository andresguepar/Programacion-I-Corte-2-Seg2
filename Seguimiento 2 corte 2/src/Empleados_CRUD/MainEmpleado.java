package Empleados_CRUD;
import Empleados_CRUD.Modelo.Empleado;
import Empleados_CRUD.Repositorio.Rep;
import Empleados_CRUD.Repositorio.RepImpl;

import java.util.List;
import java.util.Scanner;

public class MainEmpleado {
    public static void main(String[] args) {
        String opt = "1";
        Rep repos = new RepImpl();

        do {
        Scanner sc = new Scanner(System.in);
        System.out.print("Menu =^._.^=  \n 1. Add  \n 2. List \n 3. Edit " +
                "\n 4. Delete  \n 5. Exit \n =>");
        opt = sc.next();
        switch (opt){
            case "1":
                System.out.println("Id: ");
                int id = sc.nextInt();
                System.out.println("Name:  ");
                String nam = sc.next();
                System.out.println("Occupation:  ");
                String occ = sc.next();
                repos.save(new Empleado(id,nam,occ));
                break;

            case "2": {
                List<Empleado> empleados = repos.findAll();
                empleados.forEach(System.out::println);
                break;
            }

            case "3": {
                System.out.println("----Edit----");
                System.out.println("Type Id: ");
                Integer idp = sc.nextInt();
                System.out.println("Type Name:  ");
                nam = sc.next();
                System.out.println("Type Occupation:  ");
                occ = sc.next();
                Empleado upd = new Empleado(idp,nam,occ);
                repos.update(upd);
                break;

            }

            case "4": {
                System.out.println("===== Delete ======");
                System.out.print("Type Id: ");
                id = sc.nextInt();
                repos.delete(repos.findById(id));
                repos.findAll().forEach(System.out::println);
                break;
            }

            case "5": {
                opt = "5";
                break;
            }

        }
    }while (opt != "5");
    }
}
