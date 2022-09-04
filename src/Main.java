public class Main {
    public static void main(String[] args) {

        int age = 35;
        if (age >= 2 && age < 7) {
            System.out.println("Если возраст чедовека равен от 2 до 6 то ему нужно ходить в детский сад");
        } else if (age >= 7 && age < 19) {
            System.out.println("Если возраст чедовека равен от 7 до 18 то ему нужно ходить в школу");
        }
        else if (age >= 19 && age < 24) {
            System.out.println("Если возраст чедовека равен от 18 до 23 то ему нужно ходить в университет");
        } else {System.out.println("Если возраст чедовека больше 24 то ему нужно ходить на работу");
        }
    }
}