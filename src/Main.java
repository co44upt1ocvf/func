import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Double[] revenue = new Double[4];
    public static List<String[]> workers = new ArrayList<>();
    public static List<String> rawMaterial = new ArrayList<>();
    int beerStock;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < revenue.length; i++) {
            System.out.print("Введите вырочку: ");
            revenue[i] = in.nextDouble();
        }

        System.out.println("Вся выручка:");
        revenueSum();


        workers.add(new String[]{"Иван", "Петров", "Пивовар", "2000.0"});
        workers.add(new String[]{"Анна", "Сидорова", "Мастер по упаковке", "1500.0"});

        trustworthiness(workers);

        int Production = dailyProduction();
        System.out.println("\nПроизведено " + Production + " литров пива за день.");

        rawMaterial.add("Солод ржаной");
        rawMaterial.add("Хмель");
        rawMaterial.add("Солод карамельный");
    }

    public static void revenueSum(){
        double revenueSum = 0;

        for (Double aDouble : revenue) {
            revenueSum += aDouble;
        }
        System.out.println(revenueSum);
    }

    public static void trustworthiness(List<String[]> workers){
        System.out.println("\nСтатистика по работникам:");

        for (String[] worker : workers) {
            System.out.println("Имя: " + worker[0]);
            System.out.println("Фамилия: " + worker[1]);
            System.out.println("Должность: " + worker[2]);
            System.out.println("Заработная плата: " + worker[3]);
            System.out.println("--------------------");
        }
    }

    public static int dailyProduction() {
        Random random = new Random();
        return random.nextInt(901) + 100;
    }

    public void deliverBeer(int quantity) {
        if (beerStock >= quantity) {
            beerStock -= quantity;
            System.out.println("Поставлено " + quantity + " литров пива");
        } else {
            System.out.println("Недостаточно пива на складе для поставки");
        }
    }

    public void recordQualityTestResults(String beerType, boolean passedQualityTest) {
        if (passedQualityTest) {
            System.out.println(beerType + " прошло тестирование на качество.");
        } else {
            System.out.println(beerType + " не прошло тестирование на качество. Необходимо отклонить партию.");
        }
    }

    public String allocateRandomMaterial() {
        Random random = new Random();
        int index = random.nextInt(rawMaterial.size());
        return rawMaterial.get(index);
    }
}