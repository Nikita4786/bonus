public class Main {
    public static void main(String[] args) {

        int start = 100; // начальный баланс
        int replenishment = 1100; // сумма пополнения
        int bonus;

        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        System.out.println("счет клиента:" + (start + replenishment + bonus) + "рублей");
    }
}