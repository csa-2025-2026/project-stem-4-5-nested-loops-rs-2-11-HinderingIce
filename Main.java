import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    
  }

  public static void printNTimes(String word, int N)
  {
    for(int i = 0; i < word.length(); i++)
    {
      String current = word.substring(i, i + 1);
      for(int e = 1; e <= N; e++)
      {
         System.out.print(current);
      }
    }
  }

  public static void printNums()
  {
    for(int i = 10; i >= 1; i--)
    {
      for(int j = 1; j <= i; j++)
      {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    for(int i = 1; i <= N; i++)
    {
      for(int e = 1; e <= i; e++)
      {
        System.out.print(e + " ");
      }
      System.out.println();
    }
  }

  public static void starTree(int N)
  {
    for(int i = 1; i <= N; i++)
    {
      for(int a = 1; a <= i; a++)
        {
          System.out.print(" ");
        }

      for(int e = N - i; e >= 0; e--)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void multTable()
  {
    for(int i = 1;i <= 10; i++)
    {
      for(int e = 1;e <= 10; e++)
      {
          System.out.print(i * e + " ");
      }
      System.out.println();
    }
  }
}
