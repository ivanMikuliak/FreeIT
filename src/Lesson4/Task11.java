package Lesson4;

import java.util.Scanner;

public class Task11 {
    //   Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
    //    случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
//матрицы).
//    1) Почитать сумму четных элементов стоящих на главной диагонали.
//    2)Вывести нечетные элементы находящиеся под главной диагональю(включительно).
//    3)Проверить произведение элементов какой диагонали больше.
//    4)Посчитать сумму четных элементов стоящих над побочной диагональю (не включительно)
//    5)Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
    public static void main(String[] args) {
        System.out.println("Enter size of twoDimArray: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] twoDimArray = new int[size][size];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = (int) (Math.random() * 50);
            }
        }
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
        //    1)
        int sum = 0;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (i == j && twoDimArray[i][j] % 2 == 0) {
                    sum += twoDimArray[i][j];
                }
            }
        }
        System.out.println("sum of main diagonal = " + sum);
        //    2)
        System.out.print("Odd numbers under the main diagonal: ");
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (i >= j && twoDimArray[i][j] % 2 != 0) {
                    System.out.print(twoDimArray[i][j] + " ");
                }
            }
        }
        System.out.println();
        //    3)
        int mainDiagonal = 1;
        int secondaryDiag = 1;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (i == j) mainDiagonal *= twoDimArray[i][j];
                if (i + j == twoDimArray.length - 1) secondaryDiag *= twoDimArray[i][j];
            }
        }
        System.out.println(mainDiagonal + "     " + secondaryDiag);
        if (mainDiagonal > secondaryDiag) {
            System.out.println("main diagonal more than secondary");
        } else if (mainDiagonal < secondaryDiag) {
            System.out.println("secondary diagonal more than main");
        } else {
            System.out.println("main equals secondary");
        }
        //    4)
        int sumEvenNumbers = 0;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (i + j < twoDimArray.length - 1 && twoDimArray[i][j] % 2 == 0) {
                    sumEvenNumbers += twoDimArray[i][j];
                }
            }
        }
        System.out.println("sum of even numbers  = " + sumEvenNumbers);
        //    5)
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = i + 1; j < twoDimArray[i].length; j++) {
                int temporary = twoDimArray[i][j];
                twoDimArray[i][j] = twoDimArray[j][i];
                twoDimArray[j][i] = temporary;
            }
        }
        System.out.println("transpose array : ");
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
