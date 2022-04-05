package utn.obejtos.tp1;

public class Empleado {
    private String name;
    private  String lastName;
    private int salario;
    private int dni;

    public Empleado(String name, String lastName, int salario, int dni) {
        this.name = name;
        this.lastName = lastName;
        this.salario = salario;
        this.dni = dni;
    }

    public Empleado() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    public void mostrarEmpleado(){
        System.out.println("Empleado[dni: " +String.valueOf(dni) + " nombre: " + name + " apellido: " + lastName + " salario: $"+String.valueOf(salario)+"]");
    }

    public int salarioAnual(){
        int salarioAnual;
        salarioAnual = salario*12;
        return salarioAnual;
    }
    public void aumentarSalario(int porcentaje){
        int salarioAumentado;
        int aumento = salario * porcentaje / 100;
        salarioAumentado = salario+aumento;
        this.salario = salarioAumentado;
    }
}
