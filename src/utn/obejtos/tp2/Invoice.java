package utn.obejtos.tp2;

import utn.obejtos.utilities.Utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

// A su vez cada factura posee un monto total, una fecha y el Cliente
//que generó la compra. Para la fecha de la venta se le va a asignar la fecha y hora al
//momento de creación del objeto Factura. El tipo Factura debe contar con un
//método que calcule el monto final luego de aplicarle el descuento que posee el
//cliente
public class Invoice {
    private String id = Utilities.generateRandomId(8);
    private Client client;
    private double total;
    private ItemSell[] items;

    LocalDateTime date = LocalDateTime.now();
    DateTimeFormatter dateFresh = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
    private String hourAndDate = dateFresh.format(date);


    public Invoice(Client client, ItemSell[] items) {
        this.client = client;
        this.items = items;
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

    public ItemSell[] getItems() {
        return items;
    }

    public void setItems(ItemSell[] items) {
        this.items = items;
    }

    public double getTotal() {
        double total = 0;
        for (ItemSell item:
             items) {
            if(item!=null)
                total += item.getPriceUnit();
        }
        return total;
    }

    public String getDate() {
        return hourAndDate;
    }

    public double applyDiscount(){
        double totalWdiscount = getTotal();
        double discount = totalWdiscount * client.getDiscount() /100;
        totalWdiscount -= discount;
        return totalWdiscount;
    }

    @Override
    public String toString() {
        return "Factura[" +
                "id:" + id +
                ", total=" + total +
                ", montoDesc: " + applyDiscount()+" "
                + client.toString() +
                '}';
    }
}
