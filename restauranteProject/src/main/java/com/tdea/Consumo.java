package com.tdea;

import javax.swing.JOptionPane;

public class Consumo {

	private String concepto;
	private double monto;
	private String nombre;

        public Consumo(double monto) {
        this.concepto = JOptionPane.showInputDialog("Ingrese el concepto","CONSUMO");
        this.monto = monto;
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre","CONSUMO");
    }
	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
