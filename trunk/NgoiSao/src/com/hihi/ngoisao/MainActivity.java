package com.hihi.ngoisao;

import java.util.List;

import com.example.ngoisao.R;
import com.ngoisao.dao.SupperStarImpl;
import com.ngoisao.entity.SupperStar;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private Context mContext = this;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		SupperStarImpl spSupperStarImpl = new SupperStarImpl(mContext);
	
		List<SupperStar> supperStars = spSupperStarImpl.getAllSupperStars();
		
		Toast.makeText(mContext, supperStars.size()+"", Toast.LENGTH_LONG).show();
	}
}
