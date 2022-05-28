package com.tdea;


import java.util.Arrays;
import javax.swing.JOptionPane;

public class Club {

    private Socio[] _socios;
    private Socio[] _sociosVIP;
    
    
    public Club() {
        this._socios = new Socio[32];
        this._sociosVIP = new Socio[3];
    }

    public Socio[] getSocios() {
        return _socios;
    }

    public void setSocios(Socio[] _socios) {
        this._socios = _socios;
    }

    public Socio[] getSociosVIP() {
        return _sociosVIP;
    }

    public void setSociosVIP(Socio[] _sociosVIP) {
        this._sociosVIP = _sociosVIP;
    }
   
    
    public void registrarSocio()
    {
        boolean salir = false;
        while(!salir)
        {
            String suscripcion = JOptionPane.showInputDialog(null, "ingrese tipo de suscripción \n"
                    + "1. VIP.\n"
                    + "2. Regular\n"
                    + "3. Invitado\n"
                    + "0. Volver","Club",JOptionPane.INFORMATION_MESSAGE);
            switch (suscripcion) 
            {
                case "1": 
                {
                    if(cantidadSociosVip()<3 && cantidadSocios()<32)
                    {
                        String cedula = JOptionPane.showInputDialog(null, "ingrese la cedula o identificación");
                        Socio resultV = buscarSocioPorCedula(_sociosVIP,cedula);
                        Socio resultR = buscarSocioPorCedula(_socios,cedula);
                        
                        if(resultV==null && resultR == null){
                            insertarSocioVip(cedula);
                            salir=true;
                        }
                        else
                        {
                            if(resultR != null){
                                JOptionPane.showMessageDialog(null, "El usuario esta registrado como socio regular","Ya existe ",JOptionPane.INFORMATION_MESSAGE);
                            }else if(resultV != null){
                                JOptionPane.showMessageDialog(null, "El usuario esta registrado como socio VIP","Ya existe ",JOptionPane.INFORMATION_MESSAGE);
                            }else{
                                 JOptionPane.showMessageDialog(null, "El usuario esta registrado como invitado de un socio","Ya existe ",JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No hay mas cupos para insertar usuario VIP");
                    }
                    break;
                }
                case "2": 
                {
                     if(cantidadSocios()<32)
                    {
                        String cedula = JOptionPane.showInputDialog(null, "ingrese la cedula o identificación del socio regular");
                        Socio resultV = buscarSocioPorCedula(_sociosVIP,cedula);
                        Socio resultR = buscarSocioPorCedula(_socios,cedula);//se debe validar que no exista como regular, si existte preguntar si desea convertirlo a VIP
                        //Invitado invitado = buscarInvitadoPorCedula(cedula);
                        
                        if(resultV==null && resultR == null){//fata validar que no exista como invitado
                            insertarSocio(cedula);
                            salir=true;
                        }
                        else
                        {
                             if(resultR != null){
                                JOptionPane.showMessageDialog(null, "El usuario esta registrado como socio regular","Ya existe ",JOptionPane.INFORMATION_MESSAGE);
                            }else if(resultV != null){
                                JOptionPane.showMessageDialog(null, "El usuario esta registrado como socio VIP","Ya existe ",JOptionPane.INFORMATION_MESSAGE);
                            }else{
                                 JOptionPane.showMessageDialog(null, "El usuario esta registrado como invitado de un socio","Ya existe ",JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No hay mas cupos para insertar usuario VIP");
                    }
                    break;
                }
                 case "3": 
                {
                    String cedula = JOptionPane.showInputDialog(null, "ingrese la identificacion del socio");
                    Socio resultV = buscarSocioPorCedula(_sociosVIP,cedula);
                    Socio resultR = buscarSocioPorCedula(_socios,cedula);
                    if(resultV!=null){
                        int cantidad = buscarCantidadInvitadosDelVipPorCedula(cedula); 
                        if(cantidad<10){
                            insertarInvitadoSocio(cedula,1);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "No hay mas cupos para este socio");
                        }
                        salir=true;
                    }
                    else if(resultR!=null){
                        int cantidad = buscarCantidadInvitadosDelSocioCedula(cedula); 
                        if(cantidad<10){
                            insertarInvitadoSocio(cedula,2);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "No hay mas cupos para este socio");
                        }
                        salir=true;
                    }
                     if(resultV == null&& resultR == null){
                         JOptionPane.showMessageDialog(null, "No existe un socio con esa cedula","Advertencia",JOptionPane.WARNING_MESSAGE);
                     }
                    break;
                }
                case "0":{
                    salir = true;
                    break;
                }
            }             
            
        }
        
    }
    
    //#region METODOS PARA  SOCIO VIP
    public void insertarSocioVip(String cedula)
    {
        if(cantidadSociosVip()<3)
        {   
            for(int i =0; i<_sociosVIP.length;i++){
                if(_sociosVIP[i] == null){
                     _sociosVIP[i] = new Socio(cedula,"VIP");
                     JOptionPane.showMessageDialog(null, "Se agregó el socio "+ _sociosVIP[i].getNombre()+", al Club");
                     break;
                }
            }
        }
         else{
            JOptionPane.showMessageDialog(null, "ya no hay mas cupos para socios VIP");
        }
    }
    
    public void insertarInvitadoSocioVip(String cedula)
    {
        if(cantidadSociosVip()<32)
        {
            for(int i =0; i<_sociosVIP.length;i++){
                if(_sociosVIP[i].getCedula().equals(cedula)){
                    Invitado[] invitado = _sociosVIP[i].getInvitados();
                    for(int j =0; j<invitado.length;j++){

                        if(invitado[j] == null){
                            Invitado _invitado = new Invitado();
                            _sociosVIP[i].setInvitados(_invitado);
                            JOptionPane.showMessageDialog(null, "Se agregó el invitado al socio "+ _sociosVIP[i].getNombre());
                            break;
                        } 
                    }
                    break;
                }
            }
        }
         else{
            JOptionPane.showMessageDialog(null, "No contamos con mas cupos disponibles");
        }
    }
    
    public int cantidadSociosVip()
    {
       int cantidad =0;
       for (int j = 0; j < _sociosVIP.length; j++)
        {
           if(_sociosVIP[j] != null )
           {
               if(_sociosVIP[j].getTipoSuscripcion().equals("VIP")){
                    cantidad = cantidad+1; 
               }
           } 
        }
       return cantidad;
    }
    
    public int buscarCantidadInvitadosDelVipPorCedula(String cedula)
    {
       int cantidad =0;
       for (int j = 0; j < _sociosVIP.length; j++)
        {
           if(_sociosVIP[j] != null )
           {
               if(_sociosVIP[j].getCedula().equals(cedula)){
                    cantidad =cantidad+1;
                    break;
               }
           } 
        }
       return cantidad;
    }
    
  
    //#endregion
    
    
    //#region 
      public boolean eliminarSocio()
    {
        boolean eliminado = false;
        String cedula = JOptionPane.showInputDialog(null, "ingrese la identificación del socio a eliminar", "Club",JOptionPane.INFORMATION_MESSAGE);
        Socio resultV = buscarSocioPorCedula(_sociosVIP,cedula);
        Socio resultR = buscarSocioPorCedula(_socios,cedula);
        
        if(resultV==null && resultR == null){//fata validar que no exista como invitado
            JOptionPane.showMessageDialog(null, "El Ususario no existe con esa identificación", "Club",JOptionPane.ERROR_MESSAGE);
        }else{
            if(resultV !=null){
//                for(int i=0;i<_sociosVIP.length;i++)
//                {
//                    if(_sociosVIP[i] !=null)
//                    {
//                        String cedu =_sociosVIP[i].getCedula();
//                        if(cedu.equals(cedula))
//                        {
//                            _sociosVIP[i]=null;
//                            JOptionPane.showMessageDialog(null, "Se Eliminó correctamente el usuario", "Club",JOptionPane.INFORMATION_MESSAGE);
//                            eliminado = true;
//                        }
//                    }
//                   
//                }
                JOptionPane.showMessageDialog(null, "No se puede eliminar un socio de tipo VIP ", "Club",JOptionPane.INFORMATION_MESSAGE);
            }
            if(resultR !=null){
                for(int i=0;i<_socios.length;i++)
                {
                    if(_socios[i] !=null)
                    {
                        String cedu =_socios[i].getCedula();
                        if(cedu.equals(cedula))
                        {
                            Invitado[] invitados = _socios[i].getInvitados();
                            if(invitados !=null){
                                _socios[i]=null;
                                JOptionPane.showMessageDialog(null, "Se Eliminó correctamente el usuario", "Club",JOptionPane.INFORMATION_MESSAGE);
                                eliminado = true;
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "El profesor dijo que no se puede eliminar un socio con personas AUTORIZADAS", "Club",JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                   
                }
            }
        }
        return eliminado;
    }
      
    public void aumentarFondo()
    {
        String cedula = JOptionPane.showInputDialog(null, "ingrese la identificación del socio ", "Club",JOptionPane.INFORMATION_MESSAGE);
        Socio resultV = buscarSocioPorCedula(_sociosVIP,cedula);
        Socio resultR = buscarSocioPorCedula(_socios,cedula);
        if(resultV==null && resultR == null){//fata validar que no exista como invitado
            JOptionPane.showMessageDialog(null, "El Ususario no existe con esa identificación", "Club",JOptionPane.ERROR_MESSAGE);
        }else{
            if(resultV !=null){
                for(int i =0;i<_sociosVIP.length;i++){
                    if(_sociosVIP[i] !=null){
                        if(_sociosVIP[i].getCedula().equals(cedula) ){
                            double resultFondo = Double.parseDouble( JOptionPane.showInputDialog(null,"Cuanto desea ingresar para aumentar su fondo?"));
                            _sociosVIP[i].setFondo(resultFondo);
                            break;
                        }
                    }

                }
            }
             if(resultR !=null){
                for(int i =0;i<_socios.length;i++){
                    if(_socios[i] !=null){
                        if(_socios[i].getCedula().equals(cedula) ){
                            double resultFondo = Double.parseDouble( JOptionPane.showInputDialog(null,"Cuanto desea ingresar para aumentar su fondo?"));
                            _socios[i].setFondo(resultFondo);
                            break;
                        }
                    }

                }
            }
        }
        
      }
    
    public Double verConsumoPorSocio(String cedula){
        double totalConsumo =0;
        Socio resultV = buscarSocioPorCedula(_sociosVIP,cedula);
        Socio resultR = buscarSocioPorCedula(_socios,cedula);
        if(resultV!=null){
         Factura[] factura =  resultV.getFactura();
         for(int i =0;i<factura.length;i++){
            if(factura[i]!=null){
                totalConsumo = totalConsumo +factura[i].getValor();
            }

         }
        }else{
            Factura[] factura =  resultR.getFactura();
            for(int i =0;i<factura.length;i++){
            if(factura[i]!=null){
                totalConsumo = totalConsumo +factura[i].getValor();
            }

         }  
        }
        
        return totalConsumo;
    }
    
     public void registrarConsumo(){
        String cedula = JOptionPane.showInputDialog(null,"ingrese la identificación del socio del que desea registrar el consumo");
        Socio socioVip = buscarSocioPorCedula(_sociosVIP,cedula);
        Socio socio = buscarSocioPorCedula(_socios,cedula);
        if(socio != null){
            if(socio.cantidadFacturas()<5){
                Factura factura = new Factura(socio.getFondo());
                socio.setFactura(factura);
                double comprado = 0;
                comprado = comprado+factura.getValor();
               double nuevoFondo =socio.getFondo() - comprado; 
                socio.setFondo(nuevoFondo);
            }else{
                JOptionPane.showInputDialog(null,"No se puede registrar otro consumo ");
            }
        }
        else if( socioVip !=null){
            if(socioVip.cantidadFacturas()<5){
                Factura factura = new Factura(socioVip.getFondo());
                socioVip.setFactura(factura);
                double comprado = 0;
                comprado = comprado+factura.getValor();
               double nuevoFondo =socioVip.getFondo() - comprado; 
                socioVip.setFondo(nuevoFondo);
            
            }else{
                JOptionPane.showInputDialog(null,"No se puede registrar otro consumo ");
            }
        }
     }
    //endregion
    
    
    
    
     //#region METODOS PARA SOCIO REGULAR
     public void insertarSocio(String cedula)
    {
        if(cantidadSocios()<32)
        {   
            for(int i =0; i<_socios.length;i++){
                if(_socios[i] == null){
                     _socios[i] = new Socio(cedula,"REGULAR");
                     JOptionPane.showMessageDialog(null, "Se agregó el socio "+ _socios[i].getNombre()+", al Club");
                     break;
                }
            }
        }
         else{
            JOptionPane.showMessageDialog(null, "ya no hay mas cupos para socios VIP");
        }
    }
    
     public void insertarInvitadoSocio(String cedula, int num)
    {
        if(num==1){
            for(int i =0; i<_sociosVIP.length;i++)
            {
                if(_sociosVIP[i].getCedula() == null ? cedula == null : _sociosVIP[i].getCedula().equals(cedula))
                {
                    Invitado[] invitado = _sociosVIP[i].getInvitados();
                    for(int j =0; j<invitado.length;j++){

                        if(invitado[j] == null){
                            Invitado _invitado = new Invitado();
                            _sociosVIP[j].setInvitados(_invitado);
                            JOptionPane.showMessageDialog(null, "Se agregó el invitado al socio "+ _sociosVIP[i].getNombre());
                            break;
                        } 
                    }
                    break;
                }
            }
        }else
        {
           for(int i =0; i<_socios.length;i++)
            {
                if(_socios[i].getCedula() == null ? cedula == null : _socios[i].getCedula().equals(cedula))
                {
                    Invitado[] invitado = _socios[i].getInvitados();
                    for(int j =0; j<invitado.length;j++){

                        if(invitado[j] == null){
                            Invitado _invitado = new Invitado();
                            _socios[j].setInvitados(_invitado);
                            JOptionPane.showMessageDialog(null, "Se agregó el invitado al socio "+ _socios[i].getNombre());
                            break;
                        } 
                    }
                    break;
                }
            }
        }
    }
     
    public int cantidadSocios()
    {
       int cantidad =0;
       for (int j = 0; j < _socios.length; j++)
        {
           if(_socios[j] != null )
           {
               if(_socios[j].getTipoSuscripcion().equals("REGULAR")){
                    cantidad = cantidad+1; 
               }
           } 
        }
       return cantidad;
   }
    
     public int buscarCantidadInvitadosDelSocioCedula(String cedula)
    {
       int cantidad =0;
       for (int j = 0; j < _socios.length; j++)
        {
           if(_socios[j] != null )
           {
               if(_socios[j].getCedula().equals(cedula)){
                    cantidad = cantidad+1;
               }
           } 
        }
       return cantidad;
    }
    //#endregion
    
    
    //#region METODOS PARA INVITADO
    
    
    public int cantidadInvitados()
    {
       int cantidad =0;
       
       for (int j = 0; j < _sociosVIP.length; j++)
        {
           if(_sociosVIP[j] != null )
           {
               if(_sociosVIP[j].getTipoSuscripcion().equals("VIP")){
                    cantidad = cantidad+1; 
               }
           } 
        }
       return cantidad;
   }
    
    public Invitado[] listaInvitados()
    {
       Invitado[] listInvitado  = new Invitado[350];
       
       for(int i =0;i<listInvitado.length;i++)
       {
           if(listInvitado[i]==null)
           {
                for (int j = 0; j < _sociosVIP.length; j++)
                {
                   if(_sociosVIP[j] != null )
                   {
                      listInvitado =  _sociosVIP[j].getInvitados(); 
                      break;
                   } 
                }
           }
       }
       
       for(int i =0;i<listInvitado.length;i++)
       {
           if(listInvitado[i]==null)
           {
                for (int j = 0; j < _socios.length; j++)
                {
                   if(_socios[j] != null )
                   {
                      listInvitado =  _socios[j].getInvitados();
                      break;
                   } 
                }
           }
       }
       
       return listInvitado;
   }
    //#endregion
    
    
    public Socio buscarSocioPorCedula(Socio[] listaSocio, String cedula)
    {
        Socio encontrado = null;
        
        for (int i = 0; i < listaSocio.length; i++) {
             if (listaSocio[i] != null && listaSocio[i].getCedula().equals(cedula)) {
                 encontrado = listaSocio[i];
             }
        }
        return encontrado;
    }
   
    public String verSocios(){
       String socio = "";
       int count =0;
        for (int i = 0; i < _socios.length; i++) {
            if (_socios[i] != null) {
                count =count+1;
                socio += (count+". "+_socios[i].toString() + "\n");
            }
        }
        for (int i = 0; i < _sociosVIP.length; i++) {
            if (_sociosVIP[i] != null) {
                count =count+1;
                socio += (count+". "+_sociosVIP[i].toString() + "\n");
            }
        }
        return socio;
    }
    
    public void verInvitados(){
        String cedula = JOptionPane.showInputDialog(null, "Ingrese identificación del socio");
        
        for(int i =0;i<_socios.length;i++)
        {
            if(_socios[i]!=null)
            {
                if(_socios[i].getCedula().equals(cedula)){
                    JOptionPane.showMessageDialog(null, _socios[i].verInvitado());
                    
                }
            }
        } 
         for(int i =0;i<_sociosVIP.length;i++)
        {
            if(_sociosVIP[i]!=null)
            {
                if(_sociosVIP[i].getCedula().equals(cedula)){
                    JOptionPane.showMessageDialog(null, _sociosVIP[i].verInvitado());
                    
                }
            }
        } 
    }
}
