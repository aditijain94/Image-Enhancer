package app;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

public class ImageHandler {

    public static Icon getIcon_from_file_selected_by_JFC() {
        // called from ClientGUI openMenu & set label's icon attribute.

        JFileChooser jfc = new JFileChooser();

        FileFilter filter = new ExtensionFileFilter("JPG, JPEG & PNG", new String[]{"JPG", "JPEG", "PNG"});
        jfc.setFileFilter(filter);
        jfc.setAcceptAllFileFilterUsed(false);

        int returnValue = jfc.showOpenDialog(ClientGUI.getInstance());
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = jfc.getSelectedFile();
            Icon icon = getIcon_from_image_file(file);
            return icon;

        }
        return null;
    }

    private static Icon getIcon_from_image_file(File file) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(file);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(ClientGUI.getInstance(), "Error reading image file", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        ImageIcon imageIcon = new ImageIcon(image);
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        Image img = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH); //Images produced will remain a fixed size, 600 * 400
        Icon newIcon = new ImageIcon(img); //Create a new imageicon from an image object.
        return newIcon;
    }

}
