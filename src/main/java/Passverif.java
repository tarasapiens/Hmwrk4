public class Passverif {
    public static void main(String[] args) {

        String password = "Qwerty09872654321";
        boolean numb = true;
        boolean symb = true;

        if (password.length() < 8){
            System.err.println("Пароль должен быть не менее 8 символов");
                    }
        // Импортировать методы более удобные так и не смог, пошел по дурацкому сложному пути перебора
        // и запутался окончательно:(( Получился бред
        else {
            for (int i = 0; password.length() > i; i++) {
                if ((password.charAt(i) == '0') || (password.charAt(i) == '1') || (password.charAt(i) == '2') ||
                        (password.charAt(i) == '3') || (password.charAt(i) == '4') || (password.charAt(i) == '5') ||
                        (password.charAt(i) == '6') || (password.charAt(i) == '7') || password || (password.charAt(i) == '8') ||
                        (password.charAt(i) == '9')) {
                    numb = true;
                }

                if ((password.charAt(i) == '!') || (password.charAt(i) == '@') || (password.charAt(i) == '#') ||
                        (password.charAt(i) == '$') || (password.charAt(i) == '%') || (password.charAt(i) == '^') ||
                        (password.charAt(i) == '&') || (password.charAt(i) == '*') || password || (password.charAt(i) == '№')) {
                    symb = true;
                }
        }
            if (!numb) {
                System.out.println("Пароль должен содержать минимум одну цифру");
            } else if (!symb) {
                System.out.println("Пароль должен содержать минимум один спецсимвол");
            }
            if (numb && symb) {
                System.out.println("Пароль принят");
            }
        }
    }
}


