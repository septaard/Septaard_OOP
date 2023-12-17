package bab8;

public class login {

    private String username, password;
    public String nama;

    public login() {
        nama = "Septa Ardiansyah";
        username = "Asep";
        password = "septa123";
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getPassword(){
        return this.password;
    }
    public void setpassword(String password){
        this.password=password;
    }
    boolean ceklogin(String username,String password){
        if(this.username.equals(getUsername())&&this.password.equals(getPassword())) {
            return true;
        }
        return false;
    }
}
