public class test {
    public static void test1() {
        Transaction transaction = new Transaction("Claus", "Sebastian", 100);
        transaction.completeViaBank("Nordea");
        transaction.handleTransaction();
    }
    
    public static void test21() {
        Transaction transaction = new Transaction(null, "Sebastian", 100);
    }
    
    public static void test22() {
        try {
            test21();
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void test3() {
        Transaction transaction = new Transaction("Claus", "Sebastian", 100);
        transaction.handleTransaction();
    }
    
    public static void test41() {
        Transaction transaction = new Transaction("Claus", "Sebastian", 100);
        transaction.completeViaBank("Lån og Spar");
    }
    
    public static void test42() {
        try {
            test41();
        } catch(IllegalBankException e) {
            System.out.println(e.getMessage());
        }
    }
}
