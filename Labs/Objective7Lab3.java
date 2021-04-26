public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 1;
    do {
      System.out.println(counter);
      counter = counter + 1;
    } while(counter <= 20); {
      System.out.println(counter);
      counter = counter + 1;

      if(counter % 2 == 0) {
        System.out.println(counter + " is even");
      }
      else if(counter % 2 != 0 ) {
        System.out.println(counter + " is odd");
      }
    }
  }
}
