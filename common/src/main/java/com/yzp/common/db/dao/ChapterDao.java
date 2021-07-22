package com.yzp.common.db.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.yzp.common.db.bean.Chapter;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CHAPTER".
*/
public class ChapterDao extends AbstractDao<Chapter, String> {

    public static final String TABLENAME = "CHAPTER";

    /**
     * Properties of entity Chapter.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, String.class, "id", true, "ID");
        public final static Property BookId = new Property(1, String.class, "bookId", false, "BOOK_ID");
        public final static Property ChapterNumber = new Property(2, int.class, "chapterNumber", false, "CHAPTER_NUMBER");
        public final static Property ChapterTitle = new Property(3, String.class, "chapterTitle", false, "CHAPTER_TITLE");
        public final static Property ChapterUrl = new Property(4, String.class, "chapterUrl", false, "CHAPTER_URL");
        public final static Property ChapterContent = new Property(5, String.class, "chapterContent", false, "CHAPTER_CONTENT");
    }


    public ChapterDao(DaoConfig config) {
        super(config);
    }
    
    public ChapterDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CHAPTER\" (" + //
                "\"ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: id
                "\"BOOK_ID\" TEXT," + // 1: bookId
                "\"CHAPTER_NUMBER\" INTEGER NOT NULL ," + // 2: chapterNumber
                "\"CHAPTER_TITLE\" TEXT," + // 3: chapterTitle
                "\"CHAPTER_URL\" TEXT," + // 4: chapterUrl
                "\"CHAPTER_CONTENT\" TEXT);"); // 5: chapterContent
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CHAPTER\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Chapter entity) {
        stmt.clearBindings();
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(1, id);
        }
 
        String bookId = entity.getBookId();
        if (bookId != null) {
            stmt.bindString(2, bookId);
        }
        stmt.bindLong(3, entity.getChapterNumber());
 
        String chapterTitle = entity.getChapterTitle();
        if (chapterTitle != null) {
            stmt.bindString(4, chapterTitle);
        }
 
        String chapterUrl = entity.getChapterUrl();
        if (chapterUrl != null) {
            stmt.bindString(5, chapterUrl);
        }
 
        String chapterContent = entity.getChapterContent();
        if (chapterContent != null) {
            stmt.bindString(6, chapterContent);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Chapter entity) {
        stmt.clearBindings();
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(1, id);
        }
 
        String bookId = entity.getBookId();
        if (bookId != null) {
            stmt.bindString(2, bookId);
        }
        stmt.bindLong(3, entity.getChapterNumber());
 
        String chapterTitle = entity.getChapterTitle();
        if (chapterTitle != null) {
            stmt.bindString(4, chapterTitle);
        }
 
        String chapterUrl = entity.getChapterUrl();
        if (chapterUrl != null) {
            stmt.bindString(5, chapterUrl);
        }
 
        String chapterContent = entity.getChapterContent();
        if (chapterContent != null) {
            stmt.bindString(6, chapterContent);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public Chapter readEntity(Cursor cursor, int offset) {
        Chapter entity = new Chapter( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // bookId
            cursor.getInt(offset + 2), // chapterNumber
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // chapterTitle
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // chapterUrl
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // chapterContent
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Chapter entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setBookId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setChapterNumber(cursor.getInt(offset + 2));
        entity.setChapterTitle(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setChapterUrl(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setChapterContent(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    @Override
    protected final String updateKeyAfterInsert(Chapter entity, long rowId) {
        return entity.getId();
    }
    
    @Override
    public String getKey(Chapter entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Chapter entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
