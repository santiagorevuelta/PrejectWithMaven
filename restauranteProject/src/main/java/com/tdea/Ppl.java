package com.tdea;

import co.com.tdea.bo.UtilidadesBo;
import javax.swing.JOptionPane;
import views.ClubForm;

public class Ppl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             String data = UtilidadesBo.cargarDatos("Select 1  AS unno");
             ClubForm  clubform  = new ClubForm();
            clubform.show();
          /* boolean salir = false;
            Club club = new Club();
            while (!salir) {
               String selected = JOptionPane.showInputDialog(null, "Bienvenido al club\n"
                       + "1. Registrar Socio o invitado\n"
                       + "2. Ver Socios\n"
                       + "3. Eliminar socio VIP \n"
                       + "4. Aumentar Fondo\n"
                       + "5. Agregar consumo\n"
                       + "6. Ver consumo por socio\n"
                       + "0. Salir\n"
                       + ""," Principal",JOptionPane.INFORMATION_MESSAGE);
                
                switch (selected) 
                {
                    case "1": 
                    {
                       club.registrarSocio();
                       break;
                    }
                    case "2": 
                    {
                       mostrarDatos(club);
                       break;
                    }
                    case "3": 
                    {
                      boolean respuesta = club.eliminarSocio();
                       break;
                    }
                     case "4": 
                    {
                       club.aumentarFondo();
                       break;
                    }
                    case "5": 
                    {
                       club.registrarConsumo();
                       break;
                    }
                     case "6": 
                    {
                       String Cedula = JOptionPane.showInputDialog(null, "Ingrese cedula del socio");
                      JOptionPane.showMessageDialog(null,"En total tiene "+ club.verConsumoPorSocio(Cedula));
                       break;
                    }
                    case "0": 
                    {
                       salir =true;
                       break;
                    }
                    default : 
                    {
                        JOptionPane.showMessageDialog(null, "Opción inválida","INVALIDO",JOptionPane.WARNING_MESSAGE);
                        break;
                    }
                } 
            }*/
        }
        
        public static void mostrarDatos(Club club){
            String selected = JOptionPane.showInputDialog(null, "Bienvenido al club\n"
                       + "1. Ver Socios\n"
                       + "2. Ver Invitado de un socios\n"
                       + "0. Salir\n"
                       + ""," Mostrar Datos",JOptionPane.INFORMATION_MESSAGE);
                
                switch (selected) 
                {
                    case "1": 
                    {
                       JOptionPane.showMessageDialog(null, club.verSocios());
                       break;
                    }
                    case "2": 
                    {
                       club.verInvitados();
                       break;
                    }
                    
                    default : 
                    {
                        JOptionPane.showMessageDialog(null, "Opción inválida","INVALIDO",JOptionPane.WARNING_MESSAGE);
                        break;
                    }
                } 
        }
        
       
}
