package Generics.CompareTo;
public class B implements A{
    int rank;

    public B(int rank) {
        this.rank = rank;
    }

    /**
     * we are compring based on ranks
     * @param o
     * @return
     */
    @Override
    public int compareTo(A o) {
        B b=(B)o;
        if(this.rank==b.rank){
            return 0;
        }
        else if(this.rank>b.rank){
            return 1;
        }
        else {
            return -1;
        }
     /*
     TODO:
     above logic can be replace with below single line,use what ever you want
     return this.rank ==b.rank ? 0:this.rank>b.rank?1:-1;
      */
    }
}
