package com.imooc.o2o.service;

import com.imooc.o2o.dto.ImageHolder;
import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.exceptions.ShopOperationException;

import java.io.InputStream;

public interface ShopService {
    ShopExecution addShop(Shop shop, ImageHolder thumbnail) throws ShopOperationException;

    /**
     * 通过店铺Id获取店铺信息
     * @param shopId
     * @return
     */
    Shop getByShopId(long shopId);

    ShopExecution modifyShop(Shop shop, ImageHolder thumbnail) throws ShopOperationException;

    ShopExecution getShopList(Shop shopCondition, int pageIndex, int pageSize);
}
