/**
 * @version 3.0 / 08.10.2020
 * @author  Dr. Albrecht Ehlert
 */

public class MachineLearningMain {

  public static void main(String[] args) {

    FeedForwardNetwork neuronalNetwork = new FeedForwardNetwork(NetworkParameter.numberOfInputSignals,
                                                                NetworkParameter.numberOfNeuronsInHiddenLayer,
                                                                NetworkParameter.numberOfNeuronsInOutputLayer);

    DisplayMachineLearning.showWeights(neuronalNetwork.getWeightsOfHiddenLayer(), neuronalNetwork.getWeightsOfOutputLayer());
    neuronalNetwork.testAllInputsAndShowResults();

    neuronalNetwork.trainWithSupervisedLearning();

    DisplayMachineLearning.showWeights(neuronalNetwork.getWeightsOfHiddenLayer(), neuronalNetwork.getWeightsOfOutputLayer());
    neuronalNetwork.testAllInputsAndShowResults();

  }

}


//DisplayMachineLearning.showWeights(neuronalNetwork.getWeightsOfHiddenLayer(), neuronalNetwork.getWeightsOfOutputLayer());
//DisplayMachineLearning.show(TrainingParameter.inputs, TrainingParameter.desiredOutputs);

//DisplayMachineLearning.showInput( TrainingParameter.newInput);
//DisplayMachineLearning.showDesiredOutput(TrainingParameter.newDesiredOutput);
//neuronalNetwork.calculateOutput( TrainingParameter.newInput, ActivationFunction.HEAVISIDE);
//DisplayMachineLearning.showResults(neuronalNetwork.getLastResults());
