package homework;

public class UserPersister implements DataPersister {
    private final User user;

    public UserPersister(User user) {
        this.user = user;
    }

    @Override
    public void save() {
        System.out.println("Save user: " + user.getName());
    }
}
