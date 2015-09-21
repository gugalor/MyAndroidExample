package com.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2015/9/5.
 */
public class DatabaseOpenHelper extends SQLiteOpenHelper {
    public final static String DATABASENAME="dirayOpenHelper.db";
    public final static int DATABASEVERSION=1;
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql="drop table if exists diary";
        db.execSQL(sql);
        this.onCreate(db);
    }

    public DatabaseOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql="create table diary(_id integer primary key autoincrement," +
                "topic varchar(100),content varchar(1000))";
        db.execSQL(sql);
    }


}
