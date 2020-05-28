package com.emd.clientui.controller;

import com.emd.clientui.beans.ProductBean;
import com.emd.clientui.proxies.ProxyProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClientController  {

    @Autowired
    ProxyProduct proxyProduct;

    @RequestMapping("/")
    public String accueil(Model model){
      List<ProductBean> produits =  proxyProduct.listeDesProduits();
      model.addAttribute("produits", produits);
        return "Accueil";
    }


}
