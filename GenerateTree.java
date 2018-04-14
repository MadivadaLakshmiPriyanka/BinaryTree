import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JPanel;

class GenerateTree extends JPanel {   
    private int circleRadius = 15;                                                    //node radius
    private int verticalSeperation = 30;                                                      //Vertical Gap between two nodes in a Binary Tree
       
    protected void paintTree(Node root,int[][] nodeCoords) {
      Graphics g = getGraphics();
      if(root != null) {                
            displayTree(g, root, getWidth()/2, 35, getWidth()/4,nodeCoords);        
      }
    }
    
    protected void paintImage(Node imageNode,int[][] nodeCoords) {
        Graphics g = getGraphics();
        if(imageNode != null) {              
            displayTree(g, imageNode, getWidth()/2, 35, getWidth()/4,nodeCoords);        
      }
    }
        
    
    private void displayTree(Graphics g, Node node, int x, int y, int horizatalSeperation,int[][] nodeCoords) {
      //Function to display a subtree with root as x,y        
      g.setColor(Color.CYAN);
      g.fillOval(x - circleRadius, y - circleRadius, 2 * circleRadius, 2 * circleRadius);
      
      //Store the coordinates of the node, to be used for searching
      nodeCoords[LaunchApplication.counter][0] = x - circleRadius;
      nodeCoords[LaunchApplication.counter][1] = y - circleRadius;
      nodeCoords[LaunchApplication.counter][2] = node.data;
      LaunchApplication.counter++;
      
      //Write the data value on the node
      g.setColor(Color.black);
      g.drawString(node.data + "", x - 6, y + 4);            
      
      if (node.left != null) {
        //using drawLine to draw line to the left node
          if(!LaunchApplication.treePainted) {
          try {              
              Thread.sleep(500);
          } catch (InterruptedException ex) {
              Logger.getLogger(GenerateTree.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
          
        //draw line
        drawLineBetween2Circles(g, x - horizatalSeperation, y + verticalSeperation, x, y);     
        
        //recursively draw the left subtree
        //decrease the horizontal and vertical gaps
        displayTree(g, node.left, x - horizatalSeperation, y + verticalSeperation, horizatalSeperation/2,nodeCoords);        
      }          
      if (node.right != null) {
          //using drawLine to draw line to the right node
          if(!LaunchApplication.treePainted) {
          try {
          
              Thread.sleep(500);
          } catch (InterruptedException ex) {
              Logger.getLogger(LaunchApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
          
        //draw line
        drawLineBetween2Circles(g, x + horizatalSeperation, y + verticalSeperation, x, y);         
        //recursively draw the right subtree
        //decrease the horizontal and vertical gaps
        displayTree(g, node.right, x + horizatalSeperation, y + verticalSeperation, horizatalSeperation/2,nodeCoords);          
      }
    }        
    
    private void drawLineBetween2Circles(Graphics g, int x1, int y1, int x2, int y2) {
        //Function to draw a line between two circles centered at x1,y1 and x2,y2
        
        //Computing adjusted coordinates
        double d = Math.sqrt(verticalSeperation * verticalSeperation + (x2 - x1) * (x2 - x1));
        int xAdjusted = (int)(x1 - circleRadius * (x1 - x2) / d);
        int yAdjusted = (int)(y1 - circleRadius * (y1 - y2) / d);
        int xAdjusted1 = (int)(x2 + circleRadius * (x1 - x2) / d);
        int yAdjusted1 = (int)(y2 + circleRadius * (y1 - y2) / d);
        
        //Draw line between adjusted coordinates
        g.drawLine(xAdjusted, yAdjusted, xAdjusted1, yAdjusted1);
    }    
  }