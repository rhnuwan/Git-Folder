
package View;

public class OnHold extends javax.swing.JDialog {

    public OnHold(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_id_md = new javax.swing.JLabel();
        lb_id_st = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb_id_ideal = new javax.swing.JLabel();
        bt_vr_fn = new javax.swing.JButton();
        bt_vr_com2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lb_id_md.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lb_id_md.setText("ON HOLD MODE");

        lb_id_st.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lb_id_st.setText("00 : 00 : 00");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Start Time :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("IDEAL TIME :");

        lb_id_ideal.setBackground(new java.awt.Color(102, 255, 204));
        lb_id_ideal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lb_id_ideal.setForeground(new java.awt.Color(0, 51, 204));
        lb_id_ideal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_id_ideal.setText("00: 00 : 00");
        lb_id_ideal.setOpaque(true);

        bt_vr_fn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bt_vr_fn.setText("FINISHED");
        bt_vr_fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_vr_fnActionPerformed(evt);
            }
        });

        bt_vr_com2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bt_vr_com2.setText("VIEW");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(bt_vr_com2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addComponent(lb_id_st)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lb_id_ideal, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(157, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_vr_fn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(lb_id_md)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lb_id_md)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lb_id_st))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lb_id_ideal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_vr_com2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_vr_fn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_vr_fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_vr_fnActionPerformed

            this.hide();
        
    }//GEN-LAST:event_bt_vr_fnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                OnHold dialog = new OnHold(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton bt_vr_com2;
    private javax.swing.JButton bt_vr_fn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lb_id_ideal;
    private javax.swing.JLabel lb_id_md;
    private javax.swing.JLabel lb_id_st;
    // End of variables declaration//GEN-END:variables
}
