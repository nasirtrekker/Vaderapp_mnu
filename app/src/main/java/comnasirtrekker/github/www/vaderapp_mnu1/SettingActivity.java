package comnasirtrekker.github.www.vaderapp_mnu1;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

/**
 * Created by nasirmac on 07/05/2017.
 */
public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String curLocation = preferences.getString("curLocation", "");

        EditText locationInput = (EditText)  findViewById(R.id.locationInput);
        locationInput.setText(curLocation);
    }

    public void setLocation(View view){

        EditText locationInput = (EditText)  findViewById(R.id.locationInput);
        String location = String.valueOf(locationInput.getText());

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("curLocation",location);
        editor.apply();

        this.finish();
    }

}

