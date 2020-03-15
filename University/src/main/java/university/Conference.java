package university;

import java.util.Date;

public class Conference implements EventI {

    private Date data2;
    private String city2;
    private String dokladName;

    public Date getData2() {
        return data2;
    }

    public void setData2(Date data2) {
        this.data2 = data2;
    }

    public String getCity2() {
        return city2;
    }

    public void setCity2(String city2) {
        this.city2 = city2;
    }

    public String getDokladName() {
        return dokladName;
    }

    public void setDokladName(String dokladName) {
        this.dokladName = dokladName;
    }


    // ------------------------------------------------------ next from interface


    public Date getData1() {
        return null;
    }

    public void setData1(Date data1) {

    }

    public String getCity() {
        return null;
    }

    public void setCity(String city) {

    }
}
