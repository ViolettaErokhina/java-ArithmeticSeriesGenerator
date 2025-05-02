import java.util.Scanner;

public class ArithmeticSeriesGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ввод параметров
        System.out.print("Введите начало ряда: ");
        int start = scanner.nextInt();
        
        System.out.print("Введите шаг: ");
        int step = scanner.nextInt();
        
        System.out.print("Введите количество шагов: ");
        int steps = scanner.nextInt();
        
        // Генерация и вывод ряда
        System.out.print("Полученный ряд: ");
        for (int i = 0; i < steps; i++) {
            // Вычисляем текущее число ряда
            int current = start + (step * i);
            
            // Выводим число с запятой, кроме последнего
            if (i == steps - 1) {
                System.out.print(current);
            } else {
                System.out.print(current + ", ");
            }
        }
        
        scanner.close();
    }
}