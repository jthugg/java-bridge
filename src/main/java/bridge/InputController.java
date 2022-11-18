package bridge;

public class InputController {
	InputView inputView = new InputView();
	OutputView outputView = new OutputView();

	public int requestBridgeSize() {
		outputView.printRequestBridgeSize();
		return inputView.readBridgeSize();
	}
}
