
public class Main {
    public static void main(String[] args) {
        int year = 2019;
        System.out.println(leapYear(2019));
        int clientOS = 1;
        int clientDeviceYear = 2014;
        client(clientOS, clientDeviceYear);
        int deliveryDay = 1;
        System.out.println("Доставка дней: " + DaysForDelivery(95));
    }

    public static String leapYear(int year) {
        String result = year + " не вискосный год";
        if (year % 100 == 0 ^ year % 4 == 0) {
        result = year + "  вискосный год";
        }
        return result;
    }
    public static int client(int iOS, int android){
    if (iOS == 0) {
        if (android < 2015) {
        System.out.println("Установитe облегченную версию приложения для iOS по ссылке");
        }
        else {
        System.out.println("Установите версию приложения для iOS по ссылке");
        }
        }
        else {
        if (android < 2015) {
        System.out.println("Установитe облегченную версию приложения для Android по ссылке");
        }
        else {
        System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
        return iOS;
    }
    public static int DaysForDelivery(int deliveryDistance){
        return 1 + (deliveryDistance + 20) / 40;
    }}












