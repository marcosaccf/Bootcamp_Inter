package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*Faça um programa que leia 5 números e informe
o maior número e a média desses números
 */
public class EX3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int media = 0;

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero > maior) maior = numero;

            soma += numero;

            count++;
        } while(count < 5);

        System.out.println("Maior: " + maior);

        media = soma / 5;
        System.out.println("Média: " + media);
    }
}
