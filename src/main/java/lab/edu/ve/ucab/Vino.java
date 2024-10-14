package lab.edu.ve.ucab;

import java.util.Scanner;

public class Vino implements EsLiquido,ConDescuento{
    private String marca; //Listo
    private double precio; //Listo
    private double volumen; //Listo
    private String tipoEnvase; //Listo
    private double precioDescuento; //Listo
    private String tipoDeVino; //Listo
    private double gradoAlcohol; //Listo
    private double calorias;

    Scanner datos = new Scanner(System.in);
    Scanner cadenas = new Scanner(System.in);

    public Vino (String marca,String tipoDeVino,double gradoAlcohol,double precio){
        this.marca=marca;
        this.tipoDeVino=tipoDeVino;
        this.precio=precio;
        this.gradoAlcohol=gradoAlcohol;
        volumen=0.0;
        calorias=0.0;
        tipoEnvase=" ";
        precioDescuento=0.0;
    }

    @Override
    public double getVolumen() { //Pido el volúmen del producto solicitado
        System.out.println("Por favor ingrese el volumen del producto (Decimales con ,): ");
        volumen = cadenas.nextDouble();
        return volumen;
    }


    @Override
    public void setVolumen(double volumen) { //imprimo el valor del Volumen ingresado
        System.out.println("El volumen de su producto es : "+volumen+" metros cubicos");
    }


    @Override
    public String getTipoEnvase() { //Le pido al usuario el tipo de envase del producto y lo retorno
        System.out.println("Por favor ingrese el tipo de envase (Botella, Lata, Magnum, etc.): ");
        tipoEnvase=cadenas.next();
        return tipoEnvase;
    }

    @Override
    public void setTipoEnvase(String tipoEnvase) { //Imprimo el tipo de Envase del producto
        System.out.println("Su producto posee un envase del tipo: " + tipoEnvase);
    }

    @Override
    public double getDescuento() { //Le pido al usuario el porcentaje de descuento de su producto
        double descuento=0.0;
        System.out.print("Por favor ingrese cual es su porcentaje de descuento? (Decimales con ,): %");
        descuento=datos.nextDouble();
        System.out.println(" ");
        System.out.println("Ahora mismo se aplicara el descuento al precio de su producto");
        return descuento;
    }

    @Override
    public void setDescuento(double descuento) { //Aplico el descuento al precio, y lo guardo en un atributo
        descuento=descuento/100;
        precioDescuento=precio*descuento;
        precioDescuento=precio-precioDescuento;
    }

    @Override
    public double getPrecioDescuento() { //Inicializo los métodos de pedir el descuento y aplicarlo
        setDescuento(getDescuento());    //Uno por parámetro para aplicar los datos correspondientes
        return precio=precioDescuento;  //Anexo el PrecioDescuento a precio
    }

    public void pedirOpcionesDescuento(){
        String opcion;
        do{
            System.out.println("¿El producto posee un descuento? Seleccione las alternativas propuestas: ");
            System.out.println(" ");
            System.out.println("1. SI");
            System.out.println(" ");
            System.out.println("2. NO");
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
            getPrecioDescuento();
        }
        else if ("2".equals(opcion)){
            System.out.println("Su precio se mantiene igual");
            System.out.println(" ");
        }
    }

    public void calcularCalorias(){
        calorias=gradoAlcohol*10;
        System.out.println("La cantidad de calorias que posee el vino es de: "+calorias);
    }

    public void tooString() {
        System.out.println("***********CARACTERISTICAS DEL PRODUCTO***********************");
        System.out.println(" ");
        System.out.println("La Marca del vino es : "+marca);
        System.out.println(" ");
        setVolumen(volumen);
        System.out.println(" ");
        setTipoEnvase(tipoEnvase);
        System.out.println(" ");
        System.out.println("El tipo de vino es: "+tipoDeVino);
        System.out.println(" ");
        System.out.println("El grado de alcohol del vino es: "+gradoAlcohol);
        System.out.println(" ");
        calcularCalorias();
        System.out.println(" ");
        System.out.println("El precio de su producto es de: $"+precio);
        System.out.println("**************************************************************");
    }

}
