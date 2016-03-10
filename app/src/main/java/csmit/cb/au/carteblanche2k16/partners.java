package csmit.cb.au.carteblanche2k16;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;

import com.nispok.snackbar.Snackbar;
import com.nispok.snackbar.SnackbarManager;

/**
 * Created by HP8 on 3/7/2016.
 */
public class partners extends Activity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anima);

        SnackbarManager.show(
                Snackbar.with(getApplicationContext())
                        .text("Scroll Down to See Our Partners")
                        .textColor(Color.BLACK)
                        .color(Color.WHITE)

                , this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }



}

