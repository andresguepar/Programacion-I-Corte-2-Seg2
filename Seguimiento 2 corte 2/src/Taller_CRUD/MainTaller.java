package Taller_CRUD;

import Locales_CRUD.ModeloL.Local;
import Locales_CRUD.RepositorioL.RepImplL;
import Locales_CRUD.RepositorioL.RepL;
import Taller_CRUD.Modelo.Taller;
import Taller_CRUD.Repositorio.RepImplT;
import Taller_CRUD.Repositorio.RepT;

import java.util.List;
import java.util.Scanner;

public class MainTaller {
    public class MainLocal {
        public static void main(String[] args) {
            String opt = "1";
            RepT repo = new RepImplT();

            do {
                Scanner sc = new Scanner(System.in);
                System.out.print("Menu =^._.^=  \n 1. Add  \n 2. List \n 3. Edit " +
                        "\n 4. Delete  \n 5. Exit \n =>");
                opt = sc.next();
                switch (opt) {
                    case "1":
                        System.out.println("Plate: ");
                        int pl = sc.nextInt();
                        System.out.println("Owner Name:  ");
                        String nam = sc.next();
                        System.out.println("Date:  ");
                        String dat = sc.next();
                        System.out.println("Contact Number:   ");
                        String ph = sc.next();
                        repo.save(new Taller(pl, nam, dat, ph));
                        break;

                    case "2": {
                        List<Taller> tallers = repo.findAll();
                        tallers.forEach(System.out::println);
                        break;
                    }

                    case "3": {
                        System.out.println("----Edit----");
                        System.out.println("Type Plate: ");
                        Integer plp = sc.nextInt();
                        System.out.println("Type Owner Name:  ");
                        nam = sc.next();
                        System.out.println("Type Date:  ");
                        dat = sc.next();
                        System.out.println("Type Contact Number:   ");
                        ph = sc.next();
                        Taller upd = new Taller(plp, nam, dat, ph);
                        repo.update(upd);
                        break;

                    }

                    case "4": {
                        System.out.println("===== Delete ======");
                        System.out.print("Type Plate: ");
                        pl = sc.nextInt();
                        repo.delete(repo.findByPlate(pl));
                        repo.findAll().forEach(System.out::println);
                        break;
                    }

                    case "5": {
                        opt = "5";
                        break;
                    }

                }
            } while (opt != "5");
        }
    }
}
