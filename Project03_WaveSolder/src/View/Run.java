package View;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import support.DateTime;
import support.Timer;
import support.runmode;

public class Run extends javax.swing.JDialog {

    public String stime;
    public String job;
    public String item;
    public Timer timer;
    public int pqty=0;
    public int wrqty=0;
    public int rtime;
    
    
    
    public Run(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }
    public Run(java.awt.Frame parent, boolean modal,String txtjob,String txtitem) {
        super(parent, modal);
        initComponents();
        
        timer = new Timer(lb_rn_pt);
        timer.Start();
        
        txt_rn_job.setText(txtjob);
        txt_rn_item.setText(txtitem);
        
        this.job = txtjob;
        this.item = txtitem;
        this.stime = lb_rn_pt.getText();
        
    }

    Run(Object object, boolean b, String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        bt_rn_canel = new javax.swing.JButton();
        bt_rn_fn = new javax.swing.JButton();
        bt_rn_job = new javax.swing.JButton();
        bt_rn_off = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_rn_qty = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_rn_job = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_rn_item = new javax.swing.JTextField();
        lb_rn_pt = new javax.swing.JLabel();
        txt_rn_wr = new javax.swing.JTextField();
        modePane = new javax.swing.JPanel();
        lb_vr_md = new javax.swing.JLabel();
        lb_mn_time = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 600));
        setResizable(false);

        bt_rn_canel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bt_rn_canel.setText("CANCEL");
        bt_rn_canel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_rn_canelActionPerformed(evt);
            }
        });

        bt_rn_fn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bt_rn_fn.setText("FINISHED");
        bt_rn_fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_rn_fnActionPerformed(evt);
            }
        });

        bt_rn_job.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bt_rn_job.setText("JOB");
        bt_rn_job.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_rn_jobActionPerformed(evt);
            }
        });

        bt_rn_off.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_rn_off.setText("OFF");

        jPanel3.setBackground(new java.awt.Color(51, 255, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("WRONG INSERTING :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("RUN TIME :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("PRODUCTION QTY. :");

        txt_rn_qty.setBackground(new java.awt.Color(102, 255, 204));
        txt_rn_qty.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt_rn_qty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_rn_qty.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setText("ITEM NO : ");

        txt_rn_job.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_rn_job.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("JOB NO : ");

        txt_rn_item.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_rn_item.setEnabled(false);

        lb_rn_pt.setBackground(new java.awt.Color(0, 255, 255));
        lb_rn_pt.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lb_rn_pt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_rn_pt.setText("00:00:00");
        lb_rn_pt.setOpaque(true);

        txt_rn_wr.setBackground(new java.awt.Color(102, 255, 204));
        txt_rn_wr.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt_rn_wr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_rn_wr.setEnabled(false);

        modePane.setBackground(new java.awt.Color(204, 204, 255));

        lb_vr_md.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lb_vr_md.setForeground(new java.awt.Color(0, 0, 153));
        lb_vr_md.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_vr_md.setText("Run mode");

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
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_rn_job, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_rn_item, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(404, 404, 404)
                                        .addComponent(txt_rn_wr, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(404, 404, 404)
                                    .addComponent(txt_rn_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_rn_off, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_rn_job, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_rn_canel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(bt_rn_fn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(124, 124, 124)
                        .addComponent(lb_rn_pt, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(modePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_rn_job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_rn_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_rn_off, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_rn_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_rn_wr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_rn_pt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_rn_canel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_rn_job, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_rn_fn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        setSize(new java.awt.Dimension(1024, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_rn_canelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_rn_canelActionPerformed
        int x = JOptionPane.showConfirmDialog(this, "Are you sure close this operation...", "Cancel Run Mode .",JOptionPane.YES_OPTION);
  
        if(x == 0){
            
            timer.Stop();
            rtime = timer.toInt();
            
            try {
                new runmode().dataInsert(new DateTime().date(),job,item,pqty,wrqty,rtime);
            } catch (Exception ex) {
                Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            this.hide();
        }
    }//GEN-LAST:event_bt_rn_canelActionPerformed

    private void bt_rn_fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_rn_fnActionPerformed
       int x = JOptionPane.showConfirmDialog(this, "Are you sure finish this operation...", "Finished .",JOptionPane.YES_OPTION);
  
        if(x == 0){
            
            timer.Stop();
            rtime = timer.toInt();
            
            try {
                new runmode().dataInsert(new DateTime().date(),job,item,pqty,wrqty,rtime);
            } catch (Exception ex) {
                Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            this.hide();
        }
    }//GEN-LAST:event_bt_rn_fnActionPerformed

    private void bt_rn_jobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_rn_jobActionPerformed
        
        int x = JOptionPane.showConfirmDialog(this, "Are you sure finish this operation and new job", "new job .",JOptionPane.YES_OPTION);
  
        if(x == 0){
            
            timer.Stop();
            rtime = timer.toInt();
            
            try {
                new runmode().dataInsert(new DateTime().date(),job,item,pqty,wrqty,rtime);
            } catch (Exception ex) {
                Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
            }
            new Run_job(null,false).show();
            this.hide();
            
        }
    }//GEN-LAST:event_bt_rn_jobActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Run dialog = new Run(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton bt_rn_canel;
    private javax.swing.JButton bt_rn_fn;
    private javax.swing.JButton bt_rn_job;
    private javax.swing.JButton bt_rn_off;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lb_mn_time;
    private javax.swing.JLabel lb_rn_pt;
    private javax.swing.JLabel lb_vr_md;
    private javax.swing.JPanel modePane;
    private javax.swing.JTextField txt_rn_item;
    private javax.swing.JTextField txt_rn_job;
    private javax.swing.JTextField txt_rn_qty;
    private javax.swing.JTextField txt_rn_wr;
    // End of variables declaration//GEN-END:variables
}
