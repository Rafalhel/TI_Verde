package View;
import model.Media;
public class Comp4 extends javax.swing.JFrame {
    public static int mediaaaa;
    public Comp4() {
        initComponents();
        Media m= new Media();
        m.InserirIcone(this);
        jRadioButton2.setText("<html>Limpam internamente computadores e equipamentos para maior conservação</html>");
        jRadioButton18.setText("<html>Identificam os hardwares em bom funcionamento em um computador com defeito</html>");
        jRadioButton15.setText("<html>Inutilizam os computadores com defeito/má funcionamento das fontes de energia</html>");
        setExtendedState(MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HARDWARES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, -1, -1));

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

        jRadioButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setText("Recuperam os equipamentos de TI danificados ao invés de comprar novos ");
        jRadioButton6.setOpaque(false);
        getContentPane().add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 670, 60));

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Utilizam dispositivos de computação \"Energy Star\" ou com outros \"Selos Verdes\"");
        jRadioButton1.setOpaque(false);
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 670, 60));

        jRadioButton16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton16.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton16.setText("Utilizam Thin Clients");
        jRadioButton16.setOpaque(false);
        getContentPane().add(jRadioButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 670, 60));

        jRadioButton15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton15.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton15.setText("Inutilizam os computadores com defeito/má funcionamento das fontes de energia ");
        jRadioButton15.setOpaque(false);
        getContentPane().add(jRadioButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 530, 580, 80));

        jRadioButton12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton12.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton12.setText("Aumentam o 'lifecycle' dos produtos de TI");
        jRadioButton12.setOpaque(false);
        getContentPane().add(jRadioButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 670, 60));

        jRadioButton14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton14.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton14.setText("Limpam internamente computadores e equipamentos para maior conservação ");
        jRadioButton14.setOpaque(false);
        getContentPane().add(jRadioButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 580, 60));

        jRadioButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton8.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setText("Utilizam monitores LCD");
        jRadioButton8.setOpaque(false);
        getContentPane().add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 670, 60));

        jRadioButton17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton17.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton17.setText("Trocam desktops por laptops");
        jRadioButton17.setOpaque(false);
        getContentPane().add(jRadioButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 670, 60));

        jRadioButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton9.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton9.setText("Removem componentes nocivos dos equipamentos de TI");
        jRadioButton9.setOpaque(false);
        getContentPane().add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 670, 60));

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Comparam tempo de garantia dos equipamentos de TI ");
        jRadioButton3.setOpaque(false);
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 630, 60));

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Avaliam durabilidade dos equipamentos de TI ");
        jRadioButton4.setOpaque(false);
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 630, 60));

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Programam modo de hibernação dos computadores");
        jRadioButton2.setOpaque(false);
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 630, 60));

        jRadioButton18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton18.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton18.setText("Identificam os hardwares em bom funcionamento em um computador com defeito ");
        jRadioButton18.setOpaque(false);
        getContentPane().add(jRadioButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 580, 80));

        jRadioButton13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton13.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton13.setText("Diminuem o brilho dos monitores LCD");
        jRadioButton13.setOpaque(false);
        getContentPane().add(jRadioButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 670, 60));

        jRadioButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setText("Programam os monitores para desligarem após tempo de inatividade");
        jRadioButton7.setOpaque(false);
        getContentPane().add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 670, 60));

        jRadioButton11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton11.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton11.setText("Preferem equipamentos de TI que foram reciclados");
        jRadioButton11.setOpaque(false);
        getContentPane().add(jRadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 670, 60));

        jRadioButton10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton10.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton10.setText("Utilizam equipamentos de TI eficientes e económicos");
        jRadioButton10.setOpaque(false);
        getContentPane().add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 670, 60));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fu_Prancheta 1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jRadioButton1.isSelected()){
            mediaaaa+=10;
        }  
        if (jRadioButton2.isSelected()){
            mediaaaa+=10;
        }               
        if (jRadioButton3.isSelected()){
            mediaaaa+=10;
        }  
        if (jRadioButton4.isSelected()){
            mediaaaa+=10;
        }
        if (jRadioButton6.isSelected()){
            mediaaaa+=10;
        } 
        if (jRadioButton7.isSelected()){
            mediaaaa+=10;
        }
        if (jRadioButton8.isSelected()){
            mediaaaa+=10;
        }   
        if (jRadioButton9.isSelected()){
            mediaaaa+=10;
        }
        if (jRadioButton10.isSelected()){
            mediaaaa+=10;
        }
        if (jRadioButton11.isSelected()){
            mediaaaa+=10;
        }
        if (jRadioButton12.isSelected()){
            mediaaaa+=10;
        } 
        if (jRadioButton13.isSelected()){
            mediaaaa+=10;
        }  
        if (jRadioButton14.isSelected()){
            mediaaaa+=10;
        }  
        if (jRadioButton15.isSelected()){
            mediaaaa+=10;
        }  
        if (jRadioButton16.isSelected()){
            mediaaaa+=10;
        }  
        if (jRadioButton17.isSelected()){
            mediaaaa+=10;
        }  
        if (jRadioButton18.isSelected()){
            mediaaaa+=10;
        }
        Media nn = new Media();
        nn.setNome(mediaaaa);
        Comp5 frame = new Comp5();
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
            java.util.logging.Logger.getLogger(Comp4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comp4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comp4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comp4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comp4().setVisible(true);
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
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables
}
