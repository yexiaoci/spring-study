package com.spring.image;
import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

import java.awt.*;

public class aaa {
    public static void main(String[] args) {
        QrConfig config = new QrConfig(300, 300);
// 设置边距，既二维码和背景之间的边距
        Color foreColor = new Color(207, 146, 167);
        Color bgColor = new Color(178, 239, 244);
        int foreColorsRGB = foreColor.getRGB();
        int bgColorRGB = bgColor.getRGB();
        config.setForeColor(foreColorsRGB);
        config.setBackColor(bgColorRGB);
        // 生成指定url对应的二维码到文件，宽和高都是300像素
        config.setImg("E:/01.jpeg"); //附带logo
        QrCodeUtil.generate("https://www.jianshu.com/u/1990b14f5f94",
                config,
                FileUtil.file("D:/code.jpg")//写出到的文件
        );

    }

}