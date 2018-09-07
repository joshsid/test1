import java.awt.*;
public class Bounce{
   public static void main(String[] args){     
      
      DrawingPanel panel = new DrawingPanel(300,300);
      Graphics g = panel.getGraphics();
   
      MyPoint p1 = new MyPoint(50, 200);
      MyPoint p2 = new MyPoint(2,150);
      int speedx = 5;
      int speedy = -10;
      int speed2x = 5;
      int speed2y = -8;
      
      for(int i = 0; i < 1000; i++){
          speedy += 1;
          speed2y += 1;
      
         g.setColor(new Color(255,100,50));  //orange
         p1.translate(speedx,speedy);               //move the point
         p2.translate(speed2x,speed2y);
         g.fillRect(p1.x, p1.y, 50, 50);       //draw rect
         g.setColor(new Color(0,100,50));
         g.fillRect(p2.x, p2.y, 50, 50); 
         panel.sleep(50);
         g.setColor(new Color(255,255,255)); //clear
         g.fillRect(0,0,300,300); 
         
        //check for top/bottom edge 
        if( p1.y > 250 ) {
           speedy *= -1;
        } else if ( p1.y < 0 ) {
           speedy *= -1;
        }
        //check for left / right edge
        if( p1.x > 250 ) {
           speedx *= -1;
        } else if ( p1.x < 0 ) {
           speedx *= -1;
        }
        
        //check for top/bottom edge 
        if( p2.y > 250 ) {
           speed2y *= -1;
        } else if ( p2.y < 0 ) {
           speed2y *= -1;
        }
        //check for left / right edge
        if( p2.x > 250 ) {
           speed2x *= -1;
        } else if ( p2.x < 0 ) {
           speed2x *= -1;
        }


         
         
                    
      } // end for loop
   }
}

class MyPoint {
   // field aka variables
   public int x;
   public int y;
   
   //constructor
   public MyPoint( int tempx , int tempy  ){
      x = tempx;
      y = tempy;
   }
   
   //method 
   public void translate( int dx , int dy ) {
      x += dx;
      y += dy;
   }
   
   public int getX() {
      return x;
   }
   
   public int getY() {
      return y;
   }


}


