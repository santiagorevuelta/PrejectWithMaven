/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.com.tdea;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author NMEJIA
 */
public class JF_consumo extends javax.swing.JFrame {
 private Validador validador;
  
fondoPanelNew fondonew = new fondoPanelNew();

    class fondoPanelNew extends JPanel{
        private Image imagen;
        
        
        @Override
        public void paint(Graphics g){          
                imagen = new ImageIcon("./Imagenes/FondoMenu.jpg").getImage();  
                
                g.drawImage(imagen,0, 0, getWidth(), getHeight(),this);                
                setOpaque(false);                
                super.paint(g);
        }
    }
    
    
 
    /**
     * Creates new form JF_consumo
     */
    public JF_consumo( Validador validador) {
        
        try{
            this.setContentPane(fondonew);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
        this.validador=validador;
        initComponents();
        btnGroupEntradas.add(jrEmpanadax2);
        btnGroupEntradas.add(jrEmpanadasx10);
        btnGroupPostre.add(jrTresLeches);
        btnGroupPostre.add(jrLimon);
        btnGroupPlatos.add(jrMixto);
        btnGroupPlatos.add(jrVegano);
        btnGroupRegistrar.add(jrSocio);
        btnGroupRegistrar.add(jrAsociado);
        btnGroupBebidas.add(jrBebida1);
        btnGroupBebidas.add(jrBebida2);
        btnGroupBebidas.add(jrBebida3);
        this.bloquearEntrada();
        this.bloquearPostres();
        this.bloquearPlato();
        this.bloquearBebidas();
        txtCedulaCliente.setEditable(false);
        txtcPersonaAutorizada.setEditable(false);
        
       
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupEntradas = new javax.swing.ButtonGroup();
        btnGroupPostre = new javax.swing.ButtonGroup();
        btnGroupPlatos = new javax.swing.ButtonGroup();
        btnGroupRegistrar = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnGroupBebidas = new javax.swing.ButtonGroup();
        jPanel1 = new fondoPanelNew();
        lbl_TituloConsumo = new javax.swing.JLabel();
        jpEntrada = new javax.swing.JPanel();
        lblTituloEntrada = new javax.swing.JLabel();
        jrEmpanadasx10 = new javax.swing.JRadioButton();
        jrEmpanadax2 = new javax.swing.JRadioButton();
        jcbOpcionPlatos = new javax.swing.JComboBox<>();
        btnRegresarJF_inicio = new javax.swing.JButton();
        jpPlato = new javax.swing.JPanel();
        lblTituloPlatofierte = new javax.swing.JLabel();
        jrVegano = new javax.swing.JRadioButton();
        jrMixto = new javax.swing.JRadioButton();
        jcbTiposPlatos = new javax.swing.JComboBox<>();
        txtCedulaCliente = new javax.swing.JTextField();
        txtcPersonaAutorizada = new javax.swing.JTextField();
        btnRegistrarConsumo = new javax.swing.JButton();
        JblRegistrarConsumo = new javax.swing.JLabel();
        jpBebidas = new javax.swing.JPanel();
        lblTituloBebidas = new javax.swing.JLabel();
        jcbBebidas = new javax.swing.JComboBox<>();
        jrBebida1 = new javax.swing.JRadioButton();
        jrBebida2 = new javax.swing.JRadioButton();
        jrBebida3 = new javax.swing.JRadioButton();
        jrSocio = new javax.swing.JRadioButton();
        jrAsociado = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jpPostre = new javax.swing.JPanel();
        lblTituloPostre = new javax.swing.JLabel();
        jrTresLeches = new javax.swing.JRadioButton();
        jrLimon = new javax.swing.JRadioButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(102, 153, 255));
        jPanel1.setToolTipText("");
        jPanel1.setAutoscrolls(true);

        lbl_TituloConsumo.setBackground(new java.awt.Color(255, 255, 255));
        lbl_TituloConsumo.setFont(new java.awt.Font("Felix Titling", 3, 24)); // NOI18N
        lbl_TituloConsumo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_TituloConsumo.setText("MENU");
        lbl_TituloConsumo.setToolTipText("");

        jpEntrada.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTituloEntrada.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        lblTituloEntrada.setText("ENTRADA");

        jrEmpanadasx10.setText("Empanadas X 10");

        jrEmpanadax2.setText("Empanadas X2");
        jrEmpanadax2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEmpanadax2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpEntradaLayout = new javax.swing.GroupLayout(jpEntrada);
        jpEntrada.setLayout(jpEntradaLayout);
        jpEntradaLayout.setHorizontalGroup(
            jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrEmpanadax2)
                    .addComponent(jrEmpanadasx10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEntradaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jpEntradaLayout.setVerticalGroup(
            jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrEmpanadax2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrEmpanadasx10)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jcbOpcionPlatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Plato Fuerte", "Postre", "Bebidas" }));
        jcbOpcionPlatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbOpcionPlatosActionPerformed(evt);
            }
        });

        btnRegresarJF_inicio.setText("Volver");
        btnRegresarJF_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarJF_inicioActionPerformed(evt);
            }
        });

        jpPlato.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTituloPlatofierte.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        lblTituloPlatofierte.setText("PLATOS");

        jrVegano.setText("Vegano");
        jrVegano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrVeganoActionPerformed(evt);
            }
        });

        jrMixto.setText("Mixto");
        jrMixto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrMixtoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPlatoLayout = new javax.swing.GroupLayout(jpPlato);
        jpPlato.setLayout(jpPlatoLayout);
        jpPlatoLayout.setHorizontalGroup(
            jpPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPlatoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblTituloPlatofierte, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPlatoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbTiposPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpPlatoLayout.createSequentialGroup()
                        .addComponent(jrVegano)
                        .addGap(18, 18, 18)
                        .addComponent(jrMixto)))
                .addGap(24, 24, 24))
        );
        jpPlatoLayout.setVerticalGroup(
            jpPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPlatoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblTituloPlatofierte, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrVegano)
                    .addComponent(jrMixto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbTiposPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnRegistrarConsumo.setBackground(java.awt.SystemColor.activeCaption);
        btnRegistrarConsumo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnRegistrarConsumo.setForeground(new java.awt.Color(0, 102, 102));
        btnRegistrarConsumo.setText("Registrar");
        btnRegistrarConsumo.setToolTipText("");
        btnRegistrarConsumo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarConsumo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrarConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarConsumoActionPerformed(evt);
            }
        });

        JblRegistrarConsumo.setFont(new java.awt.Font("Perpetua Titling MT", 3, 36)); // NOI18N
        JblRegistrarConsumo.setForeground(new java.awt.Color(0, 0, 0));
        JblRegistrarConsumo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JblRegistrarConsumo.setText("Registrar Consumo");

        jpBebidas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTituloBebidas.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        lblTituloBebidas.setText("BEBIDAS");

        jcbBebidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "." }));
        jcbBebidas.setToolTipText("");

        jrBebida1.setText("Caliente");
        jrBebida1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jrBebida1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jrBebida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrBebida1ActionPerformed(evt);
            }
        });

        jrBebida2.setText("Alcoholica");
        jrBebida2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrBebida2ActionPerformed(evt);
            }
        });

        jrBebida3.setText("No Alcoholica");
        jrBebida3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrBebida3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBebidasLayout = new javax.swing.GroupLayout(jpBebidas);
        jpBebidas.setLayout(jpBebidasLayout);
        jpBebidasLayout.setHorizontalGroup(
            jpBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBebidasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBebidasLayout.createSequentialGroup()
                        .addComponent(jrBebida3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrBebida2))
                    .addGroup(jpBebidasLayout.createSequentialGroup()
                        .addComponent(jrBebida1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBebidasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTituloBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jpBebidasLayout.setVerticalGroup(
            jpBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBebidasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrBebida3)
                    .addComponent(jrBebida2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jrBebida1)
                    .addComponent(jcbBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121))
        );

        jrSocio.setBackground(new java.awt.Color(102, 102, 102));
        jrSocio.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jrSocio.setForeground(new java.awt.Color(255, 255, 255));
        jrSocio.setText("Socio");
        jrSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrSocioActionPerformed(evt);
            }
        });

        jrAsociado.setForeground(new java.awt.Color(255, 255, 255));
        jrAsociado.setText("Asociado");
        jrAsociado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrAsociadoActionPerformed(evt);
            }
        });

        jpPostre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTituloPostre.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        lblTituloPostre.setText("POSTRE");

        jrTresLeches.setText("Tres Leches");

        jrLimon.setText("Limón");

        javax.swing.GroupLayout jpPostreLayout = new javax.swing.GroupLayout(jpPostre);
        jpPostre.setLayout(jpPostreLayout);
        jpPostreLayout.setHorizontalGroup(
            jpPostreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPostreLayout.createSequentialGroup()
                .addGroup(jpPostreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPostreLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jrLimon))
                    .addGroup(jpPostreLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblTituloPostre, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPostreLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jrTresLeches)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpPostreLayout.setVerticalGroup(
            jpPostreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPostreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloPostre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrTresLeches)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrLimon)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_TituloConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcbOpcionPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegresarJF_inicio)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jpEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jpPostre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jpPlato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jpBebidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrAsociado)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtcPersonaAutorizada, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addComponent(btnRegistrarConsumo)))))
                        .addContainerGap(24, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JblRegistrarConsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(JblRegistrarConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrSocio)
                    .addComponent(jrAsociado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcPersonaAutorizada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRegistrarConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_TituloConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbOpcionPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpPlato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpEntrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpBebidas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpPostre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnRegresarJF_inicio)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrAsociadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrAsociadoActionPerformed
        // TODO add your handling code here:
        txtcPersonaAutorizada.setEditable(true);
        txtCedulaCliente.setEditable(true);
    }//GEN-LAST:event_jrAsociadoActionPerformed

    private void jrSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrSocioActionPerformed
        // TODO add your handling code here:
        txtCedulaCliente.setEditable(true);
        txtcPersonaAutorizada.setEditable(false);
    }//GEN-LAST:event_jrSocioActionPerformed

    private void btnRegistrarConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarConsumoActionPerformed
        // TODO add your handling code here:

        String tEntrada = "";
        if(jrEmpanadax2.isSelected()){
            tEntrada = "Empanadax2";
        }else if(jrEmpanadasx10.isSelected()){
            tEntrada = "Empanadax10";
        }else if(jrLimon.isSelected()){
            tEntrada = "Limon";
        }else if(jrTresLeches.isSelected()){
            tEntrada = "TresLeches";
        }else{
            tEntrada = jcbBebidas.getSelectedItem().toString();
        }

        String tplatofuerte="";
        if(jrVegano.isSelected()){
            tplatofuerte = "PlatoVegano";

        }else if(jrMixto.isSelected()){
            tplatofuerte = "PlatoMixto";
        }
        
        String tpBebida = "";
        if (jrBebida1.isSelected()) {
            tpBebida = "Caliente";
        }
        if (jrBebida2.isSelected()) {
            tpBebida = "Alcoholica";
        }
        if (jrBebida3.isSelected()) {
            tpBebida = "NoAlcoholica";
        }

        if(jcbOpcionPlatos.getSelectedItem().toString().equals("Plato Fuerte")){
            if(jrSocio.isSelected()){
                validador.inscribirFacturaSocio(txtCedulaCliente.getText(),tplatofuerte,jcbTiposPlatos.getSelectedItem().toString());
            }else if(jrAsociado.isSelected()){
                validador.registrarConsumoAsociado(txtCedulaCliente.getText(),txtcPersonaAutorizada.getText(),tplatofuerte,jcbTiposPlatos.getSelectedItem().toString());
            }

        } else if(jcbOpcionPlatos.getSelectedItem().toString().equals("Bebidas")){
            if(jrSocio.isSelected()){
               validador.inscribirFacturaSocio(txtCedulaCliente.getText(), tpBebida, Integer.toString(jcbBebidas.getSelectedIndex()));
            }else if(jrAsociado.isSelected()){
                validador.registrarConsumoAsociado(txtCedulaCliente.getText(),txtcPersonaAutorizada.getText(), tpBebida, Integer.toString(jcbBebidas.getSelectedIndex()));
            }
        
        }else{
            if(jrSocio.isSelected()){
                validador.inscribirFacturaSocio(txtCedulaCliente.getText(),jcbOpcionPlatos.getSelectedItem().toString(),tEntrada);
            }else if(jrAsociado.isSelected()){
                validador.registrarConsumoAsociado(txtCedulaCliente.getText(), txtcPersonaAutorizada.getText(), jcbOpcionPlatos.getSelectedItem().toString(),tEntrada);
            }

        }

        btnGroupEntradas.clearSelection();
        btnGroupPostre.clearSelection();
        btnGroupPlatos.clearSelection();
        //btnGroupRegistrar.clearSelection();
    }//GEN-LAST:event_btnRegistrarConsumoActionPerformed

    private void jrMixtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrMixtoActionPerformed
        // TODO add your handling code here:
        jcbTiposPlatos.removeAllItems();
        jcbTiposPlatos.addItem("Punta de Anca");
        jcbTiposPlatos.addItem("Bandeja Paisa");
        jcbTiposPlatos.addItem("Picada Mixta");
    }//GEN-LAST:event_jrMixtoActionPerformed

    private void jrVeganoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrVeganoActionPerformed
        // TODO add your handling code here:jcbTiposPlatos
        jcbTiposPlatos.removeAllItems();
        jcbTiposPlatos.addItem("Ensalada Cesar");
        jcbTiposPlatos.addItem("Menú Italiano");
    }//GEN-LAST:event_jrVeganoActionPerformed

    private void btnRegresarJF_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarJF_inicioActionPerformed
        // TODO add your handling code here:
        JF_inicio ventana1 = new JF_inicio(validador);
        ventana1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarJF_inicioActionPerformed

    private void jcbOpcionPlatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbOpcionPlatosActionPerformed
        String Op =jcbOpcionPlatos.getSelectedItem().toString();

        switch (Op){
            case "Entrada":{
                this.desbloquearEntrada();
                this.bloquearPostres();
                this.bloquearPlato();
                this.bloquearBebidas();
                break;
            }

            case "Postre":{
                this.desbloquearPostres();
                this.bloquearEntrada();
                this.bloquearPlato();
                this.bloquearBebidas();
                break;
            }
            case "Plato Fuerte": {
                this.desbloquearPlato();
                this.bloquearEntrada();
                this.bloquearPostres();
                this.bloquearBebidas();
                break;
            }
//            case "Cócteles":{
//                this.desbloquearBebidas();
//                this.bloquearEntrada();
//                this.bloquearPlato();
//                this.bloquearPostres();
//                jcbBebidas.removeAllItems();
//                jcbBebidas.addItem("Margarita");
//                jcbBebidas.addItem("Mojito");
//                jcbBebidas.addItem("Piña Colada");
//                break;
//                
//            }
            case "Bebidas":{
                this.desbloquearBebidas();
                this.bloquearEntrada();
                this.bloquearPlato();
                this.bloquearPostres();
                jcbBebidas.removeAllItems();
//                jcbBebidas.addItem("Jugo del Día");
//                jcbBebidas.addItem("Soda");
//                jcbBebidas.addItem("Gaseosa");
            }
        }
        
        
        
    }//GEN-LAST:event_jcbOpcionPlatosActionPerformed

    private void jrBebida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrBebida1ActionPerformed
        // TODO add your handling code here:
        jcbBebidas.removeAllItems();
        jcbBebidas.addItem("Café Moca");
        jcbBebidas.addItem("Atole");
        jcbBebidas.addItem("Café Frutal");
    }//GEN-LAST:event_jrBebida1ActionPerformed

    private void jrBebida2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrBebida2ActionPerformed
        // TODO add your handling code here:
        jcbBebidas.removeAllItems();
        jcbBebidas.addItem("Margarita");
        jcbBebidas.addItem("Mojito");
        jcbBebidas.addItem("Piña Colada");
    }//GEN-LAST:event_jrBebida2ActionPerformed

    private void jrBebida3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrBebida3ActionPerformed
        // TODO add your handling code here:
        jcbBebidas.removeAllItems();
        jcbBebidas.addItem("Jugo del Día");
        jcbBebidas.addItem("Soda");
        jcbBebidas.addItem("Gaseosa");
    }//GEN-LAST:event_jrBebida3ActionPerformed

    private void jrEmpanadax2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEmpanadax2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrEmpanadax2ActionPerformed

    public void bloquearBebidas(){
        for(Component b:jpBebidas.getComponents()){
            b.setEnabled(false);
        }   
        
    }
    public void desbloquearBebidas(){
        for(Component b:jpBebidas.getComponents()){
            b.setEnabled(true);
        }
    }
    
    public void bloquearEntrada(){
        for(Component a:jpEntrada.getComponents() ){
            a.setEnabled(false);
        }
    }
    
    
    public void desbloquearEntrada(){
        for(Component a:jpEntrada.getComponents() ){
            a.setEnabled(true);
        }
    }
    
    public void bloquearPostres(){
        for(Component a:jpPostre.getComponents()){
            a.setEnabled(false);
        }
    }
    
    public void desbloquearPostres(){
        for(Component a:jpPostre.getComponents()){
            a.setEnabled(true);
        }
    }
    public void bloquearPlato(){
        for(Component a:jpPlato.getComponents() ){
            a.setEnabled(false);
        }
    }
    
     public void desbloquearPlato(){
        for(Component a:jpPlato.getComponents()){
            a.setEnabled(true);
        }
    }
    
    
    
 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JblRegistrarConsumo;
    private javax.swing.ButtonGroup btnGroupBebidas;
    private javax.swing.ButtonGroup btnGroupEntradas;
    private javax.swing.ButtonGroup btnGroupPlatos;
    private javax.swing.ButtonGroup btnGroupPostre;
    private javax.swing.ButtonGroup btnGroupRegistrar;
    private javax.swing.JButton btnRegistrarConsumo;
    private javax.swing.JButton btnRegresarJF_inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jcbBebidas;
    private javax.swing.JComboBox<String> jcbOpcionPlatos;
    private javax.swing.JComboBox<String> jcbTiposPlatos;
    private javax.swing.JPanel jpBebidas;
    private javax.swing.JPanel jpEntrada;
    private javax.swing.JPanel jpPlato;
    private javax.swing.JPanel jpPostre;
    private javax.swing.JRadioButton jrAsociado;
    private javax.swing.JRadioButton jrBebida1;
    private javax.swing.JRadioButton jrBebida2;
    private javax.swing.JRadioButton jrBebida3;
    private javax.swing.JRadioButton jrEmpanadasx10;
    private javax.swing.JRadioButton jrEmpanadax2;
    private javax.swing.JRadioButton jrLimon;
    private javax.swing.JRadioButton jrMixto;
    private javax.swing.JRadioButton jrSocio;
    private javax.swing.JRadioButton jrTresLeches;
    private javax.swing.JRadioButton jrVegano;
    private javax.swing.JLabel lblTituloBebidas;
    private javax.swing.JLabel lblTituloEntrada;
    private javax.swing.JLabel lblTituloPlatofierte;
    private javax.swing.JLabel lblTituloPostre;
    private javax.swing.JLabel lbl_TituloConsumo;
    private javax.swing.JTextField txtCedulaCliente;
    private javax.swing.JTextField txtcPersonaAutorizada;
    // End of variables declaration//GEN-END:variables
}
