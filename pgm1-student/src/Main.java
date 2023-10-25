// package pgm_1_student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudHashMap shm = new StudHashMap();
        String USN;
        float updatedCGPA;
        System.out.print("Enter no. of students: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            shm.readData();
        }

        shm.printALl();

        shm.printCGPAGreaterThan9();

        shm.printAgeLessThan21();

        System.out.println("Enter USN to search: ");
        USN = sc.next();
        shm.printDetails(USN.toLowerCase());


        System.out.println("Enter whose updatedCGPA to update");
        USN = sc.next();
        System.out.println("Enter updated updatedCGPA");
        updatedCGPA = Float.parseFloat(sc.next());

        shm.updateCGPA(USN.toLowerCase(), updatedCGPA);

        shm.printALl();

        System.out.println("Enter usn to delete");
        USN = sc.next();
        shm.removeUSN(USN.toLowerCase());

        shm.printALl();

    }
}
