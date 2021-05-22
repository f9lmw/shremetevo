package com.f9;
import javax.swing.ImageIcon;


@Override
protected  void paintComponent(Graphics g) {
        super.paintComponent(g);
        BufferedImage image = ImageIO.read(new File("C:\\Users\\%username\\sheremetevo\\saus\\SVO20200617_RW1-2.jpg"));
        g.drawImage(image, 0, 0, this);
        };

button.addMouseListener(new MouseAdapter() {
public void mouseClicked(MouseEvent evtent) {

        evtent.getClickCount()
        }
        });