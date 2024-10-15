import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {

    public static void main(String[] args) {
        
    //stream API -collection process
    //collection /group of objects 
    //1 blank
   Stream<Object>emptyStream= Stream.empty();
   emptyStream.forEach(e->{
    System.out.println(e);
   });

   //2-way
   String names[]={"Durgesh","Uttam","Ankit","Divay"};
  
   Stream<String>stream1=Stream.of(names);

  stream1.forEach(e->{
System.out.println(e);
  });

  //
Stream<Object>streambuielder=Stream.builder().build();

  //3-way
  IntStream stream=Arrays.stream(new int[]{3,5,6,2,34,5});
  // stream.forEach(e->{
  //   System.out.println(e);
  //     });

  stream.forEach(System.out::println);


      //5 way list important

List<Integer>list2=new ArrayList<>();
list2.add(12);
list2.add(18);
list2.add(13);
list2.add(19);
list2.add(16);


Stream<Integer>stream2=list2.stream();


stream2.forEach(e->{
  System.out.println(e);
    });




}}
      
  
   
   

