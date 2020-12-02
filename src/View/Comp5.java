package View;
import model.Media;
public class Comp5 extends javax.swing.JFrame {
    public static int mediaaaaa;
    public Comp5() {
        initComponents();
        Media m= new Media();
        m.InserirIcone(this);
        jRadioButton3.setText("<html>Utilizam software “eco fonte” nas impressões que aumenta a durabilidade do Toner</html>");
        jRadioButton14.setText("<html>Desenvolvem softwares que são capazes de projetar equipamentos de TI mais econômicos e eficientes </html>");
        jRadioButton2.setText("<html>Utilizam softwares que manipulem os hardwares visando eficiência energética</html>");
        setExtendedState(MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("IMPRESSÃO E SOFTWARE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Próxima página");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 610, 170, 40));

        jRadioButton17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton17.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton17.setText("Utilizam site verde (cores \"leves\"), que diminui o consumo de Watts");
        jRadioButton17.setOpaque(false);
        getContentPane().add(jRadioButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 670, 60));

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton1.setText("Implantam o conceito de Impressão Segura (senha ou crachá para imprimir)");
        jRadioButton1.setOpaque(false);
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 670, 60));

        jRadioButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton8.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton8.setText("Digitalizam ao invés de imprimir ");
        jRadioButton8.setOpaque(false);
        getContentPane().add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 670, 60));

        jRadioButton13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton13.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton13.setText("Utilizam papeis reciclados para impressões");
        jRadioButton13.setOpaque(false);
        getContentPane().add(jRadioButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 670, 60));

        jRadioButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton9.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton9.setText("Terceirizão serviço de impressão");
        jRadioButton9.setOpaque(false);
        getContentPane().add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 670, 60));

        jRadioButton12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton12.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton12.setText("Diminuem a quantidade de impressoras");
        jRadioButton12.setOpaque(false);
        getContentPane().add(jRadioButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 670, 60));

        jRadioButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton7.setText("Disponibilizam multifuncionais");
        jRadioButton7.setOpaque(false);
        getContentPane().add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 670, 60));

        jRadioButton14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton14.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton14.setText("Desenvolvem softwares que são capazes de projetar equipamentos de TI mais econômicos e eficientes ");
        jRadioButton14.setContentAreaFilled(false);
        getContentPane().add(jRadioButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 600, 60));

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton4.setText("Gerenciam o consumo de energia da TI através de softwares");
        jRadioButton4.setOpaque(false);
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 630, 60));

        jRadioButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton6.setText("Configuram impressora para imprimir em modo rascunho");
        jRadioButton6.setOpaque(false);
        getContentPane().add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 670, 60));

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton3.setText("Utilizam software “eco fonte” nas impressões que aumenta a durabilidade do Toner");
        jRadioButton3.setOpaque(false);
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 630, 60));

        jRadioButton11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton11.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton11.setText("Utilizam impressões frente e verso");
        jRadioButton11.setOpaque(false);
        getContentPane().add(jRadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 670, 60));

        jRadioButton16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton16.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton16.setText("Possuem software para controlar a emissão de gases e qualidade da água");
        jRadioButton16.setOpaque(false);
        getContentPane().add(jRadioButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 670, 60));

        jRadioButton10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton10.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton10.setText("Monitoram impressões evitando desperdícios de recursos");
        jRadioButton10.setOpaque(false);
        getContentPane().add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 670, 60));

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton2.setText("Utilizam softwares que manipulem os hardwares visando eficiência energética");
        jRadioButton2.setOpaque(false);
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 630, 60));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fu_Prancheta 1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jRadioButton1.isSelected()){
            mediaaaaa+=10;
        }  
        if (jRadioButton2.isSelected()){
            mediaaaaa+=10;
        }               
        if (jRadioButton3.isSelected()){
            mediaaaaa+=10;
        }  
        if (jRadioButton4.isSelected()){
            mediaaaaa+=10;
        }
        if (jRadioButton6.isSelected()){
            mediaaaaa+=10;
        } 
        if (jRadioButton7.isSelected()){
            mediaaaaa+=10;
        }
        if (jRadioButton8.isSelected()){
            mediaaaaa+=10;
        }   
        if (jRadioButton9.isSelected()){
            mediaaaaa+=10;
        }
        if (jRadioButton10.isSelected()){
            mediaaaaa+=10;
        }
        if (jRadioButton11.isSelected()){
            mediaaaaa+=10;
        }
        if (jRadioButton12.isSelected()){
            mediaaaaa+=10;
        } 
        if (jRadioButton13.isSelected()){
            mediaaaaa+=10;
        }  
        if (jRadioButton14.isSelected()){
            mediaaaaa+=10;
        }  
        if (jRadioButton16.isSelected()){
            mediaaaaa+=10;
        }  
        if (jRadioButton17.isSelected()){
            mediaaaaa+=10;
        }
        Media mm=new Media();
        mm.setNome(mediaaaaa);
        Resultado frame = new Resultado();
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
            java.util.logging.Logger.getLogger(Comp5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comp5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comp5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comp5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comp5().setVisible(true);
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
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables
}
