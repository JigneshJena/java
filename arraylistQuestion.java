import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class arraylistQuestion {
    static void reverseList(ArrayList<Integer> list){
        int i=0,j=list.size()-1;
        while (i<j){
            Integer temp =Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;

      }}
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("ORIGINAL List " + list);
//        reverseList(list);
            Collections.reverse(list);
        System.out.println("Rverse List "+list);
        Collections.sort(list);
        System.out.println("Ascending order "+ list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Desc order "+list);

        ArrayList<String> l3 =new ArrayList<>();
        l3.add("Welcome");
        l3.add("to");
                l3.add("My house");
        System.out.println("Og list "+l3);
        Collections.sort(l3);
        System.out.println("Sorted in asc  "+l3);
        Collections.sort(l3,Collections.reverseOrder());
        System.out.println("Sorted"+l3);
    }

}
