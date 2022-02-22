public class Trade {
    String companyName, status;
    int amount;

    public Trade(String companyName, int amount, String status) {
        this.companyName = companyName;
        this.amount = amount;
        this.status = status;
    }

    public boolean isOpen() {
        if(status == "OPEN")
            return true;

        return false;
    }

    public String getStatus() {
        return status;
    }

    public int getAmount() {
        return amount;
    }
}
