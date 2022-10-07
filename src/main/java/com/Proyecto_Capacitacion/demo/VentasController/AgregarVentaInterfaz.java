/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.Proyecto_Capacitacion.demo.VentasController;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import java.math.BigDecimal;

/**
 *
 * @author TESTER
 */
public class AgregarVentaInterfaz extends javax.swing.JFrame {

    /**
     * Creates new form AgregarVentaInterfaz
     */
    public AgregarVentaInterfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPartidas = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        Folio = new javax.swing.JTextField();
        agregarPartida = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Total = new javax.swing.JTextField();
        salir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Articulo = new javax.swing.JTextField();
        Cantidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Precio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        estadoPartida = new javax.swing.JComboBox<>();
        AgregarVenta = new javax.swing.JButton();
        eliminarPartida = new javax.swing.JButton();
        ModificarVenta = new javax.swing.JButton();
        resultadoFolio = new javax.swing.JLabel();
        ConsultarVenta = new javax.swing.JButton();
        EstadoVenta = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        siLimpiar = new javax.swing.JRadioButton();
        noLimpiar = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        agregarRenglon = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        datosPrueba = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Manejo de ventas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        tablaPartidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Articulo", "Cantidad", "Precio", "Estado", "Importe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPartidas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tablaPartidasPropertyChange(evt);
            }
        });
        tablaPartidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaPartidasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaPartidasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tablaPartidasKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(tablaPartidas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 840, 370));

        jLabel6.setText("Folio:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        Folio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FolioActionPerformed(evt);
            }
        });
        getContentPane().add(Folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 100, -1));

        agregarPartida.setText("Agregar Partida");
        agregarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPartidaActionPerformed(evt);
            }
        });
        getContentPane().add(agregarPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 140, -1));

        jLabel7.setText("Total:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, -1, -1));

        Total.setEditable(false);
        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });
        getContentPane().add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 100, -1));

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 100, -1));

        jLabel8.setText("Articulo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        Articulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArticuloActionPerformed(evt);
            }
        });
        getContentPane().add(Articulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 100, -1));

        Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadActionPerformed(evt);
            }
        });
        Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CantidadKeyPressed(evt);
            }
        });
        getContentPane().add(Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 100, -1));

        jLabel10.setText("Precio:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioActionPerformed(evt);
            }
        });
        getContentPane().add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 100, -1));

        jLabel11.setText("Estado:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        estadoPartida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activa", "Pagada", "Cancelada" }));
        estadoPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoPartidaActionPerformed(evt);
            }
        });
        getContentPane().add(estadoPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 100, -1));

        AgregarVenta.setText("Agregar Venta");
        AgregarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarVentaActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 140, -1));

        eliminarPartida.setText("Eliminar Partida");
        eliminarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPartidaActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 140, -1));

        ModificarVenta.setText("Modificar Venta");
        ModificarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarVentaActionPerformed(evt);
            }
        });
        getContentPane().add(ModificarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 140, -1));

        resultadoFolio.setText(".");
        getContentPane().add(resultadoFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 260, 20));

        ConsultarVenta.setText("Consultar Venta");
        ConsultarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarVentaActionPerformed(evt);
            }
        });
        getContentPane().add(ConsultarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 140, -1));

        EstadoVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activa", "Pagada", "Cancelada" }));
        EstadoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoVentaActionPerformed(evt);
            }
        });
        getContentPane().add(EstadoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 100, -1));

        jLabel12.setText("Estado:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        siLimpiar.setSelected(true);
        siLimpiar.setText("Si");
        siLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(siLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        noLimpiar.setText("No");
        getContentPane().add(noLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel1.setText("¿Limpiar al agregar?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        agregarRenglon.setText("Agregar renglón");
        agregarRenglon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarRenglonActionPerformed(evt);
            }
        });
        getContentPane().add(agregarRenglon, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 140, -1));

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 100, -1));

        jLabel13.setText("Cantidad:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        datosPrueba.setText("datos prueba");
        datosPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosPruebaActionPerformed(evt);
            }
        });
        getContentPane().add(datosPrueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FolioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FolioActionPerformed

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void ArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArticuloActionPerformed

    private void CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadActionPerformed

    private void PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioActionPerformed

    private void estadoPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoPartidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoPartidaActionPerformed

    private void agregarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPartidaActionPerformed

        try {

            //Declarar variables
            String articulo = Articulo.getText();
            BigDecimal cantidad = BigDecimal.valueOf(Double.parseDouble(Cantidad.getText()));
            BigDecimal precio = BigDecimal.valueOf(Double.parseDouble(Precio.getText()));
            String estado = estadoPartida.getSelectedItem().toString();
            BigDecimal total = BigDecimal.valueOf(Double.parseDouble(Total.getText()));

            //Calcular importe
            BigDecimal importe = cantidad.multiply(precio);

            //Calcular total
            total = total.add(importe);

            //Actualizar total
            Total.setText("" + total);

            //Declarar modelo de tabla
            DefaultTableModel model = (DefaultTableModel) tablaPartidas.getModel();

            //Agregar partida con sus datos
            model.addRow(new Object[]{articulo, cantidad, precio, estado, importe});

            //Limpiamos las cajas de texto
            limpiar();

        } catch (NumberFormatException e) {
            System.out.println("Ingrese valores númericos válidos");
        }


    }//GEN-LAST:event_agregarPartidaActionPerformed

    private void eliminarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPartidaActionPerformed
        // TODO add your handling code here:

        //Declarar modelo de tabla
        DefaultTableModel model = (DefaultTableModel) tablaPartidas.getModel();

        //get indice seleccionado
        int indexSeleccionado = tablaPartidas.getSelectedRow();

        //Declarar variable total
        BigDecimal total = BigDecimal.valueOf(Double.parseDouble(Total.getText()));

        //get valor del importe seleccionado
        String valorSeleccionado = "" + model.getValueAt(indexSeleccionado, 4);

        //Validar que no esté vacio
        if (!(valorSeleccionado.equals("null"))) {
            //Le restamos el importe al total de la venta
            total = total.subtract(BigDecimal.valueOf(Double.parseDouble(valorSeleccionado)));
        }

        //Actualizamos el valor
        Total.setText("" + total);

        //Manejar las partidas eliminadas
        if (indexSeleccionado < idPartida.size()) {
            idPartidaBorrar.add(idPartida.get(indexSeleccionado));
            idPartida.remove(indexSeleccionado);
        }

        //Borramos la partida seleccionada
        model.removeRow(indexSeleccionado);
    }//GEN-LAST:event_eliminarPartidaActionPerformed

    private void ModificarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarVentaActionPerformed

        System.out.println("idVenta - " + idVenta);

        //Actualizar venta
        if (Folio.getText().isEmpty()) {
            resultadoFolio.setText("Ingrese un Folio");
            return;
        }

        if (idVenta == 0L) {
            resultadoFolio.setText("Consulte una venta antes de modificar");
            return;
        }

        calcularImporte();

        String folio = Folio.getText();

        resultadoFolio.setText("");
        Total.setText("0");

        ModificarVenta modVenta = new ModificarVenta();

        //Declarar modelo de tabla
        DefaultTableModel model = (DefaultTableModel) tablaPartidas.getModel();

        modVenta.ModificarVenta(folio, EstadoVenta.getSelectedItem().toString(), model, idVenta, idPartida, idPartidaBorrar);

        resultadoFolio.setText("Venta modificada");

        idVenta = 0L;
        idPartida.clear();
        idPartidaBorrar.clear();

        if (siLimpiar.isSelected()) {
            limpiar();
            limpiarTabla();
            Folio.setText("");
            Total.setText("0");
        }

    }//GEN-LAST:event_ModificarVentaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        limpiarTodo();

        //RadioButton group para que solo se pueda seleccionar uno
        ButtonGroup G = new ButtonGroup();
        G.add(siLimpiar);
        G.add(noLimpiar);

    }//GEN-LAST:event_formWindowOpened

    private void ConsultarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarVentaActionPerformed

        if (Folio.getText().isEmpty()) {
            resultadoFolio.setText("Ingrese un Folio");
            return;
        }

        //Consultar venta
        String folio = Folio.getText();

        ConsultarVenta conVenta = new ConsultarVenta();

        //Le mandamos el folio a la clase "JsonVenta"
        //  nos regresa el Json de la venta
        String ventasJson = conVenta.JsonVenta(folio);

        //Limpiamos las cajas de texto
        limpiar();
        limpiarTabla();

        //Validamos que el folio exista
        if (ventasJson.equals("")) {
            resultadoFolio.setText("Folio [" + folio + "] no encontrado");
            return;
        }
        resultadoFolio.setText("Venta con folio [" + folio + "] cargada");

        //Declarar modelo de tabla
        DefaultTableModel model = (DefaultTableModel) tablaPartidas.getModel();

        //Mostrar la venta en la tabla
        try {

            //Lista de objetos para retornar los resultados
            List<Object> resultado;

            resultado = conVenta.MostrarVenta(ventasJson, model);

            //Actualizar total
            Total.setText("" + resultado.get(0));

            //Asignar valores obtenidos del idVenta e idPartida
            idVenta = (Long) resultado.get(1);
            idPartida = (List<Long>) resultado.get(2);

            String estado = (String) resultado.get(3);

            SetEstadoVenta(estado);

        } catch (Exception e) {
            System.out.println("Error Mapper - " + e);
        }

    }//GEN-LAST:event_ConsultarVentaActionPerformed

    private void AgregarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarVentaActionPerformed

        //Agregar venta
        String folio = Folio.getText();

        if (folio.isEmpty()) {
            resultadoFolio.setText("Ingrese un Folio");
            return;
        }

        calcularImporte();

        AgregarVenta aggVenta = new AgregarVenta();

        //Declarar modelo de tabla
        DefaultTableModel model = (DefaultTableModel) tablaPartidas.getModel();

        if (aggVenta.AggregarVenta(folio, EstadoVenta.getSelectedItem().toString(), model)) {
            resultadoFolio.setText("Venta con folio [" + folio + "] agregada");
        } else {
            resultadoFolio.setText("Venta con folio [" + folio + "] no agregada");
        }

        //Validar folio duplicado
//        res_folio.setText("Venta agregada");
        if (siLimpiar.isSelected()) {
            limpiar();
            limpiarTabla();
            Folio.setText("");
            Total.setText("0");
        }

    }//GEN-LAST:event_AgregarVentaActionPerformed

    private void EstadoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadoVentaActionPerformed

    private void siLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siLimpiarActionPerformed

    private void agregarRenglonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarRenglonActionPerformed
        // TODO add your handling code here:
        agregarRenglon();
    }//GEN-LAST:event_agregarRenglonActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
        limpiarTabla();
        Folio.setText("");
        Total.setText("0");
        resultadoFolio.setText("");
        idVenta = 0L;
        idPartida.clear();
        idPartidaBorrar.clear();
    }//GEN-LAST:event_limpiarActionPerformed

    private void tablaPartidasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaPartidasKeyTyped
        // TODO add your handling code here:
        updateTable();
    }//GEN-LAST:event_tablaPartidasKeyTyped

    private void tablaPartidasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaPartidasKeyPressed
        // TODO add your handling code here:    
        updateTable();
    }//GEN-LAST:event_tablaPartidasKeyPressed

    private void tablaPartidasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaPartidasKeyReleased
        // TODO add your handling code here:
        updateTable();
    }//GEN-LAST:event_tablaPartidasKeyReleased

    private void tablaPartidasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tablaPartidasPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaPartidasPropertyChange

    private void CantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadKeyPressed

    private void datosPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosPruebaActionPerformed
        // TODO add your handling code here:

        //Declarar modelo de tabla
        DefaultTableModel model = (DefaultTableModel) tablaPartidas.getModel();

        agregarRenglon();
        agregarRenglon();
        agregarRenglon();

        model.setValueAt("aa", 0, 0);
        model.setValueAt((double) 11, 0, 1);
        model.setValueAt((double) 22, 0, 2);
        model.setValueAt("Activa", 0, 3);
        model.setValueAt((double) 242, 0, 4);

        model.setValueAt("bb", 1, 0);
        model.setValueAt((double) 33, 1, 1);
        model.setValueAt((double) 44, 1, 2);
        model.setValueAt("Pagada", 1, 3);
        model.setValueAt((double) 1452, 1, 4);

        model.setValueAt("cc", 2, 0);
        model.setValueAt((double) 55, 2, 1);
        model.setValueAt((double) 66, 2, 2);
        model.setValueAt("Cancelada", 2, 3);
        model.setValueAt((double) 3630, 2, 4);

        Total.setText("5324");

    }//GEN-LAST:event_datosPruebaActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarVentaInterfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarVentaInterfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarVentaInterfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarVentaInterfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new AgregarVentaInterfaz().setVisible(true);
            }
        });
    }

    public void updateTable() {

        //Actualizar importes y total
        //Declarar modelo de tabla
        DefaultTableModel model = (DefaultTableModel) tablaPartidas.getModel();

        //get indice seleccionado
        int indexSeleccionado = tablaPartidas.getSelectedRow();

        //Declarar variable total
        BigDecimal total = BigDecimal.valueOf(Double.parseDouble(Total.getText()));

        //get valor del importe seleccionado
        String valorSeleccionado;
        if (model.getValueAt(indexSeleccionado, 1).toString().isEmpty() || model.getValueAt(indexSeleccionado, 2).toString().isEmpty()) {
            return;
        } else {
            valorSeleccionado = "" + model.getValueAt(indexSeleccionado, 4);
        }

        double cantidad = Double.parseDouble("" + model.getValueAt(indexSeleccionado, 1));
        double precio = Double.parseDouble("" + model.getValueAt(indexSeleccionado, 2));
        BigDecimal importe = BigDecimal.valueOf(cantidad).multiply(BigDecimal.valueOf(precio));

        //Cambiar el total
        total = total.add(importe.subtract(BigDecimal.valueOf(Double.parseDouble(valorSeleccionado))));

        //Actualizar total
        Total.setText("" + total);

        model.setValueAt(importe, indexSeleccionado, 4);
    }

    public void agregarRenglon() {
        DefaultTableModel model = (DefaultTableModel) tablaPartidas.getModel();
        model.addRow(new Object[]{"", "", "", "", "0"});
    }

    public void limpiar() {
        Articulo.setText("");
        Cantidad.setText("");
        Precio.setText("");
        EstadoVenta.setSelectedIndex(0);
        estadoPartida.setSelectedIndex(0);
    }

    public void limpiarTabla() {
        DefaultTableModel tblModel = (DefaultTableModel) tablaPartidas.getModel();

        while (tblModel.getRowCount() > 0) {
            tblModel.removeRow(0);
        }
    }

    public void soloNumeros(KeyEvent e) {

        System.out.println("Función");
        char c = e.getKeyChar();
        if (((c >= '0') && (c <= '9')) || (c == KeyEvent.VK_BACK_SPACE)) {
            System.out.println("Solo numeros");
            e.consume();  // if it's not a number, ignore the event
        }
    }

    public void calcularImporte() {

        //Actualizar importes y total
        //Declarar modelo de tabla
        DefaultTableModel model = (DefaultTableModel) tablaPartidas.getModel();

        BigDecimal total = BigDecimal.valueOf(0);

        for (int i = 0; i < tablaPartidas.getRowCount(); i++) {

            //Declarar variable total
            double cantidad = Double.parseDouble("" + model.getValueAt(i, 1));
            double precio = Double.parseDouble("" + model.getValueAt(i, 2));
            BigDecimal importe = BigDecimal.valueOf(cantidad).multiply(BigDecimal.valueOf(precio));

            model.setValueAt(importe, i, 4);

            //Cambiar el total
            total = total.add(importe);
        }
        //Actualizar total
        Total.setText("" + total);
    }

    public void limpiarTodo() {
        limpiar();
        limpiarTabla();
        Folio.setText("");
        Total.setText("0");
        resultadoFolio.setText("");
    }

    public void SetEstadoVenta(String estado) {
        //Usar enums
        switch (estado) {
            case "Activa":
                EstadoVenta.setSelectedIndex(0);
                break;
            case "Pagada":
                EstadoVenta.setSelectedIndex(1);
                break;
            case "Cancelada":
                EstadoVenta.setSelectedIndex(2);
                break;
            default:
                EstadoVenta.setSelectedIndex(0);
        }
    }

    //Variables
    public Long idVenta = 0L;
    public List<Long> idPartida = new ArrayList<Long>();
    public List<Long> idPartidaBorrar = new ArrayList<Long>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarVenta;
    private javax.swing.JTextField Articulo;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JButton ConsultarVenta;
    private javax.swing.JComboBox<String> EstadoVenta;
    private javax.swing.JTextField Folio;
    private javax.swing.JButton ModificarVenta;
    private javax.swing.JTextField Precio;
    private javax.swing.JTextField Total;
    private javax.swing.JButton agregarPartida;
    private javax.swing.JButton agregarRenglon;
    private javax.swing.JButton datosPrueba;
    private javax.swing.JButton eliminarPartida;
    private javax.swing.JComboBox<String> estadoPartida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiar;
    private javax.swing.JRadioButton noLimpiar;
    private javax.swing.JLabel resultadoFolio;
    private javax.swing.JButton salir;
    private javax.swing.JRadioButton siLimpiar;
    private javax.swing.JTable tablaPartidas;
    // End of variables declaration//GEN-END:variables

}
