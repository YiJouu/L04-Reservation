package sg.edu.rp.c346.id20026745.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    DatePicker dpDay;
    TimePicker tpDay;
    TextView name;
    TextView phoneNum;
    TextView size;
    ToggleButton area;
    Button reset;
    Button btnDisplayTime;
    Button btnDisplayDate;
    TextView tvDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dpDay = findViewById(R.id.datePicker);
        tpDay = findViewById(R.id.timePicker);
        reset = findViewById(R.id.btnReset);
        btnDisplayTime = findViewById(R.id.buttonDisplayDate);
        btnDisplayDate = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textView);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpDay.setCurrentHour(19);
                tpDay.setCurrentMinute(30);
                dpDay.updateDate(2021,6,1);
            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                int day = dpDay.getDayOfMonth();
                int month = dpDay.getMonth();
                int year = dpDay.getYear();

                String date = "Date is " + day + "/" + month + "/" + year;
                tvDisplay.setText(date);

            }
        });

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int hour = tpDay.getHour();
                int minute = tpDay.getMinute();

                String time = "Time is " + hour + ":" + minute;
                tvDisplay.setText(time);
            }
        });

    }

}