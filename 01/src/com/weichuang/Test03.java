package com.weichuang;

public class Test03 {
    public static void main(String[] args) {
        User u = new User(); //ox000
//        u.name = "zs";
        u.setName("zs");
        User u1 = new User();//ox 111
        u1 = u; //ox000
        u1.setName("lisi");
        u.eat();
        xxx(u);//
        System.out.println(u.getName());//lisi
    }

    public static void xxx(User u){//ox000
        u = new User();
        u.setName("wangwu");
        System.out.println(u.getName());
    }
}
class User{
    private String name;
    private int age;
    public User(){

    }
    public User(String n,int a){
        this.name = n;
        this.age = a;
    }
    public void eat(){
        System.out.println("eating "+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
