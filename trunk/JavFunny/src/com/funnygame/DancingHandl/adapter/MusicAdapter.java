package com.funnygame.DancingHandl.adapter;

import java.util.List;

import com.funnygame.DancingHandl.util.MusicUtil;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class MusicAdapter extends BaseAdapter {
	private List<MusicUtil> mArrayList;
	private Context mContext;

	public MusicAdapter(Context mContext, List<MusicUtil> mArrayList) {
		this.mContext = mContext;
		this.mArrayList = mArrayList;
	}

	@Override
	public int getCount() {
		
		return mArrayList.size();
	}

	@Override
	public Object getItem(int position) {
		return mArrayList.get(position);
	}

	@Override
	public long getItemId(int arg0) {
		return 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		return null;
	}

}
