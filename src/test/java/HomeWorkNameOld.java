import java.util.Scanner;

public class HomeWorkNameOld {

    public static void main(String[] args) {

        //Змінні
        String name;
        int old;

        Scanner in = new Scanner(System.in);
        //Запит імені й присвоєння його змінній name;
        System.out.print("Встановіть курсор, введіть Ваше ім'я та натисніть 'Enter': ");
        name = in.next();

        //Запит віку й присвоєння значення змінній old;
        System.out.print("Введіть скільки Вам повних років та натисніть 'Enter': ");
        old = in.nextInt();

        //Вивід повного результату по імені і віку користувача
        System.out.println("Я " +name+" й мені "+old+" років.");
    }
}