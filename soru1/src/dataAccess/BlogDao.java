package dataAccess;

import entity.Blog;

import java.util.List;

public class BlogDao {

private static List<Blog> blogs;

    public void add(Blog blog){
        blogs.add(blog);
    }
    public void delete(Blog blog){
        blogs.remove(blog);
    }
    public void publish(Blog blog){
        blogs.stream(blog.setPublished(blog.isPublished()));
    }

}
