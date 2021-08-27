package com.cursoEmVideo;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String usuario) {
        super(nome, idade, sexo);
        this.login = usuario;
        this.totAssistido = 0;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() +
                "\nlogin='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

}
