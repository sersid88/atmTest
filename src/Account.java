import java.util.ArrayList;

public class Account {

    /** Имя аккаунта*/
    private String name;

    /** ID номер аккаунта*/
    private String uuid;

    /** Объект User, которому принадлежит эта учетная запись*/
    private User holder;

    /** Список транзакций по этому счету*/
    private ArrayList<Transaction> transactions;


    public Account (String name, User holder, Bank theBank) {

        // установка имени аккаунта и держателя
        this.name = name;
        this. holder = holder;

        //получить новый уникальный  номер аккаунта

        this.uuid = theBank. getNewAccountUUID();

        //список транзакций
        this.transactions = new ArrayList<Transaction>();

        //внесение держателя и банка в список

        holder.addAccount(this);
        theBank.addAccount(this);


    }
}
