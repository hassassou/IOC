package metier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PresntationV2 {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassName = scanner.nextLine();
            System.out.println(daoClassName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
