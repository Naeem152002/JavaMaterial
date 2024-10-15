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

class Test
{

public static void main(String ss[])
{
Login l=new Login();
mailto:l.setemail("ram@gmail.com");
l.setPass("ram123");
l.setAmount(455);
System.out.println(l.getEmail()+" "+l.getPass());

}
}