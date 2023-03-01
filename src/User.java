import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class User {

    /** Имя пользователя*/
    private String firstName;

    /** Фамилия пользователя*/
    private String lastName;

    /** Идентификационный номер пользователя*/
    private String uuid;

    /** MD5 хэшированный пин-код*/
    private byte pinHash [];

    /** Список аккаунтов этого пользователя*/
    private ArrayList <Account> accounts;


    /** Конструктор класса user*/
    public User (String firstName, String lastName, String pin, Bank theBank) {
        /** Установить имя пользователя*/
        this.firstName = firstName;
        this.lastName = lastName;

        /** хэширование пин-кода*/

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            this.pinHash = md.digest(pin.getBytes());
        } catch (NoSuchAlgorithmException e) {
            System.err.println(" error, caught NoSuchAlgorithmException");
            e.printStackTrace();
            System.exit(1);
        }

        /** Создание уникального универсального АйДи для пользователя*/
        this.uuid = theBank.getNewUserUUID();

        /** Создание пустого списка аккаунтов*/
        this.accounts = new ArrayList<Account>();

        //Печать лог-сообщения

        System.out.printf("New user %s, %s with ID %s created. \n", lastName, firstName, this.uuid);
    }

    public void addAccount(Account anAcct) {
        this.accounts.add(anAcct);
    }


}
