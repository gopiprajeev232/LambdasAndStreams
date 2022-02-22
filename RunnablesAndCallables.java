import java.util.concurrent.Callable;

public class RunnablesAndCallables {
    public void methodAcceptingRunnable(Runnable r) {
        r.run();
    }

    public void methodAcceptingCallable(Callable c) throws Exception {
        c.call();
    }

    public static void main(String[] args) throws Exception {
        Runnable r = () -> System.out.println("Hello!");
        new RunnablesAndCallables().methodAcceptingRunnable(r);
        new RunnablesAndCallables().methodAcceptingRunnable(() -> {
            System.out.println("Complex lambda");
        });

        Callable c = () -> "Hello in callable.";
        new RunnablesAndCallables().methodAcceptingCallable(c);
    }
}
