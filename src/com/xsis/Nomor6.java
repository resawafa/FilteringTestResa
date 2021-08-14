package com.xsis;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Nomor6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Kalimat ");
        String kalimat = input.nextLine();

        kalimat = kalimat.toLowerCase();

        char[] huruf = kalimat.toCharArray();

        Arrays.sort(huruf);
        System.out.print("Huruf Vokal: ");

        for (int i = 0; i < huruf.length; i++) {
            if (huruf[i] == 'a' || huruf[i] == 'i' || huruf[i] == 'u' || huruf[i] == 'e' || huruf[i] == 'o') {
                System.out.print(huruf[i]);
            }
        }

        System.out.println();
        System.out.print("Huruf Konsonan: ");

        for (int i = 0; i < huruf.length; i++) {
            if (huruf[i] != 'a' && huruf[i] != 'i' && huruf[i] != 'u' && huruf[i] != 'e' && huruf[i] != 'o') {
                System.out.print(huruf[i]);
            }
        }

    }
}
