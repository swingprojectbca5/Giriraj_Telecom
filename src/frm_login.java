
import connections.dbconnection;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.*;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class frm_login extends javax.swing.JFrame
{

    int xMouse;
    int yMouse;
    PreparedStatement ps;
    ResultSet rs;
    Connection con;

    public frm_login()
    {
        initComponents();

        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));
        con = dbconnection.isconnected();
        if (con == null)
        {
            System.exit(0);
        }
        comboboxdata();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        pnl_bg_login = new javax.swing.JPanel();
        kpanel_left = new com.k33ptoo.components.KGradientPanel();
        lbl_right_img = new javax.swing.JLabel();
        kpanel_right = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new combo_suggestion.ComboBoxSuggestion();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_pswd = new textfield.PasswordField();
        jPanel7 = new javax.swing.JPanel();
        loginBtn = new com.k33ptoo.components.KButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pnl_header = new javax.swing.JPanel();
        pnl_close = new javax.swing.JPanel();
        lbl_close = new javax.swing.JLabel();
        pnl_min = new javax.swing.JPanel();
        lbl_min = new javax.swing.JLabel();
        lbl_gt = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseDragged(java.awt.event.MouseEvent evt)
            {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                formMousePressed(evt);
            }
        });

        pnl_bg_login.setBackground(new java.awt.Color(228, 235, 246));

        kpanel_left.setkBorderRadius(60);
        kpanel_left.setkEndColor(new java.awt.Color(228, 235, 246));
        kpanel_left.setkStartColor(new java.awt.Color(228, 235, 246));
        kpanel_left.setOpaque(false);

        lbl_right_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_right_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/repair-phone - Copy.png"))); // NOI18N

        javax.swing.GroupLayout kpanel_leftLayout = new javax.swing.GroupLayout(kpanel_left);
        kpanel_left.setLayout(kpanel_leftLayout);
        kpanel_leftLayout.setHorizontalGroup(
            kpanel_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_right_img, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
        kpanel_leftLayout.setVerticalGroup(
            kpanel_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kpanel_leftLayout.createSequentialGroup()
                .addComponent(lbl_right_img, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );

        kpanel_right.setkEndColor(new java.awt.Color(228, 235, 246));
        kpanel_right.setkStartColor(new java.awt.Color(228, 235, 246));

        kGradientPanel3.setkBorderRadius(60);
        kGradientPanel3.setkEndColor(new java.awt.Color(178, 199, 231));
        kGradientPanel3.setkStartColor(new java.awt.Color(178, 199, 231));
        kGradientPanel3.setOpaque(false);
        kGradientPanel3.setPreferredSize(new java.awt.Dimension(554, 560));

        jPanel4.setBackground(new java.awt.Color(178, 199, 231));
        jPanel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Cascadia Mono", 0, 36)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login (1).png"))); // NOI18N
        jLabel2.setText("LOGIN");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(68, 82, 121)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(178, 199, 231));
        jPanel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jPanel11.setBackground(new java.awt.Color(178, 199, 231));
        jPanel11.setPreferredSize(new java.awt.Dimension(64, 64));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/profile.png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        jComboBox1.setBackground(new java.awt.Color(228, 235, 246));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel6.setBackground(new java.awt.Color(178, 199, 231));
        jPanel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jPanel9.setBackground(new java.awt.Color(178, 199, 231));
        jPanel9.setPreferredSize(new java.awt.Dimension(64, 64));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/password.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        txt_pswd.setBackground(new java.awt.Color(178, 199, 231));
        txt_pswd.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_pswd.setLabelText("Password");
        txt_pswd.setLineColor(new java.awt.Color(68, 82, 121));
        txt_pswd.setShowAndHide(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_pswd, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_pswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(178, 199, 231));
        jPanel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        loginBtn.setBorder(null);
        loginBtn.setMnemonic('c');
        loginBtn.setText("LOGIN");
        loginBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn.setkBorderRadius(30);
        loginBtn.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn.setkHoverEndColor(new java.awt.Color(228, 235, 246));
        loginBtn.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn.setkHoverStartColor(new java.awt.Color(228, 235, 246));
        loginBtn.setkStartColor(new java.awt.Color(68, 82, 121));
        loginBtn.setNextFocusableComponent(jComboBox1);
        loginBtn.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                loginBtnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                loginBtnFocusLost(evt);
            }
        });
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                loginBtnMouseEntered(evt);
            }
        });
        loginBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                loginBtnActionPerformed(evt);
            }
        });
        loginBtn.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                loginBtnKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(178, 199, 231));
        jPanel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Cascadia Mono", 0, 20)); // NOI18N
        jLabel9.setText("Forgot Password ? ");

        jLabel10.setFont(new java.awt.Font("Cascadia Mono", 0, 20)); // NOI18N
        jLabel10.setText("CLICK HERE");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.setNextFocusableComponent(jComboBox1);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                jLabel10MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel9)
                .addGap(0, 0, 0)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kpanel_rightLayout = new javax.swing.GroupLayout(kpanel_right);
        kpanel_right.setLayout(kpanel_rightLayout);
        kpanel_rightLayout.setHorizontalGroup(
            kpanel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kpanel_rightLayout.createSequentialGroup()
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );
        kpanel_rightLayout.setVerticalGroup(
            kpanel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kpanel_rightLayout.createSequentialGroup()
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );

        pnl_header.setBackground(new java.awt.Color(68, 82, 121));

        pnl_close.setBackground(new java.awt.Color(68, 82, 121));
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
                .addComponent(lbl_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 852, Short.MAX_VALUE)
                .addComponent(pnl_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout pnl_bg_loginLayout = new javax.swing.GroupLayout(pnl_bg_login);
        pnl_bg_login.setLayout(pnl_bg_loginLayout);
        pnl_bg_loginLayout.setHorizontalGroup(
            pnl_bg_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_bg_loginLayout.createSequentialGroup()
                .addComponent(kpanel_left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(kpanel_right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnl_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_bg_loginLayout.setVerticalGroup(
            pnl_bg_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_bg_loginLayout.createSequentialGroup()
                .addComponent(pnl_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(pnl_bg_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kpanel_left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kpanel_right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_bg_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_bg_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
        loginBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_loginBtnMouseEntered

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_formMouseDragged

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel10MouseEntered
    {//GEN-HEADEREND:event_jLabel10MouseEntered
        jLabel10.setFont(new Font("Cascadia Monocai", Font.PLAIN, 20));
        jLabel10.setForeground(Color.WHITE);
        jLabel10.setText("<html><u>CLICK HERE</u></html>");
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel10MouseExited
    {//GEN-HEADEREND:event_jLabel10MouseExited
        jLabel10.setFont(new Font("Cascadia Monocai", Font.PLAIN, 20));
        jLabel10.setForeground(Color.BLACK);
        jLabel10.setText("CLICK HERE");
    }//GEN-LAST:event_jLabel10MouseExited

    private void loginBtnFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_loginBtnFocusGained
    {//GEN-HEADEREND:event_loginBtnFocusGained
        loginBtn.setkStartColor(new Color(228, 235, 246));
        loginBtn.setkEndColor(new Color(228, 235, 246));
        loginBtn.setkForeGround(new Color(68, 82, 121));
    }//GEN-LAST:event_loginBtnFocusGained

    private void loginBtnFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_loginBtnFocusLost
    {//GEN-HEADEREND:event_loginBtnFocusLost
        loginBtn.setkStartColor(new Color(68, 82, 121));
        loginBtn.setkEndColor(new Color(68, 82, 121));
        loginBtn.setkForeGround(Color.WHITE);
    }//GEN-LAST:event_loginBtnFocusLost

    private void pnl_closeMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnl_closeMouseClicked
    {//GEN-HEADEREND:event_pnl_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_pnl_closeMouseClicked

    private void pnl_closeMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnl_closeMouseEntered
    {//GEN-HEADEREND:event_pnl_closeMouseEntered
        pnl_close.setBackground(Color.red);
    }//GEN-LAST:event_pnl_closeMouseEntered

    private void pnl_closeMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnl_closeMouseExited
    {//GEN-HEADEREND:event_pnl_closeMouseExited
        pnl_close.setBackground(new Color(68, 82, 121));
    }//GEN-LAST:event_pnl_closeMouseExited

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

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_loginBtnActionPerformed
    {//GEN-HEADEREND:event_loginBtnActionPerformed
        checkuser();
    }//GEN-LAST:event_loginBtnActionPerformed

    private void loginBtnKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_loginBtnKeyPressed
    {//GEN-HEADEREND:event_loginBtnKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            checkuser();
        }
    }//GEN-LAST:event_loginBtnKeyPressed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new frm_login().setVisible(true);
            }
        });
    }

    public void comboboxdata()
    {
        String query = "select * from login";
        try
        {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next())
            {
                jComboBox1.addItem(rs.getString("usn"));
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Can't Retrive Username");
        }
    }

    public void checkuser()
    {
        String query = "select * from login where usn ='" + jComboBox1.getSelectedItem() + "' and pswd ='" + txt_pswd.getText() + "'";
        try
        {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            if (rs.next())
            {
                frm_dashboard dashboard = new frm_dashboard(jComboBox1.getSelectedItem().toString());
                dashboard.setVisible(true);

                dashboard.jLabel1.setText(jComboBox1.getSelectedItem().toString());
                this.dispose();
            }
            else
            {
                txt_pswd.setLineColor(Color.red);
                txt_pswd.grabFocus();
                txt_pswd.setText("");
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "checking failed");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private combo_suggestion.ComboBoxSuggestion jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private com.k33ptoo.components.KGradientPanel kpanel_left;
    private com.k33ptoo.components.KGradientPanel kpanel_right;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_gt;
    private javax.swing.JLabel lbl_min;
    private javax.swing.JLabel lbl_right_img;
    private com.k33ptoo.components.KButton loginBtn;
    private javax.swing.JPanel pnl_bg_login;
    private javax.swing.JPanel pnl_close;
    private javax.swing.JPanel pnl_header;
    private javax.swing.JPanel pnl_min;
    private textfield.PasswordField txt_pswd;
    // End of variables declaration//GEN-END:variables
}
