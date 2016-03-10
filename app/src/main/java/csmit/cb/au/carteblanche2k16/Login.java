package csmit.cb.au.carteblanche2k16;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP8 on 3/7/2016.
 */
public class Login extends Activity{

    TextView username;
    TextView password;
    TextView email;
    TextView phone;
    Spinner year;
    TextView college;
    Spinner department;
    Spinner accomodation;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        username=(TextView)findViewById(R.id.username);
        password=(TextView)findViewById(R.id.password);
        email=(TextView)findViewById(R.id.email);
        phone=(TextView)findViewById(R.id.phone);
        year=(Spinner)findViewById(R.id.year);
        college=(TextView)findViewById(R.id.college);
        department=(Spinner)findViewById(R.id.department);
        accomodation=(Spinner)findViewById(R.id.accomodation);


        List<String> categories21 = new ArrayList<String>();
        categories21.add("Need Accomodation?");
        categories21.add("Yes");
        categories21.add("No");

        ArrayAdapter<String> dataAdapter21 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories21);
        dataAdapter21.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        accomodation.setAdapter(dataAdapter21);

        List<String> categories22 = new ArrayList<String>();
        categories22.add("Year");
        categories22.add("1");
        categories22.add("2");
        categories22.add("3");
        categories22.add("4");
        categories22.add("5");

        ArrayAdapter<String> dataAdapter22 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories22);
        dataAdapter22.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        year.setAdapter(dataAdapter22);

        List<String> categories23 = new ArrayList<String>();
        categories23.add("Department");
        categories23.add("Aeronautical");
        categories23.add("Automobile");
        categories23.add("Bio-Medical");
        categories23.add("chemical");
        categories23.add("Computer Science");
        categories23.add("Electrical and Electronics");
        categories23.add("Elecctronics and Communication");
        categories23.add("Electronics and Instrumentation");
        categories23.add("Information Technology");
        categories23.add("Mechanical/Production");
        categories23.add("Rubber and plastics");
        categories23.add("others");

        ArrayAdapter<String> dataAdapter23 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories23);
        dataAdapter23.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        department.setAdapter(dataAdapter23);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.btn);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

    }

}

