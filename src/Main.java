public class Main {
    public static void main(String[] args) {
        // Задача 1
        int intVariable = 1000000;
        byte byteVariable = 120;
        short shortVariable = 30000;
        long longVariable = 21000000L;
        float floatVariable = 2.1f;
        double doubleVariable = 23.8;
        System.out.println("Значение переменной intVariable с типом int равно " + intVariable);
        System.out.println("Значение переменной byteVariable с типом byte равно " + byteVariable);
        System.out.println("Значение переменной shortVariable с типом short равно " + shortVariable);
        System.out.println("Значение переменной longVariable с типом long равно " + longVariable);
        System.out.println("Значение переменной floatVariable с типом float равно " + floatVariable);
        System.out.println("Значение переменной doubleVariable с типом double равно " + doubleVariable);

        // Задача 2
        double var1 = 27.12;
        long var2 = 987678965549L;
        double var3 = 2.786;
        short var4 = 569;
        short var5 = -159;
        short var6 = 27897;
        byte var7 = 67;
        System.out.println();

        // Задача 3
        int studentsLudPav = 23;
        int studentsAnSerg = 27;
        int studentsEkAndr = 30;
        int paperCount = 480;
        int totalStudentPaper = paperCount / (studentsLudPav + studentsAnSerg + studentsEkAndr);
        System.out.println("На каждого ученика рассчитано " + totalStudentPaper + " листов бумаги");
        System.out.println();

        // Задача 4
        byte productivity = 16; // бутылок за 2 мин.
        byte time = 2; // минуты
        //за 20 мин.
        int productivity20 = productivity / time * 20;
        //за сутки
        int productivityDay = productivity / time * 60 * 24;
        //за 3 дня
        int productivity3Day = productivityDay * 3;
        //за месяц
        int productivityMonth = productivityDay * 30;
        System.out.println("За 20 мин. машина произвела " + productivity20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + productivityDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productivity3Day + " штук бутылок");
        System.out.println("За месяц машина произвела " + productivityMonth + " штук бутылок");
        System.out.println();

        // Задача 5
        int pot = 120;
        int whiteColour = 2;
        int brownColour = 4;
        int countClasses = pot / (whiteColour + brownColour);
        int countWhiteColourPot = countClasses * whiteColour;
        int countBrownColourPot = countClasses * brownColour;
        System.out.println("В школе, где " + countClasses + " классов, нужно " + countWhiteColourPot +
                " банок белой краски и " + countBrownColourPot + " банок коричневой краски");
        System.out.println();

        // Задача 6
        int bananas = 5;
        int weightBanana = 80; // гр./шт.
        int milk = 200;
        int weightMilk = 105; // 100мл 105гр
        int iceCream = 2;
        int weightIceCream = 100; // гр./шт.
        int eggs = 4;
        int weightEgg = 70; // гр./шт.
        int totalWeight = bananas * weightBanana + milk * weightMilk / 100 + iceCream * weightIceCream + eggs * weightEgg;
        double weightKg = totalWeight * 1.0 / 1000;
        System.out.println("Вес завтрака в граммах " + totalWeight + "\nВес завтрака в килограммах " + weightKg);
        System.out.println();

        // Задача 7
        int weight = 7; // кг
        int minDecrease = 250; // гр
        int maxDecrease = 500; // гр
        int grPerKg = 1000;
        float minDays = weight / (maxDecrease / (float) grPerKg);
        float maxDays = weight / (minDecrease / (float) grPerKg);
        float atAverage = (minDays + maxDays) / 2;
        System.out.println("Минимальное количество дней похудения " + minDays);
        System.out.println("Максимальное количество дней похудения " + maxDays);
        System.out.println("Среднее количество дней похудения " + atAverage);
        System.out.println();

        // Задача 8
        int salaryMaria = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int raiseSalaryMaria = salaryMaria / 100 * 10 + salaryMaria;
        int raiseSalaryDenis = salaryDenis / 100 * 10 + salaryDenis;
        int raiseSalaryKristina = salaryKristina / 100 * 10 + salaryKristina;
        int diffPerYearMaria = (raiseSalaryMaria - salaryMaria) * 12;
        int diffPerYearDenis = (raiseSalaryDenis - salaryDenis) * 12;
        int diffPerYearKristina = (raiseSalaryKristina - salaryKristina) * 12;
        System.out.println("Маша теперь получает " + raiseSalaryMaria + " рублей. Годовой доход вырос на " +
                diffPerYearMaria + " рублей");
        System.out.println("Денис теперь получает " + raiseSalaryDenis + " рублей. Годовой доход вырос на " +
                diffPerYearDenis + " рублей");
        System.out.println("Кристина теперь получает " + raiseSalaryKristina + " рублей. Годовой доход вырос на " +
                diffPerYearKristina + " рублей");
    }
}