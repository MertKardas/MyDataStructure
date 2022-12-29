package graphHomeWOrk;

import java.util.Arrays;

public class Graph {
    int graphMatrix[][];
    int vertices;
    boolean selected[];
    public Graph(int graphMatrix[][] , int v){
        this.graphMatrix =graphMatrix;
        this.vertices = v;
        selected = new boolean[v];
        Arrays.fill(selected,false);

    }
    public void prim(){
        int edge = 0;
        int INF = Integer.MAX_VALUE;
        int sum = 0;
        while (edge < vertices - 1) {


            int min = INF;
            int x = 0; // row number
            int y = 0; // col number

            selected[0] = true;

            for (int i = 0; i < vertices; i++) {
                if (selected[i] == true) {
                    for (int j = 0; j < vertices; j++) {

                        if (!selected[j] && graphMatrix[i][j] != 0) {
                            if (min > graphMatrix[i][j]) {
                                min = graphMatrix[i][j];
                                x = i;
                                y = j;

                            }
                        }

                    }

                }

            }
            System.out.println((char) ('A'+  x) + " -- " +(char)( 'B' + y) + " = "+ graphMatrix[x][y]);
            selected[y] = true;
            edge++;
            sum +=graphMatrix[x][y];


        }
        System.out.println(sum);
    }


}
