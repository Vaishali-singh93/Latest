package mywork.udemy;

import java.util.ArrayList;

public class ListDem {

    private ArrayList<ListDem> myContact = new ArrayList<>();

    public boolean addNewContact(ListDem contact) {
        if(contact==null)
            myContact.add(contact);
        return true;
    }

    private String name;
    private String phoneNumber;

    public ListDem(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static ListDem createContact(String name,String phoneNumber){

        return new ListDem(name,phoneNumber);
    }




}
