
import java.io.File;
import javax.swing.JFileChooser;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author dhruv
 */
public class NewJFrame extends javax.swing.JFrame
{

//    public void paintComponent(Graphics g)
//    {
//        ImageIcon im = new ImageIcon("src\\icons\\background.jpg");
//        Image i = im.getImage();
//
//        g.drawImage(i,0,0,this.getSize().width,this.getSize().height,this);
//    }
    public NewJFrame()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        panel_addproduct = new com.k33ptoo.components.KGradientPanel();
        panel_txt_addproid = new com.k33ptoo.components.KGradientPanel();
        txt_add_proid = new javax.swing.JTextField();
        panel_txt_addproid6 = new com.k33ptoo.components.KGradientPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        panel_txt_addproid8 = new com.k33ptoo.components.KGradientPanel();
        txt_add_proid6 = new javax.swing.JTextField();
        panel_txt_addproid9 = new com.k33ptoo.components.KGradientPanel();
        txt_add_proid7 = new javax.swing.JTextField();
        panel_txt_addproid10 = new com.k33ptoo.components.KGradientPanel();
        txt_add_proid8 = new javax.swing.JTextField();
        panel_txt_addproid7 = new com.k33ptoo.components.KGradientPanel();
        jComboBox3 = new javax.swing.JComboBox<>();
        panel_txt_addproid11 = new com.k33ptoo.components.KGradientPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        panel_txt_addproid12 = new com.k33ptoo.components.KGradientPanel();
        jComboBox4 = new javax.swing.JComboBox<>();
        loginBtn6 = new com.k33ptoo.components.KButton();
        lbl_add_empimg1 = new javax.swing.JLabel();
        lbl_add_emprmimg2 = new javax.swing.JLabel();
        lbl_add_empaddimg2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        panel_addproduct.setkBorderRadius(40);
        panel_addproduct.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_addproduct.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_addproduct.setOpaque(false);

        panel_txt_addproid.setkBorderRadius(40);
        panel_txt_addproid.setkEndColor(new java.awt.Color(164, 177, 252));
        panel_txt_addproid.setkStartColor(new java.awt.Color(164, 177, 252));
        panel_txt_addproid.setOpaque(false);

        txt_add_proid.setBackground(new java.awt.Color(164, 177, 252));
        txt_add_proid.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        txt_add_proid.setForeground(new java.awt.Color(228, 235, 246));
        txt_add_proid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_add_proid.setText("SELLING PRICE");
        txt_add_proid.setBorder(null);
        txt_add_proid.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                txt_add_proidFocusLost(evt);
            }
        });
        txt_add_proid.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txt_add_proidKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_txt_addproidLayout = new javax.swing.GroupLayout(panel_txt_addproid);
        panel_txt_addproid.setLayout(panel_txt_addproidLayout);
        panel_txt_addproidLayout.setHorizontalGroup(
            panel_txt_addproidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_txt_addproidLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(txt_add_proid, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panel_txt_addproidLayout.setVerticalGroup(
            panel_txt_addproidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_add_proid, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panel_txt_addproid6.setkBorderRadius(40);
        panel_txt_addproid6.setkEndColor(new java.awt.Color(164, 177, 252));
        panel_txt_addproid6.setkStartColor(new java.awt.Color(164, 177, 252));
        panel_txt_addproid6.setOpaque(false);

        jComboBox2.setBackground(new java.awt.Color(164, 177, 252));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BRAND", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout panel_txt_addproid6Layout = new javax.swing.GroupLayout(panel_txt_addproid6);
        panel_txt_addproid6.setLayout(panel_txt_addproid6Layout);
        panel_txt_addproid6Layout.setHorizontalGroup(
            panel_txt_addproid6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_txt_addproid6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panel_txt_addproid6Layout.setVerticalGroup(
            panel_txt_addproid6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jComboBox2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panel_txt_addproid8.setkBorderRadius(40);
        panel_txt_addproid8.setkEndColor(new java.awt.Color(164, 177, 252));
        panel_txt_addproid8.setkStartColor(new java.awt.Color(164, 177, 252));
        panel_txt_addproid8.setOpaque(false);

        txt_add_proid6.setBackground(new java.awt.Color(164, 177, 252));
        txt_add_proid6.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        txt_add_proid6.setForeground(new java.awt.Color(228, 235, 246));
        txt_add_proid6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_add_proid6.setText("PRODUCT ID");
        txt_add_proid6.setBorder(null);
        txt_add_proid6.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                txt_add_proid6FocusLost(evt);
            }
        });
        txt_add_proid6.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txt_add_proid6KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_txt_addproid8Layout = new javax.swing.GroupLayout(panel_txt_addproid8);
        panel_txt_addproid8.setLayout(panel_txt_addproid8Layout);
        panel_txt_addproid8Layout.setHorizontalGroup(
            panel_txt_addproid8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_txt_addproid8Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(txt_add_proid6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panel_txt_addproid8Layout.setVerticalGroup(
            panel_txt_addproid8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_add_proid6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panel_txt_addproid9.setkBorderRadius(40);
        panel_txt_addproid9.setkEndColor(new java.awt.Color(164, 177, 252));
        panel_txt_addproid9.setkStartColor(new java.awt.Color(164, 177, 252));
        panel_txt_addproid9.setOpaque(false);

        txt_add_proid7.setBackground(new java.awt.Color(164, 177, 252));
        txt_add_proid7.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        txt_add_proid7.setForeground(new java.awt.Color(228, 235, 246));
        txt_add_proid7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_add_proid7.setText("PRODUCT NAME");
        txt_add_proid7.setBorder(null);
        txt_add_proid7.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                txt_add_proid7FocusLost(evt);
            }
        });
        txt_add_proid7.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txt_add_proid7KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_txt_addproid9Layout = new javax.swing.GroupLayout(panel_txt_addproid9);
        panel_txt_addproid9.setLayout(panel_txt_addproid9Layout);
        panel_txt_addproid9Layout.setHorizontalGroup(
            panel_txt_addproid9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_txt_addproid9Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(txt_add_proid7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panel_txt_addproid9Layout.setVerticalGroup(
            panel_txt_addproid9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_add_proid7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panel_txt_addproid10.setkBorderRadius(40);
        panel_txt_addproid10.setkEndColor(new java.awt.Color(164, 177, 252));
        panel_txt_addproid10.setkStartColor(new java.awt.Color(164, 177, 252));
        panel_txt_addproid10.setOpaque(false);

        txt_add_proid8.setBackground(new java.awt.Color(164, 177, 252));
        txt_add_proid8.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        txt_add_proid8.setForeground(new java.awt.Color(228, 235, 246));
        txt_add_proid8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_add_proid8.setText("COST PRICE");
        txt_add_proid8.setBorder(null);
        txt_add_proid8.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                txt_add_proid8FocusLost(evt);
            }
        });
        txt_add_proid8.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txt_add_proid8KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_txt_addproid10Layout = new javax.swing.GroupLayout(panel_txt_addproid10);
        panel_txt_addproid10.setLayout(panel_txt_addproid10Layout);
        panel_txt_addproid10Layout.setHorizontalGroup(
            panel_txt_addproid10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_txt_addproid10Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(txt_add_proid8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panel_txt_addproid10Layout.setVerticalGroup(
            panel_txt_addproid10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_add_proid8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panel_txt_addproid7.setkBorderRadius(40);
        panel_txt_addproid7.setkEndColor(new java.awt.Color(164, 177, 252));
        panel_txt_addproid7.setkStartColor(new java.awt.Color(164, 177, 252));
        panel_txt_addproid7.setOpaque(false);

        jComboBox3.setBackground(new java.awt.Color(164, 177, 252));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CATAGORY", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout panel_txt_addproid7Layout = new javax.swing.GroupLayout(panel_txt_addproid7);
        panel_txt_addproid7.setLayout(panel_txt_addproid7Layout);
        panel_txt_addproid7Layout.setHorizontalGroup(
            panel_txt_addproid7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_txt_addproid7Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panel_txt_addproid7Layout.setVerticalGroup(
            panel_txt_addproid7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jComboBox3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panel_txt_addproid11.setkBorderRadius(40);
        panel_txt_addproid11.setkEndColor(new java.awt.Color(164, 177, 252));
        panel_txt_addproid11.setkStartColor(new java.awt.Color(164, 177, 252));
        panel_txt_addproid11.setOpaque(false);

        jTextArea1.setBackground(new java.awt.Color(164, 177, 252));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("DISCRIPTION");
        jScrollPane5.setViewportView(jTextArea1);

        javax.swing.GroupLayout panel_txt_addproid11Layout = new javax.swing.GroupLayout(panel_txt_addproid11);
        panel_txt_addproid11.setLayout(panel_txt_addproid11Layout);
        panel_txt_addproid11Layout.setHorizontalGroup(
            panel_txt_addproid11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_txt_addproid11Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_txt_addproid11Layout.setVerticalGroup(
            panel_txt_addproid11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );

        panel_txt_addproid12.setkBorderRadius(40);
        panel_txt_addproid12.setkEndColor(new java.awt.Color(164, 177, 252));
        panel_txt_addproid12.setkStartColor(new java.awt.Color(164, 177, 252));
        panel_txt_addproid12.setOpaque(false);

        jComboBox4.setBackground(new java.awt.Color(164, 177, 252));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CATAGORY", "Item 2", "Item 3", "Item 4" }));
        jComboBox4.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout panel_txt_addproid12Layout = new javax.swing.GroupLayout(panel_txt_addproid12);
        panel_txt_addproid12.setLayout(panel_txt_addproid12Layout);
        panel_txt_addproid12Layout.setHorizontalGroup(
            panel_txt_addproid12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_txt_addproid12Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panel_txt_addproid12Layout.setVerticalGroup(
            panel_txt_addproid12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jComboBox4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        loginBtn6.setBorder(null);
        loginBtn6.setText("ADD CUSTOMER");
        loginBtn6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn6.setkBorderRadius(30);
        loginBtn6.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn6.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        loginBtn6.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn6.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        loginBtn6.setkStartColor(new java.awt.Color(68, 82, 121));

        lbl_add_empimg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add_empimg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/man.png"))); // NOI18N

        lbl_add_emprmimg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add_emprmimg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/substract.png"))); // NOI18N
        lbl_add_emprmimg2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_add_emprmimg2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_add_emprmimg2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_add_emprmimg2MouseExited(evt);
            }
        });

        lbl_add_empaddimg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add_empaddimg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add-user.png"))); // NOI18N
        lbl_add_empaddimg2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_add_empaddimg2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_add_empaddimg2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_add_empaddimg2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_addproductLayout = new javax.swing.GroupLayout(panel_addproduct);
        panel_addproduct.setLayout(panel_addproductLayout);
        panel_addproductLayout.setHorizontalGroup(
            panel_addproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addproductLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel_addproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_addproductLayout.createSequentialGroup()
                        .addComponent(panel_txt_addproid8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(panel_txt_addproid9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(panel_txt_addproid10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_addproductLayout.createSequentialGroup()
                        .addGroup(panel_addproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_addproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panel_addproductLayout.createSequentialGroup()
                                    .addComponent(panel_txt_addproid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(panel_txt_addproid6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(panel_txt_addproid11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panel_addproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_addproductLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(panel_txt_addproid7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_addproductLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panel_txt_addproid12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addproductLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_add_empimg1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_addproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_add_emprmimg2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(lbl_add_empaddimg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(369, 369, 369))
        );
        panel_addproductLayout.setVerticalGroup(
            panel_addproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addproductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_addproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_add_empimg1)
                    .addGroup(panel_addproductLayout.createSequentialGroup()
                        .addComponent(lbl_add_emprmimg2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(lbl_add_empaddimg2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(panel_addproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_txt_addproid9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_txt_addproid8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_txt_addproid10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(panel_addproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_txt_addproid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_txt_addproid6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_txt_addproid7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(panel_addproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_txt_addproid11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_txt_addproid12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(loginBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(panel_addproduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(panel_addproduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_add_proidFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txt_add_proidFocusLost
    {//GEN-HEADEREND:event_txt_add_proidFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_add_proidFocusLost

    private void txt_add_proidKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_add_proidKeyPressed
    {//GEN-HEADEREND:event_txt_add_proidKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_add_proidKeyPressed

    private void txt_add_proid6FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txt_add_proid6FocusLost
    {//GEN-HEADEREND:event_txt_add_proid6FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_add_proid6FocusLost

    private void txt_add_proid6KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_add_proid6KeyPressed
    {//GEN-HEADEREND:event_txt_add_proid6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_add_proid6KeyPressed

    private void txt_add_proid7FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txt_add_proid7FocusLost
    {//GEN-HEADEREND:event_txt_add_proid7FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_add_proid7FocusLost

    private void txt_add_proid7KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_add_proid7KeyPressed
    {//GEN-HEADEREND:event_txt_add_proid7KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_add_proid7KeyPressed

    private void txt_add_proid8FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txt_add_proid8FocusLost
    {//GEN-HEADEREND:event_txt_add_proid8FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_add_proid8FocusLost

    private void txt_add_proid8KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_add_proid8KeyPressed
    {//GEN-HEADEREND:event_txt_add_proid8KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_add_proid8KeyPressed

    private void lbl_add_emprmimg2MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_emprmimg2MouseEntered
    {//GEN-HEADEREND:event_lbl_add_emprmimg2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_add_emprmimg2MouseEntered

    private void lbl_add_emprmimg2MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_emprmimg2MouseExited
    {//GEN-HEADEREND:event_lbl_add_emprmimg2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_add_emprmimg2MouseExited

    private void lbl_add_empaddimg2MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_empaddimg2MouseEntered
    {//GEN-HEADEREND:event_lbl_add_empaddimg2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_add_empaddimg2MouseEntered

    private void lbl_add_empaddimg2MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_empaddimg2MouseExited
    {//GEN-HEADEREND:event_lbl_add_empaddimg2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_add_empaddimg2MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //hello how are you

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_add_empaddimg2;
    private javax.swing.JLabel lbl_add_empimg1;
    private javax.swing.JLabel lbl_add_emprmimg2;
    private com.k33ptoo.components.KButton loginBtn6;
    private com.k33ptoo.components.KGradientPanel panel_addproduct;
    private com.k33ptoo.components.KGradientPanel panel_txt_addproid;
    private com.k33ptoo.components.KGradientPanel panel_txt_addproid10;
    private com.k33ptoo.components.KGradientPanel panel_txt_addproid11;
    private com.k33ptoo.components.KGradientPanel panel_txt_addproid12;
    private com.k33ptoo.components.KGradientPanel panel_txt_addproid6;
    private com.k33ptoo.components.KGradientPanel panel_txt_addproid7;
    private com.k33ptoo.components.KGradientPanel panel_txt_addproid8;
    private com.k33ptoo.components.KGradientPanel panel_txt_addproid9;
    private javax.swing.JTextField txt_add_proid;
    private javax.swing.JTextField txt_add_proid6;
    private javax.swing.JTextField txt_add_proid7;
    private javax.swing.JTextField txt_add_proid8;
    // End of variables declaration//GEN-END:variables
}
