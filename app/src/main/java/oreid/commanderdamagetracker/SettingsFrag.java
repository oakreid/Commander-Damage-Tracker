package oreid.commanderdamagetracker;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Oakley on 8/23/2017.
 */

public class SettingsFrag extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.preferences);
    }
}