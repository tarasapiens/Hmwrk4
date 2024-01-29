public class Adresschek {
    public static void main(String[] args) {

        String ur1 = "http://name.onego.ru";

        if (ur1.startsWith("https")){
            System.out.println("Соединение безопаснои");
        }
        else {
            System.err.println("Небезопано.Неуказывайте логины,пароли и данные банковских карт");
        }

    }
}
