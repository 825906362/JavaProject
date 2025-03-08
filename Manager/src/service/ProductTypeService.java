package service;

import entity.ProductType;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ProductTypeService {
    private Map<String, ProductType> productTypeMap = new HashMap<>();

    // 新增商品类别
    public void addProductType(String name) {
        if (isProductTypeExists(name)) {
            System.out.println("商品类别已存在！");
            return;
        }

        String id = UUID.randomUUID().toString();
        ProductType productType = new ProductType(id, name);
        productTypeMap.put(id, productType);
        System.out.println("商品类别添加成功: " + productType);
    }

    // 移除商品类别
    public void removeProductType(String id) {
        if (productTypeMap.containsKey(id)) {
            productTypeMap.remove(id);
            System.out.println("商品类别ID " + id + " 已移除");
        } else {
            System.out.println("未找到该ID的商品类别！");
        }
    }

    // 显示商品类别列表
    public void showProductTypeList() {
        if (productTypeMap.isEmpty()) {
            System.out.println("当前没有商品类别记录。");
        } else {
            productTypeMap.values().forEach(System.out::println);
        }
    }

    // 检查商品类别是否已存在
    private boolean isProductTypeExists(String name) {
        return productTypeMap.values().stream().anyMatch(pt -> pt.getName().equals(name));
    }
}

