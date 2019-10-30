package br.blog.om.omessaging.domain;


import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

import java.util.HashMap;

public class Usuario {

    String nome,  id;
    HashMap<String, String> salas;



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
}
