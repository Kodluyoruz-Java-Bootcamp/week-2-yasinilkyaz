package dataAccess;

import entity.Tag;

import java.util.List;

public class TagDao {
    private static List<Tag> tags;

    public TagDao() {
    }
    public void add(Tag tag){
        tags.add(tag);
    }
}
