package AdvanceJava;

//write a program using map() method,to convert a list of strings into uppercase.
// If the given List is:Stream names =Stream.of("aBc","d","ef");


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Stream;



public class Demo2 {
    public static void main(String[] args){
        Stream<String> names = Stream.of("aBc","d","ef");
        Function<String,String> function = (s) ->s.toUpperCase();
        List<String> list =names.map(function).toList();

        System.out.println(list);
    }
}
