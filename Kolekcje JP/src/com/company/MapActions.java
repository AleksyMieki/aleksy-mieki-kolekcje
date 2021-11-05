package com.company;

import java.util.Scanner;

public class MapActions implements Collections {
     String Map_Menu =
            "Wybierz redzaj mapy jakiej chcesz uzyc\n"+
                    "1.Hashmap\n" +
                    "2.Treemap";
    public void addHashMapElement(Integer key, Person person)
    {
        hashMap.put(key,person);
    }
    public  void addTreeMapElement(Integer key, Person person)
    {
        treeMap.put(key,person);
    }
    public void removeHashMapElement(Integer key)
    {
        hashMap.remove(key);
    }
    public  void removeTreeMapElement(Integer key)
    {
        treeMap.remove(key);
    }

    public  void displayHashMap()
    {
        for(Person person : hashMap.values())
        {
            System.out.println(person.getFirstName()+" "+person.getLastName()+" "+person.getAge());
        }
    }
    public void displayTreeMap()
    {
        for(Person person : treeMap.values())
        {
            System.out.println(person.getFirstName()+" "+person.getLastName()+" "+person.getAge());
        }
    }
    Scanner scanner = new Scanner(System.in);

    public void actions_map() {

        System.out.println(Map_Menu);
        int b= scanner.nextInt();
        switch(b)
        {
            case 1:
            {
                System.out.println(Menu);
                int a= scanner.nextInt();

                switch(a)
                {

                    case 1:
                    {
                        System.out.println("Podaj imie: ");
                        String name = scanner.nextLine();//musialem zrobic to w taki sposob, nie wiedziec czemu funkcja scanner nie dziala mi poprawnie
                        String cos = scanner.nextLine();

                        System.out.println("Podaj nazwisko: ");
                        String lastName=scanner.nextLine();
                        System.out.println("Podaj wiek: ");
                        int age=scanner.nextInt();
                        System.out.println("Podaj klucz(LICZBA): ");
                        Integer keys=scanner.nextInt();
                        Person person = new Person(cos,lastName,age);
                        addHashMapElement(keys,person);
                        System.out.println(person.getFirstName()+" "+person.getLastName()+" "+person.getAge()+" zostal dodany do HashMapy");
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Podaj klucz(LICZBA): ");
                        if(hashMap.size()>=1)
                        {
                            try{
                                int key= Integer.parseInt(scanner.nextLine());
                                removeHashMapElement(key);
                                System.out.println("Element o kluczu "+key+" zostal usunięty z HashMapy");
                                break;
                            }catch(Exception e){
                                System.out.println("nie ma takiego elementu w hashmapie");
                            }
                        }
                        else {
                            System.out.println("hashmap jest pusty");
                            break;
                        }
                        break;
                    }
                    case 3:
                    {
                        displayHashMap();
                        break;
                    }
                }
                break;
            }
            case 2:
            {
                System.out.println(Menu);
                int k = scanner.nextInt();

                switch(k)
                {

                    case 1:
                    {
                        System.out.println("Podaj imie: ");
                        String name = scanner.nextLine();
                        String cos = scanner.nextLine();
                        System.out.println("Podaj nazwisko: ");
                        String lastName=scanner.nextLine();
                        System.out.println("Podaj wiek: ");
                        int age = scanner.nextInt();
                        System.out.println("Podaj klucz(LICZBA): ");
                        Integer keys=scanner.nextInt();
                        Person person = new Person(cos,lastName,age);
                        addTreeMapElement(keys,person);
                        System.out.println(person.getFirstName()+" "+person.getLastName()+" "+person.getAge()+" zostal dodany do TreeMapy");
                        break;
                    }
                    case 2:
                    {

                        System.out.println("Podaj klucz(LICZBA): ");
                        if(treeMap.size()>=1)
                        {
                            try{
                                int key= Integer.parseInt(scanner.nextLine());
                                removeTreeMapElement(key);
                                System.out.println("Element o kluczu "+key+" zostal usunięty z TreeMapy");
                                break;
                            }catch(Exception e){
                                System.out.println("brak takiego elementu w treemap");
                            }
                        }
                        else {
                            System.out.println("treemap jest pusty");
                            break;
                        }
                        break;
                    }
                    case 3:
                    {
                        displayTreeMap();
                        break;
                    }
                }
                break;
            }

        }
    }
}
