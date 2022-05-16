package org.aguzman.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {
        Calculadora cal=new Calculadora();
        String numerador= JOptionPane.showInputDialog("Ingrese un entero numerador:");
        String denomidador= JOptionPane.showInputDialog("Ingrese un entero denominador:");

        try {
            double division2=cal.dividir(numerador,denomidador);
            System.out.println("division2 = " + division2);
        }catch (FormatoNumeroException e){
            System.out.println("Se detecto una excepcion: ingrese un numero valido: "+e.getMessage());
            e.printStackTrace(System.out);
        }
        catch (DivisionPorZeroException ae){
            System.out.println("Capturamos la excepcion en tiempo de ejecucion: "+ ae.getMessage());
            main(args);
        }
        finally {
            System.out.println("Es opcional pero me ejecuto siempre con excepcion o sin! ");

        }
        System.out.println("Continuamos con el flujo de nuestra aplicacion!");

    }
}
