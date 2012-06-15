package com.bean;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bean.ExpandablePanel.OnExpandListener;

public class ExpandablePanelActivity extends Activity {
	
	ExpandablePanelOld panel;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ExpandablePanel panel = (ExpandablePanel) findViewById(R.id.panel);
		TextView text = (TextView) findViewById(R.id.text);

		panel.setOnExpandListener(new OnExpandListener() {

			public void onExpand(View handle, View content) {
				ImageView indicate = (ImageView) handle;
				indicate.setImageResource(R.drawable.arrow_light_inverted);
			}

			public void onCollapse(View handle, View content) {
				ImageView indicate = (ImageView) handle;
				indicate.setImageResource(R.drawable.arrow_light);
			}
		});
		text.setText(R.string.hello);

		ExpandablePanel panel2 = (ExpandablePanel) findViewById(R.id.panel2);
		TextView text2 = (TextView) findViewById(R.id.text2);

		panel2.setOnExpandListener(new OnExpandListener() {

			public void onExpand(View handle, View content) {
				ImageView indicate = (ImageView) handle;
				indicate.setImageResource(R.drawable.arrow_light_inverted);
			}

			public void onCollapse(View handle, View content) {
				ImageView indicate = (ImageView) handle;
				indicate.setImageResource(R.drawable.arrow_light);
			}
		});
		
		text2.setText(R.string.big_text);

	}


}