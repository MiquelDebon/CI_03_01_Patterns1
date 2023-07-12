package S3_01_N3_CommandPattern;

import S3_01_N3_CommandPattern.Commands.ICommnad;

import java.util.ArrayList;
import java.util.List;

public class InvokerDriver {
    List<ICommnad> commnadList = new ArrayList<>();

    public void takeOrder(ICommnad commnad) {
        commnadList.add(commnad);
    }

    public void runOrders(){
        commnadList.forEach(ICommnad::execute);
        commnadList.clear();
        System.out.println();
    }

}
