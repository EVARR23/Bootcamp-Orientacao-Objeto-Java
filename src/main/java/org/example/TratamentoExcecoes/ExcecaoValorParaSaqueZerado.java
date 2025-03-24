package org.example.TratamentoExcecoes;

public class ExcecaoValorParaSaqueZerado extends Exception{

    public String getMessage() {
        return "valor para saque não pod ser zero";
    }
}
