package src.ex12;
import java.awt.Graphics;
import java.lang.Object;
import java.awt.image.BufferedImage;
import java.awt.Dimension;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ImagePanel extends JPanel{
  
  private BufferedImage img;
  
  public void setImage(BufferedImage img) {
    
    this.img = img;
    
    
    if(img == null) {
      
      setPreferredSize(null);
    } else {
      
      int height = img.getHeight();
      int width = img.getWidth();
      setPreferredSize(new Dimension(width,height));
    }
    repaint();
    
  }
  
    
    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      
      if(img != null) g.drawImage(img,0,0,null);
  }
}
