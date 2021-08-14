package com.xsis;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Nomor3 {
    public static void main (String[] args) {
        Scanner inputInteger = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        System.out.print("Masukan panjang array: ");
        int panjangArray = inputInteger.nextInt();

        HashMap<String, Integer> summary = new HashMap<>();
        String[] arrayBuah = new String[panjangArray];
        int[] arrayJumlah = new int[panjangArray];

        for (int i = 0; i < panjangArray; i++) {
            System.out.print("Masukan nama buah: ");
            arrayBuah[i] = inputString.nextLine();
            System.out.print("Masukan jumlah penjualan: ");
            arrayJumlah[i] = inputInteger.nextInt();
        }

        for (int i = 0; i < panjangArray; i++) {
            int angka = arrayJumlah[i];
            summary.computeIfPresent(arrayBuah[i], (k, v) -> v + angka);
            summary.putIfAbsent(arrayBuah[i],arrayJumlah[i]);
        }
        Map<String, Integer> sortedMap = new TreeMap<>(summary);
        sortedMap.entrySet().forEach(System.out::println);
    }
}
