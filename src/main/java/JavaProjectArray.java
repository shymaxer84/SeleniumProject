import java.util.*;

public class JavaProjectArray {

    public static void main(String[] args) {

        //(1)
//        int[] a = new int[3];   // int[] a ={1,2,3,};
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the elements of the array: ");
//
//        int i;
//        for (i = 0; i<a.length; i++) {
//            a[i] = input.nextInt();
//
//        }
//        for (i = 0; i<a.length; i++)
//        {
//            System.out.println("The Array is:"+a[i]);
//
//        }

        //(2)

//        System.out.println(" Enter the elements of the array: ");
//        Scanner input = new Scanner(System.in);
//        int[][] a = new int[2][3];
//        a[0][0]=input.nextInt();
//        a[0][1]=input.nextInt();;
//        a[0][2]=input.nextInt();;
//        a[1][0]=input.nextInt();;
//        a[1][1]=input.nextInt();;
//        a[1][2]=input.nextInt();;
//        System.out.println(" The  elements of the array are : ");
//        int i;
//        int j = 0;
//        for (i = 0; i < a.length; ++i) {
//            for (j = 0; j < a[i].length; ++j) {
//                System.out.print(a[i][j]+" ");
//
//            }
//            System.out.println('\n'+"-----");
//
//        }
//

        //(3)

//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(5);
//        numbers.add(6);
//        numbers.add(3);
//        numbers.add(7);
//        numbers.add(2);
//        numbers.add(2);
//
//        Iterator<Integer> runNumbers = numbers.iterator();
//        while(runNumbers.hasNext())
//        {
//            System.out.println(runNumbers.next());
//        }
//
//
//        //(4)
//        HashSet<String> hset = new HashSet<>();
//
//        hset.add("My");
//        hset.add("name");
//        hset.add("is");
//        hset.add("Dmitry");
//        hset.add("Dmitry");
//
//
//        //1 Example
//        for (String temp:hset)
//        {
//            System.out.println(temp);
//        }
            //2 Example
//        Iterator<String> inr = hset.iterator();
//
//        while(inr.hasNext())
//        { System.out.println(inr.next());}

//
        HashMap<Integer,String> setNames = new HashMap<>();
        HashMap<Integer,String> setNames2 = new HashMap<>(setNames);
        if(setNames2.equals(setNames))

        { setNames.put(100,"Alen");
            setNames.put(200,"Leon");
            setNames.put(300,"Yana");
            setNames.put(400,"Dima");
            for(String temp:setNames.values())
            {
                System.out.println(temp);

            }
            System.out.println('\n');
            System.out.println(setNames.get(200));

            for(Integer temp: setNames.keySet())
            {
                System.out.println(setNames.get(temp));
            }}




//        int size = 5;
//
//        ArrayList<String> mysting = new ArrayList<>();
//        String temp;
//        Scanner input = new Scanner(System.in);
//        for(int i=0;i<size;i++){
//
//            System.out.println("Enter item "+i+": ");
//            temp =input.nextLine();
//            mysting.add(temp);
//
//        }
//
//        System.out.println(mysting);
//    }

//    public int solution(int[]A) {
//
//        int[] a ={1,3,6,4,1,2};
//        Arrays.sort(a);
//        for (int i = 0; i < a.length - 1; i++) {
//            if (a[i] + 1 != a[i + 1]) {
//                return a[i] + 1;
//
//            }
//            System.out.println(a[i] + 1);
//        }
//        return -1;
//
  }





}
