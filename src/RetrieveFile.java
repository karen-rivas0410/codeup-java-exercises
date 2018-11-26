import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Arrays;

public class RetrieveFile {
    public static void main(String[] args) {
        Path list = Paths.get("src/shapes/Test.txt");
        List<String> stuff = Arrays.asList();

//        try {  //this creates a file
//            Files.createFile(list);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        if (!Files.exists(list)) { //if not there this will create it
            try {
                Files.createFile(list);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        try {  //this reads the file
            stuff = Files.readAllLines(list);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(stuff);

        List<String> moreStuff = new Arraylist<>();
        moreStuff.add("Dog");
        moreStuff.add("Seahorse");
        moreStuff.add("whatever");


        try {
            Files.write(list,moreStuff, StandardOpenOption.APPEND);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

