package com.example.backgroundexample;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.Button;

public class SignImageView extends Button {

	public static final int NAMECARDSIGN = 0X01;
	public static final int BUTTONSIGNRIGHT = 0X02;
	public static final int BUTTONSIGNTOP = 0X03;
	public static final int BUTTONSIGNBOTTOM = 0X04;
	public static final int BUTTONSIGNPHONE = 0X05;
	public static final int BUTTONSIGNANGLE = 0X06;
	public static final int BUTTONSIGEMAIL = 0X07;
	public static final int BUTTONSIGCOLOR = 0X08;
	public static final int ETSIGNSPINNER = 0X09;
	public static final int BUTTONSIGNRIGHT02 = 0X10;
	public static final int BUTTONSIGNTOP02 = 0X11;
	public static final int BUTTONSIGNBOTTOM02 = 0X12;
	public static final int BUTTONSIGNBACK = 0X13;
	public static final int BUTTONSIGNHELP = 0X14;
	public static final int NAMECARDSIGN02 = 0X15;
	public static final int BUTTONSIGNETC = 0X16;
	public static final int BUTTONSIGNURL = 0X17;
	public static final int INFOSIGN = 0X18;
	private int mode;
	
	/**
	 * @param context
	 */
	public SignImageView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param context
	 * @param attrs
	 */
	public SignImageView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public SignImageView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	// 이 뷰의 크기가 처음 결정되거나, 이후 변경될 때 실행
	// 뷰의 크기를 판단하여 어떤 작업을 수행해야 하는 경우,
	// 이 메서드에서 혹은 이 메서드 실행 후에 판단해야 한다.
	// 현 너비, 현 높이, 변경전 너비, 변경전 높이
	@Override
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		// TODO Auto-generated method stub
		super.onSizeChanged(w, h, oldw, oldh);
	}
	
	public void setMode(int mode) {
		this.mode = mode;
	}

	@SuppressLint("DrawAllocation")
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		Paint pnt = new Paint(); // 붓과 물감 역할을 하는 객체
		
		switch (mode) {
		case NAMECARDSIGN:
			pnt.setStyle(Style.FILL);
			pnt.setAntiAlias(true);
			drawRectanglePath(canvas, pnt, 0, 0, 0, 
					new int[] {0, 9, 50, 1, 62, 19, 4, 29, 0, 9});
			drawRectanglePath(canvas, pnt, 123, 128, 154, 
					new int[] {0, 8, 50, 0, 62, 18, 4, 28, 0, 8});
			drawRectanglePath(canvas, pnt, 0, 0, 0, 
					new int[] {25, 13, 82, 26, 75, 54, 10, 35, 25, 13});
			drawRectanglePath(canvas, pnt, 182, 188, 226, 
					new int[] {25, 12, 82, 25, 75, 53, 10, 34, 25, 12});
			break;
		case BUTTONSIGNRIGHT:
			pnt.setStyle(Style.FILL);
			pnt.setAntiAlias(true);
			drawRectanglePath(canvas, pnt, 182, 188, 226, 
					new int[] {2, 0, 23, 21, 2, 42, 0, 40, 19, 21, 0, 2, 2, 0});
			break;
		case BUTTONSIGNBOTTOM:
			pnt.setStyle(Style.FILL);
			pnt.setAntiAlias(true);
			drawRectanglePath(canvas, pnt, 243, 243, 255, 
					new int[] {0, 2, 21, 23, 42, 2,	40, 0, 21, 19, 2, 0, 0, 2});
			break;
		case BUTTONSIGNTOP:
			pnt.setStyle(Style.FILL);
			pnt.setAntiAlias(true);
			drawRectanglePath(canvas, pnt, 243, 243, 255, 
					new int[] {0, 21, 21, 0, 42, 21, 40, 23, 21, 4, 2, 23, 0, 21});
			break;
		case BUTTONSIGNPHONE:
			pnt.setStyle(Style.STROKE);
			pnt.setAntiAlias(true);
//			pnt.setColor(Color.rgb(42, 42, 64));
			pnt.setColor(Color.rgb(87, 87, 102));
			pnt.setStrokeWidth(6);
			pnt.setStrokeCap(Paint.Cap.ROUND);
			Path path01 = new Path();
			path01.moveTo(37, 30);
			path01.lineTo(37, 9);
			path01.cubicTo(37, 9, 37, 5, 41, 5);
			path01.lineTo(81, 5);
			path01.cubicTo(81, 5, 85, 5, 85, 9);
			path01.lineTo(85, 73);
			path01.cubicTo(85, 73, 85, 77, 81, 77);
			path01.lineTo(41, 77);
			path01.cubicTo(41, 77, 37, 77, 37, 73);
			path01.lineTo(37, 52);
			path01.moveTo(5, 41);
			path01.lineTo(67, 41);
			path01.moveTo(49, 25);
			path01.lineTo(67, 41);
			path01.moveTo(49, 57);
			path01.lineTo(67, 41);
			canvas.drawPath(path01, pnt);
			path01.close();
			break;
		case BUTTONSIGNANGLE:
			pnt.setStyle(Style.STROKE);
			pnt.setAntiAlias(true);
//			pnt.setColor(Color.rgb(42, 42, 64));
			pnt.setColor(Color.rgb(87, 87, 102));
			pnt.setStrokeWidth(6);
			pnt.setStrokeCap(Paint.Cap.ROUND);
			Path path02 = new Path();
			path02.moveTo(66, 11);
			path02.lineTo(85, 82);
			path02.cubicTo(85, 82, 85, 85, 82, 85);
			path02.lineTo(5, 85);
			
			// 화살표
			path02.moveTo(36, 16);
			path02.lineTo(51, 20);
			path02.cubicTo(51, 20, 54, 20, 54, 23);
			path02.lineTo(50, 39);
			path02.moveTo(16, 71);
			path02.cubicTo(16, 71, 16, 37, 53, 22);
			
			path02.moveTo(66, 82);
			path02.cubicTo(66, 82, 66, 71, 77, 68);			
			canvas.drawPath(path02, pnt);
			path02.close();
			break;
		case BUTTONSIGEMAIL:
			pnt.setStyle(Style.STROKE);
			pnt.setAntiAlias(true);
//			pnt.setColor(Color.rgb(42, 42, 64));
			pnt.setColor(Color.rgb(87, 87, 102));
			pnt.setStrokeWidth(10);
			pnt.setStrokeCap(Paint.Cap.ROUND);
			Path path03 = new Path();
			path03.moveTo(5, 9);
			path03.lineTo(105, 9);
			canvas.drawPath(path03, pnt);
			
			pnt.setStrokeWidth(6);
			path03.moveTo(22, 9);
			path03.lineTo(12, 37);
			path03.cubicTo(12, 37, 12, 40, 15, 40);
			path03.lineTo(95, 40);
			path03.cubicTo(95, 40, 98, 40, 98, 37);
			path03.lineTo(88, 9);
			canvas.drawPath(path03, pnt);
			
			pnt.setStrokeCap(Paint.Cap.BUTT);
			pnt.setStyle(Style.FILL);
			pnt.setColor(Color.rgb(243, 243, 255));
			Path path04 = new Path();
			path04.moveTo(25, 9);
			path04.lineTo(15, 37);
			path04.lineTo(95, 37);
			path04.lineTo(85, 9);
			canvas.drawPath(path04, pnt);
			path03.close();
			break;
		case BUTTONSIGCOLOR:
			pnt.setStyle(Style.STROKE);
			pnt.setAntiAlias(true);
//			pnt.setColor(Color.rgb(42, 42, 64));
			pnt.setColor(Color.rgb(87, 87, 102));
			pnt.setStrokeWidth(6);
			pnt.setStrokeCap(Paint.Cap.ROUND);
			Path path05 = new Path();
			path05.moveTo(32, 63);
			path05.lineTo(32, 51);
			path05.cubicTo(32, 51, 32, 48, 35, 48);
			path05.lineTo(52, 48);
			path05.lineTo(52, 14);
			path05.cubicTo(52, 14, 52, 6, 58, 6);
			path05.cubicTo(58, 6, 64, 6, 64, 14);
			path05.lineTo(64, 48);
			path05.lineTo(81, 48);
			path05.cubicTo(81, 48, 84, 48, 84, 51);
			path05.lineTo(84, 63);
			path05.lineTo(32, 63);
			path05.moveTo(32, 63);
			path05.cubicTo(32, 63, 32, 84, 24, 84);
			path05.lineTo(76, 84);
			path05.cubicTo(76, 84, 84, 84, 84, 63);
			path05.moveTo(5, 84);
			path05.lineTo(76, 84);
			canvas.drawPath(path05, pnt);
			break;
		case ETSIGNSPINNER:
			pnt.setStyle(Style.FILL);
			pnt.setAntiAlias(true);
			pnt.setColor(Color.rgb(243, 243, 255));
			Path path06 = new Path();
			path06.moveTo(0, 0);
			path06.lineTo(20, 0);
			path06.lineTo(10, 16);
			path06.lineTo(0, 0);
			canvas.drawPath(path06, pnt);
			break;
		case BUTTONSIGNRIGHT02:
			pnt.setStyle(Style.STROKE);
			pnt.setAntiAlias(true);
			pnt.setColor(Color.rgb(184, 191, 229));
			pnt.setStrokeWidth(4);
			pnt.setStrokeCap(Paint.Cap.BUTT);
			Path path07 = new Path();
			path07.moveTo(2, 2);
			path07.lineTo(24, 24);
			path07.lineTo(2, 46);
			canvas.drawPath(path07, pnt);
			break;
		case BUTTONSIGNBACK:
//			pnt.setStyle(Style.FILL);
			pnt.setAntiAlias(true);
//			pnt.setColor(Color.rgb(49, 49, 75));
//			pnt.setStrokeWidth(2);
			Path path08 = new Path();
//			path08.addCircle(45, 45, 1000, Direction.CW);
//			canvas.drawPath(path08, pnt);
			
//			path08.reset();
			pnt.setStyle(Style.STROKE);
			pnt.setStrokeCap(Paint.Cap.ROUND);
			pnt.setColor(Color.rgb(238, 238, 80));
			pnt.setStrokeWidth(6);
			path08.moveTo(50, 45);
			path08.lineTo(94, 45);
			path08.moveTo(67, 28);
			path08.lineTo(50, 45);
			path08.moveTo(67, 62);
			path08.lineTo(50, 45);
			canvas.drawPath(path08, pnt);
						
//			path08.reset();
//			pnt.reset();
//			pnt.setStyle(Style.STROKE);
//			pnt.setColor(Color.rgb(47, 47, 70));
//			pnt.setStrokeWidth(1);
//			path08.moveTo(149, 15);
//			path08.lineTo(149, 75);
//			canvas.drawPath(path08, pnt);
			break;
			
		case BUTTONSIGNHELP:
			pnt.setStyle(Style.STROKE);
			pnt.setAntiAlias(true);
			pnt.setColor(Color.rgb(184, 191, 229));
			pnt.setStrokeWidth(6);
			pnt.setStrokeCap(Paint.Cap.ROUND);
			Path path09 = new Path();
			path09.moveTo(32, 32);
			path09.cubicTo(32, 32, 32, 19, 45, 19);
			path09.cubicTo(45, 19 , 58, 19, 58, 32);
			path09.cubicTo(58, 32, 58, 44, 45, 44);
			path09.lineTo(45, 50);
			path09.moveTo(45, 63);
			path09.lineTo(45, 64);
			canvas.drawPath(path09, pnt);
			break;
			
		case NAMECARDSIGN02:
			pnt.setStyle(Style.STROKE);
			pnt.setStrokeCap(Paint.Cap.ROUND);
			pnt.setAntiAlias(true);
//			pnt.setColor(Color.rgb(42, 42, 64));
			pnt.setColor(Color.rgb(87, 87, 102));
			pnt.setStrokeWidth(6);
			Path path10 = new Path();
			path10.moveTo(8, 29);
			path10.cubicTo(8, 29, 8, 24, 13, 24);
			path10.lineTo(76, 24);
			path10.cubicTo(76, 24, 81, 24, 81, 29);
			path10.lineTo(81, 62);
			path10.cubicTo(81, 62, 81, 67, 76, 67);
			path10.lineTo(13, 67);
			path10.cubicTo(13, 67, 8, 67, 8, 62);
			path10.lineTo(8, 29);
			
			path10.moveTo(16, 21);
			path10.cubicTo(16, 21, 16, 16, 21, 16);
			path10.lineTo(84, 16);
			path10.cubicTo(84, 16, 89, 16, 89, 21);
			path10.lineTo(89, 54);
			path10.cubicTo(89, 54, 89, 59, 84, 59);
			
			path10.moveTo(24, 13);
			path10.cubicTo(24, 13, 24, 8, 29, 8);
			path10.lineTo(92, 8);
			path10.cubicTo(92, 8, 97, 8, 97, 13);
			path10.lineTo(97, 46);
			path10.cubicTo(97, 46, 97, 51, 92, 51);
			canvas.drawPath(path10, pnt);
			
			break;
		case BUTTONSIGNETC:
			pnt.setStyle(Style.FILL);
			pnt.setAntiAlias(true);
//			pnt.setColor(Color.rgb(42, 42, 64));
			pnt.setColor(Color.rgb(87, 87, 102));
			Path path11 = new Path();
			path11.moveTo(49, 71);
			path11.lineTo(49, 62);
			path11.lineTo(98, 13);
			path11.lineTo(101, 16);
			path11.lineTo(54, 63);
			path11.lineTo(57, 66);
			path11.lineTo(104, 19);
			path11.lineTo(107, 22);
			path11.lineTo(58, 71);
			path11.lineTo(49, 71);

			path11.moveTo(101, 10);
			path11.lineTo(105, 6);
			path11.cubicTo(105, 6, 107, 4, 110, 6);
			path11.lineTo(114, 10);
			path11.cubicTo(114, 10, 116, 13, 114, 15);
			path11.lineTo(110, 19);
			path11.lineTo(101, 10);
			canvas.drawPath(path11, pnt);

			path11.reset();
			pnt.setStyle(Style.STROKE);
			pnt.setStrokeCap(Paint.Cap.ROUND);
			pnt.setStrokeWidth(6);
			path11.moveTo(5, 72);
			path11.lineTo(45, 72);
			path11.moveTo(5, 42);
			path11.lineTo(55, 42);
			path11.moveTo(5, 10);
			path11.lineTo(85, 10);
			canvas.drawPath(path11, pnt);
			break;
			
		case BUTTONSIGNURL:
			pnt.setStyle(Style.STROKE);
			pnt.setStrokeCap(Paint.Cap.ROUND);
			pnt.setStrokeWidth(6);
			pnt.setAntiAlias(true);
//			pnt.setColor(Color.rgb(42, 42, 64));
			pnt.setColor(Color.rgb(87, 87, 102));
			Path path12 = new Path();
			path12.moveTo(31, 32);
			path12.cubicTo(31, 32, 26, 32, 31, 27);
			path12.lineTo(47, 10);
			path12.cubicTo(47, 10, 50, 6, 53, 10);
			path12.lineTo(69, 27);
			path12.cubicTo(69, 27, 74, 32, 69, 32);
			path12.lineTo(31, 32);
			
			path12.moveTo(35, 32);
			path12.lineTo(35, 48);
			path12.cubicTo(35, 48, 35, 51, 38, 51);
			path12.lineTo(62, 51);
			path12.cubicTo(62, 51, 65, 51, 65, 48);
			path12.lineTo(65, 32);
			path12.moveTo(3, 67);
			path12.lineTo(97, 67);
			path12.moveTo(50, 49);
			path12.lineTo(50, 67);
			canvas.drawPath(path12, pnt);
			
			path12.reset();
			pnt.reset();
			pnt.setStyle(Style.STROKE);
			pnt.setStrokeCap(Paint.Cap.ROUND);
//			pnt.setColor(Color.rgb(42, 42, 64));
			pnt.setColor(Color.rgb(87, 87, 102));
			pnt.setStrokeWidth(10);
			pnt.setAntiAlias(true);
			path12.moveTo(50, 43);
			path12.lineTo(50, 49);
			canvas.drawPath(path12, pnt);
			break;
			
		case INFOSIGN:
			pnt.setStyle(Style.FILL);
			pnt.setAntiAlias(true);
			pnt.setColor(Color.rgb(238, 238, 80));
			Path path13 = new Path();
			path13.addCircle(74, 28, 6, Direction.CCW);
			path13.moveTo(65, 38);
			path13.lineTo(79, 38);
			path13.lineTo(79, 63);
			path13.lineTo(84, 63);
			path13.lineTo(84, 68);
			path13.lineTo(65, 68);
			path13.lineTo(65, 63);
			path13.lineTo(70, 63);
			path13.lineTo(70, 42);
			path13.lineTo(65, 42);
			path13.lineTo(65, 38);
			canvas.drawPath(path13, pnt);
			
//			path13.reset();
//			pnt.reset();
//			pnt.setStyle(Style.STROKE);
//			pnt.setColor(Color.rgb(47, 47, 70));
//			pnt.setStrokeWidth(1);
//			path13.moveTo(1, 15);
//			path13.lineTo(1, 75);
//			canvas.drawPath(path13, pnt);
			break;
			
		}
		super.onDraw(canvas);
	}

	/**
	 * @param pnt
	 * @return
	 */
	private void drawRectanglePath(Canvas canvas, Paint pnt, 
			int r, int g, int b, int[] xys) {
		pnt.setColor(Color.rgb(r, g, b));
		Path path = new Path();
		int cnt = xys.length / 2;
		int index = 0;
		for (int i = 0; i < cnt; i++) {
			if(i == 0) path.moveTo(xys[i], xys[i + 1]);
			path.lineTo(xys[index], xys[index + 1]);
			index += 2;
		}
		canvas.drawPath(path, pnt);
		path.close();
	}

}
