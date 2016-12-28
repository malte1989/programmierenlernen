package de.programmierenlernenhq.malte.programmierenlernen;

/**
 * Created by deb559M on 28.12.2016.
 */

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

import java.util.Set;

public class EinstellungenActivity extends PreferenceActivity
        implements Preference.OnPreferenceChangeListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

/*        //Toast.makeText(this, "Einstellungen-Activity gestartet.", Toast.LENGTH_SHORT).show();
        //Toast.makeText(this, "Zurück mit Back-Button.", Toast.LENGTH_SHORT).show();
        addPreferencesFromResource(R.xml.preferences);

        Preference aktienlistePref = findPreference(getString(R.string.preference_aktienliste_key));
        aktienlistePref.setOnPreferenceChangeListener(this);

        // onPreferenceChange sofort aufrufen mit der in SharedPreferences gespeicherten Aktienliste
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);

        String gespeicherteAktienliste = sharedPrefs.getString(aktienlistePref.getKey(), "");
        onPreferenceChange(aktienlistePref, gespeicherteAktienliste);*/






        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.preferences);

        Preference aktienlistePref2 = findPreference(getString(R.string.preference_aktienliste_key2));
        aktienlistePref2.setOnPreferenceChangeListener(this);

        // onPreferenceChange sofort aufrufen mit der in SharedPreferences gespeicherten Aktienliste
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);

        Set<String> gespeicherteAktienliste2 = sharedPrefs.getStringSet(aktienlistePref2.getKey(), null);
        onPreferenceChange(aktienlistePref2, gespeicherteAktienliste2);

        /*Set<String> gespeicherteAktienliste = sharedPrefs.getStringSet(aktienlistePref2.getKey(), null);
        String[] selected = gespeicherteAktienliste.toArray(new String[] {});
        String str_2 = "";
        for (int i=0; i<selected.length;i++) {
            if (i==0){
                str_2 = selected[i];
            } else {
                str_2 = str_2 + "," + selected[i];
            }
        }
        aktienlistePref2.setSummary(str_2.toString());

        initSummary(getPreferenceScreen());*/
    }

    public boolean onPreferenceChange(Preference preference, Object value) {
        preference.setSummary(value.toString());
        return true;
    }




   /* public void onSharedPreferenceChanged(SharedPreferences sharedPreferences,
                                          String key) {
        updatePrefSummary(findPreference(key));
    }

    private void initSummary(Preference p) {
        if (p instanceof PreferenceGroup) {
            PreferenceGroup pGrp = (PreferenceGroup) p;
            for (int i = 0; i < pGrp.getPreferenceCount(); i++) {
                initSummary(pGrp.getPreference(i));
            }
        } else {
            updatePrefSummary(p);
        }
    }

    private void updatePrefSummary(Preference p) {
*//*        if (p instanceof ListPreference) {
            ListPreference listPref = (ListPreference) p;
            p.setSummary(listPref.getEntry());
        }*//*
        if (p instanceof EditTextPreference) {
            EditTextPreference editTextPref = (EditTextPreference) p;
            if (p.getTitle().toString().contains("assword"))
            {
                p.setSummary("******");
            } else {
                p.setSummary(editTextPref.getText());
            }
        }
        if (p instanceof MultiSelectListPreference) {
            // MultiSelectList Preference
            MultiSelectListPreference mlistPref = (MultiSelectListPreference) p;
            String summaryMListPref = "";
            String and = "";

            // Retrieve values
            Set<String> values = mlistPref.getValues();
            List<String> list_values = new ArrayList(values);
            //for (String value : values) {
            for (String value : reversed(list_values)) {
                // For each value retrieve index
                int index = mlistPref.findIndexOfValue(value);
                // Retrieve entry from index
                CharSequence mEntry = index >= 0
                        && mlistPref.getEntries() != null ? mlistPref
                        .getEntries()[index] : null;
                if (mEntry != null) {
                    // add summary
                    summaryMListPref = summaryMListPref + and + mEntry;
                    and = ";";
                }
            }
            // set summary
            mlistPref.setSummary(summaryMListPref);

            //EditTextPreference editTextPref = (EditTextPreference) p;
            //p.setSummary(editTextPref.getText());
        }
    }*/


}
