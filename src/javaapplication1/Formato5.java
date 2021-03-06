/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Component;
import java.awt.Point;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerDateModel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;

/**
 *
 * @author fservin
 */
public class Formato5 extends javax.swing.JFrame {
    private DefaultTableModel tabla;
    DecimalFormat decimales = new DecimalFormat("0.00");
    private String [] Largos =  {"1.25","2.62","Especiales"};
    private String [] Clasificacion = {"Primera","Segunda","Tercera","Otra Clasificacion","Medidas Especiales","Puntales","Morillos"};
    private JComboBox jcbClasificacion;
    private JComboBox jcbLargos;
    private double  volTotal,largos,Voltroza;
    private int fila, D1, D2; 
    private double d1 = 0,d2 = 0,uno = 0;
    private BigDecimal a = null,b;
    
    private void anadeListenerAlModelo(JTable tabla) {
        tabla.getModel().addTableModelListener(new TableModelListener() {

            @Override
            public void tableChanged(TableModelEvent evento) {
                actualizaTabla(evento);
            }  
        });
    }
    
    /**
     * Creates new form Formato4
     */
    @SuppressWarnings("empty-statement")
    public Formato5() {
        initComponents();
        anadeListenerAlModelo(jtFMRIA);
        
        tabla = (DefaultTableModel) jtFMRIA.getModel();
        
        jcbClasificacion = new JComboBox(Clasificacion);
        TableColumn columnaC = jtFMRIA.getColumnModel().getColumn(1);
        TableCellEditor tceC = new DefaultCellEditor(jcbClasificacion);
        columnaC.setCellEditor(tceC);
        
        jcbLargos = new JComboBox(Largos);
        TableColumn  columnaL = jtFMRIA.getColumnModel().getColumn(2);
        TableCellEditor tceL = new DefaultCellEditor(jcbLargos);
        columnaL.setCellEditor(tceL);   
        
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        String [] clasificados = {"Primario","Secundario","Otros"};
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtFMRIA = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnAgregarFila = new javax.swing.JButton();
        btnEliminarFila = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbVolTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxfNombrePersonal = new javax.swing.JTextField();
        cbProcedencia = new javax.swing.JComboBox();
        dcFechaIngreso = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formato para MR Ingresada para Aserrar");
        jLabel1.setToolTipText("");

        jLabel2.setText("Registro de la Madera en Rollo que Ingresa para Aserrio");

        jtFMRIA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pieza", "Clasificacion", "Largo", "D1", "D2", "DM", "M3R"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtFMRIA.setColumnSelectionAllowed(true);
        jtFMRIA.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtFMRIA);
        jtFMRIA.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnAgregarFila.setText("Agregar Fila");
        btnAgregarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFilaActionPerformed(evt);
            }
        });

        btnEliminarFila.setText("Eliminar Fila");
        btnEliminarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFilaActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");

        jLabel14.setText("Formato 05");

        jLabel15.setText("Volumen Total: ");

        jLabel3.setText("Fecha de Ingreso");

        jLabel4.setText("Procedencia");

        jLabel5.setText("Nombre del Personal:");

        cbProcedencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Propia", "Maquila" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(256, 256, 256)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbProcedencia, 0, 235, Short.MAX_VALUE)
                                        .addGap(225, 225, 225)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbVolTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dcFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jtxfNombrePersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarFila)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarFila)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addGap(13, 13, 13)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtxfNombrePersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2))
                    .addComponent(dcFechaIngreso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(lbVolTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarFila)
                    .addComponent(btnEliminarFila)
                    .addComponent(btnGuardar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void actualizaTabla(TableModelEvent evento){
        
        if(evento.getType() == TableModelEvent.UPDATE){
            
            tabla = ((DefaultTableModel)(evento.getSource()) );
            
            int fila = evento.getFirstRow();
            int columna = evento.getColumn();
            
            if( columna != 2 && columna != 4){
                return;
            }try{
                
                if( columna  == 2 ){
                    
                    System.out.println("Hola");
                    int largo = jcbLargos.getSelectedIndex();
                    
                    if (largo == 2){
                        
                        JFrame frame = new JFrame("Largos");
                        String nlargo = JOptionPane.showInputDialog(frame, "Ingrese el largo:");
                        largos = Double.parseDouble(nlargo);
                        
                        Object [] l = new Object[4];
                        l[0] = "1.25";
                        l[1] = "2.26";
                        l[2] = "Especiales";
                        l[3] = nlargo;
                        
                        jcbLargos = new JComboBox(l);
                        TableColumn  columnaL = jtFMRIA.getColumnModel().getColumn(2);
                        TableCellEditor tceL = new DefaultCellEditor(jcbLargos);
                        columnaL.setCellEditor(tceL);  
                        jcbLargos.setSelectedItem(nlargo);
                        
                    }else if(largo == 1){
                       largos = 2.26;
                    }else if(largo == 0){
                       largos = 1.25;
                    }
                    
                }else if( columna == 4 ){
                    d1 = ((Number) tabla.getValueAt(fila,3)).doubleValue();
                    d2 = ((Number) tabla.getValueAt(fila,4)).doubleValue();
                    double dos = Math.pow( d1*d2 / 2 , 2 );

                    
                    a = new BigDecimal(dos);
                    a = a.setScale(2, RoundingMode.HALF_UP);
                    
                    tabla.setValueAt( a.doubleValue() ,fila, 5);
                    //System.out.println(a.doubleValue());
                    
                    uno = Math.PI / 4;
                    
                    Voltroza = uno * a.doubleValue() * largos;
                    
                    System.out.println(uno);
                    System.out.println(a.doubleValue());
                    System.out.println(largos);
                    
                    b = new BigDecimal(Voltroza);
                    b = b.setScale(2, RoundingMode.HALF_UP);
                    
                    tabla.setValueAt(b.doubleValue(), fila, 6);
                    System.out.println("final: "+b.doubleValue());
                       
                    volTotal += Voltroza;
                    lbVolTotal.setText( decimales.format(volTotal) );
                }
                
            }catch(NullPointerException e){
                
            }
            
            
        }
    }
    
    
    private void btnAgregarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFilaActionPerformed
        // TODO add your handling code here:
        tabla.addRow(new Object[]{});   
     
        int value = tabla.getRowCount();
            
        tabla.setValueAt(value, value -1, 0);
        jtFMRIA.setRowSelectionInterval(value - 1, value - 1);
        jtFMRIA.editCellAt( value - 1 , 1);  
        
        fila = jtFMRIA.getSelectedRow();
        
    }//GEN-LAST:event_btnAgregarFilaActionPerformed

    private void btnEliminarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFilaActionPerformed
        // TODO add your handling code here:
        if (tabla.getRowCount() > 0){
                    
            Object valueAt = tabla.getValueAt(tabla.getRowCount() -1, 6);
            volTotal -= Double.parseDouble(valueAt.toString());
            lbVolTotal.setText( decimales.format(volTotal) );
            
            tabla.removeRow(tabla.getRowCount() -1 );      
        }           
    }//GEN-LAST:event_btnEliminarFilaActionPerformed

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
            java.util.logging.Logger.getLogger(Formato4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formato4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formato4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formato4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
             
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formato5().setVisible(true);           
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarFila;
    private javax.swing.JButton btnEliminarFila;
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbProcedencia;
    private datechooser.beans.DateChooserCombo dcFechaIngreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtFMRIA;
    private javax.swing.JTextField jtxfNombrePersonal;
    private javax.swing.JLabel lbVolTotal;
    // End of variables declaration//GEN-END:variables
}
