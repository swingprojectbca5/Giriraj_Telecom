
public class NewJFrame extends javax.swing.JFrame
{

    public NewJFrame()
    {
        initComponents();
    }
    double first, second, result;
    String operation;
    String answer;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        eight = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        add = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        div = new javax.swing.JButton();
        ans = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        mul = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        per = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(68, 82, 121));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(null);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(10, 10, 230, 40);

        eight.setBackground(new java.awt.Color(228, 235, 246));
        eight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        jPanel2.add(eight);
        eight.setBounds(70, 60, 50, 40);

        seven.setBackground(new java.awt.Color(228, 235, 246));
        seven.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        jPanel2.add(seven);
        seven.setBounds(10, 60, 50, 40);

        add.setBackground(new java.awt.Color(228, 235, 246));
        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel2.add(add);
        add.setBounds(190, 60, 50, 40);

        nine.setBackground(new java.awt.Color(228, 235, 246));
        nine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        jPanel2.add(nine);
        nine.setBounds(130, 60, 50, 40);

        four.setBackground(new java.awt.Color(228, 235, 246));
        four.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        jPanel2.add(four);
        four.setBounds(10, 110, 50, 40);

        five.setBackground(new java.awt.Color(228, 235, 246));
        five.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        jPanel2.add(five);
        five.setBounds(70, 110, 50, 40);

        six.setBackground(new java.awt.Color(228, 235, 246));
        six.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        jPanel2.add(six);
        six.setBounds(130, 110, 50, 40);

        sub.setBackground(new java.awt.Color(228, 235, 246));
        sub.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sub.setText("-");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });
        jPanel2.add(sub);
        sub.setBounds(190, 110, 50, 40);

        div.setBackground(new java.awt.Color(228, 235, 246));
        div.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        div.setText("/");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });
        jPanel2.add(div);
        div.setBounds(190, 210, 50, 40);

        ans.setBackground(new java.awt.Color(228, 235, 246));
        ans.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ans.setText("=");
        ans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansActionPerformed(evt);
            }
        });
        jPanel2.add(ans);
        ans.setBounds(130, 260, 110, 40);

        dot.setBackground(new java.awt.Color(228, 235, 246));
        dot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dot.setText(".");
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });
        jPanel2.add(dot);
        dot.setBounds(70, 210, 50, 40);

        jButton14.setBackground(new java.awt.Color(228, 235, 246));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton14.setText("Clear");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14);
        jButton14.setBounds(10, 260, 110, 40);

        one.setBackground(new java.awt.Color(228, 235, 246));
        one.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        jPanel2.add(one);
        one.setBounds(10, 160, 50, 40);

        two.setBackground(new java.awt.Color(228, 235, 246));
        two.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        jPanel2.add(two);
        two.setBounds(70, 160, 50, 40);

        three.setBackground(new java.awt.Color(228, 235, 246));
        three.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        jPanel2.add(three);
        three.setBounds(130, 160, 50, 40);

        mul.setBackground(new java.awt.Color(228, 235, 246));
        mul.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mul.setText("*");
        mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulActionPerformed(evt);
            }
        });
        jPanel2.add(mul);
        mul.setBounds(190, 160, 50, 40);

        zero.setBackground(new java.awt.Color(228, 235, 246));
        zero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        jPanel2.add(zero);
        zero.setBounds(10, 210, 50, 40);

        per.setBackground(new java.awt.Color(228, 235, 246));
        per.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        per.setText("%");
        per.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perActionPerformed(evt);
            }
        });
        jPanel2.add(per);
        per.setBounds(130, 210, 50, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        String numberr = jTextField1.getText() + eight.getText();
        jTextField1.setText(numberr);
    }//GEN-LAST:event_eightActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        String numberr = jTextField1.getText() + seven.getText();
        jTextField1.setText(numberr);
    }//GEN-LAST:event_sevenActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        first = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operation = "+";
    }//GEN-LAST:event_addActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        String numberr = jTextField1.getText() + nine.getText();
        jTextField1.setText(numberr);
    }//GEN-LAST:event_nineActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        String numberr = jTextField1.getText() + four.getText();
        jTextField1.setText(numberr);
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        String numberr = jTextField1.getText() + five.getText();
        jTextField1.setText(numberr);
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        String numberr = jTextField1.getText() + six.getText();
        jTextField1.setText(numberr);
    }//GEN-LAST:event_sixActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        first = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operation = "-";
    }//GEN-LAST:event_subActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        first = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operation = "/";
    }//GEN-LAST:event_divActionPerformed

    private void ansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansActionPerformed
        second = Double.parseDouble(jTextField1.getText());

        if (operation == "+")
        {
            result = first + second;
            answer = String.format("%.2f", result);
            jTextField1.setText(answer);
        }
        else if (operation == "-")
        {
            result = first - second;
            answer = String.format("%.2f", result);
            jTextField1.setText(answer);
        }
        else if (operation == "*")
        {
            result = first * second;
            answer = String.format("%.2f", result);
            jTextField1.setText(answer);
        }
        else if (operation == "/")
        {
            result = first / second;
            answer = String.format("%.2f", result);
            jTextField1.setText(answer);
        }
        else
        {
            result = first % second;
            answer = String.format("%.2f", result);
            jTextField1.setText(answer);
        }
    }//GEN-LAST:event_ansActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
        if (!jTextField1.getText().contains("."))
        {
            jTextField1.setText(jTextField1.getText() + dot.getText());
        }
    }//GEN-LAST:event_dotActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jTextField1.setText("");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        String numberr = jTextField1.getText() + one.getText();
        jTextField1.setText(numberr);
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        String numberr = jTextField1.getText() + two.getText();
        jTextField1.setText(numberr);
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        String numberr = jTextField1.getText() + three.getText();
        jTextField1.setText(numberr);
    }//GEN-LAST:event_threeActionPerformed

    private void mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulActionPerformed
        first = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operation = "*";
    }//GEN-LAST:event_mulActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        String numberr = jTextField1.getText() + zero.getText();
        jTextField1.setText(numberr);
    }//GEN-LAST:event_zeroActionPerformed

    private void perActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perActionPerformed
        first = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operation = "%";
    }//GEN-LAST:event_perActionPerformed

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
    private javax.swing.JButton add;
    private javax.swing.JButton ans;
    private javax.swing.JButton div;
    private javax.swing.JButton dot;
    private javax.swing.JButton eight;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton jButton14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton mul;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton per;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton sub;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
