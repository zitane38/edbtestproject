package com.example.backgroundexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

public class ETCActivity extends Activity implements OnClickListener{
	
	private static final String TAG = "ETCActivity";
	private static final String TAG1 = "ETCActivity";
	private RelativeLayout topRl;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_etc);
		findViewById(R.id.etc_qrmake_btn).setOnClickListener(this);
		topRl = (RelativeLayout)findViewById(R.id.etc_top_rl);
		
		int[] childRules01 = {RelativeLayout.ALIGN_PARENT_LEFT, 1,
				RelativeLayout.CENTER_VERTICAL, 1};
		SignImageView child01 = makeViewDraw(1, SignImageView.BUTTONSIGNBACK, 150, 90, childRules01, null);

		int[] childRules02 = {RelativeLayout.ALIGN_PARENT_RIGHT, 2,
				RelativeLayout.CENTER_VERTICAL, 2};
		SignImageView child02 = makeViewDraw(2, SignImageView.INFOSIGN, 150, 90, childRules02, null);
	
		topRl.addView(child01);
		topRl.addView(child02);
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.etc_qrmake_btn:
			Intent intent = new Intent(ETCActivity.this, QRSettingActivity.class);
			startActivity(intent);
			break;
		}
	}
	
	/**
	 * @return
	 */
	private SignImageView makeViewDraw(int id, int mode, int width, int height, 
				int[] rules, int[] margines) {
		SignImageView child = new SignImageView(ETCActivity.this);
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
