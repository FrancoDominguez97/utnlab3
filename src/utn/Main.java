package utn;

import utn.obejtos.tp2.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ClientBank client = new ClientBank("Franco Dominguez", 'M');
        Acount newAcoutn = new Acount(10000, client);
        System.out.println(newAcoutn.extract(1500));
        System.out.println(newAcoutn.toDeposit(500));
        System.out.println(newAcoutn.extract(10000));

        for (String mostrar:
             newAcoutn.getOperations()) {
            if(mostrar!=null)
            System.out.println(mostrar);

        }
    }
}
