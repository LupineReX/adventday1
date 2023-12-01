import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text file
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        int sum =0;
        try {
            File myObj = new File("C:\\Users\\Administrator\\Documents\\Saved Work\\adventday1\\src\\thing.txt");

            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                try {
                    String data = myReader.nextLine();
                    System.out.println(data);

                    Matcher matcher = Pattern.compile("[0-9]+").matcher(data);

                    // Find the first integer
                    if (matcher.find()) {
                        int firstInt = Integer.valueOf(matcher.group());
                        System.out.println("First Integer: " + firstInt);
                    }

                    // Find the last integer
                    int lastInt = 0;
                    while (matcher.find()) {
                        lastInt = Integer.valueOf(matcher.group());
                    }
                    System.out.println("Last Integer: " + lastInt);
                } catch (Exception e) {
                    e.printStackTrace(); // Handle the exception according to your requirements
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
