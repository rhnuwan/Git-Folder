
package View;

import java.util.logging.Level;
import java.util.logging.Logger;
import support.export.TableView;
import support.nem;

public class VExcel extends javax.swing.JDialog {

    public String timeperiod;
    public String viewmode;
    
    public TableView tview;

    
    public VExcel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modePane = new javax.swing.JPanel();
        lb_vr_md = new javax.swing.JLabel();
        lb_mn_time = new javax.swing.JLabel();
        cmbtime = new javax.swing.JComboBox<>();
        cmbview = new javax.swing.JComboBox<>();
        bt_show = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        bt_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setUndecorated(true);

        modePane.setBackground(new java.awt.Color(204, 204, 255));

        lb_vr_md.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lb_vr_md.setForeground(new java.awt.Color(0, 0, 153));
        lb_vr_md.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_vr_md.setText("View mode");

        lb_mn_time.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lb_mn_time.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ccs.png"))); // NOI18N

        javax.swing.GroupLayout modePaneLayout = new javax.swing.GroupLayout(modePane);
        modePane.setLayout(modePaneLayout);
        modePaneLayout.setHorizontalGroup(
            modePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modePaneLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lb_mn_time)
                .addGap(29, 29, 29)
                .addComponent(lb_vr_md, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(428, Short.MAX_VALUE))
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

        cmbtime.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        cmbtime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Today", "This Week", "Last Week", "Last 2 Week", "Last Month", "Last 2 Month", "Last 3 Month", "Last 4 Month", "Last 6 Month", "This Year" }));
        cmbtime.setToolTipText("");

        cmbview.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        cmbview.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Verification", "Profile", "Cleaning", "Breakdown", "On Hold", "Ideal", "Run" }));

        bt_show.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        bt_show.setText("Show");
        bt_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_showActionPerformed(evt);
            }
        });

        table.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.setToolTipText("");
        table.setEnabled(false);
        jScrollPane1.setViewportView(table);

        jButton2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jButton2.setText("Export");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jButton3.setText("Print");

        jButton4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        bt_clear.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        bt_clear.setText("Clear");
        bt_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(cmbtime, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbview, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_show, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(modePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbtime)
                    .addComponent(cmbview)
                    .addComponent(bt_show, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        setSize(new java.awt.Dimension(1024, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_showActionPerformed
        
        viewmode = cmbview.getItemAt(cmbview.getSelectedIndex());
        timeperiod = cmbtime.getItemAt(cmbtime.getSelectedIndex());
        
        tview = new TableView(viewmode,timeperiod,table);
            table.setEnabled(true);
            tview.Reset();
            tview.Start();
            nem.gettable = true;

    }//GEN-LAST:event_bt_showActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.hide();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        if(table.isEnabled() && nem.gettable == true){
            try {
                tview.setExport();
            } catch (Exception ex) {
                Logger.getLogger(VExcel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bt_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_clearActionPerformed
        tview.Reset();
        nem.gettable = false;
    }//GEN-LAST:event_bt_clearActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VExcel dialog = new VExcel(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton bt_clear;
    private javax.swing.JButton bt_show;
    private javax.swing.JComboBox<String> cmbtime;
    private javax.swing.JComboBox<String> cmbview;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_mn_time;
    private javax.swing.JLabel lb_vr_md;
    private javax.swing.JPanel modePane;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
