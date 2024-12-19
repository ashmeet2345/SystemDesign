package SplitWise.Expense.Split;

import SplitWise.User.User;

public class Split {

    User user;
    double amount;
    int percentage;

    Split(User user, double amount, int percentage){
        this.user=user;
        this.amount=amount;
        this.percentage=percentage;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}
