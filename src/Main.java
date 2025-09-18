/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Susanna Chen
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int addtwo = add(4, 5);
        System.out.println(addtwo);

        int addfour = addtwo(3, 4, 5, 6);
        System.out.println(addfour);

        String mGreeting = morningGreeting("Toby Fox");
        System.out.println(mGreeting);

        String aGreeting = afternoonGreeting("Toby Fox");
        System.out.println(aGreeting);

        String triplestring = triple("oohbaby");
        System.out.println(triplestring);

        double halfnumb = half(7);
        System.out.println(halfnumb);

        int roundPositive = roundPositiveValueToNearestInteger(6.6);
        System.out.println(roundPositive);

        int roundNegative = roundNegativeValueToNearestInteger(-4.5);
        System.out.println(roundNegative);
    }

    // 1. add
    static int add(int a, int b){
        return a+b;
    }
    // 2. add
    static int addtwo(int a, int b, int c, int d){
        return a+b+c+d;
    }
    // 3. morningGreeting
    static String morningGreeting(String name){
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting
    static String afternoonGreeting(String name){
        return "下午好, " + name + "!";
    }
    // 5. triple
    static String triple(String three){
        return three + three + three;
    }

    // 6. half
    static double half(int numberhalf){
        return (double) numberhalf / 2;
    }

    // 7. roundPositiveValueToNearestInteger
    static int roundPositiveValueToNearestInteger(double posround){
        return (int)(posround + 0.5);
    }
    // 8. roundNegativeValueToNearestInteger
    static int roundNegativeValueToNearestInteger(double neground){
        return (int)(neground -0.5);
    }
}
