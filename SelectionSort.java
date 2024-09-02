package SortingType;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    static void sort(int data[]){
        for (int i = 0; i < data.length - 1; i++) {

            // Traverse mencari elemen minimum
            int min_index = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[min_index]) {
                    min_index = j;
                }
            }

            // Menukar elemen minimum yang ditemukan menjadi elemen pertama
            int temp = data[min_index];
            data[min_index] = data[i];
            data[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input banyak data/index
        System.out.print("Input panjang index : ");
        int data[] = new int[sc.nextInt()];
        
        // Input isi index
        for (int i = 0; i < data.length; i++) {
            System.out.print("Input elemen : ");
            data[i] = sc.nextInt();
        }

        System.out.println("\nIsi data : \n" + Arrays.toString(data));
        sort(data);
        System.out.println("\nSetelah di sorting : \n" + Arrays.toString(data));

        sc.close();
    }
}
