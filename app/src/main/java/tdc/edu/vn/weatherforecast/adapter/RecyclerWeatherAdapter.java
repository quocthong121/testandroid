package tdc.edu.vn.weatherforecast.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import tdc.edu.vn.weatherforecast.R;
import tdc.edu.vn.weatherforecast.data_model.weather;

public class RecyclerWeatherAdapter extends RecyclerView.Adapter<RecyclerWeatherAdapter.MyViewHolder> {
    private Activity context;
    private int layoutID;
    private ArrayList<weather> Weathers;

    public RecyclerWeatherAdapter(Activity context, int layoutID, ArrayList<weather> weathers) {
        this.context = context;
        this.layoutID = layoutID;
        Weathers = weathers;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView viewItem =(CardView) context.getLayoutInflater().inflate(viewType, parent, false);
        return new MyViewHolder(viewItem);
    }


    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        weather Weather = Weathers.get(position);
        holder.lblTempResult.setText(Weather.getTemp());
        holder.lblSpeedResult.setText(Weather.getSpeed());
        holder.lblVisibilityResult.setText(Weather.getVisibility());
        holder.lblTimeResult.setText(Weather.getTime());

    }

    @Override
    public int getItemCount() {
        return Weathers.size();
    }
    public int getItemViewType(int position){
        return layoutID;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgWeather;
        TextView lblTempResult;
        TextView lblSpeedResult;
        TextView lblVisibilityResult;
        TextView lblTimeResult;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgWeather = itemView.findViewById(R.id.imgWeather);
            lblTempResult = itemView.findViewById(R.id.lblTempResult);
            lblSpeedResult = itemView.findViewById(R.id.lblSpeedResult);
            lblVisibilityResult = itemView.findViewById(R.id.lblVisibilityResult);
            lblTimeResult = itemView.findViewById(R.id.lblTimeResult);
        }
    }
}
