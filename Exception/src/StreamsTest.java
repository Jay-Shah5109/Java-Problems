//import java.io.*;
import java.util.*;
class StreamsTest{
  public static void main(String args[]){

    List<Integer> values = Arrays.asList(1,2,3,2,6,3,1);

    for(int i: values){
      System.out.println(i);
    }

      System.out.println("Using forEach loop now...");

      values.forEach(i->System.out.println(i));
  }
}
