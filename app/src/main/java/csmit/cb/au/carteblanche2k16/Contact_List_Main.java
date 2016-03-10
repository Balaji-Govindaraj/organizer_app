package csmit.cb.au.carteblanche2k16;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.MenuItem;
import android.view.View;


public class Contact_List_Main extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mylist_onsite);
		FloatingActionButton fab1 = (FloatingActionButton) findViewById(R.id.fab1);

		fab1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:8807019279"));
				startActivity(intent);

			}
		});
		FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.fab2);
		fab2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:9042210114"));
				startActivity(intent);
			}
		});
		FloatingActionButton fab3 = (FloatingActionButton) findViewById(R.id.fab3);
		fab3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:9094140227"));
				startActivity(intent);
			}
		});
		FloatingActionButton fab4 = (FloatingActionButton) findViewById(R.id.fab4);
		fab4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:9488956764"));
				startActivity(intent);
			}
		});
		FloatingActionButton fab5 = (FloatingActionButton) findViewById(R.id.fab5);
		fab5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:9789864587"));
				startActivity(intent);
			}
		});
		FloatingActionButton fab6 = (FloatingActionButton) findViewById(R.id.fab6);
		fab6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:9843743566"));
				startActivity(intent);
			}
		});
	}

}