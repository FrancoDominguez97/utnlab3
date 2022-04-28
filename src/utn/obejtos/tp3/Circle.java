package utn.obejtos.tp3;

public class Circle extends Figure{
    private double radio;

    public Circle() {
        this.radio = 1.0;
    }

    public Circle(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculateArea() {
        return (Math.PI * Math.pow(this.radio, 2));
    }

    @Override
    public double calculatePerimeter() {
        return (2 * Math.PI * this.radio);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}
}
