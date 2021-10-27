/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.eattogo.client.presentation;

import co.unicauca.eattogo.client.access.FactoryPlate;
import co.unicauca.eattogo.client.access.IPlateAccess;
import co.unicauca.eattogo.client.domain.services.PlateService;
import static co.unicauca.eattogo.client.infra.Messages.warningMessage;
import co.unicauca.eattogo.commons.domain.Plate;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Interfaz gráfica que permite visualizar los platos que se encuentran registrados
 */
public class GUIShowPlates extends javax.swing.JInternalFrame {
    /**
     * Atributos, variables de clase
     */
    private static List<Plate> plates;
    Plate plate = new Plate();

    /**
     * Creates new form GUIMostrarInformacion
     */
    public GUIShowPlates() {
        initComponents();
        initTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlSelectedPlate = new javax.swing.JPanel();
        txtNamePlate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        jspQuantity = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePlate = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(251, 140, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSelectedPlate.setBackground(new java.awt.Color(255, 255, 255));
        pnlSelectedPlate.setName(""); // NOI18N
        pnlSelectedPlate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNamePlate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNamePlate.setBorder(null);
        txtNamePlate.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNamePlate.setEnabled(false);
        txtNamePlate.setName(""); // NOI18N
        pnlSelectedPlate.add(txtNamePlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 130, 20));

        jLabel1.setText("Nombre Plato:");
        pnlSelectedPlate.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel2.setText("Descripcion:");
        pnlSelectedPlate.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        txtDescription.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDescription.setBorder(null);
        txtDescription.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDescription.setEnabled(false);
        pnlSelectedPlate.add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 130, 20));

        jLabel3.setText("Precio:");
        pnlSelectedPlate.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrice.setBorder(null);
        txtPrice.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPrice.setEnabled(false);
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        pnlSelectedPlate.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 130, 20));

        jLabel4.setText("Categoria:");
        pnlSelectedPlate.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txtCategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCategory.setBorder(null);
        txtCategory.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCategory.setEnabled(false);
        pnlSelectedPlate.add(txtCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 130, 20));

        jspQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        pnlSelectedPlate.add(jspQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 70, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cantidad del Platos:");
        pnlSelectedPlate.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Pedir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlSelectedPlate.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 100, 30));

        jPanel1.add(pnlSelectedPlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 300, 340));

        jTablePlate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Platos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePlate.setGridColor(new java.awt.Color(251, 140, 0));
        jTablePlate.setName("tablePlates"); // NOI18N
        jTablePlate.setRowHeight(30);
        jTablePlate.setSelectionBackground(new java.awt.Color(255, 167, 38));
        jTablePlate.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTablePlate.setShowHorizontalLines(false);
        jTablePlate.setShowVerticalLines(false);
        jTablePlate.setTableHeader(null);
        jTablePlate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePlateMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePlate);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 240, 340));

        jPanel3.setBackground(new java.awt.Color(251, 140, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Dutch801 XBd BT", 3, 36)); // NOI18N
        jLabel8.setText("Eat To Go");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 180, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 80));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Seleccione un plato");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 220, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Plato seleccionado:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(txtNamePlate.getText().isEmpty() && txtDescription.getText().isEmpty() && txtPrice.getText().isEmpty() && txtCategory.getText() == "Seleccione una Opcion"){
            JOptionPane.showMessageDialog(null, "No ha seleccionado el plato que desea pedir.");
        }else{       
            if ((Integer)jspQuantity.getValue() == 0){
                JOptionPane.showMessageDialog(null, "La cantidad de platos no es valida.");
            }else{
                JOptionPane.showMessageDialog(null, "Plato: " + txtNamePlate.getText() + "," + " Cantidad: " + jspQuantity.getValue(), "PEDIDO REALIZADO", JOptionPane.INFORMATION_MESSAGE, frameIcon);
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTablePlateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePlateMouseClicked
        // TODO add your handling code here:
        
        plate = plates.get(jTablePlate.getSelectedRow());
        txtNamePlate.setText(plate.getName());
        txtDescription.setText(plate.getDescription());
        txtPrice.setText(plate.getPrice()+"");
        txtCategory.setText(plate.getCategory()+"");
        
        
    }//GEN-LAST:event_jTablePlateMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIShowPlates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIShowPlates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIShowPlates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIShowPlates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                GUIShowPlates mostrar = new GUIShowPlates();
                mostrar.setVisible(true);
            }
        });
    }
    /**
     * Busca los platos que estén registrados y actualiza la tabla
     */
    public void initTable(){
        IPlateAccess service = FactoryPlate.getInstance().getPlateService();
        // Inyecta la dependencia
        PlateService plateService = new PlateService(service);
        
        try {
            
            plates = plateService.listPlate();
            
            plates.toString();
            
            showTable();

        } catch (Exception ex) {
            warningMessage(ex.getMessage(), "Atención");
        }
    }
    
    /**
     * Carga la tabla con los platos especiales registrados
     */
    public void showTable(){
        String matriz[][] = new String[plates.size()][1];
        
        for (int i = 0; i < plates.size(); i++) {
            //Aqui llenamos la matriz con la informacion de cada plato en forma de String
            Plate plato = plates.get(i);
            matriz[i][0] = plato.getName();
        }
        
        jTablePlate.setModel(new javax.swing.table.DefaultTableModel(
            matriz, new String [] {
                "Menú Platos Especiales"
            }
        ));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePlate;
    private javax.swing.JSpinner jspQuantity;
    private javax.swing.JPanel pnlSelectedPlate;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtNamePlate;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
