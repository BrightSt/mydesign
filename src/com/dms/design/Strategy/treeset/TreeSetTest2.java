package com.dms.design.Strategy.treeset;

import java.util.*;

/**
 * c策略模式在JDK中的应用。
 */
public class TreeSetTest2 {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<Person>(new MyComparator());
        Person p1 = new Person(1,"11");
        Person p2 = new Person(2,"22");
        Person p3 = new Person(3,"33");

        set.add(p1);
        set.add(p2);
        set.add(p3);

        for (Iterator<Person> itr=set.iterator();itr.hasNext();){
            System.out.println(itr.next().getName());
        }
    }
}

class Person{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class MyComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getId()-o2.getId();
    }
}
