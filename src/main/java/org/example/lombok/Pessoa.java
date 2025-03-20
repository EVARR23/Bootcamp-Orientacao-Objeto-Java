package org.example.lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Pessoa {

    private Long id;
    private String nome;
    private Integer idade;

//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public void setIdade(Integer idade) {
//        this.idade = idade;
//    }
//
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public Integer getIdade() {
//        return idade;
//    }


}

