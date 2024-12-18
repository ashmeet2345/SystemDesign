package AdapterDesignPattern.Client;

import AdapterDesignPattern.Adaptee.WeightMachine;
import AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String[] args) {
        WeightMachine weightMachine=new WeightMachineForBabies();
        WeightMachineAdapterImpl weight=new WeightMachineAdapterImpl(weightMachine);
        System.out.println(weight.getWeightInKgs());
    }
}
