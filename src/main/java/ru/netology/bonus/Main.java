package ru.netology.bonus;

public class Main {
    public void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        boolean passed = expected == actual;

        System.out.println(passed);

    }
}
