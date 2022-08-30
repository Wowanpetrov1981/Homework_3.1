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

    public static void task1() {
        byte cat = 127;
        System.out.println("Значение переменной cat с типом byte равно " + cat);
        short apple = 127;
        System.out.println("Значение переменной apple с типом short равно " + apple);
        int projects = 256090;
        System.out.println("Значение переменной projects с типом int равно " + projects);
        long values = -1789787211L;
        System.out.println("Значение переменной values с типом long равно " + values);
        float number1 = 3.8F;
        System.out.println("Значение переменной number1 с типом float равно " + number1);
        double number2 = 119;
        System.out.println("Значение переменной number2 с типом double равно " + number2);
        System.out.println();
    }

    public static void task2() {
        float cargoWeight = 27.12f;
        char symbol1 = 987;
        char symbol2 = 678;
        char symbol3 = 965;
        char symbol4 = 549;
        byte cat = 2;
        short height = 786;
        boolean statement = false;
        int number1 = 569;
        short number2 = -159;
        long number3 = 27897;
        byte number4 = 67;

        byte dog = 4;
        short fountainPen = 13;
        int distance = 254;
        long passengerWeight = 1023L;
        float flourWeight = 32.1478f;
        double sandWeight = 1456.7777777777777;
        char plus = 43;
        boolean exceedingTheLoadCapacity = passengerWeight > 1000;
        System.out.println(symbol4);
        System.out.println();
    }

    public static void task3() {
        byte studentsOfLyudmilaPavlovna = 23;
        byte annaSergeevnaSStudents = 27;
        byte studentsOfEkaterinaAndreevna = 30;
        short totalSheetsOfPaper = 480;
        int totalStudents = studentsOfLyudmilaPavlovna + annaSergeevnaSStudents + studentsOfEkaterinaAndreevna;
        int numberOfSheetsOfPaperPerStudent = totalSheetsOfPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + numberOfSheetsOfPaperPerStudent + " листов бумаги");
        System.out.println();
    }

    public static void task4() {
        short machinePerformanceIn2Minutes = 16;
        int machinePerformanceIn20Minutes = machinePerformanceIn2Minutes * 10;
        System.out.println("За 20 минут машина произвела бутылок " + machinePerformanceIn20Minutes + " штук");

        int machinePerformanceIn1Hour = machinePerformanceIn20Minutes * 3;
        int machinePerformancePerDay = machinePerformanceIn1Hour * 24;
        System.out.println("За сутки машина произвела бутылок " + machinePerformancePerDay + " штук");

        int machinePerformanceIn3Days = machinePerformancePerDay * 3;
        System.out.println("За 3 дня машина произвела бутылок " + machinePerformanceIn3Days + " штук");

        int machinePerformanceIn1Month = machinePerformancePerDay * 30;
        System.out.println("За 1 месяц машина произвела бутылок " + machinePerformanceIn1Month + " штук");
        System.out.println();
    }

    public static void task5() {
        byte numberOfCansOfPaintTotal = 120;
        byte whitePaintForGrade1 = 2;
        byte brownPaintForGrade1 = 4;
        int numberOfClasses = numberOfCansOfPaintTotal / (whitePaintForGrade1 + brownPaintForGrade1);
        int amountOfWhitePaint = numberOfClasses * whitePaintForGrade1;
        int amountOfBrownPaint = numberOfClasses * brownPaintForGrade1;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + amountOfWhitePaint + " банок белой краски и " + amountOfBrownPaint + " банок коричневой краски");
        System.out.println();
    }

    public static void task6() {
        short numberOfBananas = 5;
        short amountOfMilk = 200;
        short quantityOfIceCream = 2;
        short numberOfEggs = 4;
        int weightOfBananas = numberOfBananas * 80;
        float weightOfMilk = 105 / 100f * amountOfMilk;
        int weightOfIceCream = quantityOfIceCream * 100;
        int weightOfEggs = numberOfEggs * 70;
        double weightOfTheSportsBreakfast = weightOfBananas + weightOfMilk + weightOfIceCream + weightOfEggs;
        System.out.println("Вес спорт-завтрака составляет " + weightOfTheSportsBreakfast + " грамм");

        double weightOfTheSportsBreakfastInKilograms = weightOfTheSportsBreakfast / 1000f;
        System.out.println("Вес спорт-завтрака составляет " + weightOfTheSportsBreakfastInKilograms + " килограмм");
        System.out.println();
    }

    public static void task7() {
        byte excessWeight = 7;
        short minimalWeightLoss = 250;
        short maximumWeightLoss = 500;
        int minimalNumberOfDaysForWeightLoss = excessWeight * 1000 / maximumWeightLoss;
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то на похудение у него уйдет " + minimalNumberOfDaysForWeightLoss + " дней");
        int maximumNumberOfDaysForWeightLoss = excessWeight * 1000 / minimalWeightLoss;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то на похудение у него уйдет " + maximumNumberOfDaysForWeightLoss + " дней");
        int averageNumberOfDays = (maximumNumberOfDaysForWeightLoss + minimalNumberOfDaysForWeightLoss) / 2;
        System.out.println("Что бы добится рельтата похудения, в среднем может потребоваться " + averageNumberOfDays + " дней");
        System.out.println();

    }

    public static void task8() {
        boolean workExperience = 4 > 3;
        float percentageOfSalaryIncrease = 1.10f;
        System.out.println("Если стаж работы свыше 3 лет " + workExperience + ", то зарплата повышается один раз за год в " + percentageOfSalaryIncrease + " раза");
        int mashaSSalary = 67_760;
        int denisSSalary = 83_690;
        int kristinaSSalary = 76_230;
        double mashaSNewSalary = mashaSSalary * percentageOfSalaryIncrease;
        double denisSNewSalary = denisSSalary * percentageOfSalaryIncrease;
        double kristinaSNewSalary = kristinaSSalary * percentageOfSalaryIncrease;
        double theDifferenceInMashaSIncome = mashaSNewSalary * 12 - mashaSSalary * 12;
        System.out.println("Маша теперь получает " + mashaSNewSalary + " рублей. Годовой доход вырос на " + theDifferenceInMashaSIncome + " рублей");
        double theDifferenceInDenisSIncome = denisSNewSalary * 12 - denisSSalary * 12;
        System.out.println("Денис теперь получает " + denisSNewSalary + " рублей. Годовой доход вырос на " + theDifferenceInDenisSIncome + " рублей");
        double theDifferenceInKristinaSIncome = kristinaSNewSalary * 12 - kristinaSSalary * 12;
        System.out.println("Кристина теперь получает " + kristinaSNewSalary + " рублей. Годовой доход вырос на " + theDifferenceInKristinaSIncome + " рублей");
    }
}