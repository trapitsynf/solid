package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");

        UserPersister persister = new UserPersister(user);
        UserReporter reporter = new UserReporter(user);

        reporter.report();
        persister.save();
    }
}