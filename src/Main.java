
public class Main {
    public static void main(String[] args) {
       int year = 2019;
        System.out.println(LeapYear(year));
        int clientOS = 1;
        int clientDeviceYear = 2014;
        System.out.println(client(clientOS, clientDeviceYear));
        int deliveryDay = 1;
        int deliveryDistance = 95;
        System.out.println(delivery(deliveryDay, deliveryDistance));
    }

    public static int LeapYear(int y)
    {
        if (y % 4 <= 0 && y % 100 != 0 || y % 400 <= 0)
        {System.out.println(y + " год является високосным");}
        else {System.out.println(y + " год не является високосным");}

        return y;
    }
    public static int client(int x, int z){

    if (x == 0) {
        if (z < 2015) {
            System.out.println("Установитe облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    } else {
        if (z < 2015) {
            System.out.println("Установитe облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
        return x;
    }
    public static int delivery(int x, int y){
    if (y > 20) {
        x++;
    }
    if (y > 60) {
        x++;
    }
    System.out.println("потребуется дней: " + x);
        return x;
    }}












