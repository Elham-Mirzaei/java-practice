package objectOrientedProgramming;

public class UIControl {
    boolean isEnabled = true;

    public UIControl(boolean inEnabled) {
        this.isEnabled = isEnabled();
        System.out.println("UIControl");
    }

    public void enable(){
        isEnabled = true;
    }

    public void disable(){
        isEnabled = false;
    }

    public boolean isEnabled(){
        return isEnabled;
    }
}
