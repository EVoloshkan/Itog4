import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        String mystery = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";
        System.out.println("Загадка: " + mystery);
        String answer = "Заархивированный вирус";
        int count = 0;
        boolean used = false;
        Scanner scanner = new Scanner(System.in);
        while (count < 3) {
            System.out.println("Введите ответ: ");
            String attempt = scanner.nextLine();
            if (attempt.equals(answer)) {
                System.out.println("Правильно!");
                break;
            } else if (count == 0 && attempt.equals("Подсказка") && !used) {
                System.out.println("Подсказка: вирус");
                used = true;
                continue;
            } else if (attempt.equals("Подсказка") && (count == 1 || count == 2)) {
                System.out.println("Подсказка уже недоступна");
                continue;
            } else if (used || count == 2) {
                System.out.println("Обидно, приходи в другой раз");
                break;
            } else {
                System.out.println("Подумай еще!");
            }
            count++;
        }
    }
}
