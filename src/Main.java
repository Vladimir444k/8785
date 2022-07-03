public class Main {
    public static void main(String[] args) {
        
        // входные данные
        int amount = 1100;
        int i = 100;


        // логика программы
        int bonus = amount / i;

        if (amount < 1000) {
            bonus = 0;
        }

        int d = amount + i + bonus;

        System.out.printf("Бонус составит: " + bonus);
        System.out.printf("Итоговая сумма составит: " + d);
    }
}
