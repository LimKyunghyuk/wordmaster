//package net.khlim.swipe2;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.MotionEvent;
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.ViewFlipper;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MainActivity3 extends AppCompatActivity implements View.OnTouchListener {
//
//    //뷰플리퍼
//    ViewFlipper flipper;
//    //인덱스
//    List<ImageView> indexes;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Log.d("ddd", "start");
//
//        //UI
//        flipper = (ViewFlipper)findViewById(R.id.flipper);
//        ImageView index0 = (ImageView)findViewById(R.id.imgIndex0);
//        ImageView index1 = (ImageView)findViewById(R.id.imgIndex1);
//        ImageView index2 = (ImageView)findViewById(R.id.imgIndex2);
//
//        //인덱스리스트
//        indexes = new ArrayList<>();
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
//        //inflate 한 view 추가
//        flipper.addView(view1);
//        flipper.addView(view2);
//        flipper.addView(view3);
//
//        //리스너설정 - 좌우 터치시 화면넘어가기
//        flipper.setOnTouchListener(new ViewFlipperAction(this, flipper));
//    }
//
//
//    @Override
//    public boolean onTouch(View view, MotionEvent motionEvent) {
//
//        Log.d("ddd", "hello");
//
//        switch (motionEvent.getAction()){
//            case MotionEvent.ACTION_DOWN :
//                break;
//
//            case MotionEvent.ACTION_MOVE :
//                break;
//
//            case MotionEvent.ACTION_UP :
//                break;
//        }
//
//
//        return false;
//    }
//}