public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.studentId = "CIIT/SP26-BAI-019/LHR";
        s1.name = "Faryal Sarfraz";
        s1.completedCredits = 12;

        s2.studentId = "CIIT/SP26-BAI-024/LHR";
        s2.name = "Hania Tanveer";
        s2.completedCredits = 15;

        s3.studentId = "CIIT/SP26-BAI-045/LHR";
        s3.name = "Sharmeen Imtiaz";
        s3.completedCredits = 9;

        System.out.println("--- Before change ---");
        System.out.println(s1.studentId + " " + s1.name + " " + s1.completedCredits);
        System.out.println(s2.studentId + " " + s2.name + " " + s2.completedCredits);
        System.out.println(s3.studentId + " " + s3.name + " " + s3.completedCredits);

        s2.completedCredits = s2.completedCredits + 3;

        // s1 and s3 did not change because each object has its own copy of the fields.
        // s2.completedCredits only modified the object that s2 refers to.
        System.out.println("--- After change (only s2) ---");
        System.out.println(s1.studentId + " " + s1.name + " " + s1.completedCredits);
        System.out.println(s2.studentId + " " + s2.name + " " + s2.completedCredits);
        System.out.println(s3.studentId + " " + s3.name + " " + s3.completedCredits);
    }
}
