package com.QRCode;

import jp.sourceforge.qrcode.data.QRCodeImage;

import java.awt.image.BufferedImage;

/**
 * Created by CAI on 2018/12/24.
 */
public class MyQRCodeImage implements QRCodeImage {
    private BufferedImage bufferedImage;

    public MyQRCodeImage(BufferedImage bufferedImage){
        this.bufferedImage = bufferedImage;
    }

    @Override
    public int getHeight() {
        // TODO Auto-generated method stub
        return bufferedImage.getHeight();
    }

    @Override
    public int getPixel(int arg0, int arg1) {
        // TODO Auto-generated method stub
        return bufferedImage.getRGB(arg0, arg1);
    }

    @Override
    public int getWidth() {
        // TODO Auto-generated method stub
        return bufferedImage.getWidth();
    }
}
