package normal;

public class User {
    public int rank;
    public int progress;
    public User(){
        this.rank = -8;
        this.progress =0;
    }

    public void incProgress(int prog) throws Exception {
        if(prog>8 || prog < -8 || prog==0) throw new IllegalArgumentException();
        int tot = Math.abs(rank) - Math.abs(prog);
        progress += 10 * tot * tot;
        if(progress > 99){
            progress -= 100;
            incRank();
        }
    }

    private void incRank() {
        if(rank==-1) rank=0;
        else if(rank==8){
            System.out.println("You can´t rank anymore. You succeeded the top!");
        }else{
            rank++;
        }
    }


}
