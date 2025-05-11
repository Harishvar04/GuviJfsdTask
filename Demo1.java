package AdvanceJava;

//Write a program to check whether the Strings in the List are empty or not and print the list having non-empty strings.
// If the given List is: Liststrings = Arrays.asList("abc", "", "be", "efg", "abcd","", "jkl");

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Locale.filter;

public class Demo1 {
    public static void main(String[] args){
        List<String> list = Arrays.asList("abc", "", "be", "efg", "abcd", "", "jkl");

        Predicate<String> predicate =(s) -> !s.isEmpty();

        //  using for each loop passing the input to the predicate.And storing nonEmptyString in the new arrayList.

//        List<String> nonEmptyString = new ArrayList<>();
//        for(String l:list){
//           if( predicate.test(l)){
//               nonEmptyString.add(l);
//           }
//        }
        // iterating string in the input list and filtering through the predicate.
        List<String> nonEmptyString =list.stream().filter(predicate).toList();

        System.out.println(nonEmptyString);
    }
}
