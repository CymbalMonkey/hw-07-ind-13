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
        System.out.println("Задача 1");

        int deposit = 15_000;
        int month = 0;
        int monthlyTotal = 0;
        int goal = 2_459_000;
        while (monthlyTotal < goal) {
            month = month + 1;
            monthlyTotal = monthlyTotal + deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + monthlyTotal + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i = i + 1;
        }
        System.out.println();

        for (int j = 10; j > 0; j = j - 1) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");

        int population = 12_000_000;
        int bornPer1000 = 17;
        int bornEachYear = bornPer1000 * population / 1000;
        int diedPer1000 = 8;
        int diedEachYear = diedPer1000 * population / 1000;
        int year = 0;
        while (year < 10) {
            population = population + bornEachYear - diedEachYear;
            year = year + 1;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int deposit = 15_000;
        int savings = 0;
        double interestRate = 0.07;
        int goal = 12_000_000;
        for (int i = 1; savings < goal; i = i + 1) {
            savings = (int) (savings * interestRate + savings + deposit);
            System.out.println("Месяц " + i + ", сумма накоплений составляет " + savings + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");

        int deposit = 15_000;
        int savings = 0;
        double interestRate = 0.07;
        for (int i = 1; savings < 12_000_000; i = i + 1) {
            savings = (int) (savings * interestRate + savings + deposit);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений составляет " + savings + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");

        int numberOfYears = 9;
        int numberOfMonths = numberOfYears * 12;
        int deposit = 15_000;
        int savings = 0;
        double interestRate = 0.07;
        int monthCount = 0;
        for (; monthCount <= numberOfMonths; monthCount++) {
            savings = (int) (savings * interestRate + savings + deposit);
            if (monthCount % 6 == 0) {
                System.out.println("Месяц " + monthCount + " сумма накоплений составляет " + savings + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");

        int fridayDate = 7;
        int month = 31;
        while (fridayDate <= month) {
            System.out.println("Сегодня пятница, " + fridayDate + "-е число. Необходимо подготовить отчет");
            fridayDate = fridayDate + 7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");

        int year = 0;
        int currentYear = 2024;
        int yearsBefore = 200;
        int yearsAfter = 100;
        int startingYear = currentYear - yearsBefore;
        int endingYear = currentYear + yearsAfter;
        while (year < endingYear) {
            year = year + 79;
            if (year >= startingYear && year <= endingYear) {
                System.out.println(year);
            }
        }
    }
}