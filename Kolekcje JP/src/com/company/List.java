package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class List implements Collections {



         String LIST_MENU =
            "Wybierz rodzaj listy jakiej chcesz uzyc\n" +
                    "1.ArrayList\n" +
                    "2.LinkedList";

    public void add_arrayList(Person person)
    {
        arrayList.add(person);
    }
    public void remove_arrayList(int i)
    {
        arrayList.remove(i-1);
    }
    public void show_arrayList()
    {
        for (Person person: arrayList) {
            System.out.println(person.getFirstName()+" "+person.getLastName()+" "+person.getAge());
        }
    }

    public void add_linkedList(Person person)
    {
        linkedList.add(person);
    }
    public void remove_linkedList(int i)
    {
        linkedList.remove(i-1);
    }
    public void show_linkedList()
    {
        for (Person person: linkedList) {
            System.out.println(person.getFirstName()+" "+person.getLastName()+" "+person.getAge());

        }
    }
    Scanner scanner = new Scanner(System.in);

    public void actions_List()
    {
        System.out.println(LIST_MENU);
        int a = scanner.nextInt();
        switch (a)
        {
            case 1: {

                System.out.println(Menu);
                int b = scanner.nextInt();
                switch (b)
                {
                    case 1:
                    {
                        System.out.println("Podaj imie:");
                   String name = scanner.nextLine();
                        String cos = scanner.nextLine();

                        System.out.println("Podaj nazwisko: ");
                        String lastName=scanner.nextLine();
                        System.out.println("Podaj wiek: ");
                        int age= Integer.parseInt(scanner.nextLine());
                        Person person = new Person(cos,lastName,age);
                        add_arrayList(person);
                        System.out.println(person.getFirstName()+" "+person.getLastName()+" "+person.getAge()+" zostal dodany do arraylist");

                        break;
                    }
                    case 2: {
                        if (arrayList.size() >= 1) {
                            System.out.println("podaj indeks jaki chcesz usunac z arraylist");
                            int k= scanner.nextInt();

                            try{
                                remove_arrayList(k);
                                System.out.println("Element o indeksie "+k+ " zostal usunięty z Arraylisty");
                                break;
                            }catch(Exception e){
                                System.out.println("brak odpowaidajacego elementu");
                            }
                        }
                        else{
                            System.out.println("brak elementow w arrayliscie");
                            break;
                        }
                        break;
                    }
                    case 3: {
                        show_arrayList();
                        break;
                    }
                    default: {
                        System.out.println("podales nieprawidlowa wartosc");
                        break;
                    }
                }
                break;
            }
            case 2:
            {
                System.out.println(Menu);
                int i = scanner.nextInt();
                switch (i)
                {
                    case 1:
                    {
                        System.out.println("Podaj imie: ");
                        String name = scanner.nextLine();
                        String cos = scanner.nextLine();
                        System.out.println("Podaj nazwisko: ");
                        String lastName=scanner.nextLine();
                        System.out.println("Podaj wiek: ");
                        int age= Integer.parseInt(scanner.nextLine());
                        Person person = new Person(cos,lastName,age);
                        add_linkedList(person);
                        System.out.println(person.getFirstName()+" "+person.getLastName()+" "+person.getAge()+" zostal dodany do linkedlist");

                        break;
                    }
                    case 2:
                    {
                        if(linkedList.size()>=1){
                        System.out.println("podaj indeks jaki chcesz usunac z linkedlist");
                        try {
                            int k = scanner.nextInt();
                            remove_linkedList(k);
                            System.out.println("Element o indeksie " + k + " zostal usunięty z linkedlist");
                            break;
                        } catch (Exception e) {
                            System.out.println("brak elementu w linkedlist");
                        }
                    }
                        else{
                        System.out.println("brak elementow w linkedlist");
                        break;
                    }
                        break;
                }
                    case 3: {
                        show_linkedList();
                        break;
                    }
                    default: {
                        System.out.println("wybrano niepoprawna opcje");
                        break;
                    }
                }
                break;
            }
        }
    }


}
