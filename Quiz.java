import java.util.*;
import java.io.*;
public class Quiz
{
  public static void main(String[] args)
  {       
     Questions();
  }
  public static void Questions()
  {
    Scanner console = new Scanner(System.in);
    String[][] Ques = new String[20][]; 
    for (int i = 0; i < 20; i++)
    {
        if (i == 0 || i % 2 == 0)
        {
            Ques[i] = new String[1];
        }
        else
        {
            Ques[i] = new String[3];
        }
    }
    String[] Ans = new String[10];                
                       
    Ques[0][0] = "First person landed on the moon?";                       
    Ques[1][0] = "A) Kobe Bryant";
    Ques[1][1] = "B) Neil Armstrong";
    Ques[1][2] = "C) Eli Cologne";
    Ans[0] = "B";
   
    Ques[2][0] = "What is the brightest star?";
    Ques[3][0] = "A) Sirius A";
    Ques[3][1] = "B) Arcturus";
    Ques[3][2] = "C) Rigil Kent";
    Ans[1] = "A";
    
    Ques[4][0] = "Color of the hottest star.";
    Ques[5][0] = "A) Yellow";
    Ques[5][1] = "B) Blue";
    Ques[5][2] = "C) Red";
    Ans[2] = "B";
    
    Ques[6][0] = "The only planet that can sustain life.";
    Ques[7][0] = "A) Uranus";
    Ques[7][1] = "B) Jupiter";
    Ques[7][2] = "C) Earth";
    Ans[3] = "C";
    
    Ques[8][0] = "Planet closest to the sun.";
    Ques[9][0] = "A) Mercury";
    Ques[9][1] = "B) Saturn";
    Ques[9][2] = "C) Pluto";
    Ans[4] = "A";
    
    Ques[10][0] = "Known as Red Planet.";
    Ques[11][0] = "A) Neptune";
    Ques[11][1] = "B) Mars";
    Ques[11][2] = "C) Venus";
    Ans[5] = "B";
    
    Ques[12][0] = "Which planet has the most moons?";
    Ques[13][0] = "A) Saturn";
    Ques[13][1] = "B) Mercury";
    Ques[13][2] = "C) Earth";
    Ans[6] = "A";
    
    Ques[14][0] = "Constellation known as Big Dipper.";
    Ques[15][0] = "A) Ursa Major";
    Ques[15][1] = "B) Ursa Minor";
    Ques[15][2] = "C) Canis Minor";
    Ans[7] = "A";
    
    Ques[16][0] = "Zodiacal symbol for the constellation Leo.";
    Ques[17][0] = "A) Fish";
    Ques[17][1] = "B) Tiger";
    Ques[17][2] = "C) Lion";
    Ans[8] = "C";
    
    Ques[18][0] = "How many light-years across is the Milky Way?";
    Ques[19][0] = "A) 10,000";
    Ques[19][1] = "B) 100,000";
    Ques[19][2] = "C) 1,000";
    Ans[9] = "B";
   
   int a  = 0;
   int correctCount = 0;
    int counter = 0;
        for (int i = 0; i < Ques.length; i++)
    {
        for (int j = 0; j < Ques[i].length; j++)
        {
           System.out.print(Ques[i][j] + "\n");
           if (j >= 2)
           {
               counter = TakeQuiz(Ans, a, counter);
               a++;
             }                                                                                                      
        }                                                   
    }
       System.out.println("Total Correct Answers: " + counter);
       System.out.println("Total Wrong Answers: "+(10-counter));
         
         }
  public static int TakeQuiz(String[] Ans, int a, int correctCount)
  {
      Scanner console = new Scanner(System.in);
      String response = console.nextLine();
      response = response.toUpperCase();
      while (!response.equals("A") && !response.equals("B") && !response.equals("C"))
      {
          System.out.println("Input not appropriate. Please Enter a valid response: ");
          response = console.nextLine();
      }
      if (response.equals(Ans[a]))
      {
          correctCount++;
          System.out.println("Correct!");
          System.out.println();         
      }
      else
      {
          System.out.println("Incorrect, the correct answer is: " + Ans[a]);
          System.out.println();
      }
      return correctCount; 
  } 
}

