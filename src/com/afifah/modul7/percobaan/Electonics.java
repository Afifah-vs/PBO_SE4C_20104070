package com.Afifah.modul7.percobaan;

public class Electonics {
    private String name;
    private boolean isActivated = false;

    //Overloading tanpa parameter
    public Electonics() {
        this.name = "A Device";
        System.out.println(this.getName() + " has been spawned!");
    }

    //Overloading dengan parameter
    public Electonics(String name) {
        this.name = name;
        System.out.println(this.getName() + " has been spawned!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void activate() {
        this.isActivated = true;
        System.out.println(this.getName() + " has been activated!");
        this.onActivate();
    }

    public void deactivate() {
        this.isActivated = false;
        System.out.println(this.getName() + " has been deactivated!");
        this.onDeactivate();
    }

    public void onActivate() {}
    public void onDeactivate() {}
}



