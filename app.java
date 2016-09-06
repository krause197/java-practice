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

    // two int two String
    Integer dD = 6;
    Integer eE = 9;
    String goodbye = "Goodbye";
    String world = "World";
    twoBytwo(dD, eE, goodbye, world);

    // Prime Check
    Integer userNum = Integer.parseInt(console.readLine("What is your number?"));
    boolean isPrime = false;


    primeCheck(isPrime, userNum);
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

  public static void twoBytwo (int dD, int eE, String goodbye, String world) {
    List<Object> twoBytwoList = new ArrayList<Object>();
    twoBytwoList.add(dD);
    twoBytwoList.add(eE);
    twoBytwoList.add(goodbye);
    twoBytwoList.add(world);

    System.out.println("Contents: " + twoBytwoList);
  }

  public static void primeCheck (boolean isPrime, int userNum) {
    for (int i=2; i<userNum; i++) {
      if(userNum%i==0) {
        isPrime = false;
      }
      isPrime = true;
    }

    if (isPrime) {
      System.out.println("It's Prime");
    } else {
      System.out.println("It's not Prime");
    }
  }
}
