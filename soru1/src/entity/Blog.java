package entity;

public class Blog {
    private User user;
    private String blogString;
    private Tag tag;
    private boolean isPublished;

    public Blog() {
    }

    public Blog(User user, String blogString, Tag tag, boolean isPublished) {
        this.user = user;
        this.blogString = blogString;
        this.tag = tag;
        this.isPublished = isPublished;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBlogString() {
        return blogString;
    }

    public void setBlogString(String blogString) {
        this.blogString = blogString;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public boolean isPublished() {
        return isPublished;
    }

    public void setPublished(boolean published) {
        isPublished = published;
    }
}
