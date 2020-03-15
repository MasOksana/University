package university;

public class Group {

    private String numberOfGroup;
    public Student [] students;





    Group (String numberOfGroup){

        this.numberOfGroup = numberOfGroup;
        students = new Student [0];

    }

    Group (String numberOfGroup, int numberOfStudents){

        this.numberOfGroup = numberOfGroup;
        students = new Student[numberOfStudents];

    }

    Group (Student [] students){

        this.students = students;

    }

    //-------------------------------------------

    public String getNumberOfGroup (){

       return numberOfGroup;

    }

    public void setNumberOfGroup (String numberOfGroup){

        this.numberOfGroup = numberOfGroup;

    }

    public int getNumberOfStudents(){

        return students.length;

    }

    public Student getStubentBy (int nomerZachetki) {

        for (int i = 0; i < students.length; i++) {
            if (
                    students[i].getNomerZachetki() == nomerZachetki
            ) {
                return students[i];
            }


        }

        return null;

    }

//----------------------------------------------------------

    void remove(int nomerZachetki) {
        for(int i = 0; i < students.length; i++) {
            if(students[i].getNomerZachetki() == nomerZachetki) {
                students[i] = null;
                Student[]temp = new Student[students.length - 1];
                int k = 0;
                for(int j = 0; j < students.length; j++) {
                    if(students[j] != null) {
                        temp[k] = students[j];
                        k++;
                    }
                }
                students = temp;
                break;
            }
        }
    }


    void add (Student studentAdd){
        Student [] temp = new Student [this.students.length + 1];
        for(int i = 0; i < this.students.length; i++) {
            temp[i] = this.students[i];
        }
        temp[temp.length - 1] = studentAdd;
        students = temp;
    }

    public Student [] getStudents(){

        return students;

    }

    public Student [] getStudents2() {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[j].getSurname().compareToIgnoreCase(students[i].getSurname()) < 0 ||
                        (students[j].getSurname().compareToIgnoreCase(students[i].getSurname()) == 0 &&
                                students[j].getName().compareToIgnoreCase(students[i].getName()) < 0)) {
                    Student tmp = students[i];
                    students[i] = students[j];
                    students[j] = tmp;

                }
            }
        }
        return students;
    }




}


