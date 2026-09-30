package OOPS.Encapuslation;

public class LoginAccount {
    private  int password;
    private  String userName;

    LoginAccount(int password,String userName){
        this.password=password;
        this.userName=userName;

    }

    public int getPassword(){
        return password;
    }

    public String getUserName(){
        return  userName;
    }

    public  void setUserName(String uname){
        this.userName = uname;

    }

    public void setPassword(int passwd)
    {
        this.password = passwd;
    }


    public  static  void main(String [] args){
        LoginAccount obj = new LoginAccount(2007,"mohithUser");
        System.out.println(obj.getPassword());
        System.out.println(obj.getUserName());


        // Atfter Login we want to modify username and passwd  using set methods
            obj.setPassword(1435);
            obj.setUserName("userMohith");

            System.out.println("Afetr modify the data use set methods");
            System.out.println(obj.getPassword());
            System.out.println(obj.getUserName());
    }
}
