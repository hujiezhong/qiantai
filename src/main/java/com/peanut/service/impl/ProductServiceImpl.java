package com.peanut.service.impl;

import com.peanut.dao.ProductDao;
import com.peanut.entity.Product;
import com.peanut.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao pd;

    @Override
    public List<Product> select() {
        return pd.select();
    }
}
