public class Main {


    public static void main(String[] args) {

        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());

        var textbox2 = new TextBox();
        textbox2.setText("Box 2");
        System.out.println(textbox2.text);

        var textbox3 = new TextBox();
        textBox1.clear();
        System.out.println(textBox1.text);
    }
}
