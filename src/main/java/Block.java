import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Block  extends Rectangle {

    Image pic ;
    boolean destroyed;
    int x,y;
    int width;
    int height;
    int movX ;
    int movY ;

    Block(int x,int y,int w,int h, String s){
        this.x = x;
        this.y = y;
        movX = 3;
        movY = 3;

        this.width = w;
        this.height = h;

        try{

            pic = ImageIO.read(new File(s));

        }catch (IOException e) {
            e.printStackTrace();
        }




    }


        public void draw(Graphics g, Component c)
    {

        if(!destroyed)
        {
            g.drawImage(pic,x,y,width,height,c);
        }

    }
}
