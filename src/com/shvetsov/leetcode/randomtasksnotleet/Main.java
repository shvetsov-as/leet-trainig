package com.shvetsov.leetcode.randomtasksnotleet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        System.out.println("//////////////////////////////TASK_1 Consumer print even numbers/////////////////////////////////");
        System.out.println();

        List<Integer> listInts = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 900, 1000, 2111);

        Consumer<Integer> integerConsumer = arg -> {
          if(Objects.equals((arg % 2), 0)) {
              System.out.println(arg);
          }
        };
        listInts.forEach(integerConsumer);

        System.out.println();
        System.out.println("//////////////////////////////TASK_2 Consumer select strings with digits from one collection and put them in another collection/////////////////////////////////");
        System.out.println();

        List<String> stringList = Arrays.asList("Hello", "Second String", "123 String", "String 12 s", "Main 34", "Main35", "Main35main");
        List<String> listStringsWithNumbers =  new ArrayList<>();

        Consumer<String> stringConsumer = s -> {

            if(s.chars().anyMatch(Character::isDigit)){
                listStringsWithNumbers.add(s);
            }
            System.out.println(s);
        };

        stringList.forEach(stringConsumer);
        System.out.println();
        System.out.println("*** Strings with digits ***");
        listStringsWithNumbers.forEach(System.out::println);

        System.out.println();
        System.out.println("//////////////////////////////TASK_3 BiConsumer write data in the end of file/////////////////////////////////");
        System.out.println();

        String delimiter = File.separator;
        File filepath = new File("resources" + delimiter + "text.txt");
        String s = "new string";

        BiConsumer<String, File> biConsumer = (str, path) -> {
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
                writer.append("\n");
                writer.append(str);
                writer.append(" ");
                writer.append(String.valueOf(new java.util.Date(System.currentTimeMillis())));
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        biConsumer.accept(s, filepath);

        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            while (reader.ready()){
                System.out.println(reader.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
