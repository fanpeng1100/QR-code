package cn.guoan.servlet;

import cn.guoan.qrcode.QRCode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by fan on 2016/9/18.
 */
@Controller
public class QR_Code {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String toErWeiPage(){
        return "erweipage";
    }
    @RequestMapping(value = "/showErWeiMa",method = RequestMethod.GET)
    public void showErWeiMa(HttpServletRequest request,HttpServletResponse response,ModelMap map) throws IOException {
        String encoderContent = "fanpeng";
        String imgPath = "G:/qrcode.png";
        QRCode.encoderQRCode(encoderContent, response.getOutputStream(), "png");
    }
}
