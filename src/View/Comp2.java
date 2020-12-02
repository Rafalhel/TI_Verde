package View;
import model.Media;
public class Comp2 extends javax.swing.JFrame {
    public static int mediaa;
    public Comp2() {
        initComponents();
        Media m= new Media();
        m.InserirIcone(this);
        setExtendedState(MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA CENTER VERDE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Próxima Página");
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
        jRadioButton10.setText("Unificam de servidores ");
        jRadioButton10.setOpaque(false);
        getContentPane().add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 420, 60));

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Avaliam layout físico do Data Center para melhor circulação do ar");
        jRadioButton2.setOpaque(false);
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 560, 60));

        jRadioButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton9.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton9.setText("Unificacam de desktops ");
        jRadioButton9.setOpaque(false);
        getContentPane().add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 420, 60));

        jRadioButton11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton11.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton11.setText("Modernizam a infraestrutura de Data Centers para economia de energia ");
        jRadioButton11.setOpaque(false);
        getContentPane().add(jRadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 640, 60));

        jRadioButton12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton12.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton12.setText("Utilizam servidores em nuvem - Green IT vs. Cloud Computing");
        jRadioButton12.setOpaque(false);
        getContentPane().add(jRadioButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 640, 60));

        jRadioButton13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton13.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton13.setText("Automatizam o sistema de resfriamento do Data Center para uma TI Verde ");
        jRadioButton13.setOpaque(false);
        getContentPane().add(jRadioButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 640, 60));

        jRadioButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setText("Revisam se o ar condicionado está devidamente regulado no Data Center");
        jRadioButton7.setOpaque(false);
        getContentPane().add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 630, 60));

        jRadioButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setText("Virtualizam \"storage\" e servidores");
        jRadioButton6.setOpaque(false);
        getContentPane().add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 420, 60));

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Reavaliam as necessidades e redundâncias para pontos não vitais do negócio");
        jRadioButton1.setOpaque(false);
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 650, 60));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fu_Prancheta 1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jRadioButton1.isSelected()){
            mediaa+=10;
        }  
        if (jRadioButton2.isSelected()){
            mediaa+=10;
        }               
        if (jRadioButton6.isSelected()){
            mediaa+=10;
        } 
        if (jRadioButton7.isSelected()){
            mediaa+=10;
        }
        if (jRadioButton9.isSelected()){
            mediaa+=10;
        }
        if (jRadioButton10.isSelected()){
            mediaa+=10;
        }
        if (jRadioButton11.isSelected()){
            mediaa+=10;
        }
        if (jRadioButton12.isSelected()){
            mediaa+=10;
        } 
        if (jRadioButton13.isSelected()){
            mediaa+=10;
        }
        Media nome = new Media();
        nome.setNome(mediaa);
        Comp3 frame = new Comp3();
        frame.setVisible(true);
        dispose();
     
    }//GEN-LAST:event_jButton2ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comp2().setVisible(true);
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
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables
}
