public class Main {
    public static void main(String[] args) {


            int people = 101;
            int placesInCar = 102;
            int sitStil = 60;
            int standStill = placesInCar - sitStil;
            if (people == placesInCar ) {
                System.out.println("мест нет вообще");
            }
            else if (people < sitStil){
                System.out.println("  Сидячие места есть");
            }
            else   {
                System.out.println(" Есть только стоячие места ");
        }
    }
}