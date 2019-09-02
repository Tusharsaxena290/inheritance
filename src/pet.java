public class pet {
    protected String name;
    protected  int age;
    protected String getname(){
        return name;
    }
    protected int getage(){
        return age;
    }
    protected void setname(String name){
        this.name=name;
    }
    protected void setage(int age){
        this.age=age;
    }
    public String speak(){
        return "hello,I am"+getname();

        }
    public String hey(){
        return "my age is" +getage();
    }

    }

