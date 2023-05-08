package S3_01_N3_CommandPattern;

import S3_01_N3_CommandPattern.Commands.Commnad;

import java.util.ArrayList;
import java.util.List;

public class InvokerDriver {
    List<Commnad> commnadList = new ArrayList<>();

    public void takeOrder(Commnad commnad) {
        commnadList.add(commnad);
    }

    public void runOrders(){
        for(Commnad command : commnadList){
            command.execute();
        }
        commnadList.clear();
        System.out.println();
    }



}
