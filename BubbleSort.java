package SortingType;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    static void sort(int data[]){

        // Looping Iterasi
        for (int i = 0; i < data.length; i++) {
            // Looping mengecek data
            for (int j = 0; j < data.length - 1; j++) {
                int temp; // Variabel menampung

                // Menukar elemen pertama dan elemen di depannya
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp; 
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input jumlah data/index
        System.out.print("Input jumlah data : ");
        int data[] = new int[sc.nextInt()];

        // looping input elemen
        for (int i = 0; i < data.length; i++) {
            System.out.print("Input data per indeks : ");
            data[i] = sc.nextInt();
        }
        
        System.out.println("\nIsi data : \n" + Arrays.toString(data));
        sort(data);
        System.out.println("\nSetelah di sorting : \n" + Arrays.toString(data));

        sc.close();
    }
}
