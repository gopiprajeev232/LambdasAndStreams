public class TargetTyping {
    interface IEmail {
        String constructEmail(String name);
    }

    IEmail email = (String name) -> name+"@gmail.com";
    public String getEmail(String name, IEmail email) {
        return null;
    }

    public static void main(String[] args) {
        new TargetTyping().getEmail("prajeev", (String name) -> name + "@gmail.com");
    }
}
