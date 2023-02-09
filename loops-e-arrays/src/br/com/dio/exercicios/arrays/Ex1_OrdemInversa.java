package br.com.dio.exercicios.arrays;
/*
Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.
 */
public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, 0, 15, 50, 8, 4};
        int count = vetor.length - 1;

        System.out.print("Vetor: ");

        while(count >= 0) {
            System.out.print(vetor[count] + " ");
            count--;
        }

        System.out.print("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
