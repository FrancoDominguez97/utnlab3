package utn.obejtos.tp2;

import utn.obejtos.utilities.Utilities;

public class Client {

    private String id;
    private String name;
    private String email;
    private int descuento;

    public Client(String name, String email, int descuento) {
        this.id = Utilities.generateRandomId(8);
        this.name = name;
        this.email = email;
        this.descuento = descuento;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

}
