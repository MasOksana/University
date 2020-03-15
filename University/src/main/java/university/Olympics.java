package university;

import java.util.Date;

public class Olympics implements EventI {

    private Date data1;
    private String city;
    private int place;

    public Date getData1() {
        return data1;
    }

    public void setData1(Date data1) { this.data1 = data1; }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }
}
