public class SmartphoneAdapter implements PowerOutlet {
    private final SmartphoneCharger smartphoneCharger;

    public SmartphoneAdapter(SmartphoneCharger smartphoneCharger) {
        this.smartphoneCharger = smartphoneCharger;
    }

    @Override
    public void plugIn() {
        smartphoneCharger.chargePhone();
    }
}