package utn.obejtos.tp3;

public abstract class Figure {

    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public Figure() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    @Override
    public String toString() {
        return "Figura{" +
                "color='" + color + '\'' +
                '}';
    }
}
