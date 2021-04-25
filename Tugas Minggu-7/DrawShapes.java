package tugasminggu7;
 /**
 * NAMA : AMALIA SISKA KURNIAWATI
 * NIM  : E41201005
 * GOL  : A - BONDOWOSO
 */
import java.awt.*;
import java.applet.*;
    public class DrawShapes extends Applet{
        Font font;
        Color redColor;
        Color blueColor;
        Color backgroundColor;
    @Override
    public void init(){
        // set model huruf Arial, ukuran 18 ,ITALIC
        font = new Font("Arial",Font.ITALIC,18);
        // set warna untuk class color
        redColor = Color.red;
        backgroundColor = Color.ORANGE;
        // set warna dengan Red, Green, Blue
        blueColor = new Color(0,0,122);
        // set background dengan applet color    
         setBackground(backgroundColor);
    }
    @Override
    public void stop(){
    }
    // Method ini untuk membuat bentuk pada layar
    @Override
    public void paint(Graphics graph){
        // set font
        graph.setFont(font);
        // set judul
        graph.drawString("Draw Shapes", 90, 20);
        // set warna untuk bentuk pertama
        graph.setColor(blueColor);    
        // set persegi menggunakan drawRect
        graph.drawRect(120, 120, 120, 120);
        // mengisi persegi
        graph.fillRect(115, 115, 90, 90);
        // set warna untuk bentuk selanjutnya
        graph.setColor(redColor);
        // set lingkaran drawArc
        graph.fillArc(110, 110, 50, 50, 0, 360);
        // set warna bentuk selanjutnya
        graph.setColor(Color.CYAN);
        // set bentuk persegi lainnya
        graph.drawRect(50, 50, 50, 50);
        // meengisi persegi
        graph.fillRect(50, 50, 60, 60);     
    }
}