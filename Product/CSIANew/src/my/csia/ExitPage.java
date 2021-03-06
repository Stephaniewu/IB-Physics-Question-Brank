/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.csia;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author student
 */
public class ExitPage extends javax.swing.JFrame {
// is displayed when user has successfully completed a topic
    
    /**
     * Creates new form ExitPage
     */
    
    // constructor for ExitPage class
    public ExitPage() {
        initComponents();
        setResizable(false);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        setSize((int)dimension.getWidth(), (int)dimension.getHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 51)); // NOI18N
        jLabel1.setText("IB Physics Practice Tool");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 25)); // NOI18N
        jLabel2.setText("Congrats on passing Level 3!");

        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jButton1.setText("Try Other Topics");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jButton2.setText("Exit and Save Progress");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jButton3.setText("Exit without Saving Progress");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 2, 25)); // NOI18N
        jLabel3.setText("Would you like to continue practicing, try other topics, or exit?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jButton1)
                        .addGap(97, 97, 97)
                        .addComponent(jButton2)
                        .addGap(92, 92, 92)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(447, 447, 447)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(198, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // returns to the home page
        Home gui = new Home();
        gui.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // write content to the user progress text file to indivate that user wants to retrieve progress
        try
        {
            String fileName = "User Progress.txt";
            File progress = new File(fileName);
            FileWriter fileWriter = new FileWriter(progress);
            fileWriter.write("c" + "\n" + "c" + "\n" + "c" + "\n" + "c" + "\n" + "c" + "\n" + "c" + "\n"); 
            fileWriter.close();
        }
        catch (IOException e) {
            new RuntimeException("Error message", e).printStackTrace();
        }
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // clears the text file containing user progress
        try
        {
            String fileName = "User Progress.txt";
            File progress = new File(fileName);
            FileWriter fileWriter = new FileWriter(progress);
            fileWriter.write(""); // clears the text file containing user progress
            fileWriter.close();
        }
        catch (IOException e) {
            new RuntimeException("Error message", e).printStackTrace();
        }
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ExitPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExitPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExitPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExitPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExitPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
