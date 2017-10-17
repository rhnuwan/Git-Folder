package View;

import MenuView.M_Breakdown;
import MenuView.M_Clean;
import MenuView.M_NewLog;
import MenuView.M_Profile;
import MenuView.M_Verification;
import support.Total;

public class Main extends javax.swing.JFrame {
    
    public boolean Click_Clean = false;
    public boolean Click_Profile  = false;
    public Total tt;
 
    public Main() {
        initComponents();
        
        tt = new Total(lb_mn_ideal,lb_reparing);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jMenu1 = new javax.swing.JMenu();
        modePane = new javax.swing.JPanel();
        lb_vr_md = new javax.swing.JLabel();
        lb_mn_time1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        MainPane = new javax.swing.JPanel();
        bt_mn_run = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb_mn_ideal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lb_reparing = new javax.swing.JTextField();
        ButtonPane = new javax.swing.JPanel();
        bt_mn_verification = new javax.swing.JButton();
        bt_mn_profile = new javax.swing.JButton();
        bt_mn_ideal = new javax.swing.JButton();
        bt_mn_clean = new javax.swing.JButton();
        bt_mn_bearkdown = new javax.swing.JButton();
        bt_mn_view = new javax.swing.JButton();
        bt_mn_onhold = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lb_logstate = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mfile = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        mview = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        medit = new javax.swing.JMenu();
        mverification = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        adduser = new javax.swing.JMenu();
        m_adduser = new javax.swing.JMenuItem();
        m_userchange = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WSPM");
        setMaximumSize(new java.awt.Dimension(1024, 570));
        setMinimumSize(new java.awt.Dimension(1024, 570));
        setName("MainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1024, 570));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modePane.setBackground(new java.awt.Color(204, 204, 255));

        lb_vr_md.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lb_vr_md.setForeground(new java.awt.Color(0, 0, 153));
        lb_vr_md.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_vr_md.setText("Wave Solder Production Manager");

        lb_mn_time1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lb_mn_time1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ccs.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 11)); // NOI18N
        jLabel7.setText("Daluwakotuwa");
        jLabel7.setToolTipText("");

        javax.swing.GroupLayout modePaneLayout = new javax.swing.GroupLayout(modePane);
        modePane.setLayout(modePaneLayout);
        modePaneLayout.setHorizontalGroup(
            modePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modePaneLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(modePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_mn_time1)
                    .addGroup(modePaneLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80)
                .addComponent(lb_vr_md, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        modePaneLayout.setVerticalGroup(
            modePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_vr_md, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(modePaneLayout.createSequentialGroup()
                        .addComponent(lb_mn_time1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(modePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, -1));

        MainPane.setBackground(new java.awt.Color(204, 255, 255));
        MainPane.setMaximumSize(new java.awt.Dimension(1024, 540));
        MainPane.setMinimumSize(new java.awt.Dimension(1024, 540));
        MainPane.setPreferredSize(new java.awt.Dimension(1024, 540));
        MainPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_mn_run.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        bt_mn_run.setForeground(new java.awt.Color(0, 0, 153));
        bt_mn_run.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/run.png"))); // NOI18N
        bt_mn_run.setText("RUN");
        bt_mn_run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mn_runActionPerformed(evt);
            }
        });
        MainPane.add(bt_mn_run, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 310, 90));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Today Production Qty :");
        MainPane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MainPane.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 240, 56, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("PCB's");
        MainPane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("Total Loss Time :");
        MainPane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, -1, -1));

        lb_mn_ideal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MainPane.add(lb_mn_ideal, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, 134, 25));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("Total Work Time :");
        MainPane.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, -1, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MainPane.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 330, 134, 25));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setText("Total Reparing Time :");
        MainPane.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, -1, -1));

        lb_reparing.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MainPane.add(lb_reparing, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, 134, 25));

        ButtonPane.setBackground(new java.awt.Color(204, 255, 255));

        bt_mn_verification.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        bt_mn_verification.setForeground(new java.awt.Color(0, 51, 153));
        bt_mn_verification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Setting.png"))); // NOI18N
        bt_mn_verification.setText("Verification");
        bt_mn_verification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mn_verificationActionPerformed(evt);
            }
        });

        bt_mn_profile.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        bt_mn_profile.setForeground(new java.awt.Color(0, 51, 153));
        bt_mn_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/profile.png"))); // NOI18N
        bt_mn_profile.setText("Profile");
        bt_mn_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mn_profileActionPerformed(evt);
            }
        });

        bt_mn_ideal.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        bt_mn_ideal.setForeground(new java.awt.Color(0, 51, 153));
        bt_mn_ideal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ideal.png"))); // NOI18N
        bt_mn_ideal.setText("Ideal");
        bt_mn_ideal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mn_idealActionPerformed(evt);
            }
        });

        bt_mn_clean.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        bt_mn_clean.setForeground(new java.awt.Color(0, 51, 153));
        bt_mn_clean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Clean.png"))); // NOI18N
        bt_mn_clean.setText("Clean");
        bt_mn_clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mn_cleanActionPerformed(evt);
            }
        });

        bt_mn_bearkdown.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        bt_mn_bearkdown.setForeground(new java.awt.Color(0, 51, 153));
        bt_mn_bearkdown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Repair.png"))); // NOI18N
        bt_mn_bearkdown.setText("Breakdown");
        bt_mn_bearkdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mn_bearkdownActionPerformed(evt);
            }
        });

        bt_mn_view.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        bt_mn_view.setForeground(new java.awt.Color(0, 51, 153));
        bt_mn_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/view.png"))); // NOI18N
        bt_mn_view.setText("View");
        bt_mn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mn_viewActionPerformed(evt);
            }
        });

        bt_mn_onhold.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        bt_mn_onhold.setForeground(new java.awt.Color(0, 51, 153));
        bt_mn_onhold.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/wait.png"))); // NOI18N
        bt_mn_onhold.setText("On Hold");
        bt_mn_onhold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mn_onholdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonPaneLayout = new javax.swing.GroupLayout(ButtonPane);
        ButtonPane.setLayout(ButtonPaneLayout);
        ButtonPaneLayout.setHorizontalGroup(
            ButtonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_mn_verification, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(bt_mn_bearkdown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_mn_clean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addGroup(ButtonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_mn_profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_mn_onhold, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(bt_mn_ideal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_mn_view, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        ButtonPaneLayout.setVerticalGroup(
            ButtonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_mn_verification, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_mn_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ButtonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_mn_onhold, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_mn_bearkdown, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ButtonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_mn_clean, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_mn_ideal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_mn_view, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        MainPane.add(ButtonPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 570, 370));

        getContentPane().add(MainPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 490));

        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 30));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 30));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setText("Login :");

        lb_logstate.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lb_logstate.setText("user");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lb_logstate)
                .addContainerGap(937, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lb_logstate))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, -1, 30));

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 153));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(90, 30));

        mfile.setText("File");
        mfile.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mfile.setPreferredSize(new java.awt.Dimension(45, 25));

        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem7.setText("Exit");
        jMenuItem7.setPreferredSize(new java.awt.Dimension(75, 35));
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        mfile.add(jMenuItem7);

        jMenuBar1.add(mfile);

        mview.setBackground(new java.awt.Color(204, 255, 204));
        mview.setText("View");
        mview.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mview.setPreferredSize(new java.awt.Dimension(55, 25));

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem1.setText("Profile");
        jMenuItem1.setPreferredSize(new java.awt.Dimension(127, 35));
        mview.add(jMenuItem1);

        jMenuBar1.add(mview);

        medit.setText("Edit");
        medit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        medit.setPreferredSize(new java.awt.Dimension(45, 25));

        mverification.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mverification.setText("Verfication");
        mverification.setPreferredSize(new java.awt.Dimension(127, 35));
        mverification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mverificationActionPerformed(evt);
            }
        });
        medit.add(mverification);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem3.setText("Clean");
        jMenuItem3.setPreferredSize(new java.awt.Dimension(131, 35));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        medit.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem4.setText("Profile");
        jMenuItem4.setPreferredSize(new java.awt.Dimension(131, 35));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        medit.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem5.setText("Breakdown");
        jMenuItem5.setPreferredSize(new java.awt.Dimension(131, 35));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        medit.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem6.setText("Run");
        jMenuItem6.setPreferredSize(new java.awt.Dimension(131, 35));
        medit.add(jMenuItem6);

        adduser.setText("Login");
        adduser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        adduser.setPreferredSize(new java.awt.Dimension(137, 35));

        m_adduser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        m_adduser.setText("Add user");
        m_adduser.setPreferredSize(new java.awt.Dimension(115, 35));
        m_adduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_adduserActionPerformed(evt);
            }
        });
        adduser.add(m_adduser);

        m_userchange.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        m_userchange.setText("Change");
        m_userchange.setPreferredSize(new java.awt.Dimension(115, 35));
        adduser.add(m_userchange);

        medit.add(adduser);

        jMenuBar1.add(medit);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_mn_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mn_profileActionPerformed
       new Profile_Add(this,false).show();
    }//GEN-LAST:event_bt_mn_profileActionPerformed

    private void bt_mn_cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mn_cleanActionPerformed
        new Clean(this,false).show();
    }//GEN-LAST:event_bt_mn_cleanActionPerformed

    private void bt_mn_bearkdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mn_bearkdownActionPerformed
        new Breakdown(this,true).show();
    }//GEN-LAST:event_bt_mn_bearkdownActionPerformed

    private void bt_mn_verificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mn_verificationActionPerformed
        new Verification(this,true).show();
    }//GEN-LAST:event_bt_mn_verificationActionPerformed

    private void bt_mn_runActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mn_runActionPerformed
        new Run_job(this,false).show();
    }//GEN-LAST:event_bt_mn_runActionPerformed

    private void bt_mn_idealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mn_idealActionPerformed
         new Ideal(this,true).show();
    }//GEN-LAST:event_bt_mn_idealActionPerformed

    private void bt_mn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mn_viewActionPerformed
        new VExcel(this,false).show();
    }//GEN-LAST:event_bt_mn_viewActionPerformed

    private void m_adduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_adduserActionPerformed
       new M_NewLog(this,false).show();
         this.enable();
    }//GEN-LAST:event_m_adduserActionPerformed

    private void mverificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mverificationActionPerformed
        new M_Verification(this,false).show();
         this.enable();
    }//GEN-LAST:event_mverificationActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       new M_Clean(this,false).show();
         this.enable();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new M_Profile(this,false).show();
         this.enable();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new M_Breakdown(this,false).show();
         this.enable();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void bt_mn_onholdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mn_onholdActionPerformed
        new OnHold(this,false).show();
    }//GEN-LAST:event_bt_mn_onholdActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPane;
    private javax.swing.JPanel MainPane;
    private javax.swing.JMenu adduser;
    private javax.swing.JButton bt_mn_bearkdown;
    private javax.swing.JButton bt_mn_clean;
    private javax.swing.JButton bt_mn_ideal;
    private javax.swing.JButton bt_mn_onhold;
    private javax.swing.JButton bt_mn_profile;
    private javax.swing.JButton bt_mn_run;
    private javax.swing.JButton bt_mn_verification;
    private javax.swing.JButton bt_mn_view;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lb_logstate;
    private javax.swing.JTextField lb_mn_ideal;
    private javax.swing.JLabel lb_mn_time1;
    private javax.swing.JTextField lb_reparing;
    private javax.swing.JLabel lb_vr_md;
    private javax.swing.JMenuItem m_adduser;
    private javax.swing.JMenuItem m_userchange;
    private javax.swing.JMenu medit;
    private javax.swing.JMenu mfile;
    private javax.swing.JPanel modePane;
    private javax.swing.JMenuItem mverification;
    private javax.swing.JMenu mview;
    // End of variables declaration//GEN-END:variables
}
