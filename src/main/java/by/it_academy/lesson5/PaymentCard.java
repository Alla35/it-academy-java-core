package by.it_academy.lesson5;

public class PaymentCard {

    private double balance;

    PaymentCard(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        PaymentCard paymentCard = new PaymentCard(50);
        paymentCard.eatAffordably();
        paymentCard.eatHeartily();
        paymentCard.addMoney(50);
        System.out.println(paymentCard);
    }

    public void eatAffordably() {
        if (balance >= 2.6) {
            balance -= 2.6;
        }
    }

    public void eatHeartily() {
        if (balance >= 4.6) {
            balance -= 4.6;
        }
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public String toString() {
        return "The card has a balance of " + balance;
    }

}





