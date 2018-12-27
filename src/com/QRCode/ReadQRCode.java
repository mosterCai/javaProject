package com.QRCode;

import jp.sourceforge.qrcode.QRCodeDecoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Created by CAI on 2018/12/24.
 */
public class ReadQRCode {
    public static void main(String[] args) throws Exception {
        File file = new File("F:/qrcode.png");

        BufferedImage bufferedImage = ImageIO.read(file);

        QRCodeDecoder qrCodeDecoder = new QRCodeDecoder();

        String result = new String(qrCodeDecoder.decode(new MyQRCodeImage(bufferedImage)),"utf-8");

        System.out.println("二维码解析结果：" + result);
    }
}
