package View;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import support.BGCollorChange;
import support.Timer;
import support.DateTime;
import contorl.breakdown;
import contorl.ideal;
import support.nem;

public class Breakdown extends javax.swing.JDialog {

    public Timer wtimer;
    public Timer rtimer;

    public String stime;
    public int wtime;
    public int rtime;
    
    public boolean stoptimer = false;
   
    public Breakdown(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        wtimer = new Timer(lb_bk_wt);
        rtimer = new Timer(lb_bk_rt);
        wtimer.Start();
        //Set operation start time in to label 
        new DateTime().time(lb_bk_st);
        stime = lb_bk_st.getText();
        //color changing in display light
        new BGCollorChange(pn01, Color.red, wtimer, nem.waitingtime*60);
        new BGCollorChange(pn02, Color.red, rtimer, nem.reparingtime*60);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_bk_vw = new javax.swing.JButton();
        bt_bk_repar = new javax.swing.JButton();
        bt_bk_finish = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lb_bk_rt = new javax.swing.JLabel();
        lb_bk_wt = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lb_bk_st = new javax.swing.JLabel();
        pn01 = new javax.swing.JPanel();
        pn02 = new javax.swing.JPanel();
        modePane = new javax.swing.JPanel();
        lb_vr_md = new javax.swing.JLabel();
        lb_mn_time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setUndecorated(true);

        bt_bk_vw.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bt_bk_vw.setText("CANCEL");
        bt_bk_vw.setMaximumSize(new java.awt.Dimension(200, 200));
        bt_bk_vw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_bk_vwActionPerformed(evt);
            }
        });

        bt_bk_repar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bt_bk_repar.setForeground(new java.awt.Color(255, 0, 0));
        bt_bk_repar.setText("REPAIR");
        bt_bk_repar.setMaximumSize(new java.awt.Dimension(200, 200));
        bt_bk_repar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_bk_reparActionPerformed(evt);
            }
        });

        bt_bk_finish.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bt_bk_finish.setForeground(new java.awt.Color(0, 0, 153));
        bt_bk_finish.setText("FINISHED");
        bt_bk_finish.setMaximumSize(new java.awt.Dimension(200, 200));
        bt_bk_finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_bk_finishActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("REPAIR TIME : ");

        lb_bk_rt.setBackground(new java.awt.Color(102, 255, 204));
        lb_bk_rt.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lb_bk_rt.setForeground(new java.awt.Color(153, 0, 0));
        lb_bk_rt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_bk_rt.setText("00 : 00 : 00 ");
        lb_bk_rt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lb_bk_rt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb_bk_rt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_bk_rt.setMaximumSize(new java.awt.Dimension(100, 25));
        lb_bk_rt.setMinimumSize(new java.awt.Dimension(100, 25));
        lb_bk_rt.setOpaque(true);
        lb_bk_rt.setPreferredSize(new java.awt.Dimension(100, 25));

        lb_bk_wt.setBackground(new java.awt.Color(102, 255, 204));
        lb_bk_wt.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lb_bk_wt.setForeground(new java.awt.Color(153, 0, 0));
        lb_bk_wt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_bk_wt.setText("00 : 00 : 00 ");
        lb_bk_wt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lb_bk_wt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_bk_wt.setMaximumSize(new java.awt.Dimension(100, 25));
        lb_bk_wt.setMinimumSize(new java.awt.Dimension(100, 25));
        lb_bk_wt.setOpaque(true);
        lb_bk_wt.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("WATING TIME : ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Start Time : ");

        lb_bk_st.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_bk_st.setForeground(new java.awt.Color(255, 153, 0));
        lb_bk_st.setText("00 : 00 : 00 ");
        lb_bk_st.setMaximumSize(new java.awt.Dimension(100, 25));
        lb_bk_st.setMinimumSize(new java.awt.Dimension(100, 25));
        lb_bk_st.setPreferredSize(new java.awt.Dimension(100, 25));

        pn01.setBackground(new java.awt.Color(0, 255, 51));
        pn01.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pn01Layout = new javax.swing.GroupLayout(pn01);
        pn01.setLayout(pn01Layout);
        pn01Layout.setHorizontalGroup(
            pn01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pn01Layout.setVerticalGroup(
            pn01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        pn02.setBackground(new java.awt.Color(0, 255, 51));
        pn02.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pn02Layout = new javax.swing.GroupLayout(pn02);
        pn02.setLayout(pn02Layout);
        pn02Layout.setHorizontalGroup(
            pn02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pn02Layout.setVerticalGroup(
            pn02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        modePane.setBackground(new java.awt.Color(204, 204, 255));

        lb_vr_md.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lb_vr_md.setForeground(new java.awt.Color(0, 0, 153));
        lb_vr_md.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_vr_md.setText("Breakdown mode");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(bt_bk_vw, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_bk_repar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(bt_bk_finish, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_bk_st, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lb_bk_rt, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                    .addComponent(lb_bk_wt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pn01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pn02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(modePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(modePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_bk_st, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lb_bk_wt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(pn01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                    .addComponent(lb_bk_rt, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pn02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_bk_repar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_bk_finish, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_bk_vw, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
        );

        setSize(new java.awt.Dimension(1024, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_bk_reparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_bk_reparActionPerformed
        
        if(rtimer.isStart()==false){
                int joption = JOptionPane.showConfirmDialog(null, "Do Reparing...", " Reparing.", JOptionPane.OK_OPTION);

            if(joption == 0 ){
                new Login_2(null,true).show();

                if(nem.bkon == true){
                    wtimer.Stop();
                    rtimer.Start();        
                    wtime = wtimer.toInt();
                    stoptimer = true;
                    this.enable();
                    nem.bkon = false;
                }
                System.out.println(nem.bkon);
            }
            
        }else{
            JOptionPane.showConfirmDialog(null, "Reparing is Satared..","Do not Repar..",JOptionPane.DEFAULT_OPTION);
        }
 
    }//GEN-LAST:event_bt_bk_reparActionPerformed

    private void bt_bk_finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_bk_finishActionPerformed

        int joption = JOptionPane.showConfirmDialog(null, "Are you sure you wont finished..", " Finishe Breakdown.", JOptionPane.OK_OPTION);
        
        if (joption == 0 & stoptimer == true) {

            rtime = rtimer.toInt();
            rtimer.Stop();
   
            this.hide();

            try {
                new breakdown().dataInsert(new DateTime().date(), this.stime, this.wtime, this.rtime, 1);
            } catch (Exception ex) {
                Logger.getLogger(Breakdown.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_bt_bk_finishActionPerformed

    private void bt_bk_vwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_bk_vwActionPerformed
         
        int x = JOptionPane.showConfirmDialog(this, "Are you sure cancel..","Ideal time.. ",JOptionPane.YES_OPTION);
        
        if (x==0){
            if(rtimer.toInt() == 0){
                this.hide();

                try {
                    new ideal().dataInsert(new DateTime().date(), stime, wtimer.toInt(), "BREAKDOWN",nem.user);
                } catch (Exception ex) {
                    Logger.getLogger(Verification.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showConfirmDialog(null, "Dont exit.....");
            }
        }
    }//GEN-LAST:event_bt_bk_vwActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Breakdown dialog = new Breakdown(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton bt_bk_finish;
    private javax.swing.JButton bt_bk_repar;
    private javax.swing.JButton bt_bk_vw;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lb_bk_rt;
    private javax.swing.JLabel lb_bk_st;
    private javax.swing.JLabel lb_bk_wt;
    private javax.swing.JLabel lb_mn_time;
    private javax.swing.JLabel lb_vr_md;
    private javax.swing.JPanel modePane;
    private javax.swing.JPanel pn01;
    private javax.swing.JPanel pn02;
    // End of variables declaration//GEN-END:variables
}
