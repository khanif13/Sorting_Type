package SortingType;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    
    static void sort(int data[]){

        
        for (int i = 1; i < data.length; i++) {
            // Key menampung nilai pertama
            int key = data[i];
            int j = i - 1;

            // Looping mencari dan memindah elemen yang lebih besar dari key ke satu posisi didepan nya
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah data/index
        System.out.print("Input panjang indeks : ");
        int data[] = new int[sc.nextInt()];

        // Looping input elemen
        for (int i = 0; i < data.length; i++) {
            System.out.print("Input elemen indeks : ");
            data[i] = sc.nextInt();
        }
        
        System.out.println("\nIsi data : \n" + Arrays.toString(data));
        sort(data);
        System.out.println("\nSetelah di sorting : \n" + Arrays.toString(data));

        sc.close();
    }
}
