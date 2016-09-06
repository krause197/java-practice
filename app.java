import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    // Two Arguments Test
    String hello = "Hello!";
    Integer userInt = 5;
    twoArgs(hello, userInt);

    // Three Integer Test
    Integer aA = 2;
    Integer bB = 5;
    Integer cC = 8;
    treeInt(aA, bB, cC);
  }

  public static void twoArgs (String userString, int userInt ) {
    for (int i = 0; i < userInt; i++) {
      System.out.println(userString);
    }
  }
  public static void treeInt (int aA, int bB, int cC) {
    Integer[] numBers = {aA, bB, cC};
    for (int i=0; i< numBers.length; i++) {
      System.out.println(numBers[i]);
    }
  }


}
