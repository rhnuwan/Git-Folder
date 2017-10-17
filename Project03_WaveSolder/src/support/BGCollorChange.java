/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package support;


import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Magnus Engineering
 */
public class BGCollorChange implements Runnable{

        private final Color color;
        private final JPanel panel;
        private final int compare;
        private final Timer timer;


        public BGCollorChange(JPanel panel,Color color,Timer timer,int compare) {
            this.panel = panel;
            this.color = color;
            this.timer = timer;
            this.compare = compare;
            new Thread(this).start();
        }
        
        
        
        @Override
        public void run() {
            while(true){
                try {
                    Thread.sleep(1000);
                    if(timer.toInt()==compare){
                        panel.setBackground(color);
                    }
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        
    }
