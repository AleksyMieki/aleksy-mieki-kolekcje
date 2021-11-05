package com.company;

import java.util.*;
import java.util.List;
import java.util.Set;


public interface Collections {
    String Menu =
            "Jaka operacje chcesz wykonac?\n" +
                    "1.Dodawanie\n" +
                    "2.usuwanie elementow\n" +
                    "3.wypisanie wszystkich elementow kolekcji";

    Set<Person> hashSet = new HashSet<>();
    Set<Person> treeSet = new TreeSet<>(new SetActions.Tree_SetComparator());

    List<Person> arrayList = new ArrayList<>();
    List<Person> linkedList = new LinkedList<>();

    Map<Integer,Person> hashMap= new HashMap<>();
    Map<Integer,Person> treeMap= new TreeMap<>();

    static class Tree_SetComparator implements Comparator<Person>
    {
        @Override
        public int compare(Person o1, Person o2) {
            return 0;
        }
    }




}
