package Empleados_CRUD.Modelo;

public class Empleado {
    public int Id;
    private String name;
    private String occupation;

    public Empleado(int id, String name, String occupation) {
        Id = id;
        this.name = name;
        this.occupation = occupation;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
