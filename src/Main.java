public class Main {
    public static void main(String[] args) {
        int ticket_price = 15_599;
        int one_miles = 20;
        int bonus_miles = ticket_price / one_miles;
        System.out.println("Стоимость билета:" + ticket_price);
        System.out.println("Колличсетво бонусов:" + bonus_miles);

    }
}