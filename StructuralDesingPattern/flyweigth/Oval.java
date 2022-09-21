import java.awt.Color;
import java.awt.Graphics;

public class Oval implements Shape{
    private boolean fill;

    public Oval(boolean f){
        this.fill = f;
        System.out.println("Creating Oval object with fill="+f);

        //adding time delay
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    @Override
    public void draw(Graphics circle, int x, int y, int width, int heigth, Color color){
        circle.setColor(color);
        circle.drawOval(x, y, width, heigth);
            if(fill){
                circle.fillOval(x, y, width, heigth);
            }
        
    }
}