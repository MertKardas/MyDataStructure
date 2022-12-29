package graphHomeWOrk;

public class Main {
    public static void main(String[] args) {
        int charGraph[][] =new int[8][8];
        charGraph[0][1] =12;
        charGraph[0][2] =17;
        charGraph[0][3] = 20;
        charGraph[1][0] =12 ;
        charGraph[1][2] =21 ;
        charGraph[1][7] = 19;
        charGraph[2][0] =17 ;
        charGraph[2][1] =21 ;
        charGraph[2][3] = 4;
        charGraph[2][4] = 88 ;
        charGraph[2][6] = 6;
        charGraph[3][0] = 20;
        charGraph[3][2] = 4;
        charGraph[3][5] = 45;
        charGraph[3][5] = 13;
        charGraph[4][2] = 88;
        charGraph[4][5] = 30;
        charGraph[4][6] = 37;
        charGraph[4][7] = 19;
        charGraph[5][3] = 15;
        charGraph[5][4] = 30;
        charGraph[5][6] = 44;
        charGraph[6][2] = 6;
        charGraph[6][3] = 13;
        charGraph[6][4] = 37;
        charGraph[6][5] =44 ;
        charGraph[7][1] = 19;
        charGraph[7][4] = 19;
        Graph myGraph = new Graph(charGraph,8);
        myGraph.prim();






    }
}
