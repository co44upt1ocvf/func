import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Double[] revenue = new Double[4];
    public static List<String[]> workers = new ArrayList<>();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < revenue.length; i++) {
            System.out.print("Введите вырочку: ");
            revenue[i] = in.nextDouble();
        }

        System.out.println("Вся выручка:");
        RevenueSum();


        workers.add(new String[]{"Иван", "Петров", "Пивовар", "2000.0"});
        workers.add(new String[]{"Анна", "Сидорова", "Мастер по упаковке", "1500.0"});

        Whosthebestworker(workers);
    }

    public static void RevenueSum(){
        double revenueSum = 0;

        for (Double aDouble : revenue) {
            revenueSum += aDouble;
        }
        System.out.println(revenueSum);
    }

    public static void Whosthebestworker(List<String[]> workers){
        System.out.println("\nСтатистика по работникам:");

        for (String[] worker : workers) {
            System.out.println("Имя: " + worker[0]);
            System.out.println("Фамилия: " + worker[1]);
            System.out.println("Должность: " + worker[2]);
            System.out.println("Заработная плата: " + worker[3]);
            System.out.println("--------------------");
        }
    }
}