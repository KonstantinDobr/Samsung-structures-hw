package com.samsung.example;

import com.samsung.example.collection.MyArrayList;
import com.samsung.example.collection.MyLinkedList;
import com.samsung.example.domain.Person;

import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
//        Person[] people = new Person[4];
//        people[0] = new Person("Ivan", 12);
//        people[1] = new Person("Ivan1", 13);
//        people[2] = new Person("Ivan2", 1);
//        people[3] = new Person("Ivan3", 19);
//
//
//        int[] array = {5, 7, 10, -1, 0};
//
//        Arrays.sort(people, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//        System.out.println(Arrays.toString(people));

//        MyArrayList<Integer> listInt = new MyArrayList<>();
//        listInt.add(1);
//        listInt.add(5);
//        listInt.add(10);
//        listInt.add(15);
//
//
//        MyArrayList<Person> listPerson = new MyArrayList<>();
//        listPerson.add(new Person("Ivan1", 18));
//        listPerson.add(new Person("Ivan2", 18));
//        listPerson.add(new Person("Ivan3", 18));
//
//        Person remove = listPerson.remove(1);
//        System.out.println(remove);

        MyLinkedList<Person> personMyLinkedList = new MyLinkedList<>();
        personMyLinkedList.add(new Person("Ivan0", 18));
        personMyLinkedList.add(new Person("Ivan1", 19));
        personMyLinkedList.add(new Person("Ivan2", 20));



    }
}
