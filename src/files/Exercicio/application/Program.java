package files.Exercicio.application;

import files.Exercicio.entities.Product;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        // C:\Users\vinic\OneDrive\Documentos\testFolder\input.csv

        System.out.print("Enter file path: ");
        String sourceFileStr = sc.nextLine();
        File sourceFile = new File(sourceFileStr);

        String sourceFolderStr = sourceFile.getParent();
        System.out.println(sourceFolderStr);

        boolean success = new File(sourceFolderStr + "\\out").mkdir();
        System.out.println("Folder created: " + success);

        String targetFileStr = sourceFolderStr + "\\out\\sumary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            String itemCsv = br.readLine();
            while (itemCsv != null) {
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCsv = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

                for (Product item : list) {
                    bw.write(item.getName() + ", " + String.format("%.2f", item.total()));
                    bw.newLine();
                }

                System.out.println(targetFileStr + "Created!");

            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }


        sc.close();
    }
}
