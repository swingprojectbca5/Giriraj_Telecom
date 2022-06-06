
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;

public class NewJFrame1 extends javax.swing.JFrame
{

    public NewJFrame1()
    {
        initComponents();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Insets scnmax = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
        int taskbar = scnmax.bottom;

        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();
        screenHeight = screenHeight - taskbar;

//        this.setExtendedState(NewJFrame.MAXIMIZED_BOTH);
        this.setSize(screenWidth, screenHeight);
        kGradientPanel1.setSize(screenWidth, screenHeight);
        System.out.println("Screen Size : " + this.getSize());
        System.out.println("main panel size : " + kGradientPanel1.getSize());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setLayout(new java.awt.GridBagLayout());

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 51, 51));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 0, 0));
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(1000, 700));

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jButton1)
                .addContainerGap(517, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(125, 125, 125))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addContainerGap())))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jButton3)
                .addGap(179, 179, 179)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(108, 108, 108))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 511;
        gridBagConstraints.ipady = 261;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(154, 460, 154, 460);
        kGradientPanel1.add(kGradientPanel2, gridBagConstraints);

        getContentPane().add(kGradientPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
