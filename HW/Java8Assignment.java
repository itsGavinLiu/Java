import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class Java8Assignment {

//    Assignment 1
//    public static void main(String[] args) {
//        List<Person> l1 = new ArrayList<>();
//        l1.add(new Person("alexa", 20, "male"));
//        l1.add(new Person("bob", 15, "male"));
//        l1.add(new Person("kathy", 23, "female"));
//        l1.add(new Person("tom", 10, "male"));
//        l1.add(new Person("anderson", 18, "male"));
//        l1.add(new Person("andrew", 30, "male"));
//
//        System.out.println(search(l1));
//    }
//    public static List<String> search(List<Person> list){
//        return list.stream()
//                .map(Person::getName)
//                .filter(x -> x.length() == 3)
//                .filter(x -> x.startsWith("a"))
//                .collect(Collectors.toList());
//    }
//}

//    Assignment 2
//    public static void main(String[] args) {
//      List<Integer> l1 = new ArrayList<>();
//      l1.add(3);
//      l1.add(5);
//      l1.add(14);
//      l1.add(88);
//      l1.add(53);
//      System.out.println(getString(l1));
//}

//    public static String getString(List<Integer> list){
//        String str = list.stream()
//                .map(x -> {
//                    if(x % 2 == 0){
//                        return "e" + x + " ";
//                    }else{
//                        return "o" + x + " ";
//                    }
//                })
//                .collect(Collectors.joining());
//        str = str.trim().replace(" ", ",");
//        return str;
//    }


//    Assignment 3
//    public static void main(String[] args) {
//        List<Integer> l1 = new ArrayList<>();
//        l1.add(102);
//        l1.add(85);
//        l1.add(343);
//        l1.add(52);
//
//        System.out.println(average(l1));
//    }
//
//    public static Double average(List<Integer> list){
//        return list.stream()
//                .mapToDouble(x -> x)
//                .average()
//                .getAsDouble();
//    }


//    Assignment 4
//    public static void main(String[] args) {
//        List<String> l1 = new ArrayList<>();
//        l1.add("after");
//        l1.add("noon");
//        l1.add("cool");
//        l1.add("submit");
//
//        System.out.println(upperCase(l1));
//    }
//
//    public static List<String> upperCase(List<String> list) {
//        return list.stream()
//                .map(x -> x.toUpperCase())
//                .collect(Collectors.toList());
//    }

}


// Assignment 1
//class Person{
//    String name;
//    int age;
//    String sex;
//
//    Person(String name, int age, String sex){
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }
//
//    public String getName(){
//        return name;
//    }
//}
