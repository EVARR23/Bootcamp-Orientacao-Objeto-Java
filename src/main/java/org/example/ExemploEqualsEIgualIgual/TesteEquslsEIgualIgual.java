package org.example.ExemploEqualsEIgualIgual;

public class TesteEquslsEIgualIgual {

    public static void main(String[] args) {
        String nome1 = "gustavo";
        String nome2 = "gustavo";
        String nome3 = new String("Gustavo");

        System.out.println("(nome1 == nome2): " + (nome1 == nome2));
        System.out.println("(nome1 == nome3): " + (nome1 == nome3));
        System.out.println("nome1.equals(nome2): " + (nome1.equals(nome2)));

    }
}