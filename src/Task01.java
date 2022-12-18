import java.util.InputMismatchException;
import java.util.Scanner;

/** Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 вместо этого, необходимо повторно запросить у пользователя ввод данных.
*/
public class Task01 {
    public void hw02_01(){
        boolean cycle = true;
        while (cycle){
            Scanner input = new Scanner(System.in);
            System.out.print("Введите дробное чиcло: ");
            try {
                float number = input.nextFloat();
                System.out.printf("Вы ввели: %f\n", number);
                cycle = false;
            }catch (InputMismatchException e){
                System.out.println("Неверный ввод!");
            }
        }
    }
}
