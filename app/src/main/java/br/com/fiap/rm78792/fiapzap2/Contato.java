package br.com.fiap.rm78792.fiapzap2;

public class Contato {

    private  String nome;
    private String telefone;
    private String status;
    private  int img;

    public Contato(String nome, String telefone, String status, int img) {
        this.nome = nome;
        this.telefone = telefone;
        this.status = status;
        this.img = img;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

}