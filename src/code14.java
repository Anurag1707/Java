class Student {

        String name;
        int rollNumber;
        double marks;


        Student(String n, int r, double m) {
            name = n;
            rollNumber = r;
            marks = m;
        }


        void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Marks: " + marks);
            System.out.println();
        }
    }

    public class code14 {
        public static void main(String[] args) {

            Student s1 = new Student("Anurag", 68, 85.5);
            Student s2 = new Student("Adarsh", 001, 9.0);
            Student s3 = new Student("Aadi", 103, 78.3);

            s1.displayDetails();
            s2.displayDetails();
            s3.displayDetails();
        }
    }


