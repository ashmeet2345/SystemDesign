package SplitWise.Expense;

import SplitWise.Expense.Split.EqualExpenseSplit;
import SplitWise.Expense.Split.ExpenseSplit;
import SplitWise.Expense.Split.PercentageSplit;
import SplitWise.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {

    public static ExpenseSplit getSplitFactoryObject(SplitType type){
        switch(type){
            case EQUAL -> {
                return new EqualExpenseSplit();
            }
            case UNEQUAL -> {
                return new UnequalExpenseSplit();
            }
            case PERCENTAGE -> {
                return new PercentageSplit();
            }
            default ->{
                return null;
            }
        }
    }
}
