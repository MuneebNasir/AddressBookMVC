import javax.swing.*;
import java.awt.event.*;
import java.io.*;


/**
 * The Controller Object for the MVC design
 * @author Muneeb Nasir, Student NO: 101033955
 * @version 6.0
 */
public class BookController {
    private BuddyModel model;
    private AddressBookView view;

    public BookController() {
        this.model = null;
        this.view = null;
    }

    public BookController(BuddyModel name, AddressBookView book) {
        this.model = name;
        this.view = book;
    }

    /**
     * The method used to ADD information of the Buddies
     */
    public void addInfo() {
        String optionName = JOptionPane.showInputDialog("Enter Name");
        String optionPhone = JOptionPane.showInputDialog("Enter Phone #");
        String optionAddress = JOptionPane.showInputDialog("Enter Address");
        String optionEmail = JOptionPane.showInputDialog("Enter Email");
        view.getBuddyModel().addElement(new BuddyModel(optionName, optionAddress, optionPhone, optionEmail));
    }

    /**
     * The method used to REMOVE information of the Buddies
     * @param index, The index of the Selected Item of the JList
     */
    public void removeInfo(int index){
        if(index != -1)
        {
            view.getBuddyModel().remove(index);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid selection. Please try again");
        }
    }

    /**
     * The method used to EDIT information of the Buddies
     * @param index, The index of the Selected Item of the JList
     */
    public void editInfo(int index){
        String optionPhone = JOptionPane.showInputDialog("Enter the new Phone #");
        String optionAddress = JOptionPane.showInputDialog("Enter the new Address");
        String optionEmail = JOptionPane.showInputDialog("Enter the new Email");
        view.getBuddyModel().get(index).setNumber(optionPhone);
        view.getBuddyModel().get(index).setAddress(optionAddress);
        view.getBuddyModel().get(index).setEmail(optionEmail);
    }

    /**
     * The main method that is used to perform and control action events
     */
    public void addMenuListeners(){
        view.getSave().addActionListener((ActionEvent event) -> {
            BufferedWriter out = null;
            try {
                out = new BufferedWriter(new FileWriter("C:/Users/muneebnasir/Desktop/AddressBook.txt"));
            } catch (IOException ERR) {

            }
            for(int i = 0; i < view.getBuddyModel().getSize();i++)
            {
                try {
                    out.write(view.getBuddyModel().getElementAt(i).toString() + "\n");

                } catch (IOException t) {
                    t.printStackTrace();
                }
            }
            try {
                out.close();
            } catch (IOException ERR) {
            }
            JOptionPane.showMessageDialog(null, "Data saved successfully");
        });
        view.getAdd_Item().addActionListener((ActionEvent event) -> {
            addInfo();
            view.getSave().setEnabled(true);
            view.getRemove().setEnabled(true);
            view.getEdit().setEnabled(true);
        });
        view.getCreate().addActionListener((ActionEvent event) -> {
            view.getAdd_Item().setEnabled(true);
            JOptionPane.showMessageDialog(null, "Address Book Successfully Created");
        });
        view.getEdit().addActionListener((ActionEvent event) -> {
            int selectedIndex = view.getbuddyList().getSelectedIndex();
            editInfo(selectedIndex);
        });
        view.getRemove().addActionListener((ActionEvent event) -> {
            int selectedIndex = view.getbuddyList().getSelectedIndex();
            removeInfo(selectedIndex);
        });
    }


}

