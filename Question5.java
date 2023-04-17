import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    
    int number = in.nextInt();

    int[] numbers = new int[number];
    
    for (int i = 0; i < number; i ++) {
      numbers[i] = in.nextInt();
    }

    int [] f = new int[number];
    for (int i = 0; i < number; i ++) {
      for (int j = 0; j < number; j ++) {
        if (numbers[i] == numbers[j]) {
          f[i] += 1;
        }
      }
    }

    int highest = -1;
    for (int i = 0; i < number; i ++) {
      if (highest == -1 || f[i] > f[highest]) {
        highest = i;
      }
    }

    System.out.println(numbers[highest]);
    
  }
}
