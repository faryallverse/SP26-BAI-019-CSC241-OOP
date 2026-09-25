class Student {
    String studentId;
    String name;
    int completedCredits;

    // Changes the state of the object it is called on
    void addCredits(int credits) {
        completedCredits = completedCredits + credits;
    }

    // 'degreeCredits' is a parameter, 'remaining' is a local variable
    int remainingCredits(int degreeCredits) {
        int remaining = degreeCredits - completedCredits;
        return remaining;
    }

    // Returns one readable line
    String summary() {
        return studentId + " | " + name + " | " + completedCredits + " credits";
    }
}
