package br.com.dio;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Desafio3Album {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTotal = scan.nextInt();
        int numFigCompradas = scan.nextInt();
        Set<Integer> setFig = new HashSet<>();

        for (int i = 0; i < numFigCompradas; i++) {
            setFig.add(scan.nextInt());
        }
        System.out.println(numTotal - setFig.size());
    }
}
