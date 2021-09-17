package reto_1_java;

import java.util.Scanner;

/**
 *
 * @author PABLO ALEXANDER Q
 */
public class PorcentajeBono {
    
 
 public static double calcularPorcentajeBono(int anio,float bono) { 
    Scanner leer =new Scanner (System.in);
    System.out.println("Ingrese los anios de antiguedad:");
    anio = leer.nextInt();
    bono =500000;
    double porcentaje;
    
    
    if (anio >= 10){
         porcentaje=0.3;
    }
    else if (anio >=5 && anio<10){
         porcentaje=0.2;
    }
    else if(anio >= 3 && anio<5){
         porcentaje =0.1;
    }
    else {
         porcentaje=0.05;
    }
    porcentaje = (porcentaje*bono);
     return porcentaje;
     
}
 
public static void main(String[] args) {
    PorcentajeBono resultado= new PorcentajeBono ();
    double porcentaje= resultado.calcularPorcentajeBono (5,500000); 
    System.out.println("el porcentaje de descuento es: "+porcentaje);
}

    }

