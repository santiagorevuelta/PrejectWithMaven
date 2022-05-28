package com.tdea;

import javax.swing.JOptionPane;

public class Invitado {
	private Consumo[] consumos;
	private String nombre;
        
        
	public Invitado() {
		this.consumos = new Consumo[20];
		this.nombre = JOptionPane.showInputDialog(null, "Ingrese nombre del invitado","Invitado",JOptionPane.INFORMATION_MESSAGE);
	}

        public Consumo[] getConsumos() {
            return consumos;
        }

       public void setConsumos(Consumo consumos) {
            boolean guardado = false;
                for(int i =0; i<this.consumos.length; i++){
                    if(this.consumos[i] == null ){
                        this.consumos[i] = consumos;
                        guardado = true;
                    }
                }
            if(!guardado){
                JOptionPane.showMessageDialog(null, "No se puede registrar otro consumo","Failure",JOptionPane.ERROR_MESSAGE);
            }
        }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

        @Override
        public String toString() {
            return " Nombre= " + nombre ;
        }
        
}
