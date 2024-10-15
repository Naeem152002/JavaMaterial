package com.hashmap.overridehashcode;

public class Emp1 {
	
	
	private int id;
	public Emp1(int id, String name, String cmpName) {
		super();
		this.id = id;
		this.name = name;
		this.cmpName = cmpName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCmpName() {
		return cmpName;
	}
	public void setCmpName(String cmpName) {
		this.cmpName = cmpName;
	}
	private String name;
	private String cmpName;
	
	
	@Override
	public int hashCode() {
		return id*100;
		//yaha per kahani ye ho rahi hain jaise hi mera object add hone ja raha hoga uski hash value nikelegi
		//aur hashvalue and bucket ka madular nikala jayega aur uske baad existenc dekha jayega agar wo index per same valu milegi to 
		//to wo object add nahi hoga but yaha per humne hashcode ko ovrride kr diya hai aur hum pata hain overridw wale ko prefence pahle 
		//milati hain aur humne yaha per hashcode id ko bana diya hain
		//ab jiski id same hogi wo nahi add hoga 
	


	}
	
	@Override
	public boolean equals(Object obj) {
			Emp1 other = (Emp1) obj;
			if (this.id == other.id)
				return true;
			else
				return false;
 	}
	//equal method existenc check krta hain isliye main
	//isko bhi ovride mar diya ab ye humare hisab se chalega 
	//

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", cmpName=" + cmpName + "]";
	}
		
	
	
}

