
package oops;

public class lacture1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 21;
        s1.name = "Ram";
        s1.marks = 45.4f;

        System.out.println(s1.rollNo + " " + s1.name + " " + s1.marks);
    }
}

class Student {
    int rollNo;
    String name;
    float marks=80.5f;
}