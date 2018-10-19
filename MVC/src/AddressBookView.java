import javax.swing.*;
import java.util.*;

/**
 * The View Object for the MVC design
 * @author Muneeb Nasir, Student NO: 101033955
 * @version 6.0
 */
public class AddressBookView extends JFrame
{
    private JMenuItem create;
    private JMenuItem save;
    private JMenuItem add_Item;
    private JMenuItem remove;
    private JMenuItem edit;
    private DefaultListModel<BuddyModel> listModel;
    private JList<BuddyModel> buddyList;

    public AddressBookView(){
        //Creating the JFrame
        JFrame jFrame = new JFrame("Address Book");
        jFrame.setBounds(100, 100, 730, 489);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Creating JMenuBar
        JMenuBar jmenubar = new JMenuBar();
        JMenu book_Menu = new JMenu("Address Book");
        JMenu buddy_Menu = new JMenu("Buddy Information");
        //Creating JMenuItem for Address Book Menu
        create = new JMenuItem("Create");
        save = new JMenuItem("Save");
        //Enabling||Disabling the Save,Display Menu Items initially
        save.setEnabled(false);
        create.setEnabled(true);

        //Creating JMenuItem for the Buddy Information
        add_Item = new JMenuItem("Add");
        remove = new JMenuItem("Remove");
        edit = new JMenuItem("Edit");

        //Initially Disabling the Add,Remove and Edit Menu Items initially
        add_Item.setEnabled(false);
        remove.setEnabled(false);
        edit.setEnabled(false);
        //Adding the created Menu Items onto the JMenu
        book_Menu.add(create);
        book_Menu.add(save);
        buddy_Menu.add(add_Item);
        buddy_Menu.add(remove);
        buddy_Menu.add(edit);
        //Placing the Menu Item onto the JMenuBar
        jmenubar.add(book_Menu);
        jmenubar.add(buddy_Menu);
        //Once all the Menu Items/Menus been added onto the Menu Bar. Place Menu Bar onto the JFrame
        jFrame.setJMenuBar(jmenubar);

        //create the model and add elements
        listModel = new DefaultListModel<>();
        //creating the JList
        buddyList = new JList<BuddyModel>(listModel);
        //Adding a Scroll-pane to the JList with the default mode for MULTIPLE_INTERVAL_SELECTION
        add(new JScrollPane(buddyList));
        jFrame.add(buddyList);

        //Set Visible is required for the Frame
        jFrame.setVisible(true);
    }

    /**
     * The method used to add items to the List Mode
     * @param name, The Item that has to be added the model
     */
    public void addtoList(BuddyModel name)
    {
        listModel.addElement(name);
    }
    /**
     * @return List Model, The list containing all the information on the
     * buddies added by user.
     */
    public DefaultListModel<BuddyModel> getBuddyModel(){
        return listModel;
    }
    /**
     * @return JList, The list containing all the information on the
     * buddies added by user.
     */
    public JList<BuddyModel> getbuddyList(){
        return buddyList;
    }

    /**
     * The methods used to get the menu items
     * @return Menu, The defined JMenu Item
     */
    public JMenuItem getAdd_Item() {
        return add_Item;
    }

    public JMenuItem getRemove() {
        return remove;
    }

    public JMenuItem getEdit() {
        return edit;
    }
    public JMenuItem getSave() {
        return save;
    }
    public JMenuItem getCreate() {
        return create;
    }


}
