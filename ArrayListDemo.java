import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
//   public static void arrayListInts () {
//     ArrayList<Integer> list = new ArrayList<Integer>();

//     list.add(1);
//     list.add(2);
//     list.add(3);
//     list.add(4);
//     list.add(5);
//     list.add(6);
//     list.add(7);
//     list.add(8);

//     list.add(2, 11);

//     for (int e: list) {
//         System.out.println(e);
//     }
//   }
  public static void main (String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    Scanner keyboard = new Scanner(System.in);

    boolean isRunning = true;

    while (isRunning == true) {
      System.out.println("(a): Add a String");
      System.out.println("(r): Remove an element by index");
      System.out.println("(q): Quit");

      System.out.print("Enter option letter: ");
      String optionString = keyboard.next();

      switch (optionString) {
        case "a" :
          System.out.print("Enter item to be added to array list: ");
          String arrayItem = keyboard.next();
          list.add(arrayItem);
          break;
        case "r" :
          System.out.print("Enter index to remove: ");
          int indexToRemove = keyboard.nextInt();

          if (indexToRemove > (list.size() - 1) || indexToRemove < (0)) {
            System.out.println("Index does not exist.");
          }
          else {
            list.remove(indexToRemove);
          }
          break;
        case "q" :
          isRunning = false;
          break;
      }
    
      for (int i = 0; i < list.size(); i++) {
        System.out.print(list.get(i));
        if (i != (list.size() - 1)) {
          System.out.print(", ");
        }
      }
      System.out.println("");
    }
    keyboard.close();
  }
}
