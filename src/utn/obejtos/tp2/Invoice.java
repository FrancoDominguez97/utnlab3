package utn.obejtos.tp2;

import utn.obejtos.utilities.Utilities;

import java.time.LocalDateTime;

// A su vez cada factura posee un monto total, una fecha y el Cliente
//que generó la compra. Para la fecha de la venta se le va a asignar la fecha y hora al
//momento de creación del objeto Factura. El tipo Factura debe contar con un
//método que calcule el monto final luego de aplicarle el descuento que posee el
//cliente
public class Invoice {
    private String id;
    private Client client;
    private double total;
    private LocalDateTime date;

    public Invoice(Client client, double total) {
        this.id = Utilities.generateRandomId(8);
        this.client = client;
        this.total = total;
        this.date = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void applyDiscount(){
        double discount = total * client.getDescuento() / 100;
        this.total -= discount;
    }
}
