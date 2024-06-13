import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        int[] workerSalaries = {70000, 80000, 120000, 130000, 100000};
        int sum = 0;
        for (int i = 0; i < workerSalaries.length; i++) {
            sum += workerSalaries[i];
        }
        System.out.printf("Сумма трат за месяц составила %s рублей", sum);
        System.out.println();

        System.out.println("Task 2");
        int[] weekSalary = {17500, 20000, 30000, 32500, 25000};
        int minSalary = weekSalary[0];
        int maxSalary = weekSalary[0];
        for (int i = 0; i < weekSalary.length; i++) {
            if (weekSalary[i] > maxSalary) {
                maxSalary = weekSalary[i];
            }
            if (weekSalary[i] < minSalary) {
                minSalary = workerSalaries[i];
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %s рублей. Максимальная сумма трат за неделю составила %s рублей", minSalary, maxSalary);
        System.out.println();

        System.out.println("Task 3");
        int sum2 = 0;
        for (int i = 0; i < workerSalaries.length; i++) {
            sum2 += workerSalaries[i];
        }
        double average = (double) sum2 / workerSalaries.length;
        System.out.printf("Средняя сумма трат за месяц составила %s рублей", average);
        System.out.println();

        System.out.println("Task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
           reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
           reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}
