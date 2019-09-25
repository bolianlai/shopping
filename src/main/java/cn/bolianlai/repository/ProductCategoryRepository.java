package cn.bolianlai.repository;

import cn.bolianlai.entity.Product;
import cn.bolianlai.entity.ProductCategory;

import java.util.List;

public interface ProductCategoryRepository {
    public List<ProductCategory> findProductCategoryByLevel(ProductCategory productCategory);
    public List<Product> findAllProductByLevel(ProductCategory productCategory);
}
