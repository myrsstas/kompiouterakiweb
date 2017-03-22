/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorfx;

/**
 *
 * @author User
 */
public class MathFractions {
     
    private double num1;
    private double num2;
    private double sum;
    private double allagi;
    private int fraction;
    private Boolean trigger1;
    //Constructor οταν δημιουργητε το αντικειμενο
    MathFractions() {
        num1 = 0;
        num2 = 0;
        sum = 0;
        fraction = 0;
        trigger1 = false;
    }
    //Προσθεση της προτως τιμης με την δευτερη
    public void add(){
        sum = num1+ num2;
        
        //return sum;
    }
    //Αφαιρεση της πρωτης τιμης με την δευτερη
    public double abstraction(){
        sum = num1 - num2;
        return sum;
    }
    //πολλαπλασιασμος της πρωτης τιμης με την δευτερη
    public double multiply() {
        sum = num1 * num2;
        return sum;
    }
    //Διαιρεση της πρωτης τιμης με την δευτερη
    public double division (){
        
        sum = num1 / num2;
        if (num1==0 || num2==0){
            return sum=0;
    } else{
            return sum;
        }
    }
    //Ανιχνευση αριθμου και αλλαγη του σε αρνητικο η θετικο
    public double arnitiko(double arnitiko){    
        arnitiko=arnitiko*(-1);
        return arnitiko;     
    }
    //αποθηκευση αποτελεσματος στην sum
    public void setSum(double num){
        sum = num;
    }
    //Επιστροφη αποτελεσματος της sum
    public double getSum (){
        return sum;
    }
    //Εκκαθαρηση τιμων
    public void clear() {
        num1 = 0;
        num2=0;
        sum=0;
        fraction=0;
        trigger1 = false;
    }
    //Αποθηκευση της num1
    public void setNum1(double num){
        num1 = num;
    }
    //Αποθηκευση της num2
    public void setNum2(double num) {
        num2 = num;
    }
    //Αποθηκευει την αναλογη μαθηματικη πραξη που πρεπει να γινει
    //σε μια τιμη με ενα συγκεκριμενο ευρος (1-4).
    public void setFraction(int tempFraction) {
        fraction = tempFraction;
    }
    //Επιστροφη αποτελεσματος της num1
    public double getNum1(){
        return num1;
    }
    //Επιστροφη αποτελεσματος της num2
    public double getNum2(){
        return num2;
    }
    //Επιστροφη της τιμης της πραξης
    public int getFraction(){
        return fraction;
    }
    //Ελεγχος πραξης εντος οριων
    public Boolean fractionControl(){
        if (fraction >0 && fraction < 5){
            return true;
        } else {
            return false;
        }
    }
    //Διακοπτης υπαρξης μοναχικου μηδεν, και αντικατασταση του με 
    //τον αριθμο που θα πατηθει. Εισαγωγη τιμης
    public void setTrigger1(Boolean i) {
        trigger1 = i;
    }
    //Εξαγωγη τιμης trigger
    public Boolean getTrigger1(){
        return trigger1;
    }
}
