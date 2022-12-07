package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    //Найти число локальных минимумов. (Соседями элемента матрицы назовем
    //элементы, имеющие с ним общую сторону или угол. Элемент матрицы называется локальным минимумом, если он строго меньше всех своих соседей.)


    /**
     * Проверяем элемент по индексу на локальный минимум
     * @param indexI строка
     * @param indexJ столбец
     * @param matrix матрица
     * @return true - локальный минимум \ false - не локальный минимум
     */
    public static boolean check(int indexI, int indexJ, int matrix[][]) {
        int N = matrix.length;
        int num = matrix[indexI][indexJ];
        System.out.print("");
        // Рассматриваем соседние элементы
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                int realIndexI = i + indexI;
                int realIndexJ = j + indexJ;

                // проверяем выход за границы массива
                if (realIndexI >= 0 && realIndexI < N && realIndexJ >= 0 && realIndexJ < N && !(i == 0 && j == 0)) {
                    // проверяем что число меньше всех соседей

                    int neighbor = matrix[realIndexI][realIndexJ];
                    if (num >= matrix[realIndexI][realIndexJ]) // Если оно больше хоть одного соседа
                        return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int N = 10;
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        //
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%4d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n\n");
        System.out.println("Локальные минимумы:");
        String del = "#";
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (check(i, j, matrix)) {
                    System.out.printf("%4d ", matrix[i][j]);

                } else {
                    System.out.printf("%4s ", del);

                }
            }
            System.out.println();

        }
    }
}
