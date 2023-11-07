// package pgm_1_student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudHashMap {
    HashMap<String, Student> hm = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    void readData() {
        String name, USN;
        float CGPA;
        int age;

        System.out.println("Enter student's usn");
        USN = sc.nextLine().toLowerCase();

        System.out.println("Enter student name");
        name = sc.nextLine();

        System.out.println("Enter age: ");
        age = Integer.parseInt(sc.nextLine());

        System.out.println("Enter CGPA");
        CGPA = Float.parseFloat(sc.nextLine());

        Student st = new Student(name, age, CGPA);

        hm.put(USN, st);
        NewLine();
    }

    private void NewLine() {
        System.out.println();
    }

    private boolean USNExistsOrNot(String USN) {
        return hm.containsKey(USN);
    }
    void printALl() {
        System.out.println("Details of every student");
        for (Map.Entry<String, Student> me : hm.entrySet()) {
            System.out.println("USN: "+ me.getKey().toUpperCase() + " " + me.getValue());
        }
        NewLine();
    }

    void printDetails(String USN) {
        if (USNExistsOrNot(USN)) {
            Student st = hm.get(USN);
            System.out.println("Student Details\nUSN: " + USN.toUpperCase() + " " + st);
        }
        else {
            System.out.println("Invalid USN");
        }
        NewLine();
    }

    void updateCGPA(String USN, float updatedCGPA) {
        if (USNExistsOrNot(USN)) {
            // Student st = hm.get(USN);
            // st.CGPA = updatedCGPA;
             hm.get(USN).CGPA = updatedCGPA;
            System.out.println("Updated CGPA of student");
        }
        else {
            System.out.println("Invalid USN");
        }
        NewLine();
    }

    void printCGPAGreaterThan9() {
        System.out.println("Students having CGPA > 9");
        for (Map.Entry<String, Student> me : hm.entrySet()) {
            Student st = me.getValue();
            if (st.CGPA > 9)
                System.out.println(st);
        }
        NewLine();
    }

    void printAgeLessThan21() {
        System.out.println("Students with age < 21");
        for (Map.Entry<String, Student> me : hm.entrySet()) {
            Student st = me.getValue();
            if (st.age < 21)
                System.out.println(st);
        }
        NewLine();
    }

    void removeUSN(String USN) {
        if (USNExistsOrNot(USN)) {
            hm.remove(USN);
            System.out.println("USN: " + USN.toUpperCase() + " is deleted successfully");
        }
        else {
            System.out.println("USN not found");
        }
        NewLine();
    }


}
