package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbutton;

        rollbutton=(Button)findViewById(R.id.rollbutton);
        final ImageView balldisplay=(ImageView)findViewById(R.id.image_eightball);
        final int ballarray[]=new int[]{R.drawable.ball1,
        R.drawable.ball2,
                R.drawable.ball3,
        R.drawable.ball4,
        R.drawable.ball5};
        rollbutton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.d("jgnbj", "gnjnjb");
                Random rnum=new Random();
                int num1=rnum.nextInt(5);
                int imageResourceid=ballarray[num1];
                balldisplay.setImageResource(ballarray[num1]);
            }


        } );



    }
}
