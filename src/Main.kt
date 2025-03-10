/**
 * ===============================================================
 * Kotlin GUI Basic Starter
 * ===============================================================
 *
 * This is a starter project for a simple Kotlin GUI application.
 * The Java Swing library is used, plus the FlatLAF look-and-feel
 * for a reasonably modern look.
 */

import com.formdev.flatlaf.FlatDarkLaf
import java.awt.*
import java.awt.event.*
import javax.swing.*


/**
 * Launch the application
 */
fun main() {
    FlatDarkLaf.setup()     // Flat, dark look-and-feel
    MainWindow()            // Create and show the UI
}


/**
 * Main UI window (view)
 * Defines the UI and responds to events
 * The app model should be passwd as an argument
 */
class MainWindow : JFrame(), ActionListener {

    // Fields to hold the UI elements
    private lateinit var hexCodeLabel: JLabel
    private lateinit var redUpButton: JButton
    private lateinit var redDownButton: JButton
    private lateinit var greenUpButton: JButton
    private lateinit var greenDownButton: JButton
    private lateinit var blueUpButton: JButton
    private lateinit var blueDownButton: JButton
    private lateinit var redLabel: JTextField
    private lateinit var greenLabel: JTextField
    private lateinit var blueLabel: JTextField

    /**
     * Configure the UI and display it
     */
    init {
        configureWindow()               // Configure the window
        addControls()                   // Build the UI

        setLocationRelativeTo(null)     // Centre the window
        isVisible = true                // Make it visible
    }

    /**
     * Configure the main window
     */
    private fun configureWindow() {
        title = "Kotlin Swing GUI Demo"
        contentPane.preferredSize = Dimension(500, 350)
        defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
        isResizable = false
        layout = null

        pack()
    }

    /**
     * Populate the UI with UI controls
     */
    private fun addControls() {
        val defaultFont = Font(Font.SANS_SERIF, Font.ITALIC, 36)



        hexCodeLabel = JLabel("Hello, World!")
        hexCodeLabel.horizontalAlignment = SwingConstants.CENTER
        hexCodeLabel.bounds = Rectangle(120, 30, 260, 40)
        hexCodeLabel.font = defaultFont
        add(hexCodeLabel)

        redUpButton = JButton("+")
        redUpButton.bounds = Rectangle(20,230,30,30)
        redUpButton.foreground = Color.BLACK
        redUpButton.background = Color.RED
        redUpButton.font = defaultFont
        redUpButton.addActionListener(this) // Handle any clicks

        add(redUpButton)

        redDownButton = JButton("-")
        redDownButton.bounds = Rectangle(20,290,30,30)
        redDownButton.foreground = Color.BLACK
        redDownButton.background = Color.RED
        redDownButton.font = defaultFont
        redDownButton.addActionListener(this)     // Handle any clicks

        add(redDownButton)

        greenUpButton = JButton("+")
        greenUpButton.bounds = Rectangle(180,230,30,30)
        greenUpButton.foreground = Color.BLACK
        greenUpButton.background = Color.GREEN
        greenUpButton.font = defaultFont
        greenUpButton.addActionListener(this)     // Handle any clicks

        add(greenUpButton)

        greenDownButton = JButton("-")
        greenDownButton.bounds = Rectangle(180,290,30,30)
        greenDownButton.foreground = Color.BLACK
        greenDownButton.background = Color.GREEN
        greenDownButton.font = defaultFont
        greenDownButton.addActionListener(this)     // Handle any clicks

        add(greenDownButton)

        blueUpButton = JButton("+")
        blueUpButton.bounds = Rectangle(350,230,30,30)
        blueUpButton.foreground = Color.BLACK
        blueUpButton.background = Color.BLUE
        blueUpButton.font = defaultFont
        blueUpButton.addActionListener(this)     // Handle any clicks

        add(blueUpButton)

        blueDownButton = JButton("-")
        blueDownButton.bounds = Rectangle(350,290,30,30)
        blueDownButton.foreground = Color.BLACK
        blueDownButton.background = Color.BLUE
        blueDownButton.font = defaultFont
        blueDownButton.addActionListener(this)     // Handle any clicks

        add(blueDownButton)

        redLabel = JTextField("")
        redLabel.horizontalAlignment = SwingConstants.CENTER
        redLabel.bounds = Rectangle(80, 230, 70, 90)
        redLabel.font = defaultFont
        add(redLabel)
    }


    /**
     * Handle any UI events (e.g. button clicks)
     */
    override fun actionPerformed(e: ActionEvent?) {
        when (e?.source) {
            redUpButton -> {
                hexCodeLabel.text = "You clicked the button!"
            }
        }
    }

}

