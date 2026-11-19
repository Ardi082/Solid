enum AccountType {
    SAVINGS,
    CREDIT
}

public class Account {

    private AccountType type;

    public Account(AccountType type) {
        this.type = type;
    }

    public AccountType getType() {
        return type;
    }

    public static void main(String[] args) {

        Account account1 = new Account(AccountType.SAVINGS);
        Account account2 = new Account(AccountType.CREDIT);

        System.out.println("Tipe akun 1: " + account1.getType());
        System.out.println("Tipe akun 2: " + account2.getType());
    }
}