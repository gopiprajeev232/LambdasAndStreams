class SuperScope {
    final String member = "GODFATHER";
}

public class LambdaScoping extends SuperScope {
    private String member = "GRANDPA";

    interface IFamily {
        String who(String member);
    }

    public void testMember(String member) {
        System.out.println("Local member: "+member);
        System.out.println("Family member: "+this.member);
        System.out.println("Family member: "+super.member);

        IFamily familyLambda = (familyMember) -> {
            System.out.println("Local member: "+familyMember);
            System.out.println("Local member: "+member);
            System.out.println("Family member: "+this.member);
            System.out.println("Family member: "+super.member);

            return familyMember;
        };

        familyLambda.who(member);
    }

    public static void main(String[] args) {
        new LambdaScoping().testMember("Son");
    }
}
