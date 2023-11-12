public class BankAccount {
    private String accountNumber;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private double balance;

    public BankAccount(String accountNumber, String customerName, String customerEmail, String customerPhone,  double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public String getCustomerPhone() {
        return customerPhone;
    }
    public void setCustomerPhone(String tcustomerPhone) {
        this.customerPhone = customerPhone;
    }
    public void deposit(double total) {
        if (total > 0) {
            balance += total;
            System.out.println("Deposit berhasil. Saldo baru: " + balance);
        } else {
            System.out.println("Jumlah deposit harus lebih dari 0.");
        }
    }

    public void withdraw(double total) {
        if (total > 0) {
            if (total <= balance) {
                balance -= total;
                System.out.println("Penarikan berhasil. Saldo baru: " + balance);
            } else {
                System.out.println("Saldo tidak mencukupi. Penarikan gagal.");
            }
        } else {
            System.out.println("Jumlah penarikan harus lebih dari 0.");
        }
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("18051058", "SYELA SEPTANIA", "syelaseptania@gmail.com", "085156027381", 500000000);

        System.out.println("Nomor Rekening: " + myAccount.getAccountNumber());
        System.out.println("Nama Nasabah: " + myAccount.getCustomerName());
        System.out.println("Saldo: " + myAccount.getBalance());

        myAccount.deposit(500);
        myAccount.withdraw(200);
        myAccount.withdraw(1500);
    }
}
