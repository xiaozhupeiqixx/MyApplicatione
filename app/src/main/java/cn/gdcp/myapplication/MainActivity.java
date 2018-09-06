package cn.gdcp.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView textView;
private Button button;
private ImageView imageView;
private  int[] arr={R.drawable.as,R.drawable.as1,R.drawable.as2,R.drawable.as3,R.drawable.as4,};
private int index;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.text1);
        textView.setTextColor(Color.BLUE);

        imageView=findViewById(R.id.img1);
        button=findViewById(R.id.button1);
        button.setTextColor(Color.RED);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            imageView.setImageResource(arr[index]);
                index=(index+1)%arr.length;
            }
        });
    }
}
