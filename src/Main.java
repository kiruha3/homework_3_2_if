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
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    private static void task2() {
        int clientOS = 1;
        int clientDeviceYear = 2015;
        int yearCheck = 2015;
        if (clientDeviceYear < yearCheck) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }else {
                System.out.println("Неизвествая OS");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }else {
                System.out.println("Неизвествая OS");
            }
        }
    }
    private static void task3() {
        int year = 1764;

        if ((year % 4 == 0) && (year % 100 !=0)||(year % 400 == 0)) {
            System.out.println("Год "+year+" является високосным");
        }
    }

    private static void task4() {
        int deliveryDistance = 99;
        int deliveryDay ;
        if (deliveryDistance < 100 && deliveryDistance >= 60){
            deliveryDay = 3;
            System.out.println("Потребуется дней: " + deliveryDay);
        }else if (deliveryDistance < 60 && deliveryDistance >= 20) {
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
    }
}