

public class B extends A{
    
    public B(String b){
        super(b);
        System.out.println(b);
    }
    
    @Override
    protected void test(){
        System.out.println("yolo");
    }
    
}
