package AdvanceJava;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

//You are a teacher in school In your class there are 10 students, you have decided to give special gifts to those students whose names start with "A".
// you are asked to separate those students with the help of a java program.
//Requirement:
//Use List interface to store the student name
//Use a lambda expression and the Stream API to filter the students
public class Demo3 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    List<String> names = new ArrayList<>();
    for(int i = 0;i < 10;i++){
        //String s = sc.nextLine();
        names.add(sc.nextLine());
    }
    System.out.println(names);
    Predicate<String> predicate = (s) -> s.startsWith("a");
    List<String> specialList = names.stream().filter(predicate).toList();
    System.out.println(specialList);

}

}
