package com.mycompany.index;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Timer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import sql.GestaoAcesso;
import sql.GestaoAcessoRowMapper;
import sql.Sql;

public class TelaLogin extends javax.swing.JFrame {

    Timer t;
    
    public TelaLogin() {
        initComponents();
        setLocationRelativeTo(null);
        incorreto.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        inSenha = new javax.swing.JTextField();
        inEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        incorreto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        fundo.setBackground(new java.awt.Color(51, 51, 51));
        fundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(39, 39, 39));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inSenha.setBackground(new java.awt.Color(28, 28, 28));
        inSenha.setForeground(new java.awt.Color(255, 255, 255));
        inSenha.setCaretColor(new java.awt.Color(204, 204, 204));
        inSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inSenhaActionPerformed(evt);
            }
        });
        jPanel2.add(inSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 220, 40));

        inEmail.setBackground(new java.awt.Color(28, 28, 28));
        inEmail.setForeground(new java.awt.Color(255, 255, 255));
        inEmail.setToolTipText("");
        inEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        inEmail.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        inEmail.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        inEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inEmailActionPerformed(evt);
            }
        });
        jPanel2.add(inEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 220, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Senha");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, 12));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Email");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, 18));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("LOGIN");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, 36));

        jButton2.setBackground(new java.awt.Color(51, 255, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("Entrar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 137, 38));

        incorreto.setDisplayedMnemonic('\u0011');
        incorreto.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        incorreto.setForeground(new java.awt.Color(204, 204, 204));
        incorreto.setText("*Credenciais incorretas!");
        jPanel2.add(incorreto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 300, 40));

        fundo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inEmailActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_inEmailActionPerformed

    private void inSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inSenhaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_inSenhaActionPerformed

    Sql sql = new Sql();
    JdbcTemplate con = sql.getConnection();
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String u_email = String.valueOf(inEmail.getText());
        String u_senha = String.valueOf(inSenha.getText());
                
        List<GestaoAcesso>acessos = con.query("exec realizar_login ?, ?", 
                new GestaoAcessoRowMapper(), u_email, u_senha);
        
        if(!acessos.isEmpty()){
            InitCarregar telaFinal = new InitCarregar(acessos.get(0));
            //Finish telaFinal = new Finish(acessos.get(0).getIdGestaoAcesso());
            telaFinal.setVisible(true);
            this.setVisible(false);
        }else{
            incorreto.setVisible(true);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
                
                
                
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fundo;
    private javax.swing.JTextField inEmail;
    private javax.swing.JTextField inSenha;
    private javax.swing.JLabel incorreto;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
