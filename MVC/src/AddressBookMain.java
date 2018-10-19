/**
 * The USER Object for the MVC design
 * @author Muneeb Nasir, Student NO: 101033955
 * @version 6.0
 */
public class AddressBookMain
{
    public static void main(String[] args) {
        BuddyModel model_buddyInfo = new BuddyModel();
        AddressBookView view_addressBook = new AddressBookView();
        BookController book_controller = new BookController(model_buddyInfo,view_addressBook );
        book_controller.addMenuListeners();
    }


}
