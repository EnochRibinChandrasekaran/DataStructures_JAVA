package algorithms.unionfind;


import java.util.Arrays;

/*Time Complexity
Algorithm: quick-union
initialize: N
find: N
union: N
lazy approach - because it changes only the root value of the ID the instead of all the element it is union.
WQUUF
init : N
find : lgN
union: lgN
much faster near to constant time
* */
public class QuickUnionUF {
    public int[] id;
    public int[] sz;

    public QuickUnionUF(int N) {
        id = new int[N];
        sz= new int[N];
        for (int i = 0; i < N; i++) {
        id[i] = i;
        sz[i] =i;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            id[i] =id[id[i]];
            i = id[i];
        }

        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        System.out.println("root of :"+ p + "is :" + i);
        int j = root(q);
        System.out.println("root of :"+ q + "is :" + j);
        if(i==j)return;
        if(sz[i]<sz[j]){
            id[i] = j;
            sz[j] += sz[i];
        }else{
            id[j] = i;
            sz[i] += sz[j];
        }
    }


    public static void main(String[] args) {
        System.out.println("Quick Union");
        QuickUnionUF qf = new QuickUnionUF(7);
        System.out.println("Array :");
        for (int i = 0; i < 7; i++) {
            System.out.println(i + " | " + qf.id[i]);
        }
        System.out.println("Size Array :"+ Arrays.toString(qf.sz));
        qf.union(0, 1);
        System.out.println("Array :");
        for (int i = 0; i < 7; i++) {
            System.out.println(i + " | " + qf.id[i]);
        }
        System.out.println("Size Array :"+ Arrays.toString(qf.sz));
        qf.union(2, 0);
        System.out.println("Array :");
        for (int i = 0; i < 7; i++) {
            System.out.println(i + " | " + qf.id[i]);
        }
        System.out.println("Size Array :"+ Arrays.toString(qf.sz));
        qf.union(3, 4);
        System.out.println("Array :");
        for (int i = 0; i < 7; i++) {
            System.out.println(i + " | " + qf.id[i]);
        }
        System.out.println("Size Array :"+ Arrays.toString(qf.sz));
        qf.union(5, 4);
        System.out.println("Array :");
        for (int i = 0; i < 7; i++) {
            System.out.println(i + " | " + qf.id[i]);
        }
        System.out.println("Size Array :"+ Arrays.toString(qf.sz));
        qf.union(6, 5);
        System.out.println("Array :");
        for (int i = 0; i < 7; i++) {
            System.out.println(i + " | " + qf.id[i]);
        }
        System.out.println("Size Array :"+ Arrays.toString(qf.sz));
        System.out.println("Is connected : 4,5" + qf.connected(4, 5));
    }
}


