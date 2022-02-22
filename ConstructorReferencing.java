public class ConstructorReferencing {
    class Movie {
        public Movie(int id) {

        }

        public Movie(int id, String name) {

        }
    }

    interface MovieFactory {
        public Movie create(int id);
    }

    MovieFactory m1 = i -> new Movie(i);
    MovieFactory m2 = Movie::new;

    interface MovieFactory2 {
        public Movie create(int id, String name);
    }

    MovieFactory2 m3 = Movie::new;

    public static void main(String[] args) {
        ConstructorReferencing client = new ConstructorReferencing();
    }
}
