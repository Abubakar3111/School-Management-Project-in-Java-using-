

//Abubakar Asif Computer Engineer
//https://www.linkedin.com/in/abubakar-asif-b3b94021a/
//abubakarasif3111@gmail.com
package schoolmanages;
import static schoolmanages.Student.TotalIncome;

public class NewClass {
    
        public static void main (String[] args) {
        Student Abubakar=new Student("Abubakar","ASif","013","Student","BCE4A",140000);
        Abubakar.Display();
           Expenditure E2=new Expenditure("chair",7000);   
     E2.DisplayExpenditure();
        Student Aftab=new Student("AFTAB","Ali","03","Student","BCE4A",140000);
Aftab.Display();
        Employe Adnan=new Employe("Adnan","ASif","3","Teacher","lecturer",40000);
Adnan.Display();
        Employe haider=new Employe("haidder","ASif","3","Teacher","admin",40000);
haider.Display();
     Expenditure E1=new Expenditure("table",5000);
     E1.DisplayExpenditure(); 
        }
}
