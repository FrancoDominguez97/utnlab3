package utn.obejtos.tp2;

import utn.obejtos.utilities.Utilities;

public class ClientBank {
    private String id = Utilities.generateRandomId(5);
    private String name;
    private char genre;

    public ClientBank(String name, char genre) {
        this.name = name;
        this.genre = genre;
    }

    public ClientBank() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }
}
