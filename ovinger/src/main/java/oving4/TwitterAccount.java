package oving4;

public class TwitterAccount {

    private String username;


    // constructors

    public TwitterAccount(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void follow(TwitterAccount account) {
    }  




    @Override
    public String toString() {
        return "{" +
            " username='" + getUsername() + "'" +
            "}";
    }

    
}
