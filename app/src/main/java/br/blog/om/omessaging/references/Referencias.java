package br.blog.om.omessaging.references;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public final class Referencias {

    private Referencias(){}

    public static DatabaseReference rootReference = FirebaseDatabase.getInstance().getReference();
    public static DatabaseReference usuariosReference = rootReference.child("Usuarios");
    public static DatabaseReference salasReference = rootReference.child("Salas");

}
