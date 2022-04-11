package utn.obejtos.tp3;

public class Staff extends Persona{
    private double salario;
    private char turno;

    public Staff(String nombre, String apellido, String mail, String direccion, String dni, double salario, char turno) {
        super(nombre, apellido, mail, direccion, dni);
        this.salario = salario;
        this.turno = turno;
    }

    public Staff() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public double getSalarioAnual(){
        return salario*12;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", mail='" + mail + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dni='" + dni + '\'' +
                ", salario=" + salario +
                ", turno='" + turno + '\'' +
                '}';
    }
}
