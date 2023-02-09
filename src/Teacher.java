
public class Teacher {
    static int  count = 0;

    String name, gender,phone;
    Teacher(String name,String gender,String phone){
        count++;

        this.name = name;
        this.gender = gender;
        this.phone = phone;

    }
    public void print(){
        System.out.println("ID : "+count);
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Phone : "+phone);
    }

}
