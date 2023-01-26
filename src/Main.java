import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        byte apple = 127;
        short cucumber = 5624;
        int earthSunDistance = 149597870;//км
        long starDistance = 9640000000000L;//км
        float shortPi = (float) Math.PI;
        double longPi = Math.PI;

        System.out.println("Задача 1");
        System.out.println("Значение переменной apple с типом byte равно " + apple + " шт");
        System.out.println("Значение переменной cucumber с типом short равно " + cucumber + " мешков");
        System.out.println("Значение переменной earthDistance с типом int равно " +
                new DecimalFormat( "###,###.##" ).format(earthSunDistance) + " км");
        System.out.println("Значение переменной starDistance с типом byte равно " +
                new DecimalFormat( "###,###.##" ).format(starDistance) + " км");
        System.out.println("Значение переменной shortPi с типом short равно " + shortPi);
        System.out.println("Значение переменной longPi с типом short равно " + longPi);
        System.out.println();
    }

    public static void task2 () {
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        System.out.println("Задача2");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println();
    }

    public static void task3 () {
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short totalSheets = 480;
        byte sheetsForEach = (byte) (totalSheets / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna));

        System.out.println("Задача 3");
        System.out.println("На каждого ученика рассчитано по " + sheetsForEach + " листов бумаги");
        System.out.println();
    }

    public static void task4 () {
        byte capacityPerTwoMin = 16;
        byte capacityPerMin = (byte) (capacityPerTwoMin / 2);//производительность в минуту
        short capacityPer20Min = (short) (capacityPerMin * 20);
        short capacityPerDay = (short) (capacityPerMin * 60 *24);
        int capacityPer3Days = capacityPerDay * 3;
        long capacityPerMonth = capacityPerMin * capacityPer3Days / 3 * 31;

        System.out.println("Задача4");
        System.out.println("Введите заданный промежуток времени в минутах: ");
        Scanner scan = new Scanner(System.in); //при помощи объекта Scanner получаем возможность запрашивать число у пользователя
        int userTime = scan.nextInt(); //сохраняем в переменную запрошенное у пользователя число
        int userCapacity = capacityPerMin * userTime;
        System.out.println("Заданная пользователем производительность: " +
                new DecimalFormat( "###,###.##" ).format(userCapacity) + " бутылок за " + userTime + " минут");
        System.out.println("Производительность в минуту: " + capacityPerMin + " бут.");
        System.out.println("Производительность за 20 минут: " + capacityPer20Min + " бут.");
        System.out.println("Производительность за сутки: " +
                new DecimalFormat( "###,###.##" ).format(capacityPerDay) + " бут.");
        System.out.println("Производительность за 3 дня: " +
                new DecimalFormat( "###,###.##" ).format(capacityPer3Days) + " бут.");
        System.out.println("Производительность за месяц: " +
                new DecimalFormat( "###,###.##" ).format(capacityPerMonth) + " бут.");
        System.out.println();
    }

    public static void task5 () {
        byte totalPaintJars = 120;
        byte amountClassRooms = (byte) (totalPaintJars / (2 + 4));
        byte whitePaintJars = (byte) (totalPaintJars / 3);
        byte grayPaintJars = (byte) (totalPaintJars * 2 / 3);

        System.out.println("Задача 5");
        System.out.println("В школе, где " + amountClassRooms + " классов, нужно " + whitePaintJars +
                " банок белой краски и " + grayPaintJars + " банок коричневой краски");
        System.out.println();
    }

    public static void task6 () {
        //рассчитываем вес бананов
        byte bananasAmount = 5;
        byte oneBananasWeight = 80;
        short totalBananasWeight = (short) (bananasAmount * oneBananasWeight);

        //рассчитываем вес молока
        short milkAmount = 200;
        short milkWeight = 105;
        short totalMilkWeight = (short) (milkWeight * milkAmount);

        //рассчитываем вес пломбира
        byte iceCreamAmount = 2;
        byte iceCreamWeight = 100;
        short totalIceCreamWeight = (short) (iceCreamWeight * iceCreamAmount);

        //рассчитываем вес яиц
        byte egsAmount = 4;
        byte egsWeight = 70;
        short totalEgsWeight = (short) (egsWeight * egsAmount);

        //рассчитываем вес завтрака в граммах
        int supperWeightGrams = totalEgsWeight + totalBananasWeight + totalMilkWeight + totalIceCreamWeight;
        //рассчитываем вес завтрака в килограммах
        float supperWeightKg = (float) (supperWeightGrams * 0.001);

        System.out.println("Задача 6");
        System.out.println("Вес завтрака в граммах: " + supperWeightGrams);
        System.out.println("Вес завтрака в килограммах: " + supperWeightKg);
        System.out.println();
    }

    public static void task7 () {
        byte totalWeightLose = 7;
        short minDailyWeightLose = 250;
        short maxDailyWeightLose = 500;

        System.out.println("Задача 7");
        byte minDaysNeeds = (byte) (totalWeightLose * 1000 / maxDailyWeightLose);
        System.out.println("Минимальное необходимое количество дней для сброса веса: " + minDaysNeeds);
        byte maxDaysNeeds = (byte) (totalWeightLose * 1000 / minDailyWeightLose);
        System.out.println("Максимальное необходимое количество дней для сброса веса: " + maxDaysNeeds);
        byte middleDaysNeeds = (byte) ((maxDaysNeeds + minDaysNeeds)/2);
        System.out.println("Минимальное необходимое количество дней для сброса веса: " + middleDaysNeeds);
        System.out.println();
    }

    public static void task8 () {
        int origMashaSalary = 67760;
        int origDenissSalary = 83690;
        int origChristinaSalary = 76230;

        //рассчитываем повышение на 10%
        int incrMashaSalary = (int) (origMashaSalary * 1.1);
        int incrDenissSalary = (int) (origDenissSalary * 1.1);
        int incrChristinaSalary = (int) (origChristinaSalary * 1.1);

        //рассчитываем разницу между доходами после повышения З/П
        int differenceMashaSalary = incrMashaSalary - origMashaSalary;
        int differenceDenissSalary = incrDenissSalary - origDenissSalary;
        int differenceChristinaSalary = incrChristinaSalary - origChristinaSalary;

        //вывод результатов
        System.out.println("Задача 8");
        System.out.println("Маша теперь получает " + incrMashaSalary + " рублей. Годовой доход вырос на " +
                differenceMashaSalary + " рублей");
        System.out.println("Денис теперь получает " + incrDenissSalary + " рублей. Годовой доход вырос на " +
                differenceDenissSalary + " рублей");
        System.out.println("Кристина теперь получает " + incrChristinaSalary + " рублей. Годовой доход вырос на " +
                differenceChristinaSalary + " рублей");
    }
}