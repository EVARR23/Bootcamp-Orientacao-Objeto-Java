package org.example.Switch;

public class TesteSwitch {

    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();
        Conta contaPoupanca = new ContaPoupanca();


        exibeTipoConta(contaCorrente);
//        exibeTipoConta(contaPoupanca);

        exibeTipoContajava21(contaCorrente);
    }

    private static void exibeTipoConta(Conta conta) {
        switch (conta.getTipoConta()){
            case "Conta Corrente":
                System.out.println("E uma conta correntre.");
                break;

            case "Conta comum":
                System.out.println("E uma conta comum");
                break;

            case "Conta Poupanca":
                System.out.println("E uma conta poupanca");
                break;
            default:
            System.out.println("Não identificado o tipo de conta");

        }
    }

    private static void exibeTipoContajava21(Conta conta) {
        String mensagem = switch (conta.getTipoConta()){
            case "Conta Corrente" -> "E uma conta corrente.";
            case "Conta Comum" -> "E uma conta comum.";
            case "Conta Poupanca" -> " E uma conta poupança";
            default -> "Não identificado o tipo de conta";
        };

        System.out.println(mensagem);
    }
}
