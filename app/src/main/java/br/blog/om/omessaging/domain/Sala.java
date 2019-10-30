package br.blog.om.omessaging.domain;

import com.google.firebase.annotations.PublicApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sala {

    private String nome;
    private HashMap<String, Usuario> usuarios;

    public HashMap<String, Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashMap<String, Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
