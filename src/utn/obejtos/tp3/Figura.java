package utn.obejtos.tp3;

public abstract class Figura {

    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public Figura() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        return "Figura{" +
                "color='" + color + '\'' +
                '}';
    }
}
