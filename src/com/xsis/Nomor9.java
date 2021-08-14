package com.xsis;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Nomor9 {
    public static void main (String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.print("input huruf: ");
//        String inputHuruf = input.nextLine();
//        char[] inputHurufArray =inputHuruf.toCharArray();
//
//        for (int i = 0; i < inputHurufArray.length ; i++) {
//            System.out.print(inputHurufArray[i] + " ");
//        }
//
//        System.out.print("input bobot: ");
//        String inputBobot = input.nextLine();
//        char[] inputBobotArray = inputBobot.toCharArray();
//        for (int i = 0; i < inputBobotArray.length ; i++) {
//            System.out.print(inputBobotArray[i] + " ");
//        }

        char[] huruf = new char[26];
        int[] bobot = new int[26];
        for (int i = 0; i <26; i++) {
            huruf[i] = (char) ('a' + i);
            System.out.print(huruf[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < bobot.length; i++) {
            bobot[i] = i + 1;
        }
//        Map<String, Integer> map = new TreeMap<>();
//
//        for (int i = 0; i < 26; i++) {
//            map.put((char)huruf[i],bobot[i]);
//        }
//
//        boolean hasil = false;
//
//        for (int i = 0; i < huruf.length; i++) {
//            for (int j = 0; j < bobot.length; j++) {
//                if (huruf[i] == bobot[j]){
//                    hasil = true;
//                }
//            }
//        }
    }
}
