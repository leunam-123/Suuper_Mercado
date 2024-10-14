package lab.edu.ve.ucab;

import java.time.LocalDate;
import java.util.Scanner;

public class Cereal  implements EsAlimento {
    private String marca;
    private double precio;
    private String tipoDeCereal;
    private LocalDate fechaDeCaducidad;
    private LocalDate fechaActual;
    private int calorias;

    Scanner datos=new Scanner(System.in);
    boolean verdadero=false;

    public Cereal(String marca, double precio, String tipoDeCereal) {
        this.marca = marca;
        this.precio = precio;
        this.tipoDeCereal = tipoDeCereal;
        fechaActual = LocalDate.now();
        calorias=0;
    }

    @Override
    public void setCaducidad(LocalDate fechaDeCaducidad) {
        System.out.println("La fecha de caducidad del producto es: "+fechaDeCaducidad);
        System.out.println(" ");
        System.out.println("La fecha actual es: "+fechaActual);
        System.out.println(" ");
        if (fechaActual.isBefore(fechaDeCaducidad)) {
            verdadero=true;
        }
    }

    @Override
    public LocalDate getCaducidad() {
        int año, mes, dia;
        System.out.println("Ingrese el año de la fecha de caducidad del producto: ");
        año=datos.nextInt();
        System.out.println("Ingrese el mes de la fecha de caducidad del producto: ");
        mes=datos.nextInt();
        System.out.println("Ingrese el dia de la fecha de caducidad del producto: ");
        dia=datos.nextInt();
        fechaDeCaducidad= LocalDate.of(año, mes, dia);
        return fechaDeCaducidad;
    }

    @Override
    public int getCalorias() {
        if (tipoDeCereal.equals("espelta")){
            calorias=5;
        }
        else if (tipoDeCereal.equals("maiz")){
            calorias=8;
        }
        else if (tipoDeCereal.equals("trigo")){
            calorias=12;
        }
        else
        {
            calorias=15;
        }
        return calorias;
    }

    public void tooString() {
        getCalorias();
        setCaducidad(getCaducidad());
        System.out.println("***********CARACTERISTICAS DEL PRODUCTO***********************");
        System.out.println(" ");
        System.out.println("La Marca del Cereal es : "+marca);
        System.out.println(" ");
        System.out.println("El tipo de cereal es de: "+tipoDeCereal);
        System.out.println(" ");
        if (verdadero==true){
            System.out.println("La fecha actual es: "+fechaActual);
            System.out.println(" ");
            System.out.println("La fecha de caducidad es: "+fechaDeCaducidad);
            System.out.println(" ");
            System.out.println("El producto esta Vigente actualmente");
        }
        else
        {
            System.out.println("La fecha actual es: "+fechaActual);
            System.out.println(" ");
            System.out.println("La fecha de caducidad es: "+fechaDeCaducidad);
            System.out.println(" ");
            System.out.println("El producto ya ha expirado");
        }
        System.out.println(" ");
        System.out.println("Las Calorias que ofrece el producto es de: "+calorias+" Kcal");
        System.out.println(" ");
        System.out.println("El precio de su producto es de: $"+precio);
        System.out.println(" ");
        System.out.println("**************************************************************");
    }
}
