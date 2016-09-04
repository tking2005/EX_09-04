package nyc.C4Q.tarynking;

/**
 * Created by tarynking on 9/4/16.
 */
public class Student {
    private String firstName;//fields
    private String lastName;
    private int idNumber;
    private String favFood;


    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }


    //getter
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFavFood() {
        return favFood;
    }

    public int getIdNumber(){
        return idNumber;
    }


    //setter
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}