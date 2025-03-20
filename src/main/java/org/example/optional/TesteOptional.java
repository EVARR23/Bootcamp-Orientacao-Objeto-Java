package org.example.optional;

import org.example.abastratas.Conta;

import java.util.Optional;

public class TesteOptional {

    public static void main(String[] args) {

        Optional<Conta> optionalConta = obtenContaSemErro();


        if (optionalConta.isPresent()){
            System.out.println("Saldo: " + optionalConta.get().getSaldo());
        }else {
            System.out.println("Não foi localizado a conta " );

        }

    }

    public static Conta obtenConta() {
        return null;
    }

    public static Optional<Conta> obtenContaSemErro() {
        return Optional.empty();
    }

}
