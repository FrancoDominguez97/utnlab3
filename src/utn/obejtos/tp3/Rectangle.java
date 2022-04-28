package utn.obejtos.tp3;

public class Rectangle extends Figure{
    protected double width;
    protected double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (this.width*this.height);
    }
    @Override
    public double calculatePerimeter(){
        return (2 * (this.width + this.height));

    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + width +
                ", altura=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
