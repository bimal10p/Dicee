package bimal10p.com.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String abc="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = (Button)findViewById(R.id.button_roll);
        final ImageView leftDice=(ImageView) findViewById(R.id.img_left);
        final ImageView rightDice=(ImageView) findViewById(R.id.img_right);
        final TextView txt =(TextView) findViewById(R.id.resultTxt);


        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };



        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Dicee", "This is working");

                Random randomNumberGen= new Random();
                int num1= randomNumberGen.nextInt(6);
                int num2= randomNumberGen.nextInt(6);

                Log.d("Dicee","The number is : "+num1);
                leftDice.setImageResource(diceArray[num1]);

                Log.d("Dicee","The number is : "+num2);
                rightDice.setImageResource(diceArray[num2]);

                int num= num1+num2+2;

                if(num==7){
                    abc="Lucky 7: You Won";}
                    else {abc="Try Again";}


                Log.d("Dicee","The result is :"+abc);
                    txt.setText(abc);


            }
        });

    }
}
