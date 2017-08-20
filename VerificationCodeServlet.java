package Db.login.Utils;

import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Dw.L on 2017/4/20  登录页面调用photomake
 * XMl 配置servlet 使用这个servlet
 */
public class photo_servlet extends javax.servlet.http.HttpServlet {
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        photomake photomake = new photomake(); //得到图片类的对象
        BufferedImage img = photomake.getImage();//得到的一次性图片
        photomake.output(img,response.getOutputStream());//把一次性图片写入流中
        request.getSession().setAttribute("turecode",photomake.getText());
    }

}