// https://youtube.com/watch?v=78PCIp2bSEk

/*
There are inherent flaws that for certain decimal operations using a double, that we get extra decimal work. EX:
    5.1 - 1.1 = 3.9999999999996
We need a built in function BigDecimal
*/
import java.math.BigDecimal;

public class NormCalcForm extends javax.swing.JFrame {

    /**
     * Creates new form NormCalcForm
     */
    public NormCalcForm() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        txtDisplay = new javax.swing.JTextField();
        buttonAdd = new javax.swing.JButton();
        buttonMultipy = new javax.swing.JButton();
        buttonSubtract = new javax.swing.JButton();
        buttonDivide = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonDOT = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        plusORminus = new javax.swing.JButton();
        equals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        button1.setText("1");
        button1.setToolTipText("button1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        button2.setText("2");
        button2.setToolTipText("button2");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        button3.setText("3");
        button3.setToolTipText("button3");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        button4.setText("4");
        button4.setToolTipText("button4");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        button5.setText("5");
        button5.setToolTipText("button5");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        button6.setText("6");
        button6.setToolTipText("button6");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button8.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        button8.setText("8");
        button8.setToolTipText("button8");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button7.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        button7.setText("7");
        button7.setToolTipText("button7");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button9.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        button9.setText("9");
        button9.setToolTipText("button9");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        txtDisplay.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txtDisplay.setToolTipText("txtDisplay");

        buttonAdd.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        buttonAdd.setText("+");
        buttonAdd.setToolTipText("buttonAdd");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonMultipy.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        buttonMultipy.setText("*");
        buttonMultipy.setToolTipText("buttonMultiply");
        buttonMultipy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMultipyActionPerformed(evt);
            }
        });

        buttonSubtract.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        buttonSubtract.setText("-");
        buttonSubtract.setToolTipText("buttonSubtract");
        buttonSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubtractActionPerformed(evt);
            }
        });

        buttonDivide.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        buttonDivide.setText("/");
        buttonDivide.setToolTipText("buttonDivide");
        buttonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDivideActionPerformed(evt);
            }
        });

        buttonClear.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        buttonClear.setText("C");
        buttonClear.setToolTipText("buttonClear");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        buttonDOT.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        buttonDOT.setText(".");
        buttonDOT.setToolTipText("buttonDOT");
        buttonDOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDOTActionPerformed(evt);
            }
        });

        button0.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        button0.setText("0");
        button0.setToolTipText("button0");
        button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0ActionPerformed(evt);
            }
        });

        plusORminus.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        plusORminus.setText("+/-");
        plusORminus.setToolTipText("plusORminus");

        equals.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        equals.setText("=");
        equals.setToolTipText("equals");
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(plusORminus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(equals))
                    .addComponent(txtDisplay)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonMultipy, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonDOT, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonMultipy, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonDOT, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(buttonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(equals, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(plusORminus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//==================================================================
    //Primary Global Variables==================================================================
    double mainNumber1, mainNumber2;
    BigDecimal result;
    String operation;
    
    //==================================================================
    //==================================================================
    //==================================================================
    //==================================================================
    //==================================================================
    //==================================================================
    //==================================================================
    //==================================================================
    //==================================================================
    //1 BUTTON==================================================================
    //THIS ALSO APPLIES TO 2,3,4,5,6,7,8,9,0,+,-,/,*,.,C,=,+/-
    /*
        Create a local variable
        Bring in the value associated with each button.
        Associate the value brought in with the local variable
        Display the current disply with the new value we just brought in
    */
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        String takein;
        takein = txtDisplay.getText() + button1.getText();
        txtDisplay.setText(takein);
        
    }//GEN-LAST:event_button1ActionPerformed
 //==================================================================
    //==================================================================
    //==================================================================
    //==================================================================
    //ADD BUTTON==================================================================
    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // Set current display number to the global mainNumber1
        mainNumber1 = Double.parseDouble(txtDisplay.getText());
        // Clear the display.
        txtDisplay.setText("");
        // State the operation will be an addition.
        operation = "+";
    }//GEN-LAST:event_buttonAddActionPerformed
    //==================================================================
    //MULTIPLY BUTTON==================================================================
    private void buttonMultipyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMultipyActionPerformed
        // Set current display number to the global mainNumber1
        mainNumber1 = Double.parseDouble(txtDisplay.getText());
        // Clear the display.
        txtDisplay.setText("");
        // State the operation will be an multiplication.
        operation = "*";    }//GEN-LAST:event_buttonMultipyActionPerformed
    //==================================================================
    //SUBTRACT BUTTON==================================================================
    private void buttonSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubtractActionPerformed
        // Set current display number to the global mainNumber1
        mainNumber1 = Double.parseDouble(txtDisplay.getText());
        // Clear the display.
        txtDisplay.setText("");
        // State the operation will be an subtraction.
        operation = "-";    }//GEN-LAST:event_buttonSubtractActionPerformed
    //==================================================================
    //DIVIDE BUTTON==================================================================
    private void buttonDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDivideActionPerformed
        // Set current display number to the global mainNumber1
        mainNumber1 = Double.parseDouble(txtDisplay.getText());
        // Clear the display.
        txtDisplay.setText("");
        // State the operation will be an Division.
        operation = "/";    }//GEN-LAST:event_buttonDivideActionPerformed
//==================================================================
    //==================================================================
    //==================================================================
    //==================================================================
    //==================================================================
    //==================================================================
    //==================================================================
    //==================================================================
    //==================================================================
    //2 BUTTON==================================================================
    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        String takein;
        takein = txtDisplay.getText() + button2.getText();
        txtDisplay.setText(takein);    }//GEN-LAST:event_button2ActionPerformed
//==================================================================
    //3 BUTTON==================================================================
    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        String takein;
        takein = txtDisplay.getText() + button3.getText();
        txtDisplay.setText(takein);    }//GEN-LAST:event_button3ActionPerformed
//==================================================================
    //4 BUTTON==================================================================
    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        String takein;
        takein = txtDisplay.getText() + button4.getText();
        txtDisplay.setText(takein);    }//GEN-LAST:event_button4ActionPerformed
//==================================================================
    //5 BUTTON==================================================================
    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        String takein;
        takein = txtDisplay.getText() + button5.getText();
        txtDisplay.setText(takein);    }//GEN-LAST:event_button5ActionPerformed
//==================================================================
    //6 BUTTON==================================================================
    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        String takein;
        takein = txtDisplay.getText() + button6.getText();
        txtDisplay.setText(takein);    }//GEN-LAST:event_button6ActionPerformed
//==================================================================
    //7 BUTTON==================================================================
    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        String takein;
        takein = txtDisplay.getText() + button7.getText();
        txtDisplay.setText(takein);    }//GEN-LAST:event_button7ActionPerformed
//==================================================================
    //8 BUTTON==================================================================
    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        String takein;
        takein = txtDisplay.getText() + button8.getText();
        txtDisplay.setText(takein);    }//GEN-LAST:event_button8ActionPerformed
//==================================================================
    //9 BUTTON==================================================================
    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        String takein;
        takein = txtDisplay.getText() + button9.getText();
        txtDisplay.setText(takein);    }//GEN-LAST:event_button9ActionPerformed
//==================================================================
    //ZERO BUTTON==================================================================
    private void button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ActionPerformed
        String takein;
        takein = txtDisplay.getText() + button0.getText();
        txtDisplay.setText(takein);    }//GEN-LAST:event_button0ActionPerformed
    //==================================================================
    //==================================================================
    //==================================================================
    //Clear Button==================================================================
    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        //Simple clear out, set text display to nothing.
        txtDisplay.setText("");    }//GEN-LAST:event_buttonClearActionPerformed
    //==================================================================
    //==================================================================
    //DOT BUTTON==================================================================
    private void buttonDOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDOTActionPerformed
        String takein;
        takein = txtDisplay.getText() + buttonDOT.getText();
        txtDisplay.setText(takein);    }//GEN-LAST:event_buttonDOTActionPerformed
    //==================================================================
    //==================================================================
    //EQUALS BUTTON==================================================================
    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
        String answer;
        mainNumber2 = Double.parseDouble(txtDisplay.getText());
        switch (operation)
        {//-------------------------------------
            case "+":
                BigDecimal par1 = BigDecimal.valueOf(mainNumber1);
                BigDecimal par2 = BigDecimal.valueOf(mainNumber2);
                
                result = par1.add(par2);
                answer = String.valueOf(result);
                txtDisplay.setText(answer);
                break;
            //-------------------------------------
            case "-":
                par1 = BigDecimal.valueOf(mainNumber1);
                par2 = BigDecimal.valueOf(mainNumber2);
                
                result = par1.subtract(par2);                
                answer = String.valueOf(result);
                txtDisplay.setText(answer);
                break;
            //-------------------------------------
            case "*":
                par1 = BigDecimal.valueOf(mainNumber1);
                par2 = BigDecimal.valueOf(mainNumber2);
                
                result = par1.multiply(par2); 
                answer = String.valueOf(result);
                txtDisplay.setText(answer);
                break;            
            //-------------------------------------
                DIVIDE DOENT TOTALL WORK. SOME DONT
                        9/5 works.
                                11/7 doesn't work.'
            case "/":
                par1 = BigDecimal.valueOf(mainNumber1);
                par2 = BigDecimal.valueOf(mainNumber2);
                
                result = par1.divide(par2); 
                answer = String.valueOf(result);
                txtDisplay.setText(answer);
                break;                
            //-------------------------------------
        }
    }//GEN-LAST:event_equalsActionPerformed
    //==================================================================
    //==================================================================
//==================================================================
    //==================================================================
    //==================================================================
    //==================================================================
    //==================================================================
    //==================================================================
    //==================================================================
    //==================================================================
    //==================================================================
    //==================================================================
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NormCalcForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NormCalcForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NormCalcForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NormCalcForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NormCalcForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonDOT;
    private javax.swing.JButton buttonDivide;
    private javax.swing.JButton buttonMultipy;
    private javax.swing.JButton buttonSubtract;
    private javax.swing.JButton equals;
    private javax.swing.JButton plusORminus;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables
}
