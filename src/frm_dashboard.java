
import com.k33ptoo.components.KButton;
import com.k33ptoo.components.KGradientPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.beans.Visibility;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;
import scrollbar.ScrollBarCustom;

public class frm_dashboard extends javax.swing.JFrame
{

    public frm_dashboard()
    {
        initComponents();
        panel_main.setVisible(true);
        visibility(jLabel2, false, false, false, false, false, false, true);

        screensize();

        tableheader(table_custedit.getTableHeader());
        tableheader(table_custdet.getTableHeader());
        jScrollPane6.setVerticalScrollBar(new ScrollBarCustom());
    }

    public frm_dashboard(String name)
    {
        initComponents();
        panel_main.setVisible(true);
        visibility(jLabel2, false, false, false, false, false, false, true);

        screensize();

        tableheader(table_custedit.getTableHeader());
        tableheader(table_custdet.getTableHeader());

        if (name.equals("ADMIN"))
        {
            lbl_customer.setEnabled(true);
        }
        else
        {
            lbl_customer.setEnabled(false);
        }
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
        pnl_user = new com.k33ptoo.components.KGradientPanel();
        lbl_user = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        pnl_header = new com.k33ptoo.components.KGradientPanel();
        pnl_close = new com.k33ptoo.components.KGradientPanel();
        lbl_close = new javax.swing.JLabel();
        pnl_min = new javax.swing.JPanel();
        lbl_min = new javax.swing.JLabel();
        lbl_gt = new javax.swing.JLabel();
        panel_main = new com.k33ptoo.components.KGradientPanel();
        panel_customer = new com.k33ptoo.components.KGradientPanel();
        panel_custmain = new com.k33ptoo.components.KGradientPanel();
        panel_addcust = new com.k33ptoo.components.KGradientPanel();
        loginBtn = new com.k33ptoo.components.KButton();
        txt_add_custid = new textfield.TextField();
        txt_add_custnm = new textfield.TextField();
        txt_add_custno = new textfield.TextField();
        txt_add_custemail = new textfield.TextField();
        txt_add_custsnm = new textfield.TextField();
        txt_add_custsnm1 = new textfield.TextField();
        jLabel4 = new javax.swing.JLabel();
        txt_add_custsnm2 = new textfield.TextField();
        panel_editcus = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel12 = new com.k33ptoo.components.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_custedit = new javax.swing.JTable();
        loginBtn1 = new com.k33ptoo.components.KButton();
        loginBtn2 = new com.k33ptoo.components.KButton();
        jTextField1 = new javax.swing.JTextField();
        txt_edit_custnm = new textfield.TextField();
        txt_edit_custemail = new textfield.TextField();
        txt_edit_custno = new textfield.TextField();
        txt_edit_custsnm = new textfield.TextField();
        txt_edit_custsadd = new textfield.TextField();
        jLabel5 = new javax.swing.JLabel();
        panel_custdetail = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel19 = new com.k33ptoo.components.KGradientPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_custdet = new javax.swing.JTable()
        ;
        txt_det_custid = new textfield.TextField();
        panel_custextra = new com.k33ptoo.components.KGradientPanel();
        panel_custmenu1 = new com.k33ptoo.components.KGradientPanel();
        panel_addcustmenu1 = new com.k33ptoo.components.KGradientPanel();
        kButton2 = new com.k33ptoo.components.KButton();
        kGradientPanel10 = new com.k33ptoo.components.KGradientPanel();
        panel_addcustmenu2 = new com.k33ptoo.components.KGradientPanel();
        kButton3 = new com.k33ptoo.components.KButton();
        kGradientPanel11 = new com.k33ptoo.components.KGradientPanel();
        panel_addcustmenu3 = new com.k33ptoo.components.KGradientPanel();
        kButton4 = new com.k33ptoo.components.KButton();
        kGradientPanel13 = new com.k33ptoo.components.KGradientPanel();
        panel_employee = new com.k33ptoo.components.KGradientPanel();
        panel_empmain = new com.k33ptoo.components.KGradientPanel();
        panel_addemp = new com.k33ptoo.components.KGradientPanel();
        loginBtn5 = new com.k33ptoo.components.KButton();
        lbl_add_empaddimg = new javax.swing.JLabel();
        lbl_add_emprmimg = new javax.swing.JLabel();
        txt_add_empid = new textfield.TextField();
        txt_add_empnm = new textfield.TextField();
        txt_add_empno = new textfield.TextField();
        txt_add_empemail = new textfield.TextField();
        txt_add_empsalary = new textfield.TextField();
        txt_add_empadd = new textfield.TextField();
        lbl_add_empimg = new javax.swing.JLabel();
        panel_editemp = new com.k33ptoo.components.KGradientPanel();
        lbl_edit_empimg = new javax.swing.JLabel();
        panel_edit_emptable = new com.k33ptoo.components.KGradientPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_empedit = new javax.swing.JTable();
        loginBtn3 = new com.k33ptoo.components.KButton();
        loginBtn4 = new com.k33ptoo.components.KButton();
        lbl_add_emprmimg1 = new javax.swing.JLabel();
        lbl_add_empaddimg1 = new javax.swing.JLabel();
        txt_edit_empnm = new textfield.TextField();
        txt_edit_empnm1 = new textfield.TextField();
        txt_edit_empemail = new textfield.TextField();
        txt_edit_empsalary = new textfield.TextField();
        txt_edit_empadd = new textfield.TextField();
        panel_detemp = new com.k33ptoo.components.KGradientPanel();
        txt_det_empid = new textfield.TextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_empdet = new javax.swing.JTable()
        ;
        panel_empextra = new com.k33ptoo.components.KGradientPanel();
        panel_empmenu = new com.k33ptoo.components.KGradientPanel();
        panel_addempmenu = new com.k33ptoo.components.KGradientPanel();
        lbl_addemp = new javax.swing.JLabel();
        panel_editempmenu = new com.k33ptoo.components.KGradientPanel();
        lbl_editemp = new javax.swing.JLabel();
        panel_empdetmenu = new com.k33ptoo.components.KGradientPanel();
        lbl_empdet = new javax.swing.JLabel();
        panel_product = new com.k33ptoo.components.KGradientPanel();
        panel_promain = new com.k33ptoo.components.KGradientPanel();
        panel_addpro = new com.k33ptoo.components.KGradientPanel();
        lbl_add_empimg1 = new javax.swing.JLabel();
        lbl_add_proaddimg = new javax.swing.JLabel();
        lbl_add_prormimg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        loginBtn6 = new com.k33ptoo.components.KButton();
        txt_add_pro_id = new textfield.TextField();
        txt_add_pro_id1 = new textfield.TextField();
        txt_add_pro_id2 = new textfield.TextField();
        combo_add_pro_model = new combo_suggestion.ComboBoxSuggestion();
        combo_add_pro_ctgry = new combo_suggestion.ComboBoxSuggestion();
        combo_add_pro_brand = new combo_suggestion.ComboBoxSuggestion();
        txt_add_pro_qty = new spinner.Spinner();
        textAreaScroll2 = new textarea.TextAreaScroll();
        textArea2 = new textarea.TextArea();
        panel_addpro_mcb = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel4 = new com.k33ptoo.components.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_add_promcb_brand_id = new textfield.TextField();
        txt_add_promcb_brand_nm = new textfield.TextField();
        loginBtn8 = new com.k33ptoo.components.KButton();
        loginBtn10 = new com.k33ptoo.components.KButton();
        txt_add_promcb_ctrgy_id1 = new textfield.TextField();
        txt_add_promcb_ctrgy_id = new textfield.TextField();
        loginBtn11 = new com.k33ptoo.components.KButton();
        loginBtn12 = new com.k33ptoo.components.KButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_add_promcb_model_id1 = new textfield.TextField();
        txt_add_promcb_model_nm1 = new textfield.TextField();
        panel_editpro = new com.k33ptoo.components.KGradientPanel();
        panel_prodet = new com.k33ptoo.components.KGradientPanel();
        panel_pro_fulldet = new com.k33ptoo.components.KGradientPanel();
        panel_promenu = new com.k33ptoo.components.KGradientPanel();
        panel_addpromenu = new com.k33ptoo.components.KGradientPanel();
        lbl_addpro = new javax.swing.JLabel();
        panel_addmoedelmenu = new com.k33ptoo.components.KGradientPanel();
        lbl_add_prombc = new javax.swing.JLabel();
        panel_proeditmenu = new com.k33ptoo.components.KGradientPanel();
        lbl_editpro = new javax.swing.JLabel();
        panel_prodetmenu = new com.k33ptoo.components.KGradientPanel();
        lbl_prodet = new javax.swing.JLabel();
        panel_bill = new com.k33ptoo.components.KGradientPanel();
        panel_account = new com.k33ptoo.components.KGradientPanel();
        panel_user = new com.k33ptoo.components.KGradientPanel();
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

        lbl_customer.setDisplayedMnemonic('c');
        lbl_customer.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_customer.setForeground(new java.awt.Color(68, 82, 121));
        lbl_customer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/customer.png"))); // NOI18N
        lbl_customer.setLabelFor(panel_customer);
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

        lbl_employee.setDisplayedMnemonic('e');
        lbl_employee.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_employee.setForeground(new java.awt.Color(68, 82, 121));
        lbl_employee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/employee.png"))); // NOI18N
        lbl_employee.setLabelFor(panel_employee);
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
        pnl_product.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pnl_productMouseClicked(evt);
            }
        });

        lbl_product.setDisplayedMnemonic('p');
        lbl_product.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_product.setForeground(new java.awt.Color(68, 82, 121));
        lbl_product.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_product.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/product.png"))); // NOI18N
        lbl_product.setLabelFor(panel_product);
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

        lbl_bill.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_bill.setForeground(new java.awt.Color(68, 82, 121));
        lbl_bill.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_bill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bill.png"))); // NOI18N
        lbl_bill.setLabelFor(panel_bill);
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

        lbl_account.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_account.setForeground(new java.awt.Color(68, 82, 121));
        lbl_account.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_account.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/setting.png"))); // NOI18N
        lbl_account.setText("ACCOUNT MANAGEMENT");
        lbl_account.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_account.setNextFocusableComponent(lbl_user);
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

        pnl_user.setkBorderRadius(40);
        pnl_user.setkEndColor(new java.awt.Color(228, 235, 246));
        pnl_user.setkStartColor(new java.awt.Color(228, 235, 246));
        pnl_user.setOpaque(false);

        lbl_user.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_user.setForeground(new java.awt.Color(68, 82, 121));
        lbl_user.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/help.png"))); // NOI18N
        lbl_user.setText("USER MANUAL");
        lbl_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_user.setNextFocusableComponent(jLabel2);
        lbl_user.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                lbl_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                lbl_userFocusLost(evt);
            }
        });
        lbl_user.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbl_userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_userMouseExited(evt);
            }
        });
        lbl_user.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                lbl_userKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnl_userLayout = new javax.swing.GroupLayout(pnl_user);
        pnl_user.setLayout(pnl_userLayout);
        pnl_userLayout.setHorizontalGroup(
            pnl_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_userLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_user, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_userLayout.setVerticalGroup(
            pnl_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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
                    .addComponent(pnl_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        pnl_sidepaneLayout.setVerticalGroup(
            pnl_sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_sidepaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(pnl_customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(pnl_employee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(pnl_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(pnl_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(pnl_account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(pnl_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        panel_customer.setkBorderRadius(40);
        panel_customer.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_customer.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_customer.setPreferredSize(new java.awt.Dimension(1061, 710));

        panel_custmain.setkBorderRadius(40);
        panel_custmain.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_custmain.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_custmain.setMaximumSize(new java.awt.Dimension(1061, 660));
        panel_custmain.setMinimumSize(new java.awt.Dimension(1061, 660));
        panel_custmain.setPreferredSize(new java.awt.Dimension(1061, 660));

        panel_addcust.setkBorderRadius(40);
        panel_addcust.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_addcust.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_addcust.setOpaque(false);

        loginBtn.setBorder(null);
        loginBtn.setText("ADD CUSTOMER");
        loginBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn.setkBorderRadius(30);
        loginBtn.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        loginBtn.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        loginBtn.setkStartColor(new java.awt.Color(68, 82, 121));
        loginBtn.setNextFocusableComponent(txt_add_custid);
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
        loginBtn.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                loginBtnKeyPressed(evt);
            }
        });

        txt_add_custid.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_custid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_custid.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_custid.setLabelText("CUSTOMER ID");
        txt_add_custid.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_custid.setSelectionColor(new java.awt.Color(68, 82, 121));

        txt_add_custnm.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_custnm.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_custnm.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_custnm.setLabelText("CUSTOMER NAME");
        txt_add_custnm.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_custnm.setSelectionColor(new java.awt.Color(68, 82, 121));

        txt_add_custno.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_custno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_custno.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_custno.setLabelText("CONTACT NO.");
        txt_add_custno.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_custno.setSelectionColor(new java.awt.Color(68, 82, 121));

        txt_add_custemail.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_custemail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_custemail.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_custemail.setLabelText("EMAIL");
        txt_add_custemail.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_custemail.setSelectionColor(new java.awt.Color(68, 82, 121));

        txt_add_custsnm.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_custsnm.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_custsnm.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_custsnm.setLabelText("SHOP NAME");
        txt_add_custsnm.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_custsnm.setSelectionColor(new java.awt.Color(68, 82, 121));

        txt_add_custsnm1.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_custsnm1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_custsnm1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_custsnm1.setLabelText("SHOP NAME");
        txt_add_custsnm1.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_custsnm1.setSelectionColor(new java.awt.Color(68, 82, 121));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel4.setText("CLICK HERE");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txt_add_custsnm2.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_custsnm2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_custsnm2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_custsnm2.setLabelText("OTP");
        txt_add_custsnm2.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_custsnm2.setSelectionColor(new java.awt.Color(68, 82, 121));

        javax.swing.GroupLayout panel_addcustLayout = new javax.swing.GroupLayout(panel_addcust);
        panel_addcust.setLayout(panel_addcustLayout);
        panel_addcustLayout.setHorizontalGroup(
            panel_addcustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcustLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(panel_addcustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_addcustLayout.createSequentialGroup()
                        .addGroup(panel_addcustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_add_custid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_add_custno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_add_custsnm, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                        .addGap(100, 100, 100)
                        .addGroup(panel_addcustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_add_custsnm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel_addcustLayout.createSequentialGroup()
                                .addGroup(panel_addcustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_add_custnm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_addcustLayout.createSequentialGroup()
                                        .addComponent(txt_add_custemail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel4)))
                                .addGap(0, 25, Short.MAX_VALUE))))
                    .addGroup(panel_addcustLayout.createSequentialGroup()
                        .addComponent(txt_add_custsnm2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(124, 124, 124))
        );
        panel_addcustLayout.setVerticalGroup(
            panel_addcustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcustLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(panel_addcustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_add_custid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_custnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(panel_addcustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_add_custno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_custemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(panel_addcustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_add_custsnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_custsnm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(panel_addcustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_custsnm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        panel_editcus.setkBorderRadius(40);
        panel_editcus.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_editcus.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_editcus.setOpaque(false);

        kGradientPanel12.setkBorderRadius(40);
        kGradientPanel12.setkEndColor(new java.awt.Color(178, 199, 231));
        kGradientPanel12.setkStartColor(new java.awt.Color(178, 199, 231));
        kGradientPanel12.setOpaque(false);

        table_custedit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        table_custedit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"spareparts", "chargin socket", "display", "combo"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_custedit.setRowHeight(31);
        jScrollPane1.setViewportView(table_custedit);

        loginBtn1.setBorder(null);
        loginBtn1.setText("EDIT");
        loginBtn1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn1.setkBorderRadius(30);
        loginBtn1.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn1.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        loginBtn1.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn1.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        loginBtn1.setkStartColor(new java.awt.Color(68, 82, 121));

        loginBtn2.setBorder(null);
        loginBtn2.setText("REMOVE");
        loginBtn2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn2.setkBorderRadius(30);
        loginBtn2.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn2.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        loginBtn2.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn2.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        loginBtn2.setkStartColor(new java.awt.Color(68, 82, 121));

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("OTP");

        javax.swing.GroupLayout kGradientPanel12Layout = new javax.swing.GroupLayout(kGradientPanel12);
        kGradientPanel12.setLayout(kGradientPanel12Layout);
        kGradientPanel12Layout.setHorizontalGroup(
            kGradientPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel12Layout.createSequentialGroup()
                .addGroup(kGradientPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(kGradientPanel12Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel12Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loginBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        kGradientPanel12Layout.setVerticalGroup(
            kGradientPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel12Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(loginBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loginBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        txt_edit_custnm.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_custnm.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_custnm.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_custnm.setLabelText("CUSTOMER NAME");
        txt_edit_custnm.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_custnm.setNextFocusableComponent(txt_edit_custno);
        txt_edit_custnm.setSelectionColor(new java.awt.Color(68, 82, 121));

        txt_edit_custemail.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_custemail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_custemail.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_custemail.setLabelText("EMAIL");
        txt_edit_custemail.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_custemail.setNextFocusableComponent(txt_edit_custsnm);
        txt_edit_custemail.setSelectionColor(new java.awt.Color(68, 82, 121));

        txt_edit_custno.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_custno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_custno.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_custno.setLabelText("CONTACT NO.");
        txt_edit_custno.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_custno.setNextFocusableComponent(txt_edit_custemail);
        txt_edit_custno.setSelectionColor(new java.awt.Color(68, 82, 121));

        txt_edit_custsnm.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_custsnm.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_custsnm.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_custsnm.setLabelText("SHOP NAME");
        txt_edit_custsnm.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_custsnm.setSelectionColor(new java.awt.Color(68, 82, 121));

        txt_edit_custsadd.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_custsadd.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_custsadd.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_custsadd.setLabelText("SHOP ADDRESS");
        txt_edit_custsadd.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_custsadd.setNextFocusableComponent(txt_edit_custnm);
        txt_edit_custsadd.setSelectionColor(new java.awt.Color(68, 82, 121));

        jLabel5.setText("CLICK HERE");

        javax.swing.GroupLayout panel_editcusLayout = new javax.swing.GroupLayout(panel_editcus);
        panel_editcus.setLayout(panel_editcusLayout);
        panel_editcusLayout.setHorizontalGroup(
            panel_editcusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editcusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_editcusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_edit_custnm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_edit_custno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_edit_custsnm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_edit_custsadd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_editcusLayout.createSequentialGroup()
                        .addComponent(txt_edit_custemail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(kGradientPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        panel_editcusLayout.setVerticalGroup(
            panel_editcusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editcusLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_editcusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_editcusLayout.createSequentialGroup()
                        .addComponent(txt_edit_custnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_edit_custno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(panel_editcusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_edit_custemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(txt_edit_custsnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(txt_edit_custsadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kGradientPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        panel_custdetail.setkBorderRadius(40);
        panel_custdetail.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_custdetail.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_custdetail.setOpaque(false);

        kGradientPanel19.setkBorderRadius(40);
        kGradientPanel19.setkEndColor(new java.awt.Color(178, 199, 231));
        kGradientPanel19.setkStartColor(new java.awt.Color(178, 199, 231));
        kGradientPanel19.setOpaque(false);

        jScrollPane2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        table_custdet.setBackground(new java.awt.Color(228, 235, 246));
        table_custdet.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        table_custdet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_custdet.setOpaque(false);
        table_custdet.setRowHeight(40);
        table_custdet.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                table_custdetKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(table_custdet);

        javax.swing.GroupLayout kGradientPanel19Layout = new javax.swing.GroupLayout(kGradientPanel19);
        kGradientPanel19.setLayout(kGradientPanel19Layout);
        kGradientPanel19Layout.setHorizontalGroup(
            kGradientPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel19Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        kGradientPanel19Layout.setVerticalGroup(
            kGradientPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel19Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        txt_det_custid.setBackground(new java.awt.Color(228, 235, 246));
        txt_det_custid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_det_custid.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_det_custid.setLabelText("SHOP ADDRESS");
        txt_det_custid.setLineColor(new java.awt.Color(68, 82, 121));
        txt_det_custid.setSelectionColor(new java.awt.Color(68, 82, 121));

        javax.swing.GroupLayout panel_custdetailLayout = new javax.swing.GroupLayout(panel_custdetail);
        panel_custdetail.setLayout(panel_custdetailLayout);
        panel_custdetailLayout.setHorizontalGroup(
            panel_custdetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_custdetailLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_custdetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kGradientPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_det_custid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        panel_custdetailLayout.setVerticalGroup(
            panel_custdetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_custdetailLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txt_det_custid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(kGradientPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        panel_custextra.setkBorderRadius(40);
        panel_custextra.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_custextra.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_custextra.setOpaque(false);

        javax.swing.GroupLayout panel_custextraLayout = new javax.swing.GroupLayout(panel_custextra);
        panel_custextra.setLayout(panel_custextraLayout);
        panel_custextraLayout.setHorizontalGroup(
            panel_custextraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1011, Short.MAX_VALUE)
        );
        panel_custextraLayout.setVerticalGroup(
            panel_custextraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_custmainLayout = new javax.swing.GroupLayout(panel_custmain);
        panel_custmain.setLayout(panel_custmainLayout);
        panel_custmainLayout.setHorizontalGroup(
            panel_custmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_custmainLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panel_addcust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
            .addGroup(panel_custmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_custmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_editcus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(25, 25, 25)))
            .addGroup(panel_custmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_custmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_custdetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(25, 25, 25)))
            .addGroup(panel_custmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_custmainLayout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(panel_custextra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(23, 23, 23)))
        );
        panel_custmainLayout.setVerticalGroup(
            panel_custmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_custmainLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panel_addcust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(panel_custmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_custmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_editcus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(panel_custmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_custmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_custdetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(panel_custmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_custmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_custextra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        panel_custmenu1.setkBorderRadius(40);
        panel_custmenu1.setkEndColor(new java.awt.Color(68, 82, 121));
        panel_custmenu1.setkStartColor(new java.awt.Color(68, 82, 121));
        panel_custmenu1.setOpaque(false);

        panel_addcustmenu1.setkBorderRadius(40);
        panel_addcustmenu1.setkEndColor(new java.awt.Color(68, 82, 121));
        panel_addcustmenu1.setkStartColor(new java.awt.Color(68, 82, 121));
        panel_addcustmenu1.setOpaque(false);

        kButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        kButton2.setText("ADD CUSTOMER");
        kButton2.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        kButton2.setkEndColor(new java.awt.Color(68, 82, 121));
        kButton2.setkStartColor(new java.awt.Color(68, 82, 121));
        kButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                kButton2ActionPerformed(evt);
            }
        });
        kButton2.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                kButton2KeyPressed(evt);
            }
        });

        kGradientPanel10.setkEndColor(new java.awt.Color(178, 199, 231));
        kGradientPanel10.setkStartColor(new java.awt.Color(178, 199, 231));
        kGradientPanel10.setOpaque(false);

        javax.swing.GroupLayout kGradientPanel10Layout = new javax.swing.GroupLayout(kGradientPanel10);
        kGradientPanel10.setLayout(kGradientPanel10Layout);
        kGradientPanel10Layout.setHorizontalGroup(
            kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        kGradientPanel10Layout.setVerticalGroup(
            kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_addcustmenu1Layout = new javax.swing.GroupLayout(panel_addcustmenu1);
        panel_addcustmenu1.setLayout(panel_addcustmenu1Layout);
        panel_addcustmenu1Layout.setHorizontalGroup(
            panel_addcustmenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addcustmenu1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_addcustmenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kGradientPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_addcustmenu1Layout.setVerticalGroup(
            panel_addcustmenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcustmenu1Layout.createSequentialGroup()
                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kGradientPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_addcustmenu2.setkBorderRadius(40);
        panel_addcustmenu2.setkEndColor(new java.awt.Color(68, 82, 121));
        panel_addcustmenu2.setkStartColor(new java.awt.Color(68, 82, 121));
        panel_addcustmenu2.setOpaque(false);

        kButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        kButton3.setText("EDIT CUSTOMER");
        kButton3.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        kButton3.setkEndColor(new java.awt.Color(68, 82, 121));
        kButton3.setkStartColor(new java.awt.Color(68, 82, 121));
        kButton3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                kButton3ActionPerformed(evt);
            }
        });

        kGradientPanel11.setkEndColor(new java.awt.Color(178, 199, 231));
        kGradientPanel11.setkStartColor(new java.awt.Color(178, 199, 231));
        kGradientPanel11.setOpaque(false);

        javax.swing.GroupLayout kGradientPanel11Layout = new javax.swing.GroupLayout(kGradientPanel11);
        kGradientPanel11.setLayout(kGradientPanel11Layout);
        kGradientPanel11Layout.setHorizontalGroup(
            kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        kGradientPanel11Layout.setVerticalGroup(
            kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_addcustmenu2Layout = new javax.swing.GroupLayout(panel_addcustmenu2);
        panel_addcustmenu2.setLayout(panel_addcustmenu2Layout);
        panel_addcustmenu2Layout.setHorizontalGroup(
            panel_addcustmenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addcustmenu2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_addcustmenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kGradientPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_addcustmenu2Layout.setVerticalGroup(
            panel_addcustmenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcustmenu2Layout.createSequentialGroup()
                .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kGradientPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_addcustmenu3.setkBorderRadius(40);
        panel_addcustmenu3.setkEndColor(new java.awt.Color(68, 82, 121));
        panel_addcustmenu3.setkStartColor(new java.awt.Color(68, 82, 121));
        panel_addcustmenu3.setOpaque(false);

        kButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        kButton4.setText("CUSTOMER DETAIL");
        kButton4.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        kButton4.setkEndColor(new java.awt.Color(68, 82, 121));
        kButton4.setkStartColor(new java.awt.Color(68, 82, 121));
        kButton4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                kButton4ActionPerformed(evt);
            }
        });

        kGradientPanel13.setkEndColor(new java.awt.Color(178, 199, 231));
        kGradientPanel13.setkStartColor(new java.awt.Color(178, 199, 231));
        kGradientPanel13.setOpaque(false);
        kGradientPanel13.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout kGradientPanel13Layout = new javax.swing.GroupLayout(kGradientPanel13);
        kGradientPanel13.setLayout(kGradientPanel13Layout);
        kGradientPanel13Layout.setHorizontalGroup(
            kGradientPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );
        kGradientPanel13Layout.setVerticalGroup(
            kGradientPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_addcustmenu3Layout = new javax.swing.GroupLayout(panel_addcustmenu3);
        panel_addcustmenu3.setLayout(panel_addcustmenu3Layout);
        panel_addcustmenu3Layout.setHorizontalGroup(
            panel_addcustmenu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcustmenu3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_addcustmenu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kGradientPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_addcustmenu3Layout.setVerticalGroup(
            panel_addcustmenu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcustmenu3Layout.createSequentialGroup()
                .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kGradientPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panel_custmenu1Layout = new javax.swing.GroupLayout(panel_custmenu1);
        panel_custmenu1.setLayout(panel_custmenu1Layout);
        panel_custmenu1Layout.setHorizontalGroup(
            panel_custmenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_custmenu1Layout.createSequentialGroup()
                .addComponent(panel_addcustmenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_addcustmenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_addcustmenu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_custmenu1Layout.setVerticalGroup(
            panel_custmenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_addcustmenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, Short.MAX_VALUE)
            .addComponent(panel_addcustmenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, Short.MAX_VALUE)
            .addComponent(panel_addcustmenu3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_customerLayout = new javax.swing.GroupLayout(panel_customer);
        panel_customer.setLayout(panel_customerLayout);
        panel_customerLayout.setHorizontalGroup(
            panel_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_custmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_customerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_custmenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_customerLayout.setVerticalGroup(
            panel_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_customerLayout.createSequentialGroup()
                .addComponent(panel_custmenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_custmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_employee.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_employee.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_employee.setPreferredSize(new java.awt.Dimension(1061, 710));

        panel_empmain.setkBorderRadius(40);
        panel_empmain.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_empmain.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_empmain.setOpaque(false);

        panel_addemp.setkBorderRadius(40);
        panel_addemp.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_addemp.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_addemp.setOpaque(false);

        loginBtn5.setBorder(null);
        loginBtn5.setMnemonic('c');
        loginBtn5.setText("ADD EMPLOYEE");
        loginBtn5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn5.setkBorderRadius(30);
        loginBtn5.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn5.setkHoverEndColor(new java.awt.Color(228, 235, 246));
        loginBtn5.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn5.setkHoverStartColor(new java.awt.Color(228, 235, 246));
        loginBtn5.setkStartColor(new java.awt.Color(68, 82, 121));
        loginBtn5.setNextFocusableComponent(lbl_addemp);

        lbl_add_empaddimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add_empaddimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add-user.png"))); // NOI18N
        lbl_add_empaddimg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_add_empaddimg.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_add_empaddimgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_add_empaddimgMouseExited(evt);
            }
        });

        lbl_add_emprmimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add_emprmimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/substract.png"))); // NOI18N
        lbl_add_emprmimg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_add_emprmimg.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_add_emprmimgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_add_emprmimgMouseExited(evt);
            }
        });

        txt_add_empid.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_empid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_empid.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_empid.setLabelText("EMPLOYEE ID");
        txt_add_empid.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_empid.setSelectionColor(new java.awt.Color(68, 82, 121));

        txt_add_empnm.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_empnm.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_empnm.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_empnm.setLabelText("EMPLOYEE NAME");
        txt_add_empnm.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_empnm.setSelectionColor(new java.awt.Color(68, 82, 121));

        txt_add_empno.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_empno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_empno.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_empno.setLabelText("CONTACT NO.");
        txt_add_empno.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_empno.setSelectionColor(new java.awt.Color(68, 82, 121));

        txt_add_empemail.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_empemail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_empemail.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_empemail.setLabelText("EMAIL");
        txt_add_empemail.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_empemail.setSelectionColor(new java.awt.Color(68, 82, 121));

        txt_add_empsalary.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_empsalary.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_empsalary.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_empsalary.setLabelText("SALARY");
        txt_add_empsalary.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_empsalary.setSelectionColor(new java.awt.Color(68, 82, 121));

        txt_add_empadd.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_empadd.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_empadd.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_empadd.setLabelText("ADDRESS");
        txt_add_empadd.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_empadd.setSelectionColor(new java.awt.Color(68, 82, 121));

        lbl_add_empimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add_empimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/man.png"))); // NOI18N

        javax.swing.GroupLayout panel_addempLayout = new javax.swing.GroupLayout(panel_addemp);
        panel_addemp.setLayout(panel_addempLayout);
        panel_addempLayout.setHorizontalGroup(
            panel_addempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addempLayout.createSequentialGroup()
                .addContainerGap(444, Short.MAX_VALUE)
                .addComponent(lbl_add_empimg, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_addempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_add_emprmimg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_add_empaddimg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(374, 374, 374))
            .addGroup(panel_addempLayout.createSequentialGroup()
                .addGroup(panel_addempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_addempLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(panel_addempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_add_empid, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txt_add_empno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_add_empsalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(100, 100, 100)
                        .addGroup(panel_addempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_add_empnm, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txt_add_empemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_add_empadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel_addempLayout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(loginBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_addempLayout.setVerticalGroup(
            panel_addempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addempLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_addempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_addempLayout.createSequentialGroup()
                        .addComponent(lbl_add_empimg, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(panel_addempLayout.createSequentialGroup()
                        .addComponent(lbl_add_emprmimg, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_add_empaddimg)
                        .addGap(35, 35, 35)))
                .addGroup(panel_addempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_add_empid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_empnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(panel_addempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_add_empno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_empemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(panel_addempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_add_empsalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_empadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(loginBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        panel_editemp.setkBorderRadius(40);
        panel_editemp.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_editemp.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_editemp.setOpaque(false);

        lbl_edit_empimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_edit_empimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/man.png"))); // NOI18N

        panel_edit_emptable.setkBorderRadius(40);
        panel_edit_emptable.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_edit_emptable.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_edit_emptable.setOpaque(false);

        table_empedit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        table_empedit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"spareparts", "chargin socket", "display", "combo"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_empedit.setRowHeight(31);
        jScrollPane3.setViewportView(table_empedit);

        loginBtn3.setBorder(null);
        loginBtn3.setText("EDIT EMPLOYEE");
        loginBtn3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn3.setkBorderRadius(30);
        loginBtn3.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn3.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        loginBtn3.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn3.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        loginBtn3.setkStartColor(new java.awt.Color(68, 82, 121));

        loginBtn4.setBorder(null);
        loginBtn4.setText("DELETE EMPLOYEE");
        loginBtn4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn4.setkBorderRadius(30);
        loginBtn4.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn4.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        loginBtn4.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn4.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        loginBtn4.setkStartColor(new java.awt.Color(68, 82, 121));

        javax.swing.GroupLayout panel_edit_emptableLayout = new javax.swing.GroupLayout(panel_edit_emptable);
        panel_edit_emptable.setLayout(panel_edit_emptableLayout);
        panel_edit_emptableLayout.setHorizontalGroup(
            panel_edit_emptableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_edit_emptableLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_edit_emptableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_edit_emptableLayout.createSequentialGroup()
                        .addComponent(loginBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        panel_edit_emptableLayout.setVerticalGroup(
            panel_edit_emptableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_edit_emptableLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_edit_emptableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        lbl_add_emprmimg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add_emprmimg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/substract.png"))); // NOI18N
        lbl_add_emprmimg1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_add_emprmimg1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_add_emprmimg1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_add_emprmimg1MouseExited(evt);
            }
        });

        lbl_add_empaddimg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add_empaddimg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add-user.png"))); // NOI18N
        lbl_add_empaddimg1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_add_empaddimg1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_add_empaddimg1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_add_empaddimg1MouseExited(evt);
            }
        });

        txt_edit_empnm.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_empnm.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_empnm.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_empnm.setLabelText("EMPLOYEE NAME");
        txt_edit_empnm.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_empnm.setSelectionColor(new java.awt.Color(68, 82, 121));

        txt_edit_empnm1.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_empnm1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_empnm1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_empnm1.setLabelText("EMPLOYEE NAME");
        txt_edit_empnm1.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_empnm1.setSelectionColor(new java.awt.Color(68, 82, 121));

        txt_edit_empemail.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_empemail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_empemail.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_empemail.setLabelText("EMAIL");
        txt_edit_empemail.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_empemail.setSelectionColor(new java.awt.Color(68, 82, 121));

        txt_edit_empsalary.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_empsalary.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_empsalary.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_empsalary.setLabelText("SALARY");
        txt_edit_empsalary.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_empsalary.setSelectionColor(new java.awt.Color(68, 82, 121));

        txt_edit_empadd.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_empadd.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_empadd.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_empadd.setLabelText("ADDRESS");
        txt_edit_empadd.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_empadd.setSelectionColor(new java.awt.Color(68, 82, 121));

        javax.swing.GroupLayout panel_editempLayout = new javax.swing.GroupLayout(panel_editemp);
        panel_editemp.setLayout(panel_editempLayout);
        panel_editempLayout.setHorizontalGroup(
            panel_editempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editempLayout.createSequentialGroup()
                .addGroup(panel_editempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_editempLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lbl_edit_empimg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_editempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_add_emprmimg1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_add_empaddimg1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 74, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_editempLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_edit_empnm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_editempLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_edit_empnm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_editempLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_editempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_edit_empadd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_edit_empsalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_edit_empemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(panel_edit_emptable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        panel_editempLayout.setVerticalGroup(
            panel_editempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editempLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_editempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_edit_emptable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_editempLayout.createSequentialGroup()
                        .addGroup(panel_editempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_editempLayout.createSequentialGroup()
                                .addComponent(lbl_add_emprmimg1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_add_empaddimg1))
                            .addComponent(lbl_edit_empimg))
                        .addGap(18, 18, 18)
                        .addComponent(txt_edit_empnm, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_edit_empnm1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txt_edit_empemail, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_edit_empsalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_edit_empadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        panel_detemp.setkBorderRadius(40);
        panel_detemp.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_detemp.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_detemp.setOpaque(false);

        txt_det_empid.setBackground(new java.awt.Color(228, 235, 246));
        txt_det_empid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_det_empid.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_det_empid.setLabelText("EMPLOYEE ID OR NAME");
        txt_det_empid.setLineColor(new java.awt.Color(68, 82, 121));
        txt_det_empid.setSelectionColor(new java.awt.Color(68, 82, 121));

        jScrollPane4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        table_empdet.setBackground(new java.awt.Color(228, 235, 246));
        table_empdet.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        table_empdet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"h", "e", "l", "o"},
                {null, null, null, null},
                {"", null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_empdet.setOpaque(false);
        table_empdet.setRowHeight(40);
        table_empdet.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                table_empdetKeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(table_empdet);

        javax.swing.GroupLayout panel_detempLayout = new javax.swing.GroupLayout(panel_detemp);
        panel_detemp.setLayout(panel_detempLayout);
        panel_detempLayout.setHorizontalGroup(
            panel_detempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_detempLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_detempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE)
                    .addComponent(txt_det_empid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_detempLayout.setVerticalGroup(
            panel_detempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_detempLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txt_det_empid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panel_empextra.setkBorderRadius(40);
        panel_empextra.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_empextra.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_empextra.setOpaque(false);

        javax.swing.GroupLayout panel_empextraLayout = new javax.swing.GroupLayout(panel_empextra);
        panel_empextra.setLayout(panel_empextraLayout);
        panel_empextraLayout.setHorizontalGroup(
            panel_empextraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1011, Short.MAX_VALUE)
        );
        panel_empextraLayout.setVerticalGroup(
            panel_empextraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_empmainLayout = new javax.swing.GroupLayout(panel_empmain);
        panel_empmain.setLayout(panel_empmainLayout);
        panel_empmainLayout.setHorizontalGroup(
            panel_empmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1086, Short.MAX_VALUE)
            .addGroup(panel_empmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_empmainLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(panel_empextra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(25, 25, 25)))
            .addGroup(panel_empmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_empmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_editemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(25, 25, 25)))
            .addGroup(panel_empmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_empmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_addemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(25, 25, 25)))
            .addGroup(panel_empmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_empmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_detemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(25, 25, 25)))
        );
        panel_empmainLayout.setVerticalGroup(
            panel_empmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 708, Short.MAX_VALUE)
            .addGroup(panel_empmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_empmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_empextra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(73, Short.MAX_VALUE)))
            .addGroup(panel_empmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_empmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_editemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(25, 25, 25)))
            .addGroup(panel_empmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_empmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_addemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(25, 25, 25)))
            .addGroup(panel_empmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_empmainLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(panel_detemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(74, Short.MAX_VALUE)))
        );

        panel_empmenu.setkBorderRadius(40);
        panel_empmenu.setkEndColor(new java.awt.Color(68, 82, 121));
        panel_empmenu.setkStartColor(new java.awt.Color(68, 82, 121));
        panel_empmenu.setOpaque(false);

        panel_addempmenu.setkBorderRadius(40);
        panel_addempmenu.setkEndColor(new java.awt.Color(68, 82, 121));
        panel_addempmenu.setkStartColor(new java.awt.Color(68, 82, 121));
        panel_addempmenu.setOpaque(false);

        lbl_addemp.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        lbl_addemp.setForeground(new java.awt.Color(228, 235, 246));
        lbl_addemp.setText("ADD EMPLOYEE");
        lbl_addemp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_addemp.setNextFocusableComponent(lbl_editemp);
        lbl_addemp.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                lbl_addempFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                lbl_addempFocusLost(evt);
            }
        });
        lbl_addemp.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbl_addempMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_addempMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_addempMouseExited(evt);
            }
        });
        lbl_addemp.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                lbl_addempKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_addempmenuLayout = new javax.swing.GroupLayout(panel_addempmenu);
        panel_addempmenu.setLayout(panel_addempmenuLayout);
        panel_addempmenuLayout.setHorizontalGroup(
            panel_addempmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addempmenuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_addemp)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_addempmenuLayout.setVerticalGroup(
            panel_addempmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_addemp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        panel_editempmenu.setkBorderRadius(20);
        panel_editempmenu.setkEndColor(new java.awt.Color(68, 82, 121));
        panel_editempmenu.setkStartColor(new java.awt.Color(68, 82, 121));
        panel_editempmenu.setOpaque(false);

        lbl_editemp.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        lbl_editemp.setForeground(new java.awt.Color(228, 235, 246));
        lbl_editemp.setText("EDIT EMPLOYEE");
        lbl_editemp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_editemp.setNextFocusableComponent(lbl_empdet);
        lbl_editemp.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                lbl_editempFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                lbl_editempFocusLost(evt);
            }
        });
        lbl_editemp.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbl_editempMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_editempMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_editempMouseExited(evt);
            }
        });
        lbl_editemp.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                lbl_editempKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_editempmenuLayout = new javax.swing.GroupLayout(panel_editempmenu);
        panel_editempmenu.setLayout(panel_editempmenuLayout);
        panel_editempmenuLayout.setHorizontalGroup(
            panel_editempmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editempmenuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_editemp)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_editempmenuLayout.setVerticalGroup(
            panel_editempmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_editemp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_empdetmenu.setkBorderRadius(20);
        panel_empdetmenu.setkEndColor(new java.awt.Color(68, 82, 121));
        panel_empdetmenu.setkStartColor(new java.awt.Color(68, 82, 121));
        panel_empdetmenu.setOpaque(false);

        lbl_empdet.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        lbl_empdet.setForeground(new java.awt.Color(228, 235, 246));
        lbl_empdet.setText("EMPLOYEE DETAIL");
        lbl_empdet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_empdet.setNextFocusableComponent(lbl_addemp);
        lbl_empdet.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                lbl_empdetFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                lbl_empdetFocusLost(evt);
            }
        });
        lbl_empdet.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbl_empdetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_empdetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_empdetMouseExited(evt);
            }
        });
        lbl_empdet.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                lbl_empdetKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_empdetmenuLayout = new javax.swing.GroupLayout(panel_empdetmenu);
        panel_empdetmenu.setLayout(panel_empdetmenuLayout);
        panel_empdetmenuLayout.setHorizontalGroup(
            panel_empdetmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_empdetmenuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_empdet)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_empdetmenuLayout.setVerticalGroup(
            panel_empdetmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_empdet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_empmenuLayout = new javax.swing.GroupLayout(panel_empmenu);
        panel_empmenu.setLayout(panel_empmenuLayout);
        panel_empmenuLayout.setHorizontalGroup(
            panel_empmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_empmenuLayout.createSequentialGroup()
                .addComponent(panel_addempmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_editempmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_empdetmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_empmenuLayout.setVerticalGroup(
            panel_empmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_addempmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_editempmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_empdetmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_employeeLayout = new javax.swing.GroupLayout(panel_employee);
        panel_employee.setLayout(panel_employeeLayout);
        panel_employeeLayout.setHorizontalGroup(
            panel_employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_empmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_empmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_employeeLayout.setVerticalGroup(
            panel_employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_employeeLayout.createSequentialGroup()
                .addComponent(panel_empmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(panel_empmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_product.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_product.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_product.setPreferredSize(new java.awt.Dimension(1061, 710));

        panel_promain.setkBorderRadius(40);
        panel_promain.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_promain.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_promain.setOpaque(false);

        panel_addpro.setkBorderRadius(40);
        panel_addpro.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_addpro.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_addpro.setOpaque(false);

        lbl_add_empimg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add_empimg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/man.png"))); // NOI18N

        lbl_add_proaddimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add_proaddimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add-user.png"))); // NOI18N
        lbl_add_proaddimg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_add_proaddimg.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_add_proaddimgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_add_proaddimgMouseExited(evt);
            }
        });

        lbl_add_prormimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add_prormimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/substract.png"))); // NOI18N
        lbl_add_prormimg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_add_prormimg.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_add_prormimgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_add_prormimgMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ALTERNATIVES");
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));

        jList1.setBackground(new java.awt.Color(228, 235, 246));
        jList1.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setNextFocusableComponent(loginBtn6);
        jScrollPane6.setViewportView(jList1);

        loginBtn6.setBorder(null);
        loginBtn6.setText("ADD CUSTOMER");
        loginBtn6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn6.setkBorderRadius(30);
        loginBtn6.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn6.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        loginBtn6.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn6.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        loginBtn6.setkStartColor(new java.awt.Color(68, 82, 121));
        loginBtn6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                loginBtn6ActionPerformed(evt);
            }
        });

        txt_add_pro_id.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_pro_id.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_pro_id.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_pro_id.setLabelText("PRODUCT ID");
        txt_add_pro_id.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id.setSelectionColor(new java.awt.Color(68, 82, 121));

        txt_add_pro_id1.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_pro_id1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_pro_id1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_pro_id1.setLabelText("COST PRICE");
        txt_add_pro_id1.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id1.setSelectionColor(new java.awt.Color(68, 82, 121));

        txt_add_pro_id2.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_pro_id2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_pro_id2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_pro_id2.setLabelText("COST PRICE");
        txt_add_pro_id2.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id2.setSelectionColor(new java.awt.Color(68, 82, 121));

        combo_add_pro_model.setBackground(new java.awt.Color(228, 235, 246));
        combo_add_pro_model.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "model", "hello ", "how", "are", "you", " " }));
        combo_add_pro_model.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        combo_add_pro_ctgry.setBackground(new java.awt.Color(228, 235, 246));
        combo_add_pro_ctgry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "category", "hello ", "how", "are", "you", " " }));
        combo_add_pro_ctgry.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        combo_add_pro_brand.setBackground(new java.awt.Color(228, 235, 246));
        combo_add_pro_brand.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "brand", "hello ", "how", "are", "you", " " }));
        combo_add_pro_brand.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        txt_add_pro_qty.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_pro_qty.setLabelText("QTY");

        textAreaScroll2.setBackground(new java.awt.Color(228, 235, 246));
        textAreaScroll2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textAreaScroll2.setLabelText("DESCRIPTION");

        textArea2.setBackground(new java.awt.Color(228, 235, 246));
        textArea2.setColumns(20);
        textArea2.setRows(5);
        textArea2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        textAreaScroll2.setViewportView(textArea2);

        javax.swing.GroupLayout panel_addproLayout = new javax.swing.GroupLayout(panel_addpro);
        panel_addpro.setLayout(panel_addproLayout);
        panel_addproLayout.setHorizontalGroup(
            panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addproLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_addproLayout.createSequentialGroup()
                        .addGroup(panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAreaScroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_addproLayout.createSequentialGroup()
                        .addGroup(panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_addproLayout.createSequentialGroup()
                                .addComponent(combo_add_pro_brand, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_add_pro_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel_addproLayout.createSequentialGroup()
                                    .addComponent(txt_add_pro_id, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(52, 52, 52)
                                    .addComponent(lbl_add_empimg1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_add_proaddimg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_add_prormimg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panel_addproLayout.createSequentialGroup()
                                    .addComponent(txt_add_pro_id2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(combo_add_pro_model, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_addproLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_add_pro_id1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combo_add_pro_ctgry, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                            .addGroup(panel_addproLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        panel_addproLayout.setVerticalGroup(
            panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addproLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panel_addproLayout.createSequentialGroup()
                        .addGroup(panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_add_empimg1)
                            .addGroup(panel_addproLayout.createSequentialGroup()
                                .addGroup(panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_addproLayout.createSequentialGroup()
                                        .addComponent(lbl_add_prormimg, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addproLayout.createSequentialGroup()
                                        .addComponent(txt_add_pro_id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)))
                                .addComponent(lbl_add_proaddimg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68))
                    .addGroup(panel_addproLayout.createSequentialGroup()
                        .addComponent(txt_add_pro_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_add_pro_id2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_add_pro_model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_add_pro_ctgry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60)
                .addGroup(panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(combo_add_pro_brand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                    .addComponent(txt_add_pro_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(textAreaScroll2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(loginBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        panel_addpro_mcb.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_addpro_mcb.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_addpro_mcb.setOpaque(false);

        kGradientPanel4.setkBorderRadius(40);
        kGradientPanel4.setkEndColor(new java.awt.Color(185, 207, 255));
        kGradientPanel4.setkStartColor(new java.awt.Color(185, 207, 255));
        kGradientPanel4.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(68, 82, 121));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ADD CATEGORY");
        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));

        txt_add_promcb_brand_id.setBackground(new java.awt.Color(185, 207, 255));
        txt_add_promcb_brand_id.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_promcb_brand_id.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_promcb_brand_id.setLabelText("BRAND ID");
        txt_add_promcb_brand_id.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_brand_id.setName(""); // NOI18N
        txt_add_promcb_brand_id.setSelectionColor(new java.awt.Color(68, 82, 121));

        txt_add_promcb_brand_nm.setBackground(new java.awt.Color(185, 207, 255));
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
        loginBtn10.setText("ADD");
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

        txt_add_promcb_ctrgy_id1.setBackground(new java.awt.Color(185, 207, 255));
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

        txt_add_promcb_ctrgy_id.setBackground(new java.awt.Color(185, 207, 255));
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
        loginBtn12.setText("ADD");
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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(68, 82, 121));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ADD BRAND");
        jLabel9.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(68, 82, 121));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ADD CATEGORY");
        jLabel8.setBorder(new javax.swing.border.MatteBorder(null));

        txt_add_promcb_model_id1.setBackground(new java.awt.Color(185, 207, 255));
        txt_add_promcb_model_id1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_promcb_model_id1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_promcb_model_id1.setLabelText("MODEL ID");
        txt_add_promcb_model_id1.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_model_id1.setSelectionColor(new java.awt.Color(68, 82, 121));

        txt_add_promcb_model_nm1.setBackground(new java.awt.Color(185, 207, 255));
        txt_add_promcb_model_nm1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_promcb_model_nm1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_promcb_model_nm1.setLabelText("MODEL NAME");
        txt_add_promcb_model_nm1.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_model_nm1.setSelectionColor(new java.awt.Color(68, 82, 121));

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(txt_add_promcb_brand_id, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_add_promcb_brand_nm, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(loginBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_add_promcb_model_id1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                .addComponent(txt_add_promcb_ctrgy_id1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_add_promcb_ctrgy_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_add_promcb_model_nm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(loginBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(loginBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_add_promcb_brand_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_promcb_brand_nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(loginBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_add_promcb_ctrgy_id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_promcb_ctrgy_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jLabel8)
                .addGap(30, 30, 30)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_add_promcb_model_id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_promcb_model_nm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_addpro_mcbLayout = new javax.swing.GroupLayout(panel_addpro_mcb);
        panel_addpro_mcb.setLayout(panel_addpro_mcbLayout);
        panel_addpro_mcbLayout.setHorizontalGroup(
            panel_addpro_mcbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addpro_mcbLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_addpro_mcbLayout.setVerticalGroup(
            panel_addpro_mcbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addpro_mcbLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        panel_editpro.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_editpro.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_editpro.setOpaque(false);

        javax.swing.GroupLayout panel_editproLayout = new javax.swing.GroupLayout(panel_editpro);
        panel_editpro.setLayout(panel_editproLayout);
        panel_editproLayout.setHorizontalGroup(
            panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1011, Short.MAX_VALUE)
        );
        panel_editproLayout.setVerticalGroup(
            panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        panel_prodet.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_prodet.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_prodet.setOpaque(false);

        javax.swing.GroupLayout panel_prodetLayout = new javax.swing.GroupLayout(panel_prodet);
        panel_prodet.setLayout(panel_prodetLayout);
        panel_prodetLayout.setHorizontalGroup(
            panel_prodetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 961, Short.MAX_VALUE)
        );
        panel_prodetLayout.setVerticalGroup(
            panel_prodetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        panel_pro_fulldet.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_pro_fulldet.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_pro_fulldet.setOpaque(false);

        javax.swing.GroupLayout panel_pro_fulldetLayout = new javax.swing.GroupLayout(panel_pro_fulldet);
        panel_pro_fulldet.setLayout(panel_pro_fulldetLayout);
        panel_pro_fulldetLayout.setHorizontalGroup(
            panel_pro_fulldetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1011, Short.MAX_VALUE)
        );
        panel_pro_fulldetLayout.setVerticalGroup(
            panel_pro_fulldetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_promainLayout = new javax.swing.GroupLayout(panel_promain);
        panel_promain.setLayout(panel_promainLayout);
        panel_promainLayout.setHorizontalGroup(
            panel_promainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
            .addGroup(panel_promainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_promainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_editpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
            .addGroup(panel_promainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_promainLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(panel_prodet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(50, 50, 50)))
            .addGroup(panel_promainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_promainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_pro_fulldet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
            .addGroup(panel_promainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_promainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_addpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
            .addGroup(panel_promainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_promainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_addpro_mcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );
        panel_promainLayout.setVerticalGroup(
            panel_promainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(panel_promainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_promainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_editpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
            .addGroup(panel_promainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_promainLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(panel_prodet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(50, 50, 50)))
            .addGroup(panel_promainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_promainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_pro_fulldet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
            .addGroup(panel_promainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_promainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_addpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
            .addGroup(panel_promainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_promainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_addpro_mcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        panel_promenu.setkBorderRadius(40);
        panel_promenu.setkEndColor(new java.awt.Color(68, 82, 121));
        panel_promenu.setkStartColor(new java.awt.Color(68, 82, 121));
        panel_promenu.setOpaque(false);

        panel_addpromenu.setkBorderRadius(40);
        panel_addpromenu.setkEndColor(new java.awt.Color(68, 82, 121));
        panel_addpromenu.setkStartColor(new java.awt.Color(68, 82, 121));
        panel_addpromenu.setOpaque(false);

        lbl_addpro.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        lbl_addpro.setForeground(new java.awt.Color(228, 235, 246));
        lbl_addpro.setText("ADD PRODUCT");
        lbl_addpro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_addpro.setNextFocusableComponent(lbl_add_prombc);
        lbl_addpro.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                lbl_addproFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                lbl_addproFocusLost(evt);
            }
        });
        lbl_addpro.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbl_addproMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_addproMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_addproMouseExited(evt);
            }
        });
        lbl_addpro.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                lbl_addproKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_addpromenuLayout = new javax.swing.GroupLayout(panel_addpromenu);
        panel_addpromenu.setLayout(panel_addpromenuLayout);
        panel_addpromenuLayout.setHorizontalGroup(
            panel_addpromenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addpromenuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_addpro)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_addpromenuLayout.setVerticalGroup(
            panel_addpromenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_addpro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        panel_addmoedelmenu.setkBorderRadius(20);
        panel_addmoedelmenu.setkEndColor(new java.awt.Color(68, 82, 121));
        panel_addmoedelmenu.setkStartColor(new java.awt.Color(68, 82, 121));
        panel_addmoedelmenu.setOpaque(false);

        lbl_add_prombc.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        lbl_add_prombc.setForeground(new java.awt.Color(228, 235, 246));
        lbl_add_prombc.setText("ADD MODEl");
        lbl_add_prombc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_add_prombc.setNextFocusableComponent(lbl_editpro);
        lbl_add_prombc.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                lbl_add_prombcFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                lbl_add_prombcFocusLost(evt);
            }
        });
        lbl_add_prombc.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbl_add_prombcMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_add_prombcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_add_prombcMouseExited(evt);
            }
        });
        lbl_add_prombc.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                lbl_add_prombcKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_addmoedelmenuLayout = new javax.swing.GroupLayout(panel_addmoedelmenu);
        panel_addmoedelmenu.setLayout(panel_addmoedelmenuLayout);
        panel_addmoedelmenuLayout.setHorizontalGroup(
            panel_addmoedelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addmoedelmenuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_add_prombc)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_addmoedelmenuLayout.setVerticalGroup(
            panel_addmoedelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_add_prombc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_proeditmenu.setkBorderRadius(20);
        panel_proeditmenu.setkEndColor(new java.awt.Color(68, 82, 121));
        panel_proeditmenu.setkStartColor(new java.awt.Color(68, 82, 121));
        panel_proeditmenu.setOpaque(false);

        lbl_editpro.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        lbl_editpro.setForeground(new java.awt.Color(228, 235, 246));
        lbl_editpro.setText("EDIT PRODUCT");
        lbl_editpro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_editpro.setNextFocusableComponent(lbl_prodet);
        lbl_editpro.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                lbl_editproFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                lbl_editproFocusLost(evt);
            }
        });
        lbl_editpro.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbl_editproMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_editproMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_editproMouseExited(evt);
            }
        });
        lbl_editpro.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                lbl_editproKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_proeditmenuLayout = new javax.swing.GroupLayout(panel_proeditmenu);
        panel_proeditmenu.setLayout(panel_proeditmenuLayout);
        panel_proeditmenuLayout.setHorizontalGroup(
            panel_proeditmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_proeditmenuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_editpro)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_proeditmenuLayout.setVerticalGroup(
            panel_proeditmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_editpro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_prodetmenu.setkBorderRadius(20);
        panel_prodetmenu.setkEndColor(new java.awt.Color(68, 82, 121));
        panel_prodetmenu.setkStartColor(new java.awt.Color(68, 82, 121));
        panel_prodetmenu.setOpaque(false);

        lbl_prodet.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        lbl_prodet.setForeground(new java.awt.Color(228, 235, 246));
        lbl_prodet.setText("PRODUCT DETAIL");
        lbl_prodet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_prodet.setNextFocusableComponent(lbl_addpro);
        lbl_prodet.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                lbl_prodetFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                lbl_prodetFocusLost(evt);
            }
        });
        lbl_prodet.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbl_prodetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_prodetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_prodetMouseExited(evt);
            }
        });
        lbl_prodet.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                lbl_prodetKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_prodetmenuLayout = new javax.swing.GroupLayout(panel_prodetmenu);
        panel_prodetmenu.setLayout(panel_prodetmenuLayout);
        panel_prodetmenuLayout.setHorizontalGroup(
            panel_prodetmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_prodetmenuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_prodet)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_prodetmenuLayout.setVerticalGroup(
            panel_prodetmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_prodet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_promenuLayout = new javax.swing.GroupLayout(panel_promenu);
        panel_promenu.setLayout(panel_promenuLayout);
        panel_promenuLayout.setHorizontalGroup(
            panel_promenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_promenuLayout.createSequentialGroup()
                .addComponent(panel_addpromenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_addmoedelmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_proeditmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_prodetmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 205, Short.MAX_VALUE))
        );
        panel_promenuLayout.setVerticalGroup(
            panel_promenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_addpromenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_addmoedelmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_proeditmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_prodetmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_productLayout = new javax.swing.GroupLayout(panel_product);
        panel_product.setLayout(panel_productLayout);
        panel_productLayout.setHorizontalGroup(
            panel_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_promain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_promenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_productLayout.setVerticalGroup(
            panel_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_productLayout.createSequentialGroup()
                .addComponent(panel_promenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(panel_promain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        panel_user.setPreferredSize(new java.awt.Dimension(1061, 710));

        javax.swing.GroupLayout panel_userLayout = new javax.swing.GroupLayout(panel_user);
        panel_user.setLayout(panel_userLayout);
        panel_userLayout.setHorizontalGroup(
            panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        panel_userLayout.setVerticalGroup(
            panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addComponent(panel_user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_bill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_account, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(panel_user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_product, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_bill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_account, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_sidepane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
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
        HoverColor(pnl_close, new Color(255, 0, 0), Color.BLACK);
    }//GEN-LAST:event_pnl_closeMouseEntered

    private void pnl_closeMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnl_closeMouseClicked
    {//GEN-HEADEREND:event_pnl_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_pnl_closeMouseClicked

    private void pnl_closeMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnl_closeMouseExited
    {//GEN-HEADEREND:event_pnl_closeMouseExited
        HoverColor(pnl_close, new Color(68, 82, 121), Color.WHITE);
    }//GEN-LAST:event_pnl_closeMouseExited

    private void lbl_userKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_lbl_userKeyPressed
    {//GEN-HEADEREND:event_lbl_userKeyPressed
        visibility(evt.getKeyCode(), lbl_user, false, false, false, false, false, true, false);
    }//GEN-LAST:event_lbl_userKeyPressed

    private void lbl_userMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_userMouseExited
    {//GEN-HEADEREND:event_lbl_userMouseExited
        hoverColor(pnl_user, lbl_user, new Color(228, 235, 246), Color.BLACK, new Color(68, 82, 121), new Font("Cascadia Monocai", Font.PLAIN, 24), "USER MANUAL");
    }//GEN-LAST:event_lbl_userMouseExited

    private void lbl_userMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_userMouseEntered
    {//GEN-HEADEREND:event_lbl_userMouseEntered
        hoverColor(pnl_user, lbl_user, new Color(68, 82, 121), Color.red, Color.WHITE, new Font("Cascadia Monocai", Font.PLAIN, 24), "<html><u>USER MANUAL</u></html>");
    }//GEN-LAST:event_lbl_userMouseEntered

    private void lbl_userMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_userMouseClicked
    {//GEN-HEADEREND:event_lbl_userMouseClicked
        visibility(lbl_user, false, false, false, false, false, true, false);
        HoverColor(pnl_user, lbl_user, Color.WHITE, Color.WHITE, Color.BLACK);
    }//GEN-LAST:event_lbl_userMouseClicked

    private void lbl_userFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_userFocusLost
    {//GEN-HEADEREND:event_lbl_userFocusLost
        hoverColor(pnl_user, lbl_user, new Color(228, 235, 246), Color.BLACK, new Color(68, 82, 121), new Font("Cascadia Monocai", Font.PLAIN, 24), "USER MANUAL");
    }//GEN-LAST:event_lbl_userFocusLost

    private void lbl_userFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_userFocusGained
    {//GEN-HEADEREND:event_lbl_userFocusGained
        hoverColor(pnl_user, lbl_user, new Color(68, 82, 121), Color.red, Color.WHITE, new Font("Cascadia Monocai", Font.PLAIN, 24), "<html><u>USER MANUAL</u></html>");
    }//GEN-LAST:event_lbl_userFocusGained

    private void lbl_accountKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_lbl_accountKeyPressed
    {//GEN-HEADEREND:event_lbl_accountKeyPressed
        visibility(evt.getKeyCode(), lbl_account, false, false, false, false, true, false, false);
    }//GEN-LAST:event_lbl_accountKeyPressed

    private void lbl_accountMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_accountMouseExited
    {//GEN-HEADEREND:event_lbl_accountMouseExited
        hoverColor(pnl_account, lbl_account, new Color(228, 235, 246), Color.BLACK, new Color(68, 82, 121), new Font("Cascadia Monocai", Font.PLAIN, 24), "ACCOUNT MANAGEMENT");
    }//GEN-LAST:event_lbl_accountMouseExited

    private void lbl_accountMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_accountMouseEntered
    {//GEN-HEADEREND:event_lbl_accountMouseEntered
        hoverColor(pnl_account, lbl_account, new Color(68, 82, 121), Color.red, Color.WHITE, new Font("Cascadia Monocai", Font.PLAIN, 24), "<html><u>ACCOUNT MANAGEMENT</u></html>");
    }//GEN-LAST:event_lbl_accountMouseEntered

    private void lbl_accountMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_accountMouseClicked
    {//GEN-HEADEREND:event_lbl_accountMouseClicked
        visibility(lbl_account, false, false, false, false, true, false, false);
        HoverColor(pnl_account, lbl_account, Color.WHITE, Color.WHITE, Color.BLACK);
    }//GEN-LAST:event_lbl_accountMouseClicked

    private void lbl_accountFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_accountFocusLost
    {//GEN-HEADEREND:event_lbl_accountFocusLost
        hoverColor(pnl_account, lbl_account, new Color(228, 235, 246), Color.BLACK, new Color(68, 82, 121), new Font("Cascadia Monocai", Font.PLAIN, 24), "ACCOUNT MANAGEMENT");
    }//GEN-LAST:event_lbl_accountFocusLost

    private void lbl_accountFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_accountFocusGained
    {//GEN-HEADEREND:event_lbl_accountFocusGained
        hoverColor(pnl_account, lbl_account, new Color(68, 82, 121), Color.red, Color.WHITE, new Font("Cascadia Monocai", Font.PLAIN, 24), "<html><u>ACCOUNT MANAGEMENT</u></html>");
    }//GEN-LAST:event_lbl_accountFocusGained

    private void lbl_billKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_lbl_billKeyPressed
    {//GEN-HEADEREND:event_lbl_billKeyPressed
        visibility(evt.getKeyCode(), lbl_bill, false, false, false, true, false, false, false);
    }//GEN-LAST:event_lbl_billKeyPressed

    private void lbl_billMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_billMouseExited
    {//GEN-HEADEREND:event_lbl_billMouseExited
        hoverColor(pnl_bill, lbl_bill, new Color(228, 235, 246), Color.BLACK, new Color(68, 82, 121), new Font("Cascadia Monocai", Font.PLAIN, 24), "BILL MANAGEMENT");
    }//GEN-LAST:event_lbl_billMouseExited

    private void lbl_billMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_billMouseEntered
    {//GEN-HEADEREND:event_lbl_billMouseEntered
        hoverColor(pnl_bill, lbl_bill, new Color(68, 82, 121), Color.red, Color.WHITE, new Font("Cascadia Monocai", Font.PLAIN, 24), "<html><u>BILL MANAGEMENT</u></html>");
    }//GEN-LAST:event_lbl_billMouseEntered

    private void lbl_billMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_billMouseClicked
    {//GEN-HEADEREND:event_lbl_billMouseClicked
        visibility(lbl_bill, false, false, false, true, false, false, false);
        HoverColor(pnl_bill, lbl_bill, Color.WHITE, Color.WHITE, Color.BLACK);
    }//GEN-LAST:event_lbl_billMouseClicked

    private void lbl_billFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_billFocusLost
    {//GEN-HEADEREND:event_lbl_billFocusLost
        hoverColor(pnl_bill, lbl_bill, new Color(228, 235, 246), Color.BLACK, new Color(68, 82, 121), new Font("Cascadia Monocai", Font.PLAIN, 24), "BILL MANAGEMENT");
    }//GEN-LAST:event_lbl_billFocusLost

    private void lbl_billFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_billFocusGained
    {//GEN-HEADEREND:event_lbl_billFocusGained
        hoverColor(pnl_bill, lbl_bill, new Color(68, 82, 121), Color.red, Color.WHITE, new Font("Cascadia Monocai", Font.PLAIN, 24), "<html><u>BILL MANAGEMENT</u></html>");
    }//GEN-LAST:event_lbl_billFocusGained

    private void lbl_productKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_lbl_productKeyPressed
    {//GEN-HEADEREND:event_lbl_productKeyPressed
        visibility(evt.getKeyCode(), lbl_addpro, false, false, true, false, false, false, false);
        visibility(panel_addpro, true, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, false);
    }//GEN-LAST:event_lbl_productKeyPressed

    private void lbl_productMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_productMouseExited
    {//GEN-HEADEREND:event_lbl_productMouseExited
        hoverColor(pnl_product, lbl_product, new Color(228, 235, 246), Color.BLACK, new Color(68, 82, 121), new Font("Cascadia Monocai", Font.PLAIN, 24), "PRODUCT MANAGEMENT");
    }//GEN-LAST:event_lbl_productMouseExited

    private void lbl_productMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_productMouseEntered
    {//GEN-HEADEREND:event_lbl_productMouseEntered
        hoverColor(pnl_product, lbl_product, new Color(68, 82, 121), Color.red, Color.WHITE, new Font("Cascadia Monocai", Font.PLAIN, 24), "<html><u>PRODUCT MANAGEMENT</u></html>");
    }//GEN-LAST:event_lbl_productMouseEntered

    private void lbl_productMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_productMouseClicked
    {//GEN-HEADEREND:event_lbl_productMouseClicked
        visibility(lbl_addpro, false, false, true, false, false, false, false);
        HoverColor(pnl_product, lbl_product, Color.WHITE, Color.WHITE, Color.BLACK);
        visibility(panel_addpro, true, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, false);
    }//GEN-LAST:event_lbl_productMouseClicked

    private void lbl_productFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_productFocusLost
    {//GEN-HEADEREND:event_lbl_productFocusLost
        hoverColor(pnl_product, lbl_product, new Color(228, 235, 246), Color.BLACK, new Color(68, 82, 121), new Font("Cascadia Monocai", Font.PLAIN, 24), "PRODUCT MANAGEMENT");
    }//GEN-LAST:event_lbl_productFocusLost

    private void lbl_productFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_productFocusGained
    {//GEN-HEADEREND:event_lbl_productFocusGained
        hoverColor(pnl_product, lbl_product, new Color(68, 82, 121), Color.red, Color.WHITE, new Font("Cascadia Monocai", Font.PLAIN, 24), "<html><u>PRODUCT MANAGEMENT</u></html>");
    }//GEN-LAST:event_lbl_productFocusGained

    private void lbl_employeeKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_lbl_employeeKeyPressed
    {//GEN-HEADEREND:event_lbl_employeeKeyPressed
        visibility(evt.getKeyCode(), lbl_addemp, false, true, false, false, false, false, false);
        visibility(panel_addemp, true, panel_editemp, false, panel_detemp, false, panel_empextra, false);
    }//GEN-LAST:event_lbl_employeeKeyPressed

    private void lbl_employeeMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_employeeMouseExited
    {//GEN-HEADEREND:event_lbl_employeeMouseExited
        hoverColor(pnl_employee, lbl_employee, new Color(228, 235, 246), Color.BLACK, new Color(68, 82, 121), new Font("Cascadia Monocai", Font.PLAIN, 24), "EMPLOYEE MANAGEMENT");
    }//GEN-LAST:event_lbl_employeeMouseExited

    private void lbl_employeeMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_employeeMouseEntered
    {//GEN-HEADEREND:event_lbl_employeeMouseEntered
        hoverColor(pnl_employee, lbl_employee, new Color(68, 82, 121), Color.red, Color.WHITE, new Font("Cascadia Monocai", Font.PLAIN, 24), "<html><u>EMPLOYEE MANAGEMENT</u></html>");
    }//GEN-LAST:event_lbl_employeeMouseEntered

    private void lbl_employeeMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_employeeMouseClicked
    {//GEN-HEADEREND:event_lbl_employeeMouseClicked
        visibility(lbl_addemp, false, true, false, false, false, false, false);
        HoverColor(pnl_employee, lbl_employee, Color.WHITE, Color.WHITE, Color.BLACK);
        visibility(panel_addemp, true, panel_editemp, false, panel_detemp, false, panel_empextra, false);
    }//GEN-LAST:event_lbl_employeeMouseClicked

    private void lbl_employeeFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_employeeFocusLost
    {//GEN-HEADEREND:event_lbl_employeeFocusLost
        hoverColor(pnl_employee, lbl_employee, new Color(228, 235, 246), Color.BLACK, new Color(68, 82, 121), new Font("Cascadia Monocai", Font.PLAIN, 24), "EMPLOYEE MANAGEMENT");
    }//GEN-LAST:event_lbl_employeeFocusLost

    private void lbl_employeeFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_employeeFocusGained
    {//GEN-HEADEREND:event_lbl_employeeFocusGained
        hoverColor(pnl_employee, lbl_employee, new Color(68, 82, 121), Color.red, Color.WHITE, new Font("Cascadia Monocai", Font.PLAIN, 24), "<html><u>EMPLOYEE MANAGEMENT</u></html>");
    }//GEN-LAST:event_lbl_employeeFocusGained

    private void lbl_customerKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_lbl_customerKeyPressed
    {//GEN-HEADEREND:event_lbl_customerKeyPressed
//        visibility(evt.getKeyCode(), lbl_addcust, true, false, false, false, false, false, false);
        visibility(panel_addcust, true, panel_editcus, false, panel_custdetail, false);
    }//GEN-LAST:event_lbl_customerKeyPressed

    private void lbl_customerMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_customerMouseExited
    {//GEN-HEADEREND:event_lbl_customerMouseExited
        hoverColor(pnl_customer, lbl_customer, new Color(228, 235, 246), Color.BLACK, new Color(68, 82, 121), new Font("Cascadia Monocai", Font.PLAIN, 24), "CUSTOMER MANAGEMENT");
    }//GEN-LAST:event_lbl_customerMouseExited

    private void lbl_customerMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_customerMouseEntered
    {//GEN-HEADEREND:event_lbl_customerMouseEntered
        hoverColor(pnl_customer, lbl_customer, new Color(68, 82, 121), Color.red, Color.WHITE, new Font("Cascadia Monocai", Font.PLAIN, 24), "<html><u>CUSTOMER MANAGEMENT</u></html>");
    }//GEN-LAST:event_lbl_customerMouseEntered

    private void lbl_customerMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_customerMouseClicked
    {//GEN-HEADEREND:event_lbl_customerMouseClicked
        visibility(kButton2, true, false, false, false, false, false, false);
        visibility(panel_addcust, true, panel_editcus, false, panel_custdetail, false);
        HoverColor(pnl_customer, lbl_customer, Color.WHITE, Color.WHITE, Color.BLACK);
    }//GEN-LAST:event_lbl_customerMouseClicked

    private void lbl_customerFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_customerFocusLost
    {//GEN-HEADEREND:event_lbl_customerFocusLost
        hoverColor(pnl_customer, lbl_customer, new Color(228, 235, 246), Color.BLACK, new Color(68, 82, 121), new Font("Cascadia Monocai", Font.PLAIN, 24), "CUSTOMER MANAGEMENT");
    }//GEN-LAST:event_lbl_customerFocusLost

    private void lbl_customerFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_customerFocusGained
    {//GEN-HEADEREND:event_lbl_customerFocusGained
        hoverColor(pnl_customer, lbl_customer, new Color(68, 82, 121), Color.red, Color.WHITE, new Font("Cascadia Monocai", Font.PLAIN, 24), "<html><u>CUSTOMER MANAGEMENT</u></html>");
    }//GEN-LAST:event_lbl_customerFocusGained

    private void loginBtnFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_loginBtnFocusGained
    {//GEN-HEADEREND:event_loginBtnFocusGained
        loginBtn.setkStartColor(new Color(178, 199, 231));
        loginBtn.setkEndColor(new Color(178, 199, 231));
        loginBtn.setkForeGround(new Color(68, 82, 121));
    }//GEN-LAST:event_loginBtnFocusGained

    private void loginBtnFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_loginBtnFocusLost
    {//GEN-HEADEREND:event_loginBtnFocusLost
        loginBtn.setkStartColor(new Color(68, 82, 121));
        loginBtn.setkEndColor(new Color(68, 82, 121));
        loginBtn.setkForeGround(Color.WHITE);
    }//GEN-LAST:event_loginBtnFocusLost

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_loginBtnMouseEntered
    {//GEN-HEADEREND:event_loginBtnMouseEntered
        //        loginBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_loginBtnMouseEntered

    private void loginBtnKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_loginBtnKeyPressed
    {//GEN-HEADEREND:event_loginBtnKeyPressed
        //escape(lbl_addcust, evt.getKeyCode());
    }//GEN-LAST:event_loginBtnKeyPressed

    private void table_custdetKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_table_custdetKeyPressed
    {//GEN-HEADEREND:event_table_custdetKeyPressed
        //  escape(lbl_custdet, evt.getKeyCode());
    }//GEN-LAST:event_table_custdetKeyPressed

    private void lbl_addempFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_addempFocusGained
    {//GEN-HEADEREND:event_lbl_addempFocusGained
        HoverColor(panel_addempmenu, new Color(164, 177, 252), Color.BLACK);
    }//GEN-LAST:event_lbl_addempFocusGained

    private void lbl_addempFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_addempFocusLost
    {//GEN-HEADEREND:event_lbl_addempFocusLost
        HoverColor(panel_addempmenu, new Color(68, 82, 121), Color.WHITE);
    }//GEN-LAST:event_lbl_addempFocusLost

    private void lbl_addempMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_addempMouseEntered
    {//GEN-HEADEREND:event_lbl_addempMouseEntered
        HoverColor(panel_addempmenu, new Color(164, 177, 252), Color.BLACK);
    }//GEN-LAST:event_lbl_addempMouseEntered

    private void lbl_addempMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_addempMouseExited
    {//GEN-HEADEREND:event_lbl_addempMouseExited
        HoverColor(panel_addempmenu, new Color(68, 82, 121), Color.WHITE);
    }//GEN-LAST:event_lbl_addempMouseExited

    private void lbl_addempKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_lbl_addempKeyPressed
    {//GEN-HEADEREND:event_lbl_addempKeyPressed
        visibility(txt_add_empid, panel_addemp, true, panel_editemp, false, panel_detemp, false, panel_empextra, false);
        escape(lbl_employee, evt.getKeyCode(), panel_employee);
    }//GEN-LAST:event_lbl_addempKeyPressed

    private void lbl_editempFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_editempFocusGained
    {//GEN-HEADEREND:event_lbl_editempFocusGained
        HoverColor(panel_editempmenu, new Color(164, 177, 252), Color.BLACK);
    }//GEN-LAST:event_lbl_editempFocusGained

    private void lbl_editempFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_editempFocusLost
    {//GEN-HEADEREND:event_lbl_editempFocusLost
        HoverColor(panel_editempmenu, new Color(68, 82, 121), Color.WHITE);
    }//GEN-LAST:event_lbl_editempFocusLost

    private void lbl_editempMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_editempMouseClicked
    {//GEN-HEADEREND:event_lbl_editempMouseClicked
        visibility(txt_add_empid, panel_addemp, false, panel_editemp, true, panel_detemp, false);
    }//GEN-LAST:event_lbl_editempMouseClicked

    private void lbl_editempMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_editempMouseEntered
    {//GEN-HEADEREND:event_lbl_editempMouseEntered
        HoverColor(panel_editempmenu, new Color(164, 177, 252), Color.BLACK);
    }//GEN-LAST:event_lbl_editempMouseEntered

    private void lbl_editempMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_editempMouseExited
    {//GEN-HEADEREND:event_lbl_editempMouseExited
        HoverColor(panel_editempmenu, new Color(68, 82, 121), Color.WHITE);
    }//GEN-LAST:event_lbl_editempMouseExited

    private void lbl_editempKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_lbl_editempKeyPressed
    {//GEN-HEADEREND:event_lbl_editempKeyPressed
        visibility(evt.getKeyCode(), txt_add_empid, panel_addemp, false, panel_editemp, true, panel_empextra, false);
        escape(lbl_employee, evt.getKeyCode(), panel_employee);
    }//GEN-LAST:event_lbl_editempKeyPressed

    private void lbl_empdetFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_empdetFocusGained
    {//GEN-HEADEREND:event_lbl_empdetFocusGained
        HoverColor(panel_empdetmenu, new Color(164, 177, 252), Color.BLACK);
    }//GEN-LAST:event_lbl_empdetFocusGained

    private void lbl_empdetFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_empdetFocusLost
    {//GEN-HEADEREND:event_lbl_empdetFocusLost
        HoverColor(panel_empdetmenu, new Color(68, 82, 121), Color.WHITE);
    }//GEN-LAST:event_lbl_empdetFocusLost

    private void lbl_empdetMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_empdetMouseClicked
    {//GEN-HEADEREND:event_lbl_empdetMouseClicked
        visibility(txt_add_empid, panel_addemp, false, panel_editemp, false, panel_detemp, true, panel_empextra, false);
    }//GEN-LAST:event_lbl_empdetMouseClicked

    private void lbl_empdetMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_empdetMouseEntered
    {//GEN-HEADEREND:event_lbl_empdetMouseEntered
        HoverColor(panel_empdetmenu, new Color(164, 177, 252), Color.BLACK);
    }//GEN-LAST:event_lbl_empdetMouseEntered

    private void lbl_empdetMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_empdetMouseExited
    {//GEN-HEADEREND:event_lbl_empdetMouseExited
        HoverColor(panel_empdetmenu, new Color(68, 82, 121), Color.WHITE);
    }//GEN-LAST:event_lbl_empdetMouseExited

    private void lbl_empdetKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_lbl_empdetKeyPressed
    {//GEN-HEADEREND:event_lbl_empdetKeyPressed
        visibility(evt.getKeyCode(), txt_det_empid, panel_addemp, false, panel_editemp, false, panel_detemp, true, panel_empextra, false);
        escape(lbl_employee, evt.getKeyCode(), panel_employee);
    }//GEN-LAST:event_lbl_empdetKeyPressed

    private void lbl_addempMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_addempMouseClicked
    {//GEN-HEADEREND:event_lbl_addempMouseClicked
        visibility(txt_det_empid, panel_addemp, true, panel_editemp, false, panel_detemp, false, panel_empextra, false);
    }//GEN-LAST:event_lbl_addempMouseClicked

    private void lbl_add_emprmimgMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_emprmimgMouseEntered
    {//GEN-HEADEREND:event_lbl_add_emprmimgMouseEntered
        lbl_add_emprmimg.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_lbl_add_emprmimgMouseEntered

    private void lbl_add_emprmimgMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_emprmimgMouseExited
    {//GEN-HEADEREND:event_lbl_add_emprmimgMouseExited
        lbl_add_emprmimg.setBorder(null);
    }//GEN-LAST:event_lbl_add_emprmimgMouseExited

    private void lbl_add_empaddimgMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_empaddimgMouseEntered
    {//GEN-HEADEREND:event_lbl_add_empaddimgMouseEntered
        lbl_add_empaddimg.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_lbl_add_empaddimgMouseEntered

    private void lbl_add_empaddimgMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_empaddimgMouseExited
    {//GEN-HEADEREND:event_lbl_add_empaddimgMouseExited
        lbl_add_empaddimg.setBorder(null);
    }//GEN-LAST:event_lbl_add_empaddimgMouseExited

    private void table_empdetKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_table_empdetKeyPressed
    {//GEN-HEADEREND:event_table_empdetKeyPressed
        escape(lbl_empdet, evt.getKeyCode());
    }//GEN-LAST:event_table_empdetKeyPressed

    private void lbl_add_emprmimg1MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_emprmimg1MouseEntered
    {//GEN-HEADEREND:event_lbl_add_emprmimg1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_add_emprmimg1MouseEntered

    private void lbl_add_emprmimg1MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_emprmimg1MouseExited
    {//GEN-HEADEREND:event_lbl_add_emprmimg1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_add_emprmimg1MouseExited

    private void lbl_add_empaddimg1MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_empaddimg1MouseEntered
    {//GEN-HEADEREND:event_lbl_add_empaddimg1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_add_empaddimg1MouseEntered

    private void lbl_add_empaddimg1MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_empaddimg1MouseExited
    {//GEN-HEADEREND:event_lbl_add_empaddimg1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_add_empaddimg1MouseExited

    private void pnl_productMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnl_productMouseClicked
    {//GEN-HEADEREND:event_pnl_productMouseClicked
        visibility(lbl_addpro, false, false, true, false, false, false, false);
        HoverColor(pnl_product, lbl_product, Color.WHITE, Color.WHITE, Color.BLACK);
        // visibility(panel_addpro, true, panel, false, panel_detemp, false, panel_empextra, false);
        panel_addpro.setVisible(true);
    }//GEN-LAST:event_pnl_productMouseClicked

    private void lbl_add_proaddimgMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_proaddimgMouseEntered
    {//GEN-HEADEREND:event_lbl_add_proaddimgMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_add_proaddimgMouseEntered

    private void lbl_add_proaddimgMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_proaddimgMouseExited
    {//GEN-HEADEREND:event_lbl_add_proaddimgMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_add_proaddimgMouseExited

    private void lbl_add_prormimgMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_prormimgMouseEntered
    {//GEN-HEADEREND:event_lbl_add_prormimgMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_add_prormimgMouseEntered

    private void lbl_add_prormimgMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_prormimgMouseExited
    {//GEN-HEADEREND:event_lbl_add_prormimgMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_add_prormimgMouseExited

    private void loginBtn6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_loginBtn6ActionPerformed
    {//GEN-HEADEREND:event_loginBtn6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtn6ActionPerformed

    private void lbl_addproFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_addproFocusGained
    {//GEN-HEADEREND:event_lbl_addproFocusGained
        HoverColor(panel_addpromenu, new Color(164, 177, 252), Color.BLACK);
    }//GEN-LAST:event_lbl_addproFocusGained

    private void lbl_addproFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_addproFocusLost
    {//GEN-HEADEREND:event_lbl_addproFocusLost
        HoverColor(panel_addpromenu, new Color(68, 82, 121), Color.WHITE);
    }//GEN-LAST:event_lbl_addproFocusLost

    private void lbl_addproMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_addproMouseClicked
    {//GEN-HEADEREND:event_lbl_addproMouseClicked
        visibility(txt_add_pro_id, panel_addpro, true, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, false);
    }//GEN-LAST:event_lbl_addproMouseClicked

    private void lbl_addproMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_addproMouseEntered
    {//GEN-HEADEREND:event_lbl_addproMouseEntered
        HoverColor(panel_addpromenu, new Color(164, 177, 252), Color.BLACK);
    }//GEN-LAST:event_lbl_addproMouseEntered

    private void lbl_addproMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_addproMouseExited
    {//GEN-HEADEREND:event_lbl_addproMouseExited
        HoverColor(panel_addpromenu, new Color(68, 82, 121), Color.WHITE);
    }//GEN-LAST:event_lbl_addproMouseExited

    private void lbl_addproKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_lbl_addproKeyPressed
    {//GEN-HEADEREND:event_lbl_addproKeyPressed
        visibility(txt_add_pro_id, panel_addpro, true, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, false);
        escape(lbl_product, evt.getKeyCode(), panel_product);
    }//GEN-LAST:event_lbl_addproKeyPressed

    private void lbl_add_prombcFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_add_prombcFocusGained
    {//GEN-HEADEREND:event_lbl_add_prombcFocusGained
        HoverColor(panel_addmoedelmenu, new Color(164, 177, 252), Color.BLACK);
    }//GEN-LAST:event_lbl_add_prombcFocusGained

    private void lbl_add_prombcFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_add_prombcFocusLost
    {//GEN-HEADEREND:event_lbl_add_prombcFocusLost
        HoverColor(panel_addmoedelmenu, new Color(68, 82, 121), Color.WHITE);
    }//GEN-LAST:event_lbl_add_prombcFocusLost

    private void lbl_add_prombcMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_prombcMouseClicked
    {//GEN-HEADEREND:event_lbl_add_prombcMouseClicked
        visibility(txt_add_pro_id, panel_addpro, false, panel_addpro_mcb, true, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, false);
    }//GEN-LAST:event_lbl_add_prombcMouseClicked

    private void lbl_add_prombcMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_prombcMouseEntered
    {//GEN-HEADEREND:event_lbl_add_prombcMouseEntered
        HoverColor(panel_addmoedelmenu, new Color(164, 177, 252), Color.BLACK);
    }//GEN-LAST:event_lbl_add_prombcMouseEntered

    private void lbl_add_prombcMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_prombcMouseExited
    {//GEN-HEADEREND:event_lbl_add_prombcMouseExited
        HoverColor(panel_addmoedelmenu, new Color(68, 82, 121), Color.WHITE);
    }//GEN-LAST:event_lbl_add_prombcMouseExited

    private void lbl_add_prombcKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_lbl_add_prombcKeyPressed
    {//GEN-HEADEREND:event_lbl_add_prombcKeyPressed
        visibility(evt.getKeyCode(), txt_add_pro_id, panel_addpro, false, panel_addpro_mcb, true, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, false);
        escape(lbl_product, evt.getKeyCode(), panel_product);
    }//GEN-LAST:event_lbl_add_prombcKeyPressed

    private void lbl_editproFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_editproFocusGained
    {//GEN-HEADEREND:event_lbl_editproFocusGained
        HoverColor(panel_proeditmenu, new Color(164, 177, 252), Color.BLACK);
    }//GEN-LAST:event_lbl_editproFocusGained

    private void lbl_editproFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_editproFocusLost
    {//GEN-HEADEREND:event_lbl_editproFocusLost
        HoverColor(panel_proeditmenu, new Color(68, 82, 121), Color.WHITE);
    }//GEN-LAST:event_lbl_editproFocusLost

    private void lbl_editproMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_editproMouseClicked
    {//GEN-HEADEREND:event_lbl_editproMouseClicked
        visibility(txt_add_pro_id, panel_addpro, false, panel_addpro_mcb, false, panel_editpro, true, panel_prodet, false, panel_pro_fulldet, false);
    }//GEN-LAST:event_lbl_editproMouseClicked

    private void lbl_editproMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_editproMouseEntered
    {//GEN-HEADEREND:event_lbl_editproMouseEntered
        HoverColor(panel_proeditmenu, new Color(164, 177, 252), Color.BLACK);
    }//GEN-LAST:event_lbl_editproMouseEntered

    private void lbl_editproMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_editproMouseExited
    {//GEN-HEADEREND:event_lbl_editproMouseExited
        HoverColor(panel_proeditmenu, new Color(68, 82, 121), Color.WHITE);
    }//GEN-LAST:event_lbl_editproMouseExited

    private void lbl_editproKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_lbl_editproKeyPressed
    {//GEN-HEADEREND:event_lbl_editproKeyPressed
        visibility(evt.getKeyCode(), txt_add_pro_id, panel_addpro, false, panel_addpro_mcb, false, panel_editpro, true, panel_prodet, false, panel_pro_fulldet, false);
        escape(lbl_product, evt.getKeyCode(), panel_product);
    }//GEN-LAST:event_lbl_editproKeyPressed

    private void lbl_prodetFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_prodetFocusGained
    {//GEN-HEADEREND:event_lbl_prodetFocusGained
        HoverColor(panel_prodetmenu, new Color(164, 177, 252), Color.BLACK);
    }//GEN-LAST:event_lbl_prodetFocusGained

    private void lbl_prodetFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lbl_prodetFocusLost
    {//GEN-HEADEREND:event_lbl_prodetFocusLost
        HoverColor(panel_prodetmenu, new Color(68, 82, 121), Color.WHITE);
    }//GEN-LAST:event_lbl_prodetFocusLost

    private void lbl_prodetMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_prodetMouseClicked
    {//GEN-HEADEREND:event_lbl_prodetMouseClicked
        visibility(txt_add_pro_id, panel_addpro, false, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, true);
    }//GEN-LAST:event_lbl_prodetMouseClicked

    private void lbl_prodetMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_prodetMouseEntered
    {//GEN-HEADEREND:event_lbl_prodetMouseEntered
        HoverColor(panel_prodetmenu, new Color(164, 177, 252), Color.BLACK);
    }//GEN-LAST:event_lbl_prodetMouseEntered

    private void lbl_prodetMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_prodetMouseExited
    {//GEN-HEADEREND:event_lbl_prodetMouseExited
        HoverColor(panel_prodetmenu, new Color(68, 82, 121), Color.WHITE);
    }//GEN-LAST:event_lbl_prodetMouseExited

    private void lbl_prodetKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_lbl_prodetKeyPressed
    {//GEN-HEADEREND:event_lbl_prodetKeyPressed
        visibility(evt.getKeyCode(), txt_add_pro_id, panel_addpro, false, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, true);
        escape(lbl_product, evt.getKeyCode(), panel_product);
    }//GEN-LAST:event_lbl_prodetKeyPressed

    private void loginBtn8ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_loginBtn8ActionPerformed
    {//GEN-HEADEREND:event_loginBtn8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtn8ActionPerformed

    private void txt_add_promcb_brand_nmActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txt_add_promcb_brand_nmActionPerformed
    {//GEN-HEADEREND:event_txt_add_promcb_brand_nmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_add_promcb_brand_nmActionPerformed

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

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_kButton2ActionPerformed
    {//GEN-HEADEREND:event_kButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_kButton3ActionPerformed
    {//GEN-HEADEREND:event_kButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_kButton4ActionPerformed
    {//GEN-HEADEREND:event_kButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton4ActionPerformed

    private void kButton2KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_kButton2KeyPressed
    {//GEN-HEADEREND:event_kButton2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton2KeyPressed

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

    public void whitespaceremover(JTextField field)
    {
        if (field.getText().equals(" "))
        {
            String txt = field.getText().replace(" ", "");
            field.setText(txt);
        }
    }

    public void hoverColor(KGradientPanel panel, JLabel label, Color kcolor, Color bcolor, Color foreground, Font font, String text)
    {
        panel.setkStartColor(kcolor);
        panel.setkEndColor(kcolor);
        panel.setBackground(bcolor);
        label.setForeground(foreground);
        label.setFont(font);
        label.setText(text);
    }

    public void HoverColor(KGradientPanel panel, Color kColor, Color bColor)
    {
        panel.setkStartColor(kColor);
        panel.setkEndColor(kColor);
        panel.setBackground(bColor);
    }

    public void HoverColor(KGradientPanel panel, JLabel label, Color kColor, Color bColor, Color foreground)
    {
        panel.setkStartColor(kColor);
        panel.setkEndColor(kColor);
        panel.setBackground(bColor);
        label.setForeground(foreground);
    }

    public void escape(JLabel label, int code)
    {
        if (code == KeyEvent.VK_ESCAPE)
        {
            label.grabFocus();
        }
    }

    public void escape(JLabel label, int code, KGradientPanel panel)
    {
        if (code == KeyEvent.VK_ESCAPE)
        {
            label.grabFocus();
            panel.setVisible(false);
            panel_extra.setVisible(true);
        }
    }

    public void clearplaceholder(JTextField field, String gottext, String text)
    {
        if (gottext.equals(text))
        {
            field.setText("");
        }
    }

    public void txtfocuslost(JTextField field, String gottext, String settext)
    {
        if (gottext.equals("") || gottext.equals(" "))
        {
            field.setText(settext);
        }
    }

    public void screensize()
    {
        Toolkit tk = Toolkit.getDefaultToolkit();
        int x = (int) tk.getScreenSize().getWidth();
        int y = (int) tk.getScreenSize().getHeight();
        Insets scnmax = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
        int taskbar = scnmax.bottom;

        this.setSize(x, y - taskbar);
    }

    public void tableheader(JTableHeader header)
    {
        header.setFont(new Font("Cascadia Mono", Font.PLAIN, 20));
    }

    //to call when enter key pressed
    public void visibility(int code, JLabel label, boolean cust, boolean emp, boolean product, boolean bill, boolean account, boolean user, boolean extra)
    {
        if (code == KeyEvent.VK_ENTER)
        {
            panel_customer.setVisible(cust);
            panel_employee.setVisible(emp);
            panel_product.setVisible(product);
            panel_bill.setVisible(bill);
            panel_account.setVisible(account);
            panel_user.setVisible(user);
            panel_extra.setVisible(extra);
            label.grabFocus();
        }
    }

    //to call when from sidepane with mouseclick
    public void visibility(JLabel label, boolean cust, boolean emp, boolean product, boolean bill, boolean account, boolean user, boolean extra)
    {
        panel_customer.setVisible(cust);
        panel_employee.setVisible(emp);
        panel_product.setVisible(product);
        panel_bill.setVisible(bill);
        panel_account.setVisible(account);
        panel_user.setVisible(user);
        panel_extra.setVisible(extra);
        label.grabFocus();
    }

    public void visibility(KButton button, boolean cust, boolean emp, boolean product, boolean bill, boolean account, boolean user, boolean extra)
    {
        panel_customer.setVisible(cust);
        panel_employee.setVisible(emp);
        panel_product.setVisible(product);
        panel_bill.setVisible(bill);
        panel_account.setVisible(account);
        panel_user.setVisible(user);
        panel_extra.setVisible(extra);
        button.grabFocus();
    }

    //to call when the enter key pressed in main panel
    void visibility(int code, JTextField field, KGradientPanel add, boolean addbool, KGradientPanel edit, boolean editbool, KGradientPanel det, boolean detbool)
    {
        if (code == KeyEvent.VK_ENTER)
        {
            add.setVisible(addbool);
            edit.setVisible(editbool);
            det.setVisible(detbool);
            field.grabFocus();
        }
    }

    //while inside the main panel
    public void visibility(JTextField field, KGradientPanel add, boolean addbool, KGradientPanel edit, boolean editbool, KGradientPanel det, boolean detbool)
    {
        add.setVisible(addbool);
        edit.setVisible(editbool);
        det.setVisible(detbool);
        field.grabFocus();
    }

    //to call from sidepane
    public void visibility(KGradientPanel add, boolean addbool, KGradientPanel edit, boolean editbool, KGradientPanel det, boolean detbool)
    {
        add.setVisible(addbool);
        edit.setVisible(editbool);
        det.setVisible(detbool);
    }

    //to call when the enter key pressed in main panel
    void visibility(int code, JTextField field, KGradientPanel add, boolean addbool, KGradientPanel edit, boolean editbool, KGradientPanel det, boolean detbool, KGradientPanel fulldet, boolean fulldetbool)
    {
        if (code == KeyEvent.VK_ENTER)
        {
            add.setVisible(addbool);
            edit.setVisible(editbool);
            det.setVisible(detbool);
            fulldet.setVisible(fulldetbool);
            field.grabFocus();
        }
    }

    //while inside the main panel
    public void visibility(JTextField field, KGradientPanel add, boolean addbool, KGradientPanel edit, boolean editbool, KGradientPanel det, boolean detbool, KGradientPanel fulldet, boolean fulldetbool)
    {
        add.setVisible(addbool);
        edit.setVisible(editbool);
        det.setVisible(detbool);
        fulldet.setVisible(fulldetbool);
        field.grabFocus();
    }

    //to call from sidepane
    public void visibility(KGradientPanel add, boolean addbool, KGradientPanel edit, boolean editbool, KGradientPanel det, boolean detbool, KGradientPanel fulldet, boolean fulldetbool)
    {
        add.setVisible(addbool);
        edit.setVisible(editbool);
        det.setVisible(detbool);
        fulldet.setVisible(fulldetbool);
    }

    //to call when the enter key pressed in main panel
    void visibility(int code, JTextField field, KGradientPanel add, boolean addbool, KGradientPanel addmbc, boolean mbcbool, KGradientPanel edit, boolean editbool, KGradientPanel det, boolean detbool, KGradientPanel fulldet, boolean fulldetbool)
    {
        if (code == KeyEvent.VK_ENTER)
        {
            add.setVisible(addbool);
            addmbc.setVisible(mbcbool);
            edit.setVisible(editbool);
            det.setVisible(detbool);
            fulldet.setVisible(fulldetbool);
            field.grabFocus();
        }
    }

    //while inside the main panel
    public void visibility(JTextField field, KGradientPanel add, boolean addbool, KGradientPanel addmbc, boolean mbcbool, KGradientPanel edit, boolean editbool, KGradientPanel det, boolean detbool, KGradientPanel fulldet, boolean fulldetbool)
    {
        add.setVisible(addbool);
        addmbc.setVisible(mbcbool);
        edit.setVisible(editbool);
        det.setVisible(detbool);
        fulldet.setVisible(fulldetbool);
        field.grabFocus();
    }

    //to call from sidepane
    public void visibility(KGradientPanel add, boolean addbool, KGradientPanel addmbc, boolean mbcbool, KGradientPanel edit, boolean editbool, KGradientPanel det, boolean detbool, KGradientPanel fulldet, boolean fulldetbool)
    {
        add.setVisible(addbool);
        addmbc.setVisible(mbcbool);
        edit.setVisible(editbool);
        det.setVisible(detbool);
        fulldet.setVisible(fulldetbool);
    }

    //
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private combo_suggestion.ComboBoxSuggestion combo_add_pro_brand;
    private combo_suggestion.ComboBoxSuggestion combo_add_pro_ctgry;
    private combo_suggestion.ComboBoxSuggestion combo_add_pro_model;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton4;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel10;
    private com.k33ptoo.components.KGradientPanel kGradientPanel11;
    private com.k33ptoo.components.KGradientPanel kGradientPanel12;
    private com.k33ptoo.components.KGradientPanel kGradientPanel13;
    private com.k33ptoo.components.KGradientPanel kGradientPanel19;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    private com.k33ptoo.components.KGradientPanel kGradientPanel9;
    private javax.swing.JLabel lbl_account;
    private javax.swing.JLabel lbl_add_empaddimg;
    private javax.swing.JLabel lbl_add_empaddimg1;
    private javax.swing.JLabel lbl_add_empimg;
    private javax.swing.JLabel lbl_add_empimg1;
    private javax.swing.JLabel lbl_add_emprmimg;
    private javax.swing.JLabel lbl_add_emprmimg1;
    private javax.swing.JLabel lbl_add_proaddimg;
    private javax.swing.JLabel lbl_add_prombc;
    private javax.swing.JLabel lbl_add_prormimg;
    private javax.swing.JLabel lbl_addemp;
    private javax.swing.JLabel lbl_addpro;
    private javax.swing.JLabel lbl_bill;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_customer;
    private javax.swing.JLabel lbl_edit_empimg;
    private javax.swing.JLabel lbl_editemp;
    private javax.swing.JLabel lbl_editpro;
    private javax.swing.JLabel lbl_empdet;
    private javax.swing.JLabel lbl_employee;
    private javax.swing.JLabel lbl_gt;
    private javax.swing.JLabel lbl_min;
    private javax.swing.JLabel lbl_prodet;
    private javax.swing.JLabel lbl_product;
    private javax.swing.JLabel lbl_user;
    private com.k33ptoo.components.KButton loginBtn;
    private com.k33ptoo.components.KButton loginBtn1;
    private com.k33ptoo.components.KButton loginBtn10;
    private com.k33ptoo.components.KButton loginBtn11;
    private com.k33ptoo.components.KButton loginBtn12;
    private com.k33ptoo.components.KButton loginBtn2;
    private com.k33ptoo.components.KButton loginBtn3;
    private com.k33ptoo.components.KButton loginBtn4;
    private com.k33ptoo.components.KButton loginBtn5;
    private com.k33ptoo.components.KButton loginBtn6;
    private com.k33ptoo.components.KButton loginBtn8;
    private com.k33ptoo.components.KGradientPanel panel_account;
    private com.k33ptoo.components.KGradientPanel panel_addcust;
    private com.k33ptoo.components.KGradientPanel panel_addcustmenu;
    private com.k33ptoo.components.KGradientPanel panel_addcustmenu1;
    private com.k33ptoo.components.KGradientPanel panel_addcustmenu2;
    private com.k33ptoo.components.KGradientPanel panel_addcustmenu3;
    private com.k33ptoo.components.KGradientPanel panel_addemp;
    private com.k33ptoo.components.KGradientPanel panel_addempmenu;
    private com.k33ptoo.components.KGradientPanel panel_addmoedelmenu;
    private com.k33ptoo.components.KGradientPanel panel_addpro;
    private com.k33ptoo.components.KGradientPanel panel_addpro_mcb;
    private com.k33ptoo.components.KGradientPanel panel_addpromenu;
    private com.k33ptoo.components.KGradientPanel panel_bill;
    private com.k33ptoo.components.KGradientPanel panel_custdetail;
    private com.k33ptoo.components.KGradientPanel panel_custextra;
    private com.k33ptoo.components.KGradientPanel panel_custmain;
    private com.k33ptoo.components.KGradientPanel panel_custmenu;
    private com.k33ptoo.components.KGradientPanel panel_custmenu1;
    private com.k33ptoo.components.KGradientPanel panel_customer;
    private com.k33ptoo.components.KGradientPanel panel_detemp;
    private com.k33ptoo.components.KGradientPanel panel_edit_emptable;
    private com.k33ptoo.components.KGradientPanel panel_editcus;
    private com.k33ptoo.components.KGradientPanel panel_editemp;
    private com.k33ptoo.components.KGradientPanel panel_editempmenu;
    private com.k33ptoo.components.KGradientPanel panel_editpro;
    private com.k33ptoo.components.KGradientPanel panel_empdetmenu;
    private com.k33ptoo.components.KGradientPanel panel_empextra;
    private com.k33ptoo.components.KGradientPanel panel_employee;
    private com.k33ptoo.components.KGradientPanel panel_empmain;
    private com.k33ptoo.components.KGradientPanel panel_empmenu;
    private com.k33ptoo.components.KGradientPanel panel_extra;
    private com.k33ptoo.components.KGradientPanel panel_main;
    private com.k33ptoo.components.KGradientPanel panel_pro_fulldet;
    private com.k33ptoo.components.KGradientPanel panel_prodet;
    private com.k33ptoo.components.KGradientPanel panel_prodetmenu;
    private com.k33ptoo.components.KGradientPanel panel_product;
    private com.k33ptoo.components.KGradientPanel panel_proeditmenu;
    private com.k33ptoo.components.KGradientPanel panel_promain;
    private com.k33ptoo.components.KGradientPanel panel_promenu;
    private com.k33ptoo.components.KGradientPanel panel_user;
    private com.k33ptoo.components.KGradientPanel pnl_account;
    private com.k33ptoo.components.KGradientPanel pnl_bill;
    private com.k33ptoo.components.KGradientPanel pnl_close;
    private com.k33ptoo.components.KGradientPanel pnl_customer;
    private com.k33ptoo.components.KGradientPanel pnl_employee;
    private com.k33ptoo.components.KGradientPanel pnl_header;
    private javax.swing.JPanel pnl_min;
    private com.k33ptoo.components.KGradientPanel pnl_product;
    private com.k33ptoo.components.KGradientPanel pnl_sidepane;
    private com.k33ptoo.components.KGradientPanel pnl_user;
    private javax.swing.JTable table_custdet;
    private javax.swing.JTable table_custedit;
    private javax.swing.JTable table_empdet;
    private javax.swing.JTable table_empedit;
    private textarea.TextArea textArea2;
    private textarea.TextAreaScroll textAreaScroll2;
    private textfield.TextField txt_add_custemail;
    private textfield.TextField txt_add_custid;
    private textfield.TextField txt_add_custnm;
    private textfield.TextField txt_add_custno;
    private textfield.TextField txt_add_custsnm;
    private textfield.TextField txt_add_custsnm1;
    private textfield.TextField txt_add_custsnm2;
    private textfield.TextField txt_add_empadd;
    private textfield.TextField txt_add_empemail;
    private textfield.TextField txt_add_empid;
    private textfield.TextField txt_add_empnm;
    private textfield.TextField txt_add_empno;
    private textfield.TextField txt_add_empsalary;
    private textfield.TextField txt_add_pro_id;
    private textfield.TextField txt_add_pro_id1;
    private textfield.TextField txt_add_pro_id2;
    private spinner.Spinner txt_add_pro_qty;
    private textfield.TextField txt_add_promcb_brand_id;
    private textfield.TextField txt_add_promcb_brand_nm;
    private textfield.TextField txt_add_promcb_ctrgy_id;
    private textfield.TextField txt_add_promcb_ctrgy_id1;
    private textfield.TextField txt_add_promcb_model_id1;
    private textfield.TextField txt_add_promcb_model_nm1;
    private textfield.TextField txt_det_custid;
    private textfield.TextField txt_det_empid;
    private textfield.TextField txt_edit_custemail;
    private textfield.TextField txt_edit_custnm;
    private textfield.TextField txt_edit_custno;
    private textfield.TextField txt_edit_custsadd;
    private textfield.TextField txt_edit_custsnm;
    private textfield.TextField txt_edit_empadd;
    private textfield.TextField txt_edit_empemail;
    private textfield.TextField txt_edit_empnm;
    private textfield.TextField txt_edit_empnm1;
    private textfield.TextField txt_edit_empsalary;
    // End of variables declaration//GEN-END:variables
}
