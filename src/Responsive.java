
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;

public class Responsive extends javax.swing.JFrame
{

    public Responsive()
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        kGradientPanel1.setkBorderRadius(40);
        kGradientPanel1.setkEndColor(new java.awt.Color(204, 204, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 204, 255));
        kGradientPanel1.setOpaque(false);
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1920, 1008));
        kGradientPanel1.setLayout(new java.awt.GridBagLayout());

        kGradientPanel2.setkBorderRadius(40);
        kGradientPanel2.setOpaque(false);

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1160;
        gridBagConstraints.ipady = 580;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(140, 140, 140, 140);
        kGradientPanel1.add(kGradientPanel2, gridBagConstraints);

        getContentPane().add(kGradientPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[])
    {

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Responsive().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
