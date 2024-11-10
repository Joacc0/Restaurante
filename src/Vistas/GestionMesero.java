/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Modelo.Mesero;
import Persistencia.MeseroData;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author tomic
 */
public class GestionMesero extends javax.swing.JInternalFrame {
    private MeseroData meseroD=new MeseroData();
    private Mesero meseroActual=null;
    private boolean advertido= false; //para modificar
    
    List<Mesero> listaMeseros; 
    /**
     * Creates new form AgregarMesero
     */
    public GestionMesero() {
        initComponents();
        
        refrescarVentana();
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelDNI = new javax.swing.JLabel();
        jLabelAPELLLIDO = new javax.swing.JLabel();
        jLabelNOMBRE = new javax.swing.JLabel();
        jTFdni = new javax.swing.JTextField();
        jTFnombre = new javax.swing.JTextField();
        jTFapellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jCBmeseros = new javax.swing.JComboBox<>();
        jBbaja = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setText("GESTIÓN MESEROS");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabelDNI.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDNI.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDNI.setText("DNI:");

        jLabelAPELLLIDO.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAPELLLIDO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAPELLLIDO.setText("APELLIDO:");

        jLabelNOMBRE.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNOMBRE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNOMBRE.setText("NOMBRE:");

        jTFdni.setEditable(false);

        jTFnombre.setEditable(false);
        jTFnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFnombreActionPerformed(evt);
            }
        });

        jTFapellido.setEditable(false);
        jTFapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFapellidoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Mesero:");

        jCBmeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBmeserosActionPerformed(evt);
            }
        });

        jBbaja.setBackground(new java.awt.Color(255, 0, 0));
        jBbaja.setText("BAJA");
        jBbaja.setEnabled(false);
        jBbaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbajaActionPerformed(evt);
            }
        });

        jBmodificar.setBackground(new java.awt.Color(0, 147, 40));
        jBmodificar.setText("MODIFICAR");
        jBmodificar.setEnabled(false);
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jBmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBbaja, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(jCBmeseros, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNOMBRE, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAPELLLIDO, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDNI, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jTFnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jTFdni))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBmeseros, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDNI)
                    .addComponent(jTFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAPELLLIDO)
                    .addComponent(jTFapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNOMBRE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBbaja, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFapellidoActionPerformed

    private void jTFnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFnombreActionPerformed

    private void jCBmeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBmeserosActionPerformed
        // "selected" COMBO BOX MESEROS responde al click
     meseroActual= (Mesero) jCBmeseros.getSelectedItem();
     jBmodificar.setEnabled(true);
     jBbaja.setEnabled(true);
     try{
         if (meseroActual !=null){
        jTFdni.setText(Integer.toString(meseroActual.getDni()));
    jTFapellido.setText(meseroActual.getApellido());
    jTFnombre.setText(meseroActual.getNombre());
         } }catch(Exception e){
        JOptionPane.showMessageDialog(null, "error: "+e.toString());
    }
    }//GEN-LAST:event_jCBmeserosActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        // BOTON MODIFICAR
      if (!advertido){
           //int respuesta= JOptionPane.showConfirmDialog(null, "desea MODICICAR?",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
      int respuesta = JOptionPane.showConfirmDialog(null, "Realmente desea MODIFICAR?"
                , "Confirmar Eliminar",JOptionPane.YES_NO_OPTION, JOptionPane.OK_CANCEL_OPTION);  
      /* Si el usuario pulsa si, devolverá valor 0, si pulsa no devolverá valor 1, y si cierra la ventana devolverá -1*/
      if (respuesta==0){
          //habilito campos de texto para modificar
            jTFdni.setEditable(true); 
            jTFapellido.setEditable(true); 
            jTFnombre.setEditable(true); 
            
            advertido=true;    
      }
      //no hay else, si no CONFIRMA no habilito la modificacion
      }else{//entrará por aquí si fué advertido de la posible modificacion, si no acepta eno entrará
          meseroActual.setDni(Integer.parseInt( jTFdni.getText()));
          meseroActual.setApellido(jTFapellido.getText());
          meseroActual.setNombre(jTFnombre.getText());
          meseroD.actualizarMesero(meseroActual);
         
          refrescarVentana();
          advertido=false; 
            
           
      }
    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jBbajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbajaActionPerformed
        // BOTON BAJA
        
        int respuesta= JOptionPane.showConfirmDialog(null,"Realmente desea DAR DE BAJA?",
                "Confirmar Eliminar",JOptionPane.YES_NO_OPTION, JOptionPane.OK_CANCEL_OPTION);
        /* Si el usuario pulsa si, devolverá valor 0, si pulsa no devolverá valor 1, y si cierra la ventana devolverá -1*/
        if (respuesta==0){
            //saco otro mensaje de advertiencia
            int rta2 = JOptionPane.showConfirmDialog(null,"Dará de baja al mesero: "+ meseroActual.toString(),
                "BAJA Eliminar",JOptionPane.YES_NO_OPTION, JOptionPane.OK_CANCEL_OPTION);
            if (rta2==0){
                meseroD.eliminarMesero(meseroActual.getIdMesero());
                    refrescarVentana();
                    advertido=false; 
            }
        }
        
    }//GEN-LAST:event_jBbajaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jBbaja;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JComboBox<Mesero> jCBmeseros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelAPELLLIDO;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelNOMBRE;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTFapellido;
    private javax.swing.JTextField jTFdni;
    private javax.swing.JTextField jTFnombre;
    // End of variables declaration//GEN-END:variables

    private void llenarComboBox(){
        jCBmeseros.removeAllItems();
        listaMeseros= meseroD.listarMeseros();//LISTAR MESEROS SOLO TRAE LOS QUE NO ESTÁN DE BAJA LOGICA. vienen  los baja=0
                for (Mesero item : listaMeseros) {
            //jCBmeseros.addItem(item.getDni()+", "+item.getApellido().toUpperCase()+", "+item.getNombre().toUpperCase());
            jCBmeseros.addItem(item);
            
        }
                jCBmeseros.setSelectedItem(null);
    }
    
    private void limpiarCamposTexto(){
    jTFdni.setText("");
    jTFapellido.setText("");
    jTFnombre.setText("");
    }
    
    private void refrescarVentana(){
        llenarComboBox();
        limpiarCamposTexto();
        jBmodificar.setEnabled(false);
        jBbaja.setEnabled(false);
       
        jTFdni.setEditable(false); 
        jTFapellido.setEditable(false); 
        jTFnombre.setEditable(false); 
    }

}