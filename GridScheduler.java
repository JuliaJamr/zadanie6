public class GridScheduler {
    private final int processors = 2;
    private final int slots = 3;
    private Task[][] grid = new Task[processors][slots];

    public GridScheduler(){}

    boolean scheduleTask(Task t)
    {
        if(full()) return false;
        int i, j;
        int[] pom = new int[processors];
        for(i=0;i<processors;i++)
        {
            pom[i]=0;
            for(j=0;j<slots;j++)
            {
                if(grid[i][j]!=null)
                {
                    pom[i]+=grid[i][j].getExecutionTime();
                }
            }
        }

        int min = pom[0];
        int pom2 = 0;
        for(i=1;i<processors;i++)
        {
            if(pom[i]<min)
            {
                min = pom[i];
                pom2 = i;
            }
        }

        if(fullLine(pom2)) return false;

        i=0;
        while(grid[pom2][i]!=null) i++;
        grid[pom2][i] = t;

        return true;

    }

    private boolean fullLine(int line)
    {
        for(int i=0;i<slots;i++)
        {
            if(grid[line][i]==null) return false;
        }

        return true;
    }

    private boolean full()
    {
        int i, j;

        for(i=0;i<processors;i++)
        {
            for(j=0;j<slots;j++)
            {
                if(grid[i][j]==null)
                {
                    return false;
                }
            }
        }

        return true;
    }
}
