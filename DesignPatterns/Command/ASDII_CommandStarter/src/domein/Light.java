package domein;

public class Light {

    private String name;
    
    public Light()
    {
        this("Light");        
    }
    
    public Light(String name) 
    {
        setName(name);
    }
    public void on() {
        System.out.println(getName() + " is turned on");
    }

     public void off() {
        System.out.println(getName() + " is turned off");
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
