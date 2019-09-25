package cn.bolianlai.service;

import cn.bolianlai.entity.Product;
import cn.bolianlai.entity.ProductCategory;

import java.util.List;

public interface ProductService {
    public List<ProductCategory> findAllProductCategory();
    public List<Product> findAllProductByLevel(ProductCategory productCategory);
    public Product findById(int id);
    public List<Product> findAllByKeyWord(String keyWord);
}
