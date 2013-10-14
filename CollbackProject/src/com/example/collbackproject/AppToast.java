package com.example.collbackproject;

import android.content.Context;
import android.widget.Toast;

public class AppToast {
	public static Toast toast = null;

	/**
	 * @param String : message
	 */
	public static void showToast(Context context, String msg) {
		if(toast == null) toast = Toast.makeText(context, msg, Toast.LENGTH_LONG);
		else toast.setText(msg);
		toast.show();
	}

}
