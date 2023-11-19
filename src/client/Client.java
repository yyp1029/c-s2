package client;

import entity.User;
import server.Server;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    private void getAllUsers(){
        ArrayList<User> result =  Server.getAllUsers();
        result.forEach(user-> System.out.println(user.toString()));
    }

    private void deleteUserByName(){
        Scanner sc = new Scanner(System.in);

        System.out.println("输入要删除的联系人的姓名");
        String name = sc.next();
        Server.deleteUserByName(name);
    }

    private void addUser(){
        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.println("输入要添加的联系人的姓名");
        user.setName(sc.next());
        System.out.println("输入要添加的联系人的电话");
        user.setPhone(sc.next());
        System.out.println("输入要添加的联系人的地址");
        Server.addUses(user);
        user.setAddress(sc.next());
    }

    public void start(){
        boolean isExit = false;
        Scanner sc = new Scanner(System.in);
        while(!isExit){
            System.out.println("请输入要执行的操作");
            System.out.println("1.查询联系人");
            System.out.println("2.添加联系人");
            System.out.println("3.删除联系人");
            System.out.println("4.退出");
            int select = sc.nextInt();

            switch (select){
                case 1:
                {
                    getAllUsers();
                    break;
                }
                case 2:
                {
                    addUser();
                    break;
                }
                case 3:
                {
                    deleteUserByName();
                    break;
                }
                case 4:
                {
                    isExit=true;
                    break;
                }
            }
        }
    }
}
