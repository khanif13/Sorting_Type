package SortingType;

import java.util.Arrays;
import java.util.Scanner;

class quickSort {

    // Tukar dua elemen
    static void tukar(int[] data, int i, int j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    // Mengambil elemen terakhir sebagai pivot, dan mempartisi array
    static int partition(int[] arr, int low, int high){
        // Variabel pivot diisi dengan elemen terakhir
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // Jika elemen saat ini lebih kecil dari pivot
            if (arr[j] < pivot) {

                // Increment index elemen lebih kecil
                i++;
                tukar(arr, i, j);
            }
        }
        tukar(arr, i + 1, high);
        return (i + 1);
    }

    // Sorting
    static void sort(int[] arr, int low, int high){
        if (low < high) {
            int pi = partition(arr, low, high);

            // Sort secara terpisah element ke kiri dan kanan secara rekursif
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input panjang index : ");
        int[] data = new int[sc.nextInt()];

        for (int i = 0; i < data.length; i++) {
            System.out.print("Input data pada index ke [" + i + "] : ");
            data[i] = sc.nextInt();
        }

        System.out.println("\nIsi data : ");
        System.out.println(Arrays.toString(data));

        sort(data, 0, data.length - 1);
        System.out.println("\nSetelah di sorting : \n" + Arrays.toString(data));
        sc.close();
    }
}
