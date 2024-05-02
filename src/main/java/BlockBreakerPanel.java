import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class BlockBreakerPanel extends JPanel implements KeyListener {

    ArrayList<Block> blocks = new ArrayList<Block>();
    Block line = new Block(175,480,150,25,"line.png");
    Block ball = new Block(237,435,25,25,"ball.png");

    BlockBreakerPanel()
    {
        for (int i = 0; i < 8;i++)
            blocks.add(new Block((i*60+2),0,60,25,"blue.png"));
        for (int i = 0; i < 8;i++)
            blocks.add(new Block((i*60+2),25,60,25,"red.png"));
        for (int i = 0; i < 8;i++)
            blocks.add(new Block((i*60+2),50,60,25,"yellow.png"));
        for (int i = 0; i < 8;i++)
            blocks.add(new Block((i*60+2),75,60,25,"orange.png"));



        addKeyListener(this);
        setFocusable(true);


    }
    public void paintComponent(Graphics g)
    {
        blocks.forEach(block -> {
            block.draw(g,this);
        });
        line.draw(g,this);
        ball.draw(g,this);
    }

    public void update() {
        ball.x += ball.movX;

      if(ball.x >(getWidth()-25)|| ball.x<0)
          ball.movX *= -1;

      if(ball.y <0 || ball.intersects(line))
          ball.movY *= -1;
      ball.y+= ball.movY;
      blocks.forEach(block -> {
          if(ball.intersects(block))
          {
              block.destroyed = true;
              ball.movY *= -1;
          }
      });
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode()== KeyEvent.VK_ENTER)
        {

            new Thread(() -> {

                while (true){
                    update();

                    try {
                        Thread.sleep(10);
                    }catch (InterruptedException err)
                    {
                        err.printStackTrace();
                    }

                }

            }).start();

        }

        if(e.getKeyCode() == KeyEvent.VK_RIGHT && line.x<(getWidth() -line.width))
        {
            line.x +=15;

        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT && line.x> 0)
        {
            line.x -=15;

        }



    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
