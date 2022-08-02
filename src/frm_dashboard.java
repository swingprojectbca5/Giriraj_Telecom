
import com.k33ptoo.components.KButton;
import com.k33ptoo.components.KGradientPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;
import scrollbar.ScrollBarCustom;

public class frm_dashboard extends javax.swing.JFrame {

    public frm_dashboard() {
        initComponents();
        panel_main.setVisible(true);
        visibility(jLabel2, false, false, false, false, false, false, true);

        screensize();

        tableheader(table_custedit.getTableHeader());
        tableheader(table_custdet.getTableHeader());
        jScrollPane6.setVerticalScrollBar(new ScrollBarCustom());
    }

    public frm_dashboard(String name) {
        initComponents();
        panel_main.setVisible(true);
        visibility(jLabel2, false, false, false, false, false, false, true);

        screensize();

        tableheader(table_custedit.getTableHeader());
        tableheader(table_custdet.getTableHeader());

        if (name.equals("ADMIN")) {
            lbl_customer.setEnabled(true);
        } else {
            lbl_customer.setEnabled(false);
        }
    }
    double first, second, result;
    String operation;
    String answer;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        panel_custmenu = new com.k33ptoo.components.KGradientPanel();
        panel_addcust_menu = new com.k33ptoo.components.KGradientPanel();
        indicatorAddcust = new com.k33ptoo.components.KGradientPanel();
        btn_addcust = new com.k33ptoo.components.KButton();
        panel_editcust_menu = new com.k33ptoo.components.KGradientPanel();
        indicatorEditcust = new com.k33ptoo.components.KGradientPanel();
        btn_editcust = new com.k33ptoo.components.KButton();
        panel_custdet_menu = new com.k33ptoo.components.KGradientPanel();
        indicatorDetcust = new com.k33ptoo.components.KGradientPanel();
        btn_detcust = new com.k33ptoo.components.KButton();
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
        panel_addemp_menu = new com.k33ptoo.components.KGradientPanel();
        indicatorAddemp = new com.k33ptoo.components.KGradientPanel();
        btn_addemp = new com.k33ptoo.components.KButton();
        panel_editemp_menu = new com.k33ptoo.components.KGradientPanel();
        indicatorEditemp = new com.k33ptoo.components.KGradientPanel();
        btn_editemp = new com.k33ptoo.components.KButton();
        panel_empdet_menu = new com.k33ptoo.components.KGradientPanel();
        indicatorEmpdet = new com.k33ptoo.components.KGradientPanel();
        btn_empdet = new com.k33ptoo.components.KButton();
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
        txt_add_promcb_brand_id = new textfield.TextField();
        txt_add_promcb_brand_nm = new textfield.TextField();
        loginBtn8 = new com.k33ptoo.components.KButton();
        loginBtn10 = new com.k33ptoo.components.KButton();
        txt_add_promcb_ctrgy_id1 = new textfield.TextField();
        txt_add_promcb_ctrgy_id = new textfield.TextField();
        loginBtn11 = new com.k33ptoo.components.KButton();
        loginBtn12 = new com.k33ptoo.components.KButton();
        jLabel9 = new javax.swing.JLabel();
        txt_add_promcb_model_id1 = new textfield.TextField();
        txt_add_promcb_model_nm1 = new textfield.TextField();
        loginBtn13 = new com.k33ptoo.components.KButton();
        loginBtn14 = new com.k33ptoo.components.KButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panel_editpro = new com.k33ptoo.components.KGradientPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField2 = new textfield.TextField();
        lbl_add_empimg2 = new javax.swing.JLabel();
        lbl_add_prormimg1 = new javax.swing.JLabel();
        lbl_add_proaddimg1 = new javax.swing.JLabel();
        txt_add_pro_id4 = new textfield.TextField();
        txt_add_pro_id5 = new textfield.TextField();
        txt_add_pro_id6 = new textfield.TextField();
        txt_add_pro_id7 = new textfield.TextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        loginBtn7 = new com.k33ptoo.components.KButton();
        loginBtn9 = new com.k33ptoo.components.KButton();
        jLabel6 = new javax.swing.JLabel();
        panel_prodet = new com.k33ptoo.components.KGradientPanel();
        jTextField3 = new javax.swing.JTextField();
        panel_pro_fulldet = new com.k33ptoo.components.KGradientPanel();
        panel_promenu = new com.k33ptoo.components.KGradientPanel();
        panel_addpro_menu = new com.k33ptoo.components.KGradientPanel();
        indicatorAddpro = new com.k33ptoo.components.KGradientPanel();
        btn_addpro = new com.k33ptoo.components.KButton();
        panel_addmodal_menu = new com.k33ptoo.components.KGradientPanel();
        indicatorAddmodal = new com.k33ptoo.components.KGradientPanel();
        btn_addmodal = new com.k33ptoo.components.KButton();
        panel_prodet_menu = new com.k33ptoo.components.KGradientPanel();
        indicatorDetpro = new com.k33ptoo.components.KGradientPanel();
        btn_detPro = new com.k33ptoo.components.KButton();
        panel_editpro_menu = new com.k33ptoo.components.KGradientPanel();
        indicatorEditpro = new com.k33ptoo.components.KGradientPanel();
        btn_editPro = new com.k33ptoo.components.KButton();
        panel_bill = new com.k33ptoo.components.KGradientPanel();
        panel_billmenu = new com.k33ptoo.components.KGradientPanel();
        panel_addcustmenu9 = new com.k33ptoo.components.KGradientPanel();
        indicatorAddbill = new com.k33ptoo.components.KGradientPanel();
        btn_addbill = new com.k33ptoo.components.KButton();
        panel_addcustmenu11 = new com.k33ptoo.components.KGradientPanel();
        indicator_updt_bill = new com.k33ptoo.components.KGradientPanel();
        btn_updtbill = new com.k33ptoo.components.KButton();
        panel_addcustmenu16 = new com.k33ptoo.components.KGradientPanel();
        indicatorDetpro1 = new com.k33ptoo.components.KGradientPanel();
        btn_detPro1 = new com.k33ptoo.components.KButton();
        panel_addcustmenu17 = new com.k33ptoo.components.KGradientPanel();
        indicator_bill_det = new com.k33ptoo.components.KGradientPanel();
        btn_billdet = new com.k33ptoo.components.KButton();
        panel_billmain = new com.k33ptoo.components.KGradientPanel();
        panel_createbill = new com.k33ptoo.components.KGradientPanel();
        loginBtn15 = new com.k33ptoo.components.KButton();
        combo_add_pro_brand2 = new combo_suggestion.ComboBoxSuggestion();
        combo_add_pro_brand3 = new combo_suggestion.ComboBoxSuggestion();
        combo_add_pro_brand4 = new combo_suggestion.ComboBoxSuggestion();
        combo_add_pro_brand5 = new combo_suggestion.ComboBoxSuggestion();
        combo_add_pro_brand6 = new combo_suggestion.ComboBoxSuggestion();
        combo_add_pro_brand7 = new combo_suggestion.ComboBoxSuggestion();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        combo_add_pro_brand8 = new combo_suggestion.ComboBoxSuggestion();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        combo_add_pro_brand9 = new combo_suggestion.ComboBoxSuggestion();
        combo_add_pro_brand10 = new combo_suggestion.ComboBoxSuggestion();
        combo_add_pro_brand11 = new combo_suggestion.ComboBoxSuggestion();
        jLabel10 = new javax.swing.JLabel();
        panel_updatbill = new com.k33ptoo.components.KGradientPanel();
        panel_detbill = new com.k33ptoo.components.KGradientPanel();
        panel_extrabill = new com.k33ptoo.components.KGradientPanel();
        panel_account = new com.k33ptoo.components.KGradientPanel();
        panel_user = new com.k33ptoo.components.KGradientPanel();
        panel_extra = new com.k33ptoo.components.KGradientPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
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
        lbl_customer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lbl_customerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lbl_customerFocusLost(evt);
            }
        });
        lbl_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_customerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_customerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_customerMouseExited(evt);
            }
        });
        lbl_customer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
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
        lbl_employee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lbl_employeeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lbl_employeeFocusLost(evt);
            }
        });
        lbl_employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_employeeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_employeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_employeeMouseExited(evt);
            }
        });
        lbl_employee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
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
        pnl_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
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
        lbl_product.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lbl_productFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lbl_productFocusLost(evt);
            }
        });
        lbl_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_productMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_productMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_productMouseExited(evt);
            }
        });
        lbl_product.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
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
        lbl_bill.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lbl_billFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lbl_billFocusLost(evt);
            }
        });
        lbl_bill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_billMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_billMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_billMouseExited(evt);
            }
        });
        lbl_bill.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
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
        lbl_account.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lbl_accountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lbl_accountFocusLost(evt);
            }
        });
        lbl_account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_accountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_accountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_accountMouseExited(evt);
            }
        });
        lbl_account.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
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
        lbl_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lbl_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lbl_userFocusLost(evt);
            }
        });
        lbl_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_userMouseExited(evt);
            }
        });
        lbl_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
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
        pnl_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
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
        pnl_min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_minMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_minMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
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
        loginBtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginBtnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginBtnFocusLost(evt);
            }
        });
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
        });
        loginBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginBtnKeyPressed(evt);
            }
        });

        txt_add_custid.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_custid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_custid.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_custid.setLabelText("CUSTOMER ID");
        txt_add_custid.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_custid.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_custid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_custidKeyPressed(evt);
            }
        });

        txt_add_custnm.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_custnm.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_custnm.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_custnm.setLabelText("CUSTOMER NAME");
        txt_add_custnm.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_custnm.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_custnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_custnmKeyPressed(evt);
            }
        });

        txt_add_custno.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_custno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_custno.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_custno.setLabelText("CONTACT NO.");
        txt_add_custno.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_custno.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_custno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_custnoKeyPressed(evt);
            }
        });

        txt_add_custemail.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_custemail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_custemail.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_custemail.setLabelText("EMAIL");
        txt_add_custemail.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_custemail.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_custemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_custemailKeyPressed(evt);
            }
        });

        txt_add_custsnm.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_custsnm.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_custsnm.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_custsnm.setLabelText("SHOP NAME");
        txt_add_custsnm.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_custsnm.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_custsnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_custsnmKeyPressed(evt);
            }
        });

        txt_add_custsnm1.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_custsnm1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_custsnm1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_custsnm1.setLabelText("SHOP NAME");
        txt_add_custsnm1.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_custsnm1.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_custsnm1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_custsnm1KeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel4.setText("CLICK HERE");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txt_add_custsnm2.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_custsnm2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_custsnm2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_custsnm2.setLabelText("OTP");
        txt_add_custsnm2.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_custsnm2.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_custsnm2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_custsnm2KeyPressed(evt);
            }
        });

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
            new Object [][] {
                {"spareparts", "chargin socket", "display", "combo"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
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
        txt_edit_custnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_edit_custnmKeyPressed(evt);
            }
        });

        txt_edit_custemail.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_custemail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_custemail.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_custemail.setLabelText("EMAIL");
        txt_edit_custemail.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_custemail.setNextFocusableComponent(txt_edit_custsnm);
        txt_edit_custemail.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_edit_custemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_edit_custemailKeyPressed(evt);
            }
        });

        txt_edit_custno.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_custno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_custno.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_custno.setLabelText("CONTACT NO.");
        txt_edit_custno.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_custno.setNextFocusableComponent(txt_edit_custemail);
        txt_edit_custno.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_edit_custno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_edit_custnoKeyPressed(evt);
            }
        });

        txt_edit_custsnm.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_custsnm.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_custsnm.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_custsnm.setLabelText("SHOP NAME");
        txt_edit_custsnm.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_custsnm.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_edit_custsnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_edit_custsnmKeyPressed(evt);
            }
        });

        txt_edit_custsadd.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_custsadd.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_custsadd.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_custsadd.setLabelText("SHOP ADDRESS");
        txt_edit_custsadd.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_custsadd.setNextFocusableComponent(txt_edit_custnm);
        txt_edit_custsadd.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_edit_custsadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_edit_custsaddKeyPressed(evt);
            }
        });

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
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_custdet.setOpaque(false);
        table_custdet.setRowHeight(40);
        table_custdet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
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
        txt_det_custid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_det_custidActionPerformed(evt);
            }
        });
        txt_det_custid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_det_custidKeyPressed(evt);
            }
        });

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
                .addComponent(panel_addcust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(panel_custmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_custmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_editcus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
            .addGroup(panel_custmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_custmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_custdetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
            .addGroup(panel_custmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_custmainLayout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(panel_custextra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(24, Short.MAX_VALUE)))
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
                    .addContainerGap(25, Short.MAX_VALUE)))
            .addGroup(panel_custmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_custmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_custdetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
            .addGroup(panel_custmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_custmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_custextra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        panel_custmenu.setkBorderRadius(40);
        panel_custmenu.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_custmenu.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_custmenu.setOpaque(false);

        panel_addcust_menu.setkBorderRadius(40);
        panel_addcust_menu.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_addcust_menu.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_addcust_menu.setOpaque(false);

        indicatorAddcust.setkEndColor(new java.awt.Color(209, 216, 224));
        indicatorAddcust.setkStartColor(new java.awt.Color(209, 216, 224));
        indicatorAddcust.setOpaque(false);

        javax.swing.GroupLayout indicatorAddcustLayout = new javax.swing.GroupLayout(indicatorAddcust);
        indicatorAddcust.setLayout(indicatorAddcustLayout);
        indicatorAddcustLayout.setHorizontalGroup(
            indicatorAddcustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        indicatorAddcustLayout.setVerticalGroup(
            indicatorAddcustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        btn_addcust.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_addcust.setText("ADD CUSTOMER");
        btn_addcust.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_addcust.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_addcust.setkBorderRadius(20);
        btn_addcust.setkEndColor(new java.awt.Color(178, 199, 231));
        btn_addcust.setkHoverEndColor(new java.awt.Color(68, 82, 121));
        btn_addcust.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_addcust.setkHoverStartColor(new java.awt.Color(68, 82, 121));
        btn_addcust.setkPressedColor(new java.awt.Color(68, 82, 121));
        btn_addcust.setkStartColor(new java.awt.Color(178, 199, 231));
        btn_addcust.setNextFocusableComponent(btn_editcust);
        btn_addcust.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_addcustFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_addcustFocusLost(evt);
            }
        });
        btn_addcust.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addcustMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_addcustMouseEntered(evt);
            }
        });
        btn_addcust.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_addcustKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_addcust_menuLayout = new javax.swing.GroupLayout(panel_addcust_menu);
        panel_addcust_menu.setLayout(panel_addcust_menuLayout);
        panel_addcust_menuLayout.setHorizontalGroup(
            panel_addcust_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcust_menuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_addcust_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indicatorAddcust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_addcust, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_addcust_menuLayout.setVerticalGroup(
            panel_addcust_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcust_menuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_addcust, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicatorAddcust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_editcust_menu.setkBorderRadius(40);
        panel_editcust_menu.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_editcust_menu.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_editcust_menu.setOpaque(false);

        indicatorEditcust.setkEndColor(new java.awt.Color(209, 216, 224));
        indicatorEditcust.setkStartColor(new java.awt.Color(209, 216, 224));
        indicatorEditcust.setOpaque(false);

        javax.swing.GroupLayout indicatorEditcustLayout = new javax.swing.GroupLayout(indicatorEditcust);
        indicatorEditcust.setLayout(indicatorEditcustLayout);
        indicatorEditcustLayout.setHorizontalGroup(
            indicatorEditcustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );
        indicatorEditcustLayout.setVerticalGroup(
            indicatorEditcustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        btn_editcust.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_editcust.setText("EDIT CUSTOMER");
        btn_editcust.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_editcust.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_editcust.setkBorderRadius(20);
        btn_editcust.setkEndColor(new java.awt.Color(178, 199, 231));
        btn_editcust.setkHoverEndColor(new java.awt.Color(68, 82, 121));
        btn_editcust.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_editcust.setkHoverStartColor(new java.awt.Color(68, 82, 121));
        btn_editcust.setkPressedColor(new java.awt.Color(68, 82, 121));
        btn_editcust.setkStartColor(new java.awt.Color(178, 199, 231));
        btn_editcust.setNextFocusableComponent(btn_detcust);
        btn_editcust.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_editcustFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_editcustFocusLost(evt);
            }
        });
        btn_editcust.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editcustMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_editcustMouseEntered(evt);
            }
        });
        btn_editcust.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_editcustKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_editcust_menuLayout = new javax.swing.GroupLayout(panel_editcust_menu);
        panel_editcust_menu.setLayout(panel_editcust_menuLayout);
        panel_editcust_menuLayout.setHorizontalGroup(
            panel_editcust_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editcust_menuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_editcust_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indicatorEditcust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_editcust, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_editcust_menuLayout.setVerticalGroup(
            panel_editcust_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editcust_menuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_editcust, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicatorEditcust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_custdet_menu.setkBorderRadius(40);
        panel_custdet_menu.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_custdet_menu.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_custdet_menu.setOpaque(false);

        indicatorDetcust.setkEndColor(new java.awt.Color(209, 216, 224));
        indicatorDetcust.setkStartColor(new java.awt.Color(209, 216, 224));
        indicatorDetcust.setOpaque(false);

        javax.swing.GroupLayout indicatorDetcustLayout = new javax.swing.GroupLayout(indicatorDetcust);
        indicatorDetcust.setLayout(indicatorDetcustLayout);
        indicatorDetcustLayout.setHorizontalGroup(
            indicatorDetcustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        indicatorDetcustLayout.setVerticalGroup(
            indicatorDetcustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btn_detcust.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_detcust.setText("CUSTOMER DETAILS");
        btn_detcust.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_detcust.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_detcust.setkBorderRadius(20);
        btn_detcust.setkEndColor(new java.awt.Color(178, 199, 231));
        btn_detcust.setkHoverEndColor(new java.awt.Color(68, 82, 121));
        btn_detcust.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_detcust.setkHoverStartColor(new java.awt.Color(68, 82, 121));
        btn_detcust.setkPressedColor(new java.awt.Color(68, 82, 121));
        btn_detcust.setkStartColor(new java.awt.Color(178, 199, 231));
        btn_detcust.setNextFocusableComponent(btn_addcust);
        btn_detcust.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_detcustFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_detcustFocusLost(evt);
            }
        });
        btn_detcust.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_detcustMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_detcustMouseEntered(evt);
            }
        });
        btn_detcust.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_detcustKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_custdet_menuLayout = new javax.swing.GroupLayout(panel_custdet_menu);
        panel_custdet_menu.setLayout(panel_custdet_menuLayout);
        panel_custdet_menuLayout.setHorizontalGroup(
            panel_custdet_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_custdet_menuLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(panel_custdet_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(indicatorDetcust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_detcust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        panel_custdet_menuLayout.setVerticalGroup(
            panel_custdet_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_custdet_menuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_detcust, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicatorDetcust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_custmenuLayout = new javax.swing.GroupLayout(panel_custmenu);
        panel_custmenu.setLayout(panel_custmenuLayout);
        panel_custmenuLayout.setHorizontalGroup(
            panel_custmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_custmenuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel_addcust_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_editcust_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_custdet_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_custmenuLayout.setVerticalGroup(
            panel_custmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_addcust_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_editcust_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_custdet_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_customerLayout = new javax.swing.GroupLayout(panel_customer);
        panel_customer.setLayout(panel_customerLayout);
        panel_customerLayout.setHorizontalGroup(
            panel_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_custmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_custmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_customerLayout.setVerticalGroup(
            panel_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_customerLayout.createSequentialGroup()
                .addComponent(panel_custmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
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

        lbl_add_empaddimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add_empaddimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add-user.png"))); // NOI18N
        lbl_add_empaddimg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_add_empaddimg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_add_empaddimgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_add_empaddimgMouseExited(evt);
            }
        });

        lbl_add_emprmimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add_emprmimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/substract.png"))); // NOI18N
        lbl_add_emprmimg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_add_emprmimg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_add_emprmimgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_add_emprmimgMouseExited(evt);
            }
        });

        txt_add_empid.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_empid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_empid.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_empid.setLabelText("EMPLOYEE ID");
        txt_add_empid.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_empid.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_empid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_empidKeyPressed(evt);
            }
        });

        txt_add_empnm.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_empnm.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_empnm.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_empnm.setLabelText("EMPLOYEE NAME");
        txt_add_empnm.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_empnm.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_empnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_empnmKeyPressed(evt);
            }
        });

        txt_add_empno.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_empno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_empno.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_empno.setLabelText("CONTACT NO.");
        txt_add_empno.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_empno.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_empno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_empnoKeyPressed(evt);
            }
        });

        txt_add_empemail.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_empemail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_empemail.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_empemail.setLabelText("EMAIL");
        txt_add_empemail.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_empemail.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_empemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_empemailKeyPressed(evt);
            }
        });

        txt_add_empsalary.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_empsalary.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_empsalary.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_empsalary.setLabelText("SALARY");
        txt_add_empsalary.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_empsalary.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_empsalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_empsalaryKeyPressed(evt);
            }
        });

        txt_add_empadd.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_empadd.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_empadd.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_empadd.setLabelText("ADDRESS");
        txt_add_empadd.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_empadd.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_empadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_empaddKeyPressed(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
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
            new Object [][] {
                {"spareparts", "chargin socket", "display", "combo"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
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
        lbl_add_emprmimg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_add_emprmimg1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_add_emprmimg1MouseExited(evt);
            }
        });

        lbl_add_empaddimg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add_empaddimg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add-user.png"))); // NOI18N
        lbl_add_empaddimg1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_add_empaddimg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_add_empaddimg1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_add_empaddimg1MouseExited(evt);
            }
        });

        txt_edit_empnm.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_empnm.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_empnm.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_empnm.setLabelText("EMPLOYEE NAME");
        txt_edit_empnm.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_empnm.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_edit_empnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_edit_empnmKeyPressed(evt);
            }
        });

        txt_edit_empnm1.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_empnm1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_empnm1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_empnm1.setLabelText("EMPLOYEE NAME");
        txt_edit_empnm1.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_empnm1.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_edit_empnm1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_edit_empnm1KeyPressed(evt);
            }
        });

        txt_edit_empemail.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_empemail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_empemail.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_empemail.setLabelText("EMAIL");
        txt_edit_empemail.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_empemail.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_edit_empemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_edit_empemailKeyPressed(evt);
            }
        });

        txt_edit_empsalary.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_empsalary.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_empsalary.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_empsalary.setLabelText("SALARY");
        txt_edit_empsalary.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_empsalary.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_edit_empsalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_edit_empsalaryKeyPressed(evt);
            }
        });

        txt_edit_empadd.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_empadd.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_empadd.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_empadd.setLabelText("ADDRESS");
        txt_edit_empadd.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_empadd.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_edit_empadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_edit_empaddKeyPressed(evt);
            }
        });

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
                .addContainerGap(75, Short.MAX_VALUE))
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
        txt_det_empid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_det_empidKeyPressed(evt);
            }
        });

        jScrollPane4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        table_empdet.setBackground(new java.awt.Color(228, 235, 246));
        table_empdet.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        table_empdet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"h", "e", "l", "o"},
                {null, null, null, null},
                {"", null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_empdet.setOpaque(false);
        table_empdet.setRowHeight(40);
        table_empdet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
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
                .addContainerGap(20, Short.MAX_VALUE))
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
            .addGap(0, 1061, Short.MAX_VALUE)
            .addGroup(panel_empmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_empmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_empextra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
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
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(panel_empmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_empmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_empextra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
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
                    .addContainerGap(24, Short.MAX_VALUE)))
        );

        panel_empmenu.setkBorderRadius(40);
        panel_empmenu.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_empmenu.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_empmenu.setOpaque(false);

        panel_addemp_menu.setkBorderRadius(40);
        panel_addemp_menu.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_addemp_menu.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_addemp_menu.setOpaque(false);

        indicatorAddemp.setkEndColor(new java.awt.Color(209, 216, 224));
        indicatorAddemp.setkStartColor(new java.awt.Color(209, 216, 224));
        indicatorAddemp.setOpaque(false);

        javax.swing.GroupLayout indicatorAddempLayout = new javax.swing.GroupLayout(indicatorAddemp);
        indicatorAddemp.setLayout(indicatorAddempLayout);
        indicatorAddempLayout.setHorizontalGroup(
            indicatorAddempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        indicatorAddempLayout.setVerticalGroup(
            indicatorAddempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        btn_addemp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_addemp.setText("ADD EMPLOYEE");
        btn_addemp.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_addemp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_addemp.setkBorderRadius(20);
        btn_addemp.setkEndColor(new java.awt.Color(178, 199, 231));
        btn_addemp.setkHoverEndColor(new java.awt.Color(68, 82, 121));
        btn_addemp.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_addemp.setkHoverStartColor(new java.awt.Color(68, 82, 121));
        btn_addemp.setkPressedColor(new java.awt.Color(68, 82, 121));
        btn_addemp.setkStartColor(new java.awt.Color(178, 199, 231));
        btn_addemp.setNextFocusableComponent(btn_editemp);
        btn_addemp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_addempFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_addempFocusLost(evt);
            }
        });
        btn_addemp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addempMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_addempMouseEntered(evt);
            }
        });
        btn_addemp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_addempKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_addemp_menuLayout = new javax.swing.GroupLayout(panel_addemp_menu);
        panel_addemp_menu.setLayout(panel_addemp_menuLayout);
        panel_addemp_menuLayout.setHorizontalGroup(
            panel_addemp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addemp_menuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_addemp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indicatorAddemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_addemp, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_addemp_menuLayout.setVerticalGroup(
            panel_addemp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addemp_menuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_addemp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicatorAddemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_editemp_menu.setkBorderRadius(40);
        panel_editemp_menu.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_editemp_menu.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_editemp_menu.setOpaque(false);

        indicatorEditemp.setkEndColor(new java.awt.Color(209, 216, 224));
        indicatorEditemp.setkStartColor(new java.awt.Color(209, 216, 224));
        indicatorEditemp.setOpaque(false);

        javax.swing.GroupLayout indicatorEditempLayout = new javax.swing.GroupLayout(indicatorEditemp);
        indicatorEditemp.setLayout(indicatorEditempLayout);
        indicatorEditempLayout.setHorizontalGroup(
            indicatorEditempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );
        indicatorEditempLayout.setVerticalGroup(
            indicatorEditempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        btn_editemp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_editemp.setText("EDIT EMPLOYEE");
        btn_editemp.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_editemp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_editemp.setkBorderRadius(20);
        btn_editemp.setkEndColor(new java.awt.Color(178, 199, 231));
        btn_editemp.setkHoverEndColor(new java.awt.Color(68, 82, 121));
        btn_editemp.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_editemp.setkHoverStartColor(new java.awt.Color(68, 82, 121));
        btn_editemp.setkPressedColor(new java.awt.Color(68, 82, 121));
        btn_editemp.setkStartColor(new java.awt.Color(178, 199, 231));
        btn_editemp.setNextFocusableComponent(btn_empdet);
        btn_editemp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_editempFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_editempFocusLost(evt);
            }
        });
        btn_editemp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editempMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_editempMouseEntered(evt);
            }
        });
        btn_editemp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_editempKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_editemp_menuLayout = new javax.swing.GroupLayout(panel_editemp_menu);
        panel_editemp_menu.setLayout(panel_editemp_menuLayout);
        panel_editemp_menuLayout.setHorizontalGroup(
            panel_editemp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editemp_menuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_editemp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indicatorEditemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_editemp, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_editemp_menuLayout.setVerticalGroup(
            panel_editemp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editemp_menuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_editemp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicatorEditemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_empdet_menu.setkBorderRadius(40);
        panel_empdet_menu.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_empdet_menu.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_empdet_menu.setOpaque(false);

        indicatorEmpdet.setkEndColor(new java.awt.Color(209, 216, 224));
        indicatorEmpdet.setkStartColor(new java.awt.Color(209, 216, 224));
        indicatorEmpdet.setOpaque(false);

        javax.swing.GroupLayout indicatorEmpdetLayout = new javax.swing.GroupLayout(indicatorEmpdet);
        indicatorEmpdet.setLayout(indicatorEmpdetLayout);
        indicatorEmpdetLayout.setHorizontalGroup(
            indicatorEmpdetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        indicatorEmpdetLayout.setVerticalGroup(
            indicatorEmpdetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btn_empdet.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_empdet.setText("EMPLOYEE DETAILS");
        btn_empdet.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_empdet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_empdet.setkBorderRadius(20);
        btn_empdet.setkEndColor(new java.awt.Color(178, 199, 231));
        btn_empdet.setkHoverEndColor(new java.awt.Color(68, 82, 121));
        btn_empdet.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_empdet.setkHoverStartColor(new java.awt.Color(68, 82, 121));
        btn_empdet.setkPressedColor(new java.awt.Color(68, 82, 121));
        btn_empdet.setkStartColor(new java.awt.Color(178, 199, 231));
        btn_empdet.setNextFocusableComponent(btn_addemp);
        btn_empdet.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_empdetFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_empdetFocusLost(evt);
            }
        });
        btn_empdet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_empdetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_empdetMouseEntered(evt);
            }
        });
        btn_empdet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_empdetKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_empdet_menuLayout = new javax.swing.GroupLayout(panel_empdet_menu);
        panel_empdet_menu.setLayout(panel_empdet_menuLayout);
        panel_empdet_menuLayout.setHorizontalGroup(
            panel_empdet_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_empdet_menuLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(panel_empdet_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(indicatorEmpdet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_empdet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        panel_empdet_menuLayout.setVerticalGroup(
            panel_empdet_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_empdet_menuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_empdet, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicatorEmpdet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_empmenuLayout = new javax.swing.GroupLayout(panel_empmenu);
        panel_empmenu.setLayout(panel_empmenuLayout);
        panel_empmenuLayout.setHorizontalGroup(
            panel_empmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_empmenuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel_addemp_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_editemp_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_empdet_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_empmenuLayout.setVerticalGroup(
            panel_empmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_addemp_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_editemp_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_empdet_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(5, 5, 5)
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
        lbl_add_proaddimg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_add_proaddimgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_add_proaddimgMouseExited(evt);
            }
        });

        lbl_add_prormimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add_prormimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/substract.png"))); // NOI18N
        lbl_add_prormimg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_add_prormimg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_add_prormimgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_add_prormimgMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ALTERNATIVES");
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));

        jList1.setBackground(new java.awt.Color(228, 235, 246));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setNextFocusableComponent(loginBtn6);
        jList1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jList1KeyPressed(evt);
            }
        });
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
        loginBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtn6ActionPerformed(evt);
            }
        });

        txt_add_pro_id.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_pro_id.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_pro_id.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_pro_id.setLabelText("PRODUCT ID");
        txt_add_pro_id.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_pro_idKeyPressed(evt);
            }
        });

        txt_add_pro_id1.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_pro_id1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_pro_id1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_pro_id1.setLabelText("COST PRICE");
        txt_add_pro_id1.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id1.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_pro_id1KeyPressed(evt);
            }
        });

        txt_add_pro_id2.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_pro_id2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_pro_id2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_pro_id2.setLabelText("COST PRICE");
        txt_add_pro_id2.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id2.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_pro_id2KeyPressed(evt);
            }
        });

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
        textArea2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textArea2KeyPressed(evt);
            }
        });
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
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(textAreaScroll2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(loginBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        panel_addpro_mcb.setkBorderRadius(40);
        panel_addpro_mcb.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_addpro_mcb.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_addpro_mcb.setOpaque(false);
        panel_addpro_mcb.setPreferredSize(new java.awt.Dimension(1011, 610));

        kGradientPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(206, 206, 206)));
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
        txt_add_promcb_brand_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_promcb_brand_idKeyPressed(evt);
            }
        });

        txt_add_promcb_brand_nm.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_promcb_brand_nm.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_promcb_brand_nm.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_promcb_brand_nm.setLabelText("BRAND NAME");
        txt_add_promcb_brand_nm.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_brand_nm.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_brand_nm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_add_promcb_brand_nmActionPerformed(evt);
            }
        });
        txt_add_promcb_brand_nm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_promcb_brand_nmKeyPressed(evt);
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
        loginBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
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
        loginBtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtn10ActionPerformed(evt);
            }
        });

        txt_add_promcb_ctrgy_id1.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_promcb_ctrgy_id1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_promcb_ctrgy_id1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_promcb_ctrgy_id1.setLabelText("CATEGORY ID");
        txt_add_promcb_ctrgy_id1.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_ctrgy_id1.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_ctrgy_id1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_add_promcb_ctrgy_id1ActionPerformed(evt);
            }
        });
        txt_add_promcb_ctrgy_id1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_promcb_ctrgy_id1KeyPressed(evt);
            }
        });

        txt_add_promcb_ctrgy_id.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_promcb_ctrgy_id.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_promcb_ctrgy_id.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_promcb_ctrgy_id.setLabelText("CATEGORY NAME");
        txt_add_promcb_ctrgy_id.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_ctrgy_id.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_ctrgy_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_promcb_ctrgy_idKeyPressed(evt);
            }
        });

        loginBtn11.setBorder(null);
        loginBtn11.setText("ADD");
        loginBtn11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn11.setkBorderRadius(30);
        loginBtn11.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn11.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        loginBtn11.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn11.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        loginBtn11.setkStartColor(new java.awt.Color(68, 82, 121));
        loginBtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
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
        loginBtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtn12ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(68, 82, 121));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ADD BRAND");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_add_promcb_model_id1.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_promcb_model_id1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_promcb_model_id1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_promcb_model_id1.setLabelText("MODEL ID");
        txt_add_promcb_model_id1.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_model_id1.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_model_id1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_add_promcb_model_id1ActionPerformed(evt);
            }
        });
        txt_add_promcb_model_id1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_promcb_model_id1KeyPressed(evt);
            }
        });

        txt_add_promcb_model_nm1.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_promcb_model_nm1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_promcb_model_nm1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_promcb_model_nm1.setLabelText("MODEL NAME");
        txt_add_promcb_model_nm1.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_model_nm1.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_model_nm1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_promcb_model_nm1KeyPressed(evt);
            }
        });

        loginBtn13.setBorder(null);
        loginBtn13.setText("ADD");
        loginBtn13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn13.setkBorderRadius(30);
        loginBtn13.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn13.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        loginBtn13.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn13.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        loginBtn13.setkStartColor(new java.awt.Color(68, 82, 121));
        loginBtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
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
        loginBtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtn14ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(68, 82, 121));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ADD BRAND");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(68, 82, 121));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ADD BRAND");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_add_promcb_model_id1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                .addComponent(txt_add_promcb_ctrgy_id1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                .addComponent(txt_add_promcb_model_nm1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loginBtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loginBtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                .addComponent(txt_add_promcb_ctrgy_id, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(loginBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                .addComponent(txt_add_promcb_brand_id, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_add_promcb_brand_nm, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16))
            .addComponent(jSeparator2)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_add_promcb_brand_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_add_promcb_brand_nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(loginBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_add_promcb_ctrgy_id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_promcb_ctrgy_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_add_promcb_model_id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_promcb_model_nm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout panel_addpro_mcbLayout = new javax.swing.GroupLayout(panel_addpro_mcb);
        panel_addpro_mcb.setLayout(panel_addpro_mcbLayout);
        panel_addpro_mcbLayout.setHorizontalGroup(
            panel_addpro_mcbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addpro_mcbLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panel_addpro_mcbLayout.setVerticalGroup(
            panel_addpro_mcbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addpro_mcbLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        panel_editpro.setkBorderRadius(40);
        panel_editpro.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_editpro.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_editpro.setOpaque(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable1);

        jTextField2.setBackground(new java.awt.Color(228, 235, 246));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTextField2.setLabelText("PRODUCT ID");
        jTextField2.setLineColor(new java.awt.Color(68, 82, 121));
        jTextField2.setSelectionColor(new java.awt.Color(68, 82, 121));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        lbl_add_empimg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add_empimg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/man.png"))); // NOI18N

        lbl_add_prormimg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add_prormimg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/substract.png"))); // NOI18N
        lbl_add_prormimg1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_add_prormimg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_add_prormimg1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_add_prormimg1MouseExited(evt);
            }
        });

        lbl_add_proaddimg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add_proaddimg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add-user.png"))); // NOI18N
        lbl_add_proaddimg1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_add_proaddimg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_add_proaddimg1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_add_proaddimg1MouseExited(evt);
            }
        });

        txt_add_pro_id4.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_pro_id4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_pro_id4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_pro_id4.setLabelText("COST PRICE");
        txt_add_pro_id4.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id4.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_pro_id4KeyPressed(evt);
            }
        });

        txt_add_pro_id5.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_pro_id5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_pro_id5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_pro_id5.setLabelText("COST PRICE");
        txt_add_pro_id5.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id5.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_pro_id5KeyPressed(evt);
            }
        });

        txt_add_pro_id6.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_pro_id6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_pro_id6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_pro_id6.setLabelText("COST PRICE");
        txt_add_pro_id6.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id6.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_pro_id6KeyPressed(evt);
            }
        });

        txt_add_pro_id7.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_pro_id7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_pro_id7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_pro_id7.setLabelText("COST PRICE");
        txt_add_pro_id7.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id7.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_pro_id7KeyPressed(evt);
            }
        });

        jList2.setBackground(new java.awt.Color(228, 235, 246));
        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList2.setNextFocusableComponent(loginBtn6);
        jScrollPane7.setViewportView(jList2);

        loginBtn7.setBorder(null);
        loginBtn7.setText("ADD CUSTOMER");
        loginBtn7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn7.setkBorderRadius(30);
        loginBtn7.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn7.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        loginBtn7.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn7.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        loginBtn7.setkStartColor(new java.awt.Color(68, 82, 121));
        loginBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtn7ActionPerformed(evt);
            }
        });

        loginBtn9.setBorder(null);
        loginBtn9.setText("ADD CUSTOMER");
        loginBtn9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn9.setkBorderRadius(30);
        loginBtn9.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn9.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        loginBtn9.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn9.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        loginBtn9.setkStartColor(new java.awt.Color(68, 82, 121));
        loginBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtn9ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ALTERNATIVES");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panel_editproLayout = new javax.swing.GroupLayout(panel_editpro);
        panel_editpro.setLayout(panel_editproLayout);
        panel_editproLayout.setHorizontalGroup(
            panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editproLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_editproLayout.createSequentialGroup()
                        .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_editproLayout.createSequentialGroup()
                                    .addComponent(lbl_add_empimg2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_add_proaddimg1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_add_prormimg1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_editproLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_add_pro_id4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_editproLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_add_pro_id5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(loginBtn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_editproLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(loginBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_editproLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_add_pro_id7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_add_pro_id6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_editproLayout.setVerticalGroup(
            panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_editproLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_add_empimg2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_editproLayout.createSequentialGroup()
                        .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panel_editproLayout.createSequentialGroup()
                                .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_add_pro_id6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_editproLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lbl_add_prormimg1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_editproLayout.createSequentialGroup()
                                .addComponent(lbl_add_proaddimg1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_add_pro_id4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_editproLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(txt_add_pro_id7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_editproLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(txt_add_pro_id5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_editproLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        panel_prodet.setkBorderRadius(40);
        panel_prodet.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_prodet.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_prodet.setOpaque(false);

        jTextField3.setText("jTextField3");

        javax.swing.GroupLayout panel_prodetLayout = new javax.swing.GroupLayout(panel_prodet);
        panel_prodet.setLayout(panel_prodetLayout);
        panel_prodetLayout.setHorizontalGroup(
            panel_prodetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_prodetLayout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(517, Short.MAX_VALUE))
        );
        panel_prodetLayout.setVerticalGroup(
            panel_prodetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_prodetLayout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(369, Short.MAX_VALUE))
        );

        panel_pro_fulldet.setkBorderRadius(40);
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
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_promainLayout.createSequentialGroup()
                    .addContainerGap(25, Short.MAX_VALUE)
                    .addComponent(panel_editpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25)))
            .addGroup(panel_promainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_promainLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(panel_prodet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE)))
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
                    .addGap(27, 27, 27)
                    .addComponent(panel_prodet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(23, Short.MAX_VALUE)))
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
        panel_promenu.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_promenu.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_promenu.setOpaque(false);

        panel_addpro_menu.setkBorderRadius(40);
        panel_addpro_menu.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_addpro_menu.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_addpro_menu.setOpaque(false);

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
        btn_addpro.setNextFocusableComponent(btn_addmodal);
        btn_addpro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_addproFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_addproFocusLost(evt);
            }
        });
        btn_addpro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addproMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_addproMouseEntered(evt);
            }
        });
        btn_addpro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_addproKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_addpro_menuLayout = new javax.swing.GroupLayout(panel_addpro_menu);
        panel_addpro_menu.setLayout(panel_addpro_menuLayout);
        panel_addpro_menuLayout.setHorizontalGroup(
            panel_addpro_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addpro_menuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_addpro_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indicatorAddpro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_addpro, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_addpro_menuLayout.setVerticalGroup(
            panel_addpro_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addpro_menuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_addpro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicatorAddpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_addmodal_menu.setkBorderRadius(40);
        panel_addmodal_menu.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_addmodal_menu.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_addmodal_menu.setOpaque(false);

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
        btn_addmodal.setNextFocusableComponent(btn_editPro);
        btn_addmodal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_addmodalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_addmodalFocusLost(evt);
            }
        });
        btn_addmodal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addmodalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_addmodalMouseEntered(evt);
            }
        });
        btn_addmodal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_addmodalKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_addmodal_menuLayout = new javax.swing.GroupLayout(panel_addmodal_menu);
        panel_addmodal_menu.setLayout(panel_addmodal_menuLayout);
        panel_addmodal_menuLayout.setHorizontalGroup(
            panel_addmodal_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addmodal_menuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_addmodal_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indicatorAddmodal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_addmodal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_addmodal_menuLayout.setVerticalGroup(
            panel_addmodal_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addmodal_menuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_addmodal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicatorAddmodal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_prodet_menu.setkBorderRadius(40);
        panel_prodet_menu.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_prodet_menu.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_prodet_menu.setOpaque(false);

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
        btn_detPro.setNextFocusableComponent(btn_addpro);
        btn_detPro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_detProFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_detProFocusLost(evt);
            }
        });
        btn_detPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_detProMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_detProMouseEntered(evt);
            }
        });
        btn_detPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_detProKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_prodet_menuLayout = new javax.swing.GroupLayout(panel_prodet_menu);
        panel_prodet_menu.setLayout(panel_prodet_menuLayout);
        panel_prodet_menuLayout.setHorizontalGroup(
            panel_prodet_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_prodet_menuLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(panel_prodet_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(indicatorDetpro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_detPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        panel_prodet_menuLayout.setVerticalGroup(
            panel_prodet_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_prodet_menuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_detPro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicatorDetpro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_editpro_menu.setkBorderRadius(40);
        panel_editpro_menu.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_editpro_menu.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_editpro_menu.setOpaque(false);

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
        btn_editPro.setNextFocusableComponent(btn_detPro);
        btn_editPro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_editProFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_editProFocusLost(evt);
            }
        });
        btn_editPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editProMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_editProMouseEntered(evt);
            }
        });
        btn_editPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_editProKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_editpro_menuLayout = new javax.swing.GroupLayout(panel_editpro_menu);
        panel_editpro_menu.setLayout(panel_editpro_menuLayout);
        panel_editpro_menuLayout.setHorizontalGroup(
            panel_editpro_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_editpro_menuLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(panel_editpro_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(indicatorEditpro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_editPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        panel_editpro_menuLayout.setVerticalGroup(
            panel_editpro_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editpro_menuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_editPro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicatorEditpro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_promenuLayout = new javax.swing.GroupLayout(panel_promenu);
        panel_promenu.setLayout(panel_promenuLayout);
        panel_promenuLayout.setHorizontalGroup(
            panel_promenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_promenuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel_addpro_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_addmodal_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_editpro_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_prodet_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_promenuLayout.setVerticalGroup(
            panel_promenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_addpro_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_addmodal_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_prodet_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_editpro_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(5, 5, 5)
                .addComponent(panel_promain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_bill.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_bill.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_bill.setPreferredSize(new java.awt.Dimension(1061, 710));

        panel_billmenu.setkBorderRadius(40);
        panel_billmenu.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_billmenu.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_billmenu.setOpaque(false);

        panel_addcustmenu9.setkBorderRadius(40);
        panel_addcustmenu9.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_addcustmenu9.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_addcustmenu9.setOpaque(false);

        indicatorAddbill.setkEndColor(new java.awt.Color(209, 216, 224));
        indicatorAddbill.setkStartColor(new java.awt.Color(209, 216, 224));
        indicatorAddbill.setOpaque(false);

        javax.swing.GroupLayout indicatorAddbillLayout = new javax.swing.GroupLayout(indicatorAddbill);
        indicatorAddbill.setLayout(indicatorAddbillLayout);
        indicatorAddbillLayout.setHorizontalGroup(
            indicatorAddbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        indicatorAddbillLayout.setVerticalGroup(
            indicatorAddbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        btn_addbill.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_addbill.setText("CREATE BILL");
        btn_addbill.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_addbill.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_addbill.setkBorderRadius(20);
        btn_addbill.setkEndColor(new java.awt.Color(178, 199, 231));
        btn_addbill.setkHoverColor(new java.awt.Color(68, 82, 121));
        btn_addbill.setkHoverEndColor(new java.awt.Color(68, 82, 121));
        btn_addbill.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_addbill.setkHoverStartColor(new java.awt.Color(68, 82, 121));
        btn_addbill.setkPressedColor(new java.awt.Color(68, 82, 121));
        btn_addbill.setkSelectedColor(new java.awt.Color(68, 82, 121));
        btn_addbill.setkStartColor(new java.awt.Color(178, 199, 231));
        btn_addbill.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_addbillFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_addbillFocusLost(evt);
            }
        });
        btn_addbill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addbillMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_addbillMouseEntered(evt);
            }
        });
        btn_addbill.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_addbillKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_addcustmenu9Layout = new javax.swing.GroupLayout(panel_addcustmenu9);
        panel_addcustmenu9.setLayout(panel_addcustmenu9Layout);
        panel_addcustmenu9Layout.setHorizontalGroup(
            panel_addcustmenu9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcustmenu9Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_addcustmenu9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indicatorAddbill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_addbill, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_addcustmenu9Layout.setVerticalGroup(
            panel_addcustmenu9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcustmenu9Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_addbill, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicatorAddbill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_addcustmenu11.setkBorderRadius(40);
        panel_addcustmenu11.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_addcustmenu11.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_addcustmenu11.setOpaque(false);

        indicator_updt_bill.setkEndColor(new java.awt.Color(209, 216, 224));
        indicator_updt_bill.setkStartColor(new java.awt.Color(209, 216, 224));
        indicator_updt_bill.setOpaque(false);

        javax.swing.GroupLayout indicator_updt_billLayout = new javax.swing.GroupLayout(indicator_updt_bill);
        indicator_updt_bill.setLayout(indicator_updt_billLayout);
        indicator_updt_billLayout.setHorizontalGroup(
            indicator_updt_billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );
        indicator_updt_billLayout.setVerticalGroup(
            indicator_updt_billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        btn_updtbill.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_updtbill.setText("UPDATE BILL");
        btn_updtbill.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_updtbill.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_updtbill.setkBorderRadius(20);
        btn_updtbill.setkEndColor(new java.awt.Color(178, 199, 231));
        btn_updtbill.setkHoverEndColor(new java.awt.Color(68, 82, 121));
        btn_updtbill.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_updtbill.setkHoverStartColor(new java.awt.Color(68, 82, 121));
        btn_updtbill.setkPressedColor(new java.awt.Color(68, 82, 121));
        btn_updtbill.setkStartColor(new java.awt.Color(178, 199, 231));
        btn_updtbill.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_updtbillFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_updtbillFocusLost(evt);
            }
        });
        btn_updtbill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_updtbillMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_updtbillMouseEntered(evt);
            }
        });
        btn_updtbill.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_updtbillKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_addcustmenu11Layout = new javax.swing.GroupLayout(panel_addcustmenu11);
        panel_addcustmenu11.setLayout(panel_addcustmenu11Layout);
        panel_addcustmenu11Layout.setHorizontalGroup(
            panel_addcustmenu11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcustmenu11Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_addcustmenu11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indicator_updt_bill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_updtbill, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_addcustmenu11Layout.setVerticalGroup(
            panel_addcustmenu11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcustmenu11Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_updtbill, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicator_updt_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_addcustmenu16.setkBorderRadius(40);
        panel_addcustmenu16.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_addcustmenu16.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_addcustmenu16.setOpaque(false);

        indicatorDetpro1.setkEndColor(new java.awt.Color(209, 216, 224));
        indicatorDetpro1.setkStartColor(new java.awt.Color(209, 216, 224));
        indicatorDetpro1.setOpaque(false);

        javax.swing.GroupLayout indicatorDetpro1Layout = new javax.swing.GroupLayout(indicatorDetpro1);
        indicatorDetpro1.setLayout(indicatorDetpro1Layout);
        indicatorDetpro1Layout.setHorizontalGroup(
            indicatorDetpro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        indicatorDetpro1Layout.setVerticalGroup(
            indicatorDetpro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btn_detPro1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_detPro1.setText("PRODUCT DETAILS");
        btn_detPro1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_detPro1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_detPro1.setkBorderRadius(20);
        btn_detPro1.setkEndColor(new java.awt.Color(178, 199, 231));
        btn_detPro1.setkHoverEndColor(new java.awt.Color(68, 82, 121));
        btn_detPro1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_detPro1.setkHoverStartColor(new java.awt.Color(68, 82, 121));
        btn_detPro1.setkPressedColor(new java.awt.Color(68, 82, 121));
        btn_detPro1.setkStartColor(new java.awt.Color(178, 199, 231));
        btn_detPro1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_detPro1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_detPro1FocusLost(evt);
            }
        });
        btn_detPro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_detPro1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_detPro1MouseEntered(evt);
            }
        });
        btn_detPro1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_detPro1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_addcustmenu16Layout = new javax.swing.GroupLayout(panel_addcustmenu16);
        panel_addcustmenu16.setLayout(panel_addcustmenu16Layout);
        panel_addcustmenu16Layout.setHorizontalGroup(
            panel_addcustmenu16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addcustmenu16Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(panel_addcustmenu16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(indicatorDetpro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_detPro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        panel_addcustmenu16Layout.setVerticalGroup(
            panel_addcustmenu16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcustmenu16Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_detPro1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicatorDetpro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_addcustmenu17.setkBorderRadius(40);
        panel_addcustmenu17.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_addcustmenu17.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_addcustmenu17.setOpaque(false);

        indicator_bill_det.setkEndColor(new java.awt.Color(209, 216, 224));
        indicator_bill_det.setkStartColor(new java.awt.Color(209, 216, 224));
        indicator_bill_det.setOpaque(false);

        javax.swing.GroupLayout indicator_bill_detLayout = new javax.swing.GroupLayout(indicator_bill_det);
        indicator_bill_det.setLayout(indicator_bill_detLayout);
        indicator_bill_detLayout.setHorizontalGroup(
            indicator_bill_detLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        indicator_bill_detLayout.setVerticalGroup(
            indicator_bill_detLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btn_billdet.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_billdet.setText("BILL DETAIL");
        btn_billdet.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_billdet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_billdet.setkBorderRadius(20);
        btn_billdet.setkEndColor(new java.awt.Color(178, 199, 231));
        btn_billdet.setkHoverEndColor(new java.awt.Color(68, 82, 121));
        btn_billdet.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_billdet.setkHoverStartColor(new java.awt.Color(68, 82, 121));
        btn_billdet.setkPressedColor(new java.awt.Color(68, 82, 121));
        btn_billdet.setkStartColor(new java.awt.Color(178, 199, 231));
        btn_billdet.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_billdetFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_billdetFocusLost(evt);
            }
        });
        btn_billdet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_billdetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_billdetMouseEntered(evt);
            }
        });
        btn_billdet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_billdetKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_addcustmenu17Layout = new javax.swing.GroupLayout(panel_addcustmenu17);
        panel_addcustmenu17.setLayout(panel_addcustmenu17Layout);
        panel_addcustmenu17Layout.setHorizontalGroup(
            panel_addcustmenu17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addcustmenu17Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(panel_addcustmenu17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(indicator_bill_det, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_billdet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        panel_addcustmenu17Layout.setVerticalGroup(
            panel_addcustmenu17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcustmenu17Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_billdet, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicator_bill_det, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_billmenuLayout = new javax.swing.GroupLayout(panel_billmenu);
        panel_billmenu.setLayout(panel_billmenuLayout);
        panel_billmenuLayout.setHorizontalGroup(
            panel_billmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_billmenuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel_addcustmenu9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_addcustmenu11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_addcustmenu17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_addcustmenu16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 149, Short.MAX_VALUE))
        );
        panel_billmenuLayout.setVerticalGroup(
            panel_billmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_addcustmenu9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_addcustmenu11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_addcustmenu16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_addcustmenu17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_billmain.setkBorderRadius(40);
        panel_billmain.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_billmain.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_billmain.setOpaque(false);

        panel_createbill.setkBorderRadius(40);
        panel_createbill.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_createbill.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_createbill.setOpaque(false);

        loginBtn15.setBorder(null);
        loginBtn15.setText("Calculate");
        loginBtn15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn15.setkBorderRadius(30);
        loginBtn15.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn15.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        loginBtn15.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn15.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        loginBtn15.setkStartColor(new java.awt.Color(68, 82, 121));
        loginBtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtn15ActionPerformed(evt);
            }
        });

        combo_add_pro_brand2.setBackground(new java.awt.Color(228, 235, 246));
        combo_add_pro_brand2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Customer ID", "John", "Mark", "Elon" }));
        combo_add_pro_brand2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        combo_add_pro_brand3.setBackground(new java.awt.Color(228, 235, 246));
        combo_add_pro_brand3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Shop Name", "A001", "A002" }));
        combo_add_pro_brand3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        combo_add_pro_brand4.setBackground(new java.awt.Color(228, 235, 246));
        combo_add_pro_brand4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Product Model", "John", "Mark", "Elon" }));
        combo_add_pro_brand4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        combo_add_pro_brand5.setBackground(new java.awt.Color(228, 235, 246));
        combo_add_pro_brand5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Product ID", "John", "Mark", "Elon" }));
        combo_add_pro_brand5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        combo_add_pro_brand6.setBackground(new java.awt.Color(228, 235, 246));
        combo_add_pro_brand6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BRAND", "John", "Mark", "Elon" }));
        combo_add_pro_brand6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        combo_add_pro_brand7.setBackground(new java.awt.Color(228, 235, 246));
        combo_add_pro_brand7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CATERGORY", "John", "Mark", "Elon" }));
        combo_add_pro_brand7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(jTable2);

        combo_add_pro_brand8.setBackground(new java.awt.Color(228, 235, 246));
        combo_add_pro_brand8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "QTY", "John", "Mark", "Elon" }));
        combo_add_pro_brand8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CUSTOMER DETAIL");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Product Detail");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        combo_add_pro_brand9.setBackground(new java.awt.Color(228, 235, 246));
        combo_add_pro_brand9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EMAIL", "A001", "A002" }));
        combo_add_pro_brand9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        combo_add_pro_brand10.setBackground(new java.awt.Color(228, 235, 246));
        combo_add_pro_brand10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EMAIL", "A001", "A002" }));
        combo_add_pro_brand10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        combo_add_pro_brand11.setBackground(new java.awt.Color(228, 235, 246));
        combo_add_pro_brand11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EMAIL", "A001", "A002" }));
        combo_add_pro_brand11.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel10.setText("BILL NO.");

        javax.swing.GroupLayout panel_createbillLayout = new javax.swing.GroupLayout(panel_createbill);
        panel_createbill.setLayout(panel_createbillLayout);
        panel_createbillLayout.setHorizontalGroup(
            panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panel_createbillLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_createbillLayout.createSequentialGroup()
                        .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(combo_add_pro_brand2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(combo_add_pro_brand3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combo_add_pro_brand9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combo_add_pro_brand10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_createbillLayout.createSequentialGroup()
                        .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_createbillLayout.createSequentialGroup()
                                .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_createbillLayout.createSequentialGroup()
                                        .addComponent(combo_add_pro_brand8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(combo_add_pro_brand5, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(combo_add_pro_brand6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_createbillLayout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(combo_add_pro_brand4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(combo_add_pro_brand7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_createbillLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(combo_add_pro_brand11, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_createbillLayout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(loginBtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panel_createbillLayout.createSequentialGroup()
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panel_createbillLayout.createSequentialGroup()
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 1011, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panel_createbillLayout.setVerticalGroup(
            panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_createbillLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_add_pro_brand2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_add_pro_brand3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_add_pro_brand9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_add_pro_brand10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_add_pro_brand4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_add_pro_brand7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_add_pro_brand11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_add_pro_brand6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo_add_pro_brand8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_add_pro_brand5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loginBtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        panel_updatbill.setkBorderRadius(40);
        panel_updatbill.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_updatbill.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_updatbill.setOpaque(false);
        panel_updatbill.setPreferredSize(new java.awt.Dimension(1011, 610));

        javax.swing.GroupLayout panel_updatbillLayout = new javax.swing.GroupLayout(panel_updatbill);
        panel_updatbill.setLayout(panel_updatbillLayout);
        panel_updatbillLayout.setHorizontalGroup(
            panel_updatbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1011, Short.MAX_VALUE)
        );
        panel_updatbillLayout.setVerticalGroup(
            panel_updatbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        panel_detbill.setkBorderRadius(40);
        panel_detbill.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_detbill.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_detbill.setOpaque(false);

        javax.swing.GroupLayout panel_detbillLayout = new javax.swing.GroupLayout(panel_detbill);
        panel_detbill.setLayout(panel_detbillLayout);
        panel_detbillLayout.setHorizontalGroup(
            panel_detbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1011, Short.MAX_VALUE)
        );
        panel_detbillLayout.setVerticalGroup(
            panel_detbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        panel_extrabill.setkBorderRadius(40);
        panel_extrabill.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_extrabill.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_extrabill.setOpaque(false);

        javax.swing.GroupLayout panel_extrabillLayout = new javax.swing.GroupLayout(panel_extrabill);
        panel_extrabill.setLayout(panel_extrabillLayout);
        panel_extrabillLayout.setHorizontalGroup(
            panel_extrabillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1011, Short.MAX_VALUE)
        );
        panel_extrabillLayout.setVerticalGroup(
            panel_extrabillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_billmainLayout = new javax.swing.GroupLayout(panel_billmain);
        panel_billmain.setLayout(panel_billmainLayout);
        panel_billmainLayout.setHorizontalGroup(
            panel_billmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_billmainLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panel_createbill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(panel_billmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_billmainLayout.createSequentialGroup()
                    .addContainerGap(25, Short.MAX_VALUE)
                    .addComponent(panel_detbill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25)))
            .addGroup(panel_billmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_billmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_extrabill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
            .addGroup(panel_billmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_billmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_updatbill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );
        panel_billmainLayout.setVerticalGroup(
            panel_billmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_billmainLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panel_createbill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(panel_billmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_billmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_detbill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
            .addGroup(panel_billmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_billmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_extrabill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
            .addGroup(panel_billmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_billmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_updatbill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panel_billLayout = new javax.swing.GroupLayout(panel_bill);
        panel_bill.setLayout(panel_billLayout);
        panel_billLayout.setHorizontalGroup(
            panel_billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_billmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_billmain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_billLayout.setVerticalGroup(
            panel_billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_billLayout.createSequentialGroup()
                .addComponent(panel_billmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
            .addGroup(panel_billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_billLayout.createSequentialGroup()
                    .addGap(0, 50, Short.MAX_VALUE)
                    .addComponent(panel_billmain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
//        visibility(evt.getKeyCode(), lbl_user, false, false, false, false, false, true, false);
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
//        visibility(evt.getKeyCode(), lbl_account, false, false, false, false, true, false, false);
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
        visibility(evt.getKeyCode(), btn_addpro, false, false, false, true, false, false, false);
        //visibility(panel_addpro, true, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, false);
        indicatorOn(indicatorAddpro, indicatorAddmodal, indicatorEditpro, indicatorDetpro);
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
        visibility(evt.getKeyCode(), btn_addpro, false, false, true, false, false, false, false);
        visibility(panel_addpro, true, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, false);
        indicatorOn(indicatorAddpro, indicatorAddmodal, indicatorEditpro, indicatorDetpro);
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
        visibility(btn_addpro, false, false, true, false, false, false, false);
        HoverColor(pnl_product, lbl_product, Color.WHITE, Color.WHITE, Color.BLACK);
        visibility(panel_addpro, true, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, false);
        indicator(indicatorAddpro, indicatorAddmodal, indicatorEditpro, indicatorDetpro);
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
        visibility(evt.getKeyCode(), btn_addemp, false, true, false, false, false, false, false);
        visibility(panel_addemp, true, panel_editemp, false, panel_detemp, false, panel_empextra, false);
        indicatorOn(indicatorAddemp, indicatorEditemp, indicatorEmpdet);
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
        visibility(btn_addemp, false, true, false, false, false, false, false);
        HoverColor(pnl_employee, lbl_employee, Color.WHITE, Color.WHITE, Color.BLACK);
        visibility(panel_addemp, true, panel_editemp, false, panel_detemp, false, panel_empextra, false);

        indicator(indicatorAddemp, indicatorEditemp, indicatorEmpdet);
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
        visibility(evt.getKeyCode(), btn_addcust, true, false, false, false, false, false, false);
        visibility(panel_addcust, true, panel_editcus, false, panel_custdetail, false);
        indicatorOn(indicatorAddcust, indicatorEditcust, indicatorDetcust);
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
        visibility(btn_addcust, true, false, false, false, false, false, false);
        visibility(panel_addcust, true, panel_editcus, false, panel_custdetail, false);
        HoverColor(pnl_customer, lbl_customer, Color.WHITE, Color.WHITE, Color.BLACK);

        indicator(indicatorAddcust, indicatorEditcust, indicatorDetcust);
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
//        escape(lbl_empdet, evt.getKeyCode());
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
//        visibility(lbl_addpro, false, false, true, false, false, false, false);
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

    private void btn_addempFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_addempFocusGained
        HoverColor(btn_addemp, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addempFocusGained

    private void btn_addempFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_addempFocusLost
        HoverColor(btn_addemp, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addempFocusLost

    private void btn_addempMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addempMouseClicked
        visibility(txt_add_empid, panel_addemp, true, panel_editemp, false, panel_detemp, false);
        indicatorOn(indicatorAddemp, indicatorEditemp, indicatorEmpdet);
        HoverColor(btn_addemp, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addempMouseClicked

    private void btn_addempKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_addempKeyPressed
        visibility(txt_add_empid, panel_addemp, true, panel_editemp, false, panel_detemp, false);

        escape(lbl_employee, evt.getKeyCode(), panel_employee);
        HoverColor(btn_addemp, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addempKeyPressed

    private void btn_editempFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_editempFocusGained
        HoverColor(btn_editemp, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_editempFocusGained

    private void btn_editempFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_editempFocusLost
        HoverColor(btn_editemp, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_editempFocusLost

    private void btn_editempMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editempMouseClicked
        visibility(txt_edit_empnm, panel_addemp, false, panel_editemp, true, panel_detemp, false);
        indicatorOn(indicatorEditemp, indicatorAddemp, indicatorEmpdet);
        HoverColor(btn_editemp, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_editempMouseClicked

    private void btn_editempKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_editempKeyPressed
        visibility(txt_edit_empnm, panel_addemp, false, panel_editemp, true, panel_detemp, false);

        escape(lbl_employee, evt.getKeyCode(), panel_employee);
        indicatorOn(indicatorEditemp, indicatorAddemp, indicatorEmpdet);
        HoverColor(btn_editemp, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_editempKeyPressed

    private void btn_empdetFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_empdetFocusGained
        HoverColor(btn_empdet, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_empdetFocusGained

    private void btn_empdetFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_empdetFocusLost
        HoverColor(btn_empdet, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_empdetFocusLost

    private void btn_empdetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_empdetMouseClicked
        visibility(txt_det_empid, panel_addemp, false, panel_editemp, false, panel_detemp, true);

        indicatorOn(indicatorEmpdet, indicatorAddemp, indicatorEditemp);
        HoverColor(btn_empdet, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_empdetMouseClicked

    private void btn_empdetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_empdetKeyPressed
        visibility(txt_det_empid, panel_addemp, false, panel_editemp, false, panel_detemp, true);

        escape(lbl_employee, evt.getKeyCode(), panel_employee);
        indicatorOn(indicatorEmpdet, indicatorAddemp, indicatorEditemp);
        HoverColor(btn_empdet, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_empdetKeyPressed

    private void btn_addcustMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addcustMouseClicked
        visibility(txt_add_custid, panel_addcust, true, panel_editcus, false, panel_custdetail, false);
        indicatorOn(indicatorAddcust, indicatorEditcust, indicatorDetcust);
        HoverColor(btn_editcust, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addcustMouseClicked

    private void btn_addcustKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_addcustKeyPressed
        visibility(txt_add_custid, panel_addcust, true, panel_editcus, false, panel_custdetail, false);

        escape(lbl_customer, evt.getKeyCode(), panel_customer);
        HoverColor(btn_addcust, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addcustKeyPressed

    private void btn_editcustMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editcustMouseClicked
        visibility(txt_edit_custnm, panel_addcust, false, panel_editcus, true, panel_custdetail, false);
        indicatorOn(indicatorEditcust, indicatorAddcust, indicatorDetcust);
        HoverColor(btn_editcust, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_editcustMouseClicked

    private void btn_editcustKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_editcustKeyPressed
        visibility(txt_edit_custnm, panel_addcust, false, panel_editcus, true, panel_custdetail, false);

        escape(lbl_customer, evt.getKeyCode(), panel_customer);
        indicatorOn(indicatorEditcust, indicatorAddcust, indicatorDetcust);
        HoverColor(btn_editcust, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_editcustKeyPressed

    private void btn_detcustMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_detcustMouseClicked
        visibility(txt_det_custid, panel_addcust, false, panel_editcus, false, panel_custdetail, true);
        indicatorOn(indicatorDetcust, indicatorAddcust, indicatorEditcust);
        HoverColor(btn_detcust, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_detcustMouseClicked

    private void btn_detcustKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_detcustKeyPressed
        visibility(txt_det_custid, panel_addcust, false, panel_editcus, false, panel_custdetail, true);

        escape(lbl_customer, evt.getKeyCode(), panel_customer);
        indicatorOn(indicatorDetcust, indicatorAddcust, indicatorEditcust);
        HoverColor(btn_detcust, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_detcustKeyPressed

    private void btn_addproFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_addproFocusGained
        HoverColor(btn_addpro, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addproFocusGained

    private void btn_addproFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_addproFocusLost
        HoverColor(btn_addpro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addproFocusLost

    private void btn_addproMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addproMouseClicked
        visibility(txt_add_pro_id, panel_addpro, true, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, false);
        indicatorOn(indicatorAddpro, indicatorAddmodal, indicatorEditpro, indicatorDetpro);
        HoverColor(btn_addpro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addproMouseClicked

    private void btn_addproKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_addproKeyPressed
        visibility(txt_add_pro_id, panel_addpro, true, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, false);

        escape(lbl_product, evt.getKeyCode(), panel_product);
        HoverColor(btn_addpro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addproKeyPressed

    private void btn_detProFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_detProFocusGained
        HoverColor(btn_detPro, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_detProFocusGained

    private void btn_detProFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_detProFocusLost
        HoverColor(btn_detPro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_detProFocusLost

    private void btn_detProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_detProMouseClicked
        visibility(jTextField3, panel_addpro, false, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, true, panel_pro_fulldet, false);
        indicatorOn(indicatorDetpro, indicatorAddpro, indicatorAddmodal, indicatorEditpro);
        HoverColor(btn_detPro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_detProMouseClicked

    private void btn_detProKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_detProKeyPressed
        visibility(jTextField3, panel_addpro, false, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, true, panel_pro_fulldet, false);

        escape(lbl_product, evt.getKeyCode(), panel_product);
        indicatorOn(indicatorDetpro, indicatorAddpro, indicatorAddmodal, indicatorEditpro);
        HoverColor(btn_detPro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_detProKeyPressed

    private void btn_addempMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addempMouseEntered
        btn_addemp.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_addempMouseEntered

    private void btn_editempMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editempMouseEntered
        btn_editemp.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_editempMouseEntered

    private void btn_empdetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_empdetMouseEntered
        btn_empdet.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_empdetMouseEntered

    private void btn_addcustMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addcustMouseEntered
        btn_addcust.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_addcustMouseEntered

    private void btn_editcustMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editcustMouseEntered
        btn_editcust.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_editcustMouseEntered

    private void btn_detcustMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_detcustMouseEntered
        btn_detcust.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_detcustMouseEntered

    private void btn_addproMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addproMouseEntered
        btn_addpro.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_addproMouseEntered

    private void btn_detProMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_detProMouseEntered
        btn_detPro.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_detProMouseEntered

    private void btn_detcustFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_detcustFocusLost
        HoverColor(btn_detcust, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_detcustFocusLost

    private void btn_detcustFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_detcustFocusGained
        HoverColor(btn_detcust, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_detcustFocusGained

    private void btn_editcustFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_editcustFocusLost
        HoverColor(btn_editcust, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_editcustFocusLost

    private void btn_editcustFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_editcustFocusGained
        HoverColor(btn_editcust, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_editcustFocusGained

    private void btn_addcustFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_addcustFocusLost
        HoverColor(btn_addcust, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addcustFocusLost

    private void btn_addcustFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_addcustFocusGained
        HoverColor(btn_addcust, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addcustFocusGained

    private void btn_addmodalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_addmodalKeyPressed
        visibility(txt_add_promcb_brand_id, panel_addpro, false, panel_addpro_mcb, true, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, false);

        escape(lbl_product, evt.getKeyCode(), panel_product);
        indicatorOn(indicatorAddmodal, indicatorAddpro, indicatorEditpro, indicatorDetpro);
        HoverColor(btn_addmodal, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addmodalKeyPressed

    private void btn_addmodalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addmodalMouseEntered
        btn_addmodal.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_addmodalMouseEntered

    private void btn_addmodalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addmodalMouseClicked
        visibility(txt_add_promcb_brand_id, panel_addpro, false, panel_addpro_mcb, true, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, false);
        indicatorOn(indicatorAddmodal, indicatorAddpro, indicatorEditpro, indicatorDetpro);
        HoverColor(btn_addmodal, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addmodalMouseClicked

    private void btn_addmodalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_addmodalFocusLost
        HoverColor(btn_addmodal, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addmodalFocusLost

    private void btn_addmodalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_addmodalFocusGained
        HoverColor(btn_addmodal, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addmodalFocusGained

    private void btn_editProFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_editProFocusGained
        HoverColor(btn_editPro, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_editProFocusGained

    private void btn_editProFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_editProFocusLost
        HoverColor(btn_editPro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_editProFocusLost

    private void btn_editProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editProMouseClicked
        visibility(jTextField2, panel_addpro, false, panel_addpro_mcb, false, panel_editpro, true, panel_prodet, false, panel_pro_fulldet, false);
        indicatorOn(indicatorEditpro, indicatorAddpro, indicatorAddmodal, indicatorDetpro);
        HoverColor(btn_editPro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_editProMouseClicked

    private void btn_editProMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editProMouseEntered
        btn_editPro.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_editProMouseEntered

    private void btn_editProKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_editProKeyPressed
        visibility(jTextField2, panel_addpro, false, panel_addpro_mcb, false, panel_editpro, true, panel_prodet, false, panel_pro_fulldet, false);

        escape(lbl_product, evt.getKeyCode(), panel_product);
        indicatorOn(indicatorEditpro, indicatorAddpro, indicatorAddmodal, indicatorDetpro);
        HoverColor(btn_editPro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_editProKeyPressed

    private void loginBtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtn13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtn13ActionPerformed

    private void loginBtn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtn14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtn14ActionPerformed

    private void txt_add_promcb_model_id1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txt_add_promcb_model_id1ActionPerformed
    {//GEN-HEADEREND:event_txt_add_promcb_model_id1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_add_promcb_model_id1ActionPerformed

    private void loginBtn9ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_loginBtn9ActionPerformed
    {//GEN-HEADEREND:event_loginBtn9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtn9ActionPerformed

    private void loginBtn7ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_loginBtn7ActionPerformed
    {//GEN-HEADEREND:event_loginBtn7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtn7ActionPerformed

    private void lbl_add_proaddimg1MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_proaddimg1MouseExited
    {//GEN-HEADEREND:event_lbl_add_proaddimg1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_add_proaddimg1MouseExited

    private void lbl_add_proaddimg1MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_proaddimg1MouseEntered
    {//GEN-HEADEREND:event_lbl_add_proaddimg1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_add_proaddimg1MouseEntered

    private void lbl_add_prormimg1MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_prormimg1MouseExited
    {//GEN-HEADEREND:event_lbl_add_prormimg1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_add_prormimg1MouseExited

    private void lbl_add_prormimg1MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_prormimg1MouseEntered
    {//GEN-HEADEREND:event_lbl_add_prormimg1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_add_prormimg1MouseEntered

    private void txt_det_custidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_det_custidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_det_custidActionPerformed

    private void btn_addbillFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_addbillFocusGained
    {//GEN-HEADEREND:event_btn_addbillFocusGained
        HoverColor(btn_addpro, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addbillFocusGained

    private void btn_addbillFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_addbillFocusLost
    {//GEN-HEADEREND:event_btn_addbillFocusLost
        HoverColor(btn_addpro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addbillFocusLost

    private void btn_addbillMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_addbillMouseClicked
    {//GEN-HEADEREND:event_btn_addbillMouseClicked
        visibility(txt_add_pro_id, panel_addpro, true, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, false);
        indicatorOn(indicatorAddpro, indicatorAddmodal, indicatorEditpro, indicatorDetpro);
        HoverColor(btn_addpro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addbillMouseClicked

    private void btn_addbillMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_addbillMouseEntered
    {//GEN-HEADEREND:event_btn_addbillMouseEntered
        btn_addbill.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_addbillMouseEntered

    private void btn_addbillKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_addbillKeyPressed
    {//GEN-HEADEREND:event_btn_addbillKeyPressed
        visibility(txt_add_pro_id, panel_addpro, true, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, false);

        escape(lbl_product, evt.getKeyCode(), panel_product);
        HoverColor(btn_addpro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addbillKeyPressed

    private void btn_updtbillFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_updtbillFocusGained
    {//GEN-HEADEREND:event_btn_updtbillFocusGained
        HoverColor(btn_addmodal, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_updtbillFocusGained

    private void btn_updtbillFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_updtbillFocusLost
    {//GEN-HEADEREND:event_btn_updtbillFocusLost
        HoverColor(btn_addmodal, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_updtbillFocusLost

    private void btn_updtbillMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_updtbillMouseClicked
    {//GEN-HEADEREND:event_btn_updtbillMouseClicked
        visibility(txt_add_promcb_brand_id, panel_addpro, false, panel_addpro_mcb, true, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, false);
        indicatorOn(indicatorAddmodal, indicatorAddpro, indicatorEditpro, indicatorDetpro);
        HoverColor(btn_addmodal, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_updtbillMouseClicked

    private void btn_updtbillMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_updtbillMouseEntered
    {//GEN-HEADEREND:event_btn_updtbillMouseEntered
        btn_updtbill.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_updtbillMouseEntered

    private void btn_updtbillKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_updtbillKeyPressed
    {//GEN-HEADEREND:event_btn_updtbillKeyPressed
        visibility(txt_add_promcb_brand_id, panel_addpro, false, panel_addpro_mcb, true, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, false);

        escape(lbl_product, evt.getKeyCode(), panel_product);
        indicatorOn(indicatorAddmodal, indicatorAddpro, indicatorEditpro, indicatorDetpro);
        HoverColor(btn_addmodal, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_updtbillKeyPressed

    private void btn_detPro1FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_detPro1FocusGained
    {//GEN-HEADEREND:event_btn_detPro1FocusGained
        HoverColor(btn_detPro, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_detPro1FocusGained

    private void btn_detPro1FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_detPro1FocusLost
    {//GEN-HEADEREND:event_btn_detPro1FocusLost
        HoverColor(btn_detPro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_detPro1FocusLost

    private void btn_detPro1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_detPro1MouseClicked
    {//GEN-HEADEREND:event_btn_detPro1MouseClicked
        visibility(jTextField3, panel_addpro, false, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, true, panel_pro_fulldet, false);
        indicatorOn(indicatorDetpro, indicatorAddpro, indicatorAddmodal, indicatorEditpro);
        HoverColor(btn_detPro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_detPro1MouseClicked

    private void btn_detPro1MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_detPro1MouseEntered
    {//GEN-HEADEREND:event_btn_detPro1MouseEntered
        btn_detPro1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_detPro1MouseEntered

    private void btn_detPro1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_detPro1KeyPressed
    {//GEN-HEADEREND:event_btn_detPro1KeyPressed
        visibility(jTextField3, panel_addpro, false, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, true, panel_pro_fulldet, false);

        escape(lbl_product, evt.getKeyCode(), panel_product);
        indicatorOn(indicatorDetpro, indicatorAddpro, indicatorAddmodal, indicatorEditpro);
        HoverColor(btn_detPro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_detPro1KeyPressed

    private void btn_billdetFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_billdetFocusGained
    {//GEN-HEADEREND:event_btn_billdetFocusGained
        HoverColor(btn_editPro, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_billdetFocusGained

    private void btn_billdetFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_billdetFocusLost
    {//GEN-HEADEREND:event_btn_billdetFocusLost
        HoverColor(btn_editPro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_billdetFocusLost

    private void btn_billdetMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_billdetMouseClicked
    {//GEN-HEADEREND:event_btn_billdetMouseClicked
        visibility(jTextField2, panel_addpro, false, panel_addpro_mcb, false, panel_editpro, true, panel_prodet, false, panel_pro_fulldet, false);
        indicatorOn(indicatorEditpro, indicatorAddpro, indicatorAddmodal, indicatorDetpro);
        HoverColor(btn_editPro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_billdetMouseClicked

    private void btn_billdetMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_billdetMouseEntered
    {//GEN-HEADEREND:event_btn_billdetMouseEntered
        btn_billdet.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_billdetMouseEntered

    private void btn_billdetKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_billdetKeyPressed
    {//GEN-HEADEREND:event_btn_billdetKeyPressed
        visibility(jTextField2, panel_addpro, false, panel_addpro_mcb, false, panel_editpro, true, panel_prodet, false, panel_pro_fulldet, false);

        escape(lbl_product, evt.getKeyCode(), panel_product);
        indicatorOn(indicatorEditpro, indicatorAddpro, indicatorAddmodal, indicatorDetpro);
        HoverColor(btn_editPro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_billdetKeyPressed

    private void loginBtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtn15ActionPerformed
        NewJFrame obj = new NewJFrame();
        obj.setVisible(true);
    }//GEN-LAST:event_loginBtn15ActionPerformed

    private void txt_add_custidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_custidKeyPressed
        escape(btn_addcust, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_custidKeyPressed

    private void txt_add_custnmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_custnmKeyPressed
        escape(btn_addcust, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_custnmKeyPressed

    private void txt_add_custnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_custnoKeyPressed
        escape(btn_addcust, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_custnoKeyPressed

    private void txt_add_custemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_custemailKeyPressed
        escape(btn_addcust, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_custemailKeyPressed

    private void txt_add_custsnmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_custsnmKeyPressed
        escape(btn_addcust, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_custsnmKeyPressed

    private void txt_add_custsnm1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_custsnm1KeyPressed
        escape(btn_addcust, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_custsnm1KeyPressed

    private void txt_add_custsnm2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_custsnm2KeyPressed
        escape(btn_addcust, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_custsnm2KeyPressed

    private void txt_edit_custnmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edit_custnmKeyPressed
        escape(btn_editcust, evt.getKeyCode());
    }//GEN-LAST:event_txt_edit_custnmKeyPressed

    private void txt_edit_custnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edit_custnoKeyPressed
        escape(btn_editcust, evt.getKeyCode());
    }//GEN-LAST:event_txt_edit_custnoKeyPressed

    private void txt_edit_custemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edit_custemailKeyPressed
        escape(btn_editcust, evt.getKeyCode());
    }//GEN-LAST:event_txt_edit_custemailKeyPressed

    private void txt_edit_custsnmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edit_custsnmKeyPressed
        escape(btn_editcust, evt.getKeyCode());
    }//GEN-LAST:event_txt_edit_custsnmKeyPressed

    private void txt_edit_custsaddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edit_custsaddKeyPressed
        escape(btn_editcust, evt.getKeyCode());
    }//GEN-LAST:event_txt_edit_custsaddKeyPressed

    private void txt_det_custidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_det_custidKeyPressed
        escape(btn_detcust, evt.getKeyCode());
    }//GEN-LAST:event_txt_det_custidKeyPressed

    private void txt_add_empidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_empidKeyPressed
        escape(btn_addemp, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_empidKeyPressed

    private void txt_add_empnmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_empnmKeyPressed
        escape(btn_addemp, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_empnmKeyPressed

    private void txt_add_empnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_empnoKeyPressed
        escape(btn_addemp, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_empnoKeyPressed

    private void txt_add_empemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_empemailKeyPressed
        escape(btn_addemp, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_empemailKeyPressed

    private void txt_add_empsalaryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_empsalaryKeyPressed
        escape(btn_addemp, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_empsalaryKeyPressed

    private void txt_add_empaddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_empaddKeyPressed
        escape(btn_addemp, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_empaddKeyPressed

    private void txt_edit_empnmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edit_empnmKeyPressed
        escape(btn_editemp, evt.getKeyCode());
    }//GEN-LAST:event_txt_edit_empnmKeyPressed

    private void txt_edit_empnm1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edit_empnm1KeyPressed
        escape(btn_editemp, evt.getKeyCode());
    }//GEN-LAST:event_txt_edit_empnm1KeyPressed

    private void txt_edit_empemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edit_empemailKeyPressed
        escape(btn_editemp, evt.getKeyCode());
    }//GEN-LAST:event_txt_edit_empemailKeyPressed

    private void txt_edit_empsalaryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edit_empsalaryKeyPressed
        escape(btn_editemp, evt.getKeyCode());
    }//GEN-LAST:event_txt_edit_empsalaryKeyPressed

    private void txt_edit_empaddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edit_empaddKeyPressed
        escape(btn_editemp, evt.getKeyCode());
    }//GEN-LAST:event_txt_edit_empaddKeyPressed

    private void txt_det_empidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_det_empidKeyPressed
        escape(btn_empdet, evt.getKeyCode());
    }//GEN-LAST:event_txt_det_empidKeyPressed

    private void txt_add_pro_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_pro_idKeyPressed
        escape(btn_addpro, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_pro_idKeyPressed

    private void txt_add_pro_id1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_pro_id1KeyPressed
        escape(btn_addpro, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_pro_id1KeyPressed

    private void txt_add_pro_id2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_pro_id2KeyPressed
        escape(btn_addpro, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_pro_id2KeyPressed

    private void textArea2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textArea2KeyPressed
        escape(btn_addpro, evt.getKeyCode());
    }//GEN-LAST:event_textArea2KeyPressed

    private void txt_add_promcb_brand_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_promcb_brand_idKeyPressed
        escape(btn_addmodal, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_promcb_brand_idKeyPressed

    private void txt_add_promcb_brand_nmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_promcb_brand_nmKeyPressed
        escape(btn_addmodal, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_promcb_brand_nmKeyPressed

    private void txt_add_promcb_ctrgy_id1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_promcb_ctrgy_id1KeyPressed
        escape(btn_addmodal, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_promcb_ctrgy_id1KeyPressed

    private void txt_add_promcb_ctrgy_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_promcb_ctrgy_idKeyPressed
        escape(btn_addmodal, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_promcb_ctrgy_idKeyPressed

    private void txt_add_promcb_model_id1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_promcb_model_id1KeyPressed
        escape(btn_addmodal, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_promcb_model_id1KeyPressed

    private void txt_add_promcb_model_nm1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_promcb_model_nm1KeyPressed
        escape(btn_addmodal, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_promcb_model_nm1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        escape(btn_editPro, evt.getKeyCode());
    }//GEN-LAST:event_jTextField2KeyPressed

    private void txt_add_pro_id6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_pro_id6KeyPressed
        escape(btn_editPro, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_pro_id6KeyPressed

    private void txt_add_pro_id4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_pro_id4KeyPressed
        escape(btn_editPro, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_pro_id4KeyPressed

    private void txt_add_pro_id7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_pro_id7KeyPressed
        escape(btn_editPro, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_pro_id7KeyPressed

    private void txt_add_pro_id5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_pro_id5KeyPressed
        escape(btn_editPro, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_pro_id5KeyPressed

    private void jList1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList1KeyPressed
        escape(btn_addpro, evt.getKeyCode());
    }//GEN-LAST:event_jList1KeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_dashboard().setVisible(true);
            }
        });
    }

    public void whitespaceremover(JTextField field) {
        if (field.getText().equals(" ")) {
            String txt = field.getText().replace(" ", "");
            field.setText(txt);
        }
    }

    public void hoverColor(KGradientPanel panel, JLabel label, Color kcolor, Color bcolor, Color foreground, Font font, String text) {
        panel.setkStartColor(kcolor);
        panel.setkEndColor(kcolor);
        panel.setBackground(bcolor);
        label.setForeground(foreground);
        label.setFont(font);
        label.setText(text);
    }

    //Created by Mayank
    public void HoverColor(KButton button, Color kColor, Color bColor) {
        button.setkStartColor(kColor);
        button.setkEndColor(kColor);
        button.setkForeGround(bColor);
    }

    public void HoverColor(KGradientPanel panel, Color kColor, Color bColor) {
        panel.setkStartColor(kColor);
        panel.setkEndColor(kColor);
        panel.setBackground(bColor);
    }

    public void HoverColor(KGradientPanel panel, JLabel label, Color kColor, Color bColor, Color foreground) {
        panel.setkStartColor(kColor);
        panel.setkEndColor(kColor);
        panel.setBackground(bColor);
        label.setForeground(foreground);
    }
//    Created by Mayank

    public void indicator(KGradientPanel panel1, KGradientPanel panel2, KGradientPanel panel3) {
        //Panel 1
        panel1.setkStartColor(new Color(68, 82, 121));
        panel1.setkEndColor(new Color(68, 82, 121));
        panel1.setBackground(new Color(68, 82, 121));
        //Panel 2
        panel2.setkStartColor(new Color(209, 216, 224));
        panel2.setkEndColor(new Color(209, 216, 224));
        panel2.setBackground(new Color(209, 216, 224));

//        //Panel 3
        panel3.setkStartColor(new Color(209, 216, 224));
        panel3.setkEndColor(new Color(209, 216, 224));
        panel3.setBackground(new Color(209, 216, 224));
    }
//    Created by Mayank

    public void indicator(KGradientPanel panel1, KGradientPanel panel2, KGradientPanel panel3, KGradientPanel panel4) {
        //Panel 1
        panel1.setkStartColor(new Color(68, 82, 121));
        panel1.setkEndColor(new Color(68, 82, 121));
        panel1.setBackground(new Color(68, 82, 121));
        //Panel 2
        panel2.setkStartColor(new Color(209, 216, 224));
        panel2.setkEndColor(new Color(209, 216, 224));
        panel2.setBackground(new Color(209, 216, 224));
        //Panel 3
        panel3.setkStartColor(new Color(209, 216, 224));
        panel3.setkEndColor(new Color(209, 216, 224));
        panel3.setBackground(new Color(209, 216, 224));
        //Panel 4
        panel4.setkStartColor(new Color(209, 216, 224));
        panel4.setkEndColor(new Color(209, 216, 224));
        panel4.setBackground(new Color(209, 216, 224));
    }
//    Created by Mayank

    public void indicatorOn(KGradientPanel panel, KGradientPanel rpanel2, KGradientPanel rpanel3) {

        //panel background color
        panel.setkStartColor(new Color(68, 82, 121));
        panel.setkEndColor(new Color(68, 82, 121));
        panel.setBackground(new Color(68, 82, 121));

        //Remove indicator(2) background color
        rpanel2.setkStartColor(new Color(209, 216, 224));
        rpanel2.setkEndColor(new Color(209, 216, 224));
        rpanel2.setBackground(new Color(209, 216, 224));

        //Remove indicator(3) background color
        rpanel3.setkStartColor(new Color(209, 216, 224));
        rpanel3.setkEndColor(new Color(209, 216, 224));
        rpanel3.setBackground(new Color(209, 216, 224));
    }
//    Created by Mayank

    public void indicatorOn(KGradientPanel panel, KGradientPanel rpanel2, KGradientPanel rpanel3, KGradientPanel rpanel4) {

        //apply color in indicator
        panel.setkStartColor(new Color(68, 82, 121));
        panel.setkEndColor(new Color(68, 82, 121));
        panel.setBackground(new Color(68, 82, 121));

        //Remove indicator(2) background color
        rpanel2.setkStartColor(new Color(209, 216, 224));
        rpanel2.setkEndColor(new Color(209, 216, 224));
        rpanel2.setBackground(new Color(209, 216, 224));

        //Remove indicator(3) background color
        rpanel3.setkStartColor(new Color(209, 216, 224));
        rpanel3.setkEndColor(new Color(209, 216, 224));
        rpanel3.setBackground(new Color(209, 216, 224));

        //Remove indicator(4) background color
        rpanel4.setkStartColor(new Color(209, 216, 224));
        rpanel4.setkEndColor(new Color(209, 216, 224));
        rpanel4.setBackground(new Color(209, 216, 224));
    }

    public void escape(JLabel label, int code) {
        if (code == KeyEvent.VK_ESCAPE) {
            label.grabFocus();
        }
    }

    public void escape(KButton button, int code) {
        if (code == KeyEvent.VK_ESCAPE) {
            button.grabFocus();
        }
    }

    public void escape(JLabel label, int code, KGradientPanel panel) {
        if (code == KeyEvent.VK_ESCAPE) {
            label.grabFocus();
            panel.setVisible(false);
            panel_extra.setVisible(true);
        }
    }

    public void clearplaceholder(JTextField field, String gottext, String text) {
        if (gottext.equals(text)) {
            field.setText("");
        }
    }

    public void txtfocuslost(JTextField field, String gottext, String settext) {
        if (gottext.equals("") || gottext.equals(" ")) {
            field.setText(settext);
        }
    }

    public void screensize() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        int x = (int) tk.getScreenSize().getWidth();
        int y = (int) tk.getScreenSize().getHeight();
        Insets scnmax = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
        int taskbar = scnmax.bottom;

        this.setSize(x, y - taskbar);
    }

    public void tableheader(JTableHeader header) {
        header.setFont(new Font("Cascadia Mono", Font.PLAIN, 20));
    }

    //to call when enter key pressed
    public void visibility(int code, KButton button, boolean cust, boolean emp, boolean product, boolean bill, boolean account, boolean user, boolean extra) {
        if (code == KeyEvent.VK_ENTER) {
            panel_customer.setVisible(cust);
            panel_employee.setVisible(emp);
            panel_product.setVisible(product);
            panel_bill.setVisible(bill);
            panel_account.setVisible(account);
            panel_user.setVisible(user);
            panel_extra.setVisible(extra);
            button.grabFocus();
        }
    }

    //to call when from sidepane with mouseclick
    public void visibility(JLabel label, boolean cust, boolean emp, boolean product, boolean bill, boolean account, boolean user, boolean extra) {
        panel_customer.setVisible(cust);
        panel_employee.setVisible(emp);
        panel_product.setVisible(product);
        panel_bill.setVisible(bill);
        panel_account.setVisible(account);
        panel_user.setVisible(user);
        panel_extra.setVisible(extra);
        label.grabFocus();
    }

    public void visibility(KButton button, boolean cust, boolean emp, boolean product, boolean bill, boolean account, boolean user, boolean extra) {
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
    void visibility(int code, JTextField field, KGradientPanel add, boolean addbool, KGradientPanel edit, boolean editbool, KGradientPanel det, boolean detbool) {
        if (code == KeyEvent.VK_ENTER) {
            add.setVisible(addbool);
            edit.setVisible(editbool);
            det.setVisible(detbool);
            field.grabFocus();
        }
    }

    //while inside the main panel
    public void visibility(JTextField filed, KGradientPanel add, boolean addbool, KGradientPanel edit, boolean editbool, KGradientPanel det, boolean detbool) {
        add.setVisible(addbool);
        edit.setVisible(editbool);
        det.setVisible(detbool);
        filed.grabFocus();
    }

    //to call from sidepane
    public void visibility(KGradientPanel add, boolean addbool, KGradientPanel edit, boolean editbool, KGradientPanel det, boolean detbool) {
        add.setVisible(addbool);
        edit.setVisible(editbool);
        det.setVisible(detbool);
    }

    //to call when the enter key pressed in main panel
    void visibility(int code, JTextField field, KGradientPanel add, boolean addbool, KGradientPanel edit, boolean editbool, KGradientPanel det, boolean detbool, KGradientPanel fulldet, boolean fulldetbool) {
        if (code == KeyEvent.VK_ENTER) {
            add.setVisible(addbool);
            edit.setVisible(editbool);
            det.setVisible(detbool);
            fulldet.setVisible(fulldetbool);
            field.grabFocus();
        }
    }

    //while inside the main panel
    public void visibility(JTextField field, KGradientPanel add, boolean addbool, KGradientPanel edit, boolean editbool, KGradientPanel det, boolean detbool, KGradientPanel fulldet, boolean fulldetbool) {
        add.setVisible(addbool);
        edit.setVisible(editbool);
        det.setVisible(detbool);
        fulldet.setVisible(fulldetbool);
        field.grabFocus();
    }

    //to call from sidepane
    public void visibility(KGradientPanel add, boolean addbool, KGradientPanel edit, boolean editbool, KGradientPanel det, boolean detbool, KGradientPanel fulldet, boolean fulldetbool) {
        add.setVisible(addbool);
        edit.setVisible(editbool);
        det.setVisible(detbool);
        fulldet.setVisible(fulldetbool);
    }

    //to call when the enter key pressed in main panel
    void visibility(int code, JTextField field, KGradientPanel add, boolean addbool, KGradientPanel addmbc, boolean mbcbool, KGradientPanel edit, boolean editbool, KGradientPanel det, boolean detbool, KGradientPanel fulldet, boolean fulldetbool) {
        if (code == KeyEvent.VK_ENTER) {
            add.setVisible(addbool);
            addmbc.setVisible(mbcbool);
            edit.setVisible(editbool);
            det.setVisible(detbool);
            fulldet.setVisible(fulldetbool);
            field.grabFocus();
        }
    }

    //while inside the main panel
    public void visibility(JTextField field, KGradientPanel add, boolean addbool, KGradientPanel addmbc, boolean mbcbool, KGradientPanel edit, boolean editbool, KGradientPanel det, boolean detbool, KGradientPanel fulldet, boolean fulldetbool) {
        add.setVisible(addbool);
        addmbc.setVisible(mbcbool);
        edit.setVisible(editbool);
        det.setVisible(detbool);
        fulldet.setVisible(fulldetbool);
        field.grabFocus();
    }

    //to call from sidepane
    public void visibility(KGradientPanel add, boolean addbool, KGradientPanel addmbc, boolean mbcbool, KGradientPanel edit, boolean editbool, KGradientPanel det, boolean detbool, KGradientPanel fulldet, boolean fulldetbool) {
        add.setVisible(addbool);
        addmbc.setVisible(mbcbool);
        edit.setVisible(editbool);
        det.setVisible(detbool);
        fulldet.setVisible(fulldetbool);
    }

    //
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btn_addbill;
    private com.k33ptoo.components.KButton btn_addcust;
    private com.k33ptoo.components.KButton btn_addemp;
    private com.k33ptoo.components.KButton btn_addmodal;
    private com.k33ptoo.components.KButton btn_addpro;
    private com.k33ptoo.components.KButton btn_billdet;
    private com.k33ptoo.components.KButton btn_detPro;
    private com.k33ptoo.components.KButton btn_detPro1;
    private com.k33ptoo.components.KButton btn_detcust;
    private com.k33ptoo.components.KButton btn_editPro;
    private com.k33ptoo.components.KButton btn_editcust;
    private com.k33ptoo.components.KButton btn_editemp;
    private com.k33ptoo.components.KButton btn_empdet;
    private com.k33ptoo.components.KButton btn_updtbill;
    private combo_suggestion.ComboBoxSuggestion combo_add_pro_brand;
    private combo_suggestion.ComboBoxSuggestion combo_add_pro_brand10;
    private combo_suggestion.ComboBoxSuggestion combo_add_pro_brand11;
    private combo_suggestion.ComboBoxSuggestion combo_add_pro_brand2;
    private combo_suggestion.ComboBoxSuggestion combo_add_pro_brand3;
    private combo_suggestion.ComboBoxSuggestion combo_add_pro_brand4;
    private combo_suggestion.ComboBoxSuggestion combo_add_pro_brand5;
    private combo_suggestion.ComboBoxSuggestion combo_add_pro_brand6;
    private combo_suggestion.ComboBoxSuggestion combo_add_pro_brand7;
    private combo_suggestion.ComboBoxSuggestion combo_add_pro_brand8;
    private combo_suggestion.ComboBoxSuggestion combo_add_pro_brand9;
    private combo_suggestion.ComboBoxSuggestion combo_add_pro_ctgry;
    private combo_suggestion.ComboBoxSuggestion combo_add_pro_model;
    private com.k33ptoo.components.KGradientPanel indicatorAddbill;
    private com.k33ptoo.components.KGradientPanel indicatorAddcust;
    private com.k33ptoo.components.KGradientPanel indicatorAddemp;
    private com.k33ptoo.components.KGradientPanel indicatorAddmodal;
    private com.k33ptoo.components.KGradientPanel indicatorAddpro;
    private com.k33ptoo.components.KGradientPanel indicatorDetcust;
    private com.k33ptoo.components.KGradientPanel indicatorDetpro;
    private com.k33ptoo.components.KGradientPanel indicatorDetpro1;
    private com.k33ptoo.components.KGradientPanel indicatorEditcust;
    private com.k33ptoo.components.KGradientPanel indicatorEditemp;
    private com.k33ptoo.components.KGradientPanel indicatorEditpro;
    private com.k33ptoo.components.KGradientPanel indicatorEmpdet;
    private com.k33ptoo.components.KGradientPanel indicator_bill_det;
    private com.k33ptoo.components.KGradientPanel indicator_updt_bill;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private textfield.TextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel12;
    private com.k33ptoo.components.KGradientPanel kGradientPanel19;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    private javax.swing.JLabel lbl_account;
    private javax.swing.JLabel lbl_add_empaddimg;
    private javax.swing.JLabel lbl_add_empaddimg1;
    private javax.swing.JLabel lbl_add_empimg;
    private javax.swing.JLabel lbl_add_empimg1;
    private javax.swing.JLabel lbl_add_empimg2;
    private javax.swing.JLabel lbl_add_emprmimg;
    private javax.swing.JLabel lbl_add_emprmimg1;
    private javax.swing.JLabel lbl_add_proaddimg;
    private javax.swing.JLabel lbl_add_proaddimg1;
    private javax.swing.JLabel lbl_add_prormimg;
    private javax.swing.JLabel lbl_add_prormimg1;
    private javax.swing.JLabel lbl_bill;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_customer;
    private javax.swing.JLabel lbl_edit_empimg;
    private javax.swing.JLabel lbl_employee;
    private javax.swing.JLabel lbl_gt;
    private javax.swing.JLabel lbl_min;
    private javax.swing.JLabel lbl_product;
    private javax.swing.JLabel lbl_user;
    private com.k33ptoo.components.KButton loginBtn;
    private com.k33ptoo.components.KButton loginBtn1;
    private com.k33ptoo.components.KButton loginBtn10;
    private com.k33ptoo.components.KButton loginBtn11;
    private com.k33ptoo.components.KButton loginBtn12;
    private com.k33ptoo.components.KButton loginBtn13;
    private com.k33ptoo.components.KButton loginBtn14;
    private com.k33ptoo.components.KButton loginBtn15;
    private com.k33ptoo.components.KButton loginBtn2;
    private com.k33ptoo.components.KButton loginBtn3;
    private com.k33ptoo.components.KButton loginBtn4;
    private com.k33ptoo.components.KButton loginBtn5;
    private com.k33ptoo.components.KButton loginBtn6;
    private com.k33ptoo.components.KButton loginBtn7;
    private com.k33ptoo.components.KButton loginBtn8;
    private com.k33ptoo.components.KButton loginBtn9;
    private com.k33ptoo.components.KGradientPanel panel_account;
    private com.k33ptoo.components.KGradientPanel panel_addcust;
    private com.k33ptoo.components.KGradientPanel panel_addcust_menu;
    private com.k33ptoo.components.KGradientPanel panel_addcustmenu11;
    private com.k33ptoo.components.KGradientPanel panel_addcustmenu16;
    private com.k33ptoo.components.KGradientPanel panel_addcustmenu17;
    private com.k33ptoo.components.KGradientPanel panel_addcustmenu9;
    private com.k33ptoo.components.KGradientPanel panel_addemp;
    private com.k33ptoo.components.KGradientPanel panel_addemp_menu;
    private com.k33ptoo.components.KGradientPanel panel_addmodal_menu;
    private com.k33ptoo.components.KGradientPanel panel_addpro;
    private com.k33ptoo.components.KGradientPanel panel_addpro_mcb;
    private com.k33ptoo.components.KGradientPanel panel_addpro_menu;
    private com.k33ptoo.components.KGradientPanel panel_bill;
    private com.k33ptoo.components.KGradientPanel panel_billmain;
    private com.k33ptoo.components.KGradientPanel panel_billmenu;
    private com.k33ptoo.components.KGradientPanel panel_createbill;
    private com.k33ptoo.components.KGradientPanel panel_custdet_menu;
    private com.k33ptoo.components.KGradientPanel panel_custdetail;
    private com.k33ptoo.components.KGradientPanel panel_custextra;
    private com.k33ptoo.components.KGradientPanel panel_custmain;
    private com.k33ptoo.components.KGradientPanel panel_custmenu;
    private com.k33ptoo.components.KGradientPanel panel_customer;
    private com.k33ptoo.components.KGradientPanel panel_detbill;
    private com.k33ptoo.components.KGradientPanel panel_detemp;
    private com.k33ptoo.components.KGradientPanel panel_edit_emptable;
    private com.k33ptoo.components.KGradientPanel panel_editcus;
    private com.k33ptoo.components.KGradientPanel panel_editcust_menu;
    private com.k33ptoo.components.KGradientPanel panel_editemp;
    private com.k33ptoo.components.KGradientPanel panel_editemp_menu;
    private com.k33ptoo.components.KGradientPanel panel_editpro;
    private com.k33ptoo.components.KGradientPanel panel_editpro_menu;
    private com.k33ptoo.components.KGradientPanel panel_empdet_menu;
    private com.k33ptoo.components.KGradientPanel panel_empextra;
    private com.k33ptoo.components.KGradientPanel panel_employee;
    private com.k33ptoo.components.KGradientPanel panel_empmain;
    private com.k33ptoo.components.KGradientPanel panel_empmenu;
    private com.k33ptoo.components.KGradientPanel panel_extra;
    private com.k33ptoo.components.KGradientPanel panel_extrabill;
    private com.k33ptoo.components.KGradientPanel panel_main;
    private com.k33ptoo.components.KGradientPanel panel_pro_fulldet;
    private com.k33ptoo.components.KGradientPanel panel_prodet;
    private com.k33ptoo.components.KGradientPanel panel_prodet_menu;
    private com.k33ptoo.components.KGradientPanel panel_product;
    private com.k33ptoo.components.KGradientPanel panel_promain;
    private com.k33ptoo.components.KGradientPanel panel_promenu;
    private com.k33ptoo.components.KGradientPanel panel_updatbill;
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
    private textfield.TextField txt_add_pro_id4;
    private textfield.TextField txt_add_pro_id5;
    private textfield.TextField txt_add_pro_id6;
    private textfield.TextField txt_add_pro_id7;
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
