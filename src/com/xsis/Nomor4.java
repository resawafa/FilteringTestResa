package com.xsis;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Nomor4 {
    public static void main(String[] args) {
        Scanner inputInteger = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        System.out.print("Masukan uang andi: ");
        int uangAndi = inputInteger.nextInt();

        System.out.print("Masukan jumlah barang: ");
        int jumlahBarang = inputInteger.nextInt();

        String[] namaBarang = new String[jumlahBarang];
        int[] hargaBarang = new int[jumlahBarang];

        for (int i = 0; i < jumlahBarang; i++) {
            System.out.print("Masukan nama barang: ");
            namaBarang[i] = inputString.nextLine();

            System.out.print("Masukan harga barang: ");
            hargaBarang[i] = inputInteger.nextInt();
        }


        int i = 0;
        String[] barangBeli = new String[namaBarang.length];
        while (uangAndi >= 0 && i < namaBarang.length) {
            if (uangAndi >= hargaBarang[i]) {
                uangAndi = uangAndi - hargaBarang[i];
                barangBeli[i] = namaBarang[i];
            }
            i++;
        }

        for (int j = 0; j < barangBeli.length; j++) {
            if (barangBeli[j] != null) {
                System.out.print(barangBeli[j] + " ");
            }
        }

    }
}
