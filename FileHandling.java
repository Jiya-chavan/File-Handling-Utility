import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {

        //CREATE FILE
         File obj = new File("myfile.txt");
         if (obj.createNewFile()) {
            System.out.println("File created successfully");
        } else {
            System.out.println("File already exists");
        }


        //WRITE TO FILE
        FileWriter writer = new FileWriter(obj,true);
        writer.write("This is a Java File Handling program.\n");
        writer.write("It demonstrates read, write and modify operations.\n");
        writer.close();
        System.out.println("Data written to file");


        // READ FROM FILE
        Scanner reader = new Scanner(obj);

        while (reader.hasNextLine()) {
            String data = reader.nextLine();
            System.out.println(data);
        }

        reader.close();



        //MODIFY FILE (APPEND DATA)
        FileWriter appendWriter = new FileWriter(obj, true);
        appendWriter.write("This line is added later (file modified).\n");
        appendWriter.close();
        System.out.println("\nFile modified successfully");
    }
}
