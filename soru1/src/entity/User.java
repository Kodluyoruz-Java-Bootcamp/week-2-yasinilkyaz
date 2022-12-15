package entity;

import java.util.List;

public class User {
    private String name;
    private List<User> followingUser;
    private List<Tag> followingTag;

    public User(String name, List<User> followingUser, List<Tag> followingTag) {
        this.name = name;
        this.followingUser = followingUser;
        this.followingTag = followingTag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getFollowingUser() {
        return followingUser;
    }

    public void setFollowingUser(List<User> followingUser) {
        this.followingUser = followingUser;
    }

    public List<Tag> getFollowingTag() {
        return followingTag;
    }

    public void setFollowingTag(List<Tag> followingTag) {
        this.followingTag = followingTag;
    }
}
