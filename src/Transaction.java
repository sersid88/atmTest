import java.util.Date;

public class Transaction {

    /** The amount of this transaction*/
    private double amount;

    /** The time and date of this transaction*/
    private Date timestamp;

    /** A memo of this transaction*/
    private  String memo;

    /** The account in which the transaction was performed*/
    private Account inAccount;

}