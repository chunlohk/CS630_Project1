public static void main(String[] args) {
        int timeQuantum = 4;
        int signalInterval = 3;
        int currentTime = 0;
        int nextSignal = 3;
        int nextPid = 3;
            
        Process[] readyQueue = new Process[13];
        int queueSize = 0;       
        Process[] allProcess = new Process[13];
        int totalProcess = 0;
        GanttChtEntry[] gantt = new GanttChtEntry[27];
        int chartSize = 0;
        
        Process p1 = new Process();
        p1.id = 1;
        p1.program = "A";
        p1.priority = 2;
        p1.burstTime = 10;
        p1.remainingTime = 10;
        
        Process p2 = new Process();
        p2.id = 2;
        p2.program = "B";
        p2.priority = 3;
        p2.burstTime = 7;
        p2.remainingTime = 7;

        readyqueue[queueSize++] = p1;
        allProcess[totalProcess++] = p1;
        readyqueue[queueSize++] = p2;
        allProcess[totalProcess++] = p2;

}
