public class Main {
    public static void main(String[] args) {
        //Задание 1, 2
        int clientOS = 1;
        int clientDeviceYear = 2011;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
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
    }
}
