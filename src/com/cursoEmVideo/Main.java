package com.cursoEmVideo;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 POO");
        v[1] = new Video("Aula 15 PHP");
        v[2] = new Video("Aula 30 Java");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzinha");

        Vizualizacao vis[] = new Vizualizacao[5];
        vis[0] = new Vizualizacao(g[0], v[2]); // Jubileu assiste Aula 30 Java
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Vizualizacao(g[0],v[1]);
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString()); //Jubileu assiste Aula 15 PHP
    }



}
