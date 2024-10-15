package com.androjava.login;

public class Login implements java.io.Serializable
{

private String email,pass;
private int amount;

public Login()
{
}

public void setAmount(int amount)
{
if(amount>0)
this.amount=amount;
else
throw new ArithmeticException("Invalid Amount....");
}

public int getAmount()
{
return amount;
}

public void setEmail(String email)
{
this.email=email;
}

public void setPass(String pass)
{
this.pass=pass;
}

public String getEmail()
{
return email;
}

public String getPass()
{
return pass;
}

}

class Validation
{

static boolean validate(Login l)
{
mailto:if(l.getemail().equals("admin@gmail.com") && l.getPass().equals("admin123"))
return true;
else
return false;
}

}


class Test
{

public static void main(String ss[])
{
Login l=new Login();
java.util.Scanner s=new java.util.Scanner(System.in);
System.out.println("Eneter Email");
String email=s.next();
System.out.println("Eneter Pass");
String pass=s.next();
l.setEmail(email);
l.setPass(pass);
l.setAmount(455);
boolean b=Validation.validate(l);
if(b)
{
System.out.println(l.getEmail()+" "+l.getPass());
System.out.println("Login sucess");
}
else
{
System.out.println("fail...");

}

}
}