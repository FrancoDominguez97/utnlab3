package utn.obejtos.tp2;

import utn.obejtos.utilities.Utilities;

public class Client {

    private String id;
    private String name;
    private String email;
    private int discount;

    public Client(String name, String email, int discount) {
        this.id = Utilities.generateRandomId(8);
        this.name = name;
        this.email = email;
        this.discount = discount;
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

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String showClient(){
        return "Cliente[id: " + id +
                " nombre: " + name +
                " email: " + email +
                " descuento: " + discount + ']';
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", discount=" + discount +
                '}';
    }
}
