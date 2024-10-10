package lab.edu.ve.ucab;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        Scanner cadenas=new Scanner(System.in);

        System.out.println("Por favor ingrese la marca del Detergente que desea consultar: ");
        String marca=datos.next();
        System.out.println("Por favor ingrese el precio del Detergente que desea consultar: ");
        double precio=cadenas.nextDouble();

        Detergente Deter=new Detergente(marca,precio);
        Deter.getVolumen();
        Deter.getTipoEnvase();
        Deter.pedirDescuento();
        Deter.tooString();
    }
}