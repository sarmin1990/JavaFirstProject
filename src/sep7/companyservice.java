package sep7;

public class companyservice {
    public static void main(String[] args){
        int serviceyear =6;

        if(serviceyear>5){
            System.out.println( 10000*1.05);
        }else if (serviceyear>10){
            System.out.println(10000*1.10);
        }else if (serviceyear>15){
            System.out.println(10000*1.30);
        }else {
            System.out.println("no bonus");
        }
    }
}
