package university;

import java.util.Date;

public class Payment {

    private Date data;
    private float summ;

    public Payment(){

        this.data = null;
        this.summ = 0;

    };
    public Payment (Date data, float summ){

        this.data=data;
        this.summ=summ;

    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getSumm() {
        return summ;
    }

    public void setSumm(float summ) {
        this.summ = summ;
    }
}
