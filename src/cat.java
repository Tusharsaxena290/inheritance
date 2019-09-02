import java.lang.*;
public class cat extends pet {
    @Override
    public String speak(){
        return getname()+"says meow!";

    }
    @Override
    public String hey(){
        return getage() + " is the age";
    }
    public void sleep(){
        System.out.println("zZzZZzzZZZZzzZZ");
    }

}
