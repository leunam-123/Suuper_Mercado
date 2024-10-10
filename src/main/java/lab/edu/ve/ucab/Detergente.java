package lab.edu.ve.ucab;

import java.util.Scanner;

public class Detergente implements EsLiquido {
    private String marca;
    private double precio;
    private double volumen;
    private String tipoEnvase;
    private double descuento;

    Scanner datos = new Scanner(System.in);
    Scanner cadenas = new Scanner(System.in);

    public Detergente(String marca, double precio) {
        volumen = 0.0;
        tipoEnvase = "";
        this.marca = marca;
        this.precio = precio;
    }

    @Override
    public double getVolumen() {
        System.out.println("Por favor ingrese el volumen del producto: ");
        volumen = cadenas.nextDouble();
        return volumen;
    }

    @Override
    public void setVolumen(double volumen) {
        System.out.println("El volumen de su producto es : "+volumen+" metros cubicos");
    }


    @Override
    public String getTipoEnvase() {
        System.out.println("Por favor ingrese el tipo de envase (Grande, pequenio o mediano): ");
        tipoEnvase=cadenas.next();
        return tipoEnvase;
    }

    @Override
    public void setTipoEnvase(String tipoEnvase) {
        System.out.println("Su producto posee un envase: " + tipoEnvase);
    }

    public void aplicarDescuento() {
        double descuento;
        double precioDescuento;
        System.out.print("Por favor ingrese cual es el su porcentaje de descuento?: %");
        descuento=datos.nextDouble();
        System.out.println(" ");
        System.out.println("Ahora mismo se aplicara el descuento al precio de su producto");
        descuento=descuento/100;
        precioDescuento=precio*descuento;
        precio=precio-precioDescuento;
        System.out.println(" ");
    }

    public void pedirDescuento(){
        String opcion;
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
            aplicarDescuento();
        }
        else if ("2".equals(opcion)){
            System.out.println("Su precio se mantiene igual");
            System.out.println(" ");
        }
    }

    public void tooString() {
        System.out.println("***********CARACTERISTICAS DEL PRODUCTO***********************");
        System.out.println(" ");
        System.out.println("La Marca de Detergente consultada es : "+marca);
        System.out.println(" ");
        setVolumen(volumen);
        System.out.println(" ");
        System.out.println("El precio de su producto es de: $"+precio);
        System.out.println(" ");
        setTipoEnvase(tipoEnvase);
        System.out.println("**************************************************************");
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}