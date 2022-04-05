package utn;

import utn.obejtos.tp2.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Client cliente = new Client("Franco", "fran@gmail.com",15);
        System.out.println(cliente.getId());
        Invoice factura = new Invoice(cliente, 5000);
        factura.applyDiscount();
        System.out.println(factura.getTotal());



    }
}
