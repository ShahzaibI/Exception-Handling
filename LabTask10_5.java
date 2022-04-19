package lab.pkg10;
import java.util.*;
class NegativeNumberException extends Exception
{
    @Override
    public String toString()
    {
        return "Wrong input please enter again, negative value not accepted";
    }
}
public class LabTask10_5
{
    public static void main(String[] args)
    {
        int MonthlySalary;
        double daily_wage;
        boolean x=true;
        Scanner in = new Scanner(System.in);
        while(x)
        {
            try
            {
                System.out.print("Enter monthly salary of employee: ");
                MonthlySalary = in.nextInt();
                if(MonthlySalary<0)
                {
                    throw new NegativeNumberException();
                }
                daily_wage = (double)MonthlySalary/30;
                System.out.println("Daily wage of employee is: "+daily_wage);
                x=false;
            }
            catch(InputMismatchException e)
            {
                System.out.println(e + ", Wrong input please enter again");
                in.nextLine(); // clears the buffer
            }
            catch(NegativeNumberException e)
            {
                System.out.println(e.toString());
            }
        }
    } 
}