package utn.obejtos.tp3;

public class Estudiante extends Persona {
    private double coutaMensual;
    private String carrera;
    private String ingreso;

    public Estudiante(String nombre, String apellido, String mail, String direccion, String dni, double coutaMensual, String carrera, String ingreso) {
        super(nombre, apellido, mail, direccion, dni);
        this.coutaMensual = coutaMensual;
        this.carrera = carrera;
        this.ingreso = ingreso;
    }

    public Estudiante() {
    }

    public double getCoutaMensual() {
        return coutaMensual;
    }

    public void setCoutaMensual(double coutaMensual) {
        this.coutaMensual = coutaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "coutaMensual=" + coutaMensual +
                ", carrera='" + carrera + '\'' +
                ", ingreso='" + ingreso + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", mail='" + mail + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
