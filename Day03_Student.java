
class Day03_Student {

    int id;
    String name;
    String course;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("----------------");
    }

    public static void main(String[] args) {

        Day03_Student s1 = new Day03_Student();
        s1.id = 1;
        s1.name = "Aarti";
        s1.course = "CSBS";

        Day03_Student s2 = new Day03_Student();
        s2.id = 2;
        s2.name = "Rahul";
        s2.course = "CSE";

        Day03_Student s3 = new Day03_Student();
        s3.id = 3;
        s3.name = "Sneha";
        s3.course = "AIML";

        Day03_Student[] students = {s1, s2, s3};

        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}
