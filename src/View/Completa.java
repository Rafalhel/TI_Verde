package View;
import model.Media;
public class Completa extends javax.swing.JFrame {
    public static int media;
    public Completa() {
        initComponents();
        Media m= new Media();
        m.InserirIcone(this);
        jRadioButton3.setText("<html>Divulgam aos clientes as certificações de TI verde da empresa na área de sustentabilidade como diferencial</html>");
        setExtendedState(MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRÁTICAS DE CONCIENTIZAÇÃO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Próxima página");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 610, 170, 40));

        jRadioButton10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton10.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton10.setText("Possuem Políticas de Sustentabilidade da TI (PSTI) ");
        jRadioButton10.setOpaque(false);
        getContentPane().add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 470, 60));

        jRadioButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton8.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setText("Possuem fornecedores de TI sustentáveis ");
        jRadioButton8.setOpaque(false);
        getContentPane().add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 420, 60));

        jRadioButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton9.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton9.setText("Promovem palestras e eventos para conscientizar as pessoas sobre Ti Verde");
        jRadioButton9.setOpaque(false);
        getContentPane().add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 630, 60));

        jRadioButton11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton11.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton11.setText("Fazem videoconferências ");
        jRadioButton11.setOpaque(false);
        getContentPane().add(jRadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 420, 60));

        jRadioButton12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton12.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton12.setText("Evitam compras desnecessárias de equipamentos de TI ");
        jRadioButton12.setOpaque(false);
        getContentPane().add(jRadioButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 640, 60));

        jRadioButton13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton13.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton13.setText("Reúnem com os comités diretivos para garantira sustentabilidade TI");
        jRadioButton13.setOpaque(false);
        getContentPane().add(jRadioButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 600, 60));

        jRadioButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setText("Analisam a eficiência energética dos equipamentos de TI");
        jRadioButton7.setOpaque(false);
        getContentPane().add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 590, 60));

        jRadioButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setText("Apoiam e incentivam os alunos a praticarem ações sustentáveis na área de Informática");
        jRadioButton6.setOpaque(false);
        getContentPane().add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 720, 60));

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Recusam produtos de TI que agridam o meio ambiente");
        jRadioButton1.setOpaque(false);
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 470, 60));

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Divulgam aos clientes as certificações de TI verde da empresa na área de sustentabilidade como diferencial");
        jRadioButton2.setOpaque(false);
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 560, 60));

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Possuem Home offices, FTP e Mensagens Instantâneas");
        jRadioButton3.setOpaque(false);
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 560, 60));

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Desligam os monitores na hora do almoço");
        jRadioButton4.setOpaque(false);
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 520, 60));

        jRadioButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("Desligam os computadores após o término do expediente ");
        jRadioButton5.setOpaque(false);
        getContentPane().add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 540, 60));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fu_Prancheta 1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jRadioButton1.isSelected()){
            media+=10;
        }  
        if (jRadioButton2.isSelected()){
            media+=10;
        }               
        if (jRadioButton3.isSelected()){
            media+=10;
        }  
        if (jRadioButton4.isSelected()){
            media+=10;
        }
        if (jRadioButton5.isSelected()){
            media+=10;
        }  
        if (jRadioButton6.isSelected()){
            media+=10;
        } 
        if (jRadioButton7.isSelected()){
            media+=10;
        }
        if (jRadioButton8.isSelected()){
            media+=10;
        }   
        if (jRadioButton9.isSelected()){
            media+=10;
        }
        if (jRadioButton10.isSelected()){
            media+=10;
        }
        if (jRadioButton11.isSelected()){
            media+=10;
        }
        if (jRadioButton12.isSelected()){
            media+=10;
        } 
        if (jRadioButton13.isSelected()){
            media+=10;
        }
        Media m = new Media();
        m.setNome(media);
        Comp2 frame = new Comp2();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Completa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Completa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Completa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Completa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Completa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables
}
