package com;

public class Produit implements Component {
    private String name;
    private int level;

    public Produit(String name) {
        this.name = name;
        this.level = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public StringBuilder view() {
        StringBuilder res = new StringBuilder();
        res.append(name);
        return res;
    }

    @Override
    public void delete(Component c) {

    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }
}
