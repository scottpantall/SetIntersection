/**
 *
 * @author Scott Pantall
 */
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        Path file = Paths.get(args[0]);
        BufferedReader buffer = Files.newBufferedReader(file);
        String line;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            //System.out.println(line);
            intersectionWithLists(line);
            //intersectionWithStreams(line);
            
        }
    }
    
    public static void intersectionWithLists(String line) {
        String[] lists = line.split(";"); //lists[0] = "1,2,3,4" lists[1] = "4,5,6"
  
        //Turning the lists[] strings into arrays then into lists.
        List<String> firstList = Arrays.asList(lists[0].split(","));
        List<String> secondList = Arrays.asList(lists[1].split(","));
    }
}
