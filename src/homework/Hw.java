package homework;

public class Hw {
    public static void Task1(){
        System.out.println("Task 1:");

        var monthly = 15000;
        var totalNeed = 2459000;
        var currentBalance = 0;
        var month = 0;

        while (currentBalance <= totalNeed){
            currentBalance = currentBalance + monthly;
            month++;
            System.out.println("Месяц - " + month + ", сумма накоплений равна - " + currentBalance + " Руб.");
        }

        System.out.println(" ");
    }
    public static void Task2(){
        System.out.println("Task 2:");

        int i = 1;

        while(i < 11){
            System.out.print(i + " ");
            i++;
        }

        i--;
        System.out.println(" ");

        for (;i > 0; i--){
            System.out.print(i + " ");
        }

        System.out.println(" ");
    }
    public static void Task3(){
        System.out.println("Task 3:");

        double total = 12000000;
        var born = 17;
        var death = 8;

        for(int i = 1; i < 11; i++){
            total = total + ((total/1000) * born) - ((total/1000) * death);
            System.out.printf("Год - " + i + ", численность населения составляет - %.0f\n", total);
        }

        System.out.println(" ");
    }
    public static void Task4(){
        System.out.println("Task 4:");

        var monthly = 15000;
        var percent = 0.07;
        double totalNeed = 12000000;
        double currentBalance = 0;
        var month = 0;

        while (currentBalance <= totalNeed){
            currentBalance = currentBalance + monthly;
            currentBalance = currentBalance + (currentBalance * percent);
            month++;
            System.out.printf("Месяц - " + month + ", сумма накоплений равна - %.2f Руб.\n", currentBalance);
        }

        System.out.println(" ");
    }
    public static void Task5(){
        System.out.println("Task 5:");

        var percent = 0.07;
        var month = 0;
        var monthly = 15000;
        double currentBalance = 0;
        double totalNeed = 12000000;

        while (currentBalance <= totalNeed){
            currentBalance = currentBalance + monthly;
            currentBalance = currentBalance + (currentBalance * percent);
            month++;

            if(month % 6 == 0) {
                System.out.printf("Месяц - " + month + ", сумма накоплений равна - %.2f Руб.\n", currentBalance);
            }
        }

        System.out.printf("Конченый месяц - " + month + ", сумма накоплений равна - %.2f Руб.\n", currentBalance);
        System.out.println(" ");
    }
    public static void Task6(){
        System.out.println("Task 6:");

        var monthly = 15000;
        var percent = 0.07;
        var curBalance = 0d;
        var month = 0;

        while (month != 108){
            curBalance = curBalance + monthly;
            curBalance = curBalance + (curBalance * percent);
            month++;
            if(month % 6 == 0){
                System.out.printf("Месяц - " + month + ", Василий, ваш счет за пол года стал - %.2f Руб.\n", curBalance);
            }
        }

        System.out.printf("Спустя 9 лет вы накопили - %.2f Руб.\n", curBalance);
        System.out.println(" ");
    }
    public static void Task7(){
        System.out.println("Task 7:");

        int firstFriday = 6;
        int dayInMonth = 31;

        for(; firstFriday <= dayInMonth; firstFriday = firstFriday + 7){
            System.out.printf("Сегодня пятница, %d-e число. Необходимо подготовить отчет.\n", firstFriday);
        }

        System.out.println(" ");
    }
    public static void Task8(){
        System.out.println("Task 8:");

        var cometFlyby = 79;

        for(var year = 0; year <= 2100; year = year + cometFlyby){
            if(year > 1823){
                System.out.println(year);
            }
        }

        System.out.println(" ");
    }
}
