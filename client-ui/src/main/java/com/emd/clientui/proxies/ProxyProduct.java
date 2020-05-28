package com.emd.clientui.proxies;

import com.emd.clientui.beans.ProductBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "zuul-server")
@RibbonClient(name= "microservice-produits")
public interface ProxyProduct {

    @GetMapping(value = "/microservice-produits/Produits")
    List<ProductBean> listeDesProduits();
    @GetMapping( value = "/microservice-produits/Produits/{id}")
    ProductBean recupererUnProduit(@PathVariable int id);


    }
