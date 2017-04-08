package com.example.garethlye.fightingtestmechanic;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableField;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import com.example.garethlye.fightingtestmechanic.databinding.ActivityCreateCharacterScreenBinding;

import Data.Classes;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CreateCharacterScreen extends AppCompatActivity {

    @Bind(R.id.classesDropDown)
    Spinner classesDropDown;

    ObservableField<Integer> hpValue   = new ObservableField<>();
    ObservableField<Integer> manaValue = new ObservableField<>();
    ObservableField<String> skillsList = new ObservableField<>();
    Classes                  mClasses  = new Classes();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_character_screen);
        ButterKnife.bind(this);
        ActivityCreateCharacterScreenBinding binding = DataBindingUtil.bind(findViewById(R.id.container));
        binding.setCharCreation(this);
        skillsList.set(". . .");
        classesDropDown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(final AdapterView<?> adapterView, final View view, final int i, final long l) {
                if (classesDropDown.getSelectedItem().toString().equals(getApplicationContext().getString(R.string.warrior)))
                {
                    hpValue.set(mClasses.getHP(classesDropDown.getSelectedItem().toString()));
                    manaValue.set(mClasses.getMana(classesDropDown.getSelectedItem().toString()));
                    skillsList.set(mClasses.getClassSkills(classesDropDown.getSelectedItem().toString()));
                }
            }

            @Override
            public void onNothingSelected(final AdapterView<?> adapterView) {

            }
        });
    }

    public void onProceedClicked(View view){
        Intent i = new Intent(CreateCharacterScreen.this, CreateCharacterScreen.class);

        startActivity(i);
    }

    public ObservableField<Integer> getHpValue(){
        return hpValue;
    }

    public ObservableField<Integer> getManaValue(){
        return manaValue;
    }

    public ObservableField<String> getSkillsList(){
        return skillsList;
    }
}
