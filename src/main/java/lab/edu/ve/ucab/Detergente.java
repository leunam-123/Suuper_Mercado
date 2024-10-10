package lab.edu.ve.ucab;

import java.util.Scanner;

public class Detergente implements EsLiquido {
    private String marca;
    private double precio;
    private double volumen;
    private String tipoEnvase;

    Scanner datos=new Scanner(System.in);
    Scanner cadenas=new Scanner(System.in);

    public Detergente(String marca, double precio){
        volumen=0.0;
        tipoEnvase="";
        this.marca=marca;
        this.precio=precio;
    }

    @Override
    public double getVolumen() {
        System.out.println("Por favor ingrese el volumen del producto: ");
        volumen=cadenas.nextDouble();
        return volumen;
    }

    @Override
    public void setVolumen(double volumen) {
        System.out.println("El volumen de su producto es: "+volumen);
    }


    @Override
    public void setTipoEnvase(String env) {

    }

    @Override
    public String getTipoEnvase() {
        return "";
    }
}
