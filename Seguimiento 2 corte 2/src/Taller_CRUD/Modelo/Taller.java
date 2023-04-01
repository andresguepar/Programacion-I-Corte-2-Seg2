package Taller_CRUD.Modelo;

public class Taller {
    public int Plate;
    private String owner;
    private String date;
    private String phone;

    public Taller(int plate, String owner, String date, String phone) {
        Plate = plate;
        this.owner = owner;
        this.date = date;
        this.phone = phone;
    }

    public int getPlate() {
        return Plate;
    }

    public void setPlate(int plate) {
        Plate = plate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Taller ->" +
                "Plate=" + Plate +
                ", owner='" + owner + '\'' +
                ", date='" + date + '\'' +
                ", phone='" + phone + '\'' ;
    }
}
