package service;

import entity.Product;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ProductService {
    private Map<String, Product> productMap = new HashMap<>();

    // 新增商品
    public void addProduct(String name, BigDecimal price, int count, String typeId) {
        // 检查商品是否存在
        if (isProductExists(name)) {
            System.out.println("商品已存在，只增加库存数量！");
            updateProductCountByName(name, count); // 如果已存在，增加库存数量
            return;
        }

        String id = UUID.randomUUID().toString();
        Product product = new Product(id, name, price, count, typeId);
        productMap.put(id, product);
        System.out.println("商品添加成功: " + product);
    }

    // 移除商品
    public void removeProduct(String id) {
        if (productMap.containsKey(id)) {
            productMap.remove(id);
            System.out.println("商品ID " + id + " 已移除");
        } else {
            System.out.println("未找到该ID的商品！");
        }
    }

    // 显示商品列表
    public void showProductList() {
        if (productMap.isEmpty()) {
            System.out.println("当前没有商品记录。");
        } else {
            productMap.values().forEach(System.out::println);
        }
    }

    // 商品入库
    public void addStock(String id, int quantity) {
        Product product = productMap.get(id);
        if (product != null) {
            product.setCount(product.getCount() + quantity);
            System.out.println("商品入库成功，当前库存数量: " + product.getCount());
        } else {
            System.out.println("未找到该ID的商品！");
        }
    }

    // 商品出库
    public void removeStock(String id, int quantity) {
        Product product = productMap.get(id);
        if (product != null) {
            if (product.getCount() >= quantity) {
                product.setCount(product.getCount() - quantity);
                System.out.println("商品出库成功，当前库存数量: " + product.getCount());
            } else {
                System.out.println("库存不足，出库失败！");
            }
        } else {
            System.out.println("未找到该ID的商品！");
        }
    }

    // 根据商品名称检查是否已存在
    private boolean isProductExists(String name) {
        return productMap.values().stream().anyMatch(p -> p.getName().equals(name));
    }

    // 更新已有商品的库存
    private void updateProductCountByName(String name, int count) {
        productMap.values().stream()
                .filter(p -> p.getName().equals(name))
                .forEach(p -> p.setCount(p.getCount() + count));
    }
}
