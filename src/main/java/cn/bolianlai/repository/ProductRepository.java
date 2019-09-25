package cn.bolianlai.repository;

import cn.bolianlai.entity.Product;

import java.util.List;

public interface ProductRepository {
    public Product findById(int id);
    public List<Product> findAllByKeyWord(String keyWord);
}
