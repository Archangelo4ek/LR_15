package org.example.planets;

public class GasGiant extends Planet {
    private boolean rings;

    public GasGiant(String name, int id, double mass, boolean rings) {
        super(name, id, mass);
        this.rings = rings;
    }

    @Override
    public String toString() {
        return super.toString() + ", кольца: " + (rings ? "есть" : "нет");
    }
}