package net.crosp.customradiobtton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    PresetRadioGroup mSetDurationPresetRadioGroup;
    AppCompatEditText mSetDurationEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSetDurationPresetRadioGroup = (PresetRadioGroup) findViewById(R.id.preset_time_radio_group);
        mSetDurationEditText = (AppCompatEditText) findViewById(R.id.edit_text_set_duration);
        mSetDurationPresetRadioGroup.setOnCheckedChangeListener(new PresetRadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(View radioGroup, View radioButton, boolean isChecked, int checkedId) {
                mSetDurationEditText.setText(((PresetValueButton) radioButton).getValue());
                mSetDurationEditText.setSelection(mSetDurationEditText.getText().length());
            }
        });
    }
}
