public class Student {
    String name;
    int age;
    float CGPA;
    Student(String name, int age, float CGPA) {
        this.name = name;
        this.age = age;
        this.CGPA = CGPA;
    }

    public String toString() {
        return "Name: " + name + ", age: " + age + ", CGPA: " + CGPA;
    }
}
