package View;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import support.BGCollorChange;
import support.Timer;
import support.DateTime;
import contorl.clean;
import contorl.ideal;
import support.nem;

public class Clean extends javax.swing.JDialog {
    public Timer timer;
    public int atime;
    public int idealtime;
    public String stime;
    public int dtime;
    public clean cl;

    public Clean(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();   
        timer = new Timer(lb_clean_actual);
        timer.Start();

        DateTime cn = new DateTime();
        
        cn.time(lb_clean_st);        
        stime = lb_clean_st.getText();
        
        dtime = nem.cleantime*60;
        
        lb_clean_duration.setText(cn.getTimeFormat(dtime));
        new BGCollorChange(pnl_color, Color.red, timer, dtime);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        lb_clean_st = new javax.swing.JLabel();
        lb_clean_duration = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb_clean_actual = new javax.swing.JLabel();
        bt_clean_cn = new javax.swing.JButton();
        bt_clean_fn = new javax.swing.JButton();
        pnl_color = new javax.swing.JPanel();
        modePane = new javax.swing.JPanel();
        lb_vr_md = new javax.swing.JLabel();
        lb_mn_time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 600));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Start Time : ");

        lb_clean_st.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lb_clean_st.setForeground(new java.awt.Color(255, 153, 0));
        lb_clean_st.setText("00 : 00 : 00 ");
        lb_clean_st.setMaximumSize(new java.awt.Dimension(100, 25));
        lb_clean_st.setMinimumSize(new java.awt.Dimension(100, 25));
        lb_clean_st.setPreferredSize(new java.awt.Dimension(100, 25));

        lb_clean_duration.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lb_clean_duration.setForeground(new java.awt.Color(255, 153, 0));
        lb_clean_duration.setText("00 : 00 : 00 ");
        lb_clean_duration.setMaximumSize(new java.awt.Dimension(100, 25));
        lb_clean_duration.setMinimumSize(new java.awt.Dimension(100, 25));
        lb_clean_duration.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Given Time Duration : ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Actual Time : ");

        lb_clean_actual.setBackground(new java.awt.Color(153, 255, 153));
        lb_clean_actual.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lb_clean_actual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_clean_actual.setText("00 : 00 : 00 ");
        lb_clean_actual.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lb_clean_actual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_clean_actual.setMaximumSize(new java.awt.Dimension(100, 25));
        lb_clean_actual.setMinimumSize(new java.awt.Dimension(100, 25));
        lb_clean_actual.setOpaque(true);
        lb_clean_actual.setPreferredSize(new java.awt.Dimension(100, 25));

        bt_clean_cn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bt_clean_cn.setText("CANCEL");
        bt_clean_cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_clean_cnActionPerformed(evt);
            }
        });

        bt_clean_fn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bt_clean_fn.setText("FINISHED");
        bt_clean_fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_clean_fnActionPerformed(evt);
            }
        });

        pnl_color.setBackground(new java.awt.Color(0, 255, 0));
        pnl_color.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        pnl_color.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout pnl_colorLayout = new javax.swing.GroupLayout(pnl_color);
        pnl_color.setLayout(pnl_colorLayout);
        pnl_colorLayout.setHorizontalGroup(
            pnl_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );
        pnl_colorLayout.setVerticalGroup(
            pnl_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        modePane.setBackground(new java.awt.Color(204, 204, 255));

        lb_vr_md.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lb_vr_md.setForeground(new java.awt.Color(0, 0, 153));
        lb_vr_md.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_vr_md.setText("Cleaning mode");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_clean_duration, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_clean_st, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(60, 60, 60)
                        .addComponent(lb_clean_actual, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(bt_clean_cn, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_clean_fn, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_clean_st, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_clean_duration, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(pnl_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_clean_actual, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_clean_cn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_clean_fn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        setSize(new java.awt.Dimension(1024, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_clean_fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_clean_fnActionPerformed
        
        int n = JOptionPane.showConfirmDialog(this,"Are you sure close","An Inane Question",JOptionPane.YES_NO_OPTION);
        
        if(n==0){

            atime = timer.toInt();
            timer.Stop();

            try {
                new clean().dataInsert(new DateTime().date(), stime, dtime, atime);
            } catch (Exception ex) {
                Logger.getLogger(Clean.class.getName()).log(Level.SEVERE, null, ex);
            }

            this.hide();
        }else{
            
        }
    }//GEN-LAST:event_bt_clean_fnActionPerformed

    private void bt_clean_cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_clean_cnActionPerformed
        
        int n = JOptionPane.showConfirmDialog(this,"Are you sure close","Cancel cleaning.",JOptionPane.YES_NO_OPTION);
        
        if(n==0){
            atime = timer.toInt();
            idealtime = atime;
            System.out.println(idealtime);
            try {
                new ideal().dataInsert(new DateTime().date(), stime, idealtime, "CLEAN",nem.user);
            } catch (Exception ex) {
                Logger.getLogger(Clean.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            this.hide();
            
        }else{
            
        }
        
    }//GEN-LAST:event_bt_clean_cnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Clean dialog = new Clean(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton bt_clean_cn;
    private javax.swing.JButton bt_clean_fn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lb_clean_actual;
    private javax.swing.JLabel lb_clean_duration;
    private javax.swing.JLabel lb_clean_st;
    private javax.swing.JLabel lb_mn_time;
    private javax.swing.JLabel lb_vr_md;
    private javax.swing.JPanel modePane;
    private javax.swing.JPanel pnl_color;
    // End of variables declaration//GEN-END:variables

}
