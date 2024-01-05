package algorithms.unionfind;


/*Time Complexity
Algorithm: quick-union
initialize: N
find: N
union: N
lazy approach - because it changes only the root value of the ID the instead of all the element it is union.
* */
public class QuickUnionUF {
    private int[] id;

    public QuickUnionUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) id[i] = i;
    }

    private int root(int i) {
        while (i != id[i]) i = id[i];
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }


    public static void main(String[] args) {
        System.out.println("Quick Union");
        QuickUnionUF qf = new QuickUnionUF(7);
        System.out.println("Array :");
        for (int i = 0; i < 7; i++) {
            System.out.println(i + " | " + qf.id[i]);
        }
        qf.union(0, 1);
        System.out.println("Array :");
        for (int i = 0; i < 7; i++) {
            System.out.println(i + " | " + qf.id[i]);
        }
        qf.union(2, 0);
        System.out.println("Array :");
        for (int i = 0; i < 7; i++) {
            System.out.println(i + " | " + qf.id[i]);
        }
        qf.union(3, 4);
        System.out.println("Array :");
        for (int i = 0; i < 7; i++) {
            System.out.println(i + " | " + qf.id[i]);
        }
        qf.union(5, 4);
        System.out.println("Array :");
        for (int i = 0; i < 7; i++) {
            System.out.println(i + " | " + qf.id[i]);
        }
        qf.union(6, 5);
        System.out.println("Array :");
        for (int i = 0; i < 7; i++) {
            System.out.println(i + " | " + qf.id[i]);
        }
        System.out.println("Is connected : 4,1" + qf.connected(4, 1));
    }
}


