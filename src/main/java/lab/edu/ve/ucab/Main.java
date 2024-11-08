package lab.edu.ve.ucab;

import java.util.Scanner;

/**
 *
 * @Manuel.AR
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        Scanner cadenas=new Scanner(System.in);
        String marca;
        double precio;
        char opcion;

        //

        do {
            System.out.println("\033[33m**********MENÚ PARA EL SUPERMARKET**********");
            System.out.println(" ");
            System.out.println("\033[35mPor favor seleccione alguna de las opciones propuestas para describir algún producto: ");
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
                System.out.println("\033[31mERROR");
                System.out.println("La opcion seleccionada fue: "+opcion);
                System.out.println("Y dicha opción no está dentro de las propuestas anteriormente");
                System.out.println("Intentelo de nuevo.");
            }
        }while (opcion!='1' && opcion!='2' && opcion!='3' && opcion!='4');
        switch (opcion) {
            case '1':
                System.out.println("\033[35mPor favor digite los siguientes datos del producto: ");
                System.out.println(" ");
                System.out.println("Ingrese la marca del Producto: ");
                marca = cadenas.next();
                System.out.println("Por favor ingrese el precio del Detergente que desea consultar (decimales con ,): ");
                precio = datos.nextDouble();
                Detergente Deter = new Detergente(marca, precio);
                Deter.getVolumen();
                Deter.getTipoEnvase();
                Deter.pedirOpcionesDescuento();
                Deter.tooString();
                break;

            case '2':

                System.out.println("Por favor digite los siguientes datos del producto: ");
                System.out.println(" ");
                System.out.println("Ingrese la marca del Producto: ");
                marca = cadenas.next();
                System.out.println("Por favor ingrese el precio del Producto (Decimales con ,): ");
                precio = datos.nextDouble();
                System.out.println("Por favor ingrese alguno de los tipos de cereales presentados: ");
                System.out.println(" ");
                System.out.println("* Cereal Espelta");
                System.out.println(" ");
                System.out.println("* Cereal de Maiz");
                System.out.println(" ");
                System.out.println("* Cereal de Trigo");
                System.out.println(" ");
                System.out.println("* Otro (Especificar)");
                String cereal = cadenas.next().toLowerCase();
                if (cereal.equals("espelta")) {
                    Cereal cere = new Cereal(marca, precio, cereal);
                    cere.tooString();
                } else if (cereal.equals("maiz")) {
                    Cereal cere = new Cereal(marca, precio, cereal);
                    cere.tooString();
                } else if (cereal.equals("trigo")) {
                    Cereal cere = new Cereal(marca, precio, cereal);
                    cere.tooString();
                } else {
                    Cereal cere = new Cereal(marca, precio, cereal);
                    cere.tooString();
                }

                break;

            case '3':
                System.out.println("Por favor digite los siguientes datos del producto: ");
                System.out.println(" ");
                System.out.println("Ingrese la marca del Producto: ");
                marca = cadenas.next();
                System.out.println("Por favor ingrese el precio del Producto (Decimales con ,): ");
                precio = datos.nextDouble();
                System.out.println("Por favor ingrese el tipo de Vino: ");
                String tipoDeVino = cadenas.next();
                System.out.println(" ");
                System.out.println("Ingrese el grado del Alcohol del producto: ");
                double grado = datos.nextDouble();
                Vino vin = new Vino(marca, tipoDeVino, grado, precio);
                vin.getVolumen();
                vin.getTipoEnvase();
                vin.pedirOpcionesDescuento();
                vin.tooString();
                break;

            case '4':
                System.out.println("\033[36mGracias por usar el programa! tenga buen dia!");
                break;

        }


    }
}