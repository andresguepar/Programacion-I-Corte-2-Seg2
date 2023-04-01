package Locales_CRUD.ModeloL;

public class Local {

    public int LocalNum;
    private String name;
    private String category;
    private String phone;

    public Local(int localNum, String name, String category, String phone) {
        LocalNum = localNum;
        this.name = name;
        this.category = category;
        this.phone = phone;
    }

    public int getLocalNum() {
        return LocalNum;
    }

    public void setLocalNum(int localNum) {
        LocalNum = localNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Local -> " +
                "LocalNum=" + LocalNum +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", phone='" + phone + '\'';
    }
}
