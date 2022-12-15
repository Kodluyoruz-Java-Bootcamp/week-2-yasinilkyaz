package business;

import dataAccess.BlogDao;
import entity.Blog;

public class BlogManager {

    private BlogDao blogDao;

    public BlogManager(BlogDao blogDao) {
        this.blogDao = blogDao;
    }

    public BlogManager() {
    }
    public void add(Blog blog){blogDao.add(blog);}
    public void delete(Blog blog){blogDao.delete(blog);}
    public void publish(Blog blog){blogDao.publish(blog);}
}
