package objectOrientedProgramming;

public class TextBox extends UIControl{
	private String text = "";

//    public TextBox() {
//        super(true);
//        System.out.println("TextBox");
//    }

    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}
