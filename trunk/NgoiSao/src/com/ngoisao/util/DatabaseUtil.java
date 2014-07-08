package com.ngoisao.util;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DatabaseUtil extends SQLiteAssetHelper {

	private static final String DATABASE_NAME = "jav";
	private static final int DATABASE_VERSION = 1;

	public DatabaseUtil(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
}
