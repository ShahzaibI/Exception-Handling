package lab.pkg10;

import java.io.*;

public class LabTask10_3
{
    public static void readFile() throws FileNotFoundException
    {
        FileReader file = new FileReader("somefile.txt");
    }
    public static void main(String[] args)
    {
        try
        {
           readFile();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File reading error");
            e.printStackTrace();
        }
    }
}