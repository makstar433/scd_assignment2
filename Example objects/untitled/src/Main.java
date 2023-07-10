public class Main {
    public static void main(String[] args) {
        Mutable person = new Mutable("Abeer");
        System.out.println(person.getName());  // Output: John

        person.setName("Ahmed");
        System.out.println(person.getName());  // Output: Alice
    }
}
