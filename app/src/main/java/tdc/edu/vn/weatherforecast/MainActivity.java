package tdc.edu.vn.weatherforecast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

import tdc.edu.vn.weatherforecast.adapter.RecyclerWeatherAdapter;
import tdc.edu.vn.weatherforecast.data_model.weather;

public class MainActivity extends AppCompatActivity {
    private RecyclerWeatherAdapter adapter;
    ArrayList<weather> data = new ArrayList<weather>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weatherforecast_layout);

        data.add(new weather("Max: 23 Now: 23 Min: 22", "3.24km/h", "1000", "2021-02-08 15:00:00"));
        data.add(new weather("Max: 22 Now: 22 Min: 22", "1.64km/h", "1000", "2021-02-08 18:00:00"));
        data.add(new weather("Max: 22 Now: 22 Min: 22", "1.55km/h", "1000", "2021-02-08 21:00:00"));
        data.add(new weather("Max: 22 Now: 22 Min: 22", "2.02km/h", "1000", "2021-02-08 24:00:00"));
        data.add(new weather("Max: 23 Now: 23 Min: 22", "3.24km/h", "1000", "2021-02-08 15:00:00"));
        data.add(new weather("Max: 22 Now: 22 Min: 22", "1.64km/h", "1000", "2021-02-08 18:00:00"));
        data.add(new weather("Max: 22 Now: 22 Min: 22", "1.55km/h", "1000", "2021-02-08 21:00:00"));
        data.add(new weather("Max: 22 Now: 22 Min: 22", "2.02km/h", "1000", "2021-02-08 24:00:00"));
        data.add(new weather("Max: 22 Now: 22 Min: 22", "2.02km/h", "1000", "2021-02-08 24:00:00"));
        data.add(new weather("Max: 22 Now: 22 Min: 22", "2.02km/h", "1000", "2021-02-08 24:00:00"));
        data.add(new weather("Max: 22 Now: 22 Min: 22", "2.02km/h", "1000", "2021-02-08 24:00:00"));
        data.add(new weather("Max: 22 Now: 22 Min: 22", "2.02km/h", "1000", "2021-02-08 24:00:00"));
        data.add(new weather("Max: 22 Now: 22 Min: 22", "2.02km/h", "1000", "2021-02-08 24:00:00"));
        data.add(new weather("Max: 22 Now: 22 Min: 22", "2.02km/h", "1000", "2021-02-08 24:00:00"));
        data.add(new weather("Max: 22 Now: 22 Min: 22", "2.02km/h", "1000", "2021-02-08 24:00:00"));
        data.add(new weather("Max: 22 Now: 22 Min: 22", "2.02km/h", "1000", "2021-02-08 24:00:00"));
        data.add(new weather("Max: 22 Now: 22 Min: 22", "2.02km/h", "1000", "2021-02-08 24:00:00"));
        data.add(new weather("Max: 22 Now: 22 Min: 22", "2.02km/h", "1000", "2021-02-08 24:00:00"));
        data.add(new weather("Max: 22 Now: 22 Min: 22", "2.02km/h", "1000", "2021-02-08 24:00:00"));
        data.add(new weather("Max: 22 Now: 22 Min: 22", "2.02km/h", "1000", "2021-02-08 24:00:00"));
        data.add(new weather("Max: 22 Now: 22 Min: 22", "2.02km/h", "1000", "2021-02-08 24:00:00"));
        RecyclerView listView = (RecyclerView) findViewById(R.id.listItem);
        adapter = new RecyclerWeatherAdapter(this, R.layout.item_layout, data);

        //configure for Recyclerview
        LinearLayoutManager layoutManager = new GridLayoutManager(this, 1);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        listView.setLayoutManager(layoutManager);
        listView.setAdapter(adapter);
    }
}