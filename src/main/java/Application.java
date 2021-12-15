import com.pi4j.io.gpio.*;

public class Application {

    private static GpioPinDigitalOutput pin;

    public static void main(String[] args) {

        if (pin == null) {
            GpioController gpio = GpioFactory.getInstance();
            pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "LED", PinState.LOW);
        }
        pin.toggle();
    }
}
