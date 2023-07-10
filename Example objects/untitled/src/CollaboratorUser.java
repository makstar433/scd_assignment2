public class CollaboratorUser {
    private Collaborator collaborator;

    public CollaboratorUser(Collaborator collaborator) {
        this.collaborator = collaborator;
    }

    public String useCollaborator() {
        String data = collaborator.getData();
        // Process the data and return a result
        return "Processed: " + data;
    }
}
