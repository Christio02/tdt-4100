package oving4;

public class Tweet {

    private TwitterAccount account;
    private String tweet;

    // constructors

    public Tweet(TwitterAccount account, String tweet) {
        this.account = account;
        this.tweet = tweet;

    }

    public Tweet(TwitterAccount account, Tweet tweet) {
        if (this.account == account) {
            throw new IllegalArgumentException("Kan ikke retweete samme konto!");
        }

        this.tweet = tweet.tweet; // sets tweet to other constructor object

    }

    // returs text of a tweet

    public String getText() {
        return this.tweet;
    }

    // gets owner of a tweet

    public TwitterAccount getOwner() {
        return this.account;
    }

    public Tweet getOriginalTweet() {
        if (this.tweet.)
    }









}
