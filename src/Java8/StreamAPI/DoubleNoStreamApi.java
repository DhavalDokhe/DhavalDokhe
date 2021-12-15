package Java8.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
//double the number using stream
public class DoubleNoStreamApi {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,4,6,5,7,8);

        Function<Integer,Integer> function1=f->f*2;

        Stream<Integer> list1=list.stream()
                .map(function1);

        list1.forEach(System.out::println);




        List<String > list2=Arrays.asList("java","is","programming ","language");

        Function<String ,String> function=s -> s.toUpperCase();
        list2.stream()
                .map(function);
        list2.forEach(System.out::println);
    }

}
