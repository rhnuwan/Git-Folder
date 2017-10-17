package View;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import support.Timer;
import support.DateTime;
import contorl.ideal;
import support.nem;
import contorl.profile;

public class Profile extends javax.swing.JDialog {
    
    public String job;
    public String stime;
    public String item;
    public int pcb;
    public int prtime;
    public int idealtime;
    public int atime;
    public Timer timer;
    
    public Profile(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        DateTime c1 = new DateTime();
        c1.time(lb_pr_st);
      
        timer = new Timer(lb_pr_pt);
        timer.Start();
        
        this.job = nem.JobNo;
        this.item = nem.itemNo;
        this.pcb = nem.pcbs;
        this.prtime = nem.profiletime;
        
        lb_pr_job.setText(this.job);
        lb_pr_item.setText(this.item);
        stime = lb_pr_st.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lb_pr_st = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lb_pr_pt = new javax.swing.JLabel();
        bt_pr_exit = new javax.swing.JButton();
        bt_pr_pr = new javax.swing.JButton();
        bt_pr_finish = new javax.swing.JButton();
        lb_pr_job = new javax.swing.JLabel();
        lb_pr_item = new javax.swing.JLabel();
        modePane = new javax.swing.JPanel();
        lb_vr_md = new javax.swing.JLabel();
        lb_mn_time = new javax.swing.JLabel();
        pn01 = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 600));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("JOB NO :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("ITEM NO :");

        lb_pr_st.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lb_pr_st.setForeground(new java.awt.Color(51, 51, 51));
        lb_pr_st.setText("00 : 00 : 00");
        lb_pr_st.setMaximumSize(new java.awt.Dimension(100, 25));
        lb_pr_st.setMinimumSize(new java.awt.Dimension(100, 25));
        lb_pr_st.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("START TIME :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("PROFILE TIME : ");

        lb_pr_pt.setBackground(new java.awt.Color(102, 255, 204));
        lb_pr_pt.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lb_pr_pt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_pr_pt.setText("00 : 00 : 00");
        lb_pr_pt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lb_pr_pt.setMaximumSize(new java.awt.Dimension(100, 25));
        lb_pr_pt.setMinimumSize(new java.awt.Dimension(100, 25));
        lb_pr_pt.setOpaque(true);
        lb_pr_pt.setPreferredSize(new java.awt.Dimension(100, 25));

        bt_pr_exit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bt_pr_exit.setText("EXIT");
        bt_pr_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pr_exitActionPerformed(evt);
            }
        });

        bt_pr_pr.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bt_pr_pr.setText("PROFILE");
        bt_pr_pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pr_prActionPerformed(evt);
            }
        });

        bt_pr_finish.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bt_pr_finish.setText("FINISHED");
        bt_pr_finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pr_finishActionPerformed(evt);
            }
        });

        lb_pr_job.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lb_pr_job.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lb_pr_item.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lb_pr_item.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        modePane.setBackground(new java.awt.Color(204, 204, 255));

        lb_vr_md.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lb_vr_md.setForeground(new java.awt.Color(0, 0, 153));
        lb_vr_md.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_vr_md.setText("Profile mode");

        lb_mn_time.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lb_mn_time.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ccs.png"))); // NOI18N

        javax.swing.GroupLayout modePaneLayout = new javax.swing.GroupLayout(modePane);
        modePane.setLayout(modePaneLayout);
        modePaneLayout.setHorizontalGroup(
            modePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modePaneLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lb_mn_time)
                .addGap(156, 156, 156)
                .addComponent(lb_vr_md, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(301, Short.MAX_VALUE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(bt_pr_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_pr_pr, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(bt_pr_finish, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lb_pr_st, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lb_pr_job, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lb_pr_item, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lb_pr_pt, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pn01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88))))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(modePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(modePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_pr_job, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_pr_item, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_pr_st, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pn01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_pr_pt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_pr_finish, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_pr_pr, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_pr_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        setSize(new java.awt.Dimension(1024, 521));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_pr_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pr_exitActionPerformed
        int n = JOptionPane.showConfirmDialog(this,"Are you sure close","An Inane Question",JOptionPane.YES_NO_OPTION);
        if(n==0){

            atime = timer.toInt();
            idealtime = atime;
            timer.Stop();
            try {
                new ideal().dataInsert(new DateTime().date(), stime, idealtime, "PROFILE",nem.user);
            } catch (Exception ex) {
                Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
            }

            this.hide();
        }else{
            
        }
    }//GEN-LAST:event_bt_pr_exitActionPerformed

    private void bt_pr_prActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pr_prActionPerformed

        int n = JOptionPane.showConfirmDialog(this, "Are you wont new profile..","New Profile",JOptionPane.YES_NO_OPTION);
        
        if(n==0){
            
            atime = timer.toInt();
            timer.Stop();
        
            new Profile_Add(null,true).show();
            
            try {
                new profile().dataInsert(new DateTime().date(), job, item, pcb, stime, prtime, atime, 2);
            } catch (Exception ex) {
                Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.hide();
        }else{
 
        }
        
    }//GEN-LAST:event_bt_pr_prActionPerformed

    private void bt_pr_finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pr_finishActionPerformed
       int x = JOptionPane.showConfirmDialog(this, "Are you wont new profile..","New Profile",JOptionPane.YES_NO_OPTION);

       if(x==0){
 
            timer.Stop();
            stime = lb_pr_st.getText();
            atime = timer.toInt();

            try {
                    new profile().dataInsert(new DateTime().date(), job, item, pcb, stime, prtime, atime, 1);
                } catch (Exception ex) {
                    Logger.getLogger(Breakdown.class.getName()).log(Level.SEVERE, null, ex);
                }
            new Main().show();
            this.hide();
        }
        
    }//GEN-LAST:event_bt_pr_finishActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Profile dialog = new Profile(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton bt_pr_exit;
    private javax.swing.JButton bt_pr_finish;
    private javax.swing.JButton bt_pr_pr;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lb_mn_time;
    private javax.swing.JLabel lb_pr_item;
    private javax.swing.JLabel lb_pr_job;
    private javax.swing.JLabel lb_pr_pt;
    private javax.swing.JLabel lb_pr_st;
    private javax.swing.JLabel lb_vr_md;
    private javax.swing.JPanel modePane;
    private javax.swing.JPanel pn01;
    // End of variables declaration//GEN-END:variables
}
