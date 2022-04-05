package utn.obejtos.tp1;

public class ItemDeVenta {
    private int id;
    private  int amount;
    private  int priceUnit;
    private String description;

    public ItemDeVenta(int id, int amount, int priceUnit, String description) {
        this.id = id;
        this.amount = amount;
        this.priceUnit = priceUnit;
        this.description = description;
    }

    public ItemDeVenta() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPriceUnit() {
        return priceUnit;
    }

    public void setPrice(int priceUnit) {
        this.priceUnit = priceUnit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public int getPriceTotal(){
        return amount*priceUnit;
    }
    public void showItem(){
        System.out.println(
               "Item Sell \n[ID: "+String.valueOf(id) +
               " \nDescripcion: " + description +
               " \nCantidad: " + String.valueOf(amount) +
               " \nPrecio Unitario: $" + String.valueOf(priceUnit) +
               " \nPrecio Total: $" + String.valueOf(getPriceTotal())+"]");
    }

}
