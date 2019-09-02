public class test{
    public static void main(String[] args) {
        pet p1=new pet();
        p1.setname("kitty");
        p1.setage(4);
        System.out.println(p1.speak());
        System.out.println(p1.hey());
        cat c1=new cat();
        c1.setname("kitty");
        c1.setage(4);
        System.out.println(c1.speak());
        System.out.println(c1.hey());
        c1.sleep();
        pet p2=new cat();
        ((cat)p2).sleep();

    }
}
