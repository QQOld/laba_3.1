package Base;

import java.util.Scanner;
import Base.classes.*;

public class Main {

    public static void main(String[] args) {
        Addition add = new Addition();
        Multiplication mult = new Multiplication();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int n = in.nextInt();
        int[] mas = new int[n];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = in.nextInt();
        }
        System.out.println("Сумма элементов массива: " + add.fold(mas));
        System.out.println("Произведение элементов массива: " + mult.fold(mas));
    }
}
