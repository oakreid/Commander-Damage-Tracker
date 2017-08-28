package oreid.commanderdamagetracker;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class LifeTotals extends AppCompatActivity {
    //White Corner
    int w_life = 40;
    int w_times_cast = 0;
    int w_dmg_by_u = 0;
    int w_dmg_by_r = 0;
    int w_dmg_by_g = 0;
    //Blue Corner
    int u_life = 40;
    int u_times_cast = 0;
    int u_dmg_by_r = 0;
    int u_dmg_by_g = 0;
    int u_dmg_by_w = 0;
    //Green Corner
    int g_life = 40;
    int g_times_cast = 0;
    int g_dmg_by_w = 0;
    int g_dmg_by_u = 0;
    int g_dmg_by_r = 0;
    //Red Corner
    int r_life = 40;
    int r_times_cast = 0;
    int r_dmg_by_g = 0;
    int r_dmg_by_w = 0;
    int r_dmg_by_u = 0;

    SharedPreferences settings;

    public void gLifeInc(View view) {
        g_life ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.green_life);
        displayCounter(g_life, displayInteger);
    }

    public void gLifeDec(View view) {
        g_life --;
        TextView displayInteger = (TextView) findViewById(
                R.id.green_life);
        displayCounter(g_life, displayInteger);
    }

    public void gTCInc(View view) {
        g_times_cast ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.green_times_cast);
        displayCounter(g_times_cast, displayInteger);
    }

    public void gTCDec(View view) {
        g_times_cast --;
        TextView displayInteger = (TextView) findViewById(
                R.id.green_times_cast);
        displayCounter(g_times_cast, displayInteger);
    }

    public void gWDmgInc(View view) {
        g_dmg_by_w ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.green_cmdr_dmg_w);
        displayCounter(g_dmg_by_w, displayInteger);
    }

    public void gWDmgDec(View view) {
        g_dmg_by_w --;
        TextView displayInteger = (TextView) findViewById(
                R.id.green_cmdr_dmg_w);
        displayCounter(g_dmg_by_w, displayInteger);
    }

    public void gUDmgInc(View view) {
        g_dmg_by_u ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.green_cmdr_dmg_u);
        displayCounter(g_dmg_by_u, displayInteger);
    }

    public void gUDmgDec(View view) {
        g_dmg_by_u--;
        TextView displayInteger = (TextView) findViewById(
                R.id.green_cmdr_dmg_u);
        displayCounter(g_dmg_by_u, displayInteger);
    }

    public void gRDmgInc(View view) {
        g_dmg_by_r ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.green_cmdr_dmg_r);
        displayCounter(g_dmg_by_r, displayInteger);
    }

    public void gRDmgDec(View view) {
        g_dmg_by_r --;
        TextView displayInteger = (TextView) findViewById(
                R.id.green_cmdr_dmg_r);
        displayCounter(g_dmg_by_r, displayInteger);
    }

    public void rLifeInc(View view) {
        r_life ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.red_life);
        displayCounter(r_life, displayInteger);
    }

    public void rLifeDec(View view) {
        r_life --;
        TextView displayInteger = (TextView) findViewById(
                R.id.red_life);
        displayCounter(r_life, displayInteger);
    }

    public void rTCInc(View view) {
        r_times_cast ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.red_times_cast);
        displayCounter(r_times_cast, displayInteger);
    }

    public void rTCDec(View view) {
        r_times_cast --;
        TextView displayInteger = (TextView) findViewById(
                R.id.red_times_cast);
        displayCounter(r_times_cast, displayInteger);
    }

    public void rWDmgInc(View view) {
        r_dmg_by_w ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.red_cmdr_dmg_w);
        displayCounter(r_dmg_by_w, displayInteger);
    }

    public void rWDmgDec(View view) {
        r_dmg_by_w --;
        TextView displayInteger = (TextView) findViewById(
                R.id.red_cmdr_dmg_w);
        displayCounter(r_dmg_by_w, displayInteger);
    }

    public void rUDmgInc(View view) {
        r_dmg_by_u ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.red_cmdr_dmg_u);
        displayCounter(r_dmg_by_u, displayInteger);
    }

    public void rUDmgDec(View view) {
        r_dmg_by_u --;
        TextView displayInteger = (TextView) findViewById(
                R.id.red_cmdr_dmg_u);
        displayCounter(r_dmg_by_u, displayInteger);
    }

    public void rGDmgInc(View view) {
        r_dmg_by_g ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.red_cmdr_dmg_g);
        displayCounter(r_dmg_by_g, displayInteger);
    }

    public void rGDmgDec(View view) {
        r_dmg_by_g --;
        TextView displayInteger = (TextView) findViewById(
                R.id.red_cmdr_dmg_g);
        displayCounter(r_dmg_by_g, displayInteger);
    }

    public void uLifeInc(View view) {
        u_life ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.blue_life);
        displayCounter(u_life, displayInteger);
    }

    public void uLifeDec(View view) {
        u_life --;
        TextView displayInteger = (TextView) findViewById(
                R.id.blue_life);
        displayCounter(u_life, displayInteger);
    }

    public void uTCInc(View view) {
        u_times_cast ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.blue_times_cast);
        displayCounter(u_times_cast, displayInteger);
    }

    public void uTCDec(View view) {
        u_times_cast --;
        TextView displayInteger = (TextView) findViewById(
                R.id.blue_times_cast);
        displayCounter(u_times_cast, displayInteger);
    }

    public void uWDmgInc(View view) {
        u_dmg_by_w ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.blue_cmdr_dmg_w);
        displayCounter(u_dmg_by_w, displayInteger);
    }

    public void uWDmgDec(View view) {
        u_dmg_by_w --;
        TextView displayInteger = (TextView) findViewById(
                R.id.blue_cmdr_dmg_w);
        displayCounter(u_dmg_by_w, displayInteger);
    }

    public void uRDmgInc(View view) {
        u_dmg_by_r ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.blue_cmdr_dmg_r);
        displayCounter(u_dmg_by_r, displayInteger);
    }

    public void uRDmgDec(View view) {
        u_dmg_by_r --;
        TextView displayInteger = (TextView) findViewById(
                R.id.blue_cmdr_dmg_r);
        displayCounter(u_dmg_by_r, displayInteger);
    }

    public void uGDmgInc(View view) {
        u_dmg_by_g ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.blue_cmdr_dmg_g);
        displayCounter(u_dmg_by_g, displayInteger);
    }

    public void uGDmgDec(View view) {
        u_dmg_by_g --;
        TextView displayInteger = (TextView) findViewById(
                R.id.blue_cmdr_dmg_g);
        displayCounter(u_dmg_by_g, displayInteger);
    }

    public void wLifeInc(View view) {
        w_life ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.white_life);
        displayCounter(w_life, displayInteger);
    }

    public void wLifeDec(View view) {
        w_life --;
        TextView displayInteger = (TextView) findViewById(
                R.id.white_life);
        displayCounter(w_life, displayInteger);
    }

    public void wTCInc(View view) {
        w_times_cast ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.white_times_cast);
        displayCounter(w_times_cast, displayInteger);
    }

    public void wTCDec(View view) {
        w_times_cast --;
        TextView displayInteger = (TextView) findViewById(
                R.id.white_times_cast);
        displayCounter(w_times_cast, displayInteger);
    }

    public void wUDmgInc(View view) {
        w_dmg_by_u ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.white_cmdr_dmg_u);
        displayCounter(w_dmg_by_u, displayInteger);
    }

    public void wUDmgDec(View view) {
        w_dmg_by_u --;
        TextView displayInteger = (TextView) findViewById(
                R.id.white_cmdr_dmg_u);
        displayCounter(w_dmg_by_u, displayInteger);
    }

    public void wRDmgInc(View view) {
        w_dmg_by_r ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.white_cmdr_dmg_r);
        displayCounter(w_dmg_by_r, displayInteger);
    }

    public void wRDmgDec(View view) {
        w_dmg_by_r --;
        TextView displayInteger = (TextView) findViewById(
                R.id.white_cmdr_dmg_r);
        displayCounter(w_dmg_by_r, displayInteger);
    }

    public void wGDmgInc(View view) {
        w_dmg_by_g ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.white_cmdr_dmg_g);
        displayCounter(w_dmg_by_g, displayInteger);
    }

    public void wGDmgDec(View view) {
        w_dmg_by_g --;
        TextView displayInteger = (TextView) findViewById(
                R.id.white_cmdr_dmg_g);
        displayCounter(w_dmg_by_g, displayInteger);
    }

    public void gotoSettings(View view) {
        startActivity(new Intent(LifeTotals.this, SettingsMenu.class));
    }

    private void displayCounter(int number, TextView v) {
        v.setText("" + number);
    }

    //First attempt at a method that will allow the counters to be reset in-app
    //SIDE EFFECTS: All Life Totals will return to 40 and all counter will go to 0
    //Attempt one-the hardcode
    public void reset(View view) {
        //White Corner
        w_life = 40;
        w_times_cast = 0;
        w_dmg_by_u = 0;
        w_dmg_by_r = 0;
        w_dmg_by_g = 0;
        //Blue Corner
        u_life = 40;
        u_times_cast = 0;
        u_dmg_by_r = 0;
        u_dmg_by_g = 0;
        u_dmg_by_w = 0;
        //Green Corner
        g_life = 40;
        g_times_cast = 0;
        g_dmg_by_w = 0;
        g_dmg_by_u = 0;
        g_dmg_by_r = 0;
        //Red Corner
        r_life = 40;
        r_times_cast = 0;
        r_dmg_by_g = 0;
        r_dmg_by_w = 0;
        r_dmg_by_u = 0;
        //Should display all changes to all counters done by the reset
        initializeAllCounters();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
        settings = PreferenceManager.getDefaultSharedPreferences(this);
        settings.registerOnSharedPreferenceChangeListener(
                new SharedPreferences.OnSharedPreferenceChangeListener() {
            @Override
            public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
                switch (key) {
                    case "starting_life":
                        w_life = Integer.parseInt(sharedPreferences.getString(key, "40"));
                        r_life = Integer.parseInt(sharedPreferences.getString(key, "40"));
                        g_life = Integer.parseInt(sharedPreferences.getString(key, "40"));
                        u_life = Integer.parseInt(sharedPreferences.getString(key, "40"));
                        break;
                    case "p1_color":
                        //do stuff
                        break;
                    case "p2_color":
                        //do stuff
                        break;
                    case "p3_color":
                        //do stuff
                        break;
                    case "p4_color":
                        //do stuff
                        break;
                 }
                 initializeAllCounters();
            }
        });

        setContentView(R.layout.activity_life_totals);

        initializeAllCounters();
    }

    private void initializeAllCounters() {
        displayCounter(g_life, (TextView) findViewById(
                R.id.green_life));

        displayCounter(g_times_cast, (TextView) findViewById(
                R.id.green_times_cast));

        displayCounter(g_dmg_by_w, (TextView) findViewById(
                R.id.green_cmdr_dmg_w));

        displayCounter(g_dmg_by_u, (TextView) findViewById(
                R.id.green_cmdr_dmg_u));

        displayCounter(g_dmg_by_r, (TextView) findViewById(
                R.id.green_cmdr_dmg_r));

        displayCounter(r_life, (TextView) findViewById(
                R.id.red_life));

        displayCounter(r_times_cast, (TextView) findViewById(
                R.id.red_times_cast));

        displayCounter(r_dmg_by_w, (TextView) findViewById(
                R.id.red_cmdr_dmg_w));

        displayCounter(r_dmg_by_u, (TextView) findViewById(
                R.id.red_cmdr_dmg_u));

        displayCounter(r_dmg_by_g, (TextView) findViewById(
                R.id.red_cmdr_dmg_g));

        displayCounter(u_life, (TextView) findViewById(
                R.id.blue_life));

        displayCounter(u_times_cast, (TextView) findViewById(
                R.id.blue_times_cast));

        displayCounter(u_dmg_by_w, (TextView) findViewById(
                R.id.blue_cmdr_dmg_w));

        displayCounter(u_dmg_by_r, (TextView) findViewById(
                R.id.blue_cmdr_dmg_r));

        displayCounter(u_dmg_by_g, (TextView) findViewById(
                R.id.blue_cmdr_dmg_g));

        displayCounter(w_life, (TextView) findViewById(
                R.id.white_life));

        displayCounter(w_times_cast, (TextView) findViewById(
                R.id.white_times_cast));

        displayCounter(w_dmg_by_u, (TextView) findViewById(
                R.id.white_cmdr_dmg_u));

        displayCounter(w_dmg_by_r, (TextView) findViewById(
                R.id.white_cmdr_dmg_r));

        displayCounter(w_dmg_by_g, (TextView) findViewById(
                R.id.white_cmdr_dmg_g));
    }
}