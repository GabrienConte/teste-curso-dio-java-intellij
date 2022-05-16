package br.com.dio;

// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Desafio2Coxinha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int p = scan.nextInt();

        double media = (double)h / (double)p;
        System.out.println(media);
    }
}
