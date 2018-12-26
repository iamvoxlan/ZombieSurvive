/**
 *
 * @author voxlan
 */
public class MainGame extends javax.swing.JFrame {

    public MainGame() 
    {
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

        tombolMain = new javax.swing.JButton();
        tombolSkor = new javax.swing.JButton();
        namauser = new javax.swing.JTextField();
        masukgame = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ZOMBIE SURVIVAL");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(1000, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        tombolMain.setBackground(new java.awt.Color(191, 162, 162));
        tombolMain.setText("Main");
        tombolMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolMainActionPerformed(evt);
            }
        });
        getContentPane().add(tombolMain);
        tombolMain.setBounds(400, 340, 180, 31);

        tombolSkor.setBackground(new java.awt.Color(191, 162, 162));
        tombolSkor.setText("Lihat Skor");
        tombolSkor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolSkorActionPerformed(evt);
            }
        });
        getContentPane().add(tombolSkor);
        tombolSkor.setBounds(400, 390, 180, 31);

        namauser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        namauser.setText("Masukkan nama");
        namauser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namauserActionPerformed(evt);
            }
        });
        getContentPane().add(namauser);
        namauser.setBounds(400, 340, 180, 29);

        masukgame.setBackground(new java.awt.Color(191, 162, 162));
        masukgame.setText("Mulai Permainan");
        masukgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masukgameActionPerformed(evt);
            }
        });
        getContentPane().add(masukgame);
        masukgame.setBounds(400, 390, 180, 31);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-480, -180, 1510, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tombolSkorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolSkorActionPerformed
        
    }//GEN-LAST:event_tombolSkorActionPerformed

    private void tombolMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolMainActionPerformed

        tombolMain.setVisible(false);
        tombolSkor.setVisible(false);
        
    }//GEN-LAST:event_tombolMainActionPerformed

    private void namauserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namauserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namauserActionPerformed

    private void masukgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masukgameActionPerformed
        String namaPlayer = namauser.getText();
        jLabel1.setVisible(false);
        namauser.setVisible(false);
        masukgame.setVisible(false);
        GameScene newgame = new GameScene(namaPlayer);
        newgame.setVisible(true);
        newgame.setSize(1000, 500);
        add(newgame);
        newgame.setFocusable(true);
        newgame.requestFocusInWindow();
        System.out.println("Masuk Game");
    }//GEN-LAST:event_masukgameActionPerformed

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
            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new MainGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton masukgame;
    private javax.swing.JTextField namauser;
    private javax.swing.JButton tombolMain;
    private javax.swing.JButton tombolSkor;
    // End of variables declaration//GEN-END:variables
}
