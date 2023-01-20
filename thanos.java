import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class thanos {
    public static void main(String[] args) {
        FastReader fastReader = new FastReader();
        int loop = fastReader.nextInt();
        for (int x = 0; x < loop; x++) {
            int yrs = 0;
            double pop = fastReader.nextDouble(); //parse input
            double rate = fastReader.nextDouble();
            double food = fastReader.nextDouble();
            
            while (pop <= food) { //check if food production is exceeded
                yrs++;
                pop = pop*rate; // update population
                }
                System.out.println(yrs); // output

            }

        }

    
        static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
