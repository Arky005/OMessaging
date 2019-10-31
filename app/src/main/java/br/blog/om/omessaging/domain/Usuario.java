package br.blog.om.omessaging.domain;


import java.util.HashMap;

import br.blog.om.omessaging.activities.CadastroActivity;

public class Usuario {

    String nome,  id;
    HashMap<String, String> salas;



    public String[] getArraySalas() {



        return null;
    }

    public HashMap<String, String> getSalas() {
        return salas;
    }

    public void setSalas(HashMap<String, String> salas) {
        this.salas = salas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static Usuario getInstance(){
        return CadastroActivity.getUsuarioAtual();
    }
}
