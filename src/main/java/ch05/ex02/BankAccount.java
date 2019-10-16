package ch05.ex02;

import java.util.LinkedList;

public class BankAccount {
    private long number; // 口座番号
    private long balance; // 現在の残高 (単位は，セント)
    private Action lastAct; // 最後に行われた処理
    private History history = new History(); // 履歴

    BankAccount(final long number) {
        this.number = number;
    }

    public class Action {
        private String act;
        private long amount;
        Action(String act, long amount) {
            this.act = act;
            this.amount = amount;
        }
        public String toString() {
            // identify our enclosing account
            return number + ": " + act + " " + amount;
        }
    }

    public static class History {
        private static int MAX_INDEX = 9;
        private int currentIndex = 0;
        private LinkedList<Action> history = new LinkedList<>();

        public void add(final Action action) {
            if (history.size() > 10) {
                history.removeLast();
            }
            history.addFirst(action);
        }

        public Action next() {
            if (currentIndex == history.size()) {
                return null;
            }
            final Action returnAction = history.get(currentIndex);
            currentIndex++;
            return returnAction;
        }

        public void initNext() {
            currentIndex = 0;
        }
    }

    public History history() {
        return this.history;
    }

    public void deposit(long amount) {
        balance += amount;
        lastAct = new Action("deposit", amount);
        history.add(lastAct);
    }

    public void withdraw(long amount) {
        balance -= amount;
        lastAct = new Action("withdraw", amount);
        history.add(lastAct);
    }
}
