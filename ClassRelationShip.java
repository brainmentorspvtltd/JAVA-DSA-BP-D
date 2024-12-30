import java.util.*;

public class ClassRelationShip {
    public static void main(String[] args) {
        Bank sbi = new Bank();
        Account account = new Account();
        Branch branch = new Branch(account);
        // sbi = null;
    }
}

class Bank {
    List<Branch> branches = new ArrayList<>();
}

class Branch {
    Branch(Account account) {

    }
}

class Account {

}

class SavingAccount extends Account {

}

class CurrentAccount extends Account {

}