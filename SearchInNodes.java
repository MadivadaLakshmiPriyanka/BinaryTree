import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;


public class SearchInNodes extends JFrame {
	  

    public int[] searchInCoords(int x, int[][] nodeCoords) {
        //Search for the coordinates of the passed value
        //used to find the node coordinates for passed data
        for(int i=0; i<nodeCoords.length; i++) {
            if(x == nodeCoords[i][2]) {
                int[] temp = {nodeCoords[i][0], nodeCoords[i][1]};
                return temp;
            }
        }
        return new int[2];
    }
    
}
