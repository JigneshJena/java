import javax.xml.transform.Source;
import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args){
        //Wrapper Classes
//        Integer i=Integer.valueOf(4);
//        System.out.println(i);
//        Float f = Float.valueOf(4.5f);
//        System.out.println(f);

        //Array list
           ArrayList<Integer> l1 = new ArrayList<>();
//           ArrayList<Boolean> l2 = new ArrayList<>();
//           ArrayList<Float>  l3=new ArrayList<>();

        l1.add(5);//it add end of the string
        l1.add(65);
        l1.add(43);
        System.out.println(l1.get(1));

        for (int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        System.out.println(l1);
        //adding element on any index
        l1.add(1,203);
        System.out.println(l1);


        //modifying elements at index i
        l1.set(1,698);
        System.out.println(l1);


        //removing an element at index i
        l1.remove(1);
        System.out.println(l1);

        //removing an element e when we dont know the element index
        l1.remove(Integer.valueOf(5));
        //if we remove or try to remove any value which is not present in the list it does't give any error

        System.out.println(l1);
        l1.remove(Integer.valueOf(456));//like this the list [5,65,43] and we try to remove 456 it does't give erreo
        System.out.println(l1);//it just print the list
        System.out.println(l1.remove(Integer.valueOf(456)));//it give Boolean Value
        boolean ans =l1.contains(Integer.valueOf(65));
        System.out.println(ans);

        //if you don't specify class, you can put anything inside l
        ArrayList l=new ArrayList();
        l.add("jignesh");
        l.add(1);
        l.add(5.3);
        System.out.println(l);//here we add string and integer and float we can add anything if we don't specify any thing like integer or float or any just leave empty
        System.out.println(l1 .indexOf(43));
        System.out.println(l1 .lastIndexOf(43));
        System.out.println(l1.isEmpty());
    }

}
