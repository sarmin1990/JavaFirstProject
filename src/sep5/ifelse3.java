package sep5;

public class ifelse3 {
    //0-24999 you pay 0 tax
    //25000-99999 you pay 10% tax
    //1000000 you pay 20% tax

    public static void main(String[] args){
        int earning=125000;

        if(earning>0&&earning<=24999){
            System.out.println("0 tax");
        }else if(earning>25000&&earning<=99999){
            System.out.println("10% tax");
        }else if(earning>=100000){
            System.out.println("20% tax");
        }
    }
}
