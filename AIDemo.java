public class AIDemo {

    // Helper method: receives a copy of the reference value
    void addHelperEpochs(AI experiment) {
        experiment.completedEpochs = experiment.completedEpochs + 5;
    }

    public static void main(String[] args) {
        AIDemo demo = new AIDemo();

        AI cnn = new AI();
        cnn.experimentName = "CNN Image Classifier";
        cnn.completedEpochs = 0;
        cnn.targetEpochs = 50;

        AI lstm = new AI();
        lstm.experimentName = "LSTM Text Model";
        lstm.completedEpochs = 10;
        lstm.targetEpochs = 30;

        System.out.println(" Initial state ");
        System.out.println(cnn.status());
        System.out.println(lstm.status());

        cnn.runEpochs(10);
        cnn.runEpochs(5, 2);

        System.out.println(" After running only cnn ");
        System.out.println(cnn.status());
        System.out.println(lstm.status());
        System.out.println("cnn remaining: " + cnn.remainingEpochs());
        System.out.println("lstm remaining: " + lstm.remainingEpochs());

        System.out.println(" Pass-by-value mutation ");
        System.out.println("Before helper: " + lstm.completedEpochs);
        demo.addHelperEpochs(lstm);
        System.out.println("After helper: " + lstm.completedEpochs);
    }
}