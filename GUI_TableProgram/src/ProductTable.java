
import javax.swing.table.DefaultTableModel;
// ======================================================================
    // ======================================================================
    // ======================================================================
// ======================================================================
    // ======================================================================
    // ======================================================================
/*
This clip tutors how to:
- use JTable and some related methods
- perform inserting a new row
- perform updating a selected row
- perform deleting a selected row

1- After Creating the application,
    Right Click <default package>: New: JFrameForm
        Gives us the Source|Design|History sections.
1.b. In properties, change grid color to black.

2-Top right menu in Design, Drag "Table" into the box.
3-  Drag label1 + textfield1
    Drag label2 + combobox
    Drag label3 + textfield2
    Drag button1 + button2 + button3
    Drag label4
    
4-Rename the text, and variable names
5-Right click on combobox, go to Properties, go to Model. There will be Item1, Item2, Item3, Item4 there by default. Delete all.
    Rename: Electronic, Art, Electricity, Food
6-Rename buttons add, update, delete
7-Remove label from label4
8-Select Table: Select Model-->TableModel-->Those Properties
    On Table Settings Tab
        Change 4 Titles to: Product Name, Category, Price, Delete Row4
            Bottom left,  Rows:4  Columns:3
    Change to Default Settings Tab
        Bottom left,  Rows:0, Columns:3
OK: Close

9-When you get back to the Design Page, the Table will have
	Product Name		Category		Price
		(all empty below)

10-Select Table: Change Variable Name: tblProducts
11-Double click the Add button. It will create a code entry and take you to the code page.
	Code in:      private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {   ……
		Just put in a nice chunk of code in the addButtonActionPerformed

12-You can run the ProductTable.java file and you will get good table to pop up.

13-Double click the Update button.
	Enter Code:

14-Select the Table: RightClick: Events: Mouse: MouseClicked
	Creates the code area. Takes you too Source
		“    private void tblProductsMouseClicked(java.awt.event.MouseEvent evt  {…….“
		
		The code, if you have a row you put in, and you click on that row, it will take the data 
		from the 3 columns and automatically place it in the entry boxes.

15-Double click on the Delete button. 
	put in code


 */

// ======================================================================
// ======================================================================
// ======================================================================
    // ======================================================================
    // ======================================================================
public class ProductTable extends javax.swing.JFrame {
// ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
    /**
     * Creates new form NewJFrame
     */
    public ProductTable() {
        initComponents();
    }
// ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        jProgressBar1 = new javax.swing.JProgressBar();
        productNameLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        iMessage = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        entryProductName = new javax.swing.JTextField();
        entryPrice = new javax.swing.JTextField();
        comboBoxCategory = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblProducts.setAutoCreateRowSorter(true);
        tblProducts.setBackground(new java.awt.Color(204, 204, 204));
        tblProducts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Category", "Price"
            }
        ));
        tblProducts.setCellSelectionEnabled(true);
        tblProducts.setGridColor(new java.awt.Color(0, 0, 0));
        tblProducts.setShowGrid(true);
        tblProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProducts);

        jProgressBar1.setBackground(new java.awt.Color(0, 0, 0));
        jProgressBar1.setForeground(new java.awt.Color(204, 204, 204));

        productNameLabel.setText("Product Name:");
        productNameLabel.setToolTipText("");

        categoryLabel.setText("Category:");

        priceLabel.setText("Price:");

        iMessage.setForeground(new java.awt.Color(255, 0, 0));

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        entryProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryProductNameActionPerformed(evt);
            }
        });

        comboBoxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electronic", "Art", "Electricity", "Food" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productNameLabel)
                            .addComponent(priceLabel)
                            .addComponent(categoryLabel))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(entryPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboBoxCategory, javax.swing.GroupLayout.Alignment.LEADING, 0, 135, Short.MAX_VALUE)
                                .addComponent(entryProductName, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productNameLabel)
                    .addComponent(entryProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryLabel)
                    .addComponent(comboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(priceLabel)
                    .addComponent(entryPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
    // To auto create these actions, double-click on the Item in Display
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // ======================================================================
        iMessage.setText("");
        // table name
        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
        // ======================================================================
        // entrybox1 name --> if there is an entry, we will create a Row
        if (!entryProductName.getText().trim().equals("")) {
        // Created the 'table=model', add a row to the table using the input details. 
        // entrybox1 name | combobox name | entrybox2 name
            model.addRow(new Object[]{entryProductName.getText(), comboBoxCategory.getSelectedItem().toString(), entryPrice.getText()});
        } else {// ======================================================================
        // If there wasn't a user entry in the Product Name entry box.
        // label4 name
            System.out.println(entryProductName.getText()); //Not needed, just for me.
            iMessage.setText("Product Name should not be left blank.");
        }// ======================================================================
    }//GEN-LAST:event_addButtonActionPerformed
    // ======================================================================
    // ======================================================================
    // ======================================================================
    private void entryProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryProductNameActionPerformed
        // TODO add your handling code here:
        // This does nothing currently. 
        // We simply take text inside using the buttons and place it in the table.
    }//GEN-LAST:event_entryProductNameActionPerformed
    // ======================================================================
    // ======================================================================
    // ======================================================================
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        // To update a current entry.
        // Remember this DefaultTableModel was imported up top.
        // We have created the actual tabel we wanted in Design which was variable name "tblProducts"
        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
        
        if (tblProducts.getSelectedRow() == -1) { //This count is auto set to -1 ???
            
            if(tblProducts.getRowCount() == 0) { //If there are no rows that have been added yet.
                iMessage.setText("Table is empty");
            
            } else { //There are rows, but nothing is selected.
                iMessage.setText("You must select a product");
            }
            
        } else { //There are rows, and we have selected one.
            //0,1,2 applies to the columns(ProductName, Category, Price) for selected row. --> 
            //Line Below: get input from Product Name entrybox, set input in first column in new row. 
            model.setValueAt(entryProductName.getText(), tblProducts.getSelectedRow(), 0);
            //Line Below: get input from Category Entry Box, set input in 2nd column in new row. 
            model.setValueAt(comboBoxCategory.getSelectedItem(), tblProducts.getSelectedRow(), 1);
            //Line Below: get input from Price entrybox, set input in 3rd column in new row. 
            model.setValueAt(entryPrice.getText(), tblProducts.getSelectedRow(), 2);
        }
    }//GEN-LAST:event_updateButtonActionPerformed
    // ======================================================================
    // ======================================================================
    // ======================================================================
    private void tblProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductsMouseClicked
        // TODO add your handling code here:
        // If you have your table, and you click on a row that has been put it
        //      it will automatically put the values in the columns in the entry places, and combobox. 
        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
        entryProductName.setText(model.getValueAt(tblProducts.getSelectedRow(), 0).toString());
        comboBoxCategory.setSelectedItem(model.getValueAt(tblProducts.getSelectedRow(), 1).toString());
        entryPrice.setText(model.getValueAt(tblProducts.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_tblProductsMouseClicked
    // ======================================================================
    // ======================================================================
    // ======================================================================
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        // If you select the row, and click the Delete button, the row will delete. 
        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
        
        //-1 If you don't have a row that you can select.
        if (tblProducts.getSelectedRow() == -1) { //This count is auto set to -1 ???
            
            if(tblProducts.getRowCount() == 0) { //If there are no rows.
                iMessage.setText("Table is empty");
            
            } else { //There are rows, but nothing is selected.
                iMessage.setText("You must select a product");
            }
        } else { //There are rows, and we have selected one.
            model.removeRow(tblProducts.getSelectedRow()); // Delete the row
            
        }
    }//GEN-LAST:event_deleteButtonActionPerformed
// ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
    /**
     * @param args the command line arguments
     */
    // ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
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
            java.util.logging.Logger.getLogger(ProductTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductTable().setVisible(true);
            }
        });
    }
// ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
    // ======================================================================
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JComboBox<String> comboBoxCategory;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField entryPrice;
    private javax.swing.JTextField entryProductName;
    private javax.swing.JLabel iMessage;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel productNameLabel;
    private javax.swing.JTable tblProducts;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
