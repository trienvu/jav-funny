package com.ngoisao.dao;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

import com.ngoisao.entity.SupperStar;
import com.ngoisao.util.DatabaseUtil;

public class SupperStarImpl extends DatabaseUtil implements SupperStarDao {

	private static final String TABLE_NAME = "tblActor";

	public SupperStarImpl(Context context) {
		super(context);
	}

	@Override
	public List<SupperStar> getAllSupperStars() {
		// TODO Auto-generated method stub
		List<SupperStar> supperStars = new ArrayList<SupperStar>();

		SQLiteDatabase database = this.getReadableDatabase();

		SQLiteQueryBuilder builder = new SQLiteQueryBuilder();
		builder.setTables(TABLE_NAME);

		String[] sqlSelect = { "id", "full_name", "name_clean", "desc", "path"  };

		Cursor cursor = builder.query(database, sqlSelect, null, null,
				null, null, null);

		while (cursor.moveToNext()) {
			int id = cursor.getInt(0);
			String full_name = cursor.getString(1);
			String name_clean = cursor.getString(2);
			String desc = cursor.getString(3);
			String path = cursor.getString(4); 
			
			SupperStar star = new SupperStar();
			star.setId(id);
			star.setFullName(full_name);
			star.setNameClean(name_clean);
			star.setDesc(desc);
			star.setPath(path);
			
			supperStars.add(star); 
		}

		
		database.close();
		return supperStars;
	}

}
