package Ejercicio3;

import Ejercicio3.Eje3;

public enum Eje3 {
    HIGH  (30333222),
    MEDIUM(203344),
    LOW   (1044);


    private final int levelCode;

    private Eje3(int levelCode) {
        this.levelCode = levelCode;
    }

    public int getLevelCode() {
        return levelCode;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Codes to access");
        Eje3 security = Eje3.LOW;
        System.out.println(security.getLevelCode());
        Eje3 sec2 = Eje3.MEDIUM;
        System.out.println(sec2.getLevelCode());
        Eje3 sec3 = Eje3.HIGH;
        System.out.println(sec3.getLevelCode());
    }
}

