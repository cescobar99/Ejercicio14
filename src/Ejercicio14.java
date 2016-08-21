
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Ejercicio14 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio14
     */
    public Ejercicio14() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroDias = new javax.swing.JTextField();
        txtMontoTotal = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Hotel");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 11, 50, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 487, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Numero de Dias");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 58, 100, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Monto Total");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, 20));

        txtNumeroDias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroDiasKeyTyped(evt);
            }
        });
        getContentPane().add(txtNumeroDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 190, -1));

        txtMontoTotal.setEditable(false);
        txtMontoTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoTotalKeyTyped(evt);
            }
        });
        getContentPane().add(txtMontoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 190, -1));

        cmdCalcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdCalcular.setForeground(new java.awt.Color(0, 255, 0));
        cmdCalcular.setText("CALCULAR");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        cmdBorrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdBorrar.setForeground(new java.awt.Color(0, 255, 0));
        cmdBorrar.setText("BORRAR");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
    String MontoT;
    int NumDias;
    double op, op1=0;
    if(txtNumeroDias.getText().trim().isEmpty()){
    JOptionPane.showMessageDialog(this, "Digite el numero de dias", "Error", JOptionPane.ERROR_MESSAGE);
    txtNumeroDias.requestFocusInWindow();
    }
    else {
    NumDias= Integer.parseInt(txtNumeroDias.getText());
    op= NumDias-1;
    op1= 100000+(op*200000);
    }
    MontoT= String.valueOf(op1);
    txtMontoTotal.setText(MontoT);
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
    txtNumeroDias.setText("");
    txtMontoTotal.setText("");
    
    txtNumeroDias.requestFocusInWindow();
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtNumeroDiasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroDiasKeyTyped
    char c=evt.getKeyChar();
    
    if(!Character.isDigit(c)){
    getToolkit().beep();
    evt.consume();
    }
    }//GEN-LAST:event_txtNumeroDiasKeyTyped

    private void txtMontoTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoTotalKeyTyped
    char c=evt.getKeyChar();
    
    if(!Character.isDigit(c)){
    getToolkit().beep();
    evt.consume();
    }
    }//GEN-LAST:event_txtMontoTotalKeyTyped

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
            java.util.logging.Logger.getLogger(Ejercicio14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio14().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMontoTotal;
    private javax.swing.JTextField txtNumeroDias;
    // End of variables declaration//GEN-END:variables
}
