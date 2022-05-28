package com.tdea;

import javax.swing.JOptionPane;

public class Socio {

	private Factura[] _factura;
	private Invitado[] _invitados;
	private String _cedula;
	private String _nombre;
        private String _tipoSuscripcion;
        private double _fondo;
        
        
	public Socio(String cedula, String tipoSuscripcion) {
            this._factura = new Factura[5];
            this._invitados = new Invitado[10];
            this._cedula = cedula;
            this._nombre = JOptionPane.showInputDialog(null, "Ingrese nombre socio","SOCIO",JOptionPane.INFORMATION_MESSAGE);
            this._tipoSuscripcion= tipoSuscripcion;
            if(tipoSuscripcion.equals("VIP")){
                this._fondo = 100000;
            }else{
                this._fondo = 50000;
            }
	}

        public Factura[] getFactura() {
            return _factura;
        }

        public void setFactura(Factura factura) {
           for(int i =0;i<this._factura.length;i++){
               if(this._factura[i]==null){
                   this._factura[i]=factura;
                   break;
               }
           };
        }

        public Invitado[] getInvitados() {
            return _invitados;
        }
        
        public void setInvitados(Invitado _invitados) {
            for(int i =0;i<this._invitados.length;i++){
               if(this._invitados[i]==null){
                  this._invitados[i]=_invitados;
                  break;
               }  
            }
        }

        public String getCedula() {
            return _cedula;
        }

        public void setCedula(String _cedula) {
            this._cedula = _cedula;
        }

        public String getNombre() {
            return _nombre;
        }

        public void setNombre(String _nombre) {
            this._nombre = _nombre;
        }

        public String getTipoSuscripcion() {
            return _tipoSuscripcion;
        }

        public void setTipoSuscripcion(String _tipoSuscripcion) {
            this._tipoSuscripcion = _tipoSuscripcion;
        }

        public double getFondo() {
            return _fondo;
        }

        public void setFondo(double _fondo) {
            if(this._tipoSuscripcion.equals("VIP")){
                if(this._fondo+_fondo<=5000000){
                    this._fondo = _fondo;
                    JOptionPane.showMessageDialog(null, "Felicidades!.. su nuevo fondo esta en " + this._fondo);
                }else{
                    JOptionPane.showMessageDialog(null, "No se pudo ingresar el valor, excede lo permitido por el club");
                }
            }
            else{
                 if(this._fondo+_fondo<=1000000){
                    this._fondo = _fondo;
                    JOptionPane.showMessageDialog(null, "Felicidades!.. su nuevo fondo esta en " + this._fondo);
                }else{
                    JOptionPane.showMessageDialog(null, "No se pudo ingresar el valor, excede lo permitido por el club");
                }
            }
        }
        
        public String verInvitado()
        {
            String invitado = "";
            int count =0;
            for (int i = 0; i < _invitados.length; i++) {
            if (_invitados[i] != null) {
                count =count+1;
                invitado += (count+". "+_invitados[i].toString() + "\n");
            }
            }
           
        return invitado;
        }
	
        public void registrarConsumo(){
            if(cantidadFacturas()<5)
            {   
                for(int i =0; i<_factura.length;i++){
                    if(_factura[i] == null){
                         _factura[i] = new Factura(getFondo());
                         JOptionPane.showMessageDialog(null, "Se agregó la factura al socio "+ getNombre());
                         break;
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "ya no hay mas cupos para socios VIP");
            }
        }
        
        public Double verConsumoPorSocio(String cedula){
            double costoTotal =0;
            return costoTotal;
        }
        
        public int cantidadFacturas(){
            int cant = 0;
            for(int i =0;i<_factura.length;i++){
                if(_factura[i]!=null){
                    cant= cant++;
                }
            }
            return cant;
        }
        
        
        @Override
        public String toString() {
            return "Cedula=" + _cedula + ", Nombre=" + _nombre + ", Fondo=" + _fondo+", Suscripcion="+_tipoSuscripcion;
        }

}
