public class CMain {
    public static void main(String[] args) {
        Collaborator fakeCollaborator = new FakeCollaborator();
        CollaboratorUser user = new CollaboratorUser(fakeCollaborator);
        String result = user.useCollaborator();

        System.out.println(result);  // Output: Processed: Fake data

    }
}