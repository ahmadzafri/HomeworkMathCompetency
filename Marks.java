public class Marks {
    private float marks[];
    private int numData;

    Marks(int numData) {
        createData(numData);
    }

    //operation
    public void createData(int numData) {
        marks = new float[numData];
        for (int i=0; i<numData; i++) {
            marks[i] =  0;
        }
        numData = numData;
    }

    public float calcAvg() {
        float sum =0;
        for (int i=0; i<numData; i++) {
            sum += marks[i];
        }
        float avg = sum / numData;
        return avg;
    }
}
