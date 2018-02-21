package com.example.android.sunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mWeatherTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWeatherTextView=(TextView) findViewById(R.id.tv_weather_data);

        String[] WeatherData={
                "Today,Feb 19- Cloudy - 27°C / 11°C",
                "Tomorrow,Feb 20- Haze - 27°C / 13°C",
                "Wed,Feb 21- Haze - 28°C / 13°C",
                "Thurs,Feb 22- Haze - 29°C / 14°C",
                "Fri,Feb 23- Haze - 30°C / 16°C",
                "Sat,Feb 24- Cloudy - 29°C / 15°C",
                "Sun,Feb 25- Sunny - 29°C / 14°C",
                "Mon,Feb 26- Sunny - 29°C / 16°C",
                "Tues,Feb 27- Rainy - 29°/C / 14°C"

        };

        for (String dummyWeatherDay : WeatherData) {
            mWeatherTextView.append(dummyWeatherDay + "\n\n\n");
        }


    }
}
