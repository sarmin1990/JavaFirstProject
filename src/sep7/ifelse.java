package sep7;

public class ifelse {
    public static void main(String[] args){
        int income=50000;
        if (income<25000){
            System.out.println("low income");
        }else if(income>=25001&&income<=78000){
            System.out.println("lower middle income");
        }else if(income>=78001&&income<=187000){
            System.out.println("middle upper");
        }else if(income>187000){
            System.out.println("upper");
        }
    }
}
