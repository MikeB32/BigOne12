package com.example.mike.bigone12;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;

/**
 * Created by Mike on 8/30/2016.
 */
public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "big.db";
    public static final String TABLE_NAME = "images";
    public static final String NAME = "name";
    public static final String PLACE = "place";
    public static final String FLAG = "flag";


    public DataBaseHelper(Context context) {

        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_IMAGES_TABLE = "CREATE TABLE images ( " +
                "ID  INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "flag INTEGER, " +

                "name TEXT, " +
                "place TEXT )";

        db.execSQL(CREATE_IMAGES_TABLE);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS images");
        this.onCreate(db);
    }


    public void insertentry(String name, String place, Integer flag) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(NAME, name);
        contentValues.put(FLAG, flag);
        contentValues.put(PLACE, place);

        db.insert(TABLE_NAME, null, contentValues);
        db.close();

    }

    public DbResponse getDataforTab1() {
        DbResponse obj = new DbResponse();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE " + FLAG + " =" + 1 + "",null);
        if (cursor.getCount() > 0) {
            cursor.moveToLast();
            obj.name = cursor.getString(cursor.getColumnIndex(NAME));
            obj.place = cursor.getString(cursor.getColumnIndex(PLACE));

        }

        cursor.close();
        return obj;
    }

    public DbResponse getDataforTab2() {
        DbResponse obj = new DbResponse();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE " + FLAG + " =" + 2 + "",null);
        if (cursor.getCount() > 0) {
            cursor.moveToLast();
            obj.name = cursor.getString(cursor.getColumnIndex(NAME));
            obj.place = cursor.getString(cursor.getColumnIndex(PLACE));

        }

        cursor.close();
        return obj;
    }
    public DbResponse getDataforTab3() {
        DbResponse obj = new DbResponse();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE " + FLAG + " =" + 3 + "",null);
        if (cursor.getCount() > 0) {
            cursor.moveToLast();
            obj.name = cursor.getString(cursor.getColumnIndex(NAME));
            obj.place = cursor.getString(cursor.getColumnIndex(PLACE));

        }

        cursor.close();
        return obj;
    }
    public DbResponse getDataforTab4() {
        DbResponse obj = new DbResponse();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE " + FLAG + " =" + 4 + "",null);
        if (cursor.getCount() > 0) {
            cursor.moveToLast();
            obj.name = cursor.getString(cursor.getColumnIndex(NAME));
            obj.place = cursor.getString(cursor.getColumnIndex(PLACE));

        }

        cursor.close();
        return obj;
    }
    public DbResponse getDataforTab5() {
        DbResponse obj = new DbResponse();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE " + FLAG + " =" + 5 + "",null);
        if (cursor.getCount() > 0) {
            cursor.moveToLast();
            obj.name = cursor.getString(cursor.getColumnIndex(NAME));
            obj.place = cursor.getString(cursor.getColumnIndex(PLACE));

        }

        cursor.close();
        return obj;
    }
    public DbResponse getDataforTab6() {
        DbResponse obj = new DbResponse();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE " + FLAG + " =" + 6 + "",null);
        if (cursor.getCount() > 0) {
            cursor.moveToLast();
            obj.name = cursor.getString(cursor.getColumnIndex(NAME));
            obj.place = cursor.getString(cursor.getColumnIndex(PLACE));

        }

        cursor.close();
        return obj;
    }
    public DbResponse getDataforTab7() {
        DbResponse obj = new DbResponse();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE " + FLAG + " =" + 7 + "",null);
        if (cursor.getCount() > 0) {
            cursor.moveToLast();
            obj.name = cursor.getString(cursor.getColumnIndex(NAME));
            obj.place = cursor.getString(cursor.getColumnIndex(PLACE));

        }

        cursor.close();
        return obj;
    }
    public DbResponse getDataforTab8() {
        DbResponse obj = new DbResponse();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE " + FLAG + " =" + 8 + "",null);
        if (cursor.getCount() > 0) {
            cursor.moveToLast();
            obj.name = cursor.getString(cursor.getColumnIndex(NAME));
            obj.place = cursor.getString(cursor.getColumnIndex(PLACE));

        }

        cursor.close();
        return obj;
    }
    public DbResponse getDataforTab9() {
        DbResponse obj = new DbResponse();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE " + FLAG + " =" + 9 + "",null);
        if (cursor.getCount() > 0) {
            cursor.moveToLast();
            obj.name = cursor.getString(cursor.getColumnIndex(NAME));
            obj.place = cursor.getString(cursor.getColumnIndex(PLACE));

        }

        cursor.close();
        return obj;
    }
    public DbResponse getDataforTab10() {
        DbResponse obj = new DbResponse();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE " + FLAG + " =" + 10 + "",null);
        if (cursor.getCount() > 0) {
            cursor.moveToLast();
            obj.name = cursor.getString(cursor.getColumnIndex(NAME));
            obj.place = cursor.getString(cursor.getColumnIndex(PLACE));

        }

        cursor.close();
        return obj;
    }
    public DbResponse getDataforTab11() {
        DbResponse obj = new DbResponse();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE " + FLAG + " =" + 11 + "",null);
        if (cursor.getCount() > 0) {
            cursor.moveToLast();
            obj.name = cursor.getString(cursor.getColumnIndex(NAME));
            obj.place = cursor.getString(cursor.getColumnIndex(PLACE));

        }

        cursor.close();
        return obj;
    }
    public DbResponse getDataforTab12() {
        DbResponse obj = new DbResponse();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE " + FLAG + " =" + 12 + "",null);
        if (cursor.getCount() > 0) {
            cursor.moveToLast();
            obj.name = cursor.getString(cursor.getColumnIndex(NAME));
            obj.place = cursor.getString(cursor.getColumnIndex(PLACE));

        }

        cursor.close();
        return obj;
    }
}
