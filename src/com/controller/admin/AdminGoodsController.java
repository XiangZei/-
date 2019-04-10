package com.controller.admin;

import com.dao.AdminGoodsDao;
import com.po.Goods;
import com.service.admin.AdminGoodsService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/adminGoods")
public class AdminGoodsController extends BaseController{

    @Autowired
    private AdminGoodsService adminGoodsService;


    @RequestMapping("/selectGoods")
    public String selectGoods(Model model,Integer pageCur,String act){
        return adminGoodsService.selectGoods(model,pageCur,act);
    }

    /**
     * addҳ���ʼ��
     */
    @RequestMapping("/toAddGoods")
    public String toAddGoods(Model model){
        model.addAttribute("goods",new Goods());
        return "admin/addGoods";
    }

    /**
     * �������޸�
     */
    @RequestMapping("/addGoods")
    public String addGoods(@ModelAttribute Goods goods, HttpServletRequest request,String updateAct){
        return adminGoodsService.addOrUpdateGoods(goods,request,updateAct);
    }

    /**
     * ��ѯһ����Ƭ
     * ѡ��һ����Ʒ����Խ����޸ĺͲ鿴���飬����Ҫ��jspҳ���д���������selectAgoods�������д���һ��act����
     */
    @RequestMapping("/selectAGoods")
    public String selectAGoods(Model model,Integer id,String act){
        return adminGoodsService.selectAGoods(model,id,act);
    }

    /**
     * ɾ�������Ʒ
     */
    @RequestMapping("/deleteGoods")
    public String deleteGoods(Integer[] ids,Model model){
        return adminGoodsService.deleteGoods(ids,model);
    }

    /**
     * ɾ��������Ʒ
     */
    @RequestMapping("/deleteAGoods")
    public String deleteAGoods(Integer id,Model model){
        return adminGoodsService.deleteAGoods(id,model);
    }

}