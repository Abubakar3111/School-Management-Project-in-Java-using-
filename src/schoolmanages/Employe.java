
//Abubakar Asif Computer Engineer
//https://www.linkedin.com/in/abubakar-asif-b3b94021a/
//abubakarasif3111@gmail.com
package schoolmanages;
import static schoolmanages.Student.TotalIncome;
public class Employe extends SchoolManages {
    String EmployeeType;
    int MonthlyPay=0;
    public Employe(String F, String L, String I, String D,String E,int MP) {
        super(F, L, I, D);
        this.EmployeeType=E;
        this.MonthlyPay=MP;
        Student.TotalIncome=TotalIncome-MonthlyPay;
    }
  @Override
    public void Display(){
    System.out.printf("\n\nName is:"+FirstName+" "+LastName
+"\nID is:"+ID+"\nDesignation is:"+Disgnation+"\nEmployeType is:"+EmployeeType+"\nMonthlyPay;"+MonthlyPay+
    "\nRemaining Pay after giving Pay:"+TotalIncome);  
    }
    }
