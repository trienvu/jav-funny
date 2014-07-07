package com.funnygame.DancingHandl.util;

public class MusicUtil {
	private String mName;
	private String mCurrent;
	private String mSing;

	public MusicUtil(String mName, String mCurrent, String mSing) {
		super();
		this.mName = mName;
		this.mCurrent = mCurrent;
		this.mSing = mSing;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmCurrent() {
		return mCurrent;
	}

	public void setmCurrent(String mCurrent) {
		this.mCurrent = mCurrent;
	}

	public String getmSing() {
		return mSing;
	}

	public void setmSing(String mSing) {
		this.mSing = mSing;
	}

	@Override
	public String toString() {
		String mMusic = getmCurrent() + "\n" + getmSing() + "\n Durian music: "
				+ getmCurrent();
		return mMusic;
	}
}
