package kr.ac.kookmin.exception.fileio;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 Makes numbered.txt the same as original.txt, but with each line numbered.
*/
public class AddLineNumber
{
   public static void main(String[] args)
   {
       String path = AddLineNumber.class.getResource("").getPath();
       System.out.println(path);

      try
      {
         BufferedReader inputStream = 
               new BufferedReader(new FileReader(path+"original.txt"));
         PrintWriter outputStream = 
               new PrintWriter(new FileOutputStream(path+"numbered.txt"));

          /**
           구현하시오. 
          **/
         inputStream.close( );
         outputStream.close( );
      }
      catch(IOException e)
      {
    	  
      }
      /** catch() 구문 작성하시오 **/

   }
}
