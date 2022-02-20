public class zor {
        public static void main(String[] args) {

            int [][] arr = {{1,3},{1,2},{9,5}};

            for (int i=0;i<arr.length;i++)
            {
                for(int j=0;j<2;j++)
                {

                    System.out.print(arr[i][j]+ " ");

                }
                System.out.println();
            }

            System.out.println("====TRANSPOZU====");
            for (int i=0;i<2;i++)
            {
                for(int j=0;j< arr.length;j++)
                {

                    System.out.print(arr[j][i]+" ");

                }
                System.out.println();
            }

        }
    }

