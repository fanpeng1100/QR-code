package cn.guoan.qrcode;

import jp.sourceforge.qrcode.data.QRCodeImage;

import java.awt.image.BufferedImage;

/**
 * Created by fan on 2016/9/18.
 */
public class CodeImage implements QRCodeImage{
    private BufferedImage bufferedImage;

    public CodeImage(BufferedImage image){
        this.bufferedImage = image;
    }

    public int getHeight() {
        return bufferedImage.getHeight();
    }

    public int getPixel(int x, int y) {
        return bufferedImage.getRGB(x, y);
    }

    public int getWidth() {
        return bufferedImage.getHeight();
    }
}
