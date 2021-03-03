package fileoperations;
/*
 * Java Program To Append Text To An Existing File 
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppendTextToTheFielInJava {

	public static void main(String[] args) 
    {       
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        PrintWriter printWriter = null;
         
        try
        {
            //Opening a file in append mode using FileWriter
            fileWriter = new FileWriter("C:\\Users\\momedara\\Documents\\sample.txt", true);
            //Wrapping FileWriter object in BufferedWriter
            bufferedWriter = new BufferedWriter(fileWriter);
            //Wrapping BufferedWriter object in PrintWriter
            printWriter = new PrintWriter(bufferedWriter);
            printWriter.println("-------------------");
            printWriter.println();
            printWriter.println("Chittoor");
            printWriter.println("Kanipakam");
            printWriter.println("517124");
            System.out.println("Done");
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                printWriter.close();
                bufferedWriter.close();
                fileWriter.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }   
}