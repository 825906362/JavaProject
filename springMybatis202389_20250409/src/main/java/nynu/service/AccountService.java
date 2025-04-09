package nynu.service;

public interface AccountService {
    //转账
    public abstract void transfer(String from, String to, double amount);
}
