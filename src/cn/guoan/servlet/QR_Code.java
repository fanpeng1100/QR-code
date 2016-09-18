package cn.guoan.servlet;

import cn.guoan.qrcode.Entity_Qrcode;
import cn.guoan.qrcode.QrCode;
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
        Entity_Qrcode qrcode = new Entity_Qrcode();
        qrcode.setContent("http://www.baidu.com这是一个百度地址是发生的发生斯蒂芬随碟附送的斯蒂芬斯蒂芬是");
        //qrcode.setQrcodePath("f:/qrcode/");
        qrcode.setLogoPath("g:/1.jpg");
        qrcode.setFormat("png");
        qrcode.setIsFlag(true);
        qrcode.setQrcodeErrorCorrect('M');
        qrcode.setWidth(150);
        qrcode.setHeight(150);
        qrcode.setVersion(7);
        qrcode.setQrcodeEncodeModel('B');
//      QrCode.createQRCode(qrcode);
// String content = QrCode.decode("f:/qrcode/20130826174039.png");
        QrCode.createQRCode(qrcode,response.getOutputStream());
    }
}
