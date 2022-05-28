/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tdea;

import javax.swing.JOptionPane;

/**
 *
 * @author Ale-isa
 */
public class Factura {

    private String _concepto;
    private double _valor;
    private boolean _cancelado;
    private Consumo[] _consumos;
    private double montoConsumoTemp;
    private double fondo;
    
    public Factura(double fondo) {
        montoConsumoTemp=0;
        this.fondo =fondo;
        this._consumos = new Consumo[20];
        boolean salir = false;
        boolean consumoRegistrado = false;
        while(!salir){
            for(int i =0;i<_consumos.length;i++){
                if(_consumos[i]==null){
                    Double monto = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el valor del Consumo","CONSUMO",JOptionPane.INFORMATION_MESSAGE));

                    if((this.fondo-monto)<0){
                        JOptionPane.showMessageDialog(null, "No se puede registrar el consumo, no tiene monto suficiente","FACTURA",JOptionPane.ERROR_MESSAGE);
                    }else{
                        this.fondo =this.fondo-monto;
                        Consumo consumo = new Consumo(monto);
                        setConsumos(consumo);
                        this._valor =this._valor + consumo.getMonto();
                        this.montoConsumoTemp = consumo.getMonto();
                        consumoRegistrado = true;
                    }
                    
                    break;
                }
            }
            if(!consumoRegistrado){
                JOptionPane.showInputDialog(null,"No se pudo ingresar el consumo, es posible que no tenga fondos suficientes","Factura",JOptionPane.INFORMATION_MESSAGE);
            }
            
            String canc = JOptionPane.showInputDialog(null, "QUE DESEA?\n"
                    + "1. Registrar otro consumo\n"
                    + "2. Pagar factura\n"
                    + "3. Salir y pagar despues","FACTURA",JOptionPane.INFORMATION_MESSAGE);
            switch (canc) 
            {
                case "1": 
                {  
                   
                   break;
                }
                case "2": 
                {
                    _cancelado =true;
                    salir=true;
                    break;
                }
                case "3": 
                {
                    salir=true;
                    break;
                }
            }
        }
        this._concepto = JOptionPane.showInputDialog(null,"por que concepto ingresa la factura","Factura",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public String getConcepto() {
        return _concepto;
    }

    public void setConcepto(String _concepto) {
        this._concepto = _concepto;
    }

    public double getFondo() {
        return fondo;
    }

    public void setFondo(double fondo) {
        this.fondo = fondo;
    }
    
    public double getValor() {
        return _valor;
    }

    public void setValor(double _valor) {
        this._valor = _valor;
    }

    public boolean isCancelado() {
        return _cancelado;
    }

    public void setCancelado(boolean _cancelado) {
        this._cancelado = _cancelado;
    }


    public void setConsumos(Consumo[] _consumos) {
        this._consumos = _consumos;
    }
 
     public Consumo[] getConsumos()
    {
        return _consumos;
    }

    public int getTotalConsumos()
    {
            int total = 0;
            for(int i=0;i<_consumos.length;i++){
                if(_consumos[i] !=null){
                    total = total +1;
                }
            }
            return total;
        }
               
    public void setConsumos(Consumo consumos) {
        for(int i=0;i<_consumos.length;i++){
            if(_consumos[i] == null){
                 this._consumos[i] = consumos;
                 break;        
            }
        }

    }
    
    public void registrarConsumo(double consumo){
        if(cantidadConsumo()<20)
        {   
            for(int i =0; i<_consumos.length;i++){
                if(_consumos[i] == null){
                     _consumos[i] = new Consumo(consumo);
                     JOptionPane.showMessageDialog(null, "Se agregó el consumo a la factura "+ getConcepto()+", al usuario","FACTURA",JOptionPane.INFORMATION_MESSAGE);
                     break;
                }
            }
        }
         else{
            JOptionPane.showMessageDialog(null, "ya no hay mas cupos para socios VIP","FACTURA",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public int cantidadConsumo(){
        int cantidad =0;
        for(int i =0; i< _consumos.length;i++){
            if(_consumos[i]!=null){
                cantidad ++;
            }
        }
        return cantidad;
    }
}
