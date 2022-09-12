
import com.k33ptoo.components.KButton;
import com.k33ptoo.components.KGradientPanel;
import connections.dbconnection;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;
import textarea.TextArea;
import textfield.TextField;

public class frm_dashboard extends javax.swing.JFrame {

    double first, second, result;
    String operation;
    String answer;
    PreparedStatement ps;
    ResultSet rs;
    Statement st;
    JTable table;
    JTable table1;
    DefaultTableModel TableModel;
    Connection con = dbconnection.isconnected();
    FileInputStream fis;

    public frm_dashboard() {
        initComponents();
        panel_main.setVisible(true);
        visibility(jLabel2, false, false, false, false, false, false, true);
        lbl_edit_empid.setVisible(false);
        lbl_edit_custid.setVisible(false);

        screensize();

        tableheader(table_custedit.getTableHeader());
        tableheader(table_custdet.getTableHeader());
        if (con == null) {
            System.exit(0);
        }

    }

    public frm_dashboard(String name) {
        initComponents();
        panel_main.setVisible(true);
        visibility(jLabel2, false, false, false, false, false, false, true);
        lbl_edit_empid.setVisible(false);

        screensize();

        tableheader(table_custedit.getTableHeader());
        tableheader(table_custdet.getTableHeader());
        if (name.equals("ADMIN")) {
            lbl_customer.setEnabled(true);
        } else {
            lbl_employee.setEnabled(false);
            lbl_customer.setNextFocusableComponent(lbl_product);
            lbl_employee.removeNotify();
        }
    }

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
        jLabel4 = new javax.swing.JLabel();
        txt_add_custsnm2 = new textfield.TextField();
        textAreaScroll3 = new textarea.TextAreaScroll();
        txt_add_custsaddress = new textarea.TextArea();
        panel_editcus = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel12 = new com.k33ptoo.components.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_custedit = new javax.swing.JTable();
        editCustBtn = new com.k33ptoo.components.KButton();
        deleteCustBtn = new com.k33ptoo.components.KButton();
        jTextField1 = new javax.swing.JTextField();
        txt_edit_custnm = new textfield.TextField();
        txt_edit_custemail = new textfield.TextField();
        txt_edit_custno = new textfield.TextField();
        txt_edit_custsnm = new textfield.TextField();
        txt_edit_custsadd = new textfield.TextField();
        jLabel5 = new javax.swing.JLabel();
        lbl_edit_custid = new javax.swing.JLabel();
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
        addEmp = new com.k33ptoo.components.KButton();
        lbl_add_empaddimg = new javax.swing.JLabel();
        lbl_add_emprmimg = new javax.swing.JLabel();
        txt_add_empid = new textfield.TextField();
        txt_add_empnm = new textfield.TextField();
        txt_add_empno = new textfield.TextField();
        txt_add_empemail = new textfield.TextField();
        txt_add_empsalary = new textfield.TextField();
        txt_add_empadd = new textfield.TextField();
        lbl_add_empimg = new javax.swing.JLabel();
        txt_add_emppswd = new textfield.PasswordField();
        txt_add_empcpswd = new textfield.PasswordField();
        panel_editemp = new com.k33ptoo.components.KGradientPanel();
        lbl_edit_empimg = new javax.swing.JLabel();
        panel_edit_emptable = new com.k33ptoo.components.KGradientPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_empedit = new javax.swing.JTable();
        editEmp = new com.k33ptoo.components.KButton();
        deleteEmp = new com.k33ptoo.components.KButton();
        lbl_add_emprmimg1 = new javax.swing.JLabel();
        lbl_add_empaddimg1 = new javax.swing.JLabel();
        txt_edit_empnm = new textfield.TextField();
        txt_edit_empno = new textfield.TextField();
        txt_edit_empemail = new textfield.TextField();
        txt_edit_empsalary = new textfield.TextField();
        txt_edit_empadd = new textfield.TextField();
        lbl_edit_empid = new javax.swing.JLabel();
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
        lbl_add_proimg = new javax.swing.JLabel();
        lbl_add_proaddimg = new javax.swing.JLabel();
        lbl_add_prormimg = new javax.swing.JLabel();
        loginBtn6 = new com.k33ptoo.components.KButton();
        txt_add_pro_id = new textfield.TextField();
        txt_add_pro_cprice = new textfield.TextField();
        txt_add_pro_sprice = new textfield.TextField();
        combo_add_pro_model = new combo_suggestion.ComboBoxSuggestion();
        combo_add_pro_ctgry = new combo_suggestion.ComboBoxSuggestion();
        combo_add_pro_brand = new combo_suggestion.ComboBoxSuggestion();
        txt_add_pro_qty = new spinner.Spinner();
        textAreaScroll2 = new textarea.TextAreaScroll();
        txt_add_pro_desc = new textarea.TextArea();
        panel_addpro_mcb = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel4 = new com.k33ptoo.components.KGradientPanel();
        txt_add_promcb_ctgy_id = new textfield.TextField();
        txt_add_promcb_ctgy_nm = new textfield.TextField();
        btnAddCtgy = new com.k33ptoo.components.KButton();
        txt_add_promcb_brand_id = new textfield.TextField();
        txt_add_promcb_brand_nm = new textfield.TextField();
        btnAddBrand = new com.k33ptoo.components.KButton();
        jLabel9 = new javax.swing.JLabel();
        txt_add_promcb_model_id = new textfield.TextField();
        txt_add_promcb_model_nm = new textfield.TextField();
        btnAddModel = new com.k33ptoo.components.KButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panel_editpro = new com.k33ptoo.components.KGradientPanel();
        lbl_edit_proimg = new javax.swing.JLabel();
        lbl_edit_prodelimg = new javax.swing.JLabel();
        lbl_edit_proaddimg = new javax.swing.JLabel();
        txt_edit_pro_sprice = new textfield.TextField();
        txt_edit_pro_cprice = new textfield.TextField();
        btn_edit_proedit = new com.k33ptoo.components.KButton();
        btn_edit_prodel = new com.k33ptoo.components.KButton();
        jSeparator8 = new javax.swing.JSeparator();
        txt_edit_pro_ctgynm = new textfield.TextField();
        jSeparator9 = new javax.swing.JSeparator();
        txt_edit_pro_brandnm = new textfield.TextField();
        btn_edit_ctgyedit = new com.k33ptoo.components.KButton();
        btn_edit_ctgydel = new com.k33ptoo.components.KButton();
        jSeparator10 = new javax.swing.JSeparator();
        txt_edit_pro_modelnm = new textfield.TextField();
        btn_edit_brandedit = new com.k33ptoo.components.KButton();
        btn_edit_branddel = new com.k33ptoo.components.KButton();
        btn_edit_modeledit = new com.k33ptoo.components.KButton();
        btn_edit_modeldel = new com.k33ptoo.components.KButton();
        combo_edit_pro_brand = new combo_suggestion.ComboBoxSuggestion();
        combo_edit_pro_ctgyid = new combo_suggestion.ComboBoxSuggestion();
        combo_edit_pro_model = new combo_suggestion.ComboBoxSuggestion();
        spinner_edit_pro_qty = new spinner.Spinner();
        combo_edit_pro_ctgy = new combo_suggestion.ComboBoxSuggestion();
        combo_edit_pro_brandid = new combo_suggestion.ComboBoxSuggestion();
        combo_edit_pro_modelid = new combo_suggestion.ComboBoxSuggestion();
        combo_add_pro_proid = new combo_suggestion.ComboBoxSuggestion();
        panel_prodet = new com.k33ptoo.components.KGradientPanel();
        txt_prodet_proid = new textfield.TextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_empdet1 = new javax.swing.JTable()
        ;
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
        panel_addBill = new com.k33ptoo.components.KGradientPanel();
        indicatorAddbill = new com.k33ptoo.components.KGradientPanel();
        btn_addbill = new com.k33ptoo.components.KButton();
        panel_updateBill = new com.k33ptoo.components.KGradientPanel();
        indicator_updt_bill = new com.k33ptoo.components.KGradientPanel();
        btn_updtbill = new com.k33ptoo.components.KButton();
        panel_addcustmenu16 = new com.k33ptoo.components.KGradientPanel();
        indicatorExtraBill = new com.k33ptoo.components.KGradientPanel();
        btn_detPro1 = new com.k33ptoo.components.KButton();
        panel_addcustmenu17 = new com.k33ptoo.components.KGradientPanel();
        indicator_bill_det = new com.k33ptoo.components.KGradientPanel();
        btn_billdet = new com.k33ptoo.components.KButton();
        panel_billmain = new com.k33ptoo.components.KGradientPanel();
        panel_createbill = new com.k33ptoo.components.KGradientPanel();
        loginBtn15 = new com.k33ptoo.components.KButton();
        combo_add_bill_cusid = new combo_suggestion.ComboBoxSuggestion();
        combo_add_bill_proid = new combo_suggestion.ComboBoxSuggestion();
        jScrollPane8 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lbl_billno = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbl_add_bill_ntot = new javax.swing.JLabel();
        txt_add_bill_dis = new javax.swing.JTextField();
        txt_add_bill_tax = new javax.swing.JTextField();
        lbl_add_bill_tot = new javax.swing.JLabel();
        txt_add_bill_paid = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btn_proadd_table = new com.k33ptoo.components.KButton();
        loginBtn17 = new com.k33ptoo.components.KButton();
        loginBtn18 = new com.k33ptoo.components.KButton();
        txt_add_bill_email = new javax.swing.JTextField();
        txt_add_bill_con = new javax.swing.JTextField();
        txt_add_bill_snm = new javax.swing.JTextField();
        txt_add_bill_price = new javax.swing.JTextField();
        txt_add_bill_ctgry = new javax.swing.JTextField();
        txt_add_bill_brand = new javax.swing.JTextField();
        txt_add_bill_model = new javax.swing.JTextField();
        txt_add_pro_qty1 = new spinner.Spinner();
        panel_updatbill = new com.k33ptoo.components.KGradientPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        table_bill = new javax.swing.JTable();
        combo_edit_billid = new combo_suggestion.ComboBoxSuggestion();
        chk_paddingBill = new javax.swing.JCheckBox();
        txt_edit_paidTotal = new textfield.TextField();
        txt_searchBill_data = new textfield.TextField();
        jSeparator7 = new javax.swing.JSeparator();
        btn_edit_editPaidTotal = new com.k33ptoo.components.KButton();
        loginBtn20 = new com.k33ptoo.components.KButton();
        btn_edit_deleteBillDet = new com.k33ptoo.components.KButton();
        panel_detbill = new com.k33ptoo.components.KGradientPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtarea_bill = new javax.swing.JTextArea();
        panel_extrabill = new com.k33ptoo.components.KGradientPanel();
        panel_account = new com.k33ptoo.components.KGradientPanel();
        panel_accountmenu = new com.k33ptoo.components.KGradientPanel();
        panel_addcustmenu10 = new com.k33ptoo.components.KGradientPanel();
        indicatorasetting = new com.k33ptoo.components.KGradientPanel();
        btn_setting = new com.k33ptoo.components.KButton();
        panel_addcustmenu12 = new com.k33ptoo.components.KGradientPanel();
        indicator_updt_bill1 = new com.k33ptoo.components.KGradientPanel();
        btn_updtbill1 = new com.k33ptoo.components.KButton();
        panel_accountmain = new com.k33ptoo.components.KGradientPanel();
        panel_accountsetting = new com.k33ptoo.components.KGradientPanel();
        lbl_add_empimg3 = new javax.swing.JLabel();
        lbl_add_prormimg2 = new javax.swing.JLabel();
        lbl_add_proaddimg2 = new javax.swing.JLabel();
        txt_add_pro_id3 = new textfield.TextField();
        txt_add_pro_id8 = new textfield.TextField();
        txt_add_pro_id9 = new textfield.TextField();
        txt_add_pro_id10 = new textfield.TextField();
        txt_add_pro_id11 = new textfield.TextField();
        txt_add_pro_id12 = new textfield.TextField();
        loginBtn22 = new com.k33ptoo.components.KButton();
        jLabel19 = new javax.swing.JLabel();
        kGradientPanel5 = new com.k33ptoo.components.KGradientPanel();
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
        });
        loginBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginBtnKeyPressed(evt);
            }
        });

        txt_add_custid.setEditable(false);
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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_add_custnoKeyTyped(evt);
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

        textAreaScroll3.setBackground(new java.awt.Color(228, 235, 246));
        textAreaScroll3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textAreaScroll3.setLabelText("SHOP ADDRESS");

        txt_add_custsaddress.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_custsaddress.setColumns(20);
        txt_add_custsaddress.setRows(5);
        txt_add_custsaddress.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_custsaddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_custsaddressKeyPressed(evt);
            }
        });
        textAreaScroll3.setViewportView(txt_add_custsaddress);

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
                        .addGroup(panel_addcustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_add_custnm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_addcustLayout.createSequentialGroup()
                                .addComponent(txt_add_custemail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel4))
                            .addComponent(textAreaScroll3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 149, Short.MAX_VALUE))
                    .addGroup(panel_addcustLayout.createSequentialGroup()
                        .addComponent(txt_add_custsnm2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))))
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
                .addGroup(panel_addcustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_add_custsnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAreaScroll3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_addcustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_custsnm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
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
                {null, "chargin socket", "display", null, "combo", null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", " Name", "Contact No.", "Email", " Shop Name", "Shop Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_custedit.setRowHeight(31);
        table_custedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_custeditMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_custedit);

        editCustBtn.setBorder(null);
        editCustBtn.setText("EDIT");
        editCustBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        editCustBtn.setkBorderRadius(30);
        editCustBtn.setkEndColor(new java.awt.Color(68, 82, 121));
        editCustBtn.setkHoverEndColor(new java.awt.Color(228, 235, 246));
        editCustBtn.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        editCustBtn.setkHoverStartColor(new java.awt.Color(228, 235, 246));
        editCustBtn.setkIndicatorColor(new java.awt.Color(228, 235, 246));
        editCustBtn.setkStartColor(new java.awt.Color(68, 82, 121));
        editCustBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editCustBtnMouseEntered(evt);
            }
        });
        editCustBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCustBtnActionPerformed(evt);
            }
        });

        deleteCustBtn.setBorder(null);
        deleteCustBtn.setText("REMOVE");
        deleteCustBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        deleteCustBtn.setkBorderRadius(30);
        deleteCustBtn.setkEndColor(new java.awt.Color(68, 82, 121));
        deleteCustBtn.setkHoverEndColor(new java.awt.Color(228, 235, 246));
        deleteCustBtn.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        deleteCustBtn.setkHoverStartColor(new java.awt.Color(228, 235, 246));
        deleteCustBtn.setkStartColor(new java.awt.Color(68, 82, 121));
        deleteCustBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteCustBtnMouseEntered(evt);
            }
        });
        deleteCustBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustBtnActionPerformed(evt);
            }
        });

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
                        .addComponent(editCustBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteCustBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addComponent(deleteCustBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editCustBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        lbl_edit_custid.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_edit_custid.setText("jLabel20");

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
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_editcusLayout.createSequentialGroup()
                        .addComponent(lbl_edit_custid)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(kGradientPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        panel_editcusLayout.setVerticalGroup(
            panel_editcusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editcusLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(panel_editcusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_editcusLayout.createSequentialGroup()
                        .addComponent(lbl_edit_custid, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_edit_custnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txt_edit_custno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(panel_editcusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_edit_custemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(txt_edit_custsnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txt_edit_custsadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kGradientPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
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
        table_custdet.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        table_custdet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Contact", "Email", "Shop Name", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_custdet.setOpaque(false);
        table_custdet.setRowHeight(40);
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
        txt_det_custid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_det_custidKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_det_custidKeyReleased(evt);
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

        addEmp.setBorder(null);
        addEmp.setMnemonic('c');
        addEmp.setText("ADD EMPLOYEE");
        addEmp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        addEmp.setkBorderRadius(30);
        addEmp.setkEndColor(new java.awt.Color(68, 82, 121));
        addEmp.setkHoverEndColor(new java.awt.Color(228, 235, 246));
        addEmp.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        addEmp.setkHoverStartColor(new java.awt.Color(228, 235, 246));
        addEmp.setkStartColor(new java.awt.Color(68, 82, 121));
        addEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEmpMouseClicked(evt);
            }
        });

        lbl_add_empaddimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add_empaddimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add-user.png"))); // NOI18N
        lbl_add_empaddimg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_add_empaddimg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_add_empaddimgMouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_add_emprmimgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_add_emprmimgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_add_emprmimgMouseExited(evt);
            }
        });

        txt_add_empid.setEditable(false);
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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_add_empnoKeyTyped(evt);
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

        txt_add_emppswd.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_emppswd.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_emppswd.setLabelText("Password");
        txt_add_emppswd.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_emppswd.setShowAndHide(true);

        txt_add_empcpswd.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_empcpswd.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_empcpswd.setLabelText("Confirm Password");
        txt_add_empcpswd.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_empcpswd.setShowAndHide(true);

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
                            .addComponent(txt_add_emppswd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_add_empid, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txt_add_empno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_add_empsalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(100, 100, 100)
                        .addGroup(panel_addempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_add_empnm, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txt_add_empemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_add_empadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_add_empcpswd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel_addempLayout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(addEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(40, 40, 40)
                .addGroup(panel_addempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_add_empno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_empemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panel_addempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_add_empsalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_empadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panel_addempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_add_emppswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_empcpswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(addEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
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
                {null, "spareparts", "chargin socket", "display", "combo", null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "contact", "Email", "Salary", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_empedit.setRowHeight(31);
        table_empedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_empeditMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table_empedit);

        editEmp.setBorder(null);
        editEmp.setText("EDIT EMPLOYEE");
        editEmp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        editEmp.setkBorderRadius(30);
        editEmp.setkEndColor(new java.awt.Color(68, 82, 121));
        editEmp.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        editEmp.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        editEmp.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        editEmp.setkStartColor(new java.awt.Color(68, 82, 121));
        editEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editEmpMouseClicked(evt);
            }
        });

        deleteEmp.setBorder(null);
        deleteEmp.setText("DELETE EMPLOYEE");
        deleteEmp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        deleteEmp.setkBorderRadius(30);
        deleteEmp.setkEndColor(new java.awt.Color(68, 82, 121));
        deleteEmp.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        deleteEmp.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        deleteEmp.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        deleteEmp.setkStartColor(new java.awt.Color(68, 82, 121));
        deleteEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteEmpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_edit_emptableLayout = new javax.swing.GroupLayout(panel_edit_emptable);
        panel_edit_emptable.setLayout(panel_edit_emptableLayout);
        panel_edit_emptableLayout.setHorizontalGroup(
            panel_edit_emptableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_edit_emptableLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_edit_emptableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                    .addGroup(panel_edit_emptableLayout.createSequentialGroup()
                        .addComponent(editEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(deleteEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        panel_edit_emptableLayout.setVerticalGroup(
            panel_edit_emptableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_edit_emptableLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_edit_emptableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        txt_edit_empno.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_empno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_empno.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_empno.setLabelText("CONTACT");
        txt_edit_empno.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_empno.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_edit_empno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_edit_empnoKeyPressed(evt);
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

        lbl_edit_empid.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_edit_empid.setText("jLabel20");

        javax.swing.GroupLayout panel_editempLayout = new javax.swing.GroupLayout(panel_editemp);
        panel_editemp.setLayout(panel_editempLayout);
        panel_editempLayout.setHorizontalGroup(
            panel_editempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editempLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_editempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_editempLayout.createSequentialGroup()
                        .addComponent(lbl_edit_empid, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_edit_empimg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_editempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_add_emprmimg1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_add_empaddimg1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 74, Short.MAX_VALUE))
                    .addComponent(txt_edit_empnm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_edit_empno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_edit_empadd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_edit_empsalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_edit_empemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panel_edit_emptable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        panel_editempLayout.setVerticalGroup(
            panel_editempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editempLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_editempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_edit_emptable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_editempLayout.createSequentialGroup()
                        .addGroup(panel_editempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_editempLayout.createSequentialGroup()
                                .addComponent(lbl_add_emprmimg1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_add_empaddimg1))
                            .addComponent(lbl_edit_empimg)
                            .addComponent(lbl_edit_empid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txt_edit_empnm, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_edit_empno, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txt_edit_empemail, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_edit_empsalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_edit_empadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_det_empidKeyReleased(evt);
            }
        });

        jScrollPane4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        table_empdet.setBackground(new java.awt.Color(228, 235, 246));
        table_empdet.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        table_empdet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Contact", "Email", "Salary", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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

        lbl_add_proimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add_proimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/man.png"))); // NOI18N

        lbl_add_proaddimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add_proaddimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add-user.png"))); // NOI18N
        lbl_add_proaddimg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_add_proaddimg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_add_proaddimgMouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_add_prormimgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_add_prormimgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_add_prormimgMouseExited(evt);
            }
        });

        loginBtn6.setBorder(null);
        loginBtn6.setText("ADD PRODUCT");
        loginBtn6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn6.setkBorderRadius(30);
        loginBtn6.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn6.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        loginBtn6.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn6.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        loginBtn6.setkStartColor(new java.awt.Color(68, 82, 121));
        loginBtn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtn6MouseClicked(evt);
            }
        });
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

        txt_add_pro_cprice.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_pro_cprice.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_pro_cprice.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_pro_cprice.setLabelText("COST PRICE");
        txt_add_pro_cprice.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_cprice.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_cprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_pro_cpriceKeyPressed(evt);
            }
        });

        txt_add_pro_sprice.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_pro_sprice.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_pro_sprice.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_pro_sprice.setLabelText("SELLING PRICE");
        txt_add_pro_sprice.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_sprice.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_sprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_pro_spriceKeyPressed(evt);
            }
        });

        combo_add_pro_model.setBackground(new java.awt.Color(228, 235, 246));
        combo_add_pro_model.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "model" }));
        combo_add_pro_model.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        combo_add_pro_ctgry.setBackground(new java.awt.Color(228, 235, 246));
        combo_add_pro_ctgry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Category" }));
        combo_add_pro_ctgry.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        combo_add_pro_brand.setBackground(new java.awt.Color(228, 235, 246));
        combo_add_pro_brand.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "brand" }));
        combo_add_pro_brand.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        txt_add_pro_qty.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_pro_qty.setLabelText("QTY");

        textAreaScroll2.setBackground(new java.awt.Color(228, 235, 246));
        textAreaScroll2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textAreaScroll2.setLabelText("DESCRIPTION");

        txt_add_pro_desc.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_pro_desc.setColumns(20);
        txt_add_pro_desc.setRows(5);
        txt_add_pro_desc.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_pro_desc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_pro_descKeyPressed(evt);
            }
        });
        textAreaScroll2.setViewportView(txt_add_pro_desc);

        javax.swing.GroupLayout panel_addproLayout = new javax.swing.GroupLayout(panel_addpro);
        panel_addpro.setLayout(panel_addproLayout);
        panel_addproLayout.setHorizontalGroup(
            panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addproLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textAreaScroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_addproLayout.createSequentialGroup()
                            .addGroup(panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panel_addproLayout.createSequentialGroup()
                                    .addComponent(combo_add_pro_model, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(312, 312, 312))
                                .addGroup(panel_addproLayout.createSequentialGroup()
                                    .addComponent(txt_add_pro_id, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(52, 52, 52)
                                    .addComponent(lbl_add_proimg, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_add_proaddimg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_add_prormimg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(60, 60, 60)))
                            .addGroup(panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_add_pro_cprice, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_add_pro_qty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panel_addproLayout.createSequentialGroup()
                            .addComponent(txt_add_pro_sprice, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(combo_add_pro_ctgry, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(combo_add_pro_brand, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel_addproLayout.createSequentialGroup()
                            .addGap(306, 306, 306)
                            .addComponent(loginBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panel_addproLayout.setVerticalGroup(
            panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addproLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_addproLayout.createSequentialGroup()
                        .addComponent(txt_add_pro_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_add_pro_sprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_add_pro_ctgry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_add_pro_brand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58))
                    .addGroup(panel_addproLayout.createSequentialGroup()
                        .addGroup(panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_add_proimg)
                            .addGroup(panel_addproLayout.createSequentialGroup()
                                .addGroup(panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_addproLayout.createSequentialGroup()
                                        .addComponent(lbl_add_prormimg, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addproLayout.createSequentialGroup()
                                        .addComponent(txt_add_pro_cprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)))
                                .addComponent(lbl_add_proaddimg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(128, 128, 128)))
                .addGroup(panel_addproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_add_pro_model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_pro_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(textAreaScroll2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
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

        txt_add_promcb_ctgy_id.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_promcb_ctgy_id.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_promcb_ctgy_id.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_promcb_ctgy_id.setLabelText("CATEGORY ID");
        txt_add_promcb_ctgy_id.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_ctgy_id.setName(""); // NOI18N
        txt_add_promcb_ctgy_id.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_ctgy_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_promcb_ctgy_idKeyPressed(evt);
            }
        });

        txt_add_promcb_ctgy_nm.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_promcb_ctgy_nm.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_promcb_ctgy_nm.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_promcb_ctgy_nm.setLabelText("CATEGORY NAME");
        txt_add_promcb_ctgy_nm.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_ctgy_nm.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_ctgy_nm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_add_promcb_ctgy_nmActionPerformed(evt);
            }
        });
        txt_add_promcb_ctgy_nm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_promcb_ctgy_nmKeyPressed(evt);
            }
        });

        btnAddCtgy.setBorder(null);
        btnAddCtgy.setText("ADD");
        btnAddCtgy.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAddCtgy.setkBorderRadius(30);
        btnAddCtgy.setkEndColor(new java.awt.Color(68, 82, 121));
        btnAddCtgy.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        btnAddCtgy.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        btnAddCtgy.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        btnAddCtgy.setkStartColor(new java.awt.Color(68, 82, 121));
        btnAddCtgy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddCtgyMouseClicked(evt);
            }
        });
        btnAddCtgy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCtgyActionPerformed(evt);
            }
        });

        txt_add_promcb_brand_id.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_promcb_brand_id.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_promcb_brand_id.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_promcb_brand_id.setLabelText("BRAND ID");
        txt_add_promcb_brand_id.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_brand_id.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_brand_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_add_promcb_brand_idActionPerformed(evt);
            }
        });
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
        txt_add_promcb_brand_nm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_promcb_brand_nmKeyPressed(evt);
            }
        });

        btnAddBrand.setBorder(null);
        btnAddBrand.setText("ADD");
        btnAddBrand.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAddBrand.setkBorderRadius(30);
        btnAddBrand.setkEndColor(new java.awt.Color(68, 82, 121));
        btnAddBrand.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        btnAddBrand.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        btnAddBrand.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        btnAddBrand.setkStartColor(new java.awt.Color(68, 82, 121));
        btnAddBrand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddBrandMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(68, 82, 121));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ADD CATEGORY");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_add_promcb_model_id.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_promcb_model_id.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_promcb_model_id.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_promcb_model_id.setLabelText("MODEL ID");
        txt_add_promcb_model_id.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_model_id.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_model_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_promcb_model_idKeyPressed(evt);
            }
        });

        txt_add_promcb_model_nm.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_promcb_model_nm.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_promcb_model_nm.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_promcb_model_nm.setLabelText("MODEL NAME");
        txt_add_promcb_model_nm.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_model_nm.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_promcb_model_nm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_add_promcb_model_nmActionPerformed(evt);
            }
        });
        txt_add_promcb_model_nm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_promcb_model_nmKeyPressed(evt);
            }
        });

        btnAddModel.setBorder(null);
        btnAddModel.setText("ADD");
        btnAddModel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAddModel.setkBorderRadius(30);
        btnAddModel.setkEndColor(new java.awt.Color(68, 82, 121));
        btnAddModel.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        btnAddModel.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        btnAddModel.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        btnAddModel.setkStartColor(new java.awt.Color(68, 82, 121));
        btnAddModel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddModelMouseClicked(evt);
            }
        });
        btnAddModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddModelActionPerformed(evt);
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
        jLabel12.setText("ADD MODEL");
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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                .addComponent(txt_add_promcb_ctgy_id, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_add_promcb_ctgy_nm, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddCtgy, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_add_promcb_model_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                .addComponent(txt_add_promcb_brand_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                .addComponent(txt_add_promcb_model_nm, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAddModel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                .addComponent(txt_add_promcb_brand_nm, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))))
            .addComponent(jSeparator2)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_add_promcb_ctgy_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_promcb_ctgy_nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddCtgy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_add_promcb_brand_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_promcb_brand_nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_add_promcb_model_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_promcb_model_nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddModel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        lbl_edit_proimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_edit_proimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/man.png"))); // NOI18N

        lbl_edit_prodelimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_edit_prodelimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/substract.png"))); // NOI18N
        lbl_edit_prodelimg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_edit_prodelimg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_edit_prodelimgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_edit_prodelimgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_edit_prodelimgMouseExited(evt);
            }
        });

        lbl_edit_proaddimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_edit_proaddimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add-user.png"))); // NOI18N
        lbl_edit_proaddimg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_edit_proaddimg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_edit_proaddimgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_edit_proaddimgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_edit_proaddimgMouseExited(evt);
            }
        });

        txt_edit_pro_sprice.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_pro_sprice.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_pro_sprice.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_pro_sprice.setLabelText("SELLING PRICE");
        txt_edit_pro_sprice.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_pro_sprice.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_edit_pro_sprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_edit_pro_spriceKeyPressed(evt);
            }
        });

        txt_edit_pro_cprice.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_pro_cprice.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_pro_cprice.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_pro_cprice.setLabelText("COST PRICE");
        txt_edit_pro_cprice.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_pro_cprice.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_edit_pro_cprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_edit_pro_cpriceKeyPressed(evt);
            }
        });

        btn_edit_proedit.setBorder(null);
        btn_edit_proedit.setText("EDIT");
        btn_edit_proedit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_edit_proedit.setkBorderRadius(30);
        btn_edit_proedit.setkEndColor(new java.awt.Color(68, 82, 121));
        btn_edit_proedit.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        btn_edit_proedit.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        btn_edit_proedit.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        btn_edit_proedit.setkStartColor(new java.awt.Color(68, 82, 121));
        btn_edit_proedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_edit_proeditMouseClicked(evt);
            }
        });

        btn_edit_prodel.setBorder(null);
        btn_edit_prodel.setText("DELETE");
        btn_edit_prodel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_edit_prodel.setkBorderRadius(30);
        btn_edit_prodel.setkEndColor(new java.awt.Color(68, 82, 121));
        btn_edit_prodel.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        btn_edit_prodel.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        btn_edit_prodel.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        btn_edit_prodel.setkStartColor(new java.awt.Color(68, 82, 121));
        btn_edit_prodel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_edit_prodelMouseClicked(evt);
            }
        });

        txt_edit_pro_ctgynm.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_pro_ctgynm.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_pro_ctgynm.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_pro_ctgynm.setLabelText("CATEGORY NAME");
        txt_edit_pro_ctgynm.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_pro_ctgynm.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_edit_pro_ctgynm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_edit_pro_ctgynmKeyPressed(evt);
            }
        });

        txt_edit_pro_brandnm.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_pro_brandnm.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_pro_brandnm.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_pro_brandnm.setLabelText("BRAND NAME");
        txt_edit_pro_brandnm.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_pro_brandnm.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_edit_pro_brandnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_edit_pro_brandnmKeyPressed(evt);
            }
        });

        btn_edit_ctgyedit.setBorder(null);
        btn_edit_ctgyedit.setText("EDIT");
        btn_edit_ctgyedit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_edit_ctgyedit.setkBorderRadius(30);
        btn_edit_ctgyedit.setkEndColor(new java.awt.Color(68, 82, 121));
        btn_edit_ctgyedit.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        btn_edit_ctgyedit.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        btn_edit_ctgyedit.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        btn_edit_ctgyedit.setkStartColor(new java.awt.Color(68, 82, 121));
        btn_edit_ctgyedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_edit_ctgyeditMouseClicked(evt);
            }
        });

        btn_edit_ctgydel.setBorder(null);
        btn_edit_ctgydel.setText("DELETE");
        btn_edit_ctgydel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_edit_ctgydel.setkBorderRadius(30);
        btn_edit_ctgydel.setkEndColor(new java.awt.Color(68, 82, 121));
        btn_edit_ctgydel.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        btn_edit_ctgydel.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        btn_edit_ctgydel.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        btn_edit_ctgydel.setkStartColor(new java.awt.Color(68, 82, 121));
        btn_edit_ctgydel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_edit_ctgydelMouseClicked(evt);
            }
        });

        txt_edit_pro_modelnm.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_pro_modelnm.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_pro_modelnm.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_pro_modelnm.setLabelText("MODEL NAME");
        txt_edit_pro_modelnm.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_pro_modelnm.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_edit_pro_modelnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_edit_pro_modelnmKeyPressed(evt);
            }
        });

        btn_edit_brandedit.setBorder(null);
        btn_edit_brandedit.setText("EDIT");
        btn_edit_brandedit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_edit_brandedit.setkBorderRadius(30);
        btn_edit_brandedit.setkEndColor(new java.awt.Color(68, 82, 121));
        btn_edit_brandedit.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        btn_edit_brandedit.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        btn_edit_brandedit.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        btn_edit_brandedit.setkStartColor(new java.awt.Color(68, 82, 121));
        btn_edit_brandedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_edit_brandeditMouseClicked(evt);
            }
        });

        btn_edit_branddel.setBorder(null);
        btn_edit_branddel.setText("DELETE");
        btn_edit_branddel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_edit_branddel.setkBorderRadius(30);
        btn_edit_branddel.setkEndColor(new java.awt.Color(68, 82, 121));
        btn_edit_branddel.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        btn_edit_branddel.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        btn_edit_branddel.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        btn_edit_branddel.setkStartColor(new java.awt.Color(68, 82, 121));
        btn_edit_branddel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_edit_branddelMouseClicked(evt);
            }
        });

        btn_edit_modeledit.setBorder(null);
        btn_edit_modeledit.setText("EDIT");
        btn_edit_modeledit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_edit_modeledit.setkBorderRadius(30);
        btn_edit_modeledit.setkEndColor(new java.awt.Color(68, 82, 121));
        btn_edit_modeledit.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        btn_edit_modeledit.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        btn_edit_modeledit.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        btn_edit_modeledit.setkStartColor(new java.awt.Color(68, 82, 121));
        btn_edit_modeledit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_edit_modeleditMouseClicked(evt);
            }
        });

        btn_edit_modeldel.setBorder(null);
        btn_edit_modeldel.setText("DELETE");
        btn_edit_modeldel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_edit_modeldel.setkBorderRadius(30);
        btn_edit_modeldel.setkEndColor(new java.awt.Color(68, 82, 121));
        btn_edit_modeldel.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        btn_edit_modeldel.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        btn_edit_modeldel.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        btn_edit_modeldel.setkStartColor(new java.awt.Color(68, 82, 121));
        btn_edit_modeldel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_edit_modeldelMouseClicked(evt);
            }
        });

        combo_edit_pro_brand.setBackground(new java.awt.Color(228, 235, 246));
        combo_edit_pro_brand.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BRAND" }));
        combo_edit_pro_brand.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        combo_edit_pro_ctgyid.setBackground(new java.awt.Color(228, 235, 246));
        combo_edit_pro_ctgyid.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CATEGORY ID" }));
        combo_edit_pro_ctgyid.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        combo_edit_pro_ctgyid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_edit_pro_ctgyidItemStateChanged(evt);
            }
        });

        combo_edit_pro_model.setBackground(new java.awt.Color(228, 235, 246));
        combo_edit_pro_model.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MODEL" }));
        combo_edit_pro_model.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        spinner_edit_pro_qty.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        spinner_edit_pro_qty.setLabelText("QTY");

        combo_edit_pro_ctgy.setBackground(new java.awt.Color(228, 235, 246));
        combo_edit_pro_ctgy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CATEGORY" }));
        combo_edit_pro_ctgy.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        combo_edit_pro_brandid.setBackground(new java.awt.Color(228, 235, 246));
        combo_edit_pro_brandid.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BRAND ID" }));
        combo_edit_pro_brandid.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        combo_edit_pro_brandid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_edit_pro_brandidItemStateChanged(evt);
            }
        });

        combo_edit_pro_modelid.setBackground(new java.awt.Color(228, 235, 246));
        combo_edit_pro_modelid.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MODEL ID" }));
        combo_edit_pro_modelid.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        combo_edit_pro_modelid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_edit_pro_modelidItemStateChanged(evt);
            }
        });

        combo_add_pro_proid.setBackground(new java.awt.Color(228, 235, 246));
        combo_add_pro_proid.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PRODUCT ID" }));
        combo_add_pro_proid.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        combo_add_pro_proid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_add_pro_proidItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panel_editproLayout = new javax.swing.GroupLayout(panel_editpro);
        panel_editpro.setLayout(panel_editproLayout);
        panel_editproLayout.setHorizontalGroup(
            panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator8)
            .addComponent(jSeparator9)
            .addComponent(jSeparator10)
            .addGroup(panel_editproLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_editproLayout.createSequentialGroup()
                        .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_editproLayout.createSequentialGroup()
                                .addComponent(lbl_edit_proimg, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_edit_proaddimg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_edit_prodelimg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(combo_add_pro_proid, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_editproLayout.createSequentialGroup()
                                .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_edit_pro_sprice, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_edit_pro_model, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(spinner_edit_pro_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_edit_pro_ctgy, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31)
                        .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_edit_pro_cprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_editproLayout.createSequentialGroup()
                                .addComponent(btn_edit_proedit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_edit_prodel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(combo_edit_pro_brand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_editproLayout.createSequentialGroup()
                        .addComponent(combo_edit_pro_modelid, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_edit_pro_modelnm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btn_edit_modeledit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_edit_modeldel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_editproLayout.createSequentialGroup()
                        .addComponent(combo_edit_pro_ctgyid, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_edit_pro_ctgynm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btn_edit_ctgyedit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_edit_ctgydel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_editproLayout.createSequentialGroup()
                        .addComponent(combo_edit_pro_brandid, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_edit_pro_brandnm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btn_edit_brandedit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_edit_branddel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        panel_editproLayout.setVerticalGroup(
            panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_editproLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_editproLayout.createSequentialGroup()
                        .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panel_editproLayout.createSequentialGroup()
                                .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_edit_pro_cprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_add_pro_proid, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_editproLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lbl_edit_prodelimg, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(lbl_edit_proaddimg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_editproLayout.createSequentialGroup()
                        .addComponent(lbl_edit_proimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_edit_pro_sprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_edit_pro_brand, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_edit_pro_ctgy, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_edit_prodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_edit_pro_model, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_edit_proedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinner_edit_pro_qty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_edit_pro_ctgynm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_edit_ctgyedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_edit_ctgydel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(combo_edit_pro_ctgyid, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_edit_pro_brandnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_edit_brandedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_edit_branddel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(combo_edit_pro_brandid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_editproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_edit_pro_modelnm, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edit_modeledit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edit_modeldel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_edit_pro_modelid, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        panel_prodet.setkBorderRadius(40);
        panel_prodet.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_prodet.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_prodet.setOpaque(false);

        txt_prodet_proid.setBackground(new java.awt.Color(228, 235, 246));
        txt_prodet_proid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_prodet_proid.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_prodet_proid.setLabelText("EMPLOYEE ID OR NAME");
        txt_prodet_proid.setLineColor(new java.awt.Color(68, 82, 121));
        txt_prodet_proid.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_prodet_proid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_prodet_proidKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_prodet_proidKeyReleased(evt);
            }
        });

        jScrollPane5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        table_empdet1.setBackground(new java.awt.Color(228, 235, 246));
        table_empdet1.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        table_empdet1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Coss Price", "Sell price", "Qty", "Category", "Brand", "Model"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_empdet1.setOpaque(false);
        table_empdet1.setRowHeight(40);
        table_empdet1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                table_empdet1KeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(table_empdet1);

        javax.swing.GroupLayout panel_prodetLayout = new javax.swing.GroupLayout(panel_prodet);
        panel_prodet.setLayout(panel_prodetLayout);
        panel_prodetLayout.setHorizontalGroup(
            panel_prodetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_prodetLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_prodetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_prodet_proid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        panel_prodetLayout.setVerticalGroup(
            panel_prodetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_prodetLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txt_prodet_proid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addGap(25, 25, 25))
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
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_editpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25)))
            .addGroup(panel_promainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_promainLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(panel_prodet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
            .addGroup(panel_promainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_promainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_pro_fulldet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(panel_promainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_promainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_addpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(panel_promainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_promainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_addpro_mcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panel_promainLayout.setVerticalGroup(
            panel_promainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(panel_promainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_promainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_editpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(8, Short.MAX_VALUE)))
            .addGroup(panel_promainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_promainLayout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(panel_prodet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(panel_promainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_promainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_pro_fulldet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(8, Short.MAX_VALUE)))
            .addGroup(panel_promainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_promainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_addpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(8, Short.MAX_VALUE)))
            .addGroup(panel_promainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_promainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_addpro_mcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(8, Short.MAX_VALUE)))
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

        panel_addBill.setkBorderRadius(40);
        panel_addBill.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_addBill.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_addBill.setOpaque(false);

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
        btn_addbill.setNextFocusableComponent(btn_updtbill);
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

        javax.swing.GroupLayout panel_addBillLayout = new javax.swing.GroupLayout(panel_addBill);
        panel_addBill.setLayout(panel_addBillLayout);
        panel_addBillLayout.setHorizontalGroup(
            panel_addBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addBillLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_addBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indicatorAddbill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_addbill, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_addBillLayout.setVerticalGroup(
            panel_addBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addBillLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_addbill, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicatorAddbill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_updateBill.setkBorderRadius(40);
        panel_updateBill.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_updateBill.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_updateBill.setOpaque(false);

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
        btn_updtbill.setNextFocusableComponent(btn_billdet);
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

        javax.swing.GroupLayout panel_updateBillLayout = new javax.swing.GroupLayout(panel_updateBill);
        panel_updateBill.setLayout(panel_updateBillLayout);
        panel_updateBillLayout.setHorizontalGroup(
            panel_updateBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_updateBillLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_updateBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indicator_updt_bill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_updtbill, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_updateBillLayout.setVerticalGroup(
            panel_updateBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_updateBillLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_updtbill, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicator_updt_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_addcustmenu16.setkBorderRadius(40);
        panel_addcustmenu16.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_addcustmenu16.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_addcustmenu16.setOpaque(false);

        indicatorExtraBill.setkEndColor(new java.awt.Color(209, 216, 224));
        indicatorExtraBill.setkStartColor(new java.awt.Color(209, 216, 224));
        indicatorExtraBill.setOpaque(false);

        javax.swing.GroupLayout indicatorExtraBillLayout = new javax.swing.GroupLayout(indicatorExtraBill);
        indicatorExtraBill.setLayout(indicatorExtraBillLayout);
        indicatorExtraBillLayout.setHorizontalGroup(
            indicatorExtraBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        indicatorExtraBillLayout.setVerticalGroup(
            indicatorExtraBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
        btn_detPro1.setNextFocusableComponent(btn_addbill);
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
                    .addComponent(indicatorExtraBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_detPro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        panel_addcustmenu16Layout.setVerticalGroup(
            panel_addcustmenu16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcustmenu16Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_detPro1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicatorExtraBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        btn_billdet.setNextFocusableComponent(btn_detPro1);
        btn_billdet.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_billdetFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_billdetFocusLost(evt);
            }
        });
        btn_billdet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_billdetMouseEntered(evt);
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
                .addComponent(panel_addBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_updateBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_addcustmenu17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_addcustmenu16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 149, Short.MAX_VALUE))
        );
        panel_billmenuLayout.setVerticalGroup(
            panel_billmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_addBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_updateBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        loginBtn15.setText("CALCULATE");
        loginBtn15.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
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

        combo_add_bill_cusid.setBackground(new java.awt.Color(228, 235, 246));
        combo_add_bill_cusid.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CUSTOMER ID" }));
        combo_add_bill_cusid.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        combo_add_bill_cusid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_add_bill_cusidItemStateChanged(evt);
            }
        });

        combo_add_bill_proid.setBackground(new java.awt.Color(228, 235, 246));
        combo_add_bill_proid.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PRODUC ID" }));
        combo_add_bill_proid.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        combo_add_bill_proid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_add_bill_proidItemStateChanged(evt);
            }
        });

        productTable.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CATEGORY", "BRAND", "MODEL", "PRICE", "QTY", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(productTable);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CUSTOMER DETAIL");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Product Detail");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanel1.setBackground(new java.awt.Color(228, 235, 246));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("BILL NO.");

        lbl_billno.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_billno.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_billno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lbl_billno, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBackground(new java.awt.Color(228, 235, 246));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel14.setText("TOTAL :");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel15.setText("TAX :");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel16.setText("DISCOUNT :");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel17.setText("Paid :");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel18.setText("Net Total :");

        lbl_add_bill_ntot.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        txt_add_bill_dis.setText("0");
        txt_add_bill_dis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_add_bill_disKeyReleased(evt);
            }
        });

        txt_add_bill_tax.setText("0");
        txt_add_bill_tax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_add_bill_taxKeyReleased(evt);
            }
        });

        lbl_add_bill_tot.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_add_bill_paid, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(txt_add_bill_tax, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(txt_add_bill_dis)
                    .addComponent(lbl_add_bill_ntot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_add_bill_tot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(lbl_add_bill_tot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_add_bill_tax, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txt_add_bill_dis, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(lbl_add_bill_ntot, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txt_add_bill_paid, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        btn_proadd_table.setBorder(null);
        btn_proadd_table.setText("ADD");
        btn_proadd_table.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_proadd_table.setkBorderRadius(30);
        btn_proadd_table.setkEndColor(new java.awt.Color(68, 82, 121));
        btn_proadd_table.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        btn_proadd_table.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        btn_proadd_table.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        btn_proadd_table.setkStartColor(new java.awt.Color(68, 82, 121));
        btn_proadd_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_proadd_tableMouseClicked(evt);
            }
        });

        loginBtn17.setBorder(null);
        loginBtn17.setText("SAVE");
        loginBtn17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn17.setkBorderRadius(30);
        loginBtn17.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn17.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        loginBtn17.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn17.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        loginBtn17.setkStartColor(new java.awt.Color(68, 82, 121));
        loginBtn17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtn17MouseClicked(evt);
            }
        });

        loginBtn18.setBorder(null);
        loginBtn18.setText("SEND");
        loginBtn18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn18.setkBorderRadius(30);
        loginBtn18.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn18.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        loginBtn18.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn18.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        loginBtn18.setkStartColor(new java.awt.Color(68, 82, 121));
        loginBtn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtn18ActionPerformed(evt);
            }
        });

        txt_add_bill_email.setEditable(false);
        txt_add_bill_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_add_bill_email.setText("EMAIL");

        txt_add_bill_con.setEditable(false);
        txt_add_bill_con.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_add_bill_con.setText("CONTACT NO.");

        txt_add_bill_snm.setEditable(false);
        txt_add_bill_snm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_add_bill_snm.setText("SHOP NAME");

        txt_add_bill_price.setEditable(false);
        txt_add_bill_price.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_add_bill_price.setText("PRICE");

        txt_add_bill_ctgry.setEditable(false);
        txt_add_bill_ctgry.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_add_bill_ctgry.setText("CATEGORY");

        txt_add_bill_brand.setEditable(false);
        txt_add_bill_brand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_add_bill_brand.setText("BRAND");

        txt_add_bill_model.setEditable(false);
        txt_add_bill_model.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_add_bill_model.setText("MODEL");

        txt_add_pro_qty1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_pro_qty1.setLabelText("QTY");

        javax.swing.GroupLayout panel_createbillLayout = new javax.swing.GroupLayout(panel_createbill);
        panel_createbill.setLayout(panel_createbillLayout);
        panel_createbillLayout.setHorizontalGroup(
            panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panel_createbillLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_createbillLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_createbillLayout.createSequentialGroup()
                                .addComponent(loginBtn17, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(loginBtn18, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(panel_createbillLayout.createSequentialGroup()
                        .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_createbillLayout.createSequentialGroup()
                                .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(combo_add_bill_cusid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(txt_add_bill_snm, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_add_bill_email, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txt_add_bill_con, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_createbillLayout.createSequentialGroup()
                                .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_add_bill_model, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_createbillLayout.createSequentialGroup()
                                        .addComponent(txt_add_bill_price, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_add_pro_qty1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(panel_createbillLayout.createSequentialGroup()
                                        .addComponent(combo_add_bill_proid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_add_bill_ctgry, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_add_bill_brand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_createbillLayout.createSequentialGroup()
                                        .addComponent(loginBtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_proadd_table, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(25, 25, 25))))
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_createbillLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        panel_createbillLayout.setVerticalGroup(
            panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_createbillLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_add_bill_cusid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_bill_email, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_bill_con, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_bill_snm, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_add_bill_ctgry, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_add_bill_proid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_add_bill_brand, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_add_bill_model, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_bill_price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_pro_qty1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_createbillLayout.createSequentialGroup()
                        .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_proadd_table, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(loginBtn15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_createbillLayout.createSequentialGroup()
                        .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginBtn17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginBtn18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        panel_updatbill.setkBorderRadius(40);
        panel_updatbill.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_updatbill.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_updatbill.setOpaque(false);
        panel_updatbill.setPreferredSize(new java.awt.Dimension(1011, 610));

        table_bill.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        table_bill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "SNAME", "EMAIL", "CONTACT", "CATEGORY", "BRAND", "MODEL", "PRICE", "QTY", "TAX", "DISCOUNT", "NET TOTAL", "PAID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(table_bill);

        combo_edit_billid.setBackground(new java.awt.Color(228, 235, 246));
        combo_edit_billid.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BILL ID" }));
        combo_edit_billid.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        combo_edit_billid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_edit_billidItemStateChanged(evt);
            }
        });

        chk_paddingBill.setText("PENDING BILL");
        chk_paddingBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_paddingBillMouseClicked(evt);
            }
        });

        txt_edit_paidTotal.setBackground(new java.awt.Color(228, 235, 246));
        txt_edit_paidTotal.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_edit_paidTotal.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_edit_paidTotal.setLabelText("EDIT TOTAL");
        txt_edit_paidTotal.setLineColor(new java.awt.Color(68, 82, 121));
        txt_edit_paidTotal.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_edit_paidTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_edit_paidTotalKeyPressed(evt);
            }
        });

        txt_searchBill_data.setBackground(new java.awt.Color(228, 235, 246));
        txt_searchBill_data.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_searchBill_data.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_searchBill_data.setLabelText("SEARCH");
        txt_searchBill_data.setLineColor(new java.awt.Color(68, 82, 121));
        txt_searchBill_data.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_searchBill_data.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_searchBill_dataKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchBill_dataKeyReleased(evt);
            }
        });

        btn_edit_editPaidTotal.setBorder(null);
        btn_edit_editPaidTotal.setText("SAVE");
        btn_edit_editPaidTotal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_edit_editPaidTotal.setkBorderRadius(30);
        btn_edit_editPaidTotal.setkEndColor(new java.awt.Color(68, 82, 121));
        btn_edit_editPaidTotal.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        btn_edit_editPaidTotal.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        btn_edit_editPaidTotal.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        btn_edit_editPaidTotal.setkStartColor(new java.awt.Color(68, 82, 121));
        btn_edit_editPaidTotal.setNextFocusableComponent(txt_add_custid);
        btn_edit_editPaidTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_edit_editPaidTotalMouseClicked(evt);
            }
        });

        loginBtn20.setBorder(null);
        loginBtn20.setText("SEND");
        loginBtn20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn20.setkBorderRadius(30);
        loginBtn20.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn20.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        loginBtn20.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn20.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        loginBtn20.setkStartColor(new java.awt.Color(68, 82, 121));
        loginBtn20.setNextFocusableComponent(txt_add_custid);

        btn_edit_deleteBillDet.setBorder(null);
        btn_edit_deleteBillDet.setText("DELETE");
        btn_edit_deleteBillDet.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_edit_deleteBillDet.setkBorderRadius(30);
        btn_edit_deleteBillDet.setkEndColor(new java.awt.Color(68, 82, 121));
        btn_edit_deleteBillDet.setkHoverEndColor(new java.awt.Color(178, 199, 231));
        btn_edit_deleteBillDet.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        btn_edit_deleteBillDet.setkHoverStartColor(new java.awt.Color(178, 199, 231));
        btn_edit_deleteBillDet.setkStartColor(new java.awt.Color(68, 82, 121));
        btn_edit_deleteBillDet.setNextFocusableComponent(txt_add_custid);
        btn_edit_deleteBillDet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_edit_deleteBillDetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_updatbillLayout = new javax.swing.GroupLayout(panel_updatbill);
        panel_updatbill.setLayout(panel_updatbillLayout);
        panel_updatbillLayout.setHorizontalGroup(
            panel_updatbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_updatbillLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_updatbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_updatbillLayout.createSequentialGroup()
                        .addComponent(txt_searchBill_data, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chk_paddingBill, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_updatbillLayout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_updatbillLayout.createSequentialGroup()
                        .addComponent(combo_edit_billid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_edit_paidTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_edit_editPaidTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loginBtn20, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_edit_deleteBillDet, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panel_updatbillLayout.setVerticalGroup(
            panel_updatbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_updatbillLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panel_updatbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_updatbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo_edit_billid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_edit_paidTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_updatbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(loginBtn20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_edit_editPaidTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_edit_deleteBillDet, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(panel_updatbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_paddingBill, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_searchBill_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        panel_detbill.setkBorderRadius(40);
        panel_detbill.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_detbill.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_detbill.setOpaque(false);

        txtarea_bill.setColumns(20);
        txtarea_bill.setRows(5);
        jScrollPane6.setViewportView(txtarea_bill);

        javax.swing.GroupLayout panel_detbillLayout = new javax.swing.GroupLayout(panel_detbill);
        panel_detbill.setLayout(panel_detbillLayout);
        panel_detbillLayout.setHorizontalGroup(
            panel_detbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_detbillLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
        );
        panel_detbillLayout.setVerticalGroup(
            panel_detbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_detbillLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
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
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(panel_billmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_billmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_detbill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(27, Short.MAX_VALUE)))
            .addGroup(panel_billmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_billmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_extrabill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(27, Short.MAX_VALUE)))
            .addGroup(panel_billmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_billmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_updatbill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(27, Short.MAX_VALUE)))
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
                    .addGap(50, 50, 50)
                    .addComponent(panel_billmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panel_account.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_account.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_account.setPreferredSize(new java.awt.Dimension(1061, 710));

        panel_accountmenu.setkBorderRadius(40);
        panel_accountmenu.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_accountmenu.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_accountmenu.setOpaque(false);

        panel_addcustmenu10.setkBorderRadius(40);
        panel_addcustmenu10.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_addcustmenu10.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_addcustmenu10.setOpaque(false);

        indicatorasetting.setkEndColor(new java.awt.Color(209, 216, 224));
        indicatorasetting.setkStartColor(new java.awt.Color(209, 216, 224));
        indicatorasetting.setOpaque(false);

        javax.swing.GroupLayout indicatorasettingLayout = new javax.swing.GroupLayout(indicatorasetting);
        indicatorasetting.setLayout(indicatorasettingLayout);
        indicatorasettingLayout.setHorizontalGroup(
            indicatorasettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        indicatorasettingLayout.setVerticalGroup(
            indicatorasettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        btn_setting.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_setting.setText("SETTING");
        btn_setting.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_setting.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_setting.setkBorderRadius(20);
        btn_setting.setkEndColor(new java.awt.Color(178, 199, 231));
        btn_setting.setkHoverColor(new java.awt.Color(68, 82, 121));
        btn_setting.setkHoverEndColor(new java.awt.Color(68, 82, 121));
        btn_setting.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_setting.setkHoverStartColor(new java.awt.Color(68, 82, 121));
        btn_setting.setkPressedColor(new java.awt.Color(68, 82, 121));
        btn_setting.setkSelectedColor(new java.awt.Color(68, 82, 121));
        btn_setting.setkStartColor(new java.awt.Color(178, 199, 231));
        btn_setting.setNextFocusableComponent(btn_updtbill);
        btn_setting.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_settingFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_settingFocusLost(evt);
            }
        });
        btn_setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_settingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_settingMouseEntered(evt);
            }
        });
        btn_setting.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_settingKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_addcustmenu10Layout = new javax.swing.GroupLayout(panel_addcustmenu10);
        panel_addcustmenu10.setLayout(panel_addcustmenu10Layout);
        panel_addcustmenu10Layout.setHorizontalGroup(
            panel_addcustmenu10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcustmenu10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_addcustmenu10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indicatorasetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_setting, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_addcustmenu10Layout.setVerticalGroup(
            panel_addcustmenu10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcustmenu10Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_setting, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicatorasetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_addcustmenu12.setkBorderRadius(40);
        panel_addcustmenu12.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_addcustmenu12.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_addcustmenu12.setOpaque(false);

        indicator_updt_bill1.setkEndColor(new java.awt.Color(209, 216, 224));
        indicator_updt_bill1.setkStartColor(new java.awt.Color(209, 216, 224));
        indicator_updt_bill1.setOpaque(false);

        javax.swing.GroupLayout indicator_updt_bill1Layout = new javax.swing.GroupLayout(indicator_updt_bill1);
        indicator_updt_bill1.setLayout(indicator_updt_bill1Layout);
        indicator_updt_bill1Layout.setHorizontalGroup(
            indicator_updt_bill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );
        indicator_updt_bill1Layout.setVerticalGroup(
            indicator_updt_bill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        btn_updtbill1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_updtbill1.setText("UPDATE BILL");
        btn_updtbill1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_updtbill1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_updtbill1.setkBorderRadius(20);
        btn_updtbill1.setkEndColor(new java.awt.Color(178, 199, 231));
        btn_updtbill1.setkHoverEndColor(new java.awt.Color(68, 82, 121));
        btn_updtbill1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_updtbill1.setkHoverStartColor(new java.awt.Color(68, 82, 121));
        btn_updtbill1.setkPressedColor(new java.awt.Color(68, 82, 121));
        btn_updtbill1.setkStartColor(new java.awt.Color(178, 199, 231));
        btn_updtbill1.setNextFocusableComponent(btn_billdet);
        btn_updtbill1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_updtbill1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_updtbill1FocusLost(evt);
            }
        });
        btn_updtbill1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_updtbill1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_updtbill1MouseEntered(evt);
            }
        });
        btn_updtbill1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_updtbill1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_addcustmenu12Layout = new javax.swing.GroupLayout(panel_addcustmenu12);
        panel_addcustmenu12.setLayout(panel_addcustmenu12Layout);
        panel_addcustmenu12Layout.setHorizontalGroup(
            panel_addcustmenu12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcustmenu12Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_addcustmenu12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indicator_updt_bill1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_updtbill1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_addcustmenu12Layout.setVerticalGroup(
            panel_addcustmenu12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addcustmenu12Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_updtbill1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicator_updt_bill1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panel_accountmenuLayout = new javax.swing.GroupLayout(panel_accountmenu);
        panel_accountmenu.setLayout(panel_accountmenuLayout);
        panel_accountmenuLayout.setHorizontalGroup(
            panel_accountmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_accountmenuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel_addcustmenu10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_addcustmenu12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_accountmenuLayout.setVerticalGroup(
            panel_accountmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_addcustmenu10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_addcustmenu12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_accountmain.setkBorderRadius(40);
        panel_accountmain.setkEndColor(new java.awt.Color(178, 199, 231));
        panel_accountmain.setkStartColor(new java.awt.Color(178, 199, 231));
        panel_accountmain.setOpaque(false);

        panel_accountsetting.setkBorderRadius(40);
        panel_accountsetting.setkEndColor(new java.awt.Color(228, 235, 246));
        panel_accountsetting.setkStartColor(new java.awt.Color(228, 235, 246));
        panel_accountsetting.setOpaque(false);

        lbl_add_empimg3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add_empimg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/man.png"))); // NOI18N

        lbl_add_prormimg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add_prormimg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/substract.png"))); // NOI18N
        lbl_add_prormimg2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_add_prormimg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_add_prormimg2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_add_prormimg2MouseExited(evt);
            }
        });

        lbl_add_proaddimg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add_proaddimg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add-user.png"))); // NOI18N
        lbl_add_proaddimg2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_add_proaddimg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_add_proaddimg2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_add_proaddimg2MouseExited(evt);
            }
        });

        txt_add_pro_id3.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_pro_id3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_pro_id3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_pro_id3.setLabelText("Name");
        txt_add_pro_id3.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id3.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_pro_id3KeyPressed(evt);
            }
        });

        txt_add_pro_id8.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_pro_id8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_pro_id8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_pro_id8.setLabelText("Contact no.");
        txt_add_pro_id8.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id8.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_pro_id8KeyPressed(evt);
            }
        });

        txt_add_pro_id9.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_pro_id9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_pro_id9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_pro_id9.setLabelText("Email");
        txt_add_pro_id9.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id9.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_pro_id9KeyPressed(evt);
            }
        });

        txt_add_pro_id10.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_pro_id10.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_pro_id10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_pro_id10.setLabelText("Address");
        txt_add_pro_id10.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id10.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_pro_id10KeyPressed(evt);
            }
        });

        txt_add_pro_id11.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_pro_id11.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_pro_id11.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_pro_id11.setLabelText("Password");
        txt_add_pro_id11.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id11.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_pro_id11KeyPressed(evt);
            }
        });

        txt_add_pro_id12.setBackground(new java.awt.Color(228, 235, 246));
        txt_add_pro_id12.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_add_pro_id12.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_add_pro_id12.setLabelText("Confirm Password");
        txt_add_pro_id12.setLineColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id12.setSelectionColor(new java.awt.Color(68, 82, 121));
        txt_add_pro_id12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_add_pro_id12KeyPressed(evt);
            }
        });

        loginBtn22.setBorder(null);
        loginBtn22.setMnemonic('c');
        loginBtn22.setText("UPDATE");
        loginBtn22.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn22.setkBorderRadius(30);
        loginBtn22.setkEndColor(new java.awt.Color(68, 82, 121));
        loginBtn22.setkHoverEndColor(new java.awt.Color(228, 235, 246));
        loginBtn22.setkHoverForeGround(new java.awt.Color(68, 82, 121));
        loginBtn22.setkHoverStartColor(new java.awt.Color(228, 235, 246));
        loginBtn22.setkStartColor(new java.awt.Color(68, 82, 121));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("ID 12345");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panel_accountsettingLayout = new javax.swing.GroupLayout(panel_accountsetting);
        panel_accountsetting.setLayout(panel_accountsettingLayout);
        panel_accountsettingLayout.setHorizontalGroup(
            panel_accountsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_accountsettingLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(panel_accountsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_accountsettingLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_add_empimg3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_accountsettingLayout.createSequentialGroup()
                        .addComponent(txt_add_pro_id3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))
                    .addGroup(panel_accountsettingLayout.createSequentialGroup()
                        .addGroup(panel_accountsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_add_pro_id9, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_add_pro_id11, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106)))
                .addGroup(panel_accountsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_accountsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_add_proaddimg2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_add_prormimg2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_accountsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_add_pro_id8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_add_pro_id10, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_add_pro_id12, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
            .addGroup(panel_accountsettingLayout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(loginBtn22, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_accountsettingLayout.setVerticalGroup(
            panel_accountsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_accountsettingLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_accountsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_add_empimg3)
                    .addGroup(panel_accountsettingLayout.createSequentialGroup()
                        .addComponent(lbl_add_prormimg2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_add_proaddimg2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_accountsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_add_pro_id3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_pro_id8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(panel_accountsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_add_pro_id9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_pro_id10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(panel_accountsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_add_pro_id11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_pro_id12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(loginBtn22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        kGradientPanel5.setkBorderRadius(40);
        kGradientPanel5.setkEndColor(new java.awt.Color(228, 235, 246));
        kGradientPanel5.setkStartColor(new java.awt.Color(228, 235, 246));
        kGradientPanel5.setOpaque(false);

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1011, Short.MAX_VALUE)
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_accountmainLayout = new javax.swing.GroupLayout(panel_accountmain);
        panel_accountmain.setLayout(panel_accountmainLayout);
        panel_accountmainLayout.setHorizontalGroup(
            panel_accountmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_accountmainLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(panel_accountmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_accountmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_accountsetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(25, 25, 25)))
        );
        panel_accountmainLayout.setVerticalGroup(
            panel_accountmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_accountmainLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(panel_accountmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_accountmainLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panel_accountsetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(25, 25, 25)))
        );

        javax.swing.GroupLayout panel_accountLayout = new javax.swing.GroupLayout(panel_account);
        panel_account.setLayout(panel_accountLayout);
        panel_accountLayout.setHorizontalGroup(
            panel_accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_accountmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_accountmain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_accountLayout.setVerticalGroup(
            panel_accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_accountLayout.createSequentialGroup()
                .addComponent(panel_accountmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panel_accountmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        visibility(evt.getKeyCode(), btn_setting, false, false, false, false, true, false, false);
        panel_accountsetting.setVisible(true);
        kGradientPanel5.setVisible(false);
        indicatorasetting.setkStartColor(new Color(68, 82, 121));
        indicatorasetting.setkEndColor(new Color(68, 82, 121));
        indicatorasetting.setBackground(new Color(68, 82, 121));
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
        visibility(btn_setting, false, false, false, false, true, false, false);
        HoverColor(pnl_account, lbl_account, Color.WHITE, Color.WHITE, Color.BLACK);
        panel_accountsetting.setVisible(true);
        kGradientPanel5.setVisible(false);
        indicatorasetting.setkStartColor(new Color(68, 82, 121));
        indicatorasetting.setkEndColor(new Color(68, 82, 121));
        indicatorasetting.setBackground(new Color(68, 82, 121));
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
        visibility(evt.getKeyCode(), btn_addbill, false, false, false, true, false, false, false);
        visibility(panel_createbill, true, panel_updatbill, false, panel_detbill, false, panel_detbill, false);
        indicator(indicatorAddbill, indicator_updt_bill, indicator_bill_det);
        comboboxdataId(combo_add_bill_cusid, "customer", "CUSTOMER ID");
        comboboxdataId(combo_add_bill_proid, "product", "PRODUCT ID");
        autoId(lbl_billno, "bill");
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
        visibility(btn_addbill, false, false, false, true, false, false, false);
        HoverColor(pnl_bill, lbl_bill, Color.WHITE, Color.WHITE, Color.BLACK);
        visibility(panel_createbill, true, panel_updatbill, false, panel_detbill, false, panel_extrabill, false);
        indicator(indicatorAddbill, indicator_updt_bill, indicator_bill_det, indicatorExtraBill);
        comboboxdata(combo_add_pro_ctgry, "category");
        comboboxdata(combo_add_pro_brand, "brand");
        comboboxdata(combo_add_pro_model, "model");
        comboboxdataId(combo_add_bill_cusid, "customer", "CUSTOMER ID");
        comboboxdataId(combo_add_bill_proid, "product", "PRODUCT ID");
        autoId(lbl_billno, "bill");
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
        autoId(txt_add_pro_id, "product");
        comboboxdata(combo_add_pro_ctgry, "category");
        comboboxdata(combo_add_pro_brand, "brand");
        comboboxdata(combo_add_pro_model, "model");
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
        autoId(txt_add_pro_id, "product");
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
        autoId(txt_add_empid, "emp");
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
        autoId(txt_add_empid, "emp");
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
        autoId(txt_add_custid, "customer");
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
        autoId(txt_add_custid, "customer");
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
        loginBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_loginBtnMouseEntered

    private void loginBtnKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_loginBtnKeyPressed
    {//GEN-HEADEREND:event_loginBtnKeyPressed
        if (checkEmptyTxtfiled(txt_add_custid, txt_add_custnm, txt_add_custno, txt_add_custemail, txt_add_custsnm, txt_add_custsaddress) == true) {
            addCustomer();
            autoId(txt_add_custid, "customer");
        }
    }//GEN-LAST:event_loginBtnKeyPressed

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

    private void btnAddCtgyActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddCtgyActionPerformed
    {//GEN-HEADEREND:event_btnAddCtgyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddCtgyActionPerformed

    private void btn_addempFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_addempFocusGained
        HoverColor(btn_addemp, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addempFocusGained

    private void btn_addempFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_addempFocusLost
        HoverColor(btn_addemp, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addempFocusLost

    private void btn_addempMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addempMouseClicked
        visibility(txt_add_empnm, panel_addemp, true, panel_editemp, false, panel_detemp, false);
        indicatorOn(indicatorAddemp, indicatorEditemp, indicatorEmpdet);
        HoverColor(btn_addemp, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addempMouseClicked

    private void btn_addempKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_addempKeyPressed
        visibility(txt_add_empnm, panel_addemp, true, panel_editemp, false, panel_detemp, false);
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
        fetchDataIntoTableEmp(table_empedit, "emp");
    }//GEN-LAST:event_btn_editempMouseClicked

    private void btn_editempKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_editempKeyPressed
        visibility(txt_edit_empnm, panel_addemp, false, panel_editemp, true, panel_detemp, false);

        escape(lbl_employee, evt.getKeyCode(), panel_employee);
        indicatorOn(indicatorEditemp, indicatorAddemp, indicatorEmpdet);
        HoverColor(btn_editemp, new Color(178, 199, 231), new Color(255, 255, 255));
        fetchDataIntoTableEmp(table_empedit, "emp");
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
        fetchDataIntoTableEmp(table_empdet, "emp");
    }//GEN-LAST:event_btn_empdetMouseClicked

    private void btn_empdetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_empdetKeyPressed
        visibility(txt_det_empid, panel_addemp, false, panel_editemp, false, panel_detemp, true);

        escape(lbl_employee, evt.getKeyCode(), panel_employee);
        indicatorOn(indicatorEmpdet, indicatorAddemp, indicatorEditemp);
        HoverColor(btn_empdet, new Color(178, 199, 231), new Color(255, 255, 255));
        fetchDataIntoTableEmp(table_empdet, "emp");
    }//GEN-LAST:event_btn_empdetKeyPressed

    private void btn_addcustMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addcustMouseClicked
        visibility(txt_add_custnm, panel_addcust, true, panel_editcus, false, panel_custdetail, false);
        indicatorOn(indicatorAddcust, indicatorEditcust, indicatorDetcust);
        HoverColor(btn_editcust, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addcustMouseClicked

    private void btn_addcustKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_addcustKeyPressed
        visibility(txt_add_custnm, panel_addcust, true, panel_editcus, false, panel_custdetail, false);

        escape(lbl_customer, evt.getKeyCode(), panel_customer);
        HoverColor(btn_addcust, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addcustKeyPressed

    private void btn_editcustMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editcustMouseClicked
        visibility(txt_edit_custnm, panel_addcust, false, panel_editcus, true, panel_custdetail, false);
        indicatorOn(indicatorEditcust, indicatorAddcust, indicatorDetcust);
        HoverColor(btn_editcust, new Color(178, 199, 231), new Color(255, 255, 255));
        fetchDataIntoTableCust(table_custedit, "customer");
    }//GEN-LAST:event_btn_editcustMouseClicked

    private void btn_editcustKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_editcustKeyPressed
        visibility(txt_edit_custnm, panel_addcust, false, panel_editcus, true, panel_custdetail, false);
        escape(lbl_customer, evt.getKeyCode(), panel_customer);
        indicatorOn(indicatorEditcust, indicatorAddcust, indicatorDetcust);
        HoverColor(btn_editcust, new Color(178, 199, 231), new Color(255, 255, 255));
        fetchDataIntoTableCust(table_custedit, "customer");
    }//GEN-LAST:event_btn_editcustKeyPressed

    private void btn_detcustMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_detcustMouseClicked
        visibility(txt_det_custid, panel_addcust, false, panel_editcus, false, panel_custdetail, true);
        indicatorOn(indicatorDetcust, indicatorAddcust, indicatorEditcust);
        HoverColor(btn_detcust, new Color(178, 199, 231), new Color(255, 255, 255));
        fetchDataIntoTableCust(table_custdet, "customer");
    }//GEN-LAST:event_btn_detcustMouseClicked

    private void btn_detcustKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_detcustKeyPressed
        visibility(txt_det_custid, panel_addcust, false, panel_editcus, false, panel_custdetail, true);
        escape(lbl_customer, evt.getKeyCode(), panel_customer);
        indicatorOn(indicatorDetcust, indicatorAddcust, indicatorEditcust);
        HoverColor(btn_detcust, new Color(178, 199, 231), new Color(255, 255, 255));
        fetchDataIntoTableCust(table_custdet, "customer");
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
        comboboxdata(combo_add_pro_ctgry, "category");
        comboboxdata(combo_add_pro_brand, "brand");
        comboboxdata(combo_add_pro_model, "model");
    }//GEN-LAST:event_btn_addproMouseClicked

    private void btn_addproKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_addproKeyPressed
        visibility(txt_add_pro_id, panel_addpro, true, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, false);
        escape(lbl_product, evt.getKeyCode(), panel_product);
        HoverColor(btn_addpro, new Color(178, 199, 231), new Color(255, 255, 255));
        autoId(txt_add_pro_id, "product");
        comboboxdata(combo_add_pro_ctgry, "category");
        comboboxdata(combo_add_pro_brand, "brand");
        comboboxdata(combo_add_pro_model, "model");
    }//GEN-LAST:event_btn_addproKeyPressed

    private void btn_detProFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_detProFocusGained
        HoverColor(btn_detPro, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_detProFocusGained

    private void btn_detProFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_detProFocusLost
        HoverColor(btn_detPro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_detProFocusLost

    private void btn_detProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_detProMouseClicked
        visibility(txt_prodet_proid, panel_addpro, false, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, true, panel_pro_fulldet, false);
        indicatorOn(indicatorDetpro, indicatorAddpro, indicatorAddmodal, indicatorEditpro);
        HoverColor(btn_detPro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_detProMouseClicked

    private void btn_detProKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_detProKeyPressed
        visibility(txt_prodet_proid, panel_addpro, false, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, true, panel_pro_fulldet, false);
        escape(lbl_product, evt.getKeyCode(), panel_product);
        indicatorOn(indicatorDetpro, indicatorAddpro, indicatorAddmodal, indicatorEditpro);
        HoverColor(btn_detPro, new Color(178, 199, 231), new Color(255, 255, 255));
        fetchDataIntoTablepro(table_empdet1, "product");
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
        visibility(txt_add_promcb_ctgy_nm, panel_addpro, false, panel_addpro_mcb, true, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, false);
        escape(lbl_product, evt.getKeyCode(), panel_product);
        indicatorOn(indicatorAddmodal, indicatorAddpro, indicatorEditpro, indicatorDetpro);
        HoverColor(btn_addmodal, new Color(178, 199, 231), new Color(255, 255, 255));
        autoId(txt_add_promcb_ctgy_id, "category");
        autoId(txt_add_promcb_brand_id, "brand");
        autoId(txt_add_promcb_model_id, "model");
    }//GEN-LAST:event_btn_addmodalKeyPressed

    private void btn_addmodalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addmodalMouseEntered
        btn_addmodal.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_addmodalMouseEntered

    private void btn_addmodalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addmodalMouseClicked
        visibility(txt_add_promcb_ctgy_nm, panel_addpro, false, panel_addpro_mcb, true, panel_editpro, false, panel_prodet, false, panel_pro_fulldet, false);
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
        visibility(combo_add_pro_proid, panel_addpro, false, panel_addpro_mcb, false, panel_editpro, true, panel_prodet, false, panel_pro_fulldet, false);
        indicatorOn(indicatorEditpro, indicatorAddpro, indicatorAddmodal, indicatorDetpro);
        HoverColor(btn_editPro, new Color(178, 199, 231), new Color(255, 255, 255));
        comboboxdataId(combo_add_pro_proid, "product", "PRODUCT ID");
        comboboxdataId(combo_edit_pro_ctgyid, "category", "CATEGORY ID");
        comboboxdataId(combo_edit_pro_brandid, "brand", "BRAND ID");
        comboboxdataId(combo_edit_pro_modelid, "model", "MODEL ID");
        comboboxdata(combo_edit_pro_ctgy, "category");
        comboboxdata(combo_edit_pro_brand, "brand");
        comboboxdata(combo_edit_pro_model, "model");
    }//GEN-LAST:event_btn_editProMouseClicked

    private void btn_editProMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editProMouseEntered
        btn_editPro.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_editProMouseEntered

    private void btn_editProKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_editProKeyPressed
        visibility(combo_add_pro_proid, panel_addpro, false, panel_addpro_mcb, false, panel_editpro, true, panel_prodet, false, panel_pro_fulldet, false);

        escape(lbl_product, evt.getKeyCode(), panel_product);
        indicatorOn(indicatorEditpro, indicatorAddpro, indicatorAddmodal, indicatorDetpro);
        HoverColor(btn_editPro, new Color(178, 199, 231), new Color(255, 255, 255));
        comboboxdataId(combo_add_pro_proid, "product", "PRODUCT ID");
        comboboxdataId(combo_edit_pro_ctgyid, "category", "CATEGORY ID");
        comboboxdataId(combo_edit_pro_brandid, "brand", "BRAND ID");
        comboboxdataId(combo_edit_pro_modelid, "model", "MODEL ID");
        comboboxdata(combo_edit_pro_ctgy, "category");
        comboboxdata(combo_edit_pro_brand, "brand");
        comboboxdata(combo_edit_pro_model, "model");
    }//GEN-LAST:event_btn_editProKeyPressed

    private void btnAddModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddModelActionPerformed

    private void lbl_edit_proaddimgMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_edit_proaddimgMouseExited
    {//GEN-HEADEREND:event_lbl_edit_proaddimgMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_edit_proaddimgMouseExited

    private void lbl_edit_proaddimgMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_edit_proaddimgMouseEntered
    {//GEN-HEADEREND:event_lbl_edit_proaddimgMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_edit_proaddimgMouseEntered

    private void lbl_edit_prodelimgMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_edit_prodelimgMouseExited
    {//GEN-HEADEREND:event_lbl_edit_prodelimgMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_edit_prodelimgMouseExited

    private void lbl_edit_prodelimgMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_edit_prodelimgMouseEntered
    {//GEN-HEADEREND:event_lbl_edit_prodelimgMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_edit_prodelimgMouseEntered

    private void btn_addbillFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_addbillFocusGained
    {//GEN-HEADEREND:event_btn_addbillFocusGained
        HoverColor(btn_addbill, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addbillFocusGained

    private void btn_addbillFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_addbillFocusLost
    {//GEN-HEADEREND:event_btn_addbillFocusLost
        HoverColor(btn_addbill, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_addbillFocusLost

    private void btn_addbillMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_addbillMouseClicked
    {//GEN-HEADEREND:event_btn_addbillMouseClicked
        visibility(txt_add_pro_id, panel_createbill, true, panel_updatbill, false, panel_detbill, false, panel_extrabill, false);
        indicatorOn(indicatorAddbill, indicator_updt_bill, indicator_bill_det, indicatorExtraBill);
        HoverColor(btn_addbill, new Color(178, 199, 231), new Color(255, 255, 255));
        comboboxdataId(combo_add_bill_cusid, "customer", "CUSTOMER ID");
        comboboxdataId(combo_add_bill_proid, "product", "PRODUCT ID");
        autoId(lbl_billno, "bill");
    }//GEN-LAST:event_btn_addbillMouseClicked

    private void btn_addbillMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_addbillMouseEntered
    {//GEN-HEADEREND:event_btn_addbillMouseEntered
        btn_addbill.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_addbillMouseEntered

    private void btn_addbillKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_addbillKeyPressed
    {//GEN-HEADEREND:event_btn_addbillKeyPressed
        visibility(txt_add_promcb_ctgy_nm, panel_createbill, true, panel_updatbill, false, panel_detbill, false, panel_extrabill, false);
        escape(lbl_bill, evt.getKeyCode(), panel_bill);
        indicatorOn(indicatorAddbill, indicator_updt_bill, indicator_bill_det, indicatorExtraBill);
        HoverColor(btn_addbill, new Color(178, 199, 231), new Color(255, 255, 255));
        comboboxdataId(combo_add_bill_cusid, "customer", "CUSTOMER ID");
        comboboxdataId(combo_add_bill_proid, "product", "PRODUCT ID");
        autoId(lbl_billno, "bill");
    }//GEN-LAST:event_btn_addbillKeyPressed

    private void btn_updtbillFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_updtbillFocusGained
    {//GEN-HEADEREND:event_btn_updtbillFocusGained
        HoverColor(btn_updtbill, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_updtbillFocusGained

    private void btn_updtbillFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_updtbillFocusLost
    {//GEN-HEADEREND:event_btn_updtbillFocusLost
        HoverColor(btn_updtbill, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_updtbillFocusLost

    private void btn_updtbillMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_updtbillMouseClicked
    {//GEN-HEADEREND:event_btn_updtbillMouseClicked
        visibility(txt_add_promcb_ctgy_nm, panel_createbill, false, panel_updatbill, true, panel_detbill, false, panel_extrabill, false);
        indicatorOn(indicator_updt_bill, indicatorAddbill, indicator_bill_det, indicatorExtraBill);
        HoverColor(btn_updtbill, new Color(178, 199, 231), new Color(255, 255, 255));
        fetchDataIntoTablebill(table_bill, "bill");
        comboboxdataId(combo_edit_billid, "bill", "BILL ID");
    }//GEN-LAST:event_btn_updtbillMouseClicked

    private void btn_updtbillMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_updtbillMouseEntered
    {//GEN-HEADEREND:event_btn_updtbillMouseEntered
        btn_updtbill.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_updtbillMouseEntered

    private void btn_updtbillKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_updtbillKeyPressed
    {//GEN-HEADEREND:event_btn_updtbillKeyPressed
        visibility(txt_add_promcb_brand_nm, panel_createbill, false, panel_updatbill, true, panel_detbill, false, panel_extrabill, false);

        escape(lbl_bill, evt.getKeyCode(), panel_bill);
        indicatorOn(indicator_updt_bill, indicatorAddbill, indicator_bill_det, indicatorExtraBill);
        HoverColor(btn_updtbill, new Color(178, 199, 231), new Color(255, 255, 255));
        fetchDataIntoTablebill(table_bill, "bill");
        comboboxdataId(combo_edit_billid, "bill", "BILL ID");
    }//GEN-LAST:event_btn_updtbillKeyPressed

    private void btn_detPro1FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_detPro1FocusGained
    {//GEN-HEADEREND:event_btn_detPro1FocusGained
        HoverColor(btn_detPro1, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_detPro1FocusGained

    private void btn_detPro1FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_detPro1FocusLost
    {//GEN-HEADEREND:event_btn_detPro1FocusLost
        HoverColor(btn_detPro1, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_detPro1FocusLost

    private void btn_detPro1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_detPro1MouseClicked
    {//GEN-HEADEREND:event_btn_detPro1MouseClicked
        visibility(txt_prodet_proid, panel_addpro, false, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, true, panel_pro_fulldet, false);
        indicatorOn(indicatorDetpro, indicatorAddpro, indicatorAddmodal, indicatorEditpro);
        HoverColor(btn_detPro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_detPro1MouseClicked

    private void btn_detPro1MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_detPro1MouseEntered
    {//GEN-HEADEREND:event_btn_detPro1MouseEntered
        btn_detPro1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_detPro1MouseEntered

    private void btn_detPro1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_detPro1KeyPressed
    {//GEN-HEADEREND:event_btn_detPro1KeyPressed
        visibility(txt_prodet_proid, panel_addpro, false, panel_addpro_mcb, false, panel_editpro, false, panel_prodet, true, panel_pro_fulldet, false);
        escape(lbl_product, evt.getKeyCode(), panel_product);
        indicatorOn(indicatorDetpro, indicatorAddpro, indicatorAddmodal, indicatorEditpro);
        HoverColor(btn_detPro, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_detPro1KeyPressed

    private void btn_billdetFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_billdetFocusGained
    {//GEN-HEADEREND:event_btn_billdetFocusGained
        HoverColor(btn_billdet, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_billdetFocusGained

    private void btn_billdetFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_billdetFocusLost
    {//GEN-HEADEREND:event_btn_billdetFocusLost
        HoverColor(btn_billdet, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_billdetFocusLost

    private void btn_billdetMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_billdetMouseEntered
    {//GEN-HEADEREND:event_btn_billdetMouseEntered
        btn_billdet.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_billdetMouseEntered

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

    private void txt_edit_empnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edit_empnoKeyPressed
        escape(btn_editemp, evt.getKeyCode());
    }//GEN-LAST:event_txt_edit_empnoKeyPressed

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

    private void txt_add_pro_cpriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_pro_cpriceKeyPressed
        escape(btn_addpro, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_pro_cpriceKeyPressed

    private void txt_add_pro_spriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_pro_spriceKeyPressed
        escape(btn_addpro, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_pro_spriceKeyPressed

    private void txt_add_pro_descKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_pro_descKeyPressed
        escape(btn_addpro, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_pro_descKeyPressed

    private void txt_add_promcb_ctgy_nmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_promcb_ctgy_nmKeyPressed
        escape(btn_addmodal, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_promcb_ctgy_nmKeyPressed

    private void txt_add_promcb_brand_nmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_promcb_brand_nmKeyPressed
        escape(btn_addmodal, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_promcb_brand_nmKeyPressed

    private void txt_add_promcb_model_nmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_promcb_model_nmKeyPressed
        escape(btn_addmodal, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_promcb_model_nmKeyPressed

    private void txt_edit_pro_cpriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edit_pro_cpriceKeyPressed
        escape(btn_editPro, evt.getKeyCode());
    }//GEN-LAST:event_txt_edit_pro_cpriceKeyPressed

    private void txt_edit_pro_spriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edit_pro_spriceKeyPressed
        escape(btn_editPro, evt.getKeyCode());
    }//GEN-LAST:event_txt_edit_pro_spriceKeyPressed

    private void loginBtn18ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_loginBtn18ActionPerformed
    {//GEN-HEADEREND:event_loginBtn18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtn18ActionPerformed

    private void txt_edit_paidTotalKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_edit_paidTotalKeyPressed
    {//GEN-HEADEREND:event_txt_edit_paidTotalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_edit_paidTotalKeyPressed

    private void txt_searchBill_dataKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_searchBill_dataKeyPressed
    {//GEN-HEADEREND:event_txt_searchBill_dataKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchBill_dataKeyPressed

    private void btn_settingFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_settingFocusGained
    {//GEN-HEADEREND:event_btn_settingFocusGained
        HoverColor(btn_setting, new Color(68, 82, 121), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_settingFocusGained

    private void btn_settingFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_settingFocusLost
    {//GEN-HEADEREND:event_btn_settingFocusLost
        HoverColor(btn_setting, new Color(178, 199, 231), new Color(255, 255, 255));
    }//GEN-LAST:event_btn_settingFocusLost

    private void btn_settingMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_settingMouseClicked
    {//GEN-HEADEREND:event_btn_settingMouseClicked
        txt_add_pro_id3.grabFocus();
        indicatorasetting.setkStartColor(new Color(68, 82, 121));
        indicatorasetting.setkEndColor(new Color(68, 82, 121));
        indicatorasetting.setBackground(new Color(68, 82, 121));
    }//GEN-LAST:event_btn_settingMouseClicked

    private void btn_settingMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_settingMouseEntered
    {//GEN-HEADEREND:event_btn_settingMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_settingMouseEntered

    private void btn_settingKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_settingKeyPressed
    {//GEN-HEADEREND:event_btn_settingKeyPressed
        txt_add_pro_id3.grabFocus();
        panel_accountsetting.setVisible(true);
        kGradientPanel5.setVisible(false);
        escape(lbl_account, evt.getKeyCode(), panel_account);
        indicatorasetting.setkStartColor(new Color(68, 82, 121));
        indicatorasetting.setkEndColor(new Color(68, 82, 121));
        indicatorasetting.setBackground(new Color(68, 82, 121));
    }//GEN-LAST:event_btn_settingKeyPressed

    private void btn_updtbill1FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_updtbill1FocusGained
    {//GEN-HEADEREND:event_btn_updtbill1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_updtbill1FocusGained

    private void btn_updtbill1FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_updtbill1FocusLost
    {//GEN-HEADEREND:event_btn_updtbill1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_updtbill1FocusLost

    private void btn_updtbill1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_updtbill1MouseClicked
    {//GEN-HEADEREND:event_btn_updtbill1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_updtbill1MouseClicked

    private void btn_updtbill1MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_updtbill1MouseEntered
    {//GEN-HEADEREND:event_btn_updtbill1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_updtbill1MouseEntered

    private void btn_updtbill1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_updtbill1KeyPressed
    {//GEN-HEADEREND:event_btn_updtbill1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_updtbill1KeyPressed

    private void lbl_add_prormimg2MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_prormimg2MouseEntered
    {//GEN-HEADEREND:event_lbl_add_prormimg2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_add_prormimg2MouseEntered

    private void lbl_add_prormimg2MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_prormimg2MouseExited
    {//GEN-HEADEREND:event_lbl_add_prormimg2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_add_prormimg2MouseExited

    private void lbl_add_proaddimg2MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_proaddimg2MouseEntered
    {//GEN-HEADEREND:event_lbl_add_proaddimg2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_add_proaddimg2MouseEntered

    private void lbl_add_proaddimg2MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_proaddimg2MouseExited
    {//GEN-HEADEREND:event_lbl_add_proaddimg2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_add_proaddimg2MouseExited

    private void txt_add_pro_id3KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_add_pro_id3KeyPressed
    {//GEN-HEADEREND:event_txt_add_pro_id3KeyPressed
        escape(btn_setting, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_pro_id3KeyPressed

    private void txt_add_pro_id8KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_add_pro_id8KeyPressed
    {//GEN-HEADEREND:event_txt_add_pro_id8KeyPressed
        escape(btn_setting, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_pro_id8KeyPressed

    private void txt_add_pro_id9KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_add_pro_id9KeyPressed
    {//GEN-HEADEREND:event_txt_add_pro_id9KeyPressed
        escape(btn_setting, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_pro_id9KeyPressed

    private void txt_add_pro_id10KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_add_pro_id10KeyPressed
    {//GEN-HEADEREND:event_txt_add_pro_id10KeyPressed
        escape(btn_setting, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_pro_id10KeyPressed

    private void txt_add_pro_id11KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_add_pro_id11KeyPressed
    {//GEN-HEADEREND:event_txt_add_pro_id11KeyPressed
        escape(btn_setting, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_pro_id11KeyPressed

    private void txt_add_pro_id12KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_add_pro_id12KeyPressed
    {//GEN-HEADEREND:event_txt_add_pro_id12KeyPressed
        escape(btn_setting, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_pro_id12KeyPressed

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_loginBtnMouseClicked
    {//GEN-HEADEREND:event_loginBtnMouseClicked
        if (checkEmptyTxtfiled(txt_add_custid, txt_add_custnm, txt_add_custno, txt_add_custemail, txt_add_custsnm, txt_add_custsaddress) == true) {
            addCustomer();
            autoId(txt_add_custid, "customer");
        }
    }//GEN-LAST:event_loginBtnMouseClicked

    private void txt_add_custnoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_add_custnoKeyTyped
    {//GEN-HEADEREND:event_txt_add_custnoKeyTyped
        if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9' || txt_add_custno.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_add_custnoKeyTyped

    private void txt_add_custsaddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_add_custsaddressKeyPressed
        //        escape(btn_addpro, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_custsaddressKeyPressed

    private void table_custeditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_custeditMouseClicked
        table = (JTable) evt.getSource();
        if (evt.getClickCount() == 2 && table.getSelectedRow() != -1) {
            System.out.println(table.getSelectedRow());
            fetchDataIntoTxtfiled(lbl_edit_custid, table_custedit, txt_edit_custnm, txt_edit_custno, txt_edit_custemail, txt_edit_custsnm, txt_edit_custsadd);
        }
    }//GEN-LAST:event_table_custeditMouseClicked

    private void editCustBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editCustBtnMouseEntered
        editCustBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_editCustBtnMouseEntered

    private void deleteCustBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteCustBtnMouseEntered
        deleteCustBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_deleteCustBtnMouseEntered

    private void editCustBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCustBtnActionPerformed
        editCust();
    }//GEN-LAST:event_editCustBtnActionPerformed

    private void deleteCustBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustBtnActionPerformed
        if (deleteCust() == true) {

        }
    }//GEN-LAST:event_deleteCustBtnActionPerformed

    private void txt_det_custidKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_det_custidKeyReleased
    {//GEN-HEADEREND:event_txt_det_custidKeyReleased
        searchdata(txt_det_custid.getText(), table_custdet);
    }//GEN-LAST:event_txt_det_custidKeyReleased

    private void addEmpMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_addEmpMouseClicked
    {//GEN-HEADEREND:event_addEmpMouseClicked
        if (checkEmptyTxtfiled(txt_add_empadd, txt_add_empnm, txt_add_empno, txt_add_empemail, txt_add_empsalary, txt_add_empadd) == true) {
            if (txt_add_emppswd.getText().equals(txt_add_empcpswd.getText())) {
                addEmp();
                autoId(txt_add_empid, "emp");
                String filename = "D:\\BCA\\Sem -  5\\JavaProjects\\Girirarj_Telecom\\src\\icons\\man.png";
                ImageIcon icon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_add_empimg.getWidth(), lbl_add_empimg.getHeight(), Image.SCALE_SMOOTH));
                lbl_add_empimg.setIcon(icon);
            } else {
                txt_add_empcpswd.setLineColor(Color.RED);
                txt_add_empcpswd.grabFocus();
            }
        }
    }//GEN-LAST:event_addEmpMouseClicked

    private void table_empeditMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_table_empeditMouseClicked
    {//GEN-HEADEREND:event_table_empeditMouseClicked
        table = (JTable) evt.getSource();
        if (evt.getClickCount() == 2 && table.getSelectedRow() != -1) {

            fetchDataIntoTxtfiled(lbl_edit_empid, table_empedit, txt_edit_empnm, txt_edit_empno, txt_edit_empemail, txt_edit_empsalary, txt_edit_empadd);
        }
    }//GEN-LAST:event_table_empeditMouseClicked

    private void editEmpMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_editEmpMouseClicked
    {//GEN-HEADEREND:event_editEmpMouseClicked
        editEmp();
    }//GEN-LAST:event_editEmpMouseClicked

    private void deleteEmpMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_deleteEmpMouseClicked
    {//GEN-HEADEREND:event_deleteEmpMouseClicked
        deleteEmp();
    }//GEN-LAST:event_deleteEmpMouseClicked

    private void txt_det_empidKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_det_empidKeyReleased
    {//GEN-HEADEREND:event_txt_det_empidKeyReleased
        searchdata(txt_det_empid.getText(), table_empdet);
    }//GEN-LAST:event_txt_det_empidKeyReleased

    private void lbl_add_empaddimgMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_empaddimgMouseClicked
    {//GEN-HEADEREND:event_lbl_add_empaddimgMouseClicked
        imgchooser(lbl_add_empimg);
    }//GEN-LAST:event_lbl_add_empaddimgMouseClicked

    private void lbl_add_emprmimgMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_emprmimgMouseClicked
    {//GEN-HEADEREND:event_lbl_add_emprmimgMouseClicked
        imgremover("D:\\BCA\\Sem -  5\\JavaProjects\\Girirarj_Telecom\\src\\icons\\man.png", lbl_add_empimg);
    }//GEN-LAST:event_lbl_add_emprmimgMouseClicked

    private void txt_add_empnoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_add_empnoKeyTyped
    {//GEN-HEADEREND:event_txt_add_empnoKeyTyped
        if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9' || txt_add_empno.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_add_empnoKeyTyped

    private void lbl_add_proaddimgMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_proaddimgMouseClicked
    {//GEN-HEADEREND:event_lbl_add_proaddimgMouseClicked
        imgchooser(lbl_add_proimg);
    }//GEN-LAST:event_lbl_add_proaddimgMouseClicked

    private void txt_add_promcb_ctgy_nmActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txt_add_promcb_ctgy_nmActionPerformed
    {//GEN-HEADEREND:event_txt_add_promcb_ctgy_nmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_add_promcb_ctgy_nmActionPerformed

    private void txt_add_promcb_ctgy_idKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_add_promcb_ctgy_idKeyPressed
    {//GEN-HEADEREND:event_txt_add_promcb_ctgy_idKeyPressed
        escape(btn_addmodal, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_promcb_ctgy_idKeyPressed

    private void txt_add_promcb_brand_idKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_add_promcb_brand_idKeyPressed
    {//GEN-HEADEREND:event_txt_add_promcb_brand_idKeyPressed
        escape(btn_addmodal, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_promcb_brand_idKeyPressed

    private void txt_add_promcb_brand_idActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txt_add_promcb_brand_idActionPerformed
    {//GEN-HEADEREND:event_txt_add_promcb_brand_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_add_promcb_brand_idActionPerformed

    private void txt_add_promcb_model_idKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_add_promcb_model_idKeyPressed
    {//GEN-HEADEREND:event_txt_add_promcb_model_idKeyPressed
        escape(btn_addmodal, evt.getKeyCode());
    }//GEN-LAST:event_txt_add_promcb_model_idKeyPressed

    private void txt_add_promcb_model_nmActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txt_add_promcb_model_nmActionPerformed
    {//GEN-HEADEREND:event_txt_add_promcb_model_nmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_add_promcb_model_nmActionPerformed

    private void btnAddCtgyMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnAddCtgyMouseClicked
    {//GEN-HEADEREND:event_btnAddCtgyMouseClicked
        addmodel("category", txt_add_promcb_ctgy_id, txt_add_promcb_ctgy_nm);
        autoId(txt_add_promcb_ctgy_id, "category");
    }//GEN-LAST:event_btnAddCtgyMouseClicked

    private void btnAddBrandMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnAddBrandMouseClicked
    {//GEN-HEADEREND:event_btnAddBrandMouseClicked
        addmodel("brand", txt_add_promcb_brand_id, txt_add_promcb_brand_nm);
        autoId(txt_add_promcb_brand_id, "brand");
    }//GEN-LAST:event_btnAddBrandMouseClicked

    private void btnAddModelMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnAddModelMouseClicked
    {//GEN-HEADEREND:event_btnAddModelMouseClicked
        addmodel("model", txt_add_promcb_model_id, txt_add_promcb_model_nm);
        autoId(txt_add_promcb_model_id, "model");
    }//GEN-LAST:event_btnAddModelMouseClicked

    private void lbl_add_prormimgMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_add_prormimgMouseClicked
    {//GEN-HEADEREND:event_lbl_add_prormimgMouseClicked
        imgremover("D:\\BCA\\Sem -  5\\JavaProjects\\Girirarj_Telecom\\src\\icons\\man.png", lbl_add_proimg);
    }//GEN-LAST:event_lbl_add_prormimgMouseClicked

    private void loginBtn6MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_loginBtn6MouseClicked
    {//GEN-HEADEREND:event_loginBtn6MouseClicked
        addProduct();
        autoId(txt_add_pro_id, "product");
    }//GEN-LAST:event_loginBtn6MouseClicked

    private void txt_edit_pro_brandnmKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_edit_pro_brandnmKeyPressed
    {//GEN-HEADEREND:event_txt_edit_pro_brandnmKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_edit_pro_brandnmKeyPressed

    private void txt_edit_pro_modelnmKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_edit_pro_modelnmKeyPressed
    {//GEN-HEADEREND:event_txt_edit_pro_modelnmKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_edit_pro_modelnmKeyPressed

    private void txt_edit_pro_ctgynmKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_edit_pro_ctgynmKeyPressed
    {//GEN-HEADEREND:event_txt_edit_pro_ctgynmKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_edit_pro_ctgynmKeyPressed

    private void lbl_edit_proaddimgMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_edit_proaddimgMouseClicked
    {//GEN-HEADEREND:event_lbl_edit_proaddimgMouseClicked
        imgchooser(lbl_edit_proimg);
    }//GEN-LAST:event_lbl_edit_proaddimgMouseClicked

    private void lbl_edit_prodelimgMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_edit_prodelimgMouseClicked
    {//GEN-HEADEREND:event_lbl_edit_prodelimgMouseClicked
        imgremover("D:\\BCA\\Sem -  5\\JavaProjects\\Girirarj_Telecom\\src\\icons\\man.png", lbl_edit_proimg);
    }//GEN-LAST:event_lbl_edit_prodelimgMouseClicked

    private void combo_add_pro_proidItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_combo_add_pro_proidItemStateChanged
    {//GEN-HEADEREND:event_combo_add_pro_proidItemStateChanged

        if (combo_add_pro_proid.getSelectedItem() != "PRODUCT ID") {
            try {
                String selectQuery = "select * from product";
                ps = con.prepareStatement(selectQuery);
                rs = ps.executeQuery();

                while (rs.next()) {
                    txt_edit_pro_cprice.setText(rs.getString("cprice"));
                    txt_edit_pro_sprice.setText(rs.getString("sprice"));
                    combo_edit_pro_ctgy.setSelectedItem(rs.getString("ctgry"));
                    combo_edit_pro_brand.setSelectedItem(rs.getString("brand"));
                    combo_edit_pro_model.setSelectedItem(rs.getString("model"));
                    spinner_edit_pro_qty.setValue(Integer.parseInt(rs.getString("qty")));
                    BufferedImage im = ImageIO.read(rs.getBinaryStream("pic"));
                    ImageIcon icon = new ImageIcon(new ImageIcon(im).getImage().getScaledInstance(lbl_edit_proimg.getWidth(), lbl_edit_proimg.getHeight(), Image.SCALE_SMOOTH));
                    lbl_edit_proimg.setIcon(icon);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            txt_edit_pro_cprice.setText("");
            txt_edit_pro_sprice.setText("");
            combo_edit_pro_ctgy.setSelectedIndex(0);
            combo_edit_pro_brand.setSelectedIndex(0);
            combo_edit_pro_model.setSelectedIndex(0);
            spinner_edit_pro_qty.setValue(0);
            ImageIcon icon = new ImageIcon("D:\\BCA\\Sem - 5\\JavaProjects\\Girirarj_Telecom\\src\\icons\\man.png");
            lbl_edit_proimg.setIcon(icon);
        }
    }//GEN-LAST:event_combo_add_pro_proidItemStateChanged

    private void combo_edit_pro_ctgyidItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_combo_edit_pro_ctgyidItemStateChanged
    {//GEN-HEADEREND:event_combo_edit_pro_ctgyidItemStateChanged
        if (combo_edit_pro_ctgyid.getSelectedItem() != "CATEGORY ID") {
            try {
                String selectQuery = "select * from category where id = " + combo_edit_pro_ctgyid.getSelectedItem();
                ps = con.prepareStatement(selectQuery);
                rs = ps.executeQuery();

                while (rs.next()) {
                    txt_edit_pro_ctgynm.setText(rs.getString("nm"));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            txt_edit_pro_ctgynm.setText("");
        }
    }//GEN-LAST:event_combo_edit_pro_ctgyidItemStateChanged

    private void combo_edit_pro_brandidItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_combo_edit_pro_brandidItemStateChanged
    {//GEN-HEADEREND:event_combo_edit_pro_brandidItemStateChanged

        if (combo_edit_pro_brandid.getSelectedItem() != "BRAND ID") {
            try {
                String selectQuery = "select * from brand where id = " + combo_edit_pro_brandid.getSelectedItem();
                ps = con.prepareStatement(selectQuery);
                rs = ps.executeQuery();

                while (rs.next()) {
                    txt_edit_pro_brandnm.setText(rs.getString("nm"));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            txt_edit_pro_brandnm.setText("");
        }
    }//GEN-LAST:event_combo_edit_pro_brandidItemStateChanged

    private void combo_edit_pro_modelidItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_combo_edit_pro_modelidItemStateChanged
    {//GEN-HEADEREND:event_combo_edit_pro_modelidItemStateChanged
        if (combo_edit_pro_modelid.getSelectedItem() != "MODEL ID") {
            try {
                String selectQuery = "select * from model where id = " + combo_edit_pro_modelid.getSelectedItem();
                ps = con.prepareStatement(selectQuery);
                rs = ps.executeQuery();

                while (rs.next()) {
                    txt_edit_pro_modelnm.setText(rs.getString("nm"));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            txt_edit_pro_modelnm.setText("");
        }
    }//GEN-LAST:event_combo_edit_pro_modelidItemStateChanged

    private void btn_edit_proeditMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_edit_proeditMouseClicked
    {//GEN-HEADEREND:event_btn_edit_proeditMouseClicked
        editProduct();
    }//GEN-LAST:event_btn_edit_proeditMouseClicked

    private void btn_edit_prodelMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_edit_prodelMouseClicked
    {//GEN-HEADEREND:event_btn_edit_prodelMouseClicked
        deleteProduct();
    }//GEN-LAST:event_btn_edit_prodelMouseClicked

    private void btn_edit_ctgyeditMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_edit_ctgyeditMouseClicked
    {//GEN-HEADEREND:event_btn_edit_ctgyeditMouseClicked
        brandUpdate("category", txt_edit_pro_ctgynm, combo_edit_pro_ctgyid);
    }//GEN-LAST:event_btn_edit_ctgyeditMouseClicked

    private void btn_edit_brandeditMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_edit_brandeditMouseClicked
    {//GEN-HEADEREND:event_btn_edit_brandeditMouseClicked
        brandUpdate("brand", txt_edit_pro_brandnm, combo_edit_pro_brandid);
    }//GEN-LAST:event_btn_edit_brandeditMouseClicked

    private void btn_edit_modeleditMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_edit_modeleditMouseClicked
    {//GEN-HEADEREND:event_btn_edit_modeleditMouseClicked
        brandUpdate("model", txt_edit_pro_modelnm, combo_edit_pro_modelid);
    }//GEN-LAST:event_btn_edit_modeleditMouseClicked

    private void btn_edit_ctgydelMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_edit_ctgydelMouseClicked
    {//GEN-HEADEREND:event_btn_edit_ctgydelMouseClicked
        brandDelete("category", combo_edit_pro_ctgyid);
    }//GEN-LAST:event_btn_edit_ctgydelMouseClicked

    private void btn_edit_branddelMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_edit_branddelMouseClicked
    {//GEN-HEADEREND:event_btn_edit_branddelMouseClicked
        brandDelete("brand", combo_edit_pro_brandid);
    }//GEN-LAST:event_btn_edit_branddelMouseClicked

    private void btn_edit_modeldelMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_edit_modeldelMouseClicked
    {//GEN-HEADEREND:event_btn_edit_modeldelMouseClicked
        brandDelete("model", combo_edit_pro_modelid);
    }//GEN-LAST:event_btn_edit_modeldelMouseClicked

    private void txt_prodet_proidKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_prodet_proidKeyPressed
    {//GEN-HEADEREND:event_txt_prodet_proidKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prodet_proidKeyPressed

    private void txt_prodet_proidKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_prodet_proidKeyReleased
    {//GEN-HEADEREND:event_txt_prodet_proidKeyReleased
        searchdata(txt_prodet_proid.getText(), table_empdet1);
    }//GEN-LAST:event_txt_prodet_proidKeyReleased

    private void table_empdet1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_table_empdet1KeyPressed
    {//GEN-HEADEREND:event_table_empdet1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_table_empdet1KeyPressed

    private void loginBtn6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_loginBtn6ActionPerformed
    {//GEN-HEADEREND:event_loginBtn6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtn6ActionPerformed

    private void combo_add_bill_cusidItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_combo_add_bill_cusidItemStateChanged
    {//GEN-HEADEREND:event_combo_add_bill_cusidItemStateChanged
        if (combo_add_bill_cusid.getSelectedItem() == "CUSTOMER ID") {
            txt_add_bill_con.setText("CONTACT NO.");
            txt_add_bill_email.setText("EMAIL");
            txt_add_bill_snm.setText("SHOP NAME");

        } else {
            try {
                String query = "select * from customer";
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                while (rs.next()) {
                    txt_add_bill_email.setText(rs.getString("email"));
                    txt_add_bill_con.setText(rs.getString("contact"));
                    txt_add_bill_snm.setText(rs.getString("snm"));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_combo_add_bill_cusidItemStateChanged

    private void combo_add_bill_proidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_add_bill_proidItemStateChanged
        if (combo_add_bill_proid.getSelectedItem() == "PRODUCT ID") {
            txt_add_bill_ctgry.setText("CATEGORY");
            txt_add_bill_brand.setText("BRAND");
            txt_add_bill_model.setText("MODEL");
            txt_add_bill_price.setText("PRICE");
        } else {
            try {
                String query = "select * from product";
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                while (rs.next()) {
                    txt_add_bill_ctgry.setText(rs.getString("ctgry"));
                    txt_add_bill_brand.setText(rs.getString("brand"));
                    txt_add_bill_model.setText(rs.getString("model"));
                    txt_add_bill_price.setText(rs.getString("sprice"));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_combo_add_bill_proidItemStateChanged

    private void btn_proadd_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_proadd_tableMouseClicked
        if (combo_add_bill_proid.getSelectedItem() != "PRODUCT ID") {
            int total = Integer.parseInt(txt_add_bill_price.getText());
            int qty = Integer.parseInt(txt_add_pro_qty1.getValue().toString());

            DefaultTableModel model = (DefaultTableModel) productTable.getModel();
            model.addRow(new Object[]{
                combo_add_bill_proid.getSelectedItem().toString(), txt_add_bill_ctgry.getText(), txt_add_bill_brand.getText(), txt_add_bill_model.getText(), total, qty, (total * qty)
            });

//            Final total calculate here:
            int rowCount = productTable.getRowCount();
            int finalTotal = 0;
            for (int i = 0; i < rowCount; i++) {
                finalTotal = finalTotal + Integer.parseInt(productTable.getValueAt(i, 6).toString());
            }
            lbl_add_bill_tot.setText(Integer.toString(finalTotal));
        }
    }//GEN-LAST:event_btn_proadd_tableMouseClicked

    private void loginBtn17MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_loginBtn17MouseClicked
    {//GEN-HEADEREND:event_loginBtn17MouseClicked
        if (addBill() == true) {
            txtarea_bill.append("\t\t Billing Application \n"
                    + "\n***************************************************************\n"
                    + "***************************************************************\n"
                    + "  Name :                                 " + txt_add_bill_snm.getText() + "\n"
                    + "  Mobile No :                            " + txt_add_bill_con.getText() + "\n"
                    + "  EMAIL :                                " + txt_add_bill_email.getText() + "\n"
                    + "  Date :                                 " + java.time.LocalDate.now() + "\n"
                    + "  Time :                                 " + java.time.LocalTime.now() + "\n"
                    + "===============================================================\n"
                    + "  Category:                              " + txt_add_bill_ctgry.getText() + "\n"
                    + "  Brand :                                " + txt_add_bill_brand.getText() + "\n"
                    + "  Model :                                " + txt_add_bill_model.getText() + "\n"
                    + "***************************************************************\n"
                    + "  Sub Total :                            " + lbl_add_bill_tot.getText() + "\n"
                    + "  Tax :                                  " + txt_add_bill_tax.getText() + "\n"
                    + "  Discount :                             " + txt_add_bill_dis.getText() + "\n"
                    + "  Total Amount :                         " + lbl_add_bill_ntot.getText() + "\n"
                    + "  Paid :                                 " + txt_add_bill_paid.getText() + "\n\n"
                    + "*************** Thank You for Shoping ********************\n");
            try {
                txtarea_bill.print();
            } catch (PrinterException ex) {
                Logger.getLogger(frm_dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error while add bill details into database");
        }
    }//GEN-LAST:event_loginBtn17MouseClicked

    private void txt_add_bill_taxKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_add_bill_taxKeyReleased
    {//GEN-HEADEREND:event_txt_add_bill_taxKeyReleased
        if (txt_add_bill_tax.getText().equals("")) {
            txt_add_bill_tax.setText("0");
        } else if (txt_add_bill_dis.getText().equals("")) {
            txt_add_bill_dis.setText("0");
        }
        int tax = Integer.parseInt(txt_add_bill_tax.getText());
        int dis = Integer.parseInt(txt_add_bill_dis.getText());
        lbl_add_bill_ntot.setText(Integer.toString(Integer.parseInt(lbl_add_bill_tot.getText()) + tax - dis));
    }//GEN-LAST:event_txt_add_bill_taxKeyReleased

    private void txt_add_bill_disKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_add_bill_disKeyReleased
    {//GEN-HEADEREND:event_txt_add_bill_disKeyReleased
        if (txt_add_bill_tax.getText().equals("")) {
            txt_add_bill_tax.setText("0");
        } else if (txt_add_bill_dis.getText().equals("")) {
            txt_add_bill_dis.setText("0");
        }
        int tax = Integer.parseInt(txt_add_bill_tax.getText());
        int dis = Integer.parseInt(txt_add_bill_dis.getText());
        lbl_add_bill_ntot.setText(Integer.toString(Integer.parseInt(lbl_add_bill_tot.getText()) + tax - dis));
    }//GEN-LAST:event_txt_add_bill_disKeyReleased

    private void txt_searchBill_dataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchBill_dataKeyReleased
        searchdata(txt_searchBill_data.getText(), table_bill);
    }//GEN-LAST:event_txt_searchBill_dataKeyReleased

    private void combo_edit_billidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_edit_billidItemStateChanged
        if (combo_edit_billid.getSelectedItem() != "BILL ID") {
            try {
                String selectQuery = "select * from bill where id= " + combo_edit_billid.getSelectedItem();
                ps = con.prepareStatement(selectQuery);
                rs = ps.executeQuery();

                while (rs.next()) {
                    txt_edit_paidTotal.setText(rs.getString("paid"));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            txt_edit_paidTotal.setText("");
        }
    }//GEN-LAST:event_combo_edit_billidItemStateChanged

    private void btn_edit_editPaidTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_edit_editPaidTotalMouseClicked
        try {
            String updateQuery = "update bill set paid=? where id=?";
            ps = con.prepareStatement(updateQuery);
            ps.setString(1, txt_edit_paidTotal.getText());
            ps.setString(2, combo_edit_billid.getSelectedItem().toString());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Paid price changed");
            fetchDataIntoTablebill(table_bill, "bill");
            combo_edit_billid.setSelectedIndex(0);
            txt_edit_paidTotal.setText("");
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, "Paid price not changed " + e);
        }
    }//GEN-LAST:event_btn_edit_editPaidTotalMouseClicked

    private void chk_paddingBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_paddingBillMouseClicked

        if (chk_paddingBill.isSelected() == true) {
            TableModel = (DefaultTableModel) table_bill.getModel();
            TableModel.setRowCount(0);
            try {
                String selectQuery = "select * from bill";
                ps = con.prepareStatement(selectQuery);
                rs = ps.executeQuery();

                while (rs.next()) {
                    String paid = rs.getString("paid");
                    String nettotal = rs.getString("nettotal");
                    if (Integer.parseInt(nettotal) > Integer.parseInt(paid)) {
                        String id = rs.getString("id");
                        String cname = rs.getString("sname");
                        String semail = rs.getString("semail");
                        String scno = rs.getString("scno");
                        String ctgry = rs.getString("category");
                        String brand = rs.getString("brand");
                        String model = rs.getString("model");
                        String price = rs.getString("price");
                        String qty = rs.getString("qty");
                        String tax = rs.getString("tax");
                        String dis = rs.getString("discount");
                        String nettotal1 = rs.getString("nettotal");
                        String paid1 = rs.getString("paid");

                        String[] Row
                                = {
                                    id, cname, semail, scno, ctgry, brand, model, price, qty, tax, dis, nettotal1, paid1
                                };

                        TableModel.addRow(Row);
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            fetchDataIntoTablebill(table_bill, "bill");
        }
    }//GEN-LAST:event_chk_paddingBillMouseClicked

    private void btn_edit_deleteBillDetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_edit_deleteBillDetMouseClicked
        try {
            String updateQuery = "delete from bill where id=?";
            ps = con.prepareStatement(updateQuery);
            ps.setString(1, combo_edit_billid.getSelectedItem().toString());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Paid price deleted");
            fetchDataIntoTablebill(table_bill, "bill");
            combo_edit_billid.setSelectedIndex(0);
            combo_edit_billid.removeItem(combo_edit_billid.getSelectedItem().toString());
            txt_edit_paidTotal.setText("");
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, "Paid price not deleted " + e);
        }
    }//GEN-LAST:event_btn_edit_deleteBillDetMouseClicked

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        table1 = (JTable) evt.getSource();
        try {
            if (evt.getClickCount() == 2 && table1.getSelectedRow() != -1) {
                table_bill.remove(table_bill.getSelectedRow());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_productTableMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_dashboard().setVisible(true);
            }
        });
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

    //while inside the main panel
    public void visibility(JTextField field, KGradientPanel add, boolean addbool, KGradientPanel edit, boolean editbool, KGradientPanel det, boolean detbool, KGradientPanel fulldet, boolean fulldetbool) {
        add.setVisible(addbool);
        edit.setVisible(editbool);
        det.setVisible(detbool);
        fulldet.setVisible(fulldetbool);
        field.grabFocus();
    }

    public void visibility(JTextField field, KGradientPanel add, boolean addbool) {
        add.setVisible(addbool);
        field.grabFocus();
    }

    //to call from sidepane
    public void visibility(KGradientPanel add, boolean addbool, KGradientPanel edit, boolean editbool, KGradientPanel det, boolean detbool, KGradientPanel fulldet, boolean fulldetbool) {
        add.setVisible(addbool);
        edit.setVisible(editbool);
        det.setVisible(detbool);
        fulldet.setVisible(fulldetbool);
    }

    public void visibility(KGradientPanel add, boolean addbool) {
        add.setVisible(addbool);
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

    public void visibility(combo_suggestion.ComboBoxSuggestion combo, KGradientPanel add, boolean addbool, KGradientPanel addmbc, boolean mbcbool, KGradientPanel edit, boolean editbool, KGradientPanel det, boolean detbool, KGradientPanel fulldet, boolean fulldetbool) {
        add.setVisible(addbool);
        addmbc.setVisible(mbcbool);
        edit.setVisible(editbool);
        det.setVisible(detbool);
        fulldet.setVisible(fulldetbool);
        combo.grabFocus();
    }

    //to call from sidepane
    public void visibility(KGradientPanel add, boolean addbool, KGradientPanel addmbc, boolean mbcbool, KGradientPanel edit, boolean editbool, KGradientPanel det, boolean detbool, KGradientPanel fulldet, boolean fulldetbool) {
        add.setVisible(addbool);
        addmbc.setVisible(mbcbool);
        edit.setVisible(editbool);
        det.setVisible(detbool);
        fulldet.setVisible(fulldetbool);
    }

    private void autoId(JTextField field, String tbnm) {
        try {
            String query = "SELECT MAX(id) from " + tbnm;
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            if (rs.next()) {
                int lastid = rs.getInt(1);
                ++lastid;
                field.setText(Integer.toString(lastid));

            } else {
                field.setText("1");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void autoId(JLabel lbl, String tbnm) {
        try {
            String query = "SELECT MAX(id) from " + tbnm;
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            if (rs.next()) {
                int lastid = rs.getInt(1);
                ++lastid;
                lbl.setText(Integer.toString(lastid));

            } else {
                lbl.setText("1");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public boolean emailVaildation(TextField txt1) {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(txt1.getText());
        if (matcher.matches() == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkEmptyTxtfiled(TextField txt1, TextField txt2, TextField txt3, TextField txt4, TextField txt5, TextArea txt6) {
        if (txt1.getText().equals("")) {
            txt1.setLineColor(Color.red);
            txt1.grabFocus();
            return false;
        } else if (txt2.getText().equals("")) {
            txt2.setLineColor(Color.red);
            txt2.grabFocus();
            return false;
        } else if (txt3.getText().equals("")) {
            txt3.setLineColor(Color.red);
            txt3.grabFocus();
            return false;
        } else if (txt4.getText().equals("") || emailVaildation(txt_add_custemail) == false) {
            txt4.setLineColor(Color.red);
            txt4.grabFocus();
            return false;
        } else if (txt5.getText().equals("")) {
            txt5.setLineColor(Color.red);
            txt5.grabFocus();
            return false;
        } else if (txt6.getText().equals("")) {
            textAreaScroll3.setLineColor(Color.red);
            txt6.grabFocus();
            return false;
        }
        return true;
    }

    public boolean checkEmptyTxtfiled(TextField txt1, TextField txt2, TextField txt3, TextField txt4, TextField txt5, TextField txt6) {
        if (txt1.getText().equals("")) {
            txt1.setLineColor(Color.red);
            txt1.grabFocus();
            return false;
        } else if (txt2.getText().equals("")) {
            txt2.setLineColor(Color.red);
            txt2.grabFocus();
            return false;
        } else if (txt3.getText().equals("")) {
            txt3.setLineColor(Color.red);
            txt3.grabFocus();
            return false;
        } else if (txt4.getText().equals("") || emailVaildation(txt_add_empemail) == false) {
            txt4.setLineColor(Color.red);
            txt4.grabFocus();
            return false;
        } else if (txt5.getText().equals("")) {
            txt5.setLineColor(Color.red);
            txt5.grabFocus();
            return false;
        } else if (txt6.getText().equals("")) {
            txt6.setLineColor(Color.RED);
            txt6.grabFocus();
            return false;
        }
        return true;
    }
//TextFiled and TextArea Filed both

    public void doEmptyTxtfiled(TextField txt1, TextField txt2, TextField txt3, TextField txt4, TextArea txt5) {
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
    }
//only TextFiled

    public void doEmptyTxtfiled(TextField txt1, TextField txt2, TextField txt3, TextField txt4, TextField txt5) {
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
    }

    public void doEmptyTxtfiled(TextField txt1, TextField txt2, TextField txt3, TextField txt4, TextField txt5, JTextField txt6, JTextField txt7) {
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
        txt6.setText("");
        txt7.setText("");
    }

    public void addCustomer() {
        try {
            String insertQuery = "insert into customer (id,nm,contact,email,snm,sadd) values('" + txt_add_custid.getText() + "','"
                    + txt_add_custnm.getText() + "','" + txt_add_custno.getText() + "','" + txt_add_custemail.getText() + "','" + txt_add_custnm.getText() + "','"
                    + txt_add_custsaddress.getText() + "');";
            ps = con.prepareStatement(insertQuery);
            ps.executeUpdate();
            String name = txt_add_custnm.getText();
            JOptionPane.showMessageDialog(null, name + " Customer added");
            doEmptyTxtfiled(txt_add_custnm, txt_add_custno, txt_add_custemail, txt_add_custsnm, txt_add_custsaddress);
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, "Error while add customer : " + e);
        }
    }
//    Fetch the customer data into the table

    public void fetchDataIntoTableCust(JTable tablenm, String dbTablenm) {
        try {
            TableModel = (DefaultTableModel) tablenm.getModel();
            TableModel.setRowCount(0);
            String selectQuery = "select * from " + dbTablenm;
            st = con.createStatement();
            rs = st.executeQuery(selectQuery);

            while (rs.next()) {
                String id = rs.getString("id");
                String nm = rs.getString("nm");
                String contact = rs.getString("contact");
                String email = rs.getString("email");
                String snm = rs.getString("snm");
                String sadd = rs.getString("sadd");

                String[] Row
                        = {
                            id, nm, contact, email, snm, sadd
                        };
                TableModel.addRow(Row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Can't fetch customer data into the table because of: " + e);
        }
    }
//    Fetch the customer data into textfiled

    public void fetchDataIntoTxtfiled(JLabel lbl, JTable tablenm, TextField txt1, TextField txt2, TextField txt3, TextField txt4, TextField txt5) {
        int i = tablenm.getSelectedRow();
        TableModel = (DefaultTableModel) tablenm.getModel();
        lbl.setText(TableModel.getValueAt(i, 0).toString());
        txt1.setText(TableModel.getValueAt(i, 1).toString());
        txt2.setText(TableModel.getValueAt(i, 2).toString());
        txt3.setText(TableModel.getValueAt(i, 3).toString());
        txt4.setText(TableModel.getValueAt(i, 4).toString());
        txt5.setText(TableModel.getValueAt(i, 5).toString());
    }

    //edit the customer details
    public void editCust() {
        try {
            String updateQuery = "update customer set nm='" + txt_edit_custnm.getText() + "',contact='" + txt_edit_custno.getText() + "',email='" + lbl_edit_empid.getText() + "',snm='" + txt_edit_custsnm.getText() + "',sadd='" + txt_edit_custsadd.getText() + "' where id='" + lbl_edit_custid.getText() + "';";
            ps = con.prepareStatement(updateQuery);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Customer details updated successfully");
            doEmptyTxtfiled(txt_edit_custnm, txt_edit_custno, txt_edit_custemail, txt_edit_custsnm, txt_edit_custsadd);
            fetchDataIntoTableCust(table_custedit, "customer");
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, "Customer details not updated " + e);
        }
    }
//    delete the customer details

    public void editEmp() {
        try {
            String updateQuery = "update emp set nm='" + txt_edit_empnm.getText() + "',contact='" + txt_edit_empno.getText() + "',email='" + txt_edit_empemail.getText() + "',salary='" + txt_edit_empsalary.getText() + "',address='" + txt_edit_empadd.getText() + "' where id='" + lbl_edit_empid.getText() + "';";
            ps = con.prepareStatement(updateQuery);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Employee details updated successfully");
            doEmptyTxtfiled(txt_edit_empnm, txt_edit_empno, txt_edit_empemail, txt_edit_empsalary, txt_edit_empadd);
            fetchDataIntoTableEmp(table_empedit, "emp");
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, "Employee details not updated " + e);
        }
    }

    public boolean deleteCust() {
        int confirmMsg = JOptionPane.showConfirmDialog(null, "Are you really wants to delete this customer recored");
        if (confirmMsg == 0) {
            try {
                String deleteQuery = "delete from customer where id='" + lbl_edit_custid.getText() + "';";
                ps = con.prepareStatement(deleteQuery);
                String name = txt_edit_custnm.getText();
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, name + " Customer details deleted successfully");
                doEmptyTxtfiled(txt_edit_custnm, txt_edit_custno, txt_edit_custemail, txt_edit_custsnm, txt_edit_custsadd);
                fetchDataIntoTableCust(table_custedit, "customer");
                return true;
            } catch (Exception e) {
                JOptionPane.showInternalMessageDialog(null, "This customer details not updated " + e);
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean deleteEmp() {
        int confirmMsg = JOptionPane.showConfirmDialog(null, "Are you really wants to delete this customer recored");
        if (confirmMsg == 0) {
            try {
                String deleteQuery = "delete from emp where id='" + lbl_edit_empid.getText() + "';";
                ps = con.prepareStatement(deleteQuery);
                String name = txt_edit_empnm.getText();
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, name + " Employee details deleted successfully");
                doEmptyTxtfiled(txt_edit_empnm, txt_edit_empno, txt_edit_empemail, txt_edit_empsalary, txt_edit_empadd);
                fetchDataIntoTableEmp(table_empedit, "emp");
                return true;
            } catch (Exception e) {
                JOptionPane.showInternalMessageDialog(null, "This employee details not updated " + e);
                return false;
            }
        } else {
            return false;
        }
    }

    public void searchdata(String str, JTable table) {
        try {
            TableModel = (DefaultTableModel) table.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(TableModel);
            table.setRowSorter(trs);
            trs.setRowFilter(RowFilter.regexFilter(str));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void addEmp() {
        try {
            String insertQuery = "insert into emp values('" + txt_add_empid.getText() + "','"
                    + txt_add_empnm.getText() + "','" + txt_add_empno.getText() + "','" + txt_add_empemail.getText() + "','" + txt_add_empsalary.getText() + "','"
                    + txt_add_empadd.getText() + "',?,'" + txt_add_empcpswd.getText() + "');";

            ps = con.prepareStatement(insertQuery);
            ps.setBinaryStream(1, fis, fis.available());
            ps.executeUpdate();
            String name = txt_add_empnm.getText();
            JOptionPane.showMessageDialog(null, name + " Employee added");
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, "Error while add Employee : " + e);
            System.out.println(e.getMessage());
        }

        try {
            String insertQuery = "insert into login values(?,?)";
            ps = con.prepareStatement(insertQuery);
            ps.setString(1, txt_add_empid.getText());
            ps.setString(2, txt_add_empcpswd.getText());
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "insert emp failed");
            System.out.println(e.getMessage());
        }
        doEmptyTxtfiled(txt_add_empnm, txt_add_empno, txt_add_empemail, txt_add_empsalary, txt_add_empadd, txt_add_emppswd, txt_add_empcpswd);
    }

    public void addProduct() {
        try {
            String insertQuery = "insert into product values(?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(insertQuery);
            ps.setInt(1, Integer.parseInt(txt_add_pro_id.getText()));
            ps.setString(2, txt_add_pro_cprice.getText());
            ps.setString(3, txt_add_pro_sprice.getText());
            ps.setString(4, combo_add_pro_ctgry.getSelectedItem().toString());
            ps.setString(5, combo_add_pro_brand.getSelectedItem().toString());
            ps.setString(6, combo_add_pro_model.getSelectedItem().toString());
            ps.setString(7, txt_add_pro_qty.getValue().toString());
            ps.setString(8, txt_add_pro_desc.getText());
            ps.setBinaryStream(9, fis, fis.available());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Product added");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error while add Product : " + e);
        }
    }

    public boolean addBill() {
        try {
            String insertQuery = "insert into bill(id,sname,semail,scno,category,brand,model,price,qty,tax,discount,nettotal,paid) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(insertQuery);
            ps.setInt(1, Integer.parseInt(lbl_billno.getText()));
            ps.setString(2, txt_add_bill_snm.getText());
            ps.setString(3, txt_add_bill_email.getText());
            ps.setString(4, txt_add_bill_con.getText());
            ps.setString(5, txt_add_bill_ctgry.getText());
            ps.setString(6, txt_add_bill_brand.getText());
            ps.setString(7, txt_add_bill_model.getText());
            ps.setString(8, txt_add_bill_price.getText());
            ps.setString(9, txt_add_pro_qty1.getValue().toString());
            ps.setString(10, txt_add_bill_tax.getText());
            ps.setString(11, txt_add_bill_dis.getText());
            ps.setString(12, lbl_add_bill_ntot.getText());
            ps.setString(13, txt_add_bill_paid.getText());
            JOptionPane.showMessageDialog(null, "Bill save successfully, press OK for generate PDF");
            autoId(lbl_billno, "bill");
            combo_add_bill_cusid.setSelectedIndex(0);
            combo_add_bill_proid.setSelectedIndex(0);
            txt_add_bill_snm.setText("");
            txt_add_bill_email.setText("");
            txt_add_bill_con.setText("");
            txt_add_bill_ctgry.setText("");
            txt_add_bill_brand.setText("");
            txt_add_bill_model.setText("");
            txt_add_bill_price.setText("");
            txt_add_bill_tax.setText("");
            txt_add_bill_dis.setText("");
            lbl_add_bill_ntot.setText("");
            txt_add_bill_paid.setText("");
            txt_add_pro_qty1.setValue(0);
            DefaultTableModel model = (DefaultTableModel) productTable.getModel();
            model.setRowCount(0);
            return true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error while generate your bill because of : " + e.getMessage());
            return false;
        }
    }

    public void addmodel(String tbnm, TextField fieldid, TextField fieldnm) {
        try {
            String insertQuery = "insert into " + tbnm + " values(?,?)";
            ps = con.prepareStatement(insertQuery);
            ps.setInt(1, Integer.parseInt(fieldid.getText()));
            ps.setString(2, fieldnm.getText());
            ps.executeUpdate();
            String name = fieldnm.getText();
            JOptionPane.showMessageDialog(null, name + " Added");
            fieldnm.setText("");
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, "Error while adding : " + e);
            System.out.println(e.getMessage());
        }
    }

    public void fetchDataIntoTableEmp(JTable tablenm, String dbTablenm) {
        try {
            TableModel = (DefaultTableModel) tablenm.getModel();
            TableModel.setRowCount(0);
            String selectQuery = "select * from " + dbTablenm;
            st = con.createStatement();
            rs = st.executeQuery(selectQuery);
            ArrayList<frm_dashboard> list = new ArrayList<frm_dashboard>();
            frm_dashboard f;

            while (rs.next()) {
                String id = rs.getString("id");
                String nm = rs.getString("nm");
                String contact = rs.getString("contact");
                String email = rs.getString("email");
                String salary = rs.getString("salary");
                String address = rs.getString("address");

                String[] Row
                        = {
                            id, nm, contact, email, salary, address
                        };

                TableModel.addRow(Row);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Can't fetch employee data into the table because of: " + e);
        }
    }

    public void fetchDataIntoTablepro(JTable tablenm, String dbTablenm) {
        try {
            TableModel = (DefaultTableModel) tablenm.getModel();
            TableModel.setRowCount(0);
            String selectQuery = "select * from " + dbTablenm;
            st = con.createStatement();
            rs = st.executeQuery(selectQuery);

            while (rs.next()) {
                String id = rs.getString("id");
                String cprice = rs.getString("cprice");
                String sprice = rs.getString("sprice");
                String ctgry = rs.getString("ctgry");
                String brand = rs.getString("brand");
                String model = rs.getString("model");
                String qty = rs.getString("qty");
                String dsc = rs.getString("dsc");

                String[] Row
                        = {
                            id, cprice, sprice, ctgry, brand, model, qty, dsc
                        };

                TableModel.addRow(Row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Can't fetch employee data into the table because of: " + e);
        }
    }

    public void fetchDataIntoTablebill(JTable tablenm, String dbTablenm) {
        try {
            TableModel = (DefaultTableModel) tablenm.getModel();
            TableModel.setRowCount(0);
            String selectQuery = "select * from " + dbTablenm;
            st = con.createStatement();
            rs = st.executeQuery(selectQuery);

            while (rs.next()) {
                String id = rs.getString("id");
                String cname = rs.getString("sname");
                String semail = rs.getString("semail");
                String scno = rs.getString("scno");
                String ctgry = rs.getString("category");
                String brand = rs.getString("brand");
                String model = rs.getString("model");
                String price = rs.getString("price");
                String qty = rs.getString("qty");
                String tax = rs.getString("tax");
                String dis = rs.getString("discount");
                String nettotal = rs.getString("nettotal");
                String paid = rs.getString("paid");

                String[] Row
                        = {
                            id, cname, semail, scno, ctgry, brand, model, price, qty, tax, dis, nettotal, paid
                        };

                TableModel.addRow(Row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Can't fetch bill details into the table because of: " + e);
        }
    }

    public void imgchooser(JLabel lbl) {
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            fis = new FileInputStream(f);
            String filename = f.getAbsolutePath();
            System.out.println(filename);
            ImageIcon icon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH));
            lbl.setIcon(icon);
        } catch (Exception e) {
        }
    }

    public void imgremover(String path, JLabel lbl) {
        String filename = path;
        ImageIcon icon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH));
        lbl.setIcon(icon);
    }
//    product brand add

    public void addBrand() {
        try {
            String insertQuery = "insert into product (brand) values('" + txt_add_promcb_ctgy_nm.getText() + "');";
            ps = con.prepareStatement(insertQuery);
            ps.executeUpdate();
            String name = txt_add_promcb_ctgy_nm.getText();
            JOptionPane.showMessageDialog(null, name + " Brand added");
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, "Error while add brand : " + e);
        }
    }

    public void comboboxdata(combo_suggestion.ComboBoxSuggestion combobox, String tbnm) {
        String query = "select * from " + tbnm;
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            combobox.setSelectedIndex(0);
            while (rs.next()) {
                combobox.addItem(rs.getString("nm"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void comboboxdatasnm(combo_suggestion.ComboBoxSuggestion combobox, String tbnm) {
        String query = "select * from " + tbnm;
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            combobox.setSelectedIndex(0);
            while (rs.next()) {
                combobox.addItem(rs.getString("snm"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void comboboxdataId(combo_suggestion.ComboBoxSuggestion combobox, String tbnm, String lbltxt) {
        String query = "select * from " + tbnm;
        try {
            combobox.removeAllItems();
            combobox.addItem(lbltxt);
            combobox.setSelectedIndex(0);
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                combobox.addItem(rs.getString("id"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void editProduct() {
        try {
            String updateQuery = "update product set cprice=?, sprice=?, ctgry=?, brand=?, model=?, qty=?, pic=? where id=?";
            ps = con.prepareStatement(updateQuery);
            ps.setString(1, txt_edit_pro_cprice.getText());
            ps.setString(2, txt_edit_pro_sprice.getText());
            ps.setString(3, combo_edit_pro_ctgy.getSelectedItem().toString());
            ps.setString(4, combo_edit_pro_brand.getSelectedItem().toString());
            ps.setString(5, combo_edit_pro_model.getSelectedItem().toString());
            ps.setString(6, spinner_edit_pro_qty.getValue().toString());
            ps.setBinaryStream(7, fis, fis.available());
            ps.setString(8, combo_add_pro_proid.getSelectedItem().toString());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Product details updated successfully");
            combo_add_pro_proid.setSelectedIndex(0);
            txt_edit_pro_cprice.setText("");
            txt_edit_pro_sprice.setText("");
            combo_edit_pro_ctgy.setSelectedIndex(0);
            combo_edit_pro_brand.setSelectedIndex(0);
            combo_edit_pro_model.setSelectedIndex(0);
            spinner_edit_pro_qty.setValue(0);
            imgremover("D:\\BCA\\Sem -  5\\JavaProjects\\Girirarj_Telecom\\src\\icons\\man.png", lbl_edit_proimg);
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, "Product details not updated " + e);
        }
    }

    public void deleteProduct() {
        try {
            String updateQuery = "delete from product where id=?";
            ps = con.prepareStatement(updateQuery);

            ps.setString(1, combo_add_pro_proid.getSelectedItem().toString());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Product details deleted successfully");
            combo_add_pro_proid.setSelectedIndex(0);
            imgremover("D:\\\\BCA\\\\Sem -  5\\\\JavaProjects\\\\Girirarj_Telecom\\\\src\\\\icons\\\\man.png", lbl_edit_proimg);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Product details not deleted " + e);
        }
    }

    public void brandUpdate(String tbnm, TextField field, combo_suggestion.ComboBoxSuggestion combo) {
        try {
            String updateQuery = "update " + tbnm + " set nm=? where id=?";
            ps = con.prepareStatement(updateQuery);
            ps.setString(1, field.getText());
            ps.setString(2, combo.getSelectedItem().toString());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Brand details updated successfully");
            combo.setSelectedIndex(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Brand details not updated " + e);
        }
    }

    public void brandDelete(String tbnm, combo_suggestion.ComboBoxSuggestion combo) {
        try {
            String deleteQuery = "delete from " + tbnm + " where id=?";
            ps = con.prepareStatement(deleteQuery);
            ps.setString(1, combo.getSelectedItem().toString());

            ps.executeUpdate();
            combo.removeItem(combo.getSelectedItem().toString());

            JOptionPane.showMessageDialog(null, "Brand details deleted successfully");
            combo.setSelectedIndex(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Brand details not deleted " + e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton addEmp;
    private com.k33ptoo.components.KButton btnAddBrand;
    private com.k33ptoo.components.KButton btnAddCtgy;
    private com.k33ptoo.components.KButton btnAddModel;
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
    private com.k33ptoo.components.KButton btn_edit_branddel;
    private com.k33ptoo.components.KButton btn_edit_brandedit;
    private com.k33ptoo.components.KButton btn_edit_ctgydel;
    private com.k33ptoo.components.KButton btn_edit_ctgyedit;
    private com.k33ptoo.components.KButton btn_edit_deleteBillDet;
    private com.k33ptoo.components.KButton btn_edit_editPaidTotal;
    private com.k33ptoo.components.KButton btn_edit_modeldel;
    private com.k33ptoo.components.KButton btn_edit_modeledit;
    private com.k33ptoo.components.KButton btn_edit_prodel;
    private com.k33ptoo.components.KButton btn_edit_proedit;
    private com.k33ptoo.components.KButton btn_editcust;
    private com.k33ptoo.components.KButton btn_editemp;
    private com.k33ptoo.components.KButton btn_empdet;
    private com.k33ptoo.components.KButton btn_proadd_table;
    private com.k33ptoo.components.KButton btn_setting;
    private com.k33ptoo.components.KButton btn_updtbill;
    private com.k33ptoo.components.KButton btn_updtbill1;
    private javax.swing.JCheckBox chk_paddingBill;
    private combo_suggestion.ComboBoxSuggestion combo_add_bill_cusid;
    private combo_suggestion.ComboBoxSuggestion combo_add_bill_proid;
    private combo_suggestion.ComboBoxSuggestion combo_add_pro_brand;
    private combo_suggestion.ComboBoxSuggestion combo_add_pro_ctgry;
    private combo_suggestion.ComboBoxSuggestion combo_add_pro_model;
    private combo_suggestion.ComboBoxSuggestion combo_add_pro_proid;
    private combo_suggestion.ComboBoxSuggestion combo_edit_billid;
    private combo_suggestion.ComboBoxSuggestion combo_edit_pro_brand;
    private combo_suggestion.ComboBoxSuggestion combo_edit_pro_brandid;
    private combo_suggestion.ComboBoxSuggestion combo_edit_pro_ctgy;
    private combo_suggestion.ComboBoxSuggestion combo_edit_pro_ctgyid;
    private combo_suggestion.ComboBoxSuggestion combo_edit_pro_model;
    private combo_suggestion.ComboBoxSuggestion combo_edit_pro_modelid;
    private com.k33ptoo.components.KButton deleteCustBtn;
    private com.k33ptoo.components.KButton deleteEmp;
    private com.k33ptoo.components.KButton editCustBtn;
    private com.k33ptoo.components.KButton editEmp;
    private com.k33ptoo.components.KGradientPanel indicatorAddbill;
    private com.k33ptoo.components.KGradientPanel indicatorAddcust;
    private com.k33ptoo.components.KGradientPanel indicatorAddemp;
    private com.k33ptoo.components.KGradientPanel indicatorAddmodal;
    private com.k33ptoo.components.KGradientPanel indicatorAddpro;
    private com.k33ptoo.components.KGradientPanel indicatorDetcust;
    private com.k33ptoo.components.KGradientPanel indicatorDetpro;
    private com.k33ptoo.components.KGradientPanel indicatorEditcust;
    private com.k33ptoo.components.KGradientPanel indicatorEditemp;
    private com.k33ptoo.components.KGradientPanel indicatorEditpro;
    private com.k33ptoo.components.KGradientPanel indicatorEmpdet;
    private com.k33ptoo.components.KGradientPanel indicatorExtraBill;
    private com.k33ptoo.components.KGradientPanel indicator_bill_det;
    private com.k33ptoo.components.KGradientPanel indicator_updt_bill;
    private com.k33ptoo.components.KGradientPanel indicator_updt_bill1;
    private com.k33ptoo.components.KGradientPanel indicatorasetting;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel12;
    private com.k33ptoo.components.KGradientPanel kGradientPanel19;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    private com.k33ptoo.components.KGradientPanel kGradientPanel5;
    private javax.swing.JLabel lbl_account;
    private javax.swing.JLabel lbl_add_bill_ntot;
    private javax.swing.JLabel lbl_add_bill_tot;
    private javax.swing.JLabel lbl_add_empaddimg;
    private javax.swing.JLabel lbl_add_empaddimg1;
    private javax.swing.JLabel lbl_add_empimg;
    private javax.swing.JLabel lbl_add_empimg3;
    private javax.swing.JLabel lbl_add_emprmimg;
    private javax.swing.JLabel lbl_add_emprmimg1;
    private javax.swing.JLabel lbl_add_proaddimg;
    private javax.swing.JLabel lbl_add_proaddimg2;
    private javax.swing.JLabel lbl_add_proimg;
    private javax.swing.JLabel lbl_add_prormimg;
    private javax.swing.JLabel lbl_add_prormimg2;
    private javax.swing.JLabel lbl_bill;
    private javax.swing.JLabel lbl_billno;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_customer;
    private javax.swing.JLabel lbl_edit_custid;
    private javax.swing.JLabel lbl_edit_empid;
    private javax.swing.JLabel lbl_edit_empimg;
    private javax.swing.JLabel lbl_edit_proaddimg;
    private javax.swing.JLabel lbl_edit_prodelimg;
    private javax.swing.JLabel lbl_edit_proimg;
    private javax.swing.JLabel lbl_employee;
    private javax.swing.JLabel lbl_gt;
    private javax.swing.JLabel lbl_min;
    private javax.swing.JLabel lbl_product;
    private javax.swing.JLabel lbl_user;
    private com.k33ptoo.components.KButton loginBtn;
    private com.k33ptoo.components.KButton loginBtn15;
    private com.k33ptoo.components.KButton loginBtn17;
    private com.k33ptoo.components.KButton loginBtn18;
    private com.k33ptoo.components.KButton loginBtn20;
    private com.k33ptoo.components.KButton loginBtn22;
    private com.k33ptoo.components.KButton loginBtn6;
    private com.k33ptoo.components.KGradientPanel panel_account;
    private com.k33ptoo.components.KGradientPanel panel_accountmain;
    private com.k33ptoo.components.KGradientPanel panel_accountmenu;
    private com.k33ptoo.components.KGradientPanel panel_accountsetting;
    private com.k33ptoo.components.KGradientPanel panel_addBill;
    private com.k33ptoo.components.KGradientPanel panel_addcust;
    private com.k33ptoo.components.KGradientPanel panel_addcust_menu;
    private com.k33ptoo.components.KGradientPanel panel_addcustmenu10;
    private com.k33ptoo.components.KGradientPanel panel_addcustmenu12;
    private com.k33ptoo.components.KGradientPanel panel_addcustmenu16;
    private com.k33ptoo.components.KGradientPanel panel_addcustmenu17;
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
    private com.k33ptoo.components.KGradientPanel panel_updateBill;
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
    private javax.swing.JTable productTable;
    private spinner.Spinner spinner_edit_pro_qty;
    private javax.swing.JTable table_bill;
    private javax.swing.JTable table_custdet;
    private javax.swing.JTable table_custedit;
    private javax.swing.JTable table_empdet;
    private javax.swing.JTable table_empdet1;
    private javax.swing.JTable table_empedit;
    private textarea.TextAreaScroll textAreaScroll2;
    private textarea.TextAreaScroll textAreaScroll3;
    private javax.swing.JTextField txt_add_bill_brand;
    private javax.swing.JTextField txt_add_bill_con;
    private javax.swing.JTextField txt_add_bill_ctgry;
    private javax.swing.JTextField txt_add_bill_dis;
    private javax.swing.JTextField txt_add_bill_email;
    private javax.swing.JTextField txt_add_bill_model;
    private javax.swing.JTextField txt_add_bill_paid;
    private javax.swing.JTextField txt_add_bill_price;
    private javax.swing.JTextField txt_add_bill_snm;
    private javax.swing.JTextField txt_add_bill_tax;
    private textfield.TextField txt_add_custemail;
    private textfield.TextField txt_add_custid;
    private textfield.TextField txt_add_custnm;
    private textfield.TextField txt_add_custno;
    private textarea.TextArea txt_add_custsaddress;
    private textfield.TextField txt_add_custsnm;
    private textfield.TextField txt_add_custsnm2;
    private textfield.TextField txt_add_empadd;
    private textfield.PasswordField txt_add_empcpswd;
    private textfield.TextField txt_add_empemail;
    private textfield.TextField txt_add_empid;
    private textfield.TextField txt_add_empnm;
    private textfield.TextField txt_add_empno;
    private textfield.PasswordField txt_add_emppswd;
    private textfield.TextField txt_add_empsalary;
    private textfield.TextField txt_add_pro_cprice;
    private textarea.TextArea txt_add_pro_desc;
    private textfield.TextField txt_add_pro_id;
    private textfield.TextField txt_add_pro_id10;
    private textfield.TextField txt_add_pro_id11;
    private textfield.TextField txt_add_pro_id12;
    private textfield.TextField txt_add_pro_id3;
    private textfield.TextField txt_add_pro_id8;
    private textfield.TextField txt_add_pro_id9;
    private spinner.Spinner txt_add_pro_qty;
    private spinner.Spinner txt_add_pro_qty1;
    private textfield.TextField txt_add_pro_sprice;
    private textfield.TextField txt_add_promcb_brand_id;
    private textfield.TextField txt_add_promcb_brand_nm;
    private textfield.TextField txt_add_promcb_ctgy_id;
    private textfield.TextField txt_add_promcb_ctgy_nm;
    private textfield.TextField txt_add_promcb_model_id;
    private textfield.TextField txt_add_promcb_model_nm;
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
    private textfield.TextField txt_edit_empno;
    private textfield.TextField txt_edit_empsalary;
    private textfield.TextField txt_edit_paidTotal;
    private textfield.TextField txt_edit_pro_brandnm;
    private textfield.TextField txt_edit_pro_cprice;
    private textfield.TextField txt_edit_pro_ctgynm;
    private textfield.TextField txt_edit_pro_modelnm;
    private textfield.TextField txt_edit_pro_sprice;
    private textfield.TextField txt_prodet_proid;
    private textfield.TextField txt_searchBill_data;
    private javax.swing.JTextArea txtarea_bill;
    // End of variables declaration//GEN-END:variables
}
