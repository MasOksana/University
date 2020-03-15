package university;

import java.util.ArrayList;
import java.util.Date;

public class Student implements ActivistI {

    private String name;
    private String surname;
    private int godPostuplenia;
    private int nomerZachetki;

    Student(){}


    Student (String name, String surname){
        this.name = name;
        this.surname = surname;
        nomerZachetki = 0;

        events = new ArrayList<EventI>();

    }

    Student (String name, String surname, int nomerZachetki){

        this.name = name;
        this.surname = surname;
        this.nomerZachetki = nomerZachetki;

        events = new ArrayList<EventI>();

    }

    public String getName (){

        return name;

    }

    public void setName (String name){

        this.name = name;

    }

    public String getSurname (){

        return surname;

    }

    public void setSurname (String surname){

        this.surname = surname;

    }

    public int getNomerZachetki (){

        return nomerZachetki;

    }


    public void setNomerZachetki (int nomerZachetki){

        this.nomerZachetki = nomerZachetki;

    }

    public int getGodPostuplenia (){

        return godPostuplenia;

    }

    public void setGodPostuplenia (int godPostuplenia){

        this.godPostuplenia = godPostuplenia;

    }

    //-------------------------------------------------


    public int vseMeropriatia() {
        return 0;
    }

    public int vsePrizovMesta() {
        return 0;
    }

    public int vseDocladu() {
        return 0;
    }

    public String namesOfBestProjects() {
        return null;
    }

    //-------------------------------------------------

    private ArrayList <EventI> events;

    public void  addEvent (EventI event){

        events.add (event);

    }

    public void removeEvent (Date data1){
        /*
        for(int i = 0; i < events.size(); i++) {
            if (events.get(i).getData1().compareTo(data1) == 0) {
                events.remove(i);
                break;
            }
        }*/

        for (EventI e: events) {
            if (e.getData1().compareTo(data1) == 0) {
                events.remove(e);
                break;
            }
        }

    }

    public EventI findEvent (Date data1){

        for (EventI e: events) {
            if (e.getData1().compareTo(data1) == 0) {
                return e;

            }
        }
            return null;
    }



}
