public class Main {

    public static void main(String[] args) {

        int ticketPrice = 9000; // стоимость билета
        int oneMile = 20; // условие бонусной программы: за каждые 20 рублей, потраченные на билет, начисляется 1 миля

        int bonus = ticketPrice / oneMile;
        System.out.println("Количество бонусных миль: " + bonus);
    }
}
