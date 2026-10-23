package org.example.planets;

public class Dwarf extends Planet {
    private int moons;

    public Dwarf(String name, int id, double mass, int moons) {
        super(name, id, mass);
        this.moons = moons;
    }

    @Override
    public String toString() {
        return super.toString() + ", спутников: " + moons;
    }
}