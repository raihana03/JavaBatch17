package class23;
/*
Create Registration Class in which you would have variables as email,
userName and password that have an access scope only within its own
class. After creating an object of the class user should be able to
call methods and in each method separately pass values to set users email,
username and password.
Requirements:
Valid email consider to be only yahoo Valid userName and password
cannot be empty and should be of length larger than 6 characters.
Also valid password cannot contain userName.
 */

public class Registration {
    private String email;
    private String username;
    private String password;

public Registration (String email, String username, String password){
this.email= email;
this.username=username;
this.password=password;
}
public String getEmail(){
    return email;
}
    public void setEmail(String email){
    if (email.contains("yahoo.com"))
    this.email=email;
    }
public String getUsername(){
    return username;
}
    void setUsername(String username) {
        if(!username.isEmpty()){
            if (username.length() > 6){
        this.username = username;
    }}}
public String getPassword(){
    return password;
}
    void setPassword(String password){
                if(!password.isEmpty()){
                    if (password.length() > 6){
        this.password=password;
}}}}
