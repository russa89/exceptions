import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        try {
            newUser("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongLoginException ex) {
            System.out.println(ex.getMessage());
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }
    }

    public static void newUser(String login, String password, String confirmPassword) {


        if (!login.matches("[a-zA-Z0-9_]+") || login.length() > 20) {
            throw new WrongLoginException();
        }

        if (!password.matches("[a-zA-Z0-9_]+") || password.length() > 20) {
            throw new WrongPasswordException();
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }


    }
}