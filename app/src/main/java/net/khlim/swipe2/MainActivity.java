package net.khlim.swipe2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ViewFlipperAction.ViewFlipperCallback {

    //뷰플리퍼
    ViewFlipper flipper;
    //인덱스
    List<ImageView> indexes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("ddd", "hello");

        //UI
        flipper = (ViewFlipper)findViewById(R.id.flipper);

        ImageView index0 = new ImageView(this);
        index0.setImageResource(R.drawable.a);

        ImageView index1 = new ImageView(this);
        index1.setImageResource(R.drawable.b);

        ImageView index2 = new ImageView(this);
        index2.setImageResource(R.drawable.c);

        //인덱스리스트
//        indexes = new ArrayList<ImageView>();
//        indexes.add(index0);
//        indexes.add(index1);
//        indexes.add(index2);
//
//        //xml을 inflate 하여 flipper view에 추가하기
//        //inflate
//        LayoutInflater inflater = (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
//        View view1 = inflater.inflate(R.layout.viewflipper1, flipper, false);
//        View view2 = inflater.inflate(R.layout.viewflipper2, flipper, false);
//        View view3 = inflater.inflate(R.layout.viewflipper3, flipper, false);
        //inflate 한 view 추가
        flipper.addView(index0);
        flipper.addView(index1);
        flipper.addView(index2);

        //리스너설정 - 좌우 터치시 화면넘어가기
//        flipper.setOnTouchListener(new ViewFlipperAction(this, flipper));

        flipper.setOnTouchListener(new View.OnTouchListener(){

            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                Log.d("ddd", "touch!");
                return false;
            }
        });


    }

    //인덱스 업데이트
    @Override
    public void onFlipperActionCallback(int position) {
        Log.d("ddd", ""+position);
        for(int i=0; i<indexes.size(); i++){
            ImageView index = indexes.get(i);
            //현재화면의 인덱스 위치면 녹색
            if(i == position){
                index.setImageResource(R.drawable.a);
            }
            //그외
            else{
                index.setImageResource(R.drawable.b);
            }
        }
    }
}