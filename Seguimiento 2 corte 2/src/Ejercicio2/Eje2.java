package Ejercicio2;

public class Eje2 {
    Day day;

    public Eje2(Day day) {
        this.day = day;
    }

    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are free.");
                break;

            case FRIDAY:
                System.out.println("Fridays in the afternoon.");
                break;

            case SATURDAY: case SUNDAY:
                System.out.println("Weekends not available .");
                break;

            default:
                System.out.println("Midweek in the morning.");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("Days avaible for meetings");
        Eje2 firstDay = new Eje2(Day.MONDAY);
        firstDay.tellItLikeItIs();
        Eje2 thirdDay = new Eje2(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        Eje2 fifthDay = new Eje2(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        Eje2 sixthDay = new Eje2(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        Eje2 seventhDay = new Eje2(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}

