package university;

import java.util.Date;

public class Competition implements EventI {

    private Date data3;
    private String city3;
    private String nameOfProject;
    private double prizeMoney;

    public Date getData3() {
        return data3;
    }

    public void setData3(Date data3) {
        this.data3 = data3;
    }

    public String getCity3() {
        return city3;
    }

    public void setCity3(String city3) {
        this.city3 = city3;
    }

    public String getNameOfProject() {
        return nameOfProject;
    }

    public void setNameOfProject(String nameOfProject) {
        this.nameOfProject = nameOfProject;
    }

    public double getPrizeMoney() {
        return prizeMoney;
    }

    public void setPrizeMoney(double prizeMoney) {
        this.prizeMoney = prizeMoney;
    }


    //---------------------------------------next from interface

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
