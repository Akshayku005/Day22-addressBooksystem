package B_L;

package addressbook;
import java.util.Scanner;
import java.util.ArrayList;

public class AddressBook {
	ArrayList<Contact> list = new ArrayList<Contact>();
	String bookName; /// It represent the name of book

	void addContact() {
		Contact contact = new Contact();
		contact.addContact();
		list.add(contact);
		System.out.println("Contact added successfully");
		boolean duplicateContact = list.stream().anyMatch(x -> x.firstName.equals(contact.firstName));
		if (duplicateContact == true) {
			System.out.println("It is a duplicate contact.");
			return;
		} else {
			list.add(contact);
			System.out.println("Contact added successfully");
		}

	}

	void deletePerson(String name, ArrayList<Contact> list) {
		if (list.size() == 0) {
			System.out.println("Address book is empty.Please Add First");
		} else {
			int m = 0;
			for (int i = list.size() - 1; i >= 0; --i) {
				if (((ArrayList<Contact>) list.get(i).firstName).contains(name)) {
					list.remove(i);
					System.out.println("Contact deleted successfully");
					m += 1;
					break;
				}
			}
			if (m == 0) {
				System.out.println("No contact with the given name exist");
			}
		}
	}
	void editPerson(String name, ArrayList<Contact> list) {
		if (list.size() == 0) {
			System.out.println("Addressbook is empty.Please add First");
		} else {
			int m = 0;
			for (int i = list.size() - 1; i >= 0; --i) {
				if (((ArrayList<Contact>) list.get(i).firstName).contains(name)) {
					list.get(i).addContact();
					System.out.println("Contact Updated successfully");
					m += 1;
					break;
				}
			}
			if (m == 0) {
				System.out.println("No contact with the given name exist");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book Program ");
		BookList shelf = new BookList();
		while (true) {
			AddressBook addressBook = new AddressBook();
			Scanner scan3 = new Scanner(System.in);
			System.out.println("Enter the name of Book you want to  access or add or press 'q' to quit");
			String bookName = scan3.nextLine();
			if (bookName.equals("q")) {
				//if (addressBook.list.size() > 0) {
				//book.addBook(bookName, addressBook);
				//}
				// if (addressBook.list.size() > 0) {
				// book.addBook(bookName, addressBook);
				// }
				System.out.println("The program is closed");
				break;
			}
			int result = shelf.checkBook(bookName);//// (It can return 0 or 1)It will return 1 if book exist b and break
			//// down loop
			int condition = 0;///// It will keep check on the addressbook created or not
			while (true) {
				if (result == 1) {
					break;
				}
				System.out.println("Do you want to add/edit/delete the contact (0/1/2) :Press 3 to Go back to main menu");
				System.out
				.println("Do you want to add/edit/delete the contact (0/1/2) :Press 3 to Go back to main menu");
				Scanner scan = new Scanner(System.in);
				int input = scan.nextInt();

			}
