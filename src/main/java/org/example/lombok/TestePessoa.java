package org.example.lombok;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa pessoaJulia = new Pessoa();

        pessoaJulia.setId(1L);
        pessoaJulia.setNome("Julia");
        pessoaJulia.setIdade(26);

        System.out.println("id: " + pessoaJulia.getId());
        System.out.println("Nome: " + pessoaJulia.getNome());
        System.out.println("idade: " + pessoaJulia.getIdade());

        System.out.println(pessoaJulia);
    }
}
