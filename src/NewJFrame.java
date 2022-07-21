
import java.awt.Color;

public class NewJFrame extends javax.swing.JFrame
{

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        kGradientPanel4 = new com.k33ptoo.components.KGradientPanel();
        txt_add_promcb_brand_id = new textfield.TextField();
        txt_add_promcb_brand_nm = new textfield.TextField();
        loginBtn8 = new com.k33ptoo.components.KButton();
        loginBtn10 = new com.k33ptoo.components.KButton();
        txt_add_promcb_ctrgy_id1 = new textfield.TextField();
        txt_add_promcb_ctrgy_id = new textfield.TextField();
        loginBtn11 = new com.k33ptoo.components.KButton();
        loginBtn12 = new com.k33ptoo.components.KButton();
        txt_add_promcb_model_id1 = new textfield.TextField();
        txt_add_promcb_model_nm1 = new textfield.TextField();
        loginBtn13 = new com.k33ptoo.components.KButton();
        loginBtn14 = new com.k33ptoo.components.KButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel4.setkBorderRadius(40);
        kGradientPanel4.setkEndColor(new java.awt.Color(228, 235, 246));
        kGradientPanel4.setkStartColor(new java.awt.Color(228, 235, 246));
        kGradientPanel4.setOpaque(false);

        txt_add_promcb_brand_id.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_promcb_brand_id.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_promcb_brand_id.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_promcb_brand_id.setLabelText("BRAND ID");
        txt_add_promcb_brand_id.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_brand_id.setName(""); // NOI18N
        txt_add_promcb_brand_id.setSelectionColor(new java.awt.Color(68, 82, 121));

        txt_add_promcb_brand_nm.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_promcb_brand_nm.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_promcb_brand_nm.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_promcb_brand_nm.setLabelText("BRAND NAME");
        txt_add_promcb_brand_nm.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_brand_nm.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_brand_nm.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txt_add_promcb_brand_nmActionPerformed(evt);
            }
        });

        loginBtn8.setBorder(null);
        loginBtn8.setText("ADD");
        loginBtn8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn8.setkBorderRadius(30);
        loginBtn8.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn8.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        loginBtn8.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn8.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        loginBtn8.setkStartColor(new java.awt.Color(68, 82, 121));
        loginBtn8.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                loginBtn8ActionPerformed(evt);
            }
        });

        loginBtn10.setBorder(null);
        loginBtn10.setText("REMOVE");
        loginBtn10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn10.setkBorderRadius(30);
        loginBtn10.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn10.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        loginBtn10.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn10.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        loginBtn10.setkStartColor(new java.awt.Color(68, 82, 121));
        loginBtn10.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                loginBtn10ActionPerformed(evt);
            }
        });

        txt_add_promcb_ctrgy_id1.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_promcb_ctrgy_id1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_promcb_ctrgy_id1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_promcb_ctrgy_id1.setLabelText("CATEGORY ID");
        txt_add_promcb_ctrgy_id1.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_ctrgy_id1.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_ctrgy_id1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txt_add_promcb_ctrgy_id1ActionPerformed(evt);
            }
        });

        txt_add_promcb_ctrgy_id.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_promcb_ctrgy_id.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_promcb_ctrgy_id.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_promcb_ctrgy_id.setLabelText("CATEGORY NAME");
        txt_add_promcb_ctrgy_id.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_ctrgy_id.setSelectionColor(new java.awt.Color(68, 82, 121));

        loginBtn11.setBorder(null);
        loginBtn11.setText("ADD");
        loginBtn11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn11.setkBorderRadius(30);
        loginBtn11.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn11.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        loginBtn11.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn11.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        loginBtn11.setkStartColor(new java.awt.Color(68, 82, 121));
        loginBtn11.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                loginBtn11ActionPerformed(evt);
            }
        });

        loginBtn12.setBorder(null);
        loginBtn12.setText("REMOVE");
        loginBtn12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn12.setkBorderRadius(30);
        loginBtn12.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn12.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        loginBtn12.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn12.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        loginBtn12.setkStartColor(new java.awt.Color(68, 82, 121));
        loginBtn12.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                loginBtn12ActionPerformed(evt);
            }
        });

        txt_add_promcb_model_id1.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_promcb_model_id1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_promcb_model_id1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_promcb_model_id1.setLabelText("MODEL ID");
        txt_add_promcb_model_id1.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_model_id1.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_model_id1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txt_add_promcb_model_id1ActionPerformed(evt);
            }
        });

        txt_add_promcb_model_nm1.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_promcb_model_nm1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_promcb_model_nm1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_promcb_model_nm1.setLabelText("MODEL NAME");
        txt_add_promcb_model_nm1.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_model_nm1.setSelectionColor(new java.awt.Color(68, 82, 121));

        loginBtn13.setBorder(null);
        loginBtn13.setText("ADD");
        loginBtn13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn13.setkBorderRadius(30);
        loginBtn13.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn13.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        loginBtn13.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn13.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        loginBtn13.setkStartColor(new java.awt.Color(68, 82, 121));
        loginBtn13.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                loginBtn13ActionPerformed(evt);
            }
        });

        loginBtn14.setBorder(null);
        loginBtn14.setText("REMOVE");
        loginBtn14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn14.setkBorderRadius(30);
        loginBtn14.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn14.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        loginBtn14.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn14.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        loginBtn14.setkStartColor(new java.awt.Color(68, 82, 121));
        loginBtn14.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                loginBtn14ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("ADD BRAND");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3)
                .addContainerGap())
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(txt_add_promcb_brand_id, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_add_promcb_brand_nm, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(loginBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_add_promcb_model_id1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(txt_add_promcb_ctrgy_id1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_add_promcb_ctrgy_id, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                .addComponent(txt_add_promcb_model_nm1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loginBtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loginBtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_add_promcb_brand_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_promcb_brand_nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(loginBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_add_promcb_ctrgy_id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_promcb_ctrgy_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(loginBtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_add_promcb_model_nm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_add_promcb_model_id1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(loginBtn14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_add_promcb_brand_nmActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txt_add_promcb_brand_nmActionPerformed
    {//GEN-HEADEREND:event_txt_add_promcb_brand_nmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_add_promcb_brand_nmActionPerformed

    private void loginBtn8ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_loginBtn8ActionPerformed
    {//GEN-HEADEREND:event_loginBtn8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtn8ActionPerformed

    private void loginBtn10ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_loginBtn10ActionPerformed
    {//GEN-HEADEREND:event_loginBtn10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtn10ActionPerformed

    private void txt_add_promcb_ctrgy_id1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txt_add_promcb_ctrgy_id1ActionPerformed
    {//GEN-HEADEREND:event_txt_add_promcb_ctrgy_id1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_add_promcb_ctrgy_id1ActionPerformed

    private void loginBtn11ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_loginBtn11ActionPerformed
    {//GEN-HEADEREND:event_loginBtn11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtn11ActionPerformed

    private void loginBtn12ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_loginBtn12ActionPerformed
    {//GEN-HEADEREND:event_loginBtn12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtn12ActionPerformed

    private void txt_add_promcb_model_id1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txt_add_promcb_model_id1ActionPerformed
    {//GEN-HEADEREND:event_txt_add_promcb_model_id1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_add_promcb_model_id1ActionPerformed

    private void loginBtn13ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_loginBtn13ActionPerformed
    {//GEN-HEADEREND:event_loginBtn13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtn13ActionPerformed

    private void loginBtn14ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_loginBtn14ActionPerformed
    {//GEN-HEADEREND:event_loginBtn14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtn14ActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    private com.k33ptoo.components.KButton loginBtn10;
    private com.k33ptoo.components.KButton loginBtn11;
    private com.k33ptoo.components.KButton loginBtn12;
    private com.k33ptoo.components.KButton loginBtn13;
    private com.k33ptoo.components.KButton loginBtn14;
    private com.k33ptoo.components.KButton loginBtn8;
    private textfield.TextField txt_add_promcb_brand_id;
    private textfield.TextField txt_add_promcb_brand_nm;
    private textfield.TextField txt_add_promcb_ctrgy_id;
    private textfield.TextField txt_add_promcb_ctrgy_id1;
    private textfield.TextField txt_add_promcb_model_id1;
    private textfield.TextField txt_add_promcb_model_nm1;
    // End of variables declaration//GEN-END:variables
}
