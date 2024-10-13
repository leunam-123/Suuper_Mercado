package lab.edu.ve.ucab;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        Scanner cadenas=new Scanner(System.in);
        String opcion=" ";

        System.out.println("Por favor ingrese la marca del Detergente que desea consultar: ");
        String marca=datos.next();
        System.out.println("Por favor ingrese el precio del Detergente que desea consultar: ");
        double precio=cadenas.nextDouble();

        Detergente Deter=new Detergente(marca,precio);
        Deter.getVolumen();
        Deter.getTipoEnvase();

        do{
            System.out.println("¿Posee usted un descuento? Seleccione las alternativas propuestas: ");
            System.out.println(" ");
            System.out.println("1. Poseo descuento");
            System.out.println(" ");
            System.out.println("2. No poseo descuento");
            opcion=cadenas.next();
            if (!"1".equals(opcion) && !"2".equals(opcion)){
                System.out.println(" ");
                System.out.println("ERROR");
                System.out.println("La opcion seleccionada fue: "+opcion);
                System.out.println("Y dicha opción no está dentro de las propuestas anteriormente");
                System.out.println("Intentelo de nuevo.");
            }
        }while (!"1".equals(opcion) && !"2".equals(opcion));
        if ("1".equals(opcion)){
            Deter.getPrecioDescuento();
        }
        else if ("2".equals(opcion)){
            System.out.println("Su precio se mantiene igual");
            System.out.println(" ");
        }
        Deter.tooString();
    }
}