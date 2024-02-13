import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        PlainInterface plainInterface = new PlainInterface() {
//            @Override
//            public String action(int x, int y) {
//                return String.valueOf(x + y);
//            }
//        };

//        PlainInterface plainInterface = (x, y) -> (x + y);
//
//        PlainInterface plainInterface1 = Integer::compare;
//        System.out.println(plainInterface.action(5,3));
//        System.out.println(plainInterface1.action(1,5));

     List<User> list = new ArrayList<>(Arrays.asList(new User("Павел", 25), new User("Ирина", 36), new User("Григорий", 55)));
     list.stream().map(user -> new User(user.name, user.age - 5)).filter(user -> user.age <= 25).forEach(System.out::println);
//        list = list.stream().filter(str -> str.length() > 4).collect(Collectors.toList());
//        for(String item : list){
//            System.out.println(item);
////        }
//        list.stream().filter(str -> str.length() > 4).filter(str -> str.contains("и")).forEach(System.out::println);
//
//        Arrays.asList(1,2,3,4,5,6).stream().map(chislo -> "число "+ chislo + "квадрат числа " + chislo * chislo).forEach(System.out::println);
//        Arrays.asList(1,5,16,5,44,81,6).stream().sorted().forEach(System.out::println);
//        Arrays.asList(1,5,16,5,44,81,6).stream().sorted().distinct().forEach(System.out::println);

  }
}