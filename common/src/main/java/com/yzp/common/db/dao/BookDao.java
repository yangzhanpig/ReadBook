package com.yzp.common.db.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.yzp.common.db.bean.Book;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BOOK".
*/
public class BookDao extends AbstractDao<Book, String> {

    public static final String TABLENAME = "BOOK";

    /**
     * Properties of entity Book.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, String.class, "id", true, "ID");
        public final static Property BookName = new Property(1, String.class, "bookName", false, "BOOK_NAME");
        public final static Property ChapterUrl = new Property(2, String.class, "chapterUrl", false, "CHAPTER_URL");
        public final static Property CoverUrl = new Property(3, String.class, "coverUrl", false, "COVER_URL");
        public final static Property Desc = new Property(4, String.class, "desc", false, "DESC");
        public final static Property Author = new Property(5, String.class, "author", false, "AUTHOR");
        public final static Property Type = new Property(6, String.class, "type", false, "TYPE");
        public final static Property UpdateDate = new Property(7, String.class, "updateDate", false, "UPDATE_DATE");
        public final static Property NewestChapterId = new Property(8, String.class, "newestChapterId", false, "NEWEST_CHAPTER_ID");
        public final static Property NewestChapterTitle = new Property(9, String.class, "newestChapterTitle", false, "NEWEST_CHAPTER_TITLE");
        public final static Property NewestChapterUrl = new Property(10, String.class, "newestChapterUrl", false, "NEWEST_CHAPTER_URL");
        public final static Property HistoryChapterId = new Property(11, String.class, "historyChapterId", false, "HISTORY_CHAPTER_ID");
        public final static Property HistoryChapterNum = new Property(12, int.class, "historyChapterNum", false, "HISTORY_CHAPTER_NUM");
        public final static Property SortCode = new Property(13, int.class, "sortCode", false, "SORT_CODE");
        public final static Property NoReadNum = new Property(14, int.class, "noReadNum", false, "NO_READ_NUM");
        public final static Property ChapterTotalNum = new Property(15, int.class, "chapterTotalNum", false, "CHAPTER_TOTAL_NUM");
        public final static Property LastReadPosition = new Property(16, int.class, "lastReadPosition", false, "LAST_READ_POSITION");
        public final static Property Source = new Property(17, String.class, "source", false, "SOURCE");
    }


    public BookDao(DaoConfig config) {
        super(config);
    }
    
    public BookDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BOOK\" (" + //
                "\"ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: id
                "\"BOOK_NAME\" TEXT," + // 1: bookName
                "\"CHAPTER_URL\" TEXT," + // 2: chapterUrl
                "\"COVER_URL\" TEXT," + // 3: coverUrl
                "\"DESC\" TEXT," + // 4: desc
                "\"AUTHOR\" TEXT," + // 5: author
                "\"TYPE\" TEXT," + // 6: type
                "\"UPDATE_DATE\" TEXT," + // 7: updateDate
                "\"NEWEST_CHAPTER_ID\" TEXT," + // 8: newestChapterId
                "\"NEWEST_CHAPTER_TITLE\" TEXT," + // 9: newestChapterTitle
                "\"NEWEST_CHAPTER_URL\" TEXT," + // 10: newestChapterUrl
                "\"HISTORY_CHAPTER_ID\" TEXT," + // 11: historyChapterId
                "\"HISTORY_CHAPTER_NUM\" INTEGER NOT NULL ," + // 12: historyChapterNum
                "\"SORT_CODE\" INTEGER NOT NULL ," + // 13: sortCode
                "\"NO_READ_NUM\" INTEGER NOT NULL ," + // 14: noReadNum
                "\"CHAPTER_TOTAL_NUM\" INTEGER NOT NULL ," + // 15: chapterTotalNum
                "\"LAST_READ_POSITION\" INTEGER NOT NULL ," + // 16: lastReadPosition
                "\"SOURCE\" TEXT);"); // 17: source
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BOOK\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Book entity) {
        stmt.clearBindings();
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(1, id);
        }
 
        String bookName = entity.getBookName();
        if (bookName != null) {
            stmt.bindString(2, bookName);
        }
 
        String chapterUrl = entity.getChapterUrl();
        if (chapterUrl != null) {
            stmt.bindString(3, chapterUrl);
        }
 
        String coverUrl = entity.getCoverUrl();
        if (coverUrl != null) {
            stmt.bindString(4, coverUrl);
        }
 
        String desc = entity.getDesc();
        if (desc != null) {
            stmt.bindString(5, desc);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(6, author);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(7, type);
        }
 
        String updateDate = entity.getUpdateDate();
        if (updateDate != null) {
            stmt.bindString(8, updateDate);
        }
 
        String newestChapterId = entity.getNewestChapterId();
        if (newestChapterId != null) {
            stmt.bindString(9, newestChapterId);
        }
 
        String newestChapterTitle = entity.getNewestChapterTitle();
        if (newestChapterTitle != null) {
            stmt.bindString(10, newestChapterTitle);
        }
 
        String newestChapterUrl = entity.getNewestChapterUrl();
        if (newestChapterUrl != null) {
            stmt.bindString(11, newestChapterUrl);
        }
 
        String historyChapterId = entity.getHistoryChapterId();
        if (historyChapterId != null) {
            stmt.bindString(12, historyChapterId);
        }
        stmt.bindLong(13, entity.getHistoryChapterNum());
        stmt.bindLong(14, entity.getSortCode());
        stmt.bindLong(15, entity.getNoReadNum());
        stmt.bindLong(16, entity.getChapterTotalNum());
        stmt.bindLong(17, entity.getLastReadPosition());
 
        String source = entity.getSource();
        if (source != null) {
            stmt.bindString(18, source);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Book entity) {
        stmt.clearBindings();
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(1, id);
        }
 
        String bookName = entity.getBookName();
        if (bookName != null) {
            stmt.bindString(2, bookName);
        }
 
        String chapterUrl = entity.getChapterUrl();
        if (chapterUrl != null) {
            stmt.bindString(3, chapterUrl);
        }
 
        String coverUrl = entity.getCoverUrl();
        if (coverUrl != null) {
            stmt.bindString(4, coverUrl);
        }
 
        String desc = entity.getDesc();
        if (desc != null) {
            stmt.bindString(5, desc);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(6, author);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(7, type);
        }
 
        String updateDate = entity.getUpdateDate();
        if (updateDate != null) {
            stmt.bindString(8, updateDate);
        }
 
        String newestChapterId = entity.getNewestChapterId();
        if (newestChapterId != null) {
            stmt.bindString(9, newestChapterId);
        }
 
        String newestChapterTitle = entity.getNewestChapterTitle();
        if (newestChapterTitle != null) {
            stmt.bindString(10, newestChapterTitle);
        }
 
        String newestChapterUrl = entity.getNewestChapterUrl();
        if (newestChapterUrl != null) {
            stmt.bindString(11, newestChapterUrl);
        }
 
        String historyChapterId = entity.getHistoryChapterId();
        if (historyChapterId != null) {
            stmt.bindString(12, historyChapterId);
        }
        stmt.bindLong(13, entity.getHistoryChapterNum());
        stmt.bindLong(14, entity.getSortCode());
        stmt.bindLong(15, entity.getNoReadNum());
        stmt.bindLong(16, entity.getChapterTotalNum());
        stmt.bindLong(17, entity.getLastReadPosition());
 
        String source = entity.getSource();
        if (source != null) {
            stmt.bindString(18, source);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public Book readEntity(Cursor cursor, int offset) {
        Book entity = new Book( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // bookName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // chapterUrl
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // coverUrl
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // desc
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // author
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // type
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // updateDate
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // newestChapterId
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // newestChapterTitle
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // newestChapterUrl
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // historyChapterId
            cursor.getInt(offset + 12), // historyChapterNum
            cursor.getInt(offset + 13), // sortCode
            cursor.getInt(offset + 14), // noReadNum
            cursor.getInt(offset + 15), // chapterTotalNum
            cursor.getInt(offset + 16), // lastReadPosition
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17) // source
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Book entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setBookName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setChapterUrl(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setCoverUrl(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setDesc(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setAuthor(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setType(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setUpdateDate(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setNewestChapterId(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setNewestChapterTitle(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setNewestChapterUrl(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setHistoryChapterId(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setHistoryChapterNum(cursor.getInt(offset + 12));
        entity.setSortCode(cursor.getInt(offset + 13));
        entity.setNoReadNum(cursor.getInt(offset + 14));
        entity.setChapterTotalNum(cursor.getInt(offset + 15));
        entity.setLastReadPosition(cursor.getInt(offset + 16));
        entity.setSource(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
     }
    
    @Override
    protected final String updateKeyAfterInsert(Book entity, long rowId) {
        return entity.getId();
    }
    
    @Override
    public String getKey(Book entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Book entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
