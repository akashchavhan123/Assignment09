package addressbookpackage;

public class Contact {
    String firstName;
    String lastName;
    String address;
    String city;
    String State;
    int zip;
    long phoneNumber;
    String Email;
    Contact (String f,String l,String a,String c,String s,int z,long p,String e){
        this.firstName = f;
        this.lastName = l;
        this.address = a;
        this.city = c;
        this.State = s;
        this.zip = z;
        this.phoneNumber = p;
        this.Email  = e;
    }

    @Override
    public String toString() {
        return
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", State='" + State + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                ", Email='" + Email + '\'';
    }
}
