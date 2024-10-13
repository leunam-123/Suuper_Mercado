package lab.edu.ve.ucab;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        Scanner cadenas=new Scanner(System.in);
        char opcion;

        //

        do {
            System.out.println("**********MENÚ PARA EL SUPERMARKET**********");
            System.out.println(" ");
            System.out.println("Por favor seleccione alguna de las opciones propuestas para describir algún producto: ");
            System.out.println("1. Detergente");
            System.out.println(" ");
            System.out.println("2. Comida");
            System.out.println(" ");
            System.out.println("3. Vino (Bebidas alcoholicas)");
            System.out.println(" ");
            System.out.println("4. Salir del programa");
            System.out.println(" ");
            opcion=cadenas.next().charAt(0);
            if (opcion!='1' && opcion!='2' && opcion!='3' && opcion!='4') {
                System.out.println(" ");
                System.out.println("ERROR");
                System.out.println("La opcion seleccionada fue: "+opcion);
                System.out.println("Y dicha opción no está dentro de las propuestas anteriormente");
                System.out.println("Intentelo de nuevo.");
            }
        }while (opcion!='1' && opcion!='2' && opcion!='3' && opcion!='4');
            if(opcion=='1'||opcion=='2'||opcion=='3'||opcion=='4'){
                switch(opcion){
                    case '1':
                        System.out.println("Por favor digite los siguientes datos del producto: ");
                        System.out.println(" ");
                        System.out.println("Ingrese la marca del Producto: ");
                        String marca=datos.next();
                        System.out.println("Por favor ingrese el precio del Detergente que desea consultar (decimales con ,): ");
                        double precio=cadenas.nextDouble();
                        Detergente Deter=new Detergente(marca,precio);
                        Deter.getVolumen();
                        Deter.getTipoEnvase();
                        Deter.pedirOpcionesDescuento();
                        Deter.tooString();
                        break;

                    case '2':

                        break;

                    case '3':

                        break;

                    case '4':
                        System.out.println("Gracias por usar el programa! tenga buen dia!");
                        break;

                }
            }


    }
}