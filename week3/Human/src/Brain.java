public class Brain {
    private int iQ;
    private int brainCells;

    public Brain(){}

    @Override
    public String toString() {

        // original autogenerated .toString()
//        return "Brain{" +
//                "iQ=" + iQ +
//                ", brainCells=" + brainCells +
//                '}';

        // with call to super.toString()
        return super.toString() + " :: Brain{\n" +
                "iQ=" + iQ +
                ", brainCells=" + brainCells +
                '}';

    }

    public int getiQ() {
        return iQ;
    }

    public void setiQ(int iQ) {
        this.iQ = iQ;
    }

    public int getBrainCells() {
        return brainCells;
    }

    public void setBrainCells(int brainCells) {
        this.brainCells = brainCells;
    }

}
