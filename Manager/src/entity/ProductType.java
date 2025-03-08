package entity;

public class ProductType {
    private String id;      // 类别编号
    private String name;    // 类别名称

    public ProductType(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "商品类别[ID=" + id + ", 名称=" + name + "]";
    }
}
