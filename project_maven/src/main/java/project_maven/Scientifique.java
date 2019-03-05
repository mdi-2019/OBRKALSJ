package project_maven;

public class Scientifique extends Calculatrice {

        double add (double a, double b )
        {
            return (a+b);
        }
        double sub  (double a, double b )
        {
            return (a-b);
        }
        double mult (double a, double b )
        {
            return (a*b);
        }
        double div (double a, double b )
        {
            if(b != 0)
            {
            return (a/b);
            }
            else
            { return -1;}
        }
        double cos(double a)
        {
            return Math.cos(a);
        }
        
        double sin(double a)
        {
            return Math.sin(a);
        }
        
        double tan(double a)
        {
            return Math.tan(a);
        }
        
        double exp (double a)
        {
            return Math.exp(a);
        }
        
        double sqrt(double a )
        {
            if(a >= 0)
            {
            return Math.sqrt(a);
            }
            else
            { return -1;}
        }
}

