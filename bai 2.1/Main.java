public class Main {
    public static void main(String[] args) {
        Author au1 = new Author("bao","phanlegiabao27@gmail.com", 'N');
        System.out.println( au1.toString());

        Book b1 = new Book("New java",au1, 500.0);
        System.out.println(b1.toString());
    }
}