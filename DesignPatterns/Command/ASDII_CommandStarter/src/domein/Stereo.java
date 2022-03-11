package domein;

public class Stereo {

    private String name;

    public Stereo(String name) {
        setName(name);
    }

    public void on() {
        System.out.println(getName() + " is turned on");
    }

    public void off() {
        System.out.println(getName() + " is turned off");
    }

    public void setCD() {
        System.out.println(getName() + " is set for CD input");
    }

    public void setVolume(int volume) {
        System.out.println(getName() + " volume is set to " + volume);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
