package university;

import java.util.LinkedList;


public class ContractStudent extends Student {

    private LinkedList<Payment> payments;
    private double semestr;
    private int zachetka;
    private String name;
    private String surname;



    public ContractStudent(){

        this.payments = new LinkedList<Payment>();
    }

    public ContractStudent(String name, String surname){

        this.name = name;
        this.surname = surname;
        this.zachetka = 0;
        this.payments = new LinkedList<Payment>();

    }
    public  ContractStudent(String name, String surname,int zachetka ){

        this.name = name;
        this. surname = surname;
        this.zachetka = zachetka;
        this.payments = new LinkedList<Payment>();

    }
    public ContractStudent(String name, String surname, int zachetka, LinkedList<Payment> payments){

        this.name = name;
        this. surname = surname;
        this.zachetka = zachetka;
        this.payments = payments;

    }

    public LinkedList<Payment> getPayments() {
        return payments;
    }

    public void setPayments(LinkedList<Payment> payments) {
        this.payments = payments;
    }

    public double getSemestr() {
        return semestr;
    }

    public void setSemestr(double semestr) {
        this.semestr = semestr;
    }


}
