package week9.main;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Printer {
    
    private File file;

    public Printer (String fileName) throws Exception{
        this.file = new File(fileName);
        
    }

    public void printLinesWhichContain(String word){
        try{
        Scanner reader = new Scanner (this.file);

        while (reader.hasNext()){
            String line = reader.nextLine();
            if (line.contains(word)){
                System.err.println (line);
            }
            else{
                
            }
            System.err.println (reader.nextLine());
        }
    }
    catch (FileNotFoundException e){
        System.out.println ("We couldn't find the file");
    }
}
}
