package utn.obejtos.tp2;

import utn.obejtos.utilities.Utilities;

public class ItemSell {
    private String id;
    private String name;
    private String description;
    private double priceUnit;

    public ItemSell(String name, String description, double priceUnit) {
        this.id = Utilities.generateRandomId(5);
        this.name = name;
        this.description = description;
        this.priceUnit = priceUnit;
    }

    public ItemSell() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(double priceUnit) {
        this.priceUnit = priceUnit;
    }
}
