
import java.awt.*;
public class sample_frame extends Frame{
    public static void main(String[] args) {
        sample_frame frm=new sample_frame();
        frm.setVisible(true);
        frm.setSize(500,500);
        frm.setTitle("First Frame");
        frm.setLayout(new FlowLayout());
        frm.setBackground(Color.cyan);
        Label L1= new Label("Enter Your Name");
        TextField tf1=new TextField(10);
        Button sum=new Button("Submit");
        CheckboxGroup chg=new CheckboxGroup();
        Checkbox cb1=new Checkbox("male",chg,true);
        Checkbox cb2=new Checkbox("Female",chg,false);
        Choice ch1=new Choice();
        ch1.add("Delhi");
        ch1.add("Noida");
        ch1.add("Ghaziabad");
        ch1.add("Patna");
        frm.add(ch1);
        frm.add(L1);
        frm.add(tf1);
        frm.add(sum);
        frm.add(cb1);
        frm.add(cb2);
        Button close=new Button("Close");
        frm.add(close);
        close.addActionListener(_ -> System.exit(0));


    }
    
}
