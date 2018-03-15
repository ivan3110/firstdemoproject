package firstproject;

public class Car { //Шаблон
        // ТО, что должно быть
    String color;  // Тут ожидается  Строка, а не число //Черная для первой, green  длся второй машины
    String title;  // Тут тоже
    double maxV; // А тут ожидается целое и дробное число. Число пишется без кавычек, а строки с кавычками
    //См 12 и 14 строки

    public void getInformation() {
        System.out.println("Машина  " + title + " " +color + "   " +maxV);
    }

    //ЭТО ВСЕ ШАБЛОН




    public static void main(String [] args) {
        Car car = new Car();// То это уже конкретная машина
        car.color = "Черная";
        car.title = "Мерседес";
        car.maxV = 230;

        Car tank = new Car ( );
        tank.color = "green";
        tank.title="maysya";
        tank.maxV = 200;
        car.getInformation();
        tank.getInformation();

    }
}
