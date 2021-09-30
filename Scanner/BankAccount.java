public class BankAccount {
    private float balance=30000;
    private String _owner;
    public BankAccount(String owner) {
        this._owner = owner;
        //this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }
    public String toString(){
        String s=_owner+" : "+balance+"\n";
        return s;
    }
    public String getOwner() {
        return _owner;
    }
    public void doTransaction(float amount){
        balance+=amount;
    }
}
