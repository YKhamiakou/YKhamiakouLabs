package com.khamiakou;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * Task 3. Runner for class cone. Works with file.
 */
import java.util.Scanner;

public class Runner {
    private static final String FILE_NAME = "file.out";

    /**
     * Main method
     * 
     * @param args
     *            - main arguments
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void main(final String[] args) throws IOException, ClassNotFoundException {
        // declare scanner
        final Scanner scan = new Scanner(System.in);
        System.out.println("Enter information about a cone.");
        System.out.print("Hight: ");
        final int hight = scan.nextInt();
        System.out.print("Base radius: ");
        final int radius = scan.nextInt();
        // closing scanner
        scan.close();
        // declare cone
        final Cone coneWrited = new Cone(hight, radius);

        // working with file. writing
        final FileOutputStream fos = new FileOutputStream(Runner.FILE_NAME);
        final ObjectOutputStream oos = new ObjectOutputStream(fos);
        // serializing
        oos.writeObject(coneWrited);
        oos.flush();
        oos.close();

        // working with file. reading
        final FileInputStream fis = new FileInputStream(Runner.FILE_NAME);
        final ObjectInputStream ois = new ObjectInputStream(fis);
        final Cone coneReaded = (Cone) ois.readObject();
        ois.close();
        System.out.println(coneReaded.toString());

    }

}
