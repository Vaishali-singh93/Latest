package leet;

public class TestA {

    java.util.List<functionaltest.java8practise.Employee> em = new java.util.ArrayList<>();

    public static void fun1() {
       //2 hashmap same vales between 2 are stored in 3rd hashmap

        java.util.HashMap<Integer, String> m1 = new java.util.HashMap<>();
        m1.put(1,"test1");
        m1.put(2,"test13");
        m1.put(3,"test9");
        m1.put(4,"test19");

        java.util.HashMap<Integer, String> m2 = new java.util.HashMap<>();
        m2.put(1,"test12");
        m2.put(2,"test13");
        m2.put(3,"test8");
        m2.put(4,"test19");

        java.util.HashMap<Integer, String> m3 = new java.util.HashMap<>();

        for(java.util.Map.Entry<Integer,String> entry1:m1.entrySet()) {
            for(java.util.Map.Entry<Integer,String> entry2:m2.entrySet()) {
                if(entry1.getValue().equals(entry2.getValue())){
                    m3.put(entry1.getKey(),entry1.getValue());
                }
            }
        }

        System.out.println(m3);

    }

    public static void fun2(String str) {
        //removing trailing character from string
      char[] a = str.toCharArray();
      char b = a[a.length-1];
      int count =1;
      for(int j=a.length-2;j>=0;j--){
          if(a[j]==b) {
              count++;
          } else if (a[j]!=b) {
              break;
          }
      }
      String removedTrailingChar = str.substring(0,str.length()-count);
      System.out.println(removedTrailingChar);
    }

    public static void fun3(int[] num) {
        java.util.ArrayList<java.util.List<Integer>> list2 = new java.util.ArrayList<>();
        for(int i=0;i<num.length-2;i++) {
            for(int j=i;j<num.length-2 ;j++){
                java.util.ArrayList<Integer> list1 = new java.util.ArrayList<>();
              if(num[i]+num[j+1]+num[j+2]==0) {
               list1.add(num[i]);
               list1.add(num[j+1]);
               list1.add(num[j+2]);
               list2.add(list1);
              }
            }
        }
        java.util.Set<String> set = new java.util.HashSet<>();
        java.util.List<java.util.List<Integer>> uniqueLists = new java.util.ArrayList<>();
        for (java.util.List<Integer> list : list2) {
            String listString = list.toString();
            if (set.add(listString)) {
                uniqueLists.add(list);
            }
        }

        System.out.print(uniqueLists);
    }

    public static void fun4 () {
        String s = "vaishali singh bha";
        String t = org.apache.commons.lang3.StringUtils.remove(s,"bha");
        String u = org.apache.commons.lang3.StringUtils.remove(s,'a');
        System.out.println(t);
        System.out.println(u);

    }

    public static void fun5 () {
        //list to string
//        java.util.ArrayList<String> ar = new java.util.ArrayList<>();
//        ar.add("varsha");
//        ar.add("singh");
//        ar.add("tesr");
//        ar.add("kor");
//       // String st = ar.stream().map(String::toString).collect(java.util.stream.Collectors.joining());
////        System.out.println(st);
//        ar.stream().sorted().forEach(System.out::println);
        java.util.List<String> greekLetters= new java.util.ArrayList<>();
        greekLetters.add("Alpha");
        greekLetters.add("Beta");
        greekLetters.add("Alfa");
        greekLetters.add("");
        greekLetters.add("Gamma");
        greekLetters.add("");
        greekLetters.stream().filter(a->a.equals("")).count();
    }

    public static void fun6 () {
        //list to string
//        java.util.ArrayList<functionaltest.java8practise.Employee> ar = new java.util.ArrayList<>();
//        ar.add(new functionaltest.java8practise.Employee("var","sin",23));
//        ar.add(new functionaltest.java8practise.Employee("sur","tes",90));
//        ar.add(new functionaltest.java8practise.Employee("ami","bha",17));
//        ar.add(new functionaltest.java8practise.Employee("kir","roy",21));


//        ar.sort((e1,e2)->e2.getAge()-e1.getAge());
//        ar.forEach(a-> System.out.println(a.getAge()));
//        ar.stream().sorted(java.util.Comparator.comparing(functionaltest.java8practise.Employee::getFirstname).reversed());
//        ar.forEach(a->System.out.println(a.getFirstname()));
//        ar.stream().sorted(java.util.Comparator.comparing(functionaltest.java8practise.Employee::getFirstname).reversed())
//                .forEach(System.out::println);
//        ar.sort(java.util.Comparator.comparing(functionaltest.java8practise.Employee::getFirstname));
//        ar.forEach(a->System.out.println(a.getFirstname()));
//        ar.sort((e1,e2)->e1.getFirstname().compareTo(e2.getFirstname()));
//        ar.forEach(a-> System.out.println(a.getFirstname()));
//        java.util.Set<Integer> se = new java.util.TreeSet<>(java.util.Comparator.reverseOrder());
//        se.add(67);
//        se.add(1);
//        se.add(69);
//        se.add(21);
//        System.out.println(se);

        java.util.Map<Integer,String> map = new java.util.HashMap<>();
        map.put(15,"var");
        map.put(0,"sur");
        map.put(56,"ami");
        map.put(12,"te");

        map.entrySet().stream().map(java.util.Map.Entry::getValue).sorted(java.util.Comparator.reverseOrder()).forEach(System.out::println);
    }

    public void testParentChild() {
        System.out.println("in parent");
    }


    public static void main(String[] args) {
//        int [] nums = {-1,0,1,0};
//        fun3(nums);
 //       fun4();
 //       fun5();
        fun6();
        new StringBuffer("varsha").reverse();
    }
}
