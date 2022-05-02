package utn.obejtos.tp3;

public class Circle1 {
    protected double radio = 1.0;
    protected String color = "red";

    public Circle1(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public Circle1() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calculateArea(){
        return (Math.PI * Math.pow(this.radio, 2));
    }

    @Override
    public String toString() {
        return "Circle1{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}
