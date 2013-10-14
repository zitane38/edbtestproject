package com.example.collbackproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{

	private TextView mTextView;
	
	private CustomDialog customDialog;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setLayout();
		mTextView = (TextView)findViewById(R.id.main_tv);

	}
	
	private DiialogCallback diialogCallback = new DiialogCallback() {
		
		@Override
		public void show() {
			// TODO Auto-generated method stub
			AppToast.showToast(getApplicationContext(), "Dialog show()�� ����ɶ� �ݹ� show�� ����");
		}
		
		@Override
		public void setTitle(CharSequence sequence) {
			// TODO Auto-generated method stub
			AppToast.showToast(getApplicationContext(), "Dialog title�� �� �Ҷ� �ݹ�  setTitle�� ���� textVite�� ��������");
			mTextView.setText(sequence);
		}
		
		@Override
		public void onClick() {
			// TODO Auto-generated method stub
			AppToast.showToast(getApplicationContext(), "Dialog onClick()�� ����ɶ� �ݹ� onClick()�� ����");
			
		}
		
		@Override
		public void dismiss() {
			// TODO Auto-generated method stub
			AppToast.showToast(getApplicationContext(), "Dialog dismiss()�� ����ɶ� �ݹ� dismiss()�� ����");
			
		}
	};
	
	private Button[] mButtons;
	
	private void setLayout() {
		mButtons = new Button[]{
				(Button) findViewById(R.id.main_btn)};
		
		for (Button button : mButtons) {
			button.setOnClickListener(MainActivity.this);
		}
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.main_btn:
			customDialog = new CustomDialog(MainActivity.this, diialogCallback);
			customDialog.setTitle("��ƾƾƾƾƾ�");
			customDialog.show();
			break;
		}
	}
}
