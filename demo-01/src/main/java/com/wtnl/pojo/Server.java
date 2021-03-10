package com.wtnl.pojo;

/**
 * @ClassName Server
 * @Description 服务器实体类
 * @Author FARO_Z
 * @Date 2021/3/10 上午10:30
 * @Version 1.0
 **/
public class Server {
    private String type; //型号
    private int core; //CPU核数目
    private int ram; //内存大小
    private int price; //硬件成本
    private int consume; //能耗
    private int test;

    public Server() {
    }

    public Server(String type, int core, int ram, int price, int consume) {
        this.type = type;
        this.core = core;
        this.ram = ram;
        this.price = price;
        this.consume = consume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getConsume() {
        return consume;
    }

    public void setConsume(int consume) {
        this.consume = consume;
    }

    @Override
    public String toString() {
        return "Server{" +
                "type='" + type + '\'' +
                ", core=" + core +
                ", ram=" + ram +
                ", price=" + price +
                ", consume=" + consume +
                '}';
    }
}
