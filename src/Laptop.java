import java.util.*;

public class Laptop {
    private int operMemory;
    private int hardDisc;
    private String system;
    private String color;

    public int getOperMemory() {
        return operMemory;
    }

    public int getHardDisc() {
        return hardDisc;
    }

    public String getSystem() {
        return system;
    }

    public String getColor() {
        return color;
    }

    public void setOperMemory(int memory) {
        this.operMemory = memory;
    }

    public void setHardDisc(int hardDisc) {
        this.hardDisc = hardDisc;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Laptop(int operMemory, int hardDisc, String system, String color) {
        this.operMemory = operMemory;
        this.hardDisc = hardDisc;
        this.system = system;
        this.color = color;
    }

    public String toString() {
        return "RAM: " + operMemory + ", Hard Disc: " + hardDisc + ", Operating System: " + system + ", Colour: " + color;
    }

}


