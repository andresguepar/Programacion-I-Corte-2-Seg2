package Empleados_CRUD.Repositorio;
import Empleados_CRUD.Modelo.Empleado;

import java.util.List;

public interface Rep {

    Empleado findById(int id);

    List<Empleado> findAll();
    void save(Empleado empleado);
    void update(Empleado empleado);
    void delete(Empleado empleado);
}
