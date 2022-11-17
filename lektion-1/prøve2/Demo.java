public class Demo{
    public static void test() {
        Forest forest = new Forest("Amager fælled");
        FruitTree ft = new FruitTree("Æble");
        forest.plant(ft);
        forest.grow();
        Tree tree1 = new Tree("Gran");
        Tree tree2 = new Tree("Gran");
        forest.plant(tree1);
        forest.plant(tree2);
        forest.grow();
        forest.display();
        forest.display("Gran");
        System.out.println("Skovens højeste træ er " + forest.tallest().toString());
    }
}