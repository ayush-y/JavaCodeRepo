package org.JavaProblems;

class StudentToString {
    String name;
    int age;
    int rollNumber;

    @Override
    public String toString() {
        return "StudentToString{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNumber=" + rollNumber +
                '}';
    }

    public StudentToString(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    public static void main(String[] args) {
        StudentToString student1 = new StudentToString("Ayush", 23, 12);
        System.out.println(student1.toString());
    }
}
