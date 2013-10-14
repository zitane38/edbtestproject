package com.example.backgroundexample;

public class NameCardGroupItem {

	private String title;
	private boolean checked;
	
	
	public NameCardGroupItem(String title, boolean checked) {
		super();
		this.setTitle(title);
		this.setChecked(checked);
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public boolean isChecked() {
		return checked;
	}


	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	
	
}
