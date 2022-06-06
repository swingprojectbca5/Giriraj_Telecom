
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;

public class MyDashboard extends javax.swing.JFrame
{

    public MyDashboard()
    {
        initComponents();

        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        Insets scnmax = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
        int taskbar = scnmax.bottom;

        int width = (int) size.getWidth();
        int height = (int) size.getHeight();
        height = height - taskbar;

        this.setSize(width, height);
        kGradientPanel1.setSize(width, height);

        System.out.println("Frame Size : " + width + " X " + height);
        System.out.println("Panel Size : " + kGradientPanel1.getSize());
        System.out.println("Main Panel Size : " + panel_main.getSize());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        panel_main = new com.k33ptoo.components.KGradientPanel();
        pnl_header = new com.k33ptoo.components.KGradientPanel();
        lbl_gt = new javax.swing.JLabel();
        pnl_close = new com.k33ptoo.components.KGradientPanel();
        lbl_close = new javax.swing.JLabel();
        pnl_sidepane1 = new com.k33ptoo.components.KGradientPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(102, 204, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 204, 255));
        kGradientPanel1.setLayout(new java.awt.GridBagLayout());

        panel_main.setkBorderRadius(30);
        panel_main.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_main.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_main.setOpaque(false);
        panel_main.setPreferredSize(new java.awt.Dimension(1200, 600));

        pnl_header.setkEndColor(new java.awt.Color(68, 82, 121));
        pnl_header.setkStartColor(new java.awt.Color(68, 82, 121));
        pnl_header.setPreferredSize(new java.awt.Dimension(1200, 40));

        lbl_gt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.png"))); // NOI18N

        pnl_close.setkBorderRadius(20);
        pnl_close.setkEndColor(new java.awt.Color(68, 82, 121));
        pnl_close.setkStartColor(new java.awt.Color(68, 82, 121));
        pnl_close.setOpaque(false);
        pnl_close.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pnl_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                pnl_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                pnl_closeMouseExited(evt);
            }
        });

        lbl_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/outline_close_white_48dp.png"))); // NOI18N

        javax.swing.GroupLayout pnl_closeLayout = new javax.swing.GroupLayout(pnl_close);
        pnl_close.setLayout(pnl_closeLayout);
        pnl_closeLayout.setHorizontalGroup(
            pnl_closeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_closeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_close, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_closeLayout.setVerticalGroup(
            pnl_closeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_closeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnl_headerLayout = new javax.swing.GroupLayout(pnl_header);
        pnl_header.setLayout(pnl_headerLayout);
        pnl_headerLayout.setHorizontalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_headerLayout.createSequentialGroup()
                .addComponent(lbl_gt)
                .addGap(1100, 1100, 1100)
                .addComponent(pnl_close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_headerLayout.setVerticalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_gt)
            .addComponent(pnl_close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnl_sidepane1.setkBorderRadius(40);
        pnl_sidepane1.setkEndColor(new java.awt.Color(178, 199, 231));
        pnl_sidepane1.setkStartColor(new java.awt.Color(178, 199, 231));
        pnl_sidepane1.setOpaque(false);
        pnl_sidepane1.setPreferredSize(new java.awt.Dimension(390, 550));

        javax.swing.GroupLayout pnl_sidepane1Layout = new javax.swing.GroupLayout(pnl_sidepane1);
        pnl_sidepane1.setLayout(pnl_sidepane1Layout);
        pnl_sidepane1Layout.setHorizontalGroup(
            pnl_sidepane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        pnl_sidepane1Layout.setVerticalGroup(
            pnl_sidepane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_mainLayout = new javax.swing.GroupLayout(panel_main);
        panel_main.setLayout(panel_mainLayout);
        panel_mainLayout.setHorizontalGroup(
            panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_mainLayout.createSequentialGroup()
                .addComponent(pnl_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panel_mainLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pnl_sidepane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_mainLayout.setVerticalGroup(
            panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_mainLayout.createSequentialGroup()
                .addComponent(pnl_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(pnl_sidepane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        kGradientPanel1.add(panel_main, new java.awt.GridBagConstraints());

        getContentPane().add(kGradientPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnl_closeMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnl_closeMouseClicked
    {//GEN-HEADEREND:event_pnl_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_pnl_closeMouseClicked

    private void pnl_closeMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnl_closeMouseEntered
    {//GEN-HEADEREND:event_pnl_closeMouseEntered
        pnl_close.setkStartColor(new Color(255, 0, 0));
        pnl_close.setBackground(Color.red);
        pnl_close.setkEndColor(new Color(255, 0, 0));
    }//GEN-LAST:event_pnl_closeMouseEntered

    private void pnl_closeMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnl_closeMouseExited
    {//GEN-HEADEREND:event_pnl_closeMouseExited
        pnl_close.setkStartColor(new Color(68, 82, 121));
        pnl_close.setBackground(Color.black);
        pnl_close.setkEndColor(new Color(68, 82, 121));
    }//GEN-LAST:event_pnl_closeMouseExited

    public static void main(String args[])
    {

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MyDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_gt;
    private com.k33ptoo.components.KGradientPanel panel_main;
    private com.k33ptoo.components.KGradientPanel pnl_close;
    private com.k33ptoo.components.KGradientPanel pnl_header;
    private com.k33ptoo.components.KGradientPanel pnl_sidepane1;
    // End of variables declaration//GEN-END:variables
}
