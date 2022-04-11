package utn;

import utn.obejtos.tp2.*;
import utn.obejtos.tp3.Estudiante;
import utn.obejtos.tp3.Persona;
import utn.obejtos.tp3.Staff;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Estudiante franco = new Estudiante("Franco", "Dominguez", "fran@gmail.com", "mar del plata", "40735036",3410,"programacion","2021");
        Estudiante agustin = new Estudiante("Agustin", "Dominguez", "fran@gmail.com", "mar del plata", "40735036",3410,"programacion","2021");
        Estudiante nahuel = new Estudiante("Nahuel", "Dominguez", "fran@gmail.com", "mar del plata", "40735036",3410,"programacion","2021");
        Estudiante martin = new Estudiante("Martin", "Dominguez", "fran@gmail.com", "mar del plata", "40735036",3410,"programacion","2021");

        Staff s1 = new Staff("34654124", "Humberto", "Perez", "beto@email.com", "1234", 21200.75, 'M');
        Staff s2 = new Staff("34654124", "Humberto", "Perez", "beto@email.com", "1234", 21200.75, 'M');
        Staff s3 = new Staff("34654124", "Humberto", "Perez", "beto@email.com", "1234", 21200.75, 'M');
        Staff s4 = new Staff("34654124", "Humberto", "Perez", "beto@email.com", "1234", 21200.75, 'M');
        Staff s5 = new Staff("34654124", "Humberto", "Perez", "beto@email.com", "1234", 21200.75, 'M');
        Persona[] institucion = new Persona[]{franco,agustin,nahuel,martin,s1,s2,s3,s4,s5};
        int countEstudiante = 0;
        int countStaff = 0;
        double total = 0;

        for (Persona persona: institucion) {
            if(persona!=null) {
                if (persona instanceof Estudiante) {
                    countEstudiante++;
                    total += ((Estudiante) persona).getCoutaMensual();
                }
                if (persona instanceof Staff)
                    countStaff++;
            }
        }
        System.out.println("La cantidad de Estudiantes: " + countEstudiante + "\nLa cantidad de Staff: " + countStaff);
        System.out.println("El total de las coutas que recibe de los estudiantes es: $" + total);

    }
    
}
