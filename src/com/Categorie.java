package com;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Component {
    private String name;
    private List<Component> components;
    private int level;

    public Categorie(String name) {
        this.components = new ArrayList<>();
        this.name = name;
    }

    public Categorie(String name, int level) {
        this.components = new ArrayList<>();
        this.name = name;
        this.level = level;
    }

    public Categorie(String name, List<Component> components) {
        this.name = name;
        this.components = new ArrayList<>();
        this.components.addAll(components);
    }

    public void ajouterComponent(Component component) {
        int new_level = this.level + 1;
        component.setLevel(new_level);
        this.components.add(component);
    }

    @Override
    public StringBuilder view() {
        StringBuilder res = new StringBuilder();
        res.append(this.getName());
        for (Component c : this.components) {
            System.out.println(c.getLevel());
            res.append("\n");
            res.append("\t".repeat(c.getLevel() + 1));
            res.append(c.view());
        }
        return res;
    }

    @Override
    public void delete(Component c) {
        components.remove(c);
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
