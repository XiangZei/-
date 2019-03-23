package com.controller.admin;


import com.exception.AdminLoginNoException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class BaseController {

    /**
     *��¼Ȩ�޿��ƣ��ڴ�����ǰִ�и÷���
     * @throws AdminLoginNoException
     */
    @ModelAttribute
    public void isLogin(HttpSession session, HttpServletRequest request)
    throws AdminLoginNoException {
            if(session.getAttribute("auser")==null){
                throw new AdminLoginNoException("û�е�½");
            }
    }
}
