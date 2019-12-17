package com.newCoder;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestDemo {

    public static void main(String[] args) {
        //demoOperation();
        //demoList();
        //demoMapTable();
        //demoSet();
        //demoException();
        //demoOO();
        demoFunction();
    }
    public static void print(int index,Object object){
        System.out.println(String.format("{%d},%s",index,object.toString()));

    }
    public static void demoOperation(){
        print(0, 5 + 2);
    }

    //List
    public static void demoList(){
        //可变数组
        List<String> strList = new ArrayList<>(10);
        for(int i = 0; i< 4;i++){
            strList.add(String.valueOf(i*i));
        }
        print(1,strList);

        List<String> strListB = new ArrayList<>();
        for(int i = 0; i< 4;i++){
            strListB.add(String.valueOf(i));
        }
        strList.addAll(strListB);
        print(2,strList);
        strList.remove(0);
        print(3,strList);
        strList.remove(String.valueOf(1));
        print(4,strList);

        Collections.reverse(strList);
        print(5,strList);

        Collections.sort(strList);
        print(6,strList);
        Collections.sort(strList, new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
                //先比分数
                //再比学号
            }
        });
        print(7,strList);

        for(String obj: strList){
            print(8,obj);
        }

        for (int i = 0; i < strList.size() ; i++) {
            print(9,strList.get(i));
        }

        int[] array = new int[]{1,2,3};
        print(11,array[1]);
    }

    //Map
    public static void demoMapTable(){
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            map.put(String.valueOf(i),String.valueOf(i*i));
        }
        print(1,map);
        for(Map.Entry<String,String> entry : map.entrySet())
            print(2,entry.getKey() + "|" + entry.getValue());
        print(3,map.values());
        print(4,map.keySet());
        print(5,map.get("3"));
        print(6,map.containsKey("A"));
        map.replace("3","27");
        print(7,map.get("3"));
    }

    //Set
    public static void demoSet(){
        Set<String> strSet = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
        }
        print(1,strSet);
        strSet.remove(String.valueOf(1));
        print(2,strSet);
        print(3,strSet.contains(String.valueOf(1)));
        print(4,strSet.isEmpty());
        print(5,strSet.size());

        strSet.addAll(Arrays.asList(new String[]{"A","B","C"}));
        print(6,strSet);
        for(String value: strSet)
            print(7,value);
    }

    //异常处理
    public static void demoException(){
        try{
            int k = 2;
            //k = k / 0;
            if(k == 2)
                throw new Exception("我故意");
        }catch (Exception e){
            print(2,e.getMessage());
        }finally {
            print(3,"finally");
        }
    }

    public static  void demoOO(){
        Animal a = new Animal("Jim",1);
        a.say();
        Animal h = new Human("David",22,"China");
        h.say();
    }

    public static void demoFunction(){
        Random random = new Random();

        //此处生成的是伪随机数，因此下式指定一个种子，则随机数不变
        //random.setSeed(1);
        print(1,random.nextInt(1000));
        print(2, random.nextFloat());

        List<Integer> array = Arrays.asList(new Integer[] {1,2,3,4,5});
        Collections.shuffle(array);
        print(3, array);

        Date date = new Date();
        print(4,date);
        print(5,date.getTime());

        DateFormat df= new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        print(6,df.format(date));

        print(7,UUID.randomUUID());
        print(8,Math.log(10));
        print(9,Math.min(3,10));
        print(10,Math.ceil(2.2));
        print(11,Math.floor(2.2));
    }
}

