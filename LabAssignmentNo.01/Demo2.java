public class Demo2 {
    public static void main(String[] args) {
        Student first = new Student();
        first.studentId = "CIIT/SP26-BAI-019/LHR";
        first.name = "Faryal Sarfraz";
        first.completedCredits = 12;

        Student second = new Student();
        second.studentId = "CIIT/SP26-BAI-024/LHR";
        second.name = "Hania Tanveer";
        second.completedCredits = 15;

        System.out.println(first.summary());
        System.out.println(second.summary());

        first.addCredits(3);
        second.addCredits(6);

        System.out.println(first.summary());
        System.out.println(second.summary());

        System.out.println("Remaining (first): " + first.remainingCredits(130));
        System.out.println("Remaining (second): " + second.remainingCredits(130));
    }
}
