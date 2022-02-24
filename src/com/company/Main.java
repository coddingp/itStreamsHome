package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //just to try
        String[] arrayOfStr = {"Alex", "Sam"};
        Stream.of(arrayOfStr).forEach(x -> System.out.println(x));

        //just to try
        Stream.of(1, 2, 3).forEach(x -> System.out.println(x));


        //just to try
        Stream.of(new int[]{1, 2, 3}, new int[]{1, 2, 3}, new int[]{1, 2, 3}).forEach(x -> System.out.println(Arrays.toString(x)));


        //just to try
        Stream.of(new Cats("Myo", 2, 2.2), new Dogs("DOgy", 5, 7.6)).forEach(x -> System.out.println(x));


        //just to try
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
        Student olya = new Student("Olya", 1, 5);
        Student katya = new Student("Katya", 2, 4);
        Student kotya = new Student("Kotya", 3, 3);
        Student kytya = new Student("Kytya", 4, 5);
        Student rita = new Student("Rita", 5, 2);
        Student tasya = new Student("Tasya", 6, 5);
        Student masya = new Student("Masya", 7, 3);
        Student vasya = new Student("Vasya", 8, 4);
        Student kirill = new Student("Kirill", 9, 2);
        Student janybek = new Student("Janybek", 10, 4);
        List<Student> students = new ArrayList<Student>();
        students.add(olya);
        students.add(katya);
        students.add(kotya);
        students.add(kytya);
        students.add(rita);
        students.add(tasya);
        students.add(masya);
        students.add(vasya);
        students.add(kirill);
        students.add(janybek);
        Stream.of(olya, katya, kirill, kytya, tasya, vasya, rita).forEach(x -> System.out.println(x.getName()));


        //Из массива элементов Integer перебросить элементы в List.
        List<Integer> intList = Arrays.stream(nums).collect(Collectors.toList());
        System.out.println("intList" + intList);
        Integer integerArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> integerList3 = Arrays.stream(integerArray).collect(Collectors.toList());
        System.out.println("List #3: " + integerList3);

        Stream.of(intList).peek(x -> {
            for (Integer i : x) {
                if (i % 3 != 0) {
                    i = 0;
                } else i = i * 10;
            }
        }).forEach(x -> System.out.println("Here is the intList through map: " + x));


        //Если число кратно 3 заменить его на 0, иначе умножить на 10 и вывести в стриме
        System.out.println("Changed data in a Stream from intList as follows: ");
        intList.stream().forEach(x -> {
            if (x % 3 == 0) System.out.println(x * 0);
            else System.out.println(x * 10);
        });
        System.out.println("\nChanged intList with map: ");
        Stream<Object> integerList = Stream.of(intList).map(x -> {
            for (int i = 0; i < x.size(); i++) {
                if (x.get(i) % 3 == 0) x.set(i, 0);
                else x.set(i, i * 10);
            }
            return x;
        });
        System.out.println(Arrays.toString(integerList.toArray()));


        //Получить список студентов у которых оценка за экзамен >= 4. Вывести.
        students.stream().forEach(x -> {
            if (x.getMark() > 3) System.out.println(x);
        });


        //Посчитать кол-во студентов которые получили 2 за экзамен.
        AtomicInteger a = new AtomicInteger();
        students.stream().forEach(x -> {
            if (x.getMark() == 2) a.getAndIncrement();
        });
        System.out.println(a + " student(s) got f mark");
    }
}

