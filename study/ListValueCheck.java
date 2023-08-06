import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class ListValueCheck {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 20));
        people.add(new Person("David", 35));
        people.add(new Person("Emily", 28));



        /**
         * mapToObj : 기본 데이터 타입을 객체 타입으로 변환
         *
         *         int[] numbers = {1, 2, 3, 4, 5};
         *
         *         Stream<Integer> integerStream = Arrays.stream(numbers)
         *                 .mapToObj(Integer::valueOf);
         *
         *         integerStream.forEach(System.out::println);
         */



        /**
         * reduce : 스트림의 요소를 하나로 줄이는 연산을 수행하는 최종 연산이다.
         * 즉, reduce는 스트림의 모든 요소를 순회하면서, 누적 작업의 결과를 얻는 메서드이다.
         *
         *       Integer total2 = people.stream()
         *                 .map(Person::getAge)
         *                 .reduce(1, (total, age) -> total * age);
         *
         *         System.out.println(total2);
         */

        /**
         * min
         *
        Person person = people.stream()
                .min((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .orElse(null);

        System.out.println(person);
        */

        /**
         * findFirst() : 첫 번째 요소 반환
         * findAny() : 아무 요소 반환
         *
        Person person = people.stream()
                .findFirst()
                .orElse(null);

        System.out.println(person);
        */

        /**
         * anyMatch / allMatch / noneMatch
         *
        boolean match = people.stream()
                .anyMatch(person -> person.getAge() >=90);
        System.out.println(match);

         */



        /**
         * 
         * Predicate = argument를 전달받아 boolean을 반환하는 함수형 인터페이스
         */



        /**
         * .collect(Collectors.joining()
         *

        String collect = people.stream()
                .map(Person::getName)
                .collect(Collectors.joining(","));

        System.out.println(collect);
         */

        /**
         * skip()
         *
        List<String> names = people.stream()
                .map(Person::getName)
                .skip(2)
                .collect(Collectors.toList());

        System.out.println(names);
         */


        /**
         * limit (int maxSize)
         *
        List<String> collect = people.stream()
                .map(Person::getName)
                .limit(3)
                .collect(Collectors.toList());


        System.out.println(collect);
         */


        /**
         * sorted()
         *
        List<Integer> numbers = List.of(3, 1, 4, 2, 5);

        List<Integer> sortedNumber = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedNumber.toString());
         */

        /**
         * distinct()
         *
        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 3, 5);

        List<Integer> distinctedNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctedNumbers.toString());
         */

        /**
         * .map() : 각 요소를 다른 값으로 변환
         *
        List<String> names = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println(names);
         */

        /**
         * .filter()
         *
        List<Person> filteredPeople = people.stream()
                .filter(person -> person.getAge() >= 30)
                .collect(Collectors.toList());

        System.out.println(filteredPeople.toString());
         */


        /**
         * Stream
         *
         * 특징 1 : 데이터 소스 - 스트림은 배열, 컬렉션 등의 데이터 소스에서 생성된다.
         * 특징 2 : 연속적인 요소 - 스트림은 연속적인 요소들의 묶
         * 특징 2 : 람다식 사용
         * 특징 3 : 지연연산 - 최종연산이 수행될 때만 중간연산이 수행됨
         * 특징 4 : 멀티스레딩 - 스트림은 내부적으로 멀티스레드를 사용하여 병렬처리가 가능
         * 특징 5 : 스트림 생성 -> 중간 연산 -> 최종 연산
         * 특징 6 : 스트림은 iterable 인터페이스를 구현하는 데이터 소스를 스트림으로 변환이 가능하다. // 컬렉션 , 배열, 파일, 문자열, 무한 스트림,
         *
         * 중간연산
         *  1. filter : 주어진 조건에 맞는 요소만 필터링
         *  2. map : 각 요소를 다른 값으로 변환
         *  3. flatmap : 각 요소를 스트림으로 변환, 이를 펼쳐서 새로운 스트림을 생성
         *  4. distinct : 중복된 요소를 제거
         *  5. sorted : 요소들을 기본 정렬된 순서에 따라서 정렬
         *  6. limit : 스트림의 일부분만 추출
         *  7. skip : 스트림의 첫 요소부터 n개 건너뜀
         *
         * 최종 연산
         *  1. foreach() : 각 요소에 대해 주어진 동작 수행
         *  2. collect() : 스트림을 컬렉션으로 반환
         *  3. count() : 스트림 요소의 개수 카운팅
         *  4. anyMatch() : 주어진 조건을 만족하는 요소가 있는지 확인
         *  5. allMatch() : 모든 요소가 조건을 만족하는지 확인
         *  6. noneMatch() : 모든 요소가 조건을 만족하지 않는지 확인
         *  7. findFirst() : 첫 번째 요소 반환
         *  8. findAny : 아무 요소나 반환
         *  9. min : 주어진 Comparator에 따라 최소 요소 반환
         *  10. max : 주어진 Comparator에 따라 최대 요소 반환
         *  11. reduce : 요소들을 하나로 줄여서 합계 or 최대값 등 계
         *
         *  => 중간연산은 여러개 적용이 가능하며, 최종연산 호출 전에는 중간연산들이 지연된다.
         *
         *
         *
         * list.stream()
         *      .filter(str -> startsWith("a")
         *      .collect(Collectors.toList());
         *
         * .collect() : 스트림의 최종연산. 스트림의 요소들을 Collection으로 변환하는 역할
         * Collectors.toList() : 스트림의 요소들을 List로 수집하는 역할

        /**
         * 예시 1
         * List<String> list = new ArrayList<>(Arrays.asList("Hello", "hi"));
         *         long count = list.stream()
         *                 .filter(str -> "Hello".equals(str))
         *                 .count();
         *         System.out.println(count);
         */

        /**
         * 예시 2
         *         List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange", "Mango"));
         *
         *         // 스트림을 사용하여 과일 이름을 출력
         *         list.stream().forEach(str -> System.out.println(str));
         *
         *         // 중간 연산을 사용하여 'A'로 시작하는 과일만 필터링
         *         List<String> filteredList = list.stream()
         *                 .filter(str -> str.startsWith("A"))
         *                 .collect(Collectors.toList());
         *
         *         // 최종 연산을 사용하여 필터링된 과일의 개수를 반환
         *         long count = filteredList.stream().count();
         *         System.out.println(count);
         */


        /**
         * Iterator
         *
         * 내용: 자바에서 Iterator는 컬렉션을 순회하고, 요소에 접근하기 위한 인터페이스
         * 메서드 1. boolean hasNext()
         * 메서드 2. E next()
         * 메서드 3. void remove()
         *
        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple");

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.equals("apple")) {
                iterator.remove();
            }
            System.out.println(fruit);
        }
        System.out.println(fruits);
        */


        /**
         * indexOf
         *
        List<String> list = new ArrayList<>(Arrays.asList("Hello", "Jinwoo"));

        int hello = list.indexOf("Hello");
        System.out.println(hello);
        if (hello >= 0) System.out.println("Hello는 List에 포함된 문자입니다.");

        int bye = list.indexOf("bye");
        System.out.println(bye);
        if (bye < 0) System.out.println("bye는 Listdp 포함된 문자가 아닙니다.");
         */




        /**
         * equals 메서드 정의 1. https://hianna.tistory.com/510
         *
        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "TV"));
        list.add(new Product(2, "Computer"));

        // id=2, name=Car 포함 여부 체크
        boolean carContains = list.contains(new Product(1, "Car"));
        // id=3, name="Computer" 포함 여부 체크
        boolean computerContains = list.contains(new Product(3, "Computer"));

        System.out.println(carContains);
        System.out.println(computerContains);
         */
    }
}
