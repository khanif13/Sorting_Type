package SortingType;

import java.util.Arrays;
import java.util.Scanner;

class MergeSort {

    // Sorting
    static void sort(int arr[], int l, int r) {
        if (l < r) {
            // Mencari titik tengah untuk divide array
            int m = l + (r - l) / 2;

            // Divide lagi bagian yang sudah divide menggunakan metode rekursif
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge kembali bagian yang sudah di divide lalu di sort
            merge(arr, l, m, r);
        }
    }

    // Merge dua subarray
    // Subarray pertama is data[l..m] dan subarray kedua [m+1..r]
    static void merge(int data[], int left, int mid, int right) {
        // Mencari ukuran subarray yang di merge
        int node1 = mid - left + 1;
        int node2 = right - mid;

        // Temp arrays
        int L[] = new int[node1];
        int R[] = new int[node2];

        // Memasukan data ke dalam temp arrays
        for (int i = 0; i < node1; ++i)
            L[i] = data[left + i];
        for (int j = 0; j < node2; ++j)
            R[j] = data[mid + 1 + j];

        // Menggabungkan temp array kedalam data
        int i = 0, j = 0;
        int k = left;
        while (i < node1 && j < node2) {
            if (L[i] <= R[j]) {
                data[k] = L[i];
                i++;
            } else {
                data[k] = R[j];
                j++;
            }
            k++;
        }

        // Masukkan elemen tersisa dari temp array L[] dan R[]
        while (i < node1) {
            data[k] = L[i];
            i++;
            k++;
        }
        while (j < node2) {
            data[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Input panjang elemen
        System.out.print("Input panjang index : ");
        int data[] = new int[sc.nextInt()];

        // Looping input elemen index
        for (int i = 0; i < data.length; i++) {
            System.out.print("Input index ke " + i + " : ");
            data[i] = sc.nextInt();
        }
        System.out.println("\nIsi data : ");
        System.out.println(Arrays.toString(data));

        sort(data, 0, data.length - 1);

        System.out.println("\nSetelah di sorting");
        System.out.println(Arrays.toString(data));

        sc.close();
    }
}