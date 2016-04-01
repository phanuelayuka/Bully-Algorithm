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
public class Process {

    int pid;
    boolean downflag,CoOrdinatorFlag;

    public boolean isCoOrdinatorFlag() {
        return CoOrdinatorFlag;
    }

    public void setCoOrdinatorFlag(boolean isCoOrdinator) {
        this.CoOrdinatorFlag = isCoOrdinator;
    }
    int priority;

    public boolean isDownflag() {
        return downflag;
    }

    public void setDownflag(boolean downflag) {
        this.downflag = downflag;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Process() {
    }

    public Process(int pid, int priority) {
        this.pid = pid;
        this.downflag = false;
        this.priority = priority;
        this.CoOrdinatorFlag = false;
    }
}