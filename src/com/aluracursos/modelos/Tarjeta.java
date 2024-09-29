package com.aluracursos.modelos;

import com.aluracursos.calculos.Compra;

import java.util.ArrayList;
import java.util.List;

public class Tarjeta{
    private double limite;
    private double saldo;
    private List<Compra> listaDeCompras;

    public Tarjeta(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompras = new ArrayList<>();
    }

    public boolean lanzarCompra(Compra compra){
        if(this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.listaDeCompras.add(compra);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }

    public void setListaDeCompras(List<Compra> listaDeCompras) {
        this.listaDeCompras = listaDeCompras;
    }



//    public void setCompraValor(double compraValor) {
//        this.compraValor = compraValor;
//        if (saldo < compraValor){
//            System.out.println("Saldo insuficiente!");
//        } else {
//            this.saldo = saldo - compraValor;
//        }
//    }
}
