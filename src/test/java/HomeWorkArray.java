import java.util.Scanner;

public class HomeWorkArray {
    public static void main(String[] args) {

        //Змінні
        int inputValue;
        int i;

        //об'являємо масив
        int [] number = new int[10];

        //Отримання даних для масива
        Scanner in = new Scanner(System.in);
        for (i=0; i<10; i++) {
            System.out.print("Введіть значення для " + i + " елемента масиву: ");
            inputValue = in.nextInt();
            number[i] = inputValue;
        }

        //Виведення даних з масиву в зворотньому порядку
        System.out.println("Вивід масива в зворотньоу порядку");
        for (i=9; i>=0; i--){

            System.out.println(number[i]);
        }
    }
}