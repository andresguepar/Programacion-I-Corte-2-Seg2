package Ejercicio5;

enum Eje5 {
    SMALL("The size is small."),
    MEDIUM("The size is medium."),
    LARGE("The size is large."),
    EXTRALARGE("The size is extra large.");

    private final String pizzaSize;

    private Eje5(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getSize() {
        return pizzaSize;
    }
}

class Main {
    public static void main(String[] args) {
        Eje5 pepperoni = Eje5.SMALL;
        System.out.println("Pepperoni: "+ pepperoni.getSize());
        Eje5 veggie = Eje5.MEDIUM;
        System.out.println("Veggie: "+ veggie.getSize());
        Eje5 margherita = Eje5.LARGE;
        System.out.println("Margherita: "+ margherita.getSize());
        Eje5 hawaiian  = Eje5.EXTRALARGE;
        System.out.println("Hawaiian: "+ hawaiian.getSize());

    }
}
