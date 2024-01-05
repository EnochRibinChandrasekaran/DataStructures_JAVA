package algorithms.unionfind;

/*Time Complexity
Algorithm: quick-find
initialize: N
find: 1
union: N
eager approach - because it changes the value of the ID the instant it is union.
* */
public class QuickFindUF {

    public int[] idArray;

    public QuickFindUF(int length) {
        this.idArray = new int[length];
        for (int i = 0; i < length; i++) {
            this.idArray[i] = i;
        }
    }

    public boolean connected(int pid, int qid) {
        return idArray[pid] == idArray[qid];
    }

    public void union(int p, int q) {
        int pidIndex = idArray[p];
        int qidIndex = idArray[q];

        if (!connected(p, q)) {
            for (int i = 0; i < idArray.length; i++) {
                if(idArray[i] == pidIndex){
                    idArray[i] = qidIndex;
                }
            }
        }
    }

    public static void main(String[] args){
        System.out.println("Quick Find");
        QuickFindUF qf = new QuickFindUF(10);
        System.out.println("Array :");
        for(int i =0;i<10;i++){
            System.out.println(i + " | " + qf.idArray[i]);
        }
        qf.union(1,2);
        System.out.println("Array :");
        for(int i =0;i<10;i++){
            System.out.println(i + " | " + qf.idArray[i]);
        }
        qf.union(1,3);
        System.out.println("Array :");
        for(int i =0;i<10;i++){
            System.out.println(i + " | " + qf.idArray[i]);
        }
        qf.union(4,2);
        System.out.println("Array :");
        for(int i =0;i<10;i++){
            System.out.println(i + " | " + qf.idArray[i]);
        }
        qf.union(8,9);
        System.out.println("Array :");
        for(int i =0;i<10;i++){
            System.out.println(i + " | " + qf.idArray[i]);
        }
        qf.union(1,0);
        System.out.println("Array :");
        for(int i =0;i<10;i++){
            System.out.println(i + " | " + qf.idArray[i]);
        }
        qf.union(1,0);
        System.out.println("Array :");
        for(int i =0;i<10;i++){
            System.out.println(i + " | " + qf.idArray[i]);
        }

        System.out.println("Is connected : 4,1" + qf.connected(4,1));
    }


}
