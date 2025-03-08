package entity;

import java.math.BigDecimal;

public class Product {
    private String id;            // 商品编号
    private String name;          // 商品名称
    private BigDecimal price;     // 商品价格
    private int count;            // 商品数量
    private String typeId;        // 商品类别编号

    // 构造函数
    public Product(String id, String name, BigDecimal price, int count, String typeId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
        this.typeId = typeId;
    }

    // Getter 和 Setter
    public String getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }
    public int getCount() { return count; }
    public void setCount(int count) { this.count = count; }
    public String getTypeId() { return typeId; }
    public void setTypeId(String typeId) { this.typeId = typeId; }

    @Override
    public String toString() {
        return "商品[ID=" + id + ", 名称=" + name + ", 价格=" + price + ", 数量=" + count + ", 类别ID=" + typeId + "]";
    }
}
