/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.Receptionist;

/**
 *
 * @author Chashika
 */
public class PatientView extends javax.swing.JInternalFrame {

    /**
     * Creates new form PatientView
     */
    public PatientView() {
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

        btnRegistration = new javax.swing.JButton();
        btnPAtientInfo = new javax.swing.JButton();
        btnDischarge = new javax.swing.JButton();
        btnTests = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(410, 200));
        setPreferredSize(new java.awt.Dimension(440, 320));
        getContentPane().setLayout(null);

        btnRegistration.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistration.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistration.setText("Patient Registration");
        btnRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrationActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistration);
        btnRegistration.setBounds(130, 30, 145, 34);

        btnPAtientInfo.setBackground(new java.awt.Color(0, 0, 0));
        btnPAtientInfo.setForeground(new java.awt.Color(255, 255, 255));
        btnPAtientInfo.setText("Patient Info");
        btnPAtientInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPAtientInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPAtientInfo);
        btnPAtientInfo.setBounds(130, 80, 145, 37);

        btnDischarge.setBackground(new java.awt.Color(0, 0, 0));
        btnDischarge.setForeground(new java.awt.Color(255, 255, 255));
        btnDischarge.setText("Discharge");
        btnDischarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDischargeActionPerformed(evt);
            }
        });
        getContentPane().add(btnDischarge);
        btnDischarge.setBounds(130, 130, 145, 37);

        btnTests.setBackground(new java.awt.Color(0, 0, 0));
        btnTests.setForeground(new java.awt.Color(255, 255, 255));
        btnTests.setText("Tests");
        btnTests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestsActionPerformed(evt);
            }
        });
        getContentPane().add(btnTests);
        btnTests.setBounds(130, 190, 145, 38);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/logosmall.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 60, 220, 230);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/Backgrounds_Light_blue_background_035584_.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 470, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrationActionPerformed
        PatientRegistration pr = new PatientRegistration();
        pr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrationActionPerformed

    private void btnPAtientInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPAtientInfoActionPerformed
        GetPatientDetails getp = new GetPatientDetails();
        getp.setVisible(true);
        
    }//GEN-LAST:event_btnPAtientInfoActionPerformed

    private void btnDischargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDischargeActionPerformed
        PatientDischarge pd = new  PatientDischarge();
        pd.setVisible(true);
    }//GEN-LAST:event_btnDischargeActionPerformed

    private void btnTestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestsActionPerformed
        Testinfo ti = new Testinfo();
        ti.setVisible(true);
    }//GEN-LAST:event_btnTestsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDischarge;
    private javax.swing.JButton btnPAtientInfo;
    private javax.swing.JButton btnRegistration;
    private javax.swing.JButton btnTests;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
