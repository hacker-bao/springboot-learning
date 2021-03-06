package com.imooc.o2o.service;

import com.imooc.o2o.dto.ImageHolder;
import com.imooc.o2o.dto.ProductExecution;
import com.imooc.o2o.entity.Product;
import com.imooc.o2o.exceptions.ProductOperationException;

import java.util.List;

public interface ProductService {
    ProductExecution addProduct(Product product,
                                ImageHolder thumbnail,
                                List<ImageHolder> productImgHolderList) throws ProductOperationException;

    Product getProductById(long productId);

    ProductExecution modifyProduct(Product product, ImageHolder thumbnail, List<ImageHolder> productImgHolderList) throws ProductOperationException;

    ProductExecution getProductList(Product productCondition, int pageIndex, int pageSize);
}
