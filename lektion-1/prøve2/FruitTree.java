public class FruitTree extends Tree{
    protected int fruits;
    
    public FruitTree(String type) {
        super(type);
        fruits = 0;
    }
    
    @Override
    public void grow() {
        super.grow();
        if (fruits == 0) fruits++;
        else fruits*=2;
    }
    
    @Override
    public String toString() {
        return super.toString() + " med " + fruits + " frugt(er)";
    }
}