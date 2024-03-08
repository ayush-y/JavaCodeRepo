import java.util.Comparator;
import java.util.PriorityQueue;

class StudentPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getGrade() - t1.getGrade();
            }
        });
        queue.offer(new Student("Ayush", 'A'));
        queue.offer(new Student("Krish", 'D'));
        queue.offer(new Student("Dinesh", 'A'));
        queue.offer(new Student("Yash", 'B'));
        queue.offer(new Student("Ram", 'C'));

        System.out.printf("queue is %s ",queue);
        System.out.println();
        System.out.printf("Got %s ", queue.poll());
        System.out.printf("Got %s ", queue.poll());
        System.out.printf("Got %s ", queue.poll());
        System.out.printf("Got %s ", queue.poll());
        System.out.printf("Got %s ", queue.poll());
    }
    static class Student{
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + " : " + grade;
        }
    }
}
