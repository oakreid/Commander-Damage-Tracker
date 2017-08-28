package oreid.commanderdamagetracker;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class SettingsFrag extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.preferences);
    }

    /**
     * Add field:
     * SharedPreferences settings;
     *
     * Add to onCreate:
     * PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
     * settings = PreferenceManager.getDefaultSharedPreferences(this);
     * settings.registerOnSharedPreferenceChangeListener(
     * new SharedPreferences.OnSharedPreferenceChangeListener() {
     * @Override
     * public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
     * switch (key) {
     * case "starting_life":
     * starting_life_total = Integer.parseInt(sharedPreferences.getString(key, "40"));
     * w_life = Integer.parseInt(sharedPreferences.getString(key, "40"));
     * r_life = Integer.parseInt(sharedPreferences.getString(key, "40"));
     * g_life = Integer.parseInt(sharedPreferences.getString(key, "40"));
     * u_life = Integer.parseInt(sharedPreferences.getString(key, "40"));
     * break;
     * case "p1_color":
     * //do stuff
     * break;
     * case "p2_color":
     * //do stuff
     * break;
     * case "p3_color":
     * //do stuff
     * break;
     * case "p4_color":
     * //do stuff
     * break;
     * }
     * initializeAllCounters();
     * }
     * });
     */
}