package InterfaceProblems;

public class TripleTacoBox implements TacoBox{
    private Object tacos;
    public TripleTacoBox(){
        tacos = 3;

    }
    @Override
    public int tacosRemaining() {
        return 0;
    }

    @Override
    public void eat() {

    }
}
