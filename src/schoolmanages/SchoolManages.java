

//Abubakar Asif Computer Engineer
//https://www.linkedin.com/in/abubakar-asif-b3b94021a/
//abubakarasif3111@gmail.com
package schoolmanages;
public class SchoolManages {

public final String FirstName,LastName,ID,Disgnation;
public SchoolManages(String F,String L,String I,String D ){
this.FirstName=F;
this.LastName=L;
this.ID=I;
this.Disgnation=D;
}
public void Display(){
System.out.printf("\n\nName is:"+FirstName+" "+LastName
+"\nID is:"+ID+"\nDesignation is:"+Disgnation);
}
}
