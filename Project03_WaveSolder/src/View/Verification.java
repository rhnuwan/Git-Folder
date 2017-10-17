package View;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import support.BGCollorChange;
import support.Timer;
import support.DateTime;
import contorl.ideal;
import support.nem;
import contorl.verification;

public class Verification extends javax.swing.JDialog {
    
    public DateTime cn;
    public Timer timer;
    public int vtime;
    public String stime;
    public int videal;
    
    public Verification(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        timer = new Timer(lb_vr_vt);
        timer.Start();
        
        new DateTime().time(lb_vr_st);
        stime = lb_vr_st.getText();
        
        new BGCollorChange(pn01, Color.red, timer, (nem.verificationtime*60));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_vr_finish = new javax.swing.JButton();
        bt_vr_cancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lb_vr_vt = new javax.swing.JLabel();
        lb_vr_st = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pn01 = new javax.swing.JPanel();
        modePane = new javax.swing.JPanel();
        lb_vr_md = new javax.swing.JLabel();
        lb_mn_time = new javax.swing.JLabel();

        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(790, 430));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_vr_finish.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        bt_vr_finish.setText("FINISHED");
        bt_vr_finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_vr_finishActionPerformed(evt);
            }
        });
        getContentPane().add(bt_vr_finish, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, 220, 75));

        bt_vr_cancel.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        bt_vr_cancel.setText("CANCEL");
        bt_vr_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_vr_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(bt_vr_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 230, 75));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("VERIFICATION TIME :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        lb_vr_vt.setBackground(new java.awt.Color(153, 255, 255));
        lb_vr_vt.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        lb_vr_vt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_vr_vt.setText("00 : 00 : 00");
        lb_vr_vt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lb_vr_vt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_vr_vt.setOpaque(true);
        getContentPane().add(lb_vr_vt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 287, 54));

        lb_vr_st.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        lb_vr_st.setText("00 : 00 : 00");
        getContentPane().add(lb_vr_st, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel3.setText("START TIME :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        pn01.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout pn01Layout = new javax.swing.GroupLayout(pn01);
        pn01.setLayout(pn01Layout);
        pn01Layout.setHorizontalGroup(
            pn01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        pn01Layout.setVerticalGroup(
            pn01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(pn01, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, -1, -1));

        modePane.setBackground(new java.awt.Color(204, 204, 255));

        lb_vr_md.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lb_vr_md.setForeground(new java.awt.Color(0, 0, 153));
        lb_vr_md.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_vr_md.setText("Verification mode");

        lb_mn_time.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lb_mn_time.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ccs.png"))); // NOI18N

        javax.swing.GroupLayout modePaneLayout = new javax.swing.GroupLayout(modePane);
        modePane.setLayout(modePaneLayout);
        modePaneLayout.setHorizontalGroup(
            modePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modePaneLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lb_mn_time)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addComponent(lb_vr_md, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
        );
        modePaneLayout.setVerticalGroup(
            modePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_mn_time)
                    .addComponent(lb_vr_md, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(modePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, -1));

        setSize(new java.awt.Dimension(1024, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_vr_finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_vr_finishActionPerformed

        int x = JOptionPane.showConfirmDialog(this, "Are you sure finished..","Finished.. ",JOptionPane.YES_OPTION);
        
        if (x == 0){
            
            try {     
                timer.Stop();
                vtime = timer.toInt();
                new verification().dataInsert(new DateTime().date(), stime, vtime, nem.user);
                this.hide();
            } catch (Exception ex) {
                Logger.getLogger(Verification.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            
            
        }
        

    }//GEN-LAST:event_bt_vr_finishActionPerformed

    private void bt_vr_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_vr_cancelActionPerformed

        int x = JOptionPane.showConfirmDialog(this, "Are you sure cancel..","Ideal time.. ",JOptionPane.YES_OPTION);
        
        if (x==0){

            this.hide();
            vtime = timer.toInt();
            videal = vtime;
            try {
                new ideal().dataInsert(new DateTime().date(), stime, videal, "VERIFICATION",nem.user);
            } catch (Exception ex) {
                Logger.getLogger(Verification.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            
        }

    }//GEN-LAST:event_bt_vr_cancelActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Verification dialog = new Verification(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_vr_cancel;
    private javax.swing.JButton bt_vr_finish;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lb_mn_time;
    private javax.swing.JLabel lb_vr_md;
    private javax.swing.JLabel lb_vr_st;
    private javax.swing.JLabel lb_vr_vt;
    private javax.swing.JPanel modePane;
    private javax.swing.JPanel pn01;
    // End of variables declaration//GEN-END:variables
}
