public class PrototypeDemo {
    public static void main(String[] args) {
        Document d1 = new Document("Tittle for D1", "Content for D1");
        Document d2 = d1.clone();

        System.out.println(d1.toString());
        System.out.println(d2.toString());

        System.out.println(d1.equals(d2));

        System.out.println(d1 == d2);
    }
}
