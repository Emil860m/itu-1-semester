import java.util.*;
public class Forest {
    String name;
    List<Tree> trees;
    
    public Forest(String name) {
        this.name  = name;
        trees = new ArrayList();
    }
    
    public void plant(Tree tree) {
        trees.add(tree);
    }
    
    public void grow() {
        for(Tree tree: trees) {
            tree.grow();
        }
    }
    
    public void display() {
        System.out.println("'" + name + "' indeholder:");
        for(Tree tree: trees) {
            System.out.println(" - " + tree.toString());
        }
    }
    
    public Tree tallest() {
        Tree taller = null;
        for(Tree tree: trees) {
            if (taller == null) taller = tree;
            else if (tree.getHeight() > taller.getHeight()) taller = tree;
        }
        return taller;
    }
    
    public void display(String type) {
        System.out.println("'" + name + "' indeholder følgende "+ type + "træ(er):");
        for(Tree tree: trees) {
            if (tree.getType().equals(type))
            System.out.println(" - " + tree.toString());
        }
    }
}