package tdc.edu.vn.weatherforecast.data_model;

public class weather {
 String Temp, Speed, Visibility, Time;

    public weather() {
    }

    public weather(String temp, String speed, String visibility, String time) {
        Temp = temp;
        Speed = speed;
        Visibility = visibility;
        Time = time;
    }

    public String getTemp() {
        return Temp;
    }

    public void setTemp(String temp) {
        Temp = temp;
    }

    public String getSpeed() {
        return Speed;
    }

    public void setSpeed(String speed) {
        Speed = speed;
    }

    public String getVisibility() {
        return Visibility;
    }

    public void setVisibility(String visibility) {
        Visibility = visibility;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }
}
