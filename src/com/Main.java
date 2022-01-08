package com;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Categorie c1 = new Categorie("category1");
        Categorie c2 = new Categorie("category01");
        Categorie c3 = new Categorie("category02");
        Categorie c4 = new Categorie("category03");
        Produit p1 = new Produit("product01");
        Produit p2 = new Produit("product03");

        c1.ajouterComponent(p1);
        c1.ajouterComponent(c2);
        c1.ajouterComponent(c3);
        c3.ajouterComponent(c4);
        c4.ajouterComponent(p2);

        System.out.println(c1.view());

    }
}
