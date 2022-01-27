package com.pkpapper.incometaxbd;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.transition.Visibility;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

import soup.neumorphism.NeumorphCardView;

public class TaxReturnGuidelineActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView que1,que2,que3,que4,que5,que6,que7,que8,que9,que10,que11,que12,que13,que14,que15,que16,que17,que18,que19,que20,que21,que22,que23,que24,que25 ;
    private TextView ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10,ans11,ans12,ans13,ans14,ans15,ans16,ans17,ans18,ans19,ans20,ans21,ans22,ans23,ans24,ans25 ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax_return_guideline);

        getSupportActionBar().hide();

       que1 = findViewById(R.id.que1);
       que2 = findViewById(R.id.que2);
       que3 = findViewById(R.id.que3);
       que4 = findViewById(R.id.que4);
       que5 = findViewById(R.id.que5);
       que6 = findViewById(R.id.que6);
       que7 = findViewById(R.id.que7);
       que8 = findViewById(R.id.que8);
       que9 = findViewById(R.id.que9);
       que10 = findViewById(R.id.que10);
       que11= findViewById(R.id.que11);
       que12 = findViewById(R.id.que12);
       que13 = findViewById(R.id.que13);
       que14 = findViewById(R.id.que14);
       que15 = findViewById(R.id.que15);
       que16 = findViewById(R.id.que16);
       que17 = findViewById(R.id.que17);
       que18 = findViewById(R.id.que18);
       que19 = findViewById(R.id.que19);
       que20 = findViewById(R.id.que20);
       que21 = findViewById(R.id.que21);
       que22 = findViewById(R.id.que22);
       que23 = findViewById(R.id.que23);
       que24 = findViewById(R.id.que24);
       que25 = findViewById(R.id.que25);


       ans1 = findViewById(R.id.ans1);
       ans2 = findViewById(R.id.ans2);
       ans3 = findViewById(R.id.ans3);
       ans4 = findViewById(R.id.ans4);
       ans5 = findViewById(R.id.ans5);
       ans6 = findViewById(R.id.ans6);
       ans7 = findViewById(R.id.ans7);
       ans8 = findViewById(R.id.ans8);
       ans9 = findViewById(R.id.ans9);
       ans10 = findViewById(R.id.ans10);
       ans11 = findViewById(R.id.ans11);
       ans12 = findViewById(R.id.ans12);
       ans13 = findViewById(R.id.ans13);
       ans14 = findViewById(R.id.ans14);
       ans15 = findViewById(R.id.ans15);
       ans16 = findViewById(R.id.ans16);
       ans17 = findViewById(R.id.ans17);
       ans18 = findViewById(R.id.ans18);
       ans19 = findViewById(R.id.ans19);
       ans20 = findViewById(R.id.ans20);
       ans21 = findViewById(R.id.ans21);
       ans22 = findViewById(R.id.ans22);
       ans23 = findViewById(R.id.ans23);
       ans24 = findViewById(R.id.ans24);
       ans25 = findViewById(R.id.ans25);




       que1.setOnClickListener(this);
       que2.setOnClickListener(this);
       que3.setOnClickListener(this);
       que4.setOnClickListener(this);
       que5.setOnClickListener(this);
       que6.setOnClickListener(this);
       que7.setOnClickListener(this);
       que8.setOnClickListener(this);
       que9.setOnClickListener(this);
       que10.setOnClickListener(this);
       que11.setOnClickListener(this);
       que12.setOnClickListener(this);
       que13.setOnClickListener(this);
       que14.setOnClickListener(this);
       que15.setOnClickListener(this);
       que16.setOnClickListener(this);
       que17.setOnClickListener(this);
       que18.setOnClickListener(this);
       que19.setOnClickListener(this);
       que20.setOnClickListener(this);
       que21.setOnClickListener(this);
       que22.setOnClickListener(this);
       que23.setOnClickListener(this);
       que24.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        int id = v.getId();
        if (id == R.id.que1){
            if (ans1.getVisibility() == View.VISIBLE){
                que1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans1.setVisibility(View.GONE);

            }else if(ans1.getVisibility() == View.GONE){
                que1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans1.setVisibility(View.VISIBLE);
            }
        }else if(id == R.id.que2){
            if (ans2.getVisibility() == View.VISIBLE){
                que2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans2.setVisibility(View.GONE);

            }else if(ans2.getVisibility() == View.GONE){
                que2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans2.setVisibility(View.VISIBLE);
            }

        }else if(id == R.id.que3){
            if (ans3.getVisibility() == View.VISIBLE){
                que3.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans3.setVisibility(View.GONE);

            }else if(ans3.getVisibility() == View.GONE){
                que3.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans3.setVisibility(View.VISIBLE);
            }


        }else if(id == R.id.que4){
            if (ans4.getVisibility() == View.VISIBLE){
                que4.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans4.setVisibility(View.GONE);

            }else if(ans4.getVisibility() == View.GONE){
                que4.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans4.setVisibility(View.VISIBLE);
            }

        }else if(id == R.id.que5){
            if (ans5.getVisibility() == View.VISIBLE){
                que5.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans5.setVisibility(View.GONE);

            }else if(ans5.getVisibility() == View.GONE){
                que5.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans5.setVisibility(View.VISIBLE);
            }

        }else if(id == R.id.que6){
            if (ans6.getVisibility() == View.VISIBLE){
                que6.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans6.setVisibility(View.GONE);

            }else if(ans6.getVisibility() == View.GONE){
                que6.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans6.setVisibility(View.VISIBLE);
            }

        }else if(id == R.id.que7){
            if (ans7.getVisibility() == View.VISIBLE){
                que7.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans7.setVisibility(View.GONE);

            }else if(ans7.getVisibility() == View.GONE){
                que7.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans7.setVisibility(View.VISIBLE);
            }

        }else if(id == R.id.que8){
            if (ans8.getVisibility() == View.VISIBLE){
                que8.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans8.setVisibility(View.GONE);

            }else if(ans8.getVisibility() == View.GONE){
                que8.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans8.setVisibility(View.VISIBLE);
            }

        }else if(id == R.id.que9){
            if (ans9.getVisibility() == View.VISIBLE){
                que9.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans9.setVisibility(View.GONE);

            }else if(ans9.getVisibility() == View.GONE){
                que9.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans9.setVisibility(View.VISIBLE);
            }

        }else if(id == R.id.que10){
            if (ans10.getVisibility() == View.VISIBLE){
                que10.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans10.setVisibility(View.GONE);

            }else if(ans10.getVisibility() == View.GONE){
                que10.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans10.setVisibility(View.VISIBLE);
            }

        }else if(id == R.id.que11){
            if (ans11.getVisibility() == View.VISIBLE){
                que11.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans11.setVisibility(View.GONE);

            }else if(ans11.getVisibility() == View.GONE){
                que11.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans11.setVisibility(View.VISIBLE);
            }

        }else if(id == R.id.que12){
            if (ans12.getVisibility() == View.VISIBLE){
                que12.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans12.setVisibility(View.GONE);

            }else if(ans12.getVisibility() == View.GONE){
                que12.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans12.setVisibility(View.VISIBLE);
            }

        }else if(id == R.id.que13){
            if (ans13.getVisibility() == View.VISIBLE){
                que13.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans13.setVisibility(View.GONE);

            }else if(ans13.getVisibility() == View.GONE){
                que13.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans13.setVisibility(View.VISIBLE);
            }

        }else if(id == R.id.que14){
            if (ans14.getVisibility() == View.VISIBLE){
                que14.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans14.setVisibility(View.GONE);

            }else if(ans14.getVisibility() == View.GONE){
                que14.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans14.setVisibility(View.VISIBLE);
            }

        }else if(id == R.id.que15){
            if (ans15.getVisibility() == View.VISIBLE){
                que15.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans15.setVisibility(View.GONE);

            }else if(ans15.getVisibility() == View.GONE){
                que15.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans15.setVisibility(View.VISIBLE);
            }

        }else if(id == R.id.que16){
            if (ans16.getVisibility() == View.VISIBLE){
                que16.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans16.setVisibility(View.GONE);

            }else if(ans16.getVisibility() == View.GONE){
                que16.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans16.setVisibility(View.VISIBLE);
            }

        }else if(id == R.id.que17){
            if (ans17.getVisibility() == View.VISIBLE){
                que17.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans17.setVisibility(View.GONE);

            }else if(ans17.getVisibility() == View.GONE){
                que17.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans17.setVisibility(View.VISIBLE);
            }

        }else if(id == R.id.que18){
            if (ans18.getVisibility() == View.VISIBLE){
                que18.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans18.setVisibility(View.GONE);

            }else if(ans18.getVisibility() == View.GONE){
                que18.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans18.setVisibility(View.VISIBLE);
            }

        }else if(id == R.id.que19){
            if (ans19.getVisibility() == View.VISIBLE){
                que19.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans19.setVisibility(View.GONE);

            }else if(ans19.getVisibility() == View.GONE){
                que19.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans19.setVisibility(View.VISIBLE);
            }

        }else if(id == R.id.que20){
            if (ans20.getVisibility() == View.VISIBLE){
                que20.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans20.setVisibility(View.GONE);

            }else if(ans20.getVisibility() == View.GONE){
                que20.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans20.setVisibility(View.VISIBLE);
            }

        }else if(id == R.id.que21){
            if (ans21.getVisibility() == View.VISIBLE){
                que21.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans21.setVisibility(View.GONE);

            }else if(ans21.getVisibility() == View.GONE){
                que21.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans21.setVisibility(View.VISIBLE);
            }

        }else if(id == R.id.que22){
            if (ans22.getVisibility() == View.VISIBLE){
                que22.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans22.setVisibility(View.GONE);

            }else if(ans22.getVisibility() == View.GONE){
                que22.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans22.setVisibility(View.VISIBLE);
            }

        }else if(id == R.id.que23){
            if (ans23.getVisibility() == View.VISIBLE){
                que23.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans23.setVisibility(View.GONE);

            }else if(ans23.getVisibility() == View.GONE){
                que23.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans23.setVisibility(View.VISIBLE);
            }

        }else if(id == R.id.que24){
            if (ans24.getVisibility() == View.VISIBLE){
                que24.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans24.setVisibility(View.GONE);

            }else if(ans24.getVisibility() == View.GONE){
                que24.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans24.setVisibility(View.VISIBLE);
            }

        }else if(id == R.id.que25){

            if (ans25.getVisibility() == View.VISIBLE){
                que25.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
                ans25.setVisibility(View.GONE);

            }else if(ans25.getVisibility() == View.GONE){
                que25.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
                ans25.setVisibility(View.VISIBLE);
            }
        }

    }
}