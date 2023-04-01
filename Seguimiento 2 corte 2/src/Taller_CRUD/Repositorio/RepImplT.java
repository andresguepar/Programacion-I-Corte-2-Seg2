package Taller_CRUD.Repositorio;

import Taller_CRUD.Modelo.Taller;

import java.util.ArrayList;
import java.util.List;

public class RepImplT implements RepT {
    private List<Taller> talleres;

    public RepImplT(){
        talleres = new ArrayList<>();
    }


    @Override
    public Taller findByPlate(int plate) {
        return talleres.stream()
                .filter(taller -> taller.getPlate() == plate)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Taller> findAll() {
        return talleres;
    }

    @Override
    public void save(Taller taller) {talleres.add(taller);

    }

    @Override
    public void update(Taller taller) {
        Taller oldTall = findByPlate(taller.getPlate());
        if (oldTall != null) {
            talleres.remove(oldTall);
            talleres.add(oldTall);
        }

    }

    @Override
    public void delete(Taller taller) {talleres.remove(talleres);

    }
}
