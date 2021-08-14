package com.xsis;

import java.util.Scanner;

public class Nomor7 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        System.out.print("Libur Marry: ");
        int liburMarry = input.nextInt();

        System.out.print("Libur Susan: ");
        int liburSusan = input.nextInt();

        System.out.print("Libur Bareng Terakhir: ");
        String liburBarengTerakhir = inputString.nextLine();


    }
}
