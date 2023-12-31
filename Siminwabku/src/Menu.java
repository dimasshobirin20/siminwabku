import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dimas
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        Dimension screenSize = 
         Toolkit.getDefaultToolkit().getScreenSize();
            Dimension frameSize = this.getSize();
            if (frameSize.height > screenSize.height) {
                frameSize.height = screenSize.height;
            }
            if (frameSize.width > screenSize.width) {
                frameSize.width = screenSize.width;
            }
            this.setLocation(
                    (screenSize.width - frameSize.width) / 2, 
                    (screenSize.height - frameSize.height) / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        siminwabkuLabel = new javax.swing.JLabel();
        fakturBtn = new javax.swing.JButton();
        suratBtn = new javax.swing.JButton();
        kuitansiBtn = new javax.swing.JButton();
        sptjmBtn = new javax.swing.JButton();
        keluarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane2.setBackground(new java.awt.Color(0, 102, 102));

        siminwabkuLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/Siminwabku.png"))); // NOI18N

        fakturBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        fakturBtn.setText("FAKTUR");
        fakturBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fakturBtnActionPerformed(evt);
            }
        });

        suratBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        suratBtn.setText("SURAT");
        suratBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suratBtnActionPerformed(evt);
            }
        });

        kuitansiBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        kuitansiBtn.setText("KUITANSI");
        kuitansiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kuitansiBtnActionPerformed(evt);
            }
        });

        sptjmBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        sptjmBtn.setText("SPTJM");
        sptjmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sptjmBtnActionPerformed(evt);
            }
        });

        keluarBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        keluarBtn.setText("KELUAR");
        keluarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarBtnActionPerformed(evt);
            }
        });

        jDesktopPane2.setLayer(siminwabkuLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(fakturBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(suratBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(kuitansiBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(sptjmBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(keluarBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(siminwabkuLabel)
                .addGap(259, 259, 259))
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(fakturBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(suratBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kuitansiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sptjmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keluarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(siminwabkuLabel)
                .addGap(94, 94, 94)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kuitansiBtn)
                        .addComponent(sptjmBtn)
                        .addComponent(keluarBtn)
                        .addComponent(suratBtn))
                    .addComponent(fakturBtn))
                .addContainerGap(229, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kuitansiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kuitansiBtnActionPerformed
        Kuitansi kuitansi= new Kuitansi();
        kuitansi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kuitansiBtnActionPerformed

    private void fakturBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fakturBtnActionPerformed
        Faktur faktur= new Faktur();
        faktur.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_fakturBtnActionPerformed

    private void suratBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suratBtnActionPerformed
        Surat surat= new Surat();
        surat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_suratBtnActionPerformed

    private void sptjmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sptjmBtnActionPerformed
        SPTJM sptjm= new SPTJM();
        sptjm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sptjmBtnActionPerformed

    private void keluarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarBtnActionPerformed
        int pilih = JOptionPane.showConfirmDialog(null, "Keluar Aplikasi?",
                "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
        if(pilih == JOptionPane.OK_OPTION){
            System.exit(0);
        } else{
            JOptionPane.getRootFrame();
        }
    }//GEN-LAST:event_keluarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fakturBtn;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JButton keluarBtn;
    private javax.swing.JButton kuitansiBtn;
    private javax.swing.JLabel siminwabkuLabel;
    private javax.swing.JButton sptjmBtn;
    private javax.swing.JButton suratBtn;
    // End of variables declaration//GEN-END:variables
}
