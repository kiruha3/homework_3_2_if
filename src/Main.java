// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    private static void task1() {
        int iOs = 0;
        int android = 1;

        int clientOS = 0;

        if (clientOS == iOs) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else  {
            System.out.println("Указанная ОС не поддерживается");
        }
    }

    private static void task2() {
        int clientOS = 1;
        int iOs = 0;
        int android = 1;
        int clientDeviceYear = 2015;
        int yearCheck = 2015;
        if (clientDeviceYear < yearCheck) {
            if (clientOS == iOs) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == android) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Указанная ОС не поддерживается");
            }
        } else {
            if (clientOS == iOs) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == android) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Указанная ОС не поддерживается");
            }
        }
    }

    private static void task3() {
        int year = 1764;

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Год " + year + " является високосным");
        }
    }

    private static void task4() {
        int deliveryDistance = 99;
        int deliveryDay;
        if (deliveryDistance < 100 && deliveryDistance >= 60) {
            deliveryDay = 3;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance < 60 && deliveryDistance >= 20) {
            deliveryDay = 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance < 20) {
            deliveryDay = 1;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println("Доставка не осуществляется");
        }

    }

    private static void task5() {
        int monthNumber = 5;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                break;

        }
    }
}