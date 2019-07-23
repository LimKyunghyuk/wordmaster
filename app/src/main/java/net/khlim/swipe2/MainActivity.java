package net.khlim.swipe2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import android.widget.ViewFlipper;

/**
 * Created by khlim on 23/07/2019.
 */

public class MainActivity extends Activity {


    ViewFlipper flipper;
    ToggleButton toggle_Flipping;

    @Override
    public void onCreate(Bundle savedInstranceState){
        super.onCreate(savedInstranceState);

        setContentView(R.layout.activity_main);


        flipper = (ViewFlipper)findViewById(R.id.flipper);

        Animation showin = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        flipper.setInAnimation(showin);
        flipper.setOutAnimation(this, android.R.anim.slide_out_right);


        toggle_Flipping = (ToggleButton)findViewById(R.id.toggle_auto);

        toggle_Flipping.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b){
                    flipper.setFlipInterval(1000);
                    flipper.startFlipping();
                }else{
                    flipper.stopFlipping();
                }


            }
        });



    }


    public void mOnClick(View v){
        switch (v.getId()){
            case R.id.btn_previous :
                flipper.showPrevious();
                break;
            case R.id.btn_next :
                flipper.showNext();
                break;
        }
    }

}
