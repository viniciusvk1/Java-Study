package files.ex5.application;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("\nFOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("\nFILES: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean sucess = new File(strPath + "\\createTest").mkdir();
        System.out.println("Directory created sucessfully: " + sucess);

        sc.close();
    }
}
