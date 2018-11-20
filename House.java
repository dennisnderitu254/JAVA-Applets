/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;


public class House extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        
    }
    public void paint (Graphics g){
        g.drawString("This is a house",20,20);
//sets applets background color to yellow.
setBackground(Color.white);
g.drawLine(30,100,90,50);
g.drawLine(150,100,90,50);
g.drawLine(30,100,100,100);
g.drawLine(150,100,100,100);
g.setColor(Color.BLACK);
g.fillRect(40,100,100,60);
g.setColor(Color.white);
g.fillRect(85,120,10,30);
g.fillRoundRect(60,110,20,20,40,40);
g.fillArc(100,110, 20, 20, 270,180);



//g.drawString("Applet Started",20,20);
//sets applets background color to yellow.
        
    }
    

    // TODO overwrite start(), stop() and destroy() methods
}
