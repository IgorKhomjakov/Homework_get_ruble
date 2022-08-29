public class Main {

    public static void main(String[] args) {

        int initialAmount = 100;  // Начальный счет
        int topUp = 1100;         // Сумма пополнения

        int bonus;
        if (topUp > 1000) {
            bonus = topUp / 100;
        } else {
            bonus = 0;
        }
        int totalAmount = initialAmount + topUp + bonus;  // Итоговый счет

        System.out.println("Итоговый счет " + totalAmount + " рублей, сумма бонусов - " + bonus + " рублей.");
    }
}
