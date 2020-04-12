package cresla.entities.modules;

import cresla.interfaces.Module;

public abstract class Modules implements Module {

    private int id;

    Modules(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(String.format("%s Module – %d",this.getClass().getSimpleName(),this.getId()));
        sb.append(System.lineSeparator());

        return sb.toString();
    }
}
