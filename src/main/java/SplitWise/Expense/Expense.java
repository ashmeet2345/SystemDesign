package SplitWise.Expense;

import SplitWise.Expense.Split.Split;
import SplitWise.User.User;

import java.util.ArrayList;
import java.util.List;

public class Expense {

    String expenseId;
    String description;
    double expenseAmount;
    User paidBy;
    SplitType splitType;
    List<Split> splitDetails=new ArrayList<>();

    Expense(String expenseId, String description, double expenseAmount, User paidBy, SplitType type, List<Split> details){
        this.expenseId=expenseId;
        this.description=description;
        this.expenseAmount=expenseAmount;
        this.paidBy=paidBy;
        this.splitType=type;
        this.splitDetails.addAll(details);
    }

}
