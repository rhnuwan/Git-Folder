package View;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import support.DateTime;
import support.Timer;
import contorl.ideal;
import support.nem;

public class Ideal extends javax.swing.JDialog {
    
    public Timer timer;
    public String stime;
    public int idealtime;

    public Ideal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        timer = new Timer(lb_id_ideal);        
        timer.Start();

        new DateTime().time(lb_id_st);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        lb_id_ideal = new javax.swing.JLabel();
        lb_id_st = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bt_vr_fn = new javax.swing.JButton();
        modePane = new javax.swing.JPanel();
        lb_vr_md = new javax.swing.JLabel();
        lb_mn_time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setUndecorated(true);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Start Time :");

        lb_id_ideal.setBackground(new java.awt.Color(102, 255, 204));
        lb_id_ideal.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lb_id_ideal.setForeground(new java.awt.Color(0, 51, 204));
        lb_id_ideal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_id_ideal.setText("00: 00 : 00");
        lb_id_ideal.setOpaque(true);

        lb_id_st.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lb_id_st.setText("00 : 00 : 00");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setText("IDEAL TIME :");

        bt_vr_fn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bt_vr_fn.setText("FINISHED");
        bt_vr_fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_vr_fnActionPerformed(evt);
            }
        });

        modePane.setBackground(new java.awt.Color(204, 204, 255));

        lb_vr_md.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lb_vr_md.setForeground(new java.awt.Color(0, 0, 153));
        lb_vr_md.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_vr_md.setText("Ideal mode");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_vr_fn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addComponent(lb_id_st)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_id_ideal, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(modePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(modePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lb_id_st))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lb_id_ideal))
                .addGap(118, 118, 118)
                .addComponent(bt_vr_fn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        setSize(new java.awt.Dimension(1024, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_vr_fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_vr_fnActionPerformed
        
        int x = JOptionPane.showConfirmDialog(null, "Are you sure finished..","Finished.",JOptionPane.OK_OPTION);
        
        if(x == 0 ){
            
            timer.Stop();
            idealtime = timer.toInt();
            stime = lb_id_st.getText();
       
            try {                       
                new ideal().dataInsert(new DateTime().date(), stime, idealtime, "IDEAL",nem.user);
            } catch (Exception ex) {
                Logger.getLogger(Ideal.class.getName()).log(Level.SEVERE, null, ex);
            }
 
            this.hide();

        }
    }//GEN-LAST:event_bt_vr_fnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ideal dialog = new Ideal(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton bt_vr_fn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lb_id_ideal;
    private javax.swing.JLabel lb_id_st;
    private javax.swing.JLabel lb_mn_time;
    private javax.swing.JLabel lb_vr_md;
    private javax.swing.JPanel modePane;
    // End of variables declaration//GEN-END:variables
}
