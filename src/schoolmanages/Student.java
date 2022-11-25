
//Abubakar Asif Computer Engineer
//https://www.linkedin.com/in/abubakar-asif-b3b94021a/
//abubakarasif3111@gmail.com

package schoolmanages;
public class Student extends SchoolManages {
    String ClassWithSectionName;
    int MonthlyFees=0;
    static int TotalIncome;
    public Student(String F, String L, String I, String D,String CWS,int MF) {
        super(F, L, I, D);
this.ClassWithSectionName=CWS;
    this.MonthlyFees=MF;
    TotalIncome+=MonthlyFees;
    }
    @Override
    public void Display(){
    System.out.printf("\n\nName is:"+FirstName+" "+LastName
+"\nID is:"+ID+"\nDesignation is:"+Disgnation+"Class is:"+ClassWithSectionName+"\nMonthlyFees;"+MonthlyFees+
    "\nTotalINcome:"+TotalIncome+"\n");
    }
   public void TotalIncome(){
   
    System.out.printf("Total Income this month is:"+TotalIncome);
   }
}
