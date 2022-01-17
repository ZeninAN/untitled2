public class Main {
    public static void main(String[] args) {
        int initialAmount = 100;
        int replenishment = 1100;
        int bonus = replenishment / 100;
        int total = replenishment + initialAmount + bonus;
        System.out.println("Счет:" + total);
        System.out.println("Бонусные рубли:" + bonus);
    }
}

