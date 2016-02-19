package jp.ac.it_college.std.flickfighter;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by s14010 on 16/02/18.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context){
        super(context,"uma.db",null,1);
        System.out.println("DB");
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE BOOK (_id INTEGER PRIMARY KEY,NAME TEXT,TEL TEXT,STE3 TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO 自動生成されたメソッド・スタブ
    }
}
