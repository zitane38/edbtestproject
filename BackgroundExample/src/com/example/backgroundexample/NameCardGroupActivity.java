package com.example.backgroundexample;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class NameCardGroupActivity extends Activity {

	private RelativeLayout upSignRl, downSignRl, topRl;
	private ListView listView;
	private NameCardGroupAdapter adapter;
	private ArrayList<NameCardGroupItem> data;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_namecard_group);
		initSignView();
		topRl = (RelativeLayout)findViewById(R.id.namecard_group_top_rl);
		listView = (ListView)findViewById(R.id.namecard_group_list);
		data = new ArrayList<NameCardGroupItem>();
		data.add(new NameCardGroupItem("미지정", true));
		data.add(new NameCardGroupItem("가족", true));
		data.add(new NameCardGroupItem("동료", false));
		data.add(new NameCardGroupItem("회사", false));
		data.add(new NameCardGroupItem("친척", false));
		data.add(new NameCardGroupItem("Coworkers", false));
		data.add(new NameCardGroupItem("Family", false));
		data.add(new NameCardGroupItem("Friends", false));
		adapter = new NameCardGroupAdapter(NameCardGroupActivity.this, 
				R.layout.item_namecard_group, 
				data);
		listView.setAdapter(adapter);
		listView.setDivider(new ColorDrawable(0xffbdbdc7));
		listView.setDividerHeight(2);
		
		int[] childRules01 = {RelativeLayout.ALIGN_PARENT_LEFT, 1,
				RelativeLayout.CENTER_VERTICAL, 1};
		SignImageView child01 = makeViewDraw(1, SignImageView.BUTTONSIGNBACK, 150, 90, childRules01, null);

		int[] childRules02 = {RelativeLayout.ALIGN_PARENT_RIGHT, 2,
				RelativeLayout.CENTER_VERTICAL, 2};
		SignImageView child02 = makeViewDraw(2, SignImageView.INFOSIGN, 150, 90, childRules02, null);
		
		topRl.addView(child01);
		topRl.addView(child02);
	}
	
	public class NameCardGroupAdapter extends BaseAdapter {
		
		public NameCardGroupAdapter(Context context, 
				int layout, ArrayList<NameCardGroupItem> data) {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return data.size();
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return data.get(position);
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			if(convertView == null) {
				convertView = View.inflate(NameCardGroupActivity.this, 
						R.layout.item_namecard_group, null);
			}
			
			NameCardGroupItem item = data.get(position);
			Log.v("", "item : " + item);
			Log.v("", "position : " + position);
			Log.v("", "convertView : " + convertView);
			TextView textView = (TextView) convertView.findViewById(R.id.namecard_group_item_tv);
			textView.setText(item.getTitle());
			return convertView;
		}

	}

	private void initSignView() {
		upSignRl = (RelativeLayout)findViewById(R.id.namecard_group_up_sign_rl);
		downSignRl = (RelativeLayout)findViewById(R.id.namecard_group_down_sign_rl);
		
		int[] childRules01 = {RelativeLayout.CENTER_HORIZONTAL, 1,
				RelativeLayout.CENTER_VERTICAL, 1};
		int[] childMargine01 = {0, 0, 100, 0};
		SignImageView child01 = makeViewDraw(1, SignImageView.BUTTONSIGNTOP, 42, 23, childRules01, childMargine01);
		
		int[] childRules02 = {RelativeLayout.CENTER_HORIZONTAL, 1,
				RelativeLayout.CENTER_VERTICAL, 1};
		int[] childMargine02 = {0, 0, 100, 0};
		SignImageView child02 = makeViewDraw(1, SignImageView.BUTTONSIGNBOTTOM, 42, 23, childRules02, childMargine02);
		
		upSignRl.addView(child01);
		downSignRl.addView(child02);
	}
	
	/**
	 * @return
	 */
	private SignImageView makeViewDraw(int id, int mode, int width, int height, 
				int[] rules, int[] margines) {
		SignImageView child = new SignImageView(NameCardGroupActivity.this);
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
