package com.mycompany.index;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.discos.Volume;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.rede.RedeInterface;
import com.github.britooo.looca.api.group.rede.RedeInterfaceGroup;
import com.github.britooo.looca.api.util.Conversor;
import static java.lang.Thread.sleep;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.springframework.jdbc.core.JdbcTemplate;
import sql.Componente;
import sql.ComponenteRowMapper;
import sql.GestaoAcesso;
import sql.GestaoAcessoRowMapper;
import sql.Hardware;
import sql.HardwareRowMapper;
import sql.Sql;

public class InitCarregar extends javax.swing.JFrame {

    private Integer id;

    public InitCarregar(Integer id) {
        initComponents();
        setLocationRelativeTo(null);
        this.id = id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inRam = new javax.swing.JLabel();
        lb_2 = new javax.swing.JLabel();
        inCpu = new javax.swing.JLabel();
        inDisco = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inUpload = new javax.swing.JLabel();
        inDownload = new javax.swing.JLabel();
        selHardware = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));

        jLabel2.setDisplayedMnemonic('\u001e');
        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AutoTech - Java Application");
        jLabel2.setMaximumSize(new java.awt.Dimension(179, 38));
        jLabel2.setPreferredSize(new java.awt.Dimension(179, 38));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Porcentagem de uso Disco: ");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Upload MBps: ");

        inRam.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        inRam.setForeground(new java.awt.Color(255, 255, 255));
        inRam.setText("0");

        lb_2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lb_2.setForeground(new java.awt.Color(255, 255, 255));
        lb_2.setText("Porcentagem de uso CPU: ");

        inCpu.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        inCpu.setForeground(new java.awt.Color(255, 255, 255));
        inCpu.setText("0");

        inDisco.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        inDisco.setForeground(new java.awt.Color(255, 255, 255));
        inDisco.setText("0");

        btnIniciar.setBackground(new java.awt.Color(75, 75, 75));
        btnIniciar.setFont(new java.awt.Font("Liberation Sans", 0, 21)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Iniciar aplicação");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Porcentagem de uso Memória RAM: ");

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Download MBps: ");

        inUpload.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        inUpload.setForeground(new java.awt.Color(255, 255, 255));
        inUpload.setText("0");

        inDownload.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        inDownload.setForeground(new java.awt.Color(255, 255, 255));
        inDownload.setText("0");

        selHardware.setBackground(new java.awt.Color(75, 75, 75));
        selHardware.setForeground(new java.awt.Color(255, 255, 255));
        selHardware.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selHardware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selHardwareActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Selecione sua máquina:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(inRam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(lb_2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(inDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel8)
                                        .addGap(51, 51, 51)
                                        .addComponent(selHardware, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(inUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(182, 182, 182)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203)))
                .addComponent(jLabel1)
                .addGap(110, 110, 110))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(inDisco))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_2)
                            .addComponent(inCpu))))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(inRam))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(188, 188, 188))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(inDownload))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(inUpload))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selHardware, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        List<Hardware>hardwares = con.query("select * from hardware where fk_cliente = ?", 
                new HardwareRowMapper(), id);
        
        selHardware.removeAllItems();
        
        for (Hardware hardware : hardwares) {
            selHardware.addItem(hardware.getNumeroSerie());
        }

    }//GEN-LAST:event_formWindowOpened

    Sql sql = new Sql();
    JdbcTemplate con = sql.getConnection();
    
    Looca looca = new Looca();
    Memoria memoria = new Memoria();
    Processador processador = looca.getProcessador();
    RedeInterfaceGroup grupoDeRede = looca.getRede().getGrupoDeInterfaces();
    List<RedeInterface> redeInterfaces = grupoDeRede.getInterfaces();
    RedeInterface redePrincipal = redeInterfaces.get(0);
    
    DiscoGrupo grupoDeDiscos = looca.getGrupoDeDiscos();
    
    Boolean primeiraVez = false;
    
    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        
        String numSerie = (String) selHardware.getSelectedItem();
        
         List<Componente>componentes = con.query(
                "select c.id_componente, c.fk_hardware, c.fk_unidade, c.fk_cliente, c.fk_modelo_componente"
                + " from componente as c join hardware on id_hardware = c.fk_hardware where numero_serie = ?", 
                new ComponenteRowMapper(), numSerie);
         
         for (Componente c : componentes) {
             System.out.println(c);
        }
         
        Componente c1 = componentes.get(0);
        Componente c2 = componentes.get(1);
        Componente c3 = componentes.get(2);
        
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Atualziando os dados");
                
                Double emUso = memoria.getEmUso().doubleValue();
                Double total = memoria.getTotal().doubleValue();
                Double porcentagemDisco = 0.0;

                inCpu.setText(processador.getUso().toString());
                inCpu.setText(String.format("%.2f", processador.getUso()));
                
                inRam.setText(String.format("%.2f",(emUso/total*100)));
                
                
                for (RedeInterface redeInterface : redeInterfaces) {
            
                    if(redeInterface.getPacotesRecebidos().doubleValue() > redePrincipal.getPacotesRecebidos().doubleValue()){
                        redePrincipal = redeInterface;
                    }
                }
        
                inDownload.setText(Conversor.formatarBytes(redePrincipal.getBytesRecebidos()));
                inUpload.setText(Conversor.formatarBytes(redePrincipal.getBytesEnviados()));
                
                
                List<Volume>volumes = grupoDeDiscos.getVolumes();
                for (Volume volume : volumes){
                    Double atual = ((volume.getTotal().doubleValue() - volume.getDisponivel().doubleValue())/ volume.getTotal().doubleValue()) * 100;

                    if(atual > porcentagemDisco){
                        porcentagemDisco = atual;
                    }
                }
                
                inDisco.setText(String.format("%.2f", porcentagemDisco));
                
                
                con.update("insert into metrica (fk_componente, fk_hardware, fk_unidade, fk_cliente, fk_modelo_componente, porcentagem_uso, dt_hora) values "
                    + "(?, ?, ?, ?, ?, ?, dateadd(hour, -3, getdate())),"
                    + "(?, ?, ?, ?, ?, ?, dateadd(hour, -3, getdate())),"
                    + "(?, ?, ?, ?, ?, ?, dateadd(hour, -3, getdate()));",
                    c1.getIdComponente(), c1.getFkHardware(), c1.getFkUnidade(), c1.getFkCliente(), c1.getFkModeloComponente(), processador.getUso(),
                    c2.getIdComponente(), c2.getFkHardware(), c2.getFkUnidade(), c2.getFkCliente(), c2.getFkModeloComponente(), porcentagemDisco,
                    c3.getIdComponente(), c3.getFkHardware(), c3.getFkUnidade(), c3.getFkCliente(), c3.getFkModeloComponente(), (emUso/total*100)
                );
                System.out.println(((emUso/total*100)));
                
                if((emUso/total*100) > 30 && !primeiraVez){
                    new Alert().setVisible(true);
                    primeiraVez = true;
                }
                
                
                
            }
        }, 0, 5000);
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void selHardwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selHardwareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selHardwareActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new InitCarregar().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel inCpu;
    private javax.swing.JLabel inDisco;
    private javax.swing.JLabel inDownload;
    private javax.swing.JLabel inRam;
    private javax.swing.JLabel inUpload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_2;
    private javax.swing.JComboBox<String> selHardware;
    // End of variables declaration//GEN-END:variables
}
