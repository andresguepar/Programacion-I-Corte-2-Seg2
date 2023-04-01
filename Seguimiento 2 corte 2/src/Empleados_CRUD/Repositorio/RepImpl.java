package Empleados_CRUD.Repositorio;
import Empleados_CRUD.Modelo.Empleado;
import java.util.ArrayList;
import java.util.List;

public class RepImpl implements Rep{

private List<Empleado> empleados;

public RepImpl(){
    empleados = new ArrayList<>();
}

    @Override
    public Empleado findById(int id) {
        return empleados.stream()
                .filter(empleado -> empleado.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Empleado> findAll() {
        return empleados;
    }

    @Override
    public void save(Empleado empleado) { empleados.add(empleado);

    }

    @Override
    public void update(Empleado empleado) {
        Empleado oldEmp = findById(empleado.getId());
        if (oldEmp != null) {
            empleados.remove(oldEmp);
            empleados.add(empleado);
        }

    }

    @Override
    public void delete(Empleado empleado) {empleados.remove(empleado);

    }
}
