class Student {
    String name;
    static String college_name;

    public static void changeCollegeName() {
        college_name = "FIEM";
    }
}

public class Static {
    public static void main(String[] args) {
        // can be accessed directly from the class name
        Student.college_name = "Techno India SalkLake";

        // // The below statement throws an error :- Cannot make a static reference to
        // the non-static field Student.name
        // Student.name = "Arif Ali";

        Student s1 = new Student();
        s1.name = "Arif Ali";
        // System.out.println(Student.college_name);
        System.out.println(s1.college_name);
        Student.changeCollegeName();
        // s1.changeCollegeName();
        System.out.println(s1.college_name);

    }
}
