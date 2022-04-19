package lab.pkg10;

import java.io.*;

public class LabTask10_2
{
    public static void main(String[] args)
    {
        try
        {
            FileReader file = new FileReader("somefile.txt");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File reading error");
            e.printStackTrace();
        }
    }
}