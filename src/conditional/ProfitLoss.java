package conditional;
import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args) {
        double cp,sp;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter cost price : ");
        cp=sc.nextDouble();
        System.out.print("enter sell price : ");
        sp=sc.nextDouble();

        if(cp<sp){
            System.out.println("profit is: "+ (sp-cp));
        }else if(cp>sp){
            System.out.println("loss is: "+(cp-sp));
        }else{
            System.out.println("no profit no loss");
        }










    }
}
