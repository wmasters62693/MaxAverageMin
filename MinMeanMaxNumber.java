import java.util.Scanner;
 public class MinMeanMaxNumber
 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        String CarryOn = "yes";
        int number = 0;
        int MaxNum = 0;
        int MinNum = 1000001;
        int TotalNum = 0;
        int NumOfNum = 0;
       
        do {
            System.out.println("please enter a number between 1000000 and -1000000");
            
            number = input.nextInt();
            if (number > MaxNum)
            {
                MaxNum = number;
            } 
            else if (number< MinNum)
            {
                MinNum = number;
            }
            TotalNum += number;
            NumOfNum += 1;
            
            System.out.println("Do you want to continue adding numbers? ");
            input.nextLine();    // Not sure why this is needed but found that it is  online
            CarryOn = input.nextLine();
           } while(CarryOn.equals("yes"));
       
            
        System.out.println("The smallest number was " + (MinNum) + ". The average of all the numbers was " + TotalNum / NumOfNum + ". And the biggest numebr was " + MaxNum);
    } 
        
        
 }
    
