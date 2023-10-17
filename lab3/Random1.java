package lab3;
import java.util.Arrays;
import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        int arraySize = 10; // Размер массива

        // Создаем массив int
        int[] intArray = new int[arraySize];
        System.out.println("Массив int, заполненный случайными числами:");

        // Заполняем массив случайными значениями с использованием Math.random()
        for (int i = 0; i < arraySize; i++) {
            intArray[i] = (int) (Math.random() * 100); // Генерируем случайное число от 0 до 99
            System.out.print(intArray[i]+" ");
        }

        // Копируем массив для сохранения оригинального порядка
        int[] sortedArray = Arrays.copyOf(intArray, arraySize);

        // Сортируем массив
        Arrays.sort(sortedArray);

        // Выводим отсортированный массив
        System.out.println("\nОтсортированный массив int:");
        for (int num : sortedArray) {
            System.out.print(num+" ");
        }

        // Создаем массив с использованием класса Random
        int[] randomArray2 = new int[arraySize];
        Random random = new Random();
        System.out.println("\nМассив, созданный с использованием класса Random:");
        for (int i = 0; i < arraySize; i++) {
            randomArray2[i] = random.nextInt(100);
            System.out.print(randomArray2[i]+" ");
        }

        // Копируем массив для сохранения оригинального порядка
        int[] sortedArray2 = Arrays.copyOf(randomArray2, arraySize);

        // Сортируем массив
        Arrays.sort(sortedArray2);

        // Выводим отсортированный массив
        System.out.println("\nОтсортированный массив, созданный с использованием класса Random:");
        for (int num : sortedArray2) {
            System.out.print(num+" ");
        }
    }
}