package com.example.backgroundexample;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

public class MainActivity extends Activity implements OnClickListener{
	
	private RelativeLayout nameCardLi, urlLi, etcLi, topLl;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		nameCardLi = (RelativeLayout)findViewById(R.id.namecard_li);
		urlLi = (RelativeLayout)findViewById(R.id.url_li);
		etcLi = (RelativeLayout)findViewById(R.id.etc_li);
		topLl = (RelativeLayout)findViewById(R.id.qrmake_top_rl);
		nameCardLi.setOnClickListener(MainActivity.this);
		urlLi.setOnClickListener(MainActivity.this);
		etcLi.setOnClickListener(MainActivity.this);
		
		int[] childRules01 = {RelativeLayout.ALIGN_PARENT_TOP, 1,
				RelativeLayout.CENTER_HORIZONTAL, 1};
		int[] childMargine01 = {0, 45, 0, 0};
		SignImageView child01 = makeViewDraw(1, SignImageView.NAMECARDSIGN02, 105, 75, childRules01, childMargine01);
		
		int[] childRules02 = {RelativeLayout.ALIGN_PARENT_TOP, 2,
				RelativeLayout.CENTER_HORIZONTAL, 2};
		int[] childMargine02 = {0, 45, 0, 0};
		SignImageView child02 = makeViewDraw(2, SignImageView.BUTTONSIGNETC, 120, 80, childRules02, childMargine02);

		int[] childRules03 = {RelativeLayout.ALIGN_PARENT_TOP, 3,
				RelativeLayout.CENTER_HORIZONTAL, 3};
		int[] childMargine03 = {0, 45, 0, 0};
		SignImageView child03 = makeViewDraw(3, SignImageView.BUTTONSIGNURL, 100, 100, childRules03, childMargine03);

		int[] childRules04 = {RelativeLayout.ALIGN_PARENT_LEFT, 4,
				RelativeLayout.CENTER_VERTICAL, 4};
		SignImageView child04 = makeViewDraw(4, SignImageView.BUTTONSIGNBACK, 150, 90, childRules04, null);

		int[] childRules05 = {RelativeLayout.ALIGN_PARENT_RIGHT, 5,
				RelativeLayout.CENTER_VERTICAL, 5};
		SignImageView child05 = makeViewDraw(5, SignImageView.INFOSIGN, 150, 90, childRules05, null);
		
		nameCardLi.addView(child01);
		urlLi.addView(child03);
		etcLi.addView(child02);
		topLl.addView(child04);
		topLl.addView(child05);
		
	}
	
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.namecard_li:
			Intent intent01 = new Intent(MainActivity.this, NameCardActivity.class);
			startActivity(intent01);
			break;
		case R.id.url_li:
			Intent intent02 = new Intent(MainActivity.this, URLActivity.class);
			startActivity(intent02);
			break;
		case R.id.etc_li:
			goActivity(MainActivity.this, ETCActivity.class);
			
			break;
		}
	}
	
	public void goActivity(Context context, Class<?> class1) {
		Intent intent03 = new Intent(context, class1);
		startActivity(intent03);
	}

	/**
	 * @return
	 */
	private SignImageView makeViewDraw(int id, int mode, int width, int height, 
				int[] rules, int[] margines) {
		SignImageView child = new SignImageView(MainActivity.this);
		child.setId(id);
		child.setBackground(null);
		child.setMode(mode);
		RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
		int cnt = rules.length / 2;
		int index = 0;
		for (int i = 0; i < cnt; i++) {
			if(i == 0) layoutParams.addRule(rules[i], rules[i + 1]);
			layoutParams.addRule(rules[index], rules[index + 1]);
			index += 2;
		}
		if(margines != null) {
			layoutParams.setMargins(margines[0], margines[1], margines[2], margines[3]);
		}
		child.setLayoutParams(layoutParams);			
		return child;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


}
