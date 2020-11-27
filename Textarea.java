import java.awt.*;
class Textarea{
	Textarea(){
		Frame f=new Frame();
		TextArea t1=new TextArea("This is the TextArea");
		t1.setBounds(80,100,400,100);
        f.add(t1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
	}
	public static void main(String[] args) {
		new Textarea();
	}
}