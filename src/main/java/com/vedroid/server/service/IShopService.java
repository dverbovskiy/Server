package com.vedroid.server.service;

import com.vedroid.server.exception.ShopNotFound;
import com.vedroid.server.model.Shop;

import java.util.List;

public interface IShopService {

    Shop create(Shop shop);

    Shop delete(Long id) throws ShopNotFound;

    List<Shop> findAll();

    Shop update(Shop shop) throws ShopNotFound;

    Shop findById(Long id);

}
