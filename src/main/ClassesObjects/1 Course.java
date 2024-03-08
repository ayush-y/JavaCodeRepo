class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollment;
    String name;
    String[] enrolledStudents;
    Course(String courseName){
        this.courseName = courseName;
        enrollment = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int capacity){
        Course.maxCapacity = capacity;
    }
    void setEnrolledStudents(String studentName){
        enrolledStudents[enrollment] = studentName;
        enrollment++;
    }
    void unenrollStudent(String studentName){
        System.out.println("Student remove ");
        enrollment--;
    }

}
