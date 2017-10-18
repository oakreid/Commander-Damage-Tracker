package oreid.commanderdamagetracker;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import static oreid.commanderdamagetracker.R.color.mtg_black;
import static oreid.commanderdamagetracker.R.color.mtg_green;
import static oreid.commanderdamagetracker.R.color.mtg_red;
import static oreid.commanderdamagetracker.R.color.mtg_blue;
import static oreid.commanderdamagetracker.R.color.mtg_white;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class LifeTotals extends AppCompatActivity {
    /*
    +----------------------------------------+
    |                   |                    |
    |     player_2      |     player_1       |
    |                   |                    |
    --------------------|---------------------
    |                   |                    |
    |     player_3      |     player_4       |
    |                   |                    |
    +----------------------------------------+
     */
    int lifeTotal = 40;
    //player_2 Corner
    int player_2_life = lifeTotal;
    int player_2_times_cast = 0;
    int player_2_dmg_by_1 = 0;
    int player_2_dmg_by_4 = 0;
    int player_2_dmg_by_3 = 0;
    //player_1 Corner
    int player_1_life = lifeTotal;
    int player_1_times_cast = 0;
    int player_1_dmg_by_4 = 0;
    int player_1_dmg_by_3 = 0;
    int player_1_dmg_by_2 = 0;
    //player_3 Corner
    int player_3_life = lifeTotal;
    int player_3_times_cast = 0;
    int player_3_dmg_by_2 = 0;
    int player_3_dmg_by_1 = 0;
    int player_3_dmg_by_4 = 0;
    //player_4 Corner
    int player_4_life = lifeTotal;
    int player_4_times_cast = 0;
    int player_4_dmg_by_3 = 0;
    int player_4_dmg_by_2 = 0;
    int player_4_dmg_by_1 = 0;
    //Settings
    SharedPreferences settings;

    public void playerThreeUpdate(View v) {
        //values generated through the xml tags on buttons
        String tag = v.getTag().toString();
        String field = tag.split(",")[0];
        int change = Integer.parseInt(tag.split(",")[1]);
        //values filled by Switch statement
        int rid = 0;
        int counterToChange = 0;
        switch (field) {
            case "player_3_life":
                rid = R.id.player_3_life;
                player_3_life += change;
                counterToChange = player_3_life;
                break;
            case "player_3_times_cast":
                rid = R.id.player_3_times_cast;
                player_3_times_cast += change;
                counterToChange = player_3_times_cast;
                break;
            case "player_3_dmg_by_2":
                rid = R.id.player_3_cmdr_dmg_2;
                player_3_dmg_by_2 += change;
                counterToChange = player_3_dmg_by_2;
                break;
            case "player_3_dmg_by_1":
                rid = R.id.player_3_cmdr_dmg_1;
                player_3_dmg_by_1 += change;
                counterToChange = player_3_dmg_by_1;
                break;
            case "player_3_dmg_by_4":
                rid = R.id.player_3_cmdr_dmg_4;
                player_3_dmg_by_4 += change;
                counterToChange = player_3_dmg_by_4;
                break;
            default:
        }
        displayChange(rid, counterToChange);
    }
    //End of tester
    public void playerFourUpdate(View v) {
        //values generated through the xml tags on buttons
        String tag = v.getTag().toString();
        String field = tag.split(",")[0];
        int change = Integer.parseInt(tag.split(",")[1]);
        //values filled by Switch statement
        int rid = 0;
        int counterToChange = 0;
        switch(field) {
            case "player_4_life":
                rid = R.id.player_4_life;
                player_4_life += change;
                counterToChange = player_4_life;
                break;
            case "player_4_times_cast":
                rid = R.id.player_4_times_cast;
                player_4_times_cast += change;
                counterToChange = player_4_times_cast;
                break;
            case "player_4_dmg_by_2":
                rid = R.id.player_4_cmdr_dmg_2;
                player_4_dmg_by_2 += change;
                counterToChange = player_4_dmg_by_2;
                break;
            case "player_4_dmg_by_1":
                rid = R.id.player_4_cmdr_dmg_1;
                player_4_dmg_by_1 += change;
                counterToChange = player_4_dmg_by_1;
                break;
            case "player_4_dmg_by_3":
                rid = R.id.player_4_cmdr_dmg_3;
                player_4_dmg_by_3 += change;
                counterToChange = player_4_dmg_by_3;
                break;
            default:
        }
        displayChange(rid,counterToChange);
    }

    public void playerOneUpdate(View v) {
        //values generated through the xml tags on buttons
        String tag = v.getTag().toString();
        String field = tag.split(",")[0];
        int change = Integer.parseInt(tag.split(",")[1]);
        //values filled by Switch statement
        int rid = 0;
        int counterToChange = 0;
        switch(field) {
            case "player_1_life":
                rid = R.id.player_1_life;
                player_1_life += change;
                counterToChange = player_1_life;
                break;
            case "player_1_times_cast":
                rid = R.id.player_1_times_cast;
                player_1_times_cast += change;
                counterToChange = player_1_times_cast;
                break;
            case "player_1_dmg_by_2":
                rid = R.id.player_1_cmdr_dmg_2;
                player_1_dmg_by_2 += change;
                counterToChange = player_1_dmg_by_2;
                break;
            case "player_1_dmg_by_4":
                rid = R.id.player_1_cmdr_dmg_4;
                player_1_dmg_by_4 += change;
                counterToChange = player_1_dmg_by_4;
                break;
            case "player_1_dmg_by_3":
                rid = R.id.player_1_cmdr_dmg_3;
                player_1_dmg_by_3 += change;
                counterToChange = player_1_dmg_by_3;
                break;
            default:
        }
        displayChange(rid,counterToChange);
    }

    public void playerTwoUpdate(View v) {
        //values generated through the xml tags on buttons
        String tag = v.getTag().toString();
        String field = tag.split(",")[0];
        int change = Integer.parseInt(tag.split(",")[1]);
        //values filled by Switch statement
        int rid = 0;
        int counterToChange = 0;
        switch(field) {
            case "player_2_life":
                rid = R.id.player_2_life;
                player_2_life += change;
                counterToChange = player_2_life;
                break;
            case "player_2_times_cast":
                rid = R.id.player_2_times_cast;
                player_2_times_cast += change;
                counterToChange = player_2_times_cast;
                break;
            case "player_2_dmg_by_1":
                rid = R.id.player_2_cmdr_dmg_1;
                player_2_dmg_by_1 += change;
                counterToChange = player_2_dmg_by_1;
                break;
            case "player_2_dmg_by_4":
                rid = R.id.player_2_cmdr_dmg_4;
                player_2_dmg_by_4 += change;
                counterToChange = player_2_dmg_by_4;
                break;
            case "player_2_dmg_by_3":
                rid = R.id.player_2_cmdr_dmg_3;
                player_2_dmg_by_3 += change;
                counterToChange = player_2_dmg_by_3;
                break;
            default:
        }
        displayChange(rid,counterToChange);
    }

    public void gotoSettings(View view) {
        startActivity(new Intent(LifeTotals.this, SettingsMenu.class));
    }

    private void displayCounter(int number, TextView v) {
        v.setText("" + number);
    }

    public void displayChange(int cid, int counter) {
        TextView displayInteger = (TextView) findViewById(cid);
        displayCounter(counter, displayInteger);
    }

    public void restart(View view) {
        resetCounters();
    }
    //First attempt at a method that will allow the counters to be reset in-app
    //SIDE EFFECTS: All Life Totals will return to 40 and all counter will go to 0
    //Attempt one-the hardcode
    public void resetCounters() {
        //player_2 Corner
        player_2_life = lifeTotal;
        player_2_times_cast = 0;
        player_2_dmg_by_1 = 0;
        player_2_dmg_by_4 = 0;
        player_2_dmg_by_3 = 0;
        //player_1 Corner
        player_1_life = lifeTotal;
        player_1_times_cast = 0;
        player_1_dmg_by_4 = 0;
        player_1_dmg_by_3 = 0;
        player_1_dmg_by_2 = 0;
        //player_3 Corner
        player_3_life = lifeTotal;
        player_3_times_cast = 0;
        player_3_dmg_by_2 = 0;
        player_3_dmg_by_1 = 0;
        player_3_dmg_by_4 = 0;
        //player_4 Corner
        player_4_life = lifeTotal;
        player_4_times_cast = 0;
        player_4_dmg_by_3 = 0;
        player_4_dmg_by_2 = 0;
        player_4_dmg_by_1 = 0;
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
                        player_2_life = Integer.parseInt(sharedPreferences.getString(key, "40"));
                        player_4_life = Integer.parseInt(sharedPreferences.getString(key, "40"));
                        player_3_life = Integer.parseInt(sharedPreferences.getString(key, "40"));
                        player_1_life = Integer.parseInt(sharedPreferences.getString(key, "40"));
                        lifeTotal = Integer.parseInt(sharedPreferences.getString(key, "40"));
                        break;
                    case "p1_color":
                        switch (sharedPreferences.getString(key, "Black")) {
                            case "Black":
                                Log.e("f1", "f1");
                                setPlayerBackgroundColor(mtg_black, 1);
                                Log.e("f2", "f2");
                        }
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
        resetCounters();
    }

    public void setPlayerBackgroundColor(int color, int player) {
        View view = this.getWindow().findViewById(R.id.player_1_corner);
        view.setBackgroundColor(color);
    }

    private void initializeAllCounters() {

        displayCounter(player_3_life, (TextView) findViewById(
                R.id.player_3_life));

        displayCounter(player_3_times_cast, (TextView) findViewById(
                R.id.player_3_times_cast));

        displayCounter(player_3_dmg_by_2, (TextView) findViewById(
                R.id.player_3_cmdr_dmg_2));

        displayCounter(player_3_dmg_by_1, (TextView) findViewById(
                R.id.player_3_cmdr_dmg_1));

        displayCounter(player_3_dmg_by_4, (TextView) findViewById(
                R.id.player_3_cmdr_dmg_4));

        displayCounter(player_4_life, (TextView) findViewById(
                R.id.player_4_life));

        displayCounter(player_4_times_cast, (TextView) findViewById(
                R.id.player_4_times_cast));

        displayCounter(player_4_dmg_by_2, (TextView) findViewById(
                R.id.player_4_cmdr_dmg_2));

        displayCounter(player_4_dmg_by_1, (TextView) findViewById(
                R.id.player_4_cmdr_dmg_1));

        displayCounter(player_4_dmg_by_3, (TextView) findViewById(
                R.id.player_4_cmdr_dmg_3));

        displayCounter(player_1_life, (TextView) findViewById(
                R.id.player_1_life));

        displayCounter(player_1_times_cast, (TextView) findViewById(
                R.id.player_1_times_cast));

        displayCounter(player_1_dmg_by_2, (TextView) findViewById(
                R.id.player_1_cmdr_dmg_2));

        displayCounter(player_1_dmg_by_4, (TextView) findViewById(
                R.id.player_1_cmdr_dmg_4));

        displayCounter(player_1_dmg_by_3, (TextView) findViewById(
                R.id.player_1_cmdr_dmg_3));

        displayCounter(player_2_life, (TextView) findViewById(
                R.id.player_2_life));

        displayCounter(player_2_times_cast, (TextView) findViewById(
                R.id.player_2_times_cast));

        displayCounter(player_2_dmg_by_1, (TextView) findViewById(
                R.id.player_2_cmdr_dmg_1));

        displayCounter(player_2_dmg_by_4, (TextView) findViewById(
                R.id.player_2_cmdr_dmg_4));

        displayCounter(player_2_dmg_by_3, (TextView) findViewById(
                R.id.player_2_cmdr_dmg_3));
    }
}