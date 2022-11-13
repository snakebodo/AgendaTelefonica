import java.util.Scanner;

public class Menu {

    PhoneBook phoneBook;

    public Menu(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void showInitialMenu() {
        System.out.println("Va rugam alegeti optiunea:");
        System.out.println("1 - Afisare agenda");
        System.out.println("2 - Adaugare contact");
        System.out.println("3 - Stergere contact");
        System.out.println("4 - Cautare contact");
        System.out.println("5 - Inchide programul");
        Scanner scanner = new Scanner(System.in);
        int userOption = scanner.nextInt();
        if (userOption == 2) {
            readAndAddNewContact();
            showInitialMenu();
        }
        if (userOption == 5) {
            System.out.println("Bye bye!");
        }
        if (userOption == 1) {
            phoneBook.show();
            showInitialMenu();
        }
        if (userOption == 4) {
            String nameToSearch = scanner.next();
            phoneBook.searchAndShowContact(nameToSearch);
            showInitialMenu();
        }
        if(userOption == 3) {
            String nameToSearch = scanner.next();
            phoneBook.removeContact(nameToSearch);
            showInitialMenu();
        }
    }

    public void readAndAddNewContact() {
        System.out.println("Va rugam introduceti 4 valori: nume, prenume, telefon, email:");
        Scanner scanner = new Scanner(System.in);
        //Sa citim de la tastatura tot ce avem nevoie pentru a salva un contact in agenda
        //Sa salvam contactul in agenda si sa afisam iarasi continutul agendei
        Contact contact = new Contact(
                scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine()
        );
        this.phoneBook.addNewContact(contact);
    }
}
