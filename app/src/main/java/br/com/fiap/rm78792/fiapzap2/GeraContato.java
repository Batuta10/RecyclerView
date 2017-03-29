package br.com.fiap.rm78792.fiapzap2;

import java.util.ArrayList;
import java.util.List;

public class GeraContato {
    public static List<Contato> listaContatos(){
        List<Contato> contatos = new ArrayList<>();
        contatos.add(new Contato("João","11 9999-9999","Olá",R.drawable.feliz));
        contatos.add(new Contato("Batuta","11 9999-9999","Sé loiro",R.drawable.feliz));
        contatos.add(new Contato("Rafae","11 9999-9999","Éoq",R.drawable.feliz));
        contatos.add(new Contato("Renato","11 9999-9999","KataPrima",R.drawable.feliz));
        contatos.add(new Contato("Yoda","11 9999-9999","KataLoira",R.drawable.feliz));
        contatos.add(new Contato("Fernado","11 9999-9999","Sou monitor!",R.drawable.feliz));
        contatos.add(new Contato("Douglas","11 9999-9999","Eu sou o Douglas voce não é o Douglas!",R.drawable.feliz));

        return contatos;
    }
}
