package com.xsis;

import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jarak: ");
        String jarak = input.nextLine();

        Double[] jarakAntarToko = {0.5, 2.0, 3.5,5.0};
//        for (int i = 0; i < jarakAntarToko.length; i++) {
//            System.out.print(jarakAntarToko[i]+ " ");
//        }

        int kecepatan = 30;
        double totalJarak =0;
        double waktuTempuh =0;
        String[] arrayJarakToko = jarak.split("-");
        Double[] jarakToko = new Double [arrayJarakToko.length];

        for (int i = 0; i < jarakToko.length; i++) {
            jarakToko[i] = Double.parseDouble(arrayJarakToko[i]);
            totalJarak =  totalJarak + jarakToko[i];
        }

        System.out.println("Total Jarak: " + totalJarak + " KM");
        waktuTempuh = ((double) totalJarak / (double) kecepatan) * 60;
        waktuTempuh = waktuTempuh + (10 * jarakToko.length);
        System.out.println("Waktu Tempuh: " + (int) waktuTempuh + " menit");

    }
}
