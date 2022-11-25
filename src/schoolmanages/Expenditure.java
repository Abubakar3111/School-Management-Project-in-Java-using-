
//Abubakar Asif Computer Engineer
//https://www.linkedin.com/in/abubakar-asif-b3b94021a/
//abubakarasif3111@gmail.com

package schoolmanages;
import static schoolmanages.Student.TotalIncome;
public class Expenditure  {
    String ExpenditureType;
    int ExpenditurePrice;
    public Expenditure(String ET, int EP) {
       this.ExpenditureType=ET;
       this.ExpenditurePrice=EP;
TotalIncome=TotalIncome-ExpenditurePrice;
    }
    public void DisplayExpenditure(){
    System.out.printf("\n\nName of Expenfiture is:"+ ExpenditureType+"\nPrice ="+ExpenditurePrice+"\nTotal incme lefet:"+TotalIncome+"\n");
    }
}
