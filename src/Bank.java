import java.util.ArrayList;

public class Bank {

    private String name;

    private ArrayList<User> users;

    private ArrayList<Account> accounts;

    public String getNewUserUUID () {

    }

    public String getNewAccountUUID () {

    }

    public void addAccount (Account anAcct) {
        this.accounts.add(anAcct);
    }

}
