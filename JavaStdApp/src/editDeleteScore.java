
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class editDeleteScore extends javax.swing.JFrame {

    /**
     * Creates new form editDeleteScore
     */
    score sc = new score();
    public editDeleteScore() {
        initComponents();
        sc.fillScoreJtable(jTable1);
        jTable1.setRowHeight(40);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.yellow);
        jTable1.setSelectionBackground(Color.BLUE);
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
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonEditScore = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField_CourseId = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField_Description = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Score = new javax.swing.JTextField();
        jTextField_StudentId = new javax.swing.JTextField();
        jButtonAddScore = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Edit / Delete Score");
        jLabel1.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Course Id:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Score:");

        jButtonEditScore.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEditScore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit.png"))); // NOI18N
        jButtonEditScore.setText("Edit");
        jButtonEditScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditScoreActionPerformed(evt);
            }
        });

        jButtonRemove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close.png"))); // NOI18N
        jButtonRemove.setText("Remove");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Student Id:");

        jTextField_CourseId.setEditable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "Course Id", "Scores", "Description"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Description:");

        jTextField_StudentId.setEditable(false);

        jButtonAddScore.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAddScore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add.png"))); // NOI18N
        jButtonAddScore.setText("Add");
        jButtonAddScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddScoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_CourseId, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                    .addComponent(jTextField_Description)
                                    .addComponent(jTextField_Score)))
                            .addComponent(jTextField_StudentId))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditScore, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddScore, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(388, 388, 388))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField_StudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField_CourseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_Score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_Description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEditScore, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAddScore, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditScoreActionPerformed
        // TODO add your handling code here:
        int sid = Integer.valueOf(jTextField_StudentId.getText());
        int cid = Integer.valueOf(jTextField_CourseId.getText());
        double scr = Double.valueOf(jTextField_Score.getText());
        String ds = jTextField_Description.getText();
        
        sc.insertUpdateDeleteCourse('u', sid, cid, scr, ds);
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Student Id", "Course Id", "Score", "Description"}));
        sc.fillScoreJtable(jTable1);
//        int stdId = Integer.valueOf(jTextField_CourseId.getText());
//        int crsId = c.getCourseId(jComboBoxCourseId.getSelectedItem().toString());
//        double scr = Double.valueOf(jTextField_Score.getText());
//        System.out.println(crsId);
//        sc.insertUpdateDeleteCourse('i', stdId, crsId, scr, jTextField_Description.getText());
        //        addCourseForm Addcf = new addCourseForm();
        //        Addcf.setVisible(true);
        //        Addcf.pack();
        //        Addcf.setLocationRelativeTo(null);
        //        Addcf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonEditScoreActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        // TODO add your handling code here:
        int sid = Integer.valueOf(jTextField_StudentId.getText());
        int cid = Integer.valueOf(jTextField_CourseId.getText());

        sc.insertUpdateDeleteCourse('d', sid, cid, null, null);
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Student Id", "Course Id", "Score", "Description"}));
        sc.fillScoreJtable(jTable1);
        //        if (!jTextField_StudentId.getText().equals("")) {
            //            int id = Integer.valueOf(jTextField_StudentId.getText());
            //            c.insertUpdateDeleteCourse('d', id, null, null);
            //            manageCourseForm.jTable1.setModel(new DefaultTableModel(null, new Object[]{"Id","Label","Hours"}));
            //            c.fillCourseJtable(manageCourseForm.jTable1);
            //            jTextField_StudentId.setText("");
            //            jTextField_CourseId.setText("");
            //            jSpinner1.setValue(4);
            //        }
            
            /*
            
            
            SELECT `student_id`, first_name, last_name, label, student_score 
            FROM `score`
            INNER JOIN student as stab on stab.id = `student_id`
            INNER JOIN course as ctab on ctab.id = `course_id`
            */
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int rowIndex = jTable1.getSelectedRow();
        jTextField_StudentId.setText(jTable1.getValueAt(rowIndex, 0).toString());
        jTextField_CourseId.setText(jTable1.getValueAt(rowIndex, 1).toString());
        jTextField_Score.setText(jTable1.getValueAt(rowIndex, 2).toString());
        jTextField_Description.setText(jTable1.getValueAt(rowIndex, 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        // TODO add your handling code here:
        //        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            //            rowIndex = jTable1.getSelectedRow();
            //            jTextField_STD_ID.setText(model.getValueAt(rowIndex, 0).toString());
            //            jTextField_FName.setText(model.getValueAt(rowIndex, 1).toString());
            //            jTextField_LName.setText(model.getValueAt(rowIndex, 2).toString());
            //            jTextField_Phone.setText(model.getValueAt(rowIndex, 5).toString());
            //            jTextArea_Address.setText(model.getValueAt(rowIndex, 6).toString());
            //            if (model.getValueAt(rowIndex, 3).toString().equals("Male")) {
                //                jRadioButtonMale.setSelected(true);
                //                jRadioButtonFemale.setSelected(false);
                //            }else{
                //                jRadioButtonFemale.setSelected(true);
                //                jRadioButtonMale.setSelected(false);
                //            }
            //
            //            Date bdate;
            //            try {
                //                bdate = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 4).toString());
                //                jDateChooserBirthDate.setDate(bdate);
                //            } catch (ParseException ex) {
                //                Logger.getLogger(manageStudentsForm.class.getName()).log(Level.SEVERE, null, ex);
                //            }
            //        }
    }//GEN-LAST:event_jTable1KeyReleased

    private void jButtonAddScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddScoreActionPerformed

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
            java.util.logging.Logger.getLogger(editDeleteScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editDeleteScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editDeleteScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editDeleteScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editDeleteScore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddScore;
    private javax.swing.JButton jButtonEditScore;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_CourseId;
    private javax.swing.JTextField jTextField_Description;
    private javax.swing.JTextField jTextField_Score;
    private javax.swing.JTextField jTextField_StudentId;
    // End of variables declaration//GEN-END:variables
}
