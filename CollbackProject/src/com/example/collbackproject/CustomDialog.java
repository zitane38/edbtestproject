package com.example.collbackproject;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.TextView;

public class CustomDialog extends Dialog {

	private TextView textView;
	private DiialogCallback diialogCallback;
	
	public CustomDialog(Context context, DiialogCallback diialogCallback) {
		super(context);
		// TODO Auto-generated constructor stub
		this.diialogCallback = diialogCallback;
		setLayout();
	}
	
	private void setLayout(){
		setContentView(R.layout.dialog);
		findViewById(R.id.dialog_btn).setOnClickListener(clickListener);
		textView = (TextView)findViewById(R.id.dialog_tv);
	}

	View.OnClickListener clickListener = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			diialogCallback.onClick();
			setTitle(textView.getText().toString());
		}
	};
	
	@Override
	public void dismiss() {
		// TODO Auto-generated method stub
		super.dismiss();
		diialogCallback.dismiss();
	}

	@Override
	public void setTitle(CharSequence titleId) {
		// TODO Auto-generated method stub
		super.setTitle(titleId);
		diialogCallback.setTitle((CharSequence)titleId);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		diialogCallback.show();
	}
	
	
}
