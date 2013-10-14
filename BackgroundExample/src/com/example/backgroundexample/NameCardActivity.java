package com.example.backgroundexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

public class NameCardActivity extends Activity implements OnClickListener{

	private RelativeLayout listUpSignRl, listDownSignRl, groupRl, topRl;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_namecard);
		
		listUpSignRl = (RelativeLayout)findViewById(R.id.namecard_up_sign_rl);
		listDownSignRl = (RelativeLayout)findViewById(R.id.namecard_down_sign_rl);
		groupRl = (RelativeLayout)findViewById(R.id.namecard_group_rl);
		topRl = (RelativeLayout)findViewById(R.id.namecard_top_rl);
		
		findViewById(R.id.namecard_qrmake_btn).setOnClickListener(this);
		findViewById(R.id.namecard_group_add_btn).setOnClickListener(this);
		
		int[] childRules01 = {RelativeLayout.CENTER_HORIZONTAL, 1,
				RelativeLayout.CENTER_VERTICAL, 1};
		int[] childMargine01 = {0, 0, 100, 0};
		SignImageView child01 = makeViewDraw(1, SignImageView.BUTTONSIGNTOP, 42, 23, childRules01, childMargine01);
		
		int[] childRules02 = {RelativeLayout.CENTER_HORIZONTAL, 2,
				RelativeLayout.CENTER_VERTICAL, 2};
		int[] childMargine02 = {0, 0, 100, 0};
		SignImageView child02 = makeViewDraw(2, SignImageView.BUTTONSIGNBOTTOM, 42, 23, childRules02, childMargine02);
		
		int[] childRules03 = {RelativeLayout.LEFT_OF, R.id.namecard_group_number_tv,
				RelativeLayout.CENTER_VERTICAL, 3};
		SignImageView child03 = makeViewDraw(3, SignImageView.ETSIGNSPINNER, 50, 16, childRules03, null);
		
		int[] childRules04 = {RelativeLayout.ALIGN_PARENT_LEFT, 4,
				RelativeLayout.CENTER_VERTICAL, 4};
		SignImageView child04 = makeViewDraw(4, SignImageView.BUTTONSIGNBACK, 150, 90, childRules04, null);

		int[] childRules05 = {RelativeLayout.ALIGN_PARENT_RIGHT, 5,
				RelativeLayout.CENTER_VERTICAL, 5};
		SignImageView child05 = makeViewDraw(5, SignImageView.INFOSIGN, 150, 90, childRules05, null);
		
		listUpSignRl.addView(child01);
		listDownSignRl.addView(child02);
		groupRl.addView(child03);
		topRl.addView(child04);
		topRl.addView(child05);
	}
	
	/**
	 * @return
	 */
	private SignImageView makeViewDraw(int id, int mode, int width, int height, 
				int[] rules, int[] margines) {
		SignImageView child = new SignImageView(NameCardActivity.this);
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
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.namecard_qrmake_btn:
			Intent intent = new Intent(NameCardActivity.this, QRSettingActivity.class);
			startActivity(intent);
			break;
		case R.id.namecard_group_add_btn:
			Intent intent2 = new Intent(NameCardActivity.this, NameCardGroupActivity.class);
			startActivity(intent2);
			break;
		}
	}

}
