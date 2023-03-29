package be.intecbrussel;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainProgWriter {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Choose a program to generate:");
            System.out.println("1. Program that prints the current date and time.\n2. Program that calculates the sum of two numbers.\n3. Program that implements a simple shopping basket.");
            System.out.print("Enter your choice (1-3): ");

            int choice = scanner.nextInt();

            String className = "GeneratedProgram";
            String fileName = className + ".java";

            try (FileWriter writer = new FileWriter(fileName)) {

                writer.write("import java.util.HashMap;\n");
                writer.write("import java.util.Map;\n\n");
                writer.write("public class " + className + " {\n");

                if (choice == 1) {
                    writer.write("public static void main(String[] args) {\n");
                    writer.write("System.out.println(\"Current date and time: \" + new java.util.Date());\n");
                    writer.write("}\n");
                } else if (choice == 2) {
                    writer.write("public static void main(String[] args) {\n");
                    writer.write("int a = 10;\n");
                    writer.write("int b = 20;\n");
                    writer.write("int sum = a + b;\n");
                    writer.write("System.out.println(\"The sum of \" + a + \" and \" + b + \" is \" + sum);\n");
                    writer.write("}\n");
                } else if (choice == 3) {
                    writer.write("public static void main(String[] args) {\n");
                    writer.write("Map<String, Double> basket = new HashMap<>();\n");
                    writer.write("basket.put(\"apple\", 0.5);\n");
                    writer.write("basket.put(\"banana\", 0.3);\n");
                    writer.write("basket.put(\"orange\", 0.7);\n");
                    writer.write("double total = 0;\n");
                    writer.write("for (Map.Entry<String, Double> entry : basket.entrySet()) {\n");
                    writer.write("String item = entry.getKey();\n");
                    writer.write("double price = entry.getValue();\n");
                    writer.write("System.out.println(item + \" - \" + price);\n");
                    writer.write("total += price;\n");
                    writer.write("}\n");
                    writer.write("System.out.println(\"Total: \" + total);\n");
                    writer.write("}\n");
                } else {
                    System.out.println("Invalid choice.");
                    return;
                }

                writer.write("}\n");

                System.out.println("Generated program written to " + fileName);

            } catch (IOException e) {
                System.out.println("An error occurred while writing the file.");
                e.printStackTrace();
            }

        }

}