package Taller_CRUD.Repositorio;

import Empleados_CRUD.Modelo.Empleado;
import Taller_CRUD.Modelo.Taller;

import java.util.List;

public interface RepT {

    Taller findByPlate(int plate);

    List<Taller> findAll();
    void save(Taller taller);
    void update(Taller taller);
    void delete(Taller taller);
}
