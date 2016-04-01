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
import java.util.concurrent.locks.ReentrantLock;

public class Election {

    public static ReentrantLock pingLock = new ReentrantLock();
    public static ReentrantLock electionLock = new ReentrantLock();
    private static boolean electionFlag = false; //By default no election is going on
    private static boolean pingFlag = true; //By default I am allowed to ping 
    public static Process electionDetector;

    public static Process getElectionDetector() {
        return electionDetector;
    }

    public static void setElectionDetector(Process electionDetector) {
        Election.electionDetector = electionDetector;
    }

    public static boolean isPingFlag() {
        return pingFlag;
    }

    public static void setPingFlag(boolean pingFlag) {
        Election.pingFlag = pingFlag;
    }

    public static boolean isElectionFlag() {
        return electionFlag;
    }

    public static void setElectionFlag(boolean electionFlag) {
        Election.electionFlag = electionFlag;
    }

    public static void initialElection(RunningThread[] t) {
        Process temp = new Process(-1, -1);
        for (int i = 0; i < t.length; i++) {
            if (temp.getPriority() < t[i].getProcess().getPriority()) {
                temp = t[i].getProcess();
            }
        }
        t[temp.pid - 1].getProcess().CoOrdinatorFlag = true;
    }
}
