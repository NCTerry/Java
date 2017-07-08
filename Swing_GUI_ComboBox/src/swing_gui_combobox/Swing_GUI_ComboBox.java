/*
http://www.newthinktank.com/2012/03/java-video-tutorial-24/

In this video tutorial, I show you how to create combo boxes in Java Swing. 
This tutorial is also a review of everything I’ve previously gone over.

I review how to create the frame and panel. How to add buttons with event listeners. 
I also review JOptionPane. I’m slowing down a bit 
    so that I’m sure you understand everything that proceeded this tutorial.
 */
package swing_gui_combobox;

//==================================
import javax.swing.*;
import java.awt.event.*;

//==================================
public class Swing_GUI_ComboBox extends JFrame{
	
    JComboBox favoriteShows;
    JButton button1;
    String infoOnComponent = "";

    public static void main(String[] args){

        new Swing_GUI_ComboBox();

    }
//==================================
    //==================================
    //==================================
    public Swing_GUI_ComboBox(){

        this.setSize(400,400);  //Box size
        this.setLocationRelativeTo(null); //Set in center of screen
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Fourth Frame");

        JPanel thePanel = new JPanel();

        // Create an array that will be added to the combo box
        String[] shows = {"Breaking Bad", "Life on Mars", "Doctor Who"};

        // Create a combo box and add the array of shows
        favoriteShows = new JComboBox(shows);

        // Add an item to the combo box
        favoriteShows.addItem("Pushing Daisies");

        //Add the combo box to the actual GUI
        thePanel.add(favoriteShows);

        
        // Create a button
        button1 = new JButton("Get Answer");

        // Be able to listen to the button
        ListenForButton lForButton = new ListenForButton();

        // Button will listen and set this
        button1.addActionListener(lForButton);

        // Actually add the button to the GUI
        thePanel.add(button1);

        //*********************************
        // These 2 are from the beginning but need to remain at the bottom???
        // They are with the top 4
        this.add(thePanel);
        this.setVisible(true);
        //*********************************
        
        // Add an item to a combo box at index 1
        favoriteShows.insertItemAt("Dexter", 1);

        // Only show 3 items at a time
        favoriteShows.setMaximumRowCount(3);

        // Remove the item named Dexter
        //favoriteShows.removeItem("Dexter");

        // Remove the item at index 1
        //favoriteShows.removeItemAt(1);

        // Remove all items
        // favoriteShows.removeAllItems();

                }
//==================================
    //==================================
    //==================================
    // The button object is created above.
    // The method object is created which uses this method
    // Then the button object is told to listen using that method object.
        private class ListenForButton implements ActionListener{
            //==================================
            public void actionPerformed(ActionEvent e){

                // Check if the button was press, if so then this happens
                if(e.getSource() == button1){

                    favoriteShows.setEditable(true);

                    // Get item at index 0
                    infoOnComponent = "Item at 0: " + favoriteShows.getItemAt(0) + "\n";

                    // Get the number of items in the combo box
                    infoOnComponent += "Num of Shows: " + favoriteShows.getItemCount() + "\n";

                    // Get the index for the selected item
                    infoOnComponent += "Selected ID: " + favoriteShows.getSelectedIndex() + "\n";

                    // Get the value for the selected item
                    infoOnComponent += "Selected Show: " + favoriteShows.getSelectedItem() + "\n";

                    // Find out if the values in the combo box are editable
                    infoOnComponent += "Combo Box Editable: " + favoriteShows.isEditable() + "\n";

                    JOptionPane.showMessageDialog(Swing_GUI_ComboBox.this, infoOnComponent, "Information", JOptionPane.INFORMATION_MESSAGE);

                    infoOnComponent = "";

                }
            }
        }
}
