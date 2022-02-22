interface IMovie {
    public boolean check(int id);
}

public class MethodReferencing {

    public void testMovieStaticMethodRef() {
        IMovie m1 = (i) -> i < 100 ? true : false;
        IMovie m2 = MethodReferencing::isClassic;

    }

    public static boolean isClassic(int movieID) {
        return true;
    }

    public static void main(String[] args) {
        MethodReferencing client = new MethodReferencing();
        client.isClassic(10);
    }
}
