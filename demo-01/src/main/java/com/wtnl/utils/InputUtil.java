package com.wtnl.utils;

import com.wtnl.pojo.Server;
import com.wtnl.pojo.VM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName InputUtil
 * @Description 输入工具 帮助程序输入
 * @Author FARO_Z
 * @Date 2021/3/10 上午10:57
 * @Version 1.0
 **/
public class InputUtil {
    public static String[] getInputArray(String str) {
        str=str.replaceAll("\\(","")
                .replaceAll("\\)","")
                .replaceAll("\\s*", "");
        return str.split(",");
    }

    // public static Object getInstance(Class,)

    public static List<Server> getServerList() {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        List<Server> servers = new ArrayList<Server>(num);
        while (num>0) {
            String str = sc.nextLine();
            String[] split = getInputArray(str);
            Server server = new Server(split[0], Integer.parseInt(split[1]),
                    Integer.parseInt(split[2]),
                    Integer.parseInt(split[3]),
                    Integer.parseInt(split[4]));
            servers.add(server);
            num--;
        }
        return servers;
    }

    public static List<VM> getVMList() {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        ArrayList<VM> vms = new ArrayList<VM>(num);
        while (num>0) {
            String str = sc.nextLine();
            String[] split = getInputArray(str);
            VM vm = new VM(split[0], Integer.parseInt(split[1]),
                    Integer.parseInt(split[2]),
                    Integer.parseInt(split[3]));
            vms.add(vm);
            num--;
        }
        return vms;
    }



    public static void main(String[] args) {
        List<Server> list = getServerList();
        List<VM> vmList = getVMList();
        System.out.println(list);
        System.out.println(vmList);
    }
}
