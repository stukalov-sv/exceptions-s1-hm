import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1HM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of check:\n1 - divide by zero\n2 - positive difference\n3 - random int 1 change");
        int res = scan.nextInt();

        switch (res) {
            case 1:
                // Первый метод - деление
                // Исключение - деление на ноль
                System.out.println(getDivide(10, 0));
                break;
            case 2:
                // Второй метод - получение положительной разницы двух чисел
                // Исключение - получение отрицательной разницы
                System.out.println(getPosDiff(5, 10));
                break;
            case 3:
                // Третий метод - замена единиц в массиве на рандомное число от 2 до 9
                // Исключение - null элемент в массиве
                Integer[] result = {1, 2, null, 3};
                numberOneChange(result);
                break;
            default:
                System.out.println("Incorrect data");
                break;
        }   

        scan.close();  
    }

    private static int getDivide(int a1, int a2) {
        if (a2 == 0) {
            throw new RuntimeException("Divide by zero not permit");
        }
        return a1/a2;
    }

    private static int getPosDiff(int a1, int a2) {
        if ((a1 - a2) < 0) {
            throw new RuntimeException("Difference not positive");
        }
        return a1 - a2;
    }

    private static void numberOneChange(Integer[] array) {
        Random temp = new Random();
        Integer[] res = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                throw new RuntimeException("Null element was in array");
            }

            if (array[i] == 1) {
                array[i] = temp.nextInt(2, 10);
            }

            res[i] = array[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
