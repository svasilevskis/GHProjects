package kalkulators;

public class calcfuncitions {
    
    public double saskaitit(double a, double b) {

        return a + b;
        
    }
    public double atnemt(double a, double b) {

        return a - b;
        
    }
    public double reiz(double a, double b) {

        return a * b;
        
    }
    
    public double dal(double a, double b) {

        return a / b;
        
    }
    
    public double kap(double a, int pakape){
        
        double result = 1;
        
        for(int i=0;i<pakape;i++){
            result*=a;
        }
        return result;
    }
    
}
