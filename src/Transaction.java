import java.util.Date;

public class Transaction {

    /** Сумма этой сделки*/
    private double amount;

    /** Время и дата этой транзакции*/
    private Date timestamp;

    /** Памятка об этой транзакции*/
    private  String memo;

    /** Счет, на котором была совершена транзакция*/
    private Account inAccount;

}
