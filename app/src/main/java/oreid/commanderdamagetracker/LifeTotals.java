package oreid.commanderdamagetracker;

import android.content.Intent;
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

    //player_2 Corner
    int player_2_life = 40;
    int player_2_times_cast = 0;
    int player_2_dmg_by_1 = 0;
    int player_2_dmg_by_4 = 0;
    int player_2_dmg_by_3 = 0;
    //player_1 Corner
    int player_1_life = 40;
    int player_1_times_cast = 0;
    int player_1_dmg_by_4 = 0;
    int player_1_dmg_by_3 = 0;
    int player_1_dmg_by_2 = 0;
    //player_3 Corner
    int player_3_life = 40;
    int player_3_times_cast = 0;
    int player_3_dmg_by_2 = 0;
    int player_3_dmg_by_1 = 0;
    int player_3_dmg_by_4 = 0;
    //player_4 Corner
    int player_4_life = 40;
    int player_4_times_cast = 0;
    int player_4_dmg_by_3 = 0;
    int player_4_dmg_by_2 = 0;
    int player_4_dmg_by_1 = 0;

    public void gLifeInc(View view) {
        player_3_life ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_3_life);
        displayCounter(player_3_life, displayInteger);
    }

    public void gLifeDec(View view) {
        player_3_life --;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_3_life);
        displayCounter(player_3_life, displayInteger);
    }

    public void gTCInc(View view) {
        player_3_times_cast ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_3_times_cast);
        displayCounter(player_3_times_cast, displayInteger);
    }

    public void gTCDec(View view) {
        player_3_times_cast --;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_3_times_cast);
        displayCounter(player_3_times_cast, displayInteger);
    }

    public void gWDmgInc(View view) {
        player_3_dmg_by_2 ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_3_cmdr_dmg_2);
        displayCounter(player_3_dmg_by_2, displayInteger);
    }

    public void gWDmgDec(View view) {
        player_3_dmg_by_2 --;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_3_cmdr_dmg_2);
        displayCounter(player_3_dmg_by_2, displayInteger);
    }

    public void gUDmgInc(View view) {
        player_3_dmg_by_1 ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_3_cmdr_dmg_1);
        displayCounter(player_3_dmg_by_1, displayInteger);
    }

    public void gUDmgDec(View view) {
        player_3_dmg_by_1--;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_3_cmdr_dmg_1);
        displayCounter(player_3_dmg_by_1, displayInteger);
    }

    public void gRDmgInc(View view) {
        player_3_dmg_by_4 ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_3_cmdr_dmg_4);
        displayCounter(player_3_dmg_by_4, displayInteger);
    }

    public void gRDmgDec(View view) {
        player_3_dmg_by_4 --;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_3_cmdr_dmg_4);
        displayCounter(player_3_dmg_by_4, displayInteger);
    }

    public void rLifeInc(View view) {
        player_4_life ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_4_life);
        displayCounter(player_4_life, displayInteger);
    }

    public void rLifeDec(View view) {
        player_4_life --;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_4_life);
        displayCounter(player_4_life, displayInteger);
    }

    public void rTCInc(View view) {
        player_4_times_cast ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_4_times_cast);
        displayCounter(player_4_times_cast, displayInteger);
    }

    public void rTCDec(View view) {
        player_4_times_cast --;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_4_times_cast);
        displayCounter(player_4_times_cast, displayInteger);
    }

    public void rWDmgInc(View view) {
        player_4_dmg_by_2 ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_4_cmdr_dmg_2);
        displayCounter(player_4_dmg_by_2, displayInteger);
    }

    public void rWDmgDec(View view) {
        player_4_dmg_by_2 --;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_4_cmdr_dmg_2);
        displayCounter(player_4_dmg_by_2, displayInteger);
    }

    public void rUDmgInc(View view) {
        player_4_dmg_by_1 ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_4_cmdr_dmg_1);
        displayCounter(player_4_dmg_by_1, displayInteger);
    }

    public void rUDmgDec(View view) {
        player_4_dmg_by_1 --;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_4_cmdr_dmg_1);
        displayCounter(player_4_dmg_by_1, displayInteger);
    }

    public void rGDmgInc(View view) {
        player_4_dmg_by_3 ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_4_cmdr_dmg_3);
        displayCounter(player_4_dmg_by_3, displayInteger);
    }

    public void rGDmgDec(View view) {
        player_4_dmg_by_3 --;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_4_cmdr_dmg_3);
        displayCounter(player_4_dmg_by_3, displayInteger);
    }

    public void uLifeInc(View view) {
        player_1_life ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_1_life);
        displayCounter(player_1_life, displayInteger);
    }

    public void uLifeDec(View view) {
        player_1_life --;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_1_life);
        displayCounter(player_1_life, displayInteger);
    }

    public void uTCInc(View view) {
        player_1_times_cast ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_1_times_cast);
        displayCounter(player_1_times_cast, displayInteger);
    }

    public void uTCDec(View view) {
        player_1_times_cast --;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_1_times_cast);
        displayCounter(player_1_times_cast, displayInteger);
    }

    public void uWDmgInc(View view) {
        player_1_dmg_by_2 ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_1_cmdr_dmg_2);
        displayCounter(player_1_dmg_by_2, displayInteger);
    }

    public void uWDmgDec(View view) {
        player_1_dmg_by_2 --;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_1_cmdr_dmg_2);
        displayCounter(player_1_dmg_by_2, displayInteger);
    }

    public void uRDmgInc(View view) {
        player_1_dmg_by_4 ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_1_cmdr_dmg_4);
        displayCounter(player_1_dmg_by_4, displayInteger);
    }

    public void uRDmgDec(View view) {
        player_1_dmg_by_4 --;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_1_cmdr_dmg_4);
        displayCounter(player_1_dmg_by_4, displayInteger);
    }

    public void uGDmgInc(View view) {
        player_1_dmg_by_3 ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_1_cmdr_dmg_3);
        displayCounter(player_1_dmg_by_3, displayInteger);
    }

    public void uGDmgDec(View view) {
        player_1_dmg_by_3 --;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_1_cmdr_dmg_3);
        displayCounter(player_1_dmg_by_3, displayInteger);
    }

    public void wLifeInc(View view) {
        player_2_life ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_2_life);
        displayCounter(player_2_life, displayInteger);
    }

    public void wLifeDec(View view) {
        player_2_life --;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_2_life);
        displayCounter(player_2_life, displayInteger);
    }

    public void wTCInc(View view) {
        player_2_times_cast ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_2_times_cast);
        displayCounter(player_2_times_cast, displayInteger);
    }

    public void wTCDec(View view) {
        player_2_times_cast --;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_2_times_cast);
        displayCounter(player_2_times_cast, displayInteger);
    }

    public void wUDmgInc(View view) {
        player_2_dmg_by_1 ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_2_cmdr_dmg_1);
        displayCounter(player_2_dmg_by_1, displayInteger);
    }

    public void wUDmgDec(View view) {
        player_2_dmg_by_1 --;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_2_cmdr_dmg_1);
        displayCounter(player_2_dmg_by_1, displayInteger);
    }

    public void wRDmgInc(View view) {
        player_2_dmg_by_4 ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_2_cmdr_dmg_4);
        displayCounter(player_2_dmg_by_4, displayInteger);
    }

    public void wRDmgDec(View view) {
        player_2_dmg_by_4 --;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_2_cmdr_dmg_4);
        displayCounter(player_2_dmg_by_4, displayInteger);
    }

    public void wGDmgInc(View view) {
        player_2_dmg_by_3 ++;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_2_cmdr_dmg_3);
        displayCounter(player_2_dmg_by_3, displayInteger);
    }

    public void wGDmgDec(View view) {
        player_2_dmg_by_3 --;
        TextView displayInteger = (TextView) findViewById(
                R.id.player_2_cmdr_dmg_3);
        displayCounter(player_2_dmg_by_3, displayInteger);
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
        //player_2 Corner
        player_2_life = 40;
        player_2_times_cast = 0;
        player_2_dmg_by_1 = 0;
        player_2_dmg_by_4 = 0;
        player_2_dmg_by_3 = 0;
        //player_1 Corner
        player_1_life = 40;
        player_1_times_cast = 0;
        player_1_dmg_by_4 = 0;
        player_1_dmg_by_3 = 0;
        player_1_dmg_by_2 = 0;
        //player_3 Corner
        player_3_life = 40;
        player_3_times_cast = 0;
        player_3_dmg_by_2 = 0;
        player_3_dmg_by_1 = 0;
        player_3_dmg_by_4 = 0;
        //player_4 Corner
        player_4_life = 40;
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

        setContentView(R.layout.activity_life_totals);

        initializeAllCounters();
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