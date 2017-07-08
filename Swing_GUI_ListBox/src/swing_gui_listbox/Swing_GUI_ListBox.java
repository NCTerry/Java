/*
http://www.newthinktank.com/2012/03/java-video-tutorial-25/

Here I continue making the most comprehensive Java Video Tutorial ever. 
Today I’ll cover how to create list boxes using Java Swing.

More specifically I’ll cover JLists, DefaultListModel, using JScrollpane 
    with JList and a whole bunch more.
 */
package swing_gui_listbox;


import javax.swing.*;
import java.awt.event.*;

//======================================
public class Swing_GUI_ListBox extends JFrame{
	
    JButton button1;
    String infoOnComponent = "";
    JList favoriteMovies, favoriteColors;
    DefaultListModel defListModel = new DefaultListModel();
    JScrollPane scroller;
    
    
//======================================
    public static void main(String[] args){

        new Swing_GUI_ListBox();

    }
	
//======================================
//======================================
//======================================
    public Swing_GUI_ListBox(){

        this.setSize(400,400);
        this.setLocationRelativeTo(null);		
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Fifth Frame");

        JPanel thePanel = new JPanel();

        
        // Create a button
        button1 = new JButton("Get Answer");
        ListenForButton lForButton = new ListenForButton();
        button1.addActionListener(lForButton);
        thePanel.add(button1);

        
        
        String[] movies = {"Matrix", "Minority Report", "Big"};

        // Creating a List Box
        favoriteMovies = new JList(movies);

        // Define the height of each cell
        favoriteMovies.setFixedCellHeight(30);

        // Define the width of each cell
        favoriteMovies.setFixedCellWidth(150);

        // Define how many selections can be made on the movie list
        // MULTIPLE_INTERVAL_SELECTION: Select what ever you want
        // SINGLE_SELECTION: Select only one
        // SINGLE_INTERVAL_SELECTION: Select as many as you want if in order
        /*
        Currently we can select; all 3, 1&2 or 2&3
            Matrix
            Minority Report
            Big
        */
        favoriteMovies.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        // All the methods for lists
        /*
         * getSelectedIndex(): returns the index for the first selected item
         * getSelectedIndexes(): returns every selection in a list
         * getSelectedValue(): returns the value of the first selected
         * getSelectedValues(): returns an array of all values
         * isSelectedIndex(): returns true if index is selected
         */

        // You can't change items in a list unless you store the items
        // in a DefaultListModel
        String[] colors = {"Black", "Blue", "White", "Green", "Orange", "Gray", "Pink"};

        // How to load a String array into a DefaultListModel
        for(String color: colors){
                defListModel.addElement(color);
        }

        // Add item named Purple to index number 2
        defListModel.add(2, "Purple");

        // Create a List box filled with items in the DefaultListModel
        favoriteColors = new JList(defListModel);

        // Only display 5 items at a time
        favoriteColors.setVisibleRowCount(5);

        // Create a scroll bar panel to hold the list box
        scroller = new JScrollPane(favoriteColors, 
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Define the height of each cell
        favoriteColors.setFixedCellHeight(30);

        // Define the width of each cell
        favoriteColors.setFixedCellWidth(150);

        thePanel.add(favoriteMovies);

        // You add the scroll bar container, not the list
        thePanel.add(scroller);

        this.add(thePanel);

        this.setVisible(true);

    }
//======================================
    //======================================
    //======================================
        private class ListenForButton implements ActionListener{
            //======================================
            //======================================
            public void actionPerformed(ActionEvent e){

                if(e.getSource() == button1){

                    // contains returns true if the item is in the list
                    if(defListModel.contains("Black")) infoOnComponent += "Black is here\n";

                    // Check if the list isn't empty
                    if(!defListModel.isEmpty()) infoOnComponent += "Isn't Empty\n";

                    // return the number of items in the DefaultListModel
                    infoOnComponent += "Elements in the  color list " + defListModel.size() + "\n";

                    // return the first element in the list
                    infoOnComponent += "Last Element " + defListModel.firstElement() + "\n";

                    // return the last element in the list
                    infoOnComponent += "Last Element " + defListModel.lastElement() + "\n";

                    // return the last element in the list
                    infoOnComponent += "Element in index 1 " + defListModel.get(1) + "\n";

                    // Remove the item in index 0
                    defListModel.remove(0);

                    // Remove the item named Big
                    defListModel.removeElement("Blue");

                    // Create an array filled with the list items
                    Object[] arrayOfList = defListModel.toArray();

                    // Iterate through the array
                    for(Object color: arrayOfList){
                        infoOnComponent += color + "\n";
                    }

                    JOptionPane.showMessageDialog(Swing_GUI_ListBox.this, infoOnComponent, "Information", JOptionPane.INFORMATION_MESSAGE);

                    infoOnComponent = "";

                }
            }
        }
}
