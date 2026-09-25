class AI {
    String experimentName;
    int completedEpochs;
    int targetEpochs;

    // Changes state
    void runEpochs(int epochs) {
        completedEpochs = completedEpochs + epochs;
    }

    // Overload: signature runEpochs(int, int)
    void runEpochs(int epochs, int bonusEpochs) {
        int totalEpochs = epochs + bonusEpochs;   // local variable
        completedEpochs = completedEpochs + totalEpochs;
    }

    // Only computes and returns information
    int remainingEpochs() {
        return targetEpochs - completedEpochs;
    }

    String status() {
        return experimentName + ": " + completedEpochs + "/" + targetEpochs
                + " epochs done, " + remainingEpochs() + " remaining";
    }
}
