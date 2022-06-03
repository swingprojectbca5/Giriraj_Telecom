
import com.sun.beans.editors.ColorEditor;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.color.ColorSpace;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class frm_dashboard extends javax.swing.JFrame
{

    KeyEvent ke;

    public frm_dashboard()
    {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int x = (int) tk.getScreenSize().getWidth();
        int y = (int) tk.getScreenSize().getHeight();
        Insets scnmax = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
        int taskbar = scnmax.bottom;

        this.setSize(x, y - taskbar);

        panel_main.setVisible(true);
        panel_customer.setVisible(false);
        panel_employee.setVisible(false);
        panel_bill.setVisible(false);
        panel_product.setVisible(false);
        panel_account.setVisible(false);
        panel_about.setVisible(false);
        panel_help.setVisible(false);
        panel_extra.setVisible(true);
        jLabel2.grabFocus();

        // this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel()
        {

            public void paintComponent(Graphics g)
            {
                ImageIcon im = new ImageIcon("src\\icons\\background.jpg");
                Image i = im.getImage();

                g.drawImage(i,0,0,this.getSize().width,this.getSize().height,this);
            }
        }
        ;
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        pnl_sidepane = new com.k33ptoo.components.KGradientPanel();
        pnl_customer = new com.k33ptoo.components.KGradientPanel();
        lbl_customer = new javax.swing.JLabel();
        pnl_employee = new com.k33ptoo.components.KGradientPanel();
        lbl_employee = new javax.swing.JLabel();
        pnl_product = new com.k33ptoo.components.KGradientPanel();
        lbl_product = new javax.swing.JLabel();
        pnl_bill = new com.k33ptoo.components.KGradientPanel();
        lbl_bill = new javax.swing.JLabel();
        pnl_account = new com.k33ptoo.components.KGradientPanel();
        lbl_account = new javax.swing.JLabel();
        pnl_about = new com.k33ptoo.components.KGradientPanel();
        lbl_about = new javax.swing.JLabel();
        pnl_help = new com.k33ptoo.components.KGradientPanel();
        lbl_help = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnl_header = new com.k33ptoo.components.KGradientPanel();
        pnl_close = new com.k33ptoo.components.KGradientPanel();
        lbl_close = new javax.swing.JLabel();
        pnl_min = new javax.swing.JPanel();
        lbl_min = new javax.swing.JLabel();
        lbl_gt = new javax.swing.JLabel();
        panel_main = new com.k33ptoo.components.KGradientPanel();
        panel_customer = new com.k33ptoo.components.KGradientPanel();
        pnl_menu = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel4 = new com.k33ptoo.components.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        kGradientPanel5 = new com.k33ptoo.components.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        panel_custmain = new com.k33ptoo.components.KGradientPanel();
        panel_addcust = new com.k33ptoo.components.KGradientPanel();
        panel_rmcus = new com.k33ptoo.components.KGradientPanel();
        jTextField1 = new javax.swing.JTextField();
        panel_custdetail = new com.k33ptoo.components.KGradientPanel();
        jTextField3 = new javax.swing.JTextField();
        panel_employee = new com.k33ptoo.components.KGradientPanel();
        panel_product = new com.k33ptoo.components.KGradientPanel();
        panel_bill = new com.k33ptoo.components.KGradientPanel();
        panel_account = new com.k33ptoo.components.KGradientPanel();
        panel_about = new com.k33ptoo.components.KGradientPanel();
        panel_help = new com.k33ptoo.components.KGradientPanel();
        panel_extra = new com.k33ptoo.components.KGradientPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        kGradientPanel1.setkBorderRadius(40);
        kGradientPanel1.setkEndColor(new java.awt.Color(228, 235, 246));
        kGradientPanel1.setkGradientFocus(2500);
        kGradientPanel1.setkStartColor(new java.awt.Color(228, 235, 246));

        kGradientPanel2.setkBorderRadius(30);
        kGradientPanel2.setkEndColor(new java.awt.Color(228, 235, 246));
        kGradientPanel2.setkStartColor(new java.awt.Color(228, 235, 246));
        kGradientPanel2.setOpaque(false);
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(1650, 800));

        pnl_sidepane.setkBorderRadius(40);
        pnl_sidepane.setkEndColor(new java.awt.Color(178, 199, 231));
        pnl_sidepane.setkStartColor(new java.awt.Color(178, 199, 231));
        pnl_sidepane.setOpaque(false);

        pnl_customer.setkBorderRadius(40);
        pnl_customer.setkEndColor(new java.awt.Color(228, 235, 246));
        pnl_customer.setkStartColor(new java.awt.Color(228, 235, 246));
        pnl_customer.setOpaque(false);

        lbl_customer.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        lbl_customer.setForeground(new java.awt.Color(68, 82, 121));
        lbl_customer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/customer.png"))); // NOI18N
        lbl_customer.setText("CUSTOMER MANAGEMENT");
        lbl_customer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_customer.setNextFocusableComponent(lbl_employee);
        lbl_customer.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                lbl_customerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                lbl_customerFocusLost(evt);
            }
        });
        lbl_customer.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbl_customerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_customerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_customerMouseExited(evt);
            }
        });
        lbl_customer.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                lbl_customerKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnl_customerLayout = new javax.swing.GroupLayout(pnl_customer);
        pnl_customer.setLayout(pnl_customerLayout);
        pnl_customerLayout.setHorizontalGroup(
            pnl_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_customerLayout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(lbl_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_customerLayout.setVerticalGroup(
            pnl_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_customer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnl_employee.setkBorderRadius(40);
        pnl_employee.setkEndColor(new java.awt.Color(228, 235, 246));
        pnl_employee.setkStartColor(new java.awt.Color(228, 235, 246));
        pnl_employee.setOpaque(false);

        lbl_employee.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        lbl_employee.setForeground(new java.awt.Color(68, 82, 121));
        lbl_employee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/employee.png"))); // NOI18N
        lbl_employee.setText("EMPLOYEE MANAGEMENT");
        lbl_employee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_employee.setNextFocusableComponent(lbl_product);
        lbl_employee.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                lbl_employeeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                lbl_employeeFocusLost(evt);
            }
        });
        lbl_employee.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbl_employeeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_employeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_employeeMouseExited(evt);
            }
        });
        lbl_employee.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                lbl_employeeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnl_employeeLayout = new javax.swing.GroupLayout(pnl_employee);
        pnl_employee.setLayout(pnl_employeeLayout);
        pnl_employeeLayout.setHorizontalGroup(
            pnl_employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_employeeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_employeeLayout.setVerticalGroup(
            pnl_employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_employee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnl_product.setkBorderRadius(40);
        pnl_product.setkEndColor(new java.awt.Color(228, 235, 246));
        pnl_product.setkStartColor(new java.awt.Color(228, 235, 246));
        pnl_product.setOpaque(false);

        lbl_product.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        lbl_product.setForeground(new java.awt.Color(68, 82, 121));
        lbl_product.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_product.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/product.png"))); // NOI18N
        lbl_product.setText("PRODUCT MANAGEMENT");
        lbl_product.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_product.setNextFocusableComponent(lbl_bill);
        lbl_product.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                lbl_productFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                lbl_productFocusLost(evt);
            }
        });
        lbl_product.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbl_productMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_productMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_productMouseExited(evt);
            }
        });
        lbl_product.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                lbl_productKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnl_productLayout = new javax.swing.GroupLayout(pnl_product);
        pnl_product.setLayout(pnl_productLayout);
        pnl_productLayout.setHorizontalGroup(
            pnl_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_productLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_product, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_productLayout.setVerticalGroup(
            pnl_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_product, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnl_bill.setkBorderRadius(40);
        pnl_bill.setkEndColor(new java.awt.Color(228, 235, 246));
        pnl_bill.setkStartColor(new java.awt.Color(228, 235, 246));
        pnl_bill.setOpaque(false);

        lbl_bill.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        lbl_bill.setForeground(new java.awt.Color(68, 82, 121));
        lbl_bill.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_bill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bill.png"))); // NOI18N
        lbl_bill.setText("BILL MANAGEMENT");
        lbl_bill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_bill.setNextFocusableComponent(lbl_account);
        lbl_bill.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                lbl_billFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                lbl_billFocusLost(evt);
            }
        });
        lbl_bill.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbl_billMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_billMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_billMouseExited(evt);
            }
        });
        lbl_bill.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                lbl_billKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnl_billLayout = new javax.swing.GroupLayout(pnl_bill);
        pnl_bill.setLayout(pnl_billLayout);
        pnl_billLayout.setHorizontalGroup(
            pnl_billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_billLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_billLayout.setVerticalGroup(
            pnl_billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_bill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnl_account.setkBorderRadius(40);
        pnl_account.setkEndColor(new java.awt.Color(228, 235, 246));
        pnl_account.setkStartColor(new java.awt.Color(228, 235, 246));
        pnl_account.setOpaque(false);

        lbl_account.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        lbl_account.setForeground(new java.awt.Color(68, 82, 121));
        lbl_account.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_account.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/setting.png"))); // NOI18N
        lbl_account.setText("ACCOUNT MANAGEMENT");
        lbl_account.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_account.setNextFocusableComponent(lbl_about);
        lbl_account.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                lbl_accountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                lbl_accountFocusLost(evt);
            }
        });
        lbl_account.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbl_accountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_accountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_accountMouseExited(evt);
            }
        });
        lbl_account.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                lbl_accountKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnl_accountLayout = new javax.swing.GroupLayout(pnl_account);
        pnl_account.setLayout(pnl_accountLayout);
        pnl_accountLayout.setHorizontalGroup(
            pnl_accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_accountLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_account, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_accountLayout.setVerticalGroup(
            pnl_accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_account, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnl_about.setkBorderRadius(40);
        pnl_about.setkEndColor(new java.awt.Color(228, 235, 246));
        pnl_about.setkStartColor(new java.awt.Color(228, 235, 246));
        pnl_about.setOpaque(false);

        lbl_about.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        lbl_about.setForeground(new java.awt.Color(68, 82, 121));
        lbl_about.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/about.png"))); // NOI18N
        lbl_about.setText("ABOUT US");
        lbl_about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_about.setNextFocusableComponent(lbl_help);
        lbl_about.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                lbl_aboutFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                lbl_aboutFocusLost(evt);
            }
        });
        lbl_about.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbl_aboutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_aboutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_aboutMouseExited(evt);
            }
        });
        lbl_about.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                lbl_aboutKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnl_aboutLayout = new javax.swing.GroupLayout(pnl_about);
        pnl_about.setLayout(pnl_aboutLayout);
        pnl_aboutLayout.setHorizontalGroup(
            pnl_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_aboutLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_about, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_aboutLayout.setVerticalGroup(
            pnl_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_about, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnl_help.setkBorderRadius(40);
        pnl_help.setkEndColor(new java.awt.Color(228, 235, 246));
        pnl_help.setkStartColor(new java.awt.Color(228, 235, 246));
        pnl_help.setOpaque(false);

        lbl_help.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        lbl_help.setForeground(new java.awt.Color(68, 82, 121));
        lbl_help.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/help.png"))); // NOI18N
        lbl_help.setText("HELP");
        lbl_help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_help.setNextFocusableComponent(jLabel2);
        lbl_help.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                lbl_helpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                lbl_helpFocusLost(evt);
            }
        });
        lbl_help.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbl_helpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_helpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_helpMouseExited(evt);
            }
        });
        lbl_help.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                lbl_helpKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnl_helpLayout = new javax.swing.GroupLayout(pnl_help);
        pnl_help.setLayout(pnl_helpLayout);
        pnl_helpLayout.setHorizontalGroup(
            pnl_helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_helpLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_help, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_helpLayout.setVerticalGroup(
            pnl_helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_help, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(178, 199, 231));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        jLabel2.setText("GIRIRAJ TELECOM");
        jLabel2.setNextFocusableComponent(lbl_customer);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnl_sidepaneLayout = new javax.swing.GroupLayout(pnl_sidepane);
        pnl_sidepane.setLayout(pnl_sidepaneLayout);
        pnl_sidepaneLayout.setHorizontalGroup(
            pnl_sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_sidepaneLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnl_sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_customer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_bill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_account, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_about, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_help, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        pnl_sidepaneLayout.setVerticalGroup(
            pnl_sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_sidepaneLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(pnl_customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(pnl_employee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(pnl_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(pnl_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(pnl_account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(pnl_about, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(pnl_help, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pnl_header.setkBorderRadius(30);
        pnl_header.setkEndColor(new java.awt.Color(68, 82, 121));
        pnl_header.setkStartColor(new java.awt.Color(68, 82, 121));
        pnl_header.setOpaque(false);

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
            .addGroup(pnl_closeLayout.createSequentialGroup()
                .addComponent(lbl_close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnl_min.setBackground(new java.awt.Color(68, 82, 121));
        pnl_min.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pnl_minMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                pnl_minMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                pnl_minMouseExited(evt);
            }
        });

        lbl_min.setBackground(new java.awt.Color(68, 82, 121));
        lbl_min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minimize.png"))); // NOI18N
        lbl_min.setPreferredSize(new java.awt.Dimension(50, 40));

        javax.swing.GroupLayout pnl_minLayout = new javax.swing.GroupLayout(pnl_min);
        pnl_min.setLayout(pnl_minLayout);
        pnl_minLayout.setHorizontalGroup(
            pnl_minLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_minLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_minLayout.setVerticalGroup(
            pnl_minLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_minLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lbl_gt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.png"))); // NOI18N

        javax.swing.GroupLayout pnl_headerLayout = new javax.swing.GroupLayout(pnl_header);
        pnl_header.setLayout(pnl_headerLayout);
        pnl_headerLayout.setHorizontalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_gt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl_min, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnl_close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        pnl_headerLayout.setVerticalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_close, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_min, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(lbl_gt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_main.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_main.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_main.setPreferredSize(new java.awt.Dimension(1061, 710));

        panel_customer.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_customer.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_customer.setPreferredSize(new java.awt.Dimension(1061, 710));

        pnl_menu.setkBorderRadius(20);
        pnl_menu.setkEndColor(new java.awt.Color(68, 82, 121));
        pnl_menu.setkStartColor(new java.awt.Color(68, 82, 121));
        pnl_menu.setOpaque(false);

        kGradientPanel3.setkBorderRadius(20);
        kGradientPanel3.setkEndColor(new java.awt.Color(68, 82, 121));
        kGradientPanel3.setkStartColor(new java.awt.Color(68, 82, 121));
        kGradientPanel3.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(228, 235, 246));
        jLabel1.setText("ADD CUSTOMER");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        kGradientPanel4.setkBorderRadius(20);
        kGradientPanel4.setkEndColor(new java.awt.Color(68, 82, 121));
        kGradientPanel4.setkStartColor(new java.awt.Color(68, 82, 121));
        kGradientPanel4.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(228, 235, 246));
        jLabel3.setText("EDIT CUSTOMER");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        kGradientPanel5.setkBorderRadius(20);
        kGradientPanel5.setkEndColor(new java.awt.Color(68, 82, 121));
        kGradientPanel5.setkStartColor(new java.awt.Color(68, 82, 121));
        kGradientPanel5.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(228, 235, 246));
        jLabel4.setText("CUSTOMER DETAIL");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_menuLayout = new javax.swing.GroupLayout(pnl_menu);
        pnl_menu.setLayout(pnl_menuLayout);
        pnl_menuLayout.setHorizontalGroup(
            pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_menuLayout.createSequentialGroup()
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 345, Short.MAX_VALUE))
        );
        pnl_menuLayout.setVerticalGroup(
            pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_custmain.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_custmain.setkStartColor(new java.awt.Color(178, 199, 231));

        panel_addcust.setkBorderRadius(40);
        panel_addcust.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_addcust.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_addcust.setOpaque(false);

        javax.swing.GroupLayout panel_addcustLayout = new javax.swing.GroupLayout(panel_addcust);
        panel_addcust.setLayout(panel_addcustLayout);
        panel_addcustLayout.setHorizontalGroup(
            panel_addcustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 961, Short.MAX_VALUE)
        );
        panel_addcustLayout.setVerticalGroup(
            panel_addcustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        panel_rmcus.setkBorderRadius(40);
        panel_rmcus.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_rmcus.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_rmcus.setOpaque(false);

        jTextField1.setText("REMOVE CUSTOMER");

        javax.swing.GroupLayout panel_rmcusLayout = new javax.swing.GroupLayout(panel_rmcus);
        panel_rmcus.setLayout(panel_rmcusLayout);
        panel_rmcusLayout.setHorizontalGroup(
            panel_rmcusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_rmcusLayout.createSequentialGroup()
                .addGap(356, 356, 356)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(416, Short.MAX_VALUE))
        );
        panel_rmcusLayout.setVerticalGroup(
            panel_rmcusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_rmcusLayout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        panel_custdetail.setkBorderRadius(40);
        panel_custdetail.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_custdetail.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_custdetail.setOpaque(false);

        jTextField3.setText("CUSTOMER DETAIL");

        javax.swing.GroupLayout panel_custdetailLayout = new javax.swing.GroupLayout(panel_custdetail);
        panel_custdetail.setLayout(panel_custdetailLayout);
        panel_custdetailLayout.setHorizontalGroup(
            panel_custdetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_custdetailLayout.createSequentialGroup()
                .addGap(356, 356, 356)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(430, Short.MAX_VALUE))
        );
        panel_custdetailLayout.setVerticalGroup(
            panel_custdetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_custdetailLayout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_custmainLayout = new javax.swing.GroupLayout(panel_custmain);
        panel_custmain.setLayout(panel_custmainLayout);
        panel_custmainLayout.setHorizontalGroup(
            panel_custmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
            .addGroup(panel_custmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_custmainLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(panel_custdetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(50, 50, 50)))
            .addGroup(panel_custmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_custmainLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(panel_rmcus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(50, 50, 50)))
            .addGroup(panel_custmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_custmainLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(panel_addcust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(50, 50, 50)))
        );
        panel_custmainLayout.setVerticalGroup(
            panel_custmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(panel_custmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_custmainLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(panel_custdetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(50, 50, 50)))
            .addGroup(panel_custmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_custmainLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(panel_rmcus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(50, 50, 50)))
            .addGroup(panel_custmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_custmainLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(panel_addcust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(50, 50, 50)))
        );

        javax.swing.GroupLayout panel_customerLayout = new javax.swing.GroupLayout(panel_customer);
        panel_customer.setLayout(panel_customerLayout);
        panel_customerLayout.setHorizontalGroup(
            panel_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_custmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_customerLayout.setVerticalGroup(
            panel_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_customerLayout.createSequentialGroup()
                .addComponent(pnl_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_custmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_employee.setPreferredSize(new java.awt.Dimension(1061, 710));

        javax.swing.GroupLayout panel_employeeLayout = new javax.swing.GroupLayout(panel_employee);
        panel_employee.setLayout(panel_employeeLayout);
        panel_employeeLayout.setHorizontalGroup(
            panel_employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        panel_employeeLayout.setVerticalGroup(
            panel_employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        panel_product.setPreferredSize(new java.awt.Dimension(1061, 710));

        javax.swing.GroupLayout panel_productLayout = new javax.swing.GroupLayout(panel_product);
        panel_product.setLayout(panel_productLayout);
        panel_productLayout.setHorizontalGroup(
            panel_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        panel_productLayout.setVerticalGroup(
            panel_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        panel_bill.setPreferredSize(new java.awt.Dimension(1061, 710));

        javax.swing.GroupLayout panel_billLayout = new javax.swing.GroupLayout(panel_bill);
        panel_bill.setLayout(panel_billLayout);
        panel_billLayout.setHorizontalGroup(
            panel_billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        panel_billLayout.setVerticalGroup(
            panel_billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        panel_account.setPreferredSize(new java.awt.Dimension(1061, 710));

        javax.swing.GroupLayout panel_accountLayout = new javax.swing.GroupLayout(panel_account);
        panel_account.setLayout(panel_accountLayout);
        panel_accountLayout.setHorizontalGroup(
            panel_accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        panel_accountLayout.setVerticalGroup(
            panel_accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        panel_about.setPreferredSize(new java.awt.Dimension(1061, 710));

        javax.swing.GroupLayout panel_aboutLayout = new javax.swing.GroupLayout(panel_about);
        panel_about.setLayout(panel_aboutLayout);
        panel_aboutLayout.setHorizontalGroup(
            panel_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        panel_aboutLayout.setVerticalGroup(
            panel_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        panel_help.setPreferredSize(new java.awt.Dimension(1061, 710));

        javax.swing.GroupLayout panel_helpLayout = new javax.swing.GroupLayout(panel_help);
        panel_help.setLayout(panel_helpLayout);
        panel_helpLayout.setHorizontalGroup(
            panel_helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        panel_helpLayout.setVerticalGroup(
            panel_helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        panel_extra.setkEndColor(new java.awt.Color(102, 0, 0));
        panel_extra.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_extra.setPreferredSize(new java.awt.Dimension(1061, 710));

        javax.swing.GroupLayout panel_extraLayout = new javax.swing.GroupLayout(panel_extra);
        panel_extra.setLayout(panel_extraLayout);
        panel_extraLayout.setHorizontalGroup(
            panel_extraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        panel_extraLayout.setVerticalGroup(
            panel_extraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_mainLayout = new javax.swing.GroupLayout(panel_main);
        panel_main.setLayout(panel_mainLayout);
        panel_mainLayout.setHorizontalGroup(
            panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
            .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_help, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_bill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_account, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_about, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_extra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_customer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_mainLayout.setVerticalGroup(
            panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_help, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_product, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_bill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_account, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_about, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_extra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_customer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pnl_sidepane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(panel_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(pnl_header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addComponent(pnl_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_sidepane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        getContentPane().add(kGradientPanel1, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnl_minMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnl_minMouseClicked
    {//GEN-HEADEREND:event_pnl_minMouseClicked
        this.setExtendedState(frm_login.ICONIFIED);
    }//GEN-LAST:event_pnl_minMouseClicked

    private void pnl_minMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnl_minMouseEntered
    {//GEN-HEADEREND:event_pnl_minMouseEntered
        pnl_min.setBackground(new Color(178, 199, 231));
    }//GEN-LAST:event_pnl_minMouseEntered

    private void pnl_minMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnl_minMouseExited
    {//GEN-HEADEREND:event_pnl_minMouseExited
        pnl_min.setBackground(new Color(68, 82, 121));
    }//GEN-LAST:event_pnl_minMouseExited

    private void pnl_closeMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnl_closeMouseEntered
    {//GEN-HEADEREND:event_pnl_closeMouseEntered
        pnl_close.setkStartColor(new Color(255, 0, 0));
        pnl_close.setBackground(Color.red);
        pnl_close.setkEndColor(new Color(255, 0, 0));

    }//GEN-LAST:event_pnl_closeMouseEntered

    private void pnl_closeMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnl_closeMouseClicked
    {//GEN-HEADEREND:event_pnl_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_pnl_closeMouseClicked

    private void pnl_closeMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnl_closeMouseExited
    {//GEN-HEADEREND:event_pnl_closeMouseExited
        pnl_close.setkStartColor(new Color(68, 82, 121));
        pnl_close.setBackground(Color.black);
        pnl_close.setkEndColor(new Color(68, 82, 121));
    }//GEN-LAST:event_pnl_closeMouseExited

    private void lbl_helpKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_lbl_helpKeyPressed
    {//GEN-HEADEREND:event_lbl_helpKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            panel_customer.setVisible(false);
            panel_employee.setVisible(false);
            panel_bill.setVisible(false);
            panel_product.setVisible(false);
            panel_account.setVisible(false);
            panel_about.setVisible(false);
            panel_help.setVisible(true);
            panel_extra.setVisible(false);
        }
    }//GEN-LAST:event_lbl_helpKeyPressed

    private void lbl_helpMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_helpMouseExited
    {//GEN-HEADEREND:event_lbl_helpMouseExited
        pnl_help.setkStartColor(new Color(228, 235, 246));
        pnl_help.setkEndColor(new Color(228, 235, 246));
        pnl_help.setBackground(Color.BLACK);
        lbl_help.setForeground(new Color(68, 82, 121));

        lbl_help.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_help.setForeground(new Color(68, 82, 121));
        lbl_help.setText("HELP");
    }//GEN-LAST:event_lbl_helpMouseExited

    private void lbl_helpMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_helpMouseEntered
    {//GEN-HEADEREND:event_lbl_helpMouseEntered
        pnl_help.setkStartColor(new Color(68, 82, 121));
        pnl_help.setkEndColor(new Color(68, 82, 121));
        pnl_help.setBackground(Color.red);

        lbl_help.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_help.setForeground(Color.WHITE);
        lbl_help.setText("<html><u>HELP</u></html>");
        lbl_help.grabFocus();
    }//GEN-LAST:event_lbl_helpMouseEntered

    private void lbl_helpMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_helpMouseClicked
    {//GEN-HEADEREND:event_lbl_helpMouseClicked
        panel_customer.setVisible(false);
        panel_employee.setVisible(false);
        panel_bill.setVisible(false);
        panel_product.setVisible(false);
        panel_account.setVisible(false);
        panel_about.setVisible(false);
        panel_help.setVisible(true);
        panel_extra.setVisible(false);
        pnl_help.setkStartColor(Color.WHITE);
        pnl_help.setkEndColor(Color.WHITE);
        pnl_help.setBackground(Color.WHITE);
        //lbl_help.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbl_helpMouseClicked

    private void lbl_helpFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_helpFocusLost
    {//GEN-HEADEREND:event_lbl_helpFocusLost
        pnl_help.setkStartColor(new Color(228, 235, 246));
        pnl_help.setkEndColor(new Color(228, 235, 246));
        pnl_help.setBackground(Color.BLACK);
        lbl_help.setForeground(new Color(68, 82, 121));

        lbl_help.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_help.setForeground(new Color(68, 82, 121));
        lbl_help.setText("HELP");
    }//GEN-LAST:event_lbl_helpFocusLost

    private void lbl_helpFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_helpFocusGained
    {//GEN-HEADEREND:event_lbl_helpFocusGained
        pnl_help.setkStartColor(new Color(68, 82, 121));
        pnl_help.setkEndColor(new Color(68, 82, 121));
        pnl_help.setBackground(Color.red);
        lbl_help.setForeground(Color.WHITE);

        lbl_help.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_help.setText("<html><u>HELP</u></html>");
    }//GEN-LAST:event_lbl_helpFocusGained

    private void lbl_aboutKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_lbl_aboutKeyPressed
    {//GEN-HEADEREND:event_lbl_aboutKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            panel_customer.setVisible(false);
            panel_employee.setVisible(false);
            panel_bill.setVisible(false);
            panel_product.setVisible(false);
            panel_account.setVisible(false);
            panel_about.setVisible(true);
            panel_help.setVisible(false);
            panel_extra.setVisible(false);
        }
    }//GEN-LAST:event_lbl_aboutKeyPressed

    private void lbl_aboutMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_aboutMouseExited
    {//GEN-HEADEREND:event_lbl_aboutMouseExited

        pnl_about.setkStartColor(new Color(228, 235, 246));
        pnl_about.setkEndColor(new Color(228, 235, 246));
        pnl_about.setBackground(Color.BLACK);
        lbl_about.setForeground(new Color(68, 82, 121));

        lbl_about.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_about.setForeground(new Color(68, 82, 121));
        lbl_about.setText("ABOUT US");
    }//GEN-LAST:event_lbl_aboutMouseExited

    private void lbl_aboutMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_aboutMouseEntered
    {//GEN-HEADEREND:event_lbl_aboutMouseEntered
        pnl_about.setkStartColor(new Color(68, 82, 121));
        pnl_about.setkEndColor(new Color(68, 82, 121));
        pnl_about.setBackground(Color.red);

        lbl_about.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_about.setForeground(Color.WHITE);
        lbl_about.setText("<html><u>ABOUT US</u></html>");
        lbl_about.grabFocus();
    }//GEN-LAST:event_lbl_aboutMouseEntered

    private void lbl_aboutMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_aboutMouseClicked
    {//GEN-HEADEREND:event_lbl_aboutMouseClicked
        panel_customer.setVisible(false);
        panel_employee.setVisible(false);
        panel_bill.setVisible(false);
        panel_product.setVisible(false);
        panel_account.setVisible(false);
        panel_about.setVisible(true);
        panel_help.setVisible(false);
        panel_extra.setVisible(false);
        pnl_about.setkStartColor(Color.WHITE);
        pnl_about.setkEndColor(Color.WHITE);
        pnl_about.setBackground(Color.WHITE);
        lbl_about.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbl_aboutMouseClicked

    private void lbl_aboutFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_aboutFocusLost
    {//GEN-HEADEREND:event_lbl_aboutFocusLost
        pnl_about.setkStartColor(new Color(228, 235, 246));
        pnl_about.setkEndColor(new Color(228, 235, 246));
        pnl_about.setBackground(Color.BLACK);
        lbl_about.setForeground(new Color(68, 82, 121));

        lbl_about.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_about.setForeground(new Color(68, 82, 121));
        lbl_about.setText("ABOUT US");

    }//GEN-LAST:event_lbl_aboutFocusLost

    private void lbl_aboutFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_aboutFocusGained
    {//GEN-HEADEREND:event_lbl_aboutFocusGained
        pnl_about.setkStartColor(new Color(68, 82, 121));
        pnl_about.setkEndColor(new Color(68, 82, 121));
        pnl_about.setBackground(Color.red);
        lbl_about.setForeground(Color.WHITE);

        lbl_about.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_about.setText("<html><u>ABOUT US</u></html>");
    }//GEN-LAST:event_lbl_aboutFocusGained

    private void lbl_accountKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_lbl_accountKeyPressed
    {//GEN-HEADEREND:event_lbl_accountKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            panel_customer.setVisible(false);
            panel_employee.setVisible(false);
            panel_bill.setVisible(false);
            panel_product.setVisible(false);
            panel_account.setVisible(true);
            panel_about.setVisible(false);
            panel_help.setVisible(false);
            panel_extra.setVisible(false);
        }
    }//GEN-LAST:event_lbl_accountKeyPressed

    private void lbl_accountMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_accountMouseExited
    {//GEN-HEADEREND:event_lbl_accountMouseExited

        pnl_account.setkStartColor(new Color(228, 235, 246));
        pnl_account.setkEndColor(new Color(228, 235, 246));
        pnl_account.setBackground(Color.BLACK);
        lbl_account.setForeground(new Color(68, 82, 121));

        lbl_account.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_account.setForeground(new Color(68, 82, 121));
        lbl_account.setText("ACCOUNT MANAGEMENT");
    }//GEN-LAST:event_lbl_accountMouseExited

    private void lbl_accountMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_accountMouseEntered
    {//GEN-HEADEREND:event_lbl_accountMouseEntered
        pnl_account.setkStartColor(new Color(68, 82, 121));
        pnl_account.setkEndColor(new Color(68, 82, 121));
        pnl_account.setBackground(Color.red);

        lbl_account.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_account.setForeground(Color.WHITE);
        lbl_account.setText("<html><u>ACCOUNT MANAGEMENT</u></html>");

        lbl_account.grabFocus();
    }//GEN-LAST:event_lbl_accountMouseEntered

    private void lbl_accountMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_accountMouseClicked
    {//GEN-HEADEREND:event_lbl_accountMouseClicked
        panel_customer.setVisible(false);
        panel_employee.setVisible(false);
        panel_bill.setVisible(false);
        panel_product.setVisible(false);
        panel_account.setVisible(true);
        panel_about.setVisible(false);
        panel_help.setVisible(false);
        panel_extra.setVisible(false);
        pnl_account.setkStartColor(Color.WHITE);
        pnl_account.setkEndColor(Color.WHITE);
        pnl_account.setBackground(Color.WHITE);
        lbl_account.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbl_accountMouseClicked

    private void lbl_accountFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_accountFocusLost
    {//GEN-HEADEREND:event_lbl_accountFocusLost
        pnl_account.setkStartColor(new Color(228, 235, 246));
        pnl_account.setkEndColor(new Color(228, 235, 246));
        pnl_account.setBackground(Color.BLACK);
        lbl_account.setForeground(new Color(68, 82, 121));

        lbl_account.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_account.setForeground(new Color(68, 82, 121));
        lbl_account.setText("ACCOUNT MANAGEMENT");
    }//GEN-LAST:event_lbl_accountFocusLost

    private void lbl_accountFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_accountFocusGained
    {//GEN-HEADEREND:event_lbl_accountFocusGained
        pnl_account.setkStartColor(new Color(68, 82, 121));
        pnl_account.setkEndColor(new Color(68, 82, 121));
        pnl_account.setBackground(Color.red);
        lbl_account.setForeground(Color.WHITE);

        lbl_account.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_account.setText("<html><u>ACCOUNT MANAGEMENT</u></html>");
    }//GEN-LAST:event_lbl_accountFocusGained

    private void lbl_billKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_lbl_billKeyPressed
    {//GEN-HEADEREND:event_lbl_billKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            panel_customer.setVisible(false);
            panel_employee.setVisible(false);
            panel_bill.setVisible(true);
            panel_product.setVisible(false);
            panel_account.setVisible(false);
            panel_about.setVisible(false);
            panel_help.setVisible(false);
            panel_extra.setVisible(false);
        }
    }//GEN-LAST:event_lbl_billKeyPressed

    private void lbl_billMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_billMouseExited
    {//GEN-HEADEREND:event_lbl_billMouseExited

        pnl_bill.setkStartColor(new Color(228, 235, 246));
        pnl_bill.setkEndColor(new Color(228, 235, 246));
        pnl_bill.setBackground(Color.BLACK);
        lbl_bill.setForeground(new Color(68, 82, 121));

        lbl_bill.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_bill.setForeground(new Color(68, 82, 121));
        lbl_bill.setText("BILL MANAGEMENT");
    }//GEN-LAST:event_lbl_billMouseExited

    private void lbl_billMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_billMouseEntered
    {//GEN-HEADEREND:event_lbl_billMouseEntered
        pnl_bill.setkStartColor(new Color(68, 82, 121));
        pnl_bill.setkEndColor(new Color(68, 82, 121));
        pnl_bill.setBackground(Color.RED);

        lbl_bill.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_bill.setForeground(Color.WHITE);
        lbl_bill.setText("<html><u>BILL MANAGEMENT</u></html>");
        lbl_bill.grabFocus();
    }//GEN-LAST:event_lbl_billMouseEntered

    private void lbl_billMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_billMouseClicked
    {//GEN-HEADEREND:event_lbl_billMouseClicked
        panel_customer.setVisible(false);
        panel_employee.setVisible(false);
        panel_bill.setVisible(true);
        panel_product.setVisible(false);
        panel_account.setVisible(false);
        panel_about.setVisible(false);
        panel_help.setVisible(false);
        panel_extra.setVisible(false);
        pnl_bill.setkStartColor(Color.WHITE);
        pnl_bill.setkEndColor(Color.WHITE);
        pnl_bill.setBackground(Color.WHITE);
        lbl_bill.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbl_billMouseClicked

    private void lbl_billFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_billFocusLost
    {//GEN-HEADEREND:event_lbl_billFocusLost
        pnl_bill.setkStartColor(new Color(228, 235, 246));
        pnl_bill.setkEndColor(new Color(228, 235, 246));
        pnl_bill.setBackground(Color.BLACK);
        lbl_bill.setForeground(new Color(68, 82, 121));

        lbl_bill.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_bill.setForeground(new Color(68, 82, 121));
        lbl_bill.setText("BILL MANAGEMENT");
    }//GEN-LAST:event_lbl_billFocusLost

    private void lbl_billFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_billFocusGained
    {//GEN-HEADEREND:event_lbl_billFocusGained
        pnl_bill.setkStartColor(new Color(68, 82, 121));
        pnl_bill.setkEndColor(new Color(68, 82, 121));
        pnl_bill.setBackground(Color.red);
        lbl_bill.setForeground(Color.WHITE);

        lbl_bill.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_bill.setText("<html><u>BILL MANAGEMENT</u></html>");

    }//GEN-LAST:event_lbl_billFocusGained

    private void lbl_productKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_lbl_productKeyPressed
    {//GEN-HEADEREND:event_lbl_productKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            panel_customer.setVisible(false);
            panel_employee.setVisible(false);
            panel_bill.setVisible(false);
            panel_product.setVisible(true);
            panel_account.setVisible(false);
            panel_about.setVisible(false);
            panel_help.setVisible(false);
            panel_extra.setVisible(false);
        }
    }//GEN-LAST:event_lbl_productKeyPressed

    private void lbl_productMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_productMouseExited
    {//GEN-HEADEREND:event_lbl_productMouseExited

        pnl_product.setkStartColor(new Color(228, 235, 246));
        pnl_product.setkEndColor(new Color(228, 235, 246));
        pnl_product.setBackground(Color.BLACK);
        lbl_product.setForeground(new Color(68, 82, 121));

        lbl_product.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_product.setForeground(new Color(68, 82, 121));
        lbl_product.setText("PRODUCT MANAGEMENT");
    }//GEN-LAST:event_lbl_productMouseExited

    private void lbl_productMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_productMouseEntered
    {//GEN-HEADEREND:event_lbl_productMouseEntered
        pnl_product.setkStartColor(new Color(68, 82, 121));
        pnl_product.setkEndColor(new Color(68, 82, 121));
        pnl_product.setBackground(Color.red);

        lbl_product.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_product.setForeground(Color.WHITE);
        lbl_product.setText("<html><u>PRODUCT MANAGEMENT</u></html>");
        lbl_product.grabFocus();
    }//GEN-LAST:event_lbl_productMouseEntered

    private void lbl_productMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_productMouseClicked
    {//GEN-HEADEREND:event_lbl_productMouseClicked
        panel_customer.setVisible(false);
        panel_employee.setVisible(false);
        panel_bill.setVisible(false);
        panel_product.setVisible(true);
        panel_account.setVisible(false);
        panel_about.setVisible(false);
        panel_help.setVisible(false);
        panel_extra.setVisible(false);
        pnl_product.setkStartColor(Color.WHITE);
        pnl_product.setkEndColor(Color.WHITE);
        pnl_product.setBackground(Color.WHITE);
        lbl_product.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbl_productMouseClicked

    private void lbl_productFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_productFocusLost
    {//GEN-HEADEREND:event_lbl_productFocusLost
        pnl_product.setkStartColor(new Color(228, 235, 246));
        pnl_product.setkEndColor(new Color(228, 235, 246));
        pnl_product.setBackground(Color.BLACK);
        lbl_product.setForeground(new Color(68, 82, 121));

        lbl_product.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_product.setForeground(new Color(68, 82, 121));
        lbl_product.setText("PRODUCT MANAGEMENT");
    }//GEN-LAST:event_lbl_productFocusLost

    private void lbl_productFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_productFocusGained
    {//GEN-HEADEREND:event_lbl_productFocusGained
        pnl_product.setkStartColor(new Color(68, 82, 121));
        pnl_product.setkEndColor(new Color(68, 82, 121));
        pnl_product.setBackground(Color.red);
        lbl_product.setForeground(Color.WHITE);

        lbl_product.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_product.setText("<html><u>PRODUCT MANAGEMENT</u></html>");

    }//GEN-LAST:event_lbl_productFocusGained

    private void lbl_employeeKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_lbl_employeeKeyPressed
    {//GEN-HEADEREND:event_lbl_employeeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            panel_customer.setVisible(false);
            panel_employee.setVisible(true);
            panel_bill.setVisible(false);
            panel_product.setVisible(false);
            panel_account.setVisible(false);
            panel_about.setVisible(false);
            panel_help.setVisible(false);
            panel_extra.setVisible(false);
        }
    }//GEN-LAST:event_lbl_employeeKeyPressed

    private void lbl_employeeMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_employeeMouseExited
    {//GEN-HEADEREND:event_lbl_employeeMouseExited

        pnl_employee.setkStartColor(new Color(228, 235, 246));
        pnl_employee.setkEndColor(new Color(228, 235, 246));
        pnl_employee.setBackground(Color.BLACK);
        lbl_employee.setForeground(new Color(68, 82, 121));

        lbl_employee.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_employee.setForeground(new Color(68, 82, 121));
        lbl_employee.setText("EMPLOYEE MANAGEMENT");
    }//GEN-LAST:event_lbl_employeeMouseExited

    private void lbl_employeeMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_employeeMouseEntered
    {//GEN-HEADEREND:event_lbl_employeeMouseEntered
        pnl_employee.setkStartColor(new Color(68, 82, 121));
        pnl_employee.setkEndColor(new Color(68, 82, 121));
        pnl_employee.setBackground(Color.red);

        lbl_employee.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_employee.setForeground(Color.WHITE);
        lbl_employee.setText("<html><u>EMPLOYEE MANAGEMENT</u></html>");
        lbl_employee.grabFocus();

    }//GEN-LAST:event_lbl_employeeMouseEntered

    private void lbl_employeeMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_employeeMouseClicked
    {//GEN-HEADEREND:event_lbl_employeeMouseClicked
        panel_customer.setVisible(false);
        panel_employee.setVisible(true);
        panel_bill.setVisible(false);
        panel_product.setVisible(false);
        panel_account.setVisible(false);
        panel_about.setVisible(false);
        panel_extra.setVisible(false);
        panel_help.setVisible(false);
        pnl_employee.setkStartColor(Color.WHITE);
        pnl_employee.setkEndColor(Color.WHITE);
        pnl_employee.setBackground(Color.WHITE);
        lbl_employee.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbl_employeeMouseClicked

    private void lbl_employeeFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_employeeFocusLost
    {//GEN-HEADEREND:event_lbl_employeeFocusLost
        pnl_employee.setkStartColor(new Color(228, 235, 246));
        pnl_employee.setkEndColor(new Color(228, 235, 246));
        pnl_employee.setBackground(Color.BLACK);
        lbl_employee.setForeground(new Color(68, 82, 121));

        lbl_employee.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_employee.setForeground(new Color(68, 82, 121));
        lbl_employee.setText("EMPLOYEE MANAGEMENT");

    }//GEN-LAST:event_lbl_employeeFocusLost

    private void lbl_employeeFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_employeeFocusGained
    {//GEN-HEADEREND:event_lbl_employeeFocusGained
        pnl_employee.setkStartColor(new Color(68, 82, 121));
        pnl_employee.setkEndColor(new Color(68, 82, 121));
        pnl_employee.setBackground(Color.red);
        lbl_employee.setForeground(Color.WHITE);

        lbl_employee.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_employee.setText("<html><u>EMPLOYEE MANAGEMENT</u></html>");
    }//GEN-LAST:event_lbl_employeeFocusGained

    private void lbl_customerKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_lbl_customerKeyPressed
    {//GEN-HEADEREND:event_lbl_customerKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            panel_customer.setVisible(true);
            panel_employee.setVisible(false);
            panel_bill.setVisible(false);
            panel_product.setVisible(false);
            panel_account.setVisible(false);
            panel_about.setVisible(false);
            panel_help.setVisible(false);
            panel_extra.setVisible(false);

            panel_rmcus.setVisible(true);
            panel_custdetail.setVisible(false);
            panel_custdetail.setVisible(false);
        }
    }//GEN-LAST:event_lbl_customerKeyPressed

    private void lbl_customerMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_customerMouseExited
    {//GEN-HEADEREND:event_lbl_customerMouseExited

        pnl_customer.setkStartColor(new Color(228, 235, 246));
        pnl_customer.setkEndColor(new Color(228, 235, 246));
        pnl_customer.setBackground(Color.BLACK);
        lbl_customer.setForeground(new Color(68, 82, 121));

        lbl_customer.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_customer.setForeground(new Color(68, 82, 121));
        lbl_customer.setText("CUSTOMER MANAGEMENT");
    }//GEN-LAST:event_lbl_customerMouseExited

    private void lbl_customerMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_customerMouseEntered
    {//GEN-HEADEREND:event_lbl_customerMouseEntered
        pnl_customer.setkStartColor(new Color(68, 82, 121));
        pnl_customer.setkEndColor(new Color(68, 82, 121));
        pnl_customer.setBackground(Color.red);
        lbl_customer.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_customer.setForeground(Color.WHITE);

        lbl_customer.setText("<html><u>CUSTOMER MANAGEMENT</u></html>");
        lbl_customer.grabFocus();
    }//GEN-LAST:event_lbl_customerMouseEntered

    private void lbl_customerMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_customerMouseClicked
    {//GEN-HEADEREND:event_lbl_customerMouseClicked
        panel_customer.setVisible(true);
        panel_rmcus.setVisible(true);
        panel_employee.setVisible(false);
        panel_bill.setVisible(false);
        panel_product.setVisible(false);
        panel_account.setVisible(false);
        panel_about.setVisible(false);
        panel_help.setVisible(false);
        panel_extra.setVisible(false);
        panel_rmcus.setVisible(true);
        panel_custdetail.setVisible(false);
        panel_custdetail.setVisible(false);
        pnl_customer.setkStartColor(Color.WHITE);
        pnl_customer.setkEndColor(Color.WHITE);
        pnl_customer.setBackground(Color.WHITE);
        lbl_customer.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbl_customerMouseClicked

    private void lbl_customerFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_customerFocusLost
    {//GEN-HEADEREND:event_lbl_customerFocusLost
        pnl_customer.setkStartColor(new Color(228, 235, 246));
        pnl_customer.setkEndColor(new Color(228, 235, 246));
        pnl_customer.setBackground(Color.BLACK);
        lbl_customer.setForeground(new Color(68, 82, 121));

        lbl_customer.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_customer.setForeground(new Color(68, 82, 121));
        lbl_customer.setText("CUSTOMER MANAGEMENT");
    }//GEN-LAST:event_lbl_customerFocusLost

    private void lbl_customerFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_customerFocusGained
    {//GEN-HEADEREND:event_lbl_customerFocusGained
        pnl_customer.setkStartColor(new Color(68, 82, 121));
        pnl_customer.setkEndColor(new Color(68, 82, 121));
        pnl_customer.setBackground(Color.red);
        lbl_customer.setForeground(Color.WHITE);

        lbl_customer.setFont(new Font("Cascadia Monocai", Font.PLAIN, 24));
        lbl_customer.setText("<html><u>CUSTOMER MANAGEMENT</u></html>");
    }//GEN-LAST:event_lbl_customerFocusGained

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel1MouseClicked
    {//GEN-HEADEREND:event_jLabel1MouseClicked
        panel_rmcus.setVisible(true);
        panel_custdetail.setVisible(false);
        panel_custdetail.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel3MouseClicked
    {//GEN-HEADEREND:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel4MouseClicked
    {//GEN-HEADEREND:event_jLabel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new frm_dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    private com.k33ptoo.components.KGradientPanel kGradientPanel5;
    private javax.swing.JLabel lbl_about;
    private javax.swing.JLabel lbl_account;
    private javax.swing.JLabel lbl_bill;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_customer;
    private javax.swing.JLabel lbl_employee;
    private javax.swing.JLabel lbl_gt;
    private javax.swing.JLabel lbl_help;
    private javax.swing.JLabel lbl_min;
    private javax.swing.JLabel lbl_product;
    private com.k33ptoo.components.KGradientPanel panel_about;
    private com.k33ptoo.components.KGradientPanel panel_account;
    private com.k33ptoo.components.KGradientPanel panel_addcust;
    private com.k33ptoo.components.KGradientPanel panel_bill;
    private com.k33ptoo.components.KGradientPanel panel_custdetail;
    private com.k33ptoo.components.KGradientPanel panel_custmain;
    private com.k33ptoo.components.KGradientPanel panel_customer;
    private com.k33ptoo.components.KGradientPanel panel_employee;
    private com.k33ptoo.components.KGradientPanel panel_extra;
    private com.k33ptoo.components.KGradientPanel panel_help;
    private com.k33ptoo.components.KGradientPanel panel_main;
    private com.k33ptoo.components.KGradientPanel panel_product;
    private com.k33ptoo.components.KGradientPanel panel_rmcus;
    private com.k33ptoo.components.KGradientPanel pnl_about;
    private com.k33ptoo.components.KGradientPanel pnl_account;
    private com.k33ptoo.components.KGradientPanel pnl_bill;
    private com.k33ptoo.components.KGradientPanel pnl_close;
    private com.k33ptoo.components.KGradientPanel pnl_customer;
    private com.k33ptoo.components.KGradientPanel pnl_employee;
    private com.k33ptoo.components.KGradientPanel pnl_header;
    private com.k33ptoo.components.KGradientPanel pnl_help;
    private com.k33ptoo.components.KGradientPanel pnl_menu;
    private javax.swing.JPanel pnl_min;
    private com.k33ptoo.components.KGradientPanel pnl_product;
    private com.k33ptoo.components.KGradientPanel pnl_sidepane;
    // End of variables declaration//GEN-END:variables
}
