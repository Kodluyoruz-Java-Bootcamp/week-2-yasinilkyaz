package business;

import dataAccess.TagDao;
import entity.Tag;

public class TagManager {
    private TagDao tagDao;

    public TagManager(){}
    public TagManager(TagDao tagDao){
        this.tagDao=tagDao;
    }
    public void addTag(Tag tag){tagDao.add(tag);}
}
