package csmit.cb.au.carteblanche2k16;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.pushbots.push.Pushbots;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    public static int OVERLAY_PERMISSION_REQ_CODE_CHATHEAD = 1234;
    public static int OVERLAY_PERMISSION_REQ_CODE_CHATHEAD_MSG = 5678;
    public static Button btnStartService, btnShowMsg;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Pushbots.sharedInstance().init(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent=new Intent(Home.this,Login.class);
                startActivity(intent);
               // setContentView(R.layout.anima);
               // onSaveInstanceState(savedInstanceState);

            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Home.this);
            alertDialogBuilder.setTitle("Developer");
            alertDialogBuilder.setMessage("Designed and Developed by \n G.Balaji,Team Carte Blanche\n Phone Number:9840272346");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
            return true;
        }
        if (id == R.id.action_organizers) {

        }
        return super.onOptionsItemSelected(item);
    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_camera) {

        }

        if(id==R.id.elex_event)
        {
            Intent intent=new Intent(Home.this,event_elex.class);
            startActivity(intent);
        }
        if(id==R.id.general_event)
        {
            Intent intent=new Intent(Home.this,event_general.class);
            startActivity(intent);
        }
        if(id==R.id.robotics_event)
        {
            Intent intent=new Intent(Home.this,event_robotics.class);
            startActivity(intent);
        }
        if(id==R.id.mech_event)
        {
            Intent intent=new Intent(Home.this,event_mech.class);
            startActivity(intent);
        }
        if(id==R.id.online_event)
        {
            Intent intent=new Intent(Home.this,event_online.class);
            startActivity(intent);
        }
        if(id==R.id.partners)
        {
            Intent intent=new Intent(Home.this,partners.class);
            startActivity(intent);
        }
        else if (id == R.id.algo_event) {
            Intent intent=new Intent(Home.this,event_algo.class);
            startActivity(intent);
        }
        else if (id == R.id.algo_workshop) {
            Intent intent=new Intent(Home.this,workshop_algo.class);
            startActivity(intent);
        } else if (id == R.id.elex_workshop) {
            Intent intent=new Intent(Home.this,workshop_elex.class);
            startActivity(intent);

        } else if (id == R.id.mech_workshop) {
            Intent intent=new Intent(Home.this,workshop_mex.class);
            startActivity(intent);
        }
        else if(id==R.id.contact)
        {
            Intent intent=new Intent(Home.this,Contact_List_Main.class);
            startActivity(intent);
        }
        else if(id==R.id.chat)
        {
            if(Utils.canDrawOverlays(Home.this))
                showChatHeadMsg();
            else{
                requestPermission(OVERLAY_PERMISSION_REQ_CODE_CHATHEAD_MSG);
            }
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }























    private void startChatHead(){
        startService(new Intent(Home.this, ChatHeadService.class));
    }
    private void showChatHeadMsg(){
        java.util.Date now = new java.util.Date();
        String str = "test by henry  " + new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(now);

        Intent it = new Intent(Home.this, ChatHeadService.class);
        it.putExtra(Utils.EXTRA_MSG, str);
        startService(it);
    }

    private void needPermissionDialog(final int requestCode){
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(Home.this);
        builder.setMessage("You need to allow permission");
        builder.setPositiveButton("OK",
                new android.content.DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO Auto-generated method stub
                        requestPermission(requestCode);
                    }
                });
        builder.setNegativeButton("Cancel", new android.content.DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub

            }
        });
        builder.setCancelable(false);
        builder.show();
    }



    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();


    }

    private void requestPermission(int requestCode){
        Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION);
        intent.setData(Uri.parse("package:" + getPackageName()));
        startActivityForResult(intent, requestCode);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == OVERLAY_PERMISSION_REQ_CODE_CHATHEAD) {
            if (!Utils.canDrawOverlays(Home.this)) {
                needPermissionDialog(requestCode);
            }else{
                startChatHead();
            }

        }else if(requestCode == OVERLAY_PERMISSION_REQ_CODE_CHATHEAD_MSG){
            if (!Utils.canDrawOverlays(Home.this)) {
                needPermissionDialog(requestCode);
            }else{
                showChatHeadMsg();
            }

        }

    }



}
