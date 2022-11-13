import java.util.ArrayList;

public class PhoneBook {
    ArrayList<Contact> contacts;

    public PhoneBook() {
        contacts = new ArrayList<>();
    }

    //Adaugati semnatura unei metode pt adaugarea unui contact nou
    void addNewContact(Contact c) {
        contacts.add(c);
    }

    void searchAndShowContact(String nameToSearch) {
        for (Contact c : contacts) {
            if (c.firstname.contains(nameToSearch)) {
                showContact(c);
            }
        }
    }

    void removeContact(String nameToSearch) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).firstname.contains(nameToSearch)) {
                contacts.remove(i);
            }
        }
    }

    void show() {
        System.out.println("Continutul agendei este:");
        for (Contact x : contacts) {
            showContact(x);
        }
    }

    void showContact(Contact x) {
        System.out.println("-------");
        System.out.println("Nume:" + x.firstname);
        System.out.println("Prenume:" + x.lastname);
        System.out.println("Telefon:" + x.phone);
        System.out.println("Email:" + x.email);
        System.out.println("-------");
    }
}



