import java.util.Scanner;

public class Task4 {
        public static void main(String[] args) {
            System.out.print("Введите строку > ");
            Scanner scanner = new Scanner(System.in);
            EmptyStringException(scanner.nextLine());
        }
        public static void EmptyStringException(String stringValue) {
            if (stringValue.isEmpty()) {
                throw new RuntimeException("Пустые строки вводить нельзя!");
            }
        }
    }
