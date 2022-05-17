package InterfaceProblems;

import java.util.ArrayList;

public class Box implements Packable{

    private double max;
    private double totalWeight;
    int items;
    private ArrayList<Packable> packables;

    public Box(double x){
        this.packables = new ArrayList<>();
        this.max=x;
        this.totalWeight=0;
    }
    public void add(Packable packable){
        if(packable.weight()+totalWeight<max) {
            packables.add(packable);
            totalWeight += packable.weight();
            items++;
        }else{
            System.out.println("The box is full");
        }

    }

    @Override
    public String toString() {
        return "Box: "+ items+" items, total weight "+totalWeight+"kg";
    }

    @Override
    public double weight() {
        return totalWeight;
       }

    }

