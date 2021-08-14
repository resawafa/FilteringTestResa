package com.xsis;

import java.util.Scanner;

public class Nomor8 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Teks: ");
        String kalimat = input.nextLine();

        String[] kalimatPisah = kalimat.split(" ");
        String[] hasil = new String[kalimatPisah.length];

        for (int i = 0; i < kalimatPisah.length; i++) {
            char[] kata = kalimatPisah[i].toCharArray();
            for (int j = 0; j < kata.length; j++) {
                if ((j > 0) && (j < (kata.length - 1)))
                {
                    kata[j] = '*';
                }
            }
            hasil[i] = String.valueOf(kata);
        }

        for (int i = 0; i < hasil.length; i++) {
            System.out.print(hasil[i] + " ");
        }

    }
}
