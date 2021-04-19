package com.tutoringcenter.ldnd.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.tutoringcenter.ldnd.models.Teacher;

import java.util.ArrayList;
import java.util.List;

public class DatabaseTeacher extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="ManagerStuden";
    public static final String TABLE_NAME="Studen";
    public static final String ID="id";
    public static final String TEN="hoten";
    public static final String SDT="sdt";
    public static final String EMAIL="email";
    public static final String IDLOP ="nganh";
    public static final int VERSION=1;
    private Context context;

    public DatabaseTeacher(@Nullable Context context) {
        super(context,DATABASE_NAME, null,VERSION);
        this.context=context;
    }
    String Query="CREATE TABLE "+TABLE_NAME+"("+ID +" integer primary key, "+ IDLOP +" TEXT,"+TEN +" TEXT, "+SDT +" TEXT, "+EMAIL +" TEXT)";


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Query);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void addsinhvien(Teacher teacher){
        SQLiteDatabase database= this.getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put(IDLOP, teacher.getNganh());
        values.put(TEN, teacher.getName());
        values.put(SDT, teacher.getSdt());
        values.put(EMAIL, teacher.getEmail());
        database.insert(TABLE_NAME,null,values);
        database.close();
    }
    public List<Teacher> allSinhvien(){
        List<Teacher> teacherList = new ArrayList<>();
        String Query="SELECT * FROM "+TABLE_NAME;
        SQLiteDatabase database = this.getReadableDatabase();
        Cursor cursor= database.rawQuery(Query,null);
        if(cursor.moveToFirst()){
            do {
                Teacher teacher = new Teacher();
                teacher.setId(cursor.getInt(0));
                teacher.setNganh(cursor.getString(1));
                teacher.setName(cursor.getString(2));
                teacher.setSdt(cursor.getString(3));
                teacher.setEmail(cursor.getString(4));
                teacherList.add(teacher);
            }while(cursor.moveToNext());
        }
        database.close();

        return teacherList;
    }
    public int Update(Teacher teacher){
        SQLiteDatabase database= this.getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put(IDLOP, teacher.getNganh());
        values.put(TEN, teacher.getName());
        values.put(SDT, teacher.getSdt());
        values.put(EMAIL, teacher.getEmail());
        return database.update(TABLE_NAME,values,ID+"=?",new String[]{String.valueOf(teacher.getId())});
    }
    public int Delete(int id){
        SQLiteDatabase database =this.getWritableDatabase();
        return database.delete(TABLE_NAME,ID+"=?",new String[]{String.valueOf(id)});
    }
}
