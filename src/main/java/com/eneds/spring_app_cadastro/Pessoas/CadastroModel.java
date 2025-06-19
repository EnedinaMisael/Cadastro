package com.eneds.spring_app_cadastro;

import jakarta.persistence.*;

import java.util.List;


// entity transforma uma classe em uma entidade do db
@Entity
@Table(name = "tb_cadastro")
public class CadastroModel {
    // como faco para mostrar para o java preencher o id
    // com anotacao ID

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)// para gerar id sequencial
    private Long id;
    private String nome;
    private String email;
    private int idade;
    private List<TarefasModel> tarefas;


    // abaixo os contrutores
    public CadastroModel(){

    }

    public CadastroModel(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }


    //getters end setters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
