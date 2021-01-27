public class TrainingParameter {

/*
  public static final int numberOfEpochs = 100;   // 1000, 10000, 100000
  public static final double learningRate = 0.5;  // 0.1
  public static final ActivationFunction activationFunction = ActivationFunction.SIGMOID;
  public static final double faultTolerance = 0.1;
  public static final double[][] inputs = LogicalAndData.inputs;
  public static final double[][] targets = LogicalAndData.targets;
  public static final double[][] weightsOfHiddenLayer = null;
  public static final double[][] weightsOfOutputLayer = null;
  public static final boolean isBiasBackPropagationDesired = true;
*/

  public static final int numberOfEpochs = 1;
  public static final double learningRate = 0.5;
  public static final ActivationFunction activationFunction = ActivationFunction.SIGMOID;
  public static final double faultTolerance = 0.1;
  public static final double[][] inputs = VeryShortData.inputs;
  public static final double[][] targets = VeryShortData.targets;
  public static final double[][] weightsOfHiddenLayer = VeryShortData.weightsOfHiddenLayer;
  public static final double[][] weightsOfOutputLayer = VeryShortData.weightsOfOutputLayer;
  public static final boolean isBiasBackPropagationDesired = false;

}
