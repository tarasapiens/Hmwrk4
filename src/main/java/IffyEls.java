public class IffyEls {
    public static void main(String[] args) {

        int number = 75;

        if (number % 2 == 0 && number % 4 == 0) {
            System.out.println("Число чётное и кратное четырем");
        }
        else {
            if (number % 2 == 0 && number % 3 == 0)
                System.err.println("не удовлетворяет ни одному из условий");
            else {
                if (number % 3 == 0)
                System.out.println("Число нечётное и кратное трём");
            }
        }

    }

}




