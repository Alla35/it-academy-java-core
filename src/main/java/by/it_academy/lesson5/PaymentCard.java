package by.it_academy.lesson5;

public class PaymentCard {

    private static double balance;

    PaymentCard(double balance) {
        this.balance = balance; }

    @Override
    public String toString() {
        return "The card has a balance of X" + balance;
    }

    public static void eatAffordably() {
        if (balance >= 2.6) {
            balance -= 2.6;
        }
    }

    public static void eatHeartily() {
        if (balance >= 4.6) {
            balance -= 4.6;
        }
    }

    public static void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public static void main(String[] args) {

        PaymentCard paymentCard = new PaymentCard(50);
        PaymentCard.eatAffordably();
        PaymentCard.eatHeartily();
        PaymentCard.addMoney(50);
        System.out.println(paymentCard);
    }
}





