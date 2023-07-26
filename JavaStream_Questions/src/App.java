import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Set;
import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> numbers = Arrays.asList(1,2,4,2,6,7,4,5,9,8,3,5,5);
        
        // Q1
        System.out.println("Q1. Print sum of all numbers");
        // Method 1
        int sum1 = numbers.stream().reduce((a,b) -> a+b).get();
        System.out.println("Method 1: "+sum1);
        // Method 2
        int sum2 = numbers.stream().collect(Collectors.summingInt(e -> e));
        System.out.println("Method 2: "+sum2);

        System.out.println("-----------------------------");

        // Q2
        System.out.println("Q2. Print average of all numbers");
        double avg1 = numbers.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println("method 1: "+avg1);

        double avg2 = numbers.stream().collect(Collectors.averagingDouble(e->e));
        System.out.println("method 2: "+avg2);

        System.out.println("-----------------------------");

        // Q3
        System.out.println("Q3. square, filter and average of squares greater than 400");
        List<Integer> toSquare = List.of(2, 20, 30, 10, 50);
        List<Integer> sq = toSquare.stream().map(e->e*e).filter(e->e>400).
                collect(Collectors.toList());
                System.out.println(sq);
        double avg = toSquare.stream().map(e -> e*e).filter(e -> e>400).
                mapToInt(e -> e).average().getAsDouble();
                System.out.println(avg);

        System.out.println("-----------------------------");

        // Q4
        System.out.println("Q4. Print even and odd numbers using streams");
        List<Integer> even = numbers.stream().
                filter(e -> e%2 == 0).collect(Collectors.toList());
                System.out.println("Even numbers : "+even);
        List<Integer> odd = numbers.stream().
                filter(e -> e%2 != 0).collect(Collectors.toList());
                System.out.println("Odd numbers : "+odd);

        System.out.println("-----------------------------");

        // Q5
        System.out.println("Q5. Print numbers starting with prefix 2 and -2");
        List<Integer> num = Arrays.asList(2,22, 233, 500, 4, 21, 56, 45, -2);
        // List<Integer> res = num.stream().filter(e -> String.valueOf(e).
        //     startsWith("2")).collect(Collectors.toList());

        List<Integer> res = num.stream().map(e -> String.valueOf(e)).
            filter(e-> e.startsWith("2") || 
            e.startsWith("-2")).map(Integer::valueOf).
            collect(Collectors.toList());
        System.out.println(res);

        System.out.println("-----------------------------");

        // Q6
        System.out.println("Q6. Print duplicates");
        Set<Integer> dup = numbers.stream().
            filter(e -> Collections.frequency(numbers, e)>1).
                collect(Collectors.toSet());
        System.out.println("method 1: "+dup);

        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicates = numbers.stream().
            filter(e -> !unique.add(e)).
                collect(Collectors.toSet());
        System.out.println("method 2: "+duplicates);

        System.out.println("-----------------------------");

        //Q7
        System.out.println("Q7. Find max and min using streams");
        // method 1
        int max1 = numbers.stream().
            max(Comparator.comparingInt(e->e)).get();
        int min1 = numbers.stream().
            min(Comparator.comparingInt(e->e)).get();
            System.out.println("method 1: \nmax = "+max1+" min = "+min1);

        int max2 = numbers.stream().
            max(Comparator.comparing(Integer::valueOf)).get();
        int min2 = numbers.stream()
            .min(Comparator.comparing(Integer::valueOf)).get();
            System.out.println("method 2: \nmax = "+max2+" min = "+min2);

        int max3 = numbers.stream().
            max((e1,e2) -> e1-e2).get();
        int min3 = numbers.stream()
            .min((e1,e2)-> e1-e2).get();
            System.out.println("method 3: \nmax = "+max3+" min = "+min3);
        
        System.out.println("-----------------------------");

        //Q8
        System.out.println("Q8. Sort numbers asc and desc using streams");
        List<Integer> asc = numbers.stream().sorted().
            collect(Collectors.toList());
        System.out.println("in ascending : "+asc);
        List<Integer> desc = numbers.stream().
            sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("in descending : "+desc);

        // List<Integer> ascending = numbers.stream().
        //     sorted(Comparator.comparingInt(e->e)).
        //         collect(Collectors.toList());
        // System.out.println("method 2: \nin ascending" + ascending);
        // List<Integer> descending = numbers.stream().
        //     sorted(Comparator.comparingInt(e->e).reversed()).
        //         collect(Collectors.toList());
        // System.out.println("in descending "+descending);
        // NOte : .reversed() not working for int while descending

        System.out.println("-----------------------------");

        // Q9
        System.out.println("Q9. get/ignore first five numbers in stream using limit and skip");
        List<Integer> numberList = List.of(1,2,0,4,9,6,7,8,5,3);
        // get first five
        List<Integer> getFirstFive = numberList.stream().
            limit(5).collect(Collectors.toList());
        System.out.println("first five : "+getFirstFive);
        // ignore first five
        List<Integer> ignoreFirstFive = numberList.stream().
            skip(5).collect(Collectors.toList());
        System.out.println("skip first five : "+ignoreFirstFive);

        System.out.println("-----------------------------");

        // Q10
        System.out.println("Q10. Get second Highest/Lowest number using streams");
        int secHighest = numberList.stream().sorted().skip(1).
            findFirst().get();
        System.out.println("second highest : " + secHighest);
        int secLowest = numberList.stream().
            sorted(Collections.reverseOrder()).skip(1).
                findFirst().get();
        System.out.println("second lowest : "+secLowest);

        System.out.println("-----------------------------");

        // Q11
        System.out.println("Q11. print 1 to 10 without using loop");
        System.out.println("Method 1: ");
        IntStream.range(1,11).
            forEach(e-> System.out.print(e+ " "));
        System.out.println("\nMethod 2: ");
        IntStream.rangeClosed(1,10).
            forEach(e->System.out.print(e + " "));
        System.out.println();

        System.out.println("-----------------------------");

        // Q12
        System.out.println("Q12. Print frequency of each element");
        Map<Integer, Long> freq = numbers.stream().collect(
            Collectors.groupingBy(Function.identity(),
                Collectors.counting()));
        System.out.println(freq);
        for(Map.Entry<Integer,Long> fr : freq.entrySet()) {
            System.out.println(fr.getKey() + " -> " + fr.getValue());
        }
    }
}
