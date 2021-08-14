package com.xsis;

import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Panjang Deret: ");
        int panjangDeret = input.nextInt();

        int[] kelipatan3 = new int[panjangDeret];
        int[] kelipatan2 = new int[panjangDeret];
        int[] penjumlahan = new int[panjangDeret];

        int awalKelipatanTiga = 3;
        int awalKelipatanDua = -2;

        for (int i = 0; i < panjangDeret; i++) {
            if (awalKelipatanTiga % 3 ==0) {
                kelipatan3[i] = awalKelipatanTiga - 1;
                System.out.print(kelipatan3[i] + " ");
                awalKelipatanTiga +=3;
            }
        }

        System.out.println();

        for (int i = 0; i < panjangDeret; i++) {
            if (awalKelipatanDua % 2 ==0) {
                kelipatan2[i] = awalKelipatanDua * 1;
                System.out.print(kelipatan2[i] + " ");
                awalKelipatanDua -=2;
            }
        }

        System.out.println();

        for (int i = 0; i < panjangDeret; i++) {
            penjumlahan[i] = kelipatan3[i] + kelipatan2[i];
            System.out.print(penjumlahan[i] + " ");
        }
    }
}
