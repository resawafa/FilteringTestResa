package com.xsis;

import java.util.Scanner;

public class Nomor5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        System.out.print("Masukan jam (1-12)/(1-24): ");
        int jam = input.nextInt();
        System.out.print("Masukan menit (0-59): ");
        int menit = input.nextInt();
        System.out.print("Masukan keadaan (AM/PM/24H): ");
        String keadaan = inputString.nextLine();

        String keadaanPagi = "AM";
        String keadaanMalam = "PM";
        String jam24H = "24";
        int konversi= 0;

        if (keadaan.equalsIgnoreCase(keadaanMalam) && jam < 12) {
            konversi = jam + 12;
        } else if (keadaan.equalsIgnoreCase(keadaanPagi) && jam < 12) {
            konversi = jam;
        } else if (keadaan.equalsIgnoreCase(jam24H) && jam > 12) {
            konversi = jam - 12;
        } else if (keadaan.equalsIgnoreCase(jam24H) && jam < 12) {
            konversi = jam;
        }

        System.out.println("jam awal: " + jam + ": " + menit);
        System.out.println("Jam Konversi : "+ konversi + ":" + menit);
    }
}
