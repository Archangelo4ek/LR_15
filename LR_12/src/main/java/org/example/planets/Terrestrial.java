package org.example.planets;

public class Terrestrial extends Planet {
    private boolean atmosphere;

    public Terrestrial(String name, int id, double mass, boolean atmosphere) {
        super(name, id, mass);
        this.atmosphere = atmosphere;
    }

    @Override
    public String toString() {
        return super.toString() + ", атмосфера: " + (atmosphere ? "есть" : "нет");
    }
}
