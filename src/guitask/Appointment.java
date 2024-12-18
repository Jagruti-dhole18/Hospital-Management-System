/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitask;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author HP
 */
public class Appointment extends javax.swing.JFrame {

   static Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public Appointment() {
        initComponents();
        jPanel1.setBackground(new Color(250,250,250,100));
         con = DatabaseConnection.getConnection();
        
        doctor_combo.addItem("Select doctor's name");
        doctor_combo.addItem("Dr. Ananya Sharma");
        doctor_combo.addItem("Dr. Rakesh Wadile");
        doctor_combo.addItem("Dr. Vikram Singh");
        doctor_combo.addItem("Dr. Priya Nair");
        doctor_combo.addItem("Dr. Rajesh Patel");
        doctor_combo.addItem("Dr. Meera Iyer");
        doctor_combo.addItem("Dr. Arjun Reddy");
        doctor_combo.addItem("Dr. Kavita Gupta");
        doctor_combo.addItem("Dr. Sameer Khan");
        
        
        time_combo.addItem("Select time slot");
        time_combo.addItem("10.00 am");
        time_combo.addItem("1.00 pm");
        time_combo.addItem("3.00 pm");
        time_combo.addItem("5.00 pm");
        time_combo.addItem("7.00 pm");
        time_combo.addItem("9.00 pm");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        home_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        patient_id_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        patient_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        contact_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        special_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        doc_no_txt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        date_txt = new javax.swing.JTextField();
        time_combo = new javax.swing.JComboBox<>();
        doctor_combo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        appointment_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Register here!");

        home_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\frame images\\homefinal.png")); // NOI18N
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Patient ID:");

        patient_id_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patient_id_txtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Patient Name:");

        patient_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patient_txtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Contact Number:");

        contact_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact_txtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Doctor's Name:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Specialization:");

        special_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                special_txtActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Time Slot:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Doctor's Number:");

        doc_no_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doc_no_txtActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Date:");

        date_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_txtActionPerformed(evt);
            }
        });

        time_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time_comboActionPerformed(evt);
            }
        });

        doctor_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctor_comboActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("(YYYY-MM-DD)");

        back_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        appointment_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        appointment_btn.setText("Book Appointment");
        appointment_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointment_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(home_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(315, 315, 315))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(patient_id_txt))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(special_txt)
                                    .addComponent(doctor_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(patient_txt)))
                        .addGap(255, 255, 255))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(contact_txt)
                                .addGap(317, 317, 317))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(time_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(314, 314, 314))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(date_txt))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(doc_no_txt)))
                                .addGap(333, 333, 333))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(appointment_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(home_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patient_id_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patient_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contact_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctor_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(special_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doc_no_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(time_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(appointment_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(back_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 90, 730, 800));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\frame images\\stetoscopefinal.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btnActionPerformed

           new HospitalManagementSystem().show();
        dispose();
    }//GEN-LAST:event_home_btnActionPerformed

    private void patient_id_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patient_id_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patient_id_txtActionPerformed

    private void patient_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patient_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patient_txtActionPerformed

    private void contact_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contact_txtActionPerformed

    private void special_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_special_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_special_txtActionPerformed

    private void doc_no_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doc_no_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doc_no_txtActionPerformed

    private void date_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date_txtActionPerformed

    private void time_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_time_comboActionPerformed

    private void doctor_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctor_comboActionPerformed
       if(doctor_combo.getSelectedItem().toString().equals("Select doctor's name")){
          special_txt.setText("");
            doc_no_txt.setText("");}
        else if(doctor_combo.getSelectedItem().toString().equals("Dr. Ananya Sharma")){
          special_txt.setText("Primary Care physician");
        doc_no_txt.setText("9435268923");}
        else if(doctor_combo.getSelectedItem().toString().equals("Dr. Rakesh Wadile")){
          special_txt.setText("Cardiologist child specialist");
        doc_no_txt.setText("9876543240");}
       else if(doctor_combo.getSelectedItem().toString().equals("Dr. Vikram Singh")){
          special_txt.setText(" Orthopedic Surgeon");
       doc_no_txt.setText("9465734261");}
      else if(doctor_combo.getSelectedItem().toString().equals("Dr. Priya Nair")){
          special_txt.setText("General practitioner");
      doc_no_txt.setText("9087453214");}
       else if(doctor_combo.getSelectedItem().toString().equals("Dr. Rajesh Patel")){
          special_txt.setText("Neurologist");
       doc_no_txt.setText("9344675890");}
       else if(doctor_combo.getSelectedItem().toString().equals("Dr. Meera Iyer")){
          special_txt.setText("Dermatologist");
       doc_no_txt.setText("9267453890");}
      else if(doctor_combo.getSelectedItem().toString().equals("Dr. Arjun Reddy")){
          special_txt.setText("General Surgeon");
      doc_no_txt.setText("9964555321");}
       else if(doctor_combo.getSelectedItem().toString().equals("Dr. Kavita Gupta")){
          special_txt.setText("Oncologist");
       doc_no_txt.setText("9898904567");}
       else if(doctor_combo.getSelectedItem().toString().equals("Dr. Sameer Khan")){
          special_txt.setText("Gastroenterologist");
       doc_no_txt.setText("9875123490");}
    }//GEN-LAST:event_doctor_comboActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
         new HospitalManagementSystem().show();
        dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void appointment_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointment_btnActionPerformed
       if(patient_id_txt.getText().equals(""))
           JOptionPane.showMessageDialog(null,"patient ID is mandetory");
        else if(patient_txt.getText().equals(""))
           JOptionPane.showMessageDialog(null,"patient name is mandetory");
        else if(contact_txt.getText().equals(""))
           JOptionPane.showMessageDialog(null,"phone number is mandetory");
      else if(doctor_combo.getSelectedItem().toString().equals("Select doctor's name"))
      JOptionPane.showMessageDialog(null,"select name of the doctor");
        else if(time_combo.getSelectedItem().toString().equals("Select time slot"))
           JOptionPane.showMessageDialog(null,"time slot selection is mandetory"); 
        else if(date_txt.getText().equals(""))
           JOptionPane.showMessageDialog(null,"date is mandetory");
       else
            JOptionPane.showMessageDialog(null,"Appointment is done!!");
       
       try{
           String sql = "insert into appointment values(?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);
           
            pst.setInt(1,Integer.parseInt(patient_id_txt.getText()));
            pst.setString(2, patient_txt.getText());
            pst.setString(3, contact_txt.getText());
            String doctor_name;
            doctor_name = doctor_combo.getSelectedItem().toString();
            pst.setString(4, doctor_name);
            pst.setString(5, special_txt.getText());
            
            String time;
            time = time_combo.getSelectedItem().toString();
            pst.setString(6, time);
            pst.setString(7, doc_no_txt.getText());
            pst.setString(8, date_txt.getText());
            
             pst.executeUpdate();
           
            con.close();
       } catch (NumberFormatException | SQLException ex) {
          
            JOptionPane.showMessageDialog(null, ex);
         }
       
    }//GEN-LAST:event_appointment_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Appointment().setVisible(true);
        });
         try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                
                 }
                catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e)
                {
                }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appointment_btn;
    private javax.swing.JButton back_btn;
    private javax.swing.JTextField contact_txt;
    private javax.swing.JTextField date_txt;
    private javax.swing.JTextField doc_no_txt;
    private javax.swing.JComboBox<String> doctor_combo;
    private javax.swing.JButton home_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField patient_id_txt;
    private javax.swing.JTextField patient_txt;
    private javax.swing.JTextField special_txt;
    private javax.swing.JComboBox<String> time_combo;
    // End of variables declaration//GEN-END:variables
}
