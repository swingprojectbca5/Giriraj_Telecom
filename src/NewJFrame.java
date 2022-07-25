
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

        panel_billmenu = new com.k33ptoo.components.KGradientPanel();
        panel_addcustmenu7 = new com.k33ptoo.components.KGradientPanel();
        indicatorAddpro = new com.k33ptoo.components.KGradientPanel();
        btn_addpro = new com.k33ptoo.components.KButton();
        panel_addcustmenu10 = new com.k33ptoo.components.KGradientPanel();
        indicatorAddmodal = new com.k33ptoo.components.KGradientPanel();
        btn_addmodal = new com.k33ptoo.components.KButton();
        panel_addcustmenu12 = new com.k33ptoo.components.KGradientPanel();
        indicatorDetpro = new com.k33ptoo.components.KGradientPanel();
        btn_detPro = new com.k33ptoo.components.KButton();
        panel_addcustmenu15 = new com.k33ptoo.components.KGradientPanel();
        indicatorEditpro = new com.k33ptoo.components.KGradientPanel();
        btn_editPro = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_billmenu.setkBorderRadius(40);
        panel_billmenu.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_billmenu.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_billmenu.setOpaque(false);

        panel_addcustmenu7.setkBorderRadius(40);
        panel_addcustmenu7.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_addcustmenu7.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_addcustmenu7.setOpaque(false);

        indicatorAddpro.setkEndColor(new java.awt.Color(209, 216, 224));
        indicatorAddpro.setkStartColor(new java.awt.Color(209, 216, 224));
        indicatorAddpro.setOpaque(false);

        javax.swing.GroupLayout indicatorAddproLayout = new javax.swing.GroupLayout(indicatorAddpro);
        indicatorAddpro.setLayout(indicatorAddproLayout);
        indicatorAddproLayout.setHorizontalGroup(
            indicatorAddproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        indicatorAddproLayout.setVerticalGroup(
            indicatorAddproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        btn_addpro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_addpro.setText("ADD PRODUCT");
        btn_addpro.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_addpro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_addpro.setkBorderRadius(20);
        btn_addpro.setkEndColor(new java.awt.Color(178, 199, 231));
        btn_addpro.setkHoverColor(new java.awt.Color(68, 82, 121));
        btn_addpro.setkHoverEndColor(new java.awt.Color(68, 82, 121));
        btn_addpro.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_addpro.setkHoverStartColor(new java.awt.Color(68, 82, 121));
        btn_addpro.setkPressedColor(new java.awt.Color(68, 82, 121));
        btn_addpro.setkSelectedColor(new java.awt.Color(68, 82, 121));
        btn_addpro.setkStartColor(new java.awt.Color(178, 199, 231));
        btn_addpro.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_addproFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_addproFocusLost(evt);
            }
        });
        btn_addpro.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btn_addproMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_addproMouseEntered(evt);
            }
        });
        btn_addpro.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_addproKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_addcustmenu7Layout = new javax.swing.GroupLayout(panel_addcustmenu7);
        panel_addcustmenu7.setLayout(panel_addcustmenu7Layout);
        panel_addcustmenu7Layout.setHorizontalGroup(
            panel_addcustmenu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcustmenu7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_addcustmenu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indicatorAddpro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_addpro, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_addcustmenu7Layout.setVerticalGroup(
            panel_addcustmenu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcustmenu7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_addpro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicatorAddpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_addcustmenu10.setkBorderRadius(40);
        panel_addcustmenu10.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_addcustmenu10.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_addcustmenu10.setOpaque(false);

        indicatorAddmodal.setkEndColor(new java.awt.Color(209, 216, 224));
        indicatorAddmodal.setkStartColor(new java.awt.Color(209, 216, 224));
        indicatorAddmodal.setOpaque(false);

        javax.swing.GroupLayout indicatorAddmodalLayout = new javax.swing.GroupLayout(indicatorAddmodal);
        indicatorAddmodal.setLayout(indicatorAddmodalLayout);
        indicatorAddmodalLayout.setHorizontalGroup(
            indicatorAddmodalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );
        indicatorAddmodalLayout.setVerticalGroup(
            indicatorAddmodalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        btn_addmodal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_addmodal.setText("ADD MODAL");
        btn_addmodal.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_addmodal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_addmodal.setkBorderRadius(20);
        btn_addmodal.setkEndColor(new java.awt.Color(178, 199, 231));
        btn_addmodal.setkHoverEndColor(new java.awt.Color(68, 82, 121));
        btn_addmodal.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_addmodal.setkHoverStartColor(new java.awt.Color(68, 82, 121));
        btn_addmodal.setkPressedColor(new java.awt.Color(68, 82, 121));
        btn_addmodal.setkStartColor(new java.awt.Color(178, 199, 231));
        btn_addmodal.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_addmodalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_addmodalFocusLost(evt);
            }
        });
        btn_addmodal.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btn_addmodalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_addmodalMouseEntered(evt);
            }
        });
        btn_addmodal.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_addmodalKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_addcustmenu10Layout = new javax.swing.GroupLayout(panel_addcustmenu10);
        panel_addcustmenu10.setLayout(panel_addcustmenu10Layout);
        panel_addcustmenu10Layout.setHorizontalGroup(
            panel_addcustmenu10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcustmenu10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_addcustmenu10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indicatorAddmodal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_addmodal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_addcustmenu10Layout.setVerticalGroup(
            panel_addcustmenu10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcustmenu10Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_addmodal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicatorAddmodal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_addcustmenu12.setkBorderRadius(40);
        panel_addcustmenu12.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_addcustmenu12.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_addcustmenu12.setOpaque(false);

        indicatorDetpro.setkEndColor(new java.awt.Color(209, 216, 224));
        indicatorDetpro.setkStartColor(new java.awt.Color(209, 216, 224));
        indicatorDetpro.setOpaque(false);

        javax.swing.GroupLayout indicatorDetproLayout = new javax.swing.GroupLayout(indicatorDetpro);
        indicatorDetpro.setLayout(indicatorDetproLayout);
        indicatorDetproLayout.setHorizontalGroup(
            indicatorDetproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        indicatorDetproLayout.setVerticalGroup(
            indicatorDetproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btn_detPro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_detPro.setText("PRODUCT DETAILS");
        btn_detPro.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_detPro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_detPro.setkBorderRadius(20);
        btn_detPro.setkEndColor(new java.awt.Color(178, 199, 231));
        btn_detPro.setkHoverEndColor(new java.awt.Color(68, 82, 121));
        btn_detPro.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_detPro.setkHoverStartColor(new java.awt.Color(68, 82, 121));
        btn_detPro.setkPressedColor(new java.awt.Color(68, 82, 121));
        btn_detPro.setkStartColor(new java.awt.Color(178, 199, 231));
        btn_detPro.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_detProFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_detProFocusLost(evt);
            }
        });
        btn_detPro.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btn_detProMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_detProMouseEntered(evt);
            }
        });
        btn_detPro.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_detProKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_addcustmenu12Layout = new javax.swing.GroupLayout(panel_addcustmenu12);
        panel_addcustmenu12.setLayout(panel_addcustmenu12Layout);
        panel_addcustmenu12Layout.setHorizontalGroup(
            panel_addcustmenu12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addcustmenu12Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(panel_addcustmenu12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(indicatorDetpro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_detPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        panel_addcustmenu12Layout.setVerticalGroup(
            panel_addcustmenu12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcustmenu12Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_detPro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicatorDetpro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_addcustmenu15.setkBorderRadius(40);
        panel_addcustmenu15.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_addcustmenu15.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_addcustmenu15.setOpaque(false);

        indicatorEditpro.setkEndColor(new java.awt.Color(209, 216, 224));
        indicatorEditpro.setkStartColor(new java.awt.Color(209, 216, 224));
        indicatorEditpro.setOpaque(false);

        javax.swing.GroupLayout indicatorEditproLayout = new javax.swing.GroupLayout(indicatorEditpro);
        indicatorEditpro.setLayout(indicatorEditproLayout);
        indicatorEditproLayout.setHorizontalGroup(
            indicatorEditproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        indicatorEditproLayout.setVerticalGroup(
            indicatorEditproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btn_editPro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_editPro.setText("EDIT PRODUCT");
        btn_editPro.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_editPro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_editPro.setkBorderRadius(20);
        btn_editPro.setkEndColor(new java.awt.Color(178, 199, 231));
        btn_editPro.setkHoverEndColor(new java.awt.Color(68, 82, 121));
        btn_editPro.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_editPro.setkHoverStartColor(new java.awt.Color(68, 82, 121));
        btn_editPro.setkPressedColor(new java.awt.Color(68, 82, 121));
        btn_editPro.setkStartColor(new java.awt.Color(178, 199, 231));
        btn_editPro.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_editProFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_editProFocusLost(evt);
            }
        });
        btn_editPro.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btn_editProMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_editProMouseEntered(evt);
            }
        });
        btn_editPro.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_editProKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_addcustmenu15Layout = new javax.swing.GroupLayout(panel_addcustmenu15);
        panel_addcustmenu15.setLayout(panel_addcustmenu15Layout);
        panel_addcustmenu15Layout.setHorizontalGroup(
            panel_addcustmenu15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addcustmenu15Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(panel_addcustmenu15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(indicatorEditpro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_editPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        panel_addcustmenu15Layout.setVerticalGroup(
            panel_addcustmenu15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcustmenu15Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_editPro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicatorEditpro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_billmenuLayout = new javax.swing.GroupLayout(panel_billmenu);
        panel_billmenu.setLayout(panel_billmenuLayout);
        panel_billmenuLayout.setHorizontalGroup(
            panel_billmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_billmenuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel_addcustmenu7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_addcustmenu10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_addcustmenu15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_addcustmenu12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_billmenuLayout.setVerticalGroup(
            panel_billmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_addcustmenu7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_addcustmenu10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_addcustmenu12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_addcustmenu15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_billmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(panel_billmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(387, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addproFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_addproFocusGained
    {//GEN-HEADEREND:event_btn_addproFocusGained
        HoverColor(btn_addpro, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addproFocusGained

    private void btn_addproFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_addproFocusLost
    {//GEN-HEADEREND:event_btn_addproFocusLost
        HoverColor(btn_addpro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addproFocusLost

    private void btn_addproMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_addproMouseClicked
    {//GEN-HEADEREND:event_btn_addproMouseClicked
        visibility(txt_add_pro_id, panel_addpro, true, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, false);
        indicatorOn(indicatorAddpro, indicatorAddmodal, indicatorEditpro, indicatorDetpro);
        HoverColor(btn_addpro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addproMouseClicked

    private void btn_addproMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_addproMouseEntered
    {//GEN-HEADEREND:event_btn_addproMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_addproMouseEntered

    private void btn_addproKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_addproKeyPressed
    {//GEN-HEADEREND:event_btn_addproKeyPressed
        visibility(txt_add_pro_id, panel_addpro, true, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, false);

        escape(lbl_product, evt.getKeyCode(), panel_product);
        HoverColor(btn_addpro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addproKeyPressed

    private void btn_addmodalFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_addmodalFocusGained
    {//GEN-HEADEREND:event_btn_addmodalFocusGained
        HoverColor(btn_addmodal, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addmodalFocusGained

    private void btn_addmodalFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_addmodalFocusLost
    {//GEN-HEADEREND:event_btn_addmodalFocusLost
        HoverColor(btn_addmodal, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addmodalFocusLost

    private void btn_addmodalMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_addmodalMouseClicked
    {//GEN-HEADEREND:event_btn_addmodalMouseClicked
        visibility(txt_add_promcb_brand_id, panel_addpro, false, panel_addpro_mcb, true, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, false);
        indicatorOn(indicatorAddmodal, indicatorAddpro, indicatorEditpro, indicatorDetpro);
        HoverColor(btn_addmodal, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addmodalMouseClicked

    private void btn_addmodalMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_addmodalMouseEntered
    {//GEN-HEADEREND:event_btn_addmodalMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_addmodalMouseEntered

    private void btn_addmodalKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_addmodalKeyPressed
    {//GEN-HEADEREND:event_btn_addmodalKeyPressed
        visibility(txt_add_promcb_brand_id, panel_addpro, false, panel_addpro_mcb, true, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, false);

        escape(lbl_product, evt.getKeyCode(), panel_product);
        indicatorOn(indicatorAddmodal, indicatorAddpro, indicatorEditpro, indicatorDetpro);
        HoverColor(btn_addmodal, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addmodalKeyPressed

    private void btn_detProFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_detProFocusGained
    {//GEN-HEADEREND:event_btn_detProFocusGained
        HoverColor(btn_detPro, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_detProFocusGained

    private void btn_detProFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_detProFocusLost
    {//GEN-HEADEREND:event_btn_detProFocusLost
        HoverColor(btn_detPro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_detProFocusLost

    private void btn_detProMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_detProMouseClicked
    {//GEN-HEADEREND:event_btn_detProMouseClicked
        visibility(jTextField3, panel_addpro, false, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, true, panel_pro_fulldet, false);
        indicatorOn(indicatorDetpro, indicatorAddpro, indicatorAddmodal, indicatorEditpro);
        HoverColor(btn_detPro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_detProMouseClicked

    private void btn_detProMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_detProMouseEntered
    {//GEN-HEADEREND:event_btn_detProMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_detProMouseEntered

    private void btn_detProKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_detProKeyPressed
    {//GEN-HEADEREND:event_btn_detProKeyPressed
        visibility(jTextField3, panel_addpro, false, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, true, panel_pro_fulldet, false);

        escape(lbl_product, evt.getKeyCode(), panel_product);
        indicatorOn(indicatorDetpro, indicatorAddpro, indicatorAddmodal, indicatorEditpro);
        HoverColor(btn_detPro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_detProKeyPressed

    private void btn_editProFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_editProFocusGained
    {//GEN-HEADEREND:event_btn_editProFocusGained
        HoverColor(btn_editPro, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_editProFocusGained

    private void btn_editProFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_editProFocusLost
    {//GEN-HEADEREND:event_btn_editProFocusLost
        HoverColor(btn_editPro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_editProFocusLost

    private void btn_editProMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_editProMouseClicked
    {//GEN-HEADEREND:event_btn_editProMouseClicked
        visibility(jTextField2, panel_addpro, false, panel_addpro_mcb, false, panel_editpro, true, panel_prodet, false, panel_pro_fulldet, false);
        indicatorOn(indicatorEditpro, indicatorAddpro, indicatorAddmodal, indicatorDetpro);
        HoverColor(btn_editPro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_editProMouseClicked

    private void btn_editProMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_editProMouseEntered
    {//GEN-HEADEREND:event_btn_editProMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_editProMouseEntered

    private void btn_editProKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_editProKeyPressed
    {//GEN-HEADEREND:event_btn_editProKeyPressed
        visibility(jTextField2, panel_addpro, false, panel_addpro_mcb, false, panel_editpro, true, panel_prodet, false, panel_pro_fulldet, false);

        escape(lbl_product, evt.getKeyCode(), panel_product);
        indicatorOn(indicatorEditpro, indicatorAddpro, indicatorAddmodal, indicatorDetpro);
        HoverColor(btn_editPro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_editProKeyPressed

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
    private com.k33ptoo.components.KButton btn_addmodal;
    private com.k33ptoo.components.KButton btn_addpro;
    private com.k33ptoo.components.KButton btn_detPro;
    private com.k33ptoo.components.KButton btn_editPro;
    private com.k33ptoo.components.KGradientPanel indicatorAddmodal;
    private com.k33ptoo.components.KGradientPanel indicatorAddpro;
    private com.k33ptoo.components.KGradientPanel indicatorDetpro;
    private com.k33ptoo.components.KGradientPanel indicatorEditpro;
    private com.k33ptoo.components.KGradientPanel panel_addcustmenu10;
    private com.k33ptoo.components.KGradientPanel panel_addcustmenu12;
    private com.k33ptoo.components.KGradientPanel panel_addcustmenu15;
    private com.k33ptoo.components.KGradientPanel panel_addcustmenu7;
    private com.k33ptoo.components.KGradientPanel panel_billmenu;
    // End of variables declaration//GEN-END:variables
}
