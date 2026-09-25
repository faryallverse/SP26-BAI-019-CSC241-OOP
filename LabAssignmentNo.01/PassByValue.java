public class PassByValue {

    // Experiment A: Primitive
    void changeNumber(int x) {
        System.out.println("Inside method (before): x = " + x);
        x = 99;
        System.out.println("Inside method (after): x = " + x);
    }

    // Experiment B: Mutate the object through the copied reference
    void changeStudent(Student st) {
        System.out.println("Inside method (before): completedCredits = " + st.completedCredits);
        st.completedCredits = 99;
        System.out.println("Inside method (after): completedCredits = " + st.completedCredits);
    }

    // Experiment C: Reassign the parameter
    void replaceStudent(Student st) {
        System.out.println("Inside method (before): name = " + st.name);
        st = new Student();
        st.name = "Temporary";
        System.out.println("Inside method (after): name = " + st.name);
    }

    public static void main(String[] args) {
        PassByValue demo = new PassByValue();

        // A
        int number = 10;
        System.out.println("=== Experiment A ===");
        System.out.println("Before: number = " + number);
        demo.changeNumber(number);
        System.out.println("After: number = " + number);

        // B
        Student student = new Student();
        student.name = "Faryal Sarfraz";
        student.completedCredits = 12;
        System.out.println("=== Experiment B ===");
        System.out.println("Before: completedCredits = " + student.completedCredits);
        demo.changeStudent(student);
        System.out.println("After: completedCredits = " + student.completedCredits);

        // C
        System.out.println("=== Experiment C ===");
        System.out.println("Before: name = " + student.name);
        demo.replaceStudent(student);
        System.out.println("After: name = " + student.name);
    }
}
