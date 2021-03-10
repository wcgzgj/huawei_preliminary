package com.wtnl.pojo;

/**
 * @ClassName VM
 * @Description 虚拟机实体类
 * @Author FARO_Z
 * @Date 2021/3/10 上午10:34
 * @Version 1.0
 **/
public class VM {
    private String type; //型号
    private int core; //CUP核数
    private int ram; //内存大小
    private boolean isDoubleNode; //是否双节点部署

    public VM() {
    }

    public VM(String type, int core, int ram, boolean isDoubleNode) {
        this.type = type;
        this.core = core;
        this.ram = ram;
        this.isDoubleNode = isDoubleNode;
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

    public boolean isDoubleNode() {
        return isDoubleNode;
    }

    public void setDoubleNode(boolean doubleNode) {
        isDoubleNode = doubleNode;
    }

    @Override
    public String toString() {
        return "VM{" +
                "type='" + type + '\'' +
                ", core=" + core +
                ", ram=" + ram +
                ", isDoubleNode=" + isDoubleNode +
                '}';
    }
}
