package com;

public interface Component {
    public StringBuilder view();

    public void delete(Component c);

    public int getLevel();

    public void setLevel(int level);

}
