import java.util.Scanner;

/** Разработайте программу, которая выбросит Exception,
 * когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */


public class Task04 {
    public void hw02_04(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите любую строку, кроме пустой: ");
        String str = input.nextLine();
        if(str.equals("")){
            throw new RuntimeException("Пустую строку вводить нельзя");
        }
        System.out.println(str);

    }
}
