package Ejercicio1;

enum Eje1 {
    Vanilla(5), Chocolate(4), Strawberry(3), Caramel(6);

    private int price;
    private Eje1(int price){
        this.price=price;
    }

    public static void main(String args[]){
        for (Eje1 s : Eje1.values())
            System.out.println(s+" $"+s.price);

    }
}

