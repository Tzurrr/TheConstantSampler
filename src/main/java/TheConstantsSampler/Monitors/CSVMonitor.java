package TheConstantsSampler.Monitors;
public class CSVMonitor implements Monitor{

    public int split(int data_size){
        int temp = data_size/50000;
        if (temp % 1 > 0){
            temp++;
        }
        return temp;
    }
}
