import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(convertFloatNumber());
    }
    public static float convertFloatNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число (разделитель точка) > ");
        String number = null;
        while (number == null) {
            number = scanner.next();
            try {
                Float.parseFloat(number);
            } catch (NumberFormatException e) {
                System.out.print("Повторите ввод (разделитель точка) > ");
                number = null;
            }
        }
        return Float.parseFloat(number);
    }
}