package Data;

import android.content.res.Resources;

import com.example.garethlye.fightingtestmechanic.R;

/**
 * Created by garethlye on 07/04/2017.
 **/

public class Classes {

    public Classes() {
    }

    public int getHP(String Class) {

        if (Class.equals("Warrior"))
            return 300;
        else if (Class.equals("Mage"))
            return 200;
        else if (Class.equals("Archer"))
            return 200;
        else
            return 150;
    }

    public int getMana(String Class) {
        if (Class.equals("Warrior"))
            return 100;
        else if (Class.equals("Mage"))
            return 250;
        else if (Class.equals("Archer"))
            return 120;
        else
            return 150;
    }

    public String getClassSkills(String Class) {
        if (Class.equals("Warrior"))
            return Resources.getSystem().getString(R.string.warriorSkills);
        else if (Class.equals("Mage"))
            return Resources.getSystem().getString(R.string.mageSkills);
        else if (Class.equals("Archer"))
            return Resources.getSystem().getString(R.string.archerSkills);
        else
            return Resources.getSystem().getString(R.string.errorTEXT);
    }

}
