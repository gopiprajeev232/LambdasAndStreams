public class CapturingLambdas {
    Trade trade = new Trade("IBM", 20000, "OPEN");

    public interface ITrade {
        public boolean check(Trade t);
    }

    public boolean isOpenTrade() {
        ITrade simpleLambda = (t) -> t.isOpen() ? true:false;
        return simpleLambda.check(trade);
    }

    public boolean checkStatus(String status) {
        ITrade statusLambda = (t) -> t.getStatus().equals(status) ? true:false;
        return statusLambda.check(trade);
    }

    public boolean isOpenAndBig(String status, int amount) {
        ITrade openAndBigLambda = (t) -> {
            return t.getStatus().equals(status) && t.getAmount() > amount ? true : false;
        };

        return openAndBigLambda.check(trade);
    }
}
