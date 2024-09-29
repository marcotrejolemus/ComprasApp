package com.aluracursos.principal;

import com.aluracursos.calculos.Compra;
import com.aluracursos.modelos.Tarjeta;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba el límite de la tarjeta:");
        double limite = teclado.nextDouble();
        Tarjeta tarjeta = new Tarjeta(limite);

        int opcion;
        System.out.println("*** Escriba 0 para salir 1 para continuar ***.");
        opcion = teclado.nextInt();

        while ( opcion != 0) {
            System.out.println("Escriba la descripcion de la compra");
            String descripcion = teclado.next();
            System.out.println("Escriba el valor de la compra");
            double valor = Double.valueOf(teclado.next());

            Compra compra = new Compra(valor, descripcion);
            boolean compraRealizada = tarjeta.lanzarCompra(compra);

            if (compraRealizada){
                System.out.println("Compra realizada!");
                System.out.println("*** Escriba 0 para salir 1 para continuar ***.");
                opcion = teclado.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                opcion=0;
            }
        }
        System.out.println("******");
        System.out.println("Compras realizadas:\n");
        Collections.sort(tarjeta.getListaDeCompras());
        for (Compra compras: tarjeta.getListaDeCompras()){
            System.out.println(compras.getDescripcion() + " - " + compras.getValor());
        }
        System.out.println("\n******");
        System.out.println("\nSaldo de la tarjeta: " + tarjeta.getSaldo());

    }
}

