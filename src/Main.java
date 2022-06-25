public class Main {
    public static void main(String[] args) {
        task1();
        task7();
    }

    public static void task1() {
        //Задание 1, 2
        int clientOS = 0;
        int clientDeviceYear = 2011;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        //Задание 3
        int year = 2021;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //Задание 4
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней : 3");
        }
        //Задание 5
        int monthNumber = 6;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Этот месяц зимой");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц весной");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц летом");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц осенью");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
        //Задание 6
        int age = 20;
        double salary = 60_000;
        double limit;
        if (age >= 23 && salary < 50_000) {
            limit = salary * 3;
        } else if (age >= 23 && salary >= 50_000 && salary < 80_000) {
            limit = salary * 3 * 1.2;
        } else if (age >= 23 && salary >= 80_000) {
            limit = salary * 3 * 1.5;
        } else if (age < 23 && salary < 50_000) {
            limit = salary * 2;
        } else if (age < 23 && salary >= 50_000 && salary < 80_000) {
            limit = salary * 2 * 1.2;
        } else {
            limit = salary * 2 * 1.5;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей.");
        }


    //Задание 7
    public static void task7() {
        byte age = 20;
        double salary = 50_000;
        byte creditPeriod = 12;
        double wantedSum = 100_000;
        double maxPayment = salary / 2;
        double interestRate;
        if (age >= 30 && salary < 80_000) {
            interestRate = 0.1;
        } else if (age < 23 && salary < 80_000) {
            interestRate = 0.11;
        } else if (age >= 23 && age < 30 && salary < 80_000) {
            interestRate = 0.105;
        } else if (age >= 30 && salary >= 80_000) {
            interestRate = 0.093;
        } else if (age < 23 && salary >= 80_000) {
            interestRate = 0.103;
        } else {
            interestRate = 0.1043;
        }
        double creditPayment = wantedSum / creditPeriod + wantedSum * 11 / creditPeriod * interestRate;
        String result;
        if (maxPayment >= creditPayment) {
            result = "Одобрено.";
        } else {
            result = "Отказано.";
        }
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж по кредиту " + creditPayment + " рублей. " + result);
    }
}

