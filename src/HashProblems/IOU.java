package HashProblems;

import java.util.HashMap;

public class IOU {
 private HashMap<String, Double> iou;

    public IOU(){
        this.iou = new HashMap<>();
    }

    //saves the amount owed and the person owed to the HashProblems.IOU
    public void setSum(String toWhom, double amount){
        iou.put(toWhom, amount);

    }
    //returns the amount owed to the person whose name is given as a parameter, if the person can't be found, returns 0
    public double howMuchDoIOwnTo(String toWhom){
        return iou.getOrDefault(toWhom, (double) 0);

    }

}
