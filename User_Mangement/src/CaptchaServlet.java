import java.util.*;
import java.lang.Object;
 import java.io.*;
 import javax.servlet.*;
import javax.servlet.http.*;
import java.awt.*;
import java.awt.Font;
import java.awt.image.*;
import javax.imageio.*;
import java.awt.geom.*;

public class CaptchaServlet extends HttpServlet 
{
private static final long serialVersionUID = 1L;

protected void processRequest(HttpServletRequest request,
HttpServletResponse response) throws ServletException, IOException 
{
 response.setContentType("image/jpg");
    
     try {
       
       Color backgroundColor = Color.red;
       Color borderColor = Color.red;
       Color textColor = Color.blue;
       Color circleColor = new Color(160,160,160);
       //Font textFont = new Font("Arial", Font.PLAIN, 24);
       Font textFont = new Font("Arial", 0, 50);
       int charsToPrint = 5;
       int width = request.getParameter("width") != null ? Integer.parseInt(request.getParameter("width")) : 200;
       int height = request.getParameter("height") != null ? Integer.parseInt(request.getParameter("height")) : 100;
       int circlesToDraw = 4;
       float horizMargin = 20.0f;
       float imageQuality = 0.95f; // max is 1.0 (this is for jpeg)
       double rotationRange = 0.7; // this is radians
       BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
       Graphics2D g = (Graphics2D) bufferedImage.getGraphics();
    
       //Draw an oval
       g.setColor(Color.lightGray);
       g.fillRect(0, 0, width, height);
    
       // lets make some noisey circles
       g.setColor(circleColor);
         for ( int i = 0; i < circlesToDraw; i++ ) {
         int circleRadius = (int) (Math.random() * height / 2.0);
         int circleX = (int) (Math.random() * width - circleRadius);
         int circleY = (int) (Math.random() * height - circleRadius);
         g.drawOval(circleX, circleY, circleRadius * 2, circleRadius * 2);
       }
    
	   g.setColor(textColor);
           g.setFont(textFont);
    
       FontMetrics fontMetrics = g.getFontMetrics();
       int maxAdvance = fontMetrics.getMaxAdvance();
       int fontHeight = fontMetrics.getHeight();
    
       // i removed 1 and l and i because there are confusing to users...
       // Z, z, and N also get confusing when rotated
       // 0, O, and o are also confusing...
       // lowercase G looks a lot like a 9 so i killed it
       // this should ideally be done for every language...
       // i like controlling the characters though because it helps prevent confusion
       //String elegibleChars = "ABCDEFGHJKLMPQRSTUVWXYabcdefhjkmnpqrstuvwxy23456789";
       String elegibleChars = "12345679ABCDEFGHJKLMPQRSTUVWXYabcdefhjkmnpqrstuvwxy";
       
   RandomString random=new RandomString(5);
   String result="";  
   for(int i=1;i<5;i++)
   {
       result=random.nextString();
       if(result.matches("^(?=.*[a-z])(?=.*[0-9])[a-z0-9]+$"))
       break;
   }
       
       
       
       char[] chars = result.toCharArray();
      
    
       float spaceForLetters = -horizMargin * 2 + width;
       float spacePerChar = spaceForLetters / (charsToPrint - 1.0f);
    
       AffineTransform transform = g.getTransform();
    
       StringBuffer finalString = new StringBuffer();
       
    
     
       
      
   
    
  
       
    
       for ( int i = 0; i < charsToPrint; i++ ) {
        // double randomValue = Math.random();
        // int randomIndex = (int) Math.round(randomValue * (chars.length - 1));
         char characterToShow = chars[i];
         finalString.append(characterToShow);
        // System.out.println("LENGTH OF THE CHARACTERS"+finalString);
         // this is a separate canvas used for the character so that
         // we can rotate it independently
         int charImageWidth = maxAdvance * 2;
         int charImageHeight = fontHeight * 2;
         int charWidth = fontMetrics.charWidth(characterToShow);
         int charDim = Math.max(maxAdvance, fontHeight);
        int halfCharDim = (int) (charDim / 2);
   
        BufferedImage charImage = new BufferedImage(charDim, charDim, BufferedImage.TYPE_INT_ARGB);
        Graphics2D charGraphics = charImage.createGraphics();
        charGraphics.translate(halfCharDim, halfCharDim);
        double angle = (Math.random() - 0.5) * rotationRange;
        charGraphics.transform(AffineTransform.getRotateInstance(angle));
        charGraphics.translate(-halfCharDim,-halfCharDim);
        charGraphics.setColor(textColor);
        charGraphics.setFont(textFont);
   
        int charX = (int) (0.5 * charDim - 0.5 * charWidth);
        charGraphics.drawString("" + characterToShow, charX, 
                               (int) ((charDim - fontMetrics.getAscent()) 
                                      / 2 + fontMetrics.getAscent()));
   
        float x = horizMargin + spacePerChar * (i) - charDim / 2.0f;
        int y = (int) ((height - charDim) / 2);
   //System.out.println("x=" + x + " height=" + height + " charDim=" + charDim + " y=" + y + " advance=" + maxAdvance + " fontHeight=" + fontHeight + " ascent=" + fontMetrics.getAscent());
        g.drawImage(charImage, (int) x, y, charDim, charDim, null, null);
   
        charGraphics.dispose();
      }
   
      //Write the image as a jpg
      Iterator iter = ImageIO.getImageWritersByFormatName("JPG");
      if( iter.hasNext() ) {
        ImageWriter writer = (ImageWriter)iter.next();
        ImageWriteParam iwp = writer.getDefaultWriteParam();
        iwp.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
        iwp.setCompressionQuality(imageQuality);
        writer.setOutput(ImageIO.createImageOutputStream(response.getOutputStream()));
        IIOImage imageIO = new IIOImage(bufferedImage, null, null);
        writer.write(null, imageIO, iwp);
      } else {
        throw new RuntimeException("no encoder found for jsp");
      }
   
      // let's stick the final string in the session
      request.getSession().setAttribute("captcha", finalString.toString());
  // System.out.println("-------------------"+finalString.toString());
      g.dispose();
    } catch (IOException ioe) {
      throw new RuntimeException("Unable to build image" , ioe);
    }
}

protected void doGet(HttpServletRequest request,
HttpServletResponse response) throws ServletException, IOException {
processRequest(request, response);
}

protected void doPost(HttpServletRequest request,
HttpServletResponse response) throws ServletException, IOException {

processRequest(request, response);
}

}
