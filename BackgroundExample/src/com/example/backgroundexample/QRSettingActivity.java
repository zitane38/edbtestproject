package com.example.backgroundexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class QRSettingActivity extends Activity{
	
	RelativeLayout colorRl, phoneTran, emailRl, angleRl, topRl;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_qrsetting);
		
		colorRl = (RelativeLayout)findViewById(R.id.qrsetting_color_rl);
		phoneTran = (RelativeLayout)findViewById(R.id.qrsetting_phonetran_rl);
		emailRl = (RelativeLayout)findViewById(R.id.qrsetting_email_rl);
		angleRl = (RelativeLayout)findViewById(R.id.qrsetting_angle_rl);
		topRl = (RelativeLayout)findViewById(R.id.qrsetting_top_rl);
		
		int[] childRules01 = {RelativeLayout.ALIGN_PARENT_TOP, 1,
				RelativeLayout.CENTER_HORIZONTAL, 1};
		int[] childMargine01 = {0, 40, 0, 0};
		SignImageView child01 = makeViewDraw(1, SignImageView.BUTTONSIGNPHONE, 90, 90, childRules01, childMargine01);
		
		int[] childRules02 = {RelativeLayout.ALIGN_PARENT_TOP, 2,
				RelativeLayout.CENTER_HORIZONTAL, 2};
		int[] childMargine02 = {0, 60, 0, 0};
		SignImageView child02 = makeViewDraw(2, SignImageView.BUTTONSIGEMAIL, 110, 90, childRules02, childMargine02);
		
		int[] childRules03 = {RelativeLayout.ALIGN_PARENT_TOP, 3,
				RelativeLayout.CENTER_HORIZONTAL, 3};
		int[] childMargine03 = {0, 30, 0, 0};
		SignImageView child03 = makeViewDraw(3, SignImageView.BUTTONSIGNANGLE, 90, 90, childRules03, childMargine03);
		
		int[] childRules04 = {RelativeLayout.ALIGN_PARENT_TOP, 4,
				RelativeLayout.CENTER_HORIZONTAL, 4};
		int[] childMargine04 = {0, 40, 0, 0};
		SignImageView child04 = makeViewDraw(3, SignImageView.BUTTONSIGCOLOR, 90, 90, childRules04, childMargine04);
		
		int[] childRules05 = {RelativeLayout.ALIGN_PARENT_LEFT, 5,
				RelativeLayout.CENTER_VERTICAL, 5};
		SignImageView child05 = makeViewDraw(5, SignImageView.BUTTONSIGNBACK, 150, 90, childRules05, null);

		int[] childRules06 = {RelativeLayout.ALIGN_PARENT_RIGHT, 6,
				RelativeLayout.CENTER_VERTICAL, 6};
		SignImageView child06 = makeViewDraw(6, SignImageView.INFOSIGN, 150, 90, childRules06, null);
		
		phoneTran.addView(child01);
		emailRl.addView(child02);
		angleRl.addView(child03);
		colorRl.addView(child04);
		topRl.addView(child05);
		topRl.addView(child06);
	}
	
	/**
	 * @return
	 */
	private SignImageView makeViewDraw(int id, int mode, int width, int height, 
				int[] rules, int[] margines) {
		SignImageView child = new SignImageView(QRSettingActivity.this);
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
	
}
