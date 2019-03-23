package com.util;

import com.po.Buser;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyUtil {
    /**
     * ���ʱ���ַ���
     */
    public static String getStringID(){
        String id=null;
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSs");
        id = sdf.format(date);
        return id;
    }

    /**
     * ����û�ID
     */
    public static Integer getUserId(HttpSession session){
        Buser ruser = (Buser)session.getAttribute("bruser");
        return ruser.getId();
    }
}
