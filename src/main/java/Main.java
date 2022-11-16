public class Main {

    public static void main(String[] args) {

        Post firstUser = new Post();

        firstUser.setFullName("Иванов", "Иван", "Иванович");
        firstUser.setBirthDate(1, 1, 1991);
        firstUser.setPassport("4444444444");
        firstUser.setPhone("12345678");
        firstUser.setSubscription(true);

        Post secondUser = new Post();

        secondUser.setFullName("Петров", "Петр", "Петрович");
        secondUser.setBirthDate(2, 2, 1992);
        secondUser.setPassport("5555555555");
        secondUser.setPhone("87654321");
        secondUser.setSubscription(false);
    }
}