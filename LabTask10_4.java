package lab.pkg10;
import java.util.*;
class ArrayOfBoundException extends Exception
{
    @Override
    public String toString()
    {
        return "Cannot enter value greater then 100";
    }
}
public class LabTask10_4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> Array_1= new ArrayList();
        ArrayList<Integer> Array_2= new ArrayList();
        int input,index, check=0;
        int sum_Array_1=0;
        int sum_Array_2=0;
        System.out.print("How many values you want to enter : ");
        index = in.nextInt();
        System.out.println("Enter "+ index + " values please enter value less then 100.");
        for(int i=0;i<index;i++)
        {
            try
            {
                input = in.nextInt();
                if(input>100)
                {
                    throw new ArrayOfBoundException();
                }
                else
                {
                    if(input%2==0)
                    {
                        Array_1.add(input);
                    }
                    else
                    {
                        Array_2.add(input);
                    }
                }
            }
            catch(ArrayOfBoundException e)
            {
                System.out.println(e.toString());
                check = 1;
                break;
            }
        }
        if(check==1)
        {
            System.out.println("Program terminated");
        }
        else
        {
            for(int i=0;i<Array_1.size();i++)
            {
                sum_Array_1 = sum_Array_1 + Array_1.get(i);
            }
            for(int i=0;i<Array_2.size();i++)
            {
                sum_Array_2 = sum_Array_2 + Array_2.get(i);
            }
            System.out.println("Total value in Array_1: " + sum_Array_1);
            System.out.println("Total value in Array_2: " + sum_Array_2);
        }
    }   
}