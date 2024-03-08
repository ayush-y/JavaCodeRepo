package PackagesPrctice.FileHandlingPractice37;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter file you wish to read");
        String text = sc.nextLine();
        try(FileReader reader = new FileReader(text)){
            int read = 0;
            while((read = reader.read()) != -1 ){
                System.out.print((char) read);
            }

        }catch(FileNotFoundException exception){
            System.out.printf("File is not found fileName %s ", text);
        }
        catch (IOException exp){
            System.out.printf("Exception occurred %s",
                    exp.getMessage());
        }
    }
}
