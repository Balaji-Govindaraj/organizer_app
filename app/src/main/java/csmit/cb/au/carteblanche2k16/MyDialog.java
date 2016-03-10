package csmit.cb.au.carteblanche2k16;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MyDialog extends Activity {
	public static boolean active = false;
	public static Activity myDialog;

	TextView txt;
	EditText edt;
	Button btn;
	View top;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.dialog);

		txt=(TextView)findViewById(R.id.dialog_edt1);

		txt.setMovementMethod(ScrollingMovementMethod.getInstance());

		edt = (EditText) findViewById(R.id.dialog_edt);
		btn = (Button) findViewById(R.id.dialog_btn);
		top = (View)findViewById(R.id.dialog_top);
				
		myDialog = MyDialog.this;
		
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String str = edt.getText().toString();
				if(str.length() > 0){
					if(str.equals("help"))
					{
						txt.setText("\n\n\nHello,I am CB Bot.\nCommands\t\t\\n1.event\t\t\t\t\t\t\t\n2.workshop\t\t\t\t\n3.event ____\t\t\t\n4.workshop ____");
					}
					else if(str.equals("event"))
					{
						txt.setText("\n\n\ndebugging\nhacknight\ninscribed\nreverse coding\nstreet coding\nweb designing\nolpc\njuggernaut\nbits and bytes\nbug war\nchoose ur sim\nelectrocute\ninstru\nmu pro\nnet cracker\nnumberique\npentrive\ntech marathon\nauto quiz\ncad modelling\nhow tech works\n manufacturing quiz\nmetallography\nthe mechanic\ngaming\ngeneral quiz\nipl auction\nhackathon\nhow stuff works\nidea presentation\nmath o mania\npaper presentation\ntreasure hunt\nrobo wars\nrobo soccer\nline follower\nall terrain");
					}
					else if(str.equals("workshop"))
					{
						txt.setText("\n\n\nandriod workshop\nweb development\nnetworking and hacking\npython workshop\ninternet of things\narduiono workshop\nimage processing workshop\nautomotive engine\n3d printing workshop\nautomotive electronics");
					}
					else if(str.equals("event gaming"))
					{
						txt.append("\n\n\nThanks for texting");
					}
					else
					{
						txt.setText("\n\n\nPlease use help to see the procedure");
					}
//					ChatHeadService.showMsg(MyDialog.this, str);
					//Intent it = new Intent(MyDialog.this, ChatHeadService.class);
					//it.putExtra(Utils.EXTRA_MSG, str);
					//startService(it);
				}
			}
		});
		
		
		top.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		
	}
		
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		active = true;
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		active = false;
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		active = false;
	}

	
	
}
