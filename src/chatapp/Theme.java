package chatapp;

import java.awt.*;
import javax.swing.*; // For BorderFactory
import javax.swing.border.*; // For Border

public class Theme {
    // Colors
    public static final Color BACKGROUND_COLOR = Color.WHITE;
    public static final Color HEADER_COLOR = new Color(7, 94, 84);
    public static final Color TEXT_COLOR = Color.WHITE;
    public static final Color MESSAGE_COLOR = new Color(37, 211, 102);

    // Fonts
    public static final Font HEADER_FONT = new Font("SAN_SERIF", Font.BOLD, 18);
    public static final Font STATUS_FONT = new Font("SAN_SERIF", Font.BOLD, 14);
    public static final Font MESSAGE_FONT = new Font("Tahoma", Font.PLAIN, 16);

    // Dimensions
    public static final int HEADER_HEIGHT = 70;
    public static final int MESSAGE_PANEL_WIDTH = 150;

    // Borders
    public static final Border MESSAGE_BORDER = BorderFactory.createEmptyBorder(15, 15, 15, 50);
}
