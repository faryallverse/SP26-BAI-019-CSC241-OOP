public class OverLoad {

    // Signature: enroll(String)
    void enroll(String courseCode) {
        System.out.println("Enrolled in " + courseCode);
    }

    // Signature: enroll(String, int)
    void enroll(String courseCode, int section) {
        System.out.println("Enrolled in " + courseCode + ", section " + section);
    }

    // Signature: enroll(int)
    void enroll(int numericCourseCode) {
        System.out.println("Enrolled in numeric course " + numericCourseCode);
    }

    // INVALID overload (differs only by return type).
    // Uncomment, compile, save the error to compiler_notes.txt, then comment it out again.
    // int enroll(String courseCode) {
    //     return 1;
    // }

    public static void main(String[] args) {
        OverLoad demo = new OverLoad();

        // Valid calls
        demo.enroll("CSC241");
        demo.enroll("CSC241", 2);
        demo.enroll(241);

        // Invalid calls: uncomment ONE at a time, compile, note the error, comment out again
        // demo.enroll();
        // demo.enroll("241", "2");
    }
}
