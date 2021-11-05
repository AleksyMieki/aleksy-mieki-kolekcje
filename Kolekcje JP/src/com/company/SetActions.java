package com.company;

import java.util.Scanner;

public class SetActions implements Collections {




        String Set_Menu =
                "Na jakim rodzaju kolekcji chcesz wykonywac operacje?\n" +
                        "1.HashSet\n" +
                        "2.TreeSet\n";

        private Object Tree_SetComparator;




        public void add_hash_set(Person person) {
            hashSet.add(person);
        }
        public void remove_hash_set(Person person) {
            hashSet.remove(person);
        }
        public void show_Hash_Set() {
            for (Person person : hashSet) {
                System.out.println(person.getFirstName()+" "+person.getLastName()+" "+person.getAge());
            }
        }
        public void add_tree_Set(Person person)
        {
            treeSet.add(person);
        }
        public void remove_tree_Set(Person person)
        {
            treeSet.remove(person);
        }
        public void show_tree_set()
        {
            for (Person person : treeSet) {
                System.out.println(person.getFirstName()+" "+person.getLastName()+" "+person.getAge());
            }
        }
        Scanner scanner = new Scanner(System.in);

        public void actions_Set()
        {
            System.out.println(Set_Menu);
            int a = Integer.parseInt(scanner.nextLine());

            switch (a)
            {
                case 1: {
                    System.out.println(Menu);
                    int b = Integer.parseInt(scanner.nextLine());

                    switch (b) {

                        case 1:
                        {
                            System.out.println("Podaj imie: ");
                            String name = scanner.nextLine();
                            System.out.println("Podaj nazwisko: ");
                            String lastName=scanner.nextLine();
                            System.out.println("Podaj wiek: ");
                            int age= Integer.parseInt(scanner.nextLine());
                            Person person = new Person(name,lastName,age);
                            add_hash_set(person);
                            System.out.println(person.getFirstName()+" "+person.getLastName()+" "+person.getAge()+" zostal dodany do hashsetu");

                            break;
                        }
                        case 2: {
                            System.out.println("podaj imie osoby jakas chcialbys usunac");

                            if (hashSet.size() >= 1) {
                                String remove_name = scanner.nextLine();
                                for (Person person : hashSet) {
                                    if (person.getFirstName().equals(remove_name)) {
                                        remove_hash_set(person);
                                        System.out.println("element zostal usuniety z kolekcji");
                                        break;
                                    } else {
                                        System.out.println("brak pasucjacego elementu w kolekcij");
                                    }
                                }
                            } else {
                                System.out.println("hash set jest pusty");
                                break;
                            }
                            break;
                        }
                        case 3: {
                            show_Hash_Set();
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

                    int i = Integer.parseInt(scanner.nextLine());

                    switch (i)
                    {
                        case 1:
                        {
                            System.out.println("Podaj imie: ");
                            String name = scanner.nextLine();
                            System.out.println("Podaj nazwisko: ");
                            String lastName=scanner.nextLine();
                            System.out.println("Podaj wiek: ");
                            int age= Integer.parseInt(scanner.nextLine());
                            Person person = new Person(name,lastName,age);
                            add_tree_Set(person);
                            System.out.println(person.getFirstName()+" "+person.getLastName()+" "+person.getAge()+" zostal dodany do TreeSetu");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("podaj osobe jaka chcesz usunac z treeSet");
                            if(treeSet.size()>=1) {
                                String name = scanner.nextLine();
                                for (Person person: treeSet) {
                                    if(person.getFirstName().equals(name))
                                    {
                                        System.out.println(name +" zostal usuniety z kolekcji");
                                        remove_tree_Set(person);
                                    }
                                    else {
                                        System.out.println("nie ma takiego elementu w treeSet");
                                    }

                                }
                            }
                            else {
                                System.out.println("treeSet jest pusty");
                                break;
                            }
                        }
                        case 3: {
                            show_tree_set();
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

