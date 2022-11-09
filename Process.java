class Process{//Process class shared between algorithms
    int arrTime;
    int burstTime;
    int priority;

    public Process(int arrTime, int burstTime){
        this.arrTime = arrTime;
        this.burstTime = burstTime;
    }
    
    public Process(int arrTime, int burstTime, int priority){
        this.arrTime = arrTime;
        this.burstTime = burstTime;
        this.priority = priority;
    }
}
