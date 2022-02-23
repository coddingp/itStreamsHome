package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String[] arrayOfStr = {"Alex", "Sam"};
        Stream.of(arrayOfStr).forEach(x -> System.out.println(x));
        Stream.of(1, 2, 3).forEach(x -> System.out.println(x));
        Stream.of(new int[]{1, 2, 3}, new int[]{1, 2, 3}, new int[]{1, 2, 3}).forEach(x -> System.out.println(Arrays.toString(x)));


        Stream.of(new Cats("Myo", 2, 2.2), new Dogs("DOgy", 5, 7.6)).forEach(x -> System.out.println(x));


        Stream.of("Streams", "are", "cool").forEach(x -> System.out.println(x));


        //Создать массив из чисел. Вывести в стриме каждый элемент в квадрате (a*a).
        Integer[] nums = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stream.of(nums).forEach(x -> System.out.println(x * x));


        //Создать список строчных элементов. Вывести элементы заменив в строке букву «а»  на  «о»
        String[] lines = new String[]{"a", "ab", "abc", "abcd"};
        Stream.of(lines).forEach(x -> System.out.println(x.replace('a', 'o')));

        // work with Integers
        List list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        list.stream().map(x -> x = x + "2").forEach(x -> System.out.println(x));


        // work with Strings
        List listOfLines = new ArrayList<String>();
        listOfLines.add("A");
        listOfLines.add("B");
        listOfLines.add("C");
        listOfLines.add("D");
        listOfLines.add("E");
        listOfLines.add("F");
        listOfLines.add("G");
        listOfLines.add("H");
        listOfLines.add("I");
        listOfLines.add("J");

        listOfLines.stream().map(x -> x + "A").forEach(x -> System.out.println(x));


        //От каждого элемента стрима нужно получить 10%
        Double[] nums10Persent = new Double[]{10.0, 20.0, 30.0, 40.0, 50.0, 600.0, 700.0, 800.0, 9000.0};
        Stream.of(nums10Persent).map(x -> x = (x * 0.1)).forEach(x -> System.out.println(x.intValue()));

        //Каждую строку в списке задублировать (ОляОля, ЮляЮля)
        listOfLines.stream().map(x -> x + "" + x).forEach(x -> System.out.println(x));


        //Создать класс Student (ID, FIO). Получить в стриме список фамилий.
        Student olya = new Student("Olya",1);
        Student katya = new Student("Katya",2);
        Student kotya = new Student("Kotya",3);
        Student kytya = new Student("Kytya",4);
        Student rita = new Student("Rita",5);
        Student tasya = new Student("Tasya",6);
        Student masya = new Student("Masya",7);
        Student vasya = new Student("Vasya",8);
        Student kirill = new Student("Kirill",9);
        Student janybek = new Student("Janybek",10);

//        List students = new ArrayList<Student>();
//        students.add(olya);
//        students.add(katya);
//        students.add(kotya);
//        students.add(kytya);
//        students.add(rita);
//        students.add(tasya);
//        students.add(masya);
//        students.add(vasya);
//        students.add(kirill);
//        students.add(janybek);


        Stream.of(olya, katya, kirill, kytya, tasya, vasya, rita).forEach(x -> System.out.println(x.getName()));



    }
}

