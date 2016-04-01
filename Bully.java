/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bully;

/**
 *
 * @author PHANUEL AYUKA
 */
public class Bully {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int total_processes = 6;
        RunningThread[] t = new RunningThread[total_processes];
        for (int i = 0; i < total_processes; i++) {
            t[i] = new RunningThread(new Process(i+1, i+1), total_processes);//passing process id, priority, total no. of processes to running thread
        }
        try {
            Election.initialElection(t);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        for (int i = 0; i < total_processes; i++) {
            new Thread(t[i]).start();//start every thread
        }
    }
    
}
