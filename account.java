public class account {
    private String AccountNo;
    private double balance;
    private String name;
    private String email;
    private String telephoneNo;

    public account(String AccountNo,double balance,String name,String email,String telephoneNo){
        this.AccountNo=AccountNo;
        this.balance=balance;
        this.name=name;
        this.email=email;
        this.telephoneNo=telephoneNo;

    }


    public void setAccountNo(String accountNo) {
        this.AccountNo = accountNo;
    }
        public String getAccountNo(){
            return AccountNo;

        }
        public void setBalance(double balance) {
            this.balance = balance;
        }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public  String getEmail() {
        return email;
    }
    public void setTelephoneNo(String telephoneNo){
        this.telephoneNo=telephoneNo;
    }

    public String getTelephoneNo() {
        return telephoneNo;
    }
    public void parayatırma(double amount) {
        balance += amount;
        System.out.println("New balance :" + balance);
    }
    public void paraçekme(double amount){
        if(amount>1500)
            System.out.println("Bir günde 1500 Tl'dan fazla para çekemezsiniz...");
        if(balance-amount<0)
            System.out.println("Yeterli bakiyeniz yok. "+"Bakiyeniz: "+balance);
        else
            balance-=amount;
        System.out.println("Yeni bakiyeniz: "+ balance);

    }


}


