class array{
        void demo(){
        int[] ages=new int[3];
        double[] weight=new double[3];
        String[] name=new String[3];

        ages[0]=13;
            ages[1]=22;
            ages[2]=53;
            weight[0]=23.4;
            weight[1]=25.6;
            weight[2]=32.3;
            name[0]="Jena";
            name[1]="Jignesh";
            name[2]="Prakash";

            System.out.println(ages[0]);
            System.out.println(ages[1]);
            System.out.println(ages[2]);
            System.out.println(weight[0]);
            System.out.println(weight[1]);
            System.out.println(weight[2]);
            System.out.println(name[0]);
            System.out.println(name[1]);
           System.out.println(name[2]);

}

    public static void main(String[] args){
        array obj = new array();
        obj.demo();
    }

}
